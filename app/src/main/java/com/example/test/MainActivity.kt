package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.library1.Library1Obj
import com.example.library2.Library2Obj
import com.example.library3.Library3Obj

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val msg = Library1Obj.getTAG()
        val msg2 = Library1Obj.getLibrary2()
        val msg3 = Library3Obj.getTAG()
    }
}