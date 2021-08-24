package io.github.regbl.albumlist.ui

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import io.github.regbl.albumlist.R

class NewAlbumActivity : AppCompatActivity() {

    private lateinit var editTextAlbumNameView: EditText
    private lateinit var editTextAlbumArtistView: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_album)
        editTextAlbumNameView = findViewById(R.id.edit_text_album_name)
        editTextAlbumArtistView = findViewById(R.id.edit_text_album_artist)

        val saveButton = findViewById<Button>(R.id.button_save)
        saveButton.setOnClickListener {
            val replyIntent = Intent()
            if (TextUtils.isEmpty(editTextAlbumArtistView.text) || TextUtils.isEmpty(editTextAlbumNameView.text)) {
                setResult(Activity.RESULT_CANCELED, replyIntent)
            } else {
                val albumName = editTextAlbumNameView.text.toString()
                val albumArtist = editTextAlbumArtistView.text.toString()
                replyIntent.putExtra(EXTRA_ALBUM_NAME_REPLY, albumName)
                replyIntent.putExtra(EXTRA_ALBUM_ARTIST_REPLY, albumArtist)
                setResult(Activity.RESULT_OK, replyIntent)
            }
            finish()
        }
    }

    companion object {
        const val EXTRA_ALBUM_NAME_REPLY = "io.github.regbl.albumlist.albumlistsql.ALBUM_NAME_REPLY"
        const val EXTRA_ALBUM_ARTIST_REPLY = "io.github.regbl.albumlist.albumlistsql.ALBUM_ARTIST_REPLY"
    }
}