package com.example.w2d4_asynctaskloader

import android.graphics.Bitmap
import android.os.AsyncTask
import java.net.URL

class MyAsyncTask(query: String) : AsyncTask<URL, Int, Bitmap>() {

    override fun onPreExecute() {
        super.onPreExecute()
    }

    override fun doInBackground(vararg params: URL?): Bitmap {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onProgressUpdate(vararg values: Int?) {
        super.onProgressUpdate(*values)
    }

    override fun onPostExecute(result: Bitmap?) {
        super.onPostExecute(result)
    }
}