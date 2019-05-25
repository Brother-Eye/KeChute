package br.com.diegorossedesouza.kechute

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        carregar()
    }

    private fun carregar(){
        val anim = AnimationUtils.loadAnimation(this,R.anim.animacao_splash)

        ivLogo.startAnimation(anim)

        Handler().postDelayed({
            startActivity(Intent(this@SplashActivity,ConfigureActivity::class.java))
            finish()
        },4000)
    }
}
