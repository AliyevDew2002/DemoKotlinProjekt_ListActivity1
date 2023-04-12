package com.example.demokotlinprojekt_listactivity1.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.demokotlinprojekt_listactivity1.R
import com.example.demokotlinprojekt_listactivity1.model.Member

class Member_Adapter(var context:Context,var member:ArrayList<Member>): BaseAdapter() {

   var inflater:LayoutInflater?=null
    init {
        inflater=LayoutInflater.from(context)
    }

    override fun getCount(): Int {
        return member.size
    }

    override fun getItem(position: Int): Any {
        return member.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val convertView=inflater!!.inflate(R.layout.member_qolib,null)
        val profile:ImageView=convertView.findViewById(R.id.iv_profile)
        val fullname:TextView=convertView.findViewById(R.id.tv_fullname)

        var member:Member=member.get(position)

        profile.setImageResource(member.getprofile())
        fullname.setText(member.getfullname())

        return convertView
    }
}