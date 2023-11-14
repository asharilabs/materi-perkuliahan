package com.example.bottomnavbartrm

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fHome.newInstance] factory method to
 * create an instance of this fragment.
 */
class fHome : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var _view = inflater.inflate(R.layout.fragment_f_home, container, false)

        // definisi komponen UI
        var f_home_tv = _view.findViewById<TextView>(R.id.fr_home_tv)
        var f_home_button = _view.findViewById<Button>(R.id.btn_f_home)
        f_home_button.setOnClickListener {



            // alert dialog
            var _alertdialog = AlertDialog.Builder(requireActivity())
            _alertdialog.setTitle("PPBM-03")
            _alertdialog.setMessage("Auto-Save mode?")
            _alertdialog.setIcon(R.drawable.mu24)

            _alertdialog.setPositiveButton("Gasken", { dialogInterface, i ->
                Toast.makeText(activity, "Tombol gasken diklik", Toast.LENGTH_LONG).show()
                f_home_tv.setText("TelU - PPBM03")
            })
            _alertdialog.setNegativeButton("Cancel", { dialogInterface, i ->
                Toast.makeText(activity, "Tombol Cancel diklik", Toast.LENGTH_LONG).show()
            })
            _alertdialog.setNeutralButton("Gak jadi", { dialogInterface, i ->
                Toast.makeText(activity, "Tombol Gak jadi diklik", Toast.LENGTH_LONG).show()
            })

            _alertdialog.show()
        }

        // Inflate the layout for this fragment
        return _view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment fHome.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fHome().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}