package io.github.regbl.albumlist.viewmodels

import androidx.lifecycle.*
import io.github.regbl.albumlist.data.Album
import io.github.regbl.albumlist.data.AlbumRepository
import kotlinx.coroutines.launch

class AlbumViewModel(private val repository: AlbumRepository) : ViewModel() {

    val allAlbumsByArtist: LiveData<List<Album>> = repository.allTheAlbumsByArtist.asLiveData()
    val allAlbumsByTitle: LiveData<List<Album>> = repository.allTheAlbumsByTitle.asLiveData()

    fun insert(album: Album) = viewModelScope.launch {
        repository.insert(album)
    }
}

class AlbumViewModelFactory(private val repository: AlbumRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AlbumViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return AlbumViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}