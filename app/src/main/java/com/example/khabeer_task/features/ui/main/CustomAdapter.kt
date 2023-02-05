package com.example.khabeer_task.features.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.khabeer_task.R
import com.example.khabeer_task.features.domain.entities.Matches_Entities

class CustomAdapter(private val mList: ArrayList<Matches_Entities>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    private  val TAG = "CustomAdapter"
    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.model_emp, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

       val ItemsViewModel = mList[position]
        holder.status.text=ItemsViewModel.status
        holder.homeTeam.text=ItemsViewModel.homeTeam!!.name
        holder.awayTeam.text=ItemsViewModel.awayTeam!!.name
        holder.homeTeam_score.text= ItemsViewModel.score!!.fullTime!!.homeTeam.toString()
        holder.awayTeam_scorc.text= ItemsViewModel.score!!.fullTime!!.awayTeam.toString()
        holder.week.text="Week ${ItemsViewModel.matchday.toString()}"
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
       val status: TextView = itemView.findViewById(R.id.status)
        val homeTeam: TextView = itemView.findViewById(R.id.homeTeam)
        val awayTeam: TextView = itemView.findViewById(R.id.awayTeam)
        val homeTeam_score: TextView = itemView.findViewById(R.id.homeTeam_score)
        val awayTeam_scorc: TextView = itemView.findViewById(R.id.awayTeam_scorc)
        val week: TextView = itemView.findViewById(R.id.week)








    }
}