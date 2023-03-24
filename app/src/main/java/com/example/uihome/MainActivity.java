package com.example.uihome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapter;
    private  RecyclerView listViewLastBook, listViewForYou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        AnhXa();
        setViewLastBook();
        setViewForYou();
    }

    public void AnhXa() {
        listViewLastBook = findViewById(R.id.view);
        listViewForYou = findViewById(R.id.viewforyou);
    }

    public void setViewLastBook() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        listViewLastBook.setLayoutManager(linearLayoutManager);

        ArrayList<ListDomain> news = new ArrayList<>();
        news.add(new ListDomain("Nguyễn Công Thành", "pic1"));
        news.add(new ListDomain("Nguyễn Công Thành", "pic2"));
        news.add(new ListDomain("Nguyễn Công Thành", "pic3"));
        news.add(new ListDomain("Nguyễn Công Thành", "pic4"));
        news.add(new ListDomain("Nguyễn Công Thành", "pic1"));
        news.add(new ListDomain("Nguyễn Công Thành", "pic2"));
        news.add(new ListDomain("Nguyễn Công Thành", "pic3"));
        news.add(new ListDomain("Nguyễn Công Thành", "pic4"));

        adapter = new NewAdapter(news);
        listViewLastBook.setAdapter(adapter);
    }

    public void setViewForYou() {
        GridLayoutManager layoutManager = new GridLayoutManager(this, 3);
        listViewForYou.setLayoutManager(layoutManager);
        ArrayList<ListDomain> news = new ArrayList<>();
        news.add(new ListDomain("Nguyễn Công Thành", "pic1"));
        news.add(new ListDomain("Nguyễn Công Thành", "pic2"));
        news.add(new ListDomain("Nguyễn Công Thành", "pic3"));
        news.add(new ListDomain("Nguyễn Công Thành", "pic4"));
        news.add(new ListDomain("Nguyễn Công Thành", "pic1"));
        news.add(new ListDomain("Nguyễn Công Thành", "pic2"));
        news.add(new ListDomain("Nguyễn Công Thành", "pic3"));
        news.add(new ListDomain("Nguyễn Công Thành", "pic4"));
        adapter = new NewAdapter(news);
        listViewForYou.setAdapter(adapter);
    }
}