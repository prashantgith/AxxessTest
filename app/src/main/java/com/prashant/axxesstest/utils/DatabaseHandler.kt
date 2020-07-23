package com.prashant.axxesstest.utils

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteException
import android.database.sqlite.SQLiteOpenHelper
import com.prashant.axxesstest.activity.Comment

class DatabaseHandler(context : Context) : SQLiteOpenHelper(context,DATABASE_NAME,null,DATABASE_VERSION)
{

    companion object
    {
        private val DATABASE_VERSION = 1
        private val DATABASE_NAME = "axxess_prashant"
        private val TABLE_COMMENTS = "CommentsTable"
        private val KEY_ID = "Id"
        private val KEY_FOOD_ID = "FoodId"
        private val KEY_COMMENT = "Comment"
    }

    override fun onCreate(db: SQLiteDatabase?)
    {
        //creating table with fields
        val CREATE_COMMENTS_TABLE = ("CREATE TABLE " + TABLE_COMMENTS + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_FOOD_ID + " TEXT,"
                + KEY_COMMENT + " TEXT" + ")")
        db?.execSQL(CREATE_COMMENTS_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int)
    {
        db!!.execSQL("DROP TABLE IF EXISTS " + TABLE_COMMENTS)
        onCreate(db)
    }

    //method to insert data
    fun addComment(cmnt: Comment):Long
    {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(KEY_FOOD_ID, cmnt.foodId)
        contentValues.put(KEY_COMMENT,cmnt.comment)

        // Inserting Row
        val success = db.insert(TABLE_COMMENTS, null, contentValues)

        db.close() // Closing database connection

        return success
    }

    //method to read data
    fun viewComments(foodId: String):List<Comment>
    {
        val commentList:ArrayList<Comment> = ArrayList<Comment>()
        val selectQuery = "SELECT  * FROM " + TABLE_COMMENTS + " WHERE " + KEY_FOOD_ID + " = '" + foodId + "'"
        val db = this.readableDatabase
        var cursor: Cursor? = null
        try{
            cursor = db.rawQuery(selectQuery, null)
        }catch (e: SQLiteException) {
            db.execSQL(selectQuery)
            return ArrayList()
        }
        var foodId: String
        var comment: String

        if (cursor.moveToFirst())
        {
            do
            {
                foodId = cursor.getString(cursor.getColumnIndex(KEY_FOOD_ID))
                comment = cursor.getString(cursor.getColumnIndex(KEY_COMMENT))

                val emp= Comment(foodId, comment)
                commentList.add(emp)

            } while (cursor.moveToNext())
        }

        return commentList
    }
}