package io.github.regbl.albumlist

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import io.github.regbl.albumlist.data.Album
import io.github.regbl.albumlist.data.AlbumsListAdapter
import io.github.regbl.albumlist.ui.NewAlbumActivity
import io.github.regbl.albumlist.viewmodels.*
import kotlinx.coroutines.InternalCoroutinesApi

@InternalCoroutinesApi
class MainActivity : AppCompatActivity() {

    private val newAlbumActivityRequestCode = 1
    private val albumViewModel: AlbumViewModel by viewModels {
        AlbumViewModelFactory((application as AlbumListApplication).repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerViewAlbums = findViewById<RecyclerView>(R.id.recyclerview_albums)
        val albumsListAdapter = AlbumsListAdapter()
        recyclerViewAlbums.adapter = albumsListAdapter
        recyclerViewAlbums.layoutManager = LinearLayoutManager(this)

        val addAlbumFab = findViewById<FloatingActionButton>(R.id.fab_add_album)
        addAlbumFab.setOnClickListener {
            val intent = Intent(this@MainActivity, NewAlbumActivity::class.java)
            startActivityForResult(intent, newAlbumActivityRequestCode)
        }

        albumViewModel.allAlbumsByTitle.observe(owner = this) { albums ->
            albums.let { albumsListAdapter.submitList(it) }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == newAlbumActivityRequestCode && resultCode == Activity.RESULT_OK) {
            var albumName: String? = null
            var albumArtist: String? = null
            data?.getStringExtra(NewAlbumActivity.EXTRA_ALBUM_NAME_REPLY)?.let {
                albumName = it
            }
            data?.getStringExtra(NewAlbumActivity.EXTRA_ALBUM_ARTIST_REPLY)?.let {
                albumArtist = it
            }
            val album = Album(0, albumArtist!!, albumName!!)
            albumViewModel.insert(album)
        } else {
            Toast.makeText(
                applicationContext,
                R.string.empty_not_saved,
                Toast.LENGTH_LONG
            ).show()
        }
    }
}