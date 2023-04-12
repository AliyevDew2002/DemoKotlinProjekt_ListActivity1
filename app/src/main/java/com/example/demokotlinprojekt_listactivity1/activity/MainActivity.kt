package com.example.demokotlinprojekt_listactivity1.activity

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.demokotlinprojekt_listactivity1.R
import com.example.demokotlinprojekt_listactivity1.adapter.Member_Adapter
import com.example.demokotlinprojekt_listactivity1.model.Member

class MainActivity : AppCompatActivity() {
    lateinit var listView: ListView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews(){
        listView=findViewById<ListView>(R.id.listView)

        var member:ArrayList<Member> = ArrayList<Member>()

        for (i in 0..30) {
            member.add(Member(R.mipmap.ic_launcher, "Shaxzod Aliyev:$i"))
        }

        refreshAdapter(member)
    }
    fun refreshAdapter(members:ArrayList<Member>) {
        val member_adapter = Member_Adapter(this, members)
        listView.adapter = member_adapter
    }
}