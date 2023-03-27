package com.example.eval2try;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity2 extends AppCompatActivity {


    TextView tv ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        tv = findViewById(R.id.textView);
        Intent i = getIntent();
        String str = ((Intent)i).getStringExtra("message_key" );
        tv.setText("hello"+str+"!");

    }


}


