package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.myapplication.view.ImageSurfaceView;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    private ImageSurfaceView viewById;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewById = (ImageSurfaceView) findViewById(R.id.img);
        try {
            InputStream open = getAssets().open("world.jpg");
            viewById.setInputStream(open);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
