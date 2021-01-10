package com.osecraft.osefit.ui.setUp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.osecraft.osefit.R
import com.osecraft.osefit.databinding.FragmentSetUpBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SetUpFragment : Fragment() {

    private var _binding: FragmentSetUpBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentSetUpBinding.inflate(inflater, container, false)
        val view = binding.root

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        binding.apply {
            tvContinue.setOnClickListener {
                findNavController().navigate(R.id.action_setUpFragment_to_runFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}