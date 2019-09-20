package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int X,Y,Result;
    TextView tvRes;
    EditText etX, etY;
    Button btnAdd, btnSub, btnMul, btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvRes = (TextView)findViewById(R.id.tvRes);
        etX = (EditText)findViewById(R.id.etX);
        etY = (EditText)findViewById(R.id.etY);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnMul = (Button)findViewById(R.id.btnMul);
        btnDiv = (Button)findViewById(R.id.btnDiv);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                X = (Integer.parseInt(etX.getText().toString()));
                Y = (Integer.parseInt(etY.getText().toString()));
                Result = X + Y;
                tvRes.setText(String.valueOf(Result));
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                X = (Integer.parseInt(etX.getText().toString()));
                Y = (Integer.parseInt(etY.getText().toString()));
                Result = X - Y;
                tvRes.setText(String.valueOf(Result));
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                X = (Integer.parseInt(etX.getText().toString()));
                Y = (Integer.parseInt(etY.getText().toString()));
                Result = X * Y;
                tvRes.setText(String.valueOf(Result));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                X = (Integer.parseInt(etX.getText().toString()));
                Y = (Integer.parseInt(etY.getText().toString()));
                Result = X / Y;
                tvRes.setText(String.valueOf(Result));
            }
        });
    }
}
