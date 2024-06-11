package com.roa.newsapp.domain.usecases.news

import com.roa.newsapp.data.local.NewsDao
import com.roa.newsapp.domain.model.Article
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class GetSavedArticles @Inject constructor(
    private val newsDao: NewsDao
) {

    operator fun invoke(): Flow<List<Article>> {
        return newsDao.getArticles()
    }

}