package com.playground.android.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.playground.android.swoosh.R
import com.playground.android.swoosh.Utillities.EXTRA_LEAGUE
import com.playground.android.swoosh.Utillities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringArrayExtra(EXTRA_LEAGUE)
        val skill = intent.getStringArrayExtra(EXTRA_SKILL)

        searchLeagueTxt.text = "Looking for $league $skill league near you..."
    }
}
