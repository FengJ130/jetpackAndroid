package com.techme.jetpack.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.example.jetpack_android.R
import com.example.jetpack_android.databinding.LayoutFragmentHomeBinding


class HomeFragment : BaseFragment() {

    lateinit var homeBinding: LayoutFragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeBinding = LayoutFragmentHomeBinding.inflate(inflater, container, false)
        return homeBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()
        homeBinding.navigateToCategoryFragment.setOnClickListener{
            //对于fragment在navgation跳转的时候使用的是fragmentTransaction的replace方法。
            navController.navigate(R.id.category_fragment)
        }
    }

}