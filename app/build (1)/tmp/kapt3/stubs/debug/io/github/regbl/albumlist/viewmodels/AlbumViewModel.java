package io.github.regbl.albumlist.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lio/github/regbl/albumlist/viewmodels/AlbumViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lio/github/regbl/albumlist/data/AlbumRepository;", "(Lio/github/regbl/albumlist/data/AlbumRepository;)V", "allAlbumsByArtist", "Landroidx/lifecycle/LiveData;", "", "Lio/github/regbl/albumlist/data/Album;", "getAllAlbumsByArtist", "()Landroidx/lifecycle/LiveData;", "allAlbumsByTitle", "getAllAlbumsByTitle", "insert", "Lkotlinx/coroutines/Job;", "album", "app_debug"})
public final class AlbumViewModel extends androidx.lifecycle.ViewModel {
    private final io.github.regbl.albumlist.data.AlbumRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<io.github.regbl.albumlist.data.Album>> allAlbumsByArtist = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<io.github.regbl.albumlist.data.Album>> allAlbumsByTitle = null;
    
    public AlbumViewModel(@org.jetbrains.annotations.NotNull()
    io.github.regbl.albumlist.data.AlbumRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<io.github.regbl.albumlist.data.Album>> getAllAlbumsByArtist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<io.github.regbl.albumlist.data.Album>> getAllAlbumsByTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insert(@org.jetbrains.annotations.NotNull()
    io.github.regbl.albumlist.data.Album album) {
        return null;
    }
}