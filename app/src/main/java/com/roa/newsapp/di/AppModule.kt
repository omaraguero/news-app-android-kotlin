package com.roa.newsapp.di


import android.app.Application
import com.roa.newsapp.data.manager.LocalUserManagerImpl
import com.roa.newsapp.domain.manager.LocalUserManager
import com.roa.newsapp.domain.usecases.app_entry.AppEntryUseCases
import com.roa.newsapp.domain.usecases.app_entry.ReadAppEntry
import com.roa.newsapp.domain.usecases.app_entry.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManger(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(context = application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManger: LocalUserManager
    ): AppEntryUseCases = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManger),
        saveAppEntry = SaveAppEntry(localUserManger)
    )

}