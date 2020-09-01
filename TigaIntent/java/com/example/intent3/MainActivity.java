package com.example.intent3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button page2;
    Button page3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_pertama);
        page2 = (Button)findViewById(R.id.button1);
        page2.setOnClickListener(this);
        page3 = (Button)findViewById(R.id.button2);
        page3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                Intent page2 = new Intent(MainActivity.this, pagekedua.class);
                startActivity(page2);
                break;
            case R.id.button2:
                Intent page3 = new Intent(MainActivity.this, pageketiga.class);
                startActivity(page3);
                break;
            default:
                break;
        }
    }
}