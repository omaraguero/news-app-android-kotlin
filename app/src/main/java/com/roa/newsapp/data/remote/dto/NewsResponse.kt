package com.roa.newsapp.data.remote.dto


import com.roa.newsapp.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)