package com.example.library1

import com.example.library2.Library2Obj
import com.example.library3.Library3Obj
import com.example.mylibrary_api.Test

@Test
object Library1Obj {
    fun getTAG() = "Library1Obj"
    fun getLibrary2() = Library2Obj.getTAG()

    fun getLibrary3() = Library3Obj.getTAG()
}