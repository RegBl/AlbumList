package io.github.regbl.albumlist.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lio/github/regbl/albumlist/data/AlbumRepository;", "", "albumDao", "Lio/github/regbl/albumlist/data/AlbumDao;", "(Lio/github/regbl/albumlist/data/AlbumDao;)V", "allTheAlbumsByArtist", "Lkotlinx/coroutines/flow/Flow;", "", "Lio/github/regbl/albumlist/data/Album;", "getAllTheAlbumsByArtist", "()Lkotlinx/coroutines/flow/Flow;", "allTheAlbumsByTitle", "getAllTheAlbumsByTitle", "insert", "", "album", "(Lio/github/regbl/albumlist/data/Album;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AlbumRepository {
    private final io.github.regbl.albumlist.data.AlbumDao albumDao = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<io.github.regbl.albumlist.data.Album>> allTheAlbumsByTitle = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<io.github.regbl.albumlist.data.Album>> allTheAlbumsByArtist = null;
    
    public AlbumRepository(@org.jetbrains.annotations.NotNull()
    io.github.regbl.albumlist.data.AlbumDao albumDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<io.github.regbl.albumlist.data.Album>> getAllTheAlbumsByTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<io.github.regbl.albumlist.data.Album>> getAllTheAlbumsByArtist() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    io.github.regbl.albumlist.data.Album album, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}