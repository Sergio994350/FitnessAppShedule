package com.sergio994350.fitnessappshedule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sergio994350.fitnessappshedule.fragments.DaysFragment
import com.sergio994350.fitnessappshedule.utils.FragmentManager
// l8_ft
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FragmentManager.setFragment(DaysFragment.newInstance(), this)
    }
}