package com.example.library1

import com.example.library2.Library2Obj

object Library1Obj {
    fun getTAG() = "Library1Obj"
    fun getLibrary2() = Library2Obj.getTAG()
}