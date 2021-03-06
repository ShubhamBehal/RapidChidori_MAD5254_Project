package com.example.rapidchidori_mad5254_project.ui.viewholders

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rapidchidori_mad5254_project.data.models.response.UploadInfo
import com.example.rapidchidori_mad5254_project.databinding.UploadsChildViewBinding
import com.example.rapidchidori_mad5254_project.helper.AppUtils.Companion.getImageBasedOnFileType
import com.example.rapidchidori_mad5254_project.ui.interfaces.UploadsClickListener

class UploadsListViewHolder(private val binding: UploadsChildViewBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(data: UploadInfo, listener: UploadsClickListener, isOwner: Boolean) {
        binding.tvFileName.text = data.title
        binding.ivFileType.setImageResource(getImageBasedOnFileType(data.fileType))
        if (isOwner) {
            binding.ivDelete.visibility = View.VISIBLE
            binding.ivDelete.setOnClickListener {
                listener.removeItem(data.fileId)
            }
        } else {
            binding.ivDelete.visibility = View.GONE
        }
        binding.ivFileType.setOnClickListener {
            listener.onItemClick(data)
        }
    }

    companion object {
        fun create(parent: ViewGroup): UploadsListViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding =
                UploadsChildViewBinding.inflate(
                    layoutInflater,
                    parent,
                    false
                )
            return UploadsListViewHolder(binding)
        }
    }
}