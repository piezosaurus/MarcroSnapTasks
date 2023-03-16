package com.example.marcrosnaptasks;

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.provider.AlarmClock
import android.util.Log
import androidx.core.content.ContextCompat.startActivity
import java.util.*


public class Tasks(val activity: Activity, val context: Context) {

     public fun timer (msg: String, secs: Int) {
         val intent = Intent(AlarmClock.ACTION_SET_TIMER).apply {
             putExtra(AlarmClock.EXTRA_MESSAGE, msg)
             putExtra(AlarmClock.EXTRA_LENGTH, secs)
             putExtra(AlarmClock.EXTRA_SKIP_UI, false)
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
    public fun website (url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        if (intent.resolveActivity(context.packageManager) != null) {
            context.startActivity(intent)
        }
        Log.i("PRINT", "website")
    }

    fun dialPhoneNumber(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_CALL)
        intent.data = Uri.parse("tel:$phoneNumber")
//        val intent = Intent(Intent.ACTION_CALL).apply {
//            data = Uri.parse("tel:$phoneNumber")
//        }
        if (intent.resolveActivity(context.packageManager) != null) {
            context.startActivity(intent)
        }
    }

    public fun spotify () {


//        val intent = Intent(Intent.ACTION_VIEW).apply {
//            data = geoLocation
//        }
//        if (intent.resolveActivity(context.packageManager) != null) {
//            context.startActivity(intent)
//        }

//        val intent = Intent(Intent.ACTION_VIEW, url)
//        if (intent.resolveActivity(context.packageManager) != null) {
//            context.startActivity(intent)
//        }

//        val uri = "spotify:track:<spotify uri>"
//        val launcher = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
//        context.startActivity(launcher)

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

//    fun capturePhoto() {
//        val storageDir = activity.getExternalFilesDir(Environment.DIRECTORY_PICTURES)
//        val image = File.createTempFile(
//                "photo",  /* prefix */
//                ".jpg",         /* suffix */
//                storageDir      /* directory */
//        )
//        val photoURI = FileProvider.getUriForFile(
//            Objects.requireNonNull(context),
//            BuildConfig.APPLICATION_ID + ".provider", image);
//
////        val photoURI = FileProvider.getUriForFile(
////            context,
////            "com.example.android.fileprovider",
////            image
////        )
//        val intent = Intent(MediaStore.ACTION)
//        intent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI)
//
//        startActivityForResult(activity, intent, 1, null)
//        Log.i("PRINT", "photo")
//    }
}
