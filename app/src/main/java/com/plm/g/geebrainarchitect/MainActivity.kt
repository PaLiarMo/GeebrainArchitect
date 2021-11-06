package com.plm.g.geebrainarchitect

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.plm.g.geebrainarchitect.R.layout.activity_main


class MainActivity : AppCompatActivity(activity_main), MainView {

    private val presenter = MainPresenter(this)

    private val btn_counter1: Button by lazy { findViewById(R.id.btn_counter1) }
    private val btn_counter2: Button by lazy { findViewById(R.id.btn_counter2) }
    private val btn_counter3: Button by lazy { findViewById(R.id.btn_counter3) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val listener = View.OnClickListener {
            presenter.counterClick(it.id)
        }

        btn_counter1.setOnClickListener(listener)
        btn_counter2.setOnClickListener(listener)
        btn_counter3.setOnClickListener(listener)
    }

    override fun setCounter1Text(text: String) {
        btn_counter1.text = text
    }

    override fun setCounter2Text(text: String) {
        btn_counter2.text = text
    }

    override fun setCounter3Text(text: String) {
        btn_counter3.text = text
    }

}
