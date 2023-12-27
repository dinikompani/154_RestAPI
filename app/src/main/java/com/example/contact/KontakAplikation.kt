package com.example.contact

import android.app.Application
import com.example.contact.repository.AppContainer
import com.example.contact.repository.KontakContainer

class KontakAplikation : Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = KontakContainer()
    }
}