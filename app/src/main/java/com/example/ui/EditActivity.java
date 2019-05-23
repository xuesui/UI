package com.example.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        Button resure=(Button)findViewById(R.id.resure_button);
        Button back=(Button)findViewById(R.id.back_button);
        EditText week=(EditText)findViewById(R.id.week_edit);
        EditText time=(EditText)findViewById(R.id.time_edit);
        EditText remind=(EditText)findViewById(R.id.remind_edit);
        week.setFocusable(false);
        week.setFocusableInTouchMode(false);
        time.setFocusable(false);
        time.setFocusableInTouchMode(false);
        remind.setFocusable(false);
        remind.setFocusableInTouchMode(false);
        resure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(EditActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(EditActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
