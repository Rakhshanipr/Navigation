package com.mindorks.framework.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.mindorks.framework.navigation.databinding.FragmentTitleBinding


class TitleFragment : Fragment() {

    lateinit var binding:FragmentTitleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_title,container,false)

        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            TitleFragment().apply {
            }
    }
}