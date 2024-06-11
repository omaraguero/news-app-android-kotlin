package com.roa.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.roa.newsapp.R

data class Page(
    val title:String,
    val description:String,
    @DrawableRes val image: Int
)


val pages = listOf(
    Page(
        title = "Mario 64 was beaten without using the a button",
        description = "A popular speedrun challenge for Super Mario 64 has been finally beaten after almost 28 years.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Linkin Park Is Back At No. 1 on the Radio",
        description = "Linkin Park returned with their first new release in some time earlier this year, and it was a quick win for the band. ",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Interestellar returns to the cinema after 10 years",
        description = "Any Christopher Nolan film is bound to be two things: long and complicated. Interstellar (2014) is no exception.",
        image = R.drawable.onboarding3
    )
)
