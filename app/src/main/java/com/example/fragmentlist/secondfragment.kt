package com.example.fragmentlist

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tabview.MyGridViewAdapter
import com.example.tabview.MyListAdapter
import kotlinx.android.synthetic.main.fragment_sample.*
import kotlinx.android.synthetic.main.fragment_secondfragment.*

class secondfragment : Fragment() {
    val title = arrayOf(
        "MS Dhoni",
        "Suresh Raina",
        "Moeen Ali",
        "Ravindra Jadeja",
        "Dwayne Bravo",
        "C Hari Nishaanth",
        "Sam Curran",
        "Robin Uthappa",
        "Ruturaj Gaikwad",
        "Ambati Rayudu",
        "Narayan Jagadeesan"
    )
    val imageId = arrayOf(R.drawable.msdhoni,R.drawable.suresh,R.drawable.alic,R.drawable.jadc,
        R.drawable.cbravo,R.drawable.hari,R.drawable.samc,R.drawable.uthappa,R.drawable.rutuc,
        R.drawable.ambati,R.drawable.narayanac)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_secondfragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val grid = MyGridViewAdapter(requireActivity(), title, imageId)
        gridView.adapter = grid

        gridView.setOnItemClickListener { parent, view, position, id ->
            val name = title[position]
            val image = imageId[position]
            val intent = Intent(requireActivity(),MainActivity2::class.java)
            intent.putExtra("title",name)
            intent.putExtra("pic",image)
            startActivity(intent)
        }
    }


}