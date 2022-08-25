package com.sergeytsemerov.newsapp.ui.fragments

import android.os.Bundle
import android.view.View
import com.sergeytsemerov.newsapp.databinding.FragmentSavedNewsBinding
import com.sergeytsemerov.newsapp.ui.MainActivity
import com.sergeytsemerov.newsapp.ui.NewsViewModel

class SavedNewsFragment :
    ViewBindingFragment<FragmentSavedNewsBinding>(FragmentSavedNewsBinding::inflate) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
    }
}