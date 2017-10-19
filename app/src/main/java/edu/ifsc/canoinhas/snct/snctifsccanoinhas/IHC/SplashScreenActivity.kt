package edu.ifsc.canoinhas.snct.snctifsccanoinhas.IHC

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity



import edu.ifsc.canoinhas.snct.snctifsccanoinhas.R

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()//Esconde a ActionBar
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed(/*
             * Exibindo splash com um timer.
             */
        {
            // Esse método será executado sempre que o timer acabar
            // E inicia a activity principal
            val i = Intent(this@SplashScreenActivity, MainActivity::class.java)
            startActivity(i)

            // Fecha esta activity
            finish()
        }, SPLASH_TIME_OUT.toLong())
    }

    companion object {

        private val SPLASH_TIME_OUT = 2000
    }
}
