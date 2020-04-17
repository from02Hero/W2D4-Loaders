package com.example.w2d4_asynctaskloader

import android.content.Context
import androidx.loader.content.AsyncTaskLoader

class StringListLoader(context: Context, query: String) : AsyncTaskLoader<List<String>>(context) {
    override fun loadInBackground(): List<String>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onStartLoading() {
        super.onStartLoading()
    }

    override fun onStopLoading() {
        super.onStopLoading()
    }
}