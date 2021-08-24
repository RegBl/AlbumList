package io.github.regbl.albumlist.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface AlbumDao {
    @Query("SELECT * FROM album_table ORDER BY title ASC")
    fun getAlphabetizedAlbumTitle(): Flow<List<Album>>

    @Query("SELECT * FROM album_table ORDER BY artist ASC")
    fun getAlphabetizedAlbumArtist(): Flow<List<Album>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(album: Album)

    @Query("DELETE FROM album_table")
    suspend fun deleteAll()
}