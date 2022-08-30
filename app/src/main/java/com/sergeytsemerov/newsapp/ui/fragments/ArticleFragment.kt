package com.sergeytsemerov.newsapp.ui.fragments

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.navigation.fragment.navArgs
import com.sergeytsemerov.newsapp.databinding.FragmentArticleBinding
import com.sergeytsemerov.newsapp.ui.MainActivity
import com.sergeytsemerov.newsapp.ui.NewsViewModel
import com.sergeytsemerov.newsapp.util.Constants
import com.sergeytsemerov.newsapp.util.showSnackBar

class ArticleFragment :
    ViewBindingFragment<FragmentArticleBinding>(FragmentArticleBinding::inflate) {

    lateinit var viewModel: NewsViewModel
    val args: ArticleFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel

        val article = args.article
        binding.webView.apply {
            webViewClient = WebViewClient()
            loadUrl(article.url)
        }

        binding.fab.setOnClickListener {
            viewModel.saveArticle(article)
            binding.articleFragment.showSnackBar(Constants.ARTICLE_SAVED)
        }
    }
}