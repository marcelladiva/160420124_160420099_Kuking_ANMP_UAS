package com.example.a160420124_marcelladivaviorent_healthcareumc.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.a160420124_marcelladivaviorent_healthcareumc.R
import com.example.a160420124_marcelladivaviorent_healthcareumc.model.Doctor
import com.example.a160420124_marcelladivaviorent_healthcareumc.model.Drug

class DrugListAdapter(val drugList:ArrayList<Drug>):RecyclerView.Adapter<DrugListAdapter.DrugViewHolder>() {
    class DrugViewHolder(var view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DrugViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.drug_list_item, parent, false)
        return DrugViewHolder(view)
    }

    override fun getItemCount(): Int {
        return drugList.size
    }

    override fun onBindViewHolder(holder: DrugViewHolder, position: Int) {
        val textDrugID = holder.view.findViewById<TextView>(R.id.textDrugID)
        val textDrugName = holder.view.findViewById<TextView>(R.id.textDrugName)
        val btnDrugDetail = holder.view.findViewById<Button>(R.id.btnDrugDetail)

        textDrugID.text = drugList[position].id
        textDrugName.text = drugList[position].name

        btnDrugDetail.setOnClickListener {
            val action = DrugListFragmentDirections.actionDrugDetail(drugList[position].id.toString())
            Navigation.findNavController(it).navigate(action)
        }

        var imageViewDrug = holder.view.findViewById<ImageView>(R.id.imageViewDrug)
        var progressBarDrug = holder.view.findViewById<ProgressBar>(R.id.progressBarDrug)
//        imageViewDrug.loadImage(drugList[position].photoUrl, progressBarDrug)
    }

//    fun updateDrugList(newDrugList: ArrayList<Drug>) {
//        drugList.clear()
//        drugList.addAll(newDrugList)
//        notifyDataSetChanged()
//    }
}