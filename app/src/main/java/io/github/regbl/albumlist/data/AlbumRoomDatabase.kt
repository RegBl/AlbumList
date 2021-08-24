package io.github.regbl.albumlist.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized
import kotlinx.coroutines.launch

@Database(entities = [Album::class], version = 1)
abstract class AlbumRoomDatabase : RoomDatabase() {

    abstract fun albumDao(): AlbumDao

    companion object {
        @Volatile
        private var INSTANCE: AlbumRoomDatabase? = null

        @InternalCoroutinesApi
        fun getDatabase(
            context: Context,
            scope: CoroutineScope
        ): AlbumRoomDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AlbumRoomDatabase::class.java,
                    "album_database"
                )
                    .fallbackToDestructiveMigration()
                    .addCallback(AlbumDatabaseCallback(scope))
                    .build()
                INSTANCE = instance
                instance
            }
        }

        private class AlbumDatabaseCallback(
            private val scope: CoroutineScope
        ) : RoomDatabase.Callback() {

            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)
                INSTANCE?.let { database ->
                    scope.launch(Dispatchers.IO) {
                        populateDatabase(database.albumDao())
                    }
                }
            }
        }

        suspend fun populateDatabase(albumDao: AlbumDao) {
            albumDao.deleteAll()

            var album = Album(0, "Bob Dylan", "New Morning")
            albumDao.insert(album)
            album = Album(0, "Joanna Newsom", "The Milk-Eyed Mender")
            albumDao.insert(album)
            album = Album(0, "Lake Street Dive", "Obviously")
            albumDao.insert(album)
            album = Album(0, "Rise Against", "Nowhere Generation")
            albumDao.insert(album)
            album = Album(0, "Fleming and John", "The Way We Are")
            albumDao.insert(album)
            album = Album(0, "Tedeschi Trucks Band", "Signs")
            albumDao.insert(album)
        }
    }
}