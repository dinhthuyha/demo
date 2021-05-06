package com.example.adapter.kotlin

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.adapter.R
import kotlinx.android.synthetic.main.activity_main.*

class ViewActivity:AppCompatActivity() {
    private  val TAG = "ViewActivity"
    private val photoAdapter = PhotoAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initData()
    }
    private fun initView(){
        recyclerPhotos.adapter= photoAdapter.apply {
            onItemClick={item,position->
                Toast.makeText(TAG,"${item.title}", Toast.LENGTH_SHORT).show()
            }
        }

    }
    private fun initData(){

    }
}