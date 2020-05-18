package com.acme.userkotlinowo

import ViewModels.LoginViewModels
import android.os.Bundle
import android.os.PersistableBundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.acme.userkotlinowo.databinding.VerifyEmailBinding

class VerifyEmail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.verify_email)

        var binding = DataBindingUtil.setContentView<VerifyEmailBinding>(this,R.layout.verify_email)
        binding.emailModel = LoginViewModels(this,binding)
        val window = this.window
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = ContextCompat.getColor(this,R.color.colorBlue)
       // window.statusBarColor= this.resources.getColor(R.color.colorBlue,null)
    }
}