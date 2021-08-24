package io.github.regbl.albumlist.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "album_table")
data class Album(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val artist: String,
    val title: String
)