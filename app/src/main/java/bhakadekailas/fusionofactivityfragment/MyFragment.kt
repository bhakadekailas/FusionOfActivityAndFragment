package bhakadekailas.fusionofactivityfragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MyFragment : Fragment() {

    private val TAG: String? = MyFragment::class.java.simpleName

    override fun onAttach(context: Context) {
        Log.e(TAG, "KAILAS = onAttach: ")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e(TAG, "KAILAS = onCreate: ")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e(TAG, "KAILAS = onCreateView: ")
        return inflater.inflate(R.layout.my_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.e(TAG, "KAILAS = onActivityCreated: ")
        super.onActivityCreated(savedInstanceState)
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

    override fun onDestroyView() {
        Log.e(TAG, "KAILAS = onDestroyView: ")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.e(TAG, "KAILAS = onDestroy: ")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.e(TAG, "KAILAS = onDetach: ")
        super.onDetach()
    }
}