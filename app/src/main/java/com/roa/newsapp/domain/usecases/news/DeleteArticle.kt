package com.roa.newsapp.domain.usecases.news


import com.roa.newsapp.data.local.NewsDao
import com.roa.newsapp.domain.model.Article
import javax.inject.Inject

class DeleteArticle @Inject constructor(
    private val newsDao: NewsDao
) {

    suspend operator fun invoke(article: Article){
        newsDao.delete(article = article)
    }

}