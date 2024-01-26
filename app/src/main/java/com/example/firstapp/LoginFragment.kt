package com.example.firstapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class LoginFragment : Fragment() {

//    override fun onAttach(context: Context) {
//        super.onAttach(context)
//        Log.d("TAG", "onAttach: I an Running")
//        Toast.makeText(requireContext(), "onAttach: Attach Called", Toast.LENGTH_SHORT).show()
//    }
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        Log.d("TAG", "onCreate: I an Running")
//        Toast.makeText(requireContext(), "onAttach: Create Called", Toast.LENGTH_SHORT).show()
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//         // Inflate the layout for this fragment
//        Log.d("TAG", "onCreateView: I am Running")
//        Toast.makeText(requireContext(), "onCreateView: CreateView Called", Toast.LENGTH_SHORT).show()

        return inflater.inflate(R.layout.fragment_login, container, false)
    }

//    override fun onStart() {
//        super.onStart()
//        Log.d("TAG", "onStart: I an Running")
//        Toast.makeText(requireContext(), "onStart: Start Called", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.d("TAG", "onResume: I an Running")
//        Toast.makeText(requireContext(), "onResume: Resume Called", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.d("TAG", "onPause: I an Running")
//        Toast.makeText(requireContext(), "onPause: Pause Called", Toast.LENGTH_SHORT).show()
//    }

//    override fun onStop() {
//        super.onStop()
//        Log.d("TAG", "onStop: I an Running")
//        Toast.makeText(requireContext(), "onAStop: Stop Called", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        Log.d("TAG", "onDestroyView: I an Running")
//        Toast.makeText(requireContext(), "onDestroyView: DestroyView Called", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.d("TAG", "onDestroy: I an Running")
//        Toast.makeText(requireContext(), "onDestroy: Destroy Called", Toast.LENGTH_SHORT).show()
//    }

//    override fun onDetach() {
//        super.onDetach()
//        Log.d("TAG", "onDetach: I an Running")
//        Toast.makeText(requireContext(), "onDetach: Detach Called", Toast.LENGTH_SHORT).show()
//    }
//

}