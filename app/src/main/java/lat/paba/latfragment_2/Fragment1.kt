package lat.paba.latfragment_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

private const val ARG_COUNTER = "counter"

class Fragment1 : Fragment() {
    private var counter: Int = 99

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            counter = it.getInt(ARG_COUNTER, 99)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_1, container, false)

        val counterTextView = view.findViewById<TextView>(R.id.tv_counter)
        counterTextView.text = counter.toString()

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameter.
         *
         * @param counter The initial counter value.
         * @return A new instance of fragment Fragment1.
         */
        @JvmStatic
        fun newInstance(counter: Int) =
            Fragment1().apply {
                arguments = Bundle().apply {
                    putInt(ARG_COUNTER, counter)
                }
            }
    }
}
