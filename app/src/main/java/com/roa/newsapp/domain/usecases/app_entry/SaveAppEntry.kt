package com.roa.newsapp.domain.usecases.app_entry

import com.roa.newsapp.domain.manager.LocalUserManager


class SaveAppEntry(
    private val localUserManger: LocalUserManager
) {

    suspend operator fun invoke(){
        localUserManger.saveAppEntry()
    }

}