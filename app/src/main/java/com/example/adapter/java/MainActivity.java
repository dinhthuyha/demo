package com.example.adapter.java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.adapter.Photo;
import com.example.adapter.PhotoAdapter;
import com.example.adapter.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerPhotos;
    PhotoAdapter photoAdapter = new PhotoAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        recyclerPhotos = findViewById(R.id.recyclerPhotos);
        photoAdapter.setItemClickListener(new OnItemClickListener() {
            @Override
            public void onClick(Photo photo, int position) {
                Toast.makeText(getApplicationContext(), photo.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
        recyclerPhotos.setAdapter(photoAdapter);
    }

    private void initData() {
        List<Photo> photos = new ArrayList<>();
        photos.add(new Photo(
                1,
                "Nguyen Van A",
                "https://www.nretnil.com/avatar/LawrenceEzekielAmos.png"));
        photos.add(new Photo(
                1,
                "Nguyen Van A",
                "https://www.nretnil.com/avatar/LawrenceEzekielAmos.png"));
        photos.add(new Photo(
                1,
                "Nguyen Van A",
                "https://www.nretnil.com/avatar/LawrenceEzekielAmos.png"));
        photos.add(new Photo(
                1,
                "Nguyen Van A",
                "https://www.nretnil.com/avatar/LawrenceEzekielAmos.png"));
        photoAdapter.updateData(photos);
    }
}