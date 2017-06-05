package com.example.howard.gogenie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {

    public ImageButton engButton;
    public ImageButton chiButton;

    public void init(){
        chiButton = (ImageButton)findViewById(R.id.chiButton);
        chiButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent chi = new Intent(Home.this, postOrFindJobPage.class);
                startActivity(chi);
                Home.this.finish();
            }
        });

        engButton = (ImageButton)findViewById(R.id.engButton);
        engButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent eng = new Intent(Home.this, postOrFindJobPageEng.class);
                startActivity(eng);
                Home.this.finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
    }
}
