package com.sergio994350.fitnessappshedule.utils

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.sergio994350.fitnessappshedule.R

object FragmentManager {
    fun setFragment(newFragment: Fragment, activity: AppCompatActivity) {
        val transaction = activity.supportFragmentManager.beginTransaction()
        transaction.replace(R.id.placeHolder, newFragment)
        transaction.commit()
    }
}