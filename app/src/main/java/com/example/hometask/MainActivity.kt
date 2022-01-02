package com.example.hometask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.message_view.*
import kotlinx.android.synthetic.main.message_view.view.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val submit_btn = findViewById<TextView>(R.id.submit_btn)


        submit_btn.setOnClickListener {


            //Show Massage
            val view = View.inflate(this@MainActivity, R.layout.message_view , null)
            val builder = AlertDialog.Builder(this@MainActivity)
            builder.setView(view)



            val dialog = builder.create()
            dialog.show()
            view.message_txt.setText("Bangladesh")
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
            dialog.setCancelable(false)




            view.txt_btn_done.setOnClickListener {
                dialog.dismiss()
            }




        }

    }
}














