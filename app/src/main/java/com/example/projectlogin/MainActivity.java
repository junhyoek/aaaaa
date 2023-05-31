package com.example.projectlogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projectlogin.adapters.PostAdapter;
import com.example.projectlogin.models.Post;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mPostRecyClerView;
    private PostAdapter mAdapter;
    private List<Post> mDatas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPostRecyClerView = findViewById(R.id.main_recyclerview);

        mDatas = new ArrayList<>();
        mDatas.add(new Post(null, "title", "contents"));
        mDatas.add(new Post(null, "title", "contents"));
        mDatas.add(new Post(null, "title", "contents"));

        mAdapter = new PostAdapter(mDatas);
        mPostRecyClerView.setAdapter(mAdapter);
    }
}