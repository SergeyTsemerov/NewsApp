package com.sergeytsemerov.newsapp.ui

import androidx.lifecycle.ViewModel
import com.sergeytsemerov.newsapp.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}