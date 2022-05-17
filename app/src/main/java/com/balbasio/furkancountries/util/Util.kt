package com.balbasio.furkancountries.util

import android.content.Context
import android.widget.ImageView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.balbasio.furkancountries.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

fun ImageView.downloadFromUrl(url:String,progressDrawable:CircularProgressDrawable){
    val options=RequestOptions().placeholder(placeHolderProgressBar(progressDrawable)).error(R.drawable.ic_launcher_background)
    Glide.with(context)
        .setDefaultRequestOptions(options)
        .load(url)
        .into(this)

}

fun placeHolderProgressBar(context: CircularProgressDrawable): CircularProgressDrawable {
    return CircularProgressDrawable(context).apply{
        strokeWidth=8f
        centerRadius=40f
        start()
    }
}



