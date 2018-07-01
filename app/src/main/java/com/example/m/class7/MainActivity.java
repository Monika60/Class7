package com.example.m.class7;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //variable declaration
    private EditText editTextValueA;
    private EditText editTextValueB;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialisation
        editTextValueA = findViewById(R.id.editText_valueA);
        editTextValueB = findViewById(R.id.editText_valueB);
        textViewResult = findViewById(R.id.textView_result);

        //       Toast.makeText(this, "onCreate Executed", Toast.LENGTH_SHORT).show();
    }

/*  @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "onStart Created", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this, "onResume Executed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this, "onPause Executed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(this, "onStop Executed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this, "onRestart Executed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "onDestroy Executed", Toast.LENGTH_SHORT).show();
    }*/


    public void calculate(View view) {

        String strValueA = editTextValueA.getText().toString();
        String strValueB = editTextValueB.getText().toString();

        if (TextUtils.isEmpty(strValueA) || TextUtils.isEmpty(strValueB)) {
            Toast.makeText(this, "Enter Both Value", Toast.LENGTH_SHORT).show();
        } else {
            int valueA = Integer.parseInt(editTextValueA.getText().toString());
            int valueB = Integer.parseInt(editTextValueB.getText().toString());
            int result = 0;

            switch (view.getId()) {
                case R.id.button_add:
                    result = valueA + valueB;
//                Toast.makeText(this, "Add Clicked", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button_sub:
                    result = valueA - valueB;
                    //Toast.makeText(this, "Sub Clicked", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button_mul:
                    result = valueA * valueB;
                    //   Toast.makeText(this, "Mul Clicked", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button_div:
                    result = valueA / valueB;
                    //  Toast.makeText(this, "Div Clicked", Toast.LENGTH_SHORT).show();
                    break;

            }
            textViewResult.setText("Result : " + String.valueOf(result));
        }
    }
}
