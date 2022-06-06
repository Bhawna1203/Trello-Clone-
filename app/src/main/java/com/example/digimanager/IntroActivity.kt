package com.example.digimanager

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_intro.*

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )


       // Handler().postDelayed({
      //      startActivity(Intent(this,MainActivity::class.java))
      //      finish()
      //  },2500)

        btn_sign_up_intro.setOnClickListener {
            startActivity(Intent(this@IntroActivity, SignUpScreen::class.java))
        }
    }
}