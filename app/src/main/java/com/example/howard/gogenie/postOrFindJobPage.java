package com.example.howard.gogenie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class postOrFindJobPage extends AppCompatActivity {

    public ImageButton recuit;
    public ImageButton find;

    public void init(){
        recuit = (ImageButton)findViewById(R.id.recuitButton);
        recuit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent post = new Intent(postOrFindJobPage.this, LoginPage.class);
                startActivity(post);
                postOrFindJobPage.this.finish();
            }
        });
        find = (ImageButton)findViewById(R.id.findButton);
        find.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent findJob = new Intent(postOrFindJobPage.this, LoginPage.class);
                startActivity(findJob);
                postOrFindJobPage.this.finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_or_find_job_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        init();
    }

}
