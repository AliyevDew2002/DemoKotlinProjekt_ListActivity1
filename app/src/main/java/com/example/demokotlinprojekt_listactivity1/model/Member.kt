package com.example.demokotlinprojekt_listactivity1.model

import java.io.Serializable

class Member(private var profile:Int,private var fullname:String): Serializable {


    fun getprofile():Int{
       return profile;
    }

    fun getfullname():String{
        return fullname
    }

}