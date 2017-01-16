package com.example.antimatter.photogallery;


import android.os.Bundle;
import android.support.v4.app.Fragment;

public class PhotoGalleryActivity extends SingleFragmentActivity{

    protected Fragment createFragment(){
        return PhotoGalleryFragment.newInstance();
    }

}
