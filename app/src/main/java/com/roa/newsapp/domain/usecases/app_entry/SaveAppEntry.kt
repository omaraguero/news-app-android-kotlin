package com.roa.newsapp.domain.usecases.app_entry

import com.roa.newsapp.domain.manager.LocalUserManager
import javax.inject.Inject


class SaveAppEntry @Inject constructor(
    private val localUserManger: LocalUserManager
) {

    suspend operator fun invoke(){
        localUserManger.saveAppEntry()
    }

}