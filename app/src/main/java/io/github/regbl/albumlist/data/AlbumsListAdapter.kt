package io.github.regbl.albumlist.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import io.github.regbl.albumlist.R
import io.github.regbl.albumlist.data.AlbumsListAdapter.AlbumViewHolder

class AlbumsListAdapter : ListAdapter<Album, AlbumViewHolder>(AlbumDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        return AlbumViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val album = getItem(position)
        holder.bind(album)
    }

    class AlbumViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textViewAlbumTitle: TextView = itemView.findViewById(R.id.textview_album_title)
        private val textViewAlbumArtist: TextView = itemView.findViewById(R.id.textview_album_artist)

        fun bind(album: Album) {
            textViewAlbumTitle.text = album.title
            textViewAlbumArtist.text = album.artist
        }

        companion object {
            fun create(parent: ViewGroup): AlbumViewHolder {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.album_item, parent, false)
                return AlbumViewHolder(view)
            }
        }
    }

    class AlbumDiffCallback : DiffUtil.ItemCallback<Album>() {
        override fun areItemsTheSame(oldItem: Album, newItem: Album): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Album, newItem: Album): Boolean {
            return oldItem.id == newItem.id
        }
    }
}

