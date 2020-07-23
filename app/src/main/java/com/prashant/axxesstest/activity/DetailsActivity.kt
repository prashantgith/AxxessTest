package com.prashant.axxesstest.activity

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.prashant.axxesstest.R
import com.prashant.axxesstest.adapter.CommentsAdapter
import com.prashant.axxesstest.utils.DatabaseHandler
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_details.*


class DetailsActivity : AppCompatActivity()
{
    var image: String = ""
    var title: String = ""
    var foodId: String = ""

    var list = arrayListOf<Comment>()


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val bundle: Bundle? = intent.extras
        image = bundle?.get("image") as String
        title = bundle?.get("title") as String
        foodId = bundle?.get("food_id") as String

        //initializing data
        initialize()
    }


    private fun initialize()
    {
        edt_comment.clearFocus()
        tv_title.text = title

        //loading image
        Picasso.with(this)
                .load(image)
                .resize(800, 600)
                .onlyScaleDown()
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher_round)
                .into(img_image)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        rv_comments.layoutManager = layoutManager


        fillComments()
        setListeners()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putParcelableArrayList("comments",list)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        list = savedInstanceState.getParcelableArrayList<Comment>("comments") as ArrayList<Comment>
        setDataAdapter()
    }

    fun setListeners()
    {
        img_back.setOnClickListener {
            finish()
        }

        btn_submit.setOnClickListener {

            if (edt_comment.text.isNotEmpty()) {
                val databaseHandler: DatabaseHandler = DatabaseHandler(this)

                // adding image related comments to local db
                val status = databaseHandler.addComment(Comment(foodId,edt_comment.text.toString()))
                if(status > -1){
                    edt_comment?.setText("")
                    edt_comment.clearFocus()

                    val view = this.currentFocus
                    if (view != null) {
                        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                        imm.hideSoftInputFromWindow(view!!.getWindowToken(), 0)
                    }

                    //update commentList
                    fillComments()
                }

            } else {
                Toast.makeText(this, resources.getString(R.string.write_something), Toast.LENGTH_SHORT).show()
            }
        }
    }

    // loading comments from db
    fun fillComments()
    {
        list.clear()

        val databaseHandler: DatabaseHandler= DatabaseHandler(this)

        //retreiving comments list from db
        list = databaseHandler.viewComments(foodId) as ArrayList<Comment>

        setDataAdapter()
    }

    fun setDataAdapter()
    {
        if(list.size > 0)
        {
            ll_nodetails.visibility = View.GONE
            rv_comments.visibility = View.VISIBLE

            val adapter = CommentsAdapter(this, list)
            rv_comments.adapter = adapter
        }
        else
        {
            ll_nodetails.visibility = View.VISIBLE
            rv_comments.visibility = View.GONE
        }
    }
}