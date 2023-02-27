package com.example.marcrosnaptasks;

import android.app.SearchManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.provider.AlarmClock
import android.provider.MediaStore
import android.util.Log
import androidx.core.content.ContextCompat.startActivity


public class Tasks(val context: Context) {

     public fun timer (msg: String, secs: Int) {
         val intent = Intent(AlarmClock.ACTION_SET_TIMER).apply {
             putExtra(AlarmClock.EXTRA_MESSAGE, msg)
             putExtra(AlarmClock.EXTRA_LENGTH, secs)
             putExtra(AlarmClock.EXTRA_SKIP_UI, true)
         }
         if (intent.resolveActivity(context.packageManager) != null) {
             context.startActivity(intent)
         }
         Log.i("PRINT", "timer")
    }

    public fun alarm (msg: String, hour: Int, min: Int) {
        val intent = Intent(AlarmClock.ACTION_SET_ALARM).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, msg)
            putExtra(AlarmClock.EXTRA_HOUR, hour)
            putExtra(AlarmClock.EXTRA_MINUTES, min)
        }
        if (intent.resolveActivity(context.packageManager) != null) {
            context.startActivity(intent)
        }
        context.startActivity(intent)
        Log.i("PRINT", "alarm")
    }

    public fun spotify (url: Uri) {
//        val intent = Intent(Intent.ACTION_VIEW).apply {
//            data = geoLocation
//        }
//        if (intent.resolveActivity(context.packageManager) != null) {
//            context.startActivity(intent)
//        }

        val intent = Intent(Intent.ACTION_VIEW, url)
        if (intent.resolveActivity(context.packageManager) != null) {
            context.startActivity(intent)
        }

//        val uri = "spotify:track:<spotify uri>"
//        val launcher = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
//        context.startActivity(launcher)
//
//
//        val intent = Intent(Intent.ACTION_MAIN)
//        intent.action = MediaStore.INTENT_ACTION_MEDIA_PLAY_FROM_SEARCH
//        intent.component = ComponentName(
//            "com.spotify.mobile.android.ui",
//            "com.spotify.mobile.android.ui.activity.MainActivity"
//        )
//        intent.putExtra(SearchManager.QUERY, artistName + " " + trackName)
//        context.startActivity(intent)

        Log.i("PRINT", "fake spotify")
    }

}
