package com.example.samplerecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView tvTitle;
    ImageView imageTv;

    String data;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        imageTv = (ImageView)findViewById(R.id.imageTv);
        getData();
        setData();
    }

    private void getData(){
        if(getIntent().hasExtra("data") && getIntent().hasExtra("data1")){
            data = getIntent().getStringExtra("data");
            image = getIntent().getIntExtra("data1", 1);

        } else
        {
            Toast.makeText(SecondActivity.this, "Could not get the data",Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){
        tvTitle.setText(data);
        imageTv.setImageResource(image);
    }
}