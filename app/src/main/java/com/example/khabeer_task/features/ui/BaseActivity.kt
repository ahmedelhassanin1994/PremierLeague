package com.example.khabeer_task.features.ui

import android.content.Context
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.khabeer_task.core.LocaleManager

abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        resetTitles()
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(LocaleManager.setLocale(base))
    }

    protected fun resetTitles() {
        try {
            val info = packageManager.getActivityInfo(componentName, PackageManager.GET_META_DATA)
            if (info.labelRes != 0) {
                setTitle(info.labelRes)
            }
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }
    }
}