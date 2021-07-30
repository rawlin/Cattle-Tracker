package com.elshaddai.cattletracker.ui.cow_tracking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.viewbinding.ViewBinding
import com.elshaddai.cattletracker.databinding.FragmentCowsBinding
import com.elshaddai.cattletracker.utils.BaseFragment

class CowsFragment : BaseFragment<FragmentCowsBinding>() {

    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FragmentCowsBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}