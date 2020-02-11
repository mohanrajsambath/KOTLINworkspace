package com.example.myrecipe

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //getting recyclerview from xml
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        //adding a layoutmanager
        //recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        recyclerView.layoutManager =
            GridLayoutManager(applicationContext, 2)

        //crating an arraylist to store users using the data class user
        val users = ArrayList<Reciepe>()

        //adding some dummy data to the list
        users.add(
            Reciepe(
                "Neapolitan Pizza",
                "https://cdnimg.webstaurantstore.com/uploads/buying_guide/2014/11/pizzatypes-margherita-.jpg"
            )
        )
        users.add(Reciepe("Chicago Pizza", "http://img.recipepuppy.com/694321.jpg"))
        users.add(Reciepe("New York-Style Pizza", "http://img.recipepuppy.com/707237.jpg"))
        users.add(Reciepe("Sicilian Pizza", "http://img.recipepuppy.com/694321.jpg"))
        users.add(Reciepe("Greek Pizza", "http://img.recipepuppy.com/707237.jpg"))
        users.add(Reciepe("California Pizza", "http://img.recipepuppy.com/694321.jpg"))
        users.add(Reciepe("Detroit Pizza", "http://img.recipepuppy.com/707237.jpg"))
        users.add(Reciepe("St. Louis Pizza", "http://img.recipepuppy.com/694321.jpg"))
        users.add(Reciepe("Types of Pizza Crust", "http://img.recipepuppy.com/707237.jpg"))
        //creating our adapter
        val adapter = CustomAdapter(users)

        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter
    }
}
