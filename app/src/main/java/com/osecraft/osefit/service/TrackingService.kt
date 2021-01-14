package com.osecraft.osefit.service

import android.content.Intent
import androidx.lifecycle.LifecycleService
import com.osecraft.osefit.util.Constants

class TrackingService : LifecycleService() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        intent?.let {
            when(it.action) {
                
            }
        }
        return super.onStartCommand(intent, flags, startId)

    }
}