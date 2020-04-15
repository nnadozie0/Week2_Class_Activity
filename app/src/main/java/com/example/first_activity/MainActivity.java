package com.example.first_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =  findViewById(R.id.btn2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openText();
            }
        });
    }

    public void openText(){
        Intent intent = new Intent(this, Text.class);
        startActivity(intent);
    }

    public void displayToast(View view){
        Toast.makeText(MainActivity.this, "My favourite Programming Language is Python",Toast.LENGTH_SHORT).show();

    }

}
