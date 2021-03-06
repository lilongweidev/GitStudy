package com.llw.gitstudy

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    private val requestCamera =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) {
            if (it) "权限授予" else "未授予".showToast(this)
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        requestCamera.launch(Manifest.permission.CAMERA)
    }
}