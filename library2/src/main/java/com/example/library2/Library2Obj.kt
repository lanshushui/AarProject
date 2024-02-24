package com.example.library2

import com.example.library3.Library3Obj


object Library2Obj {
    fun getTAG() = "Library2Obj"

    fun getLibrary3TAG() = Library3Obj.getTAG()
}