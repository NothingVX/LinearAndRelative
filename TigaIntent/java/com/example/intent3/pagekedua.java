package com.example.intent3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pagekedua extends AppCompatActivity implements View.OnClickListener {
    Button page1;
    Button page3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_kedua);
        page1 = (Button) findViewById(R.id.button1);
        page1.setOnClickListener(this);
        page3 = (Button) findViewById(R.id.button2);
        page3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Intent page1 = new Intent(pagekedua.this, MainActivity.class);
                startActivity(page1);
                break;
            case R.id.button2:
                Intent page3 = new Intent(pagekedua.this, pageketiga.class);
                startActivity(page3);
                break;
            default:
                break;
        }
    }
}