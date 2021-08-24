package io.github.regbl.albumlist.data

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class AlbumRepository(private val albumDao: AlbumDao) {

    val allTheAlbumsByTitle: Flow<List<Album>> = albumDao.getAlphabetizedAlbumTitle()
    val allTheAlbumsByArtist: Flow<List<Album>> = albumDao.getAlphabetizedAlbumArtist()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(album: Album) {
        albumDao.insert(album)
    }
}