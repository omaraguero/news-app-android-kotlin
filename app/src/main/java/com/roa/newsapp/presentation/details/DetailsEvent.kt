package com.roa.newsapp.presentation.details


import com.roa.newsapp.domain.model.Article


sealed class DetailsEvent {
    data class UpsertDeleteArticle(val article: Article) : DetailsEvent()

    object RemoveSideEffect : DetailsEvent()

}