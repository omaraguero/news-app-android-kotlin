package com.roa.newsapp.presentation.bookmark


import com.roa.newsapp.domain.model.Article

data class BookmarkState(
    val articles: List<Article> = emptyList()
)