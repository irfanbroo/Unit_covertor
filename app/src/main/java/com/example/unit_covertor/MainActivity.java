package com.example.unit_covertor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.security.PrivateKey;



public class MainActivity extends AppCompatActivity {
    private EditText ed1;
    private Button btn;
    private TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.ed1);
        btn = findViewById(R.id.btn);
        res = findViewById(R.id.res);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = ed1.getText().toString();
                int number = Integer.parseInt(s);
                number = number * 39;

                res.setText(String.valueOf(number));
                res.setVisibility(View.VISIBLE);
                ed1.setText(null);
            }
        });

    }
}