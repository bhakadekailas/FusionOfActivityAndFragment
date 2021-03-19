package bhakadekailas.fusionofactivityfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e(TAG, "KAILAS = onCreate: ")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        Log.e(TAG, "KAILAS = onStart: ")
        super.onStart()
    }

    override fun onResume() {
        Log.e(TAG, "KAILAS = onResume: ")
        super.onResume()
    }

    override fun onPause() {
        Log.e(TAG, "KAILAS = onPause: ")
        super.onPause()
    }

    override fun onStop() {
        Log.e(TAG, "KAILAS = onStop: ")
        super.onStop()
    }

    override fun onRestart() {
        Log.e(TAG, "KAILAS = onRestart: ")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.e(TAG, "KAILAS = onDestroy: ")
        super.onDestroy()
    }
}