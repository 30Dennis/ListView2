package com.example.listview3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter (var mctx:Context, var resources:Int, var items:List<Model>):ArrayAdapter<Model>(mctx,resources,items){


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater:LayoutInflater=LayoutInflater.from(mctx)
        val view:View=layoutInflater.inflate(resources,null)

        val imageView:ImageView=view.findViewById(R.id.image)
        val title:TextView=view.findViewById(R.id.Tv_title)
        val description:TextView=view.findViewById(R.id.Tv_Sub)


        var items:Model=items[position]

        imageView.setImageDrawable(mctx.resources.getDrawable(items.img))
        title.text=items.title
        description.text=items.Description

        return view


    }


}