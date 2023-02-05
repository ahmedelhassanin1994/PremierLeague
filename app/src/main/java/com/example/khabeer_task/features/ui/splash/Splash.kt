package com.example.khabeer_task.features.ui.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.khabeer_task.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Splash : Fragment(){

    lateinit var splashTread: Thread



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        StartAnimations()


        return inflater.inflate(R.layout.fragment_splash, container, false);

    }


    private fun StartAnimations() {
        Handler(Looper.getMainLooper()).postDelayed({
            findNavController().navigate(
                SplashDirections
                    .actionSplashFragmentToLoginFragment())
        }, 2000) // 3000 is the delayed time in milliseconds




    }

}