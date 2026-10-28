package com.sam.practical5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText e_name, e_contact;
    Button b_design;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_design = findViewById(R.id.b_design1);
        e_name = findViewById(R.id.m_ename);
        e_contact = findViewById(R.id.m_e_contact);

        b_design.setOnClickListener(v -> {
            String name = e_name.getText().toString();
            String contact = e_contact.getText().toString();

            Intent intent = new Intent(MainActivity.this, design1.class);
            intent.putExtra("name", name);
            intent.putExtra("contact", contact);

            startActivity(intent);
        });
    }
}