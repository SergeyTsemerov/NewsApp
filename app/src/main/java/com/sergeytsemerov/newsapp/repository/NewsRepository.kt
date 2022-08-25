package com.sergeytsemerov.newsapp.repository

import com.sergeytsemerov.newsapp.api.RetrofitInstance
import com.sergeytsemerov.newsapp.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}