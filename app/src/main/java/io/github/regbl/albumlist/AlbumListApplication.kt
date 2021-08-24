package io.github.regbl.albumlist

import android.app.Application
import io.github.regbl.albumlist.data.AlbumRepository
import io.github.regbl.albumlist.data.AlbumRoomDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.SupervisorJob

@InternalCoroutinesApi
class AlbumListApplication : Application() {
    val applicationScope = CoroutineScope(SupervisorJob())

    val database by lazy { AlbumRoomDatabase.getDatabase(this, applicationScope) }
    val repository by lazy { AlbumRepository(database.albumDao()) }
}