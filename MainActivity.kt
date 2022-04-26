package com.example.recyclerviewevi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var layoutManager:RecyclerView.LayoutManager?=null
    private var adapter:RecyclerView.Adapter<MotivasiAdapter.ViewHolder>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set layout menjadi lenear layout
        layoutManager = LinearLayoutManager(this)

        //instance Recyclerview
        var recyclerView:RecyclerView = findViewById(R.id.recyclerView)

        //set layout untuk recyclerview
        recyclerView.layoutManager = layoutManager

        //panggil class adapter dan set recyclerview sesuai dengan adapter yang telah dibuat
        adapter = MotivasiAdapter()
        recyclerView.adapter = adapter
    }
}