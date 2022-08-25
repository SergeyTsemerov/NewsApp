package com.sergeytsemerov.newsapp.ui.fragments

import android.os.Bundle
import android.view.View
import com.sergeytsemerov.newsapp.databinding.FragmentBreakingNewsBinding
import com.sergeytsemerov.newsapp.ui.MainActivity
import com.sergeytsemerov.newsapp.ui.NewsViewModel

class BreakingNewsFragment :
    ViewBindingFragment<FragmentBreakingNewsBinding>(FragmentBreakingNewsBinding::inflate) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
    }
}