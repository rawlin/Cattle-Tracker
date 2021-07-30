package com.elshaddai.cattletracker.ui.add_cow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.elshaddai.cattletracker.databinding.FragmentEnterCowDetailsBinding
import com.elshaddai.cattletracker.utils.BaseFragment


class EnterCowDetailsFragment : BaseFragment<FragmentEnterCowDetailsBinding>() {

    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FragmentEnterCowDetailsBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}