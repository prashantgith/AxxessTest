package com.prashant.axxesstest.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prashant.axxesstest.R
import com.prashant.axxesstest.activity.Comment
import kotlinx.android.synthetic.main.item_comment.view.*

class CommentsAdapter(val context: Context, val comments: List<Comment>) : RecyclerView.Adapter<CommentsAdapter.MyViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_comment,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return comments.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val comment = comments[position]
        holder?.setData(comment,position)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {

        fun setData(comment: Comment, pos: Int)
        {
            comment?.let {
                itemView.tv_comment.text = comment.comment
            }
        }
    }
}