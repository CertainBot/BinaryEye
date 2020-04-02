package de.markusfisch.android.binaryeye.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview

@FlowPreview
@ExperimentalCoroutinesApi
class SplashActivity : AppCompatActivity() {
	override fun onCreate(state: Bundle?) {
		super.onCreate(state)

		// it's important _not_ to inflate a layout file here
		// because that would happen after the app is fully
		// initialized what is too late

		startActivity(Intent(applicationContext, CameraActivity::class.java))
		finish()
	}
}
