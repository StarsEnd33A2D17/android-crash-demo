package dev.starsend.demo.crashdemo

import android.app.Application
import android.content.Context
import xcrash.XCrash

class MainApplication : Application() {
    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        
        val logDir = getExternalFilesDir("xcrash")?.absolutePath
        XCrash.init(this, XCrash.InitParameters().setLogDir(logDir))
    }
}
