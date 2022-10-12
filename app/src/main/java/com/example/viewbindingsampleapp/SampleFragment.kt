package com.example.viewbindingsampleapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.viewbindingsampleapp.databinding.FragmentSampleBinding

class SampleFragment : Fragment(R.layout.fragment_sample) {

    private var binding: FragmentSampleBinding ? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSampleBinding.bind(view)
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}
