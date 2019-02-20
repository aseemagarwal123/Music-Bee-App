package com.dot.musicbee;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.dot.musicbee.R;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Songs extends AppCompatActivity {
    private Context mContext;
    private Activity mActivity;
    private RecyclerView recyclerview;
    private RecyclerView.Adapter adapter;
   // private List<listitem> listitems;
    TextView tv;
    //private LinearLayout mRootLayout;
    private Button mButtonPlay;
    MediaPlayer mPlayer;

//    MediaPlayer mPlayer;
//    ArrayList<String> songlist=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        tv=(TextView)findViewById(R.id.textviewhead);
        recyclerview=(RecyclerView)findViewById(R.id.recyclerview);
        recyclerview.setHasFixedSize(true);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

        adapter = new myadapter(Client.arrayList,this);
        recyclerview.setAdapter(adapter);
    }



}