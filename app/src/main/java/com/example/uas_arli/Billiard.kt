package com.example.uas_arli

import com.google.firebase.database.Exclude

data class fenomena_alam(
    var name:String? = null,
    var imageUrl:String? = null,
    var description:String? = null,
    @get:Exclude
    @set:Exclude
    var key:String? = null
)