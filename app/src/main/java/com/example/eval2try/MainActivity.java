package com.example.eval2try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;



import android.content.Intent;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = findViewById(R.id.button2_id);
        EditText send_text = findViewById(R.id.nametext);

      /*  button2.setOnClickListener( v -> {
           String str  = send_text.getText().toString();
           Intent intent = new Intent(getApplicationContext() , secondActivity.class);
           intent.putExtra("message_key" , str);
           startActivity(intent);
       });  */

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view){
                String str = send_text.getText().toString();
                Intent intent = new Intent(getApplicationContext(), secondActivity2.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });

    }
}