package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.library1.Library1Obj

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val msg = Library1Obj.getTAG()
        val msg2 = Library1Obj.getLibrary2()
    }
}