package com.example.parthibans.cam;

/**
 * Created by Parthibans on 2/6/2015.
 */
import java.io.File;
import android.os.Environment;

public final class From extends Album {

    @Override
    public File getAlbum(String albumName) {
        return new File(
                Environment.getExternalStoragePublicDirectory(
                        Environment.DIRECTORY_PICTURES
        ),albumName
        );
    }
}
