package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText editText;
    TextView welcomeText,resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.buttonone);
        editText=(EditText) findViewById(R.id.textone);
        welcomeText=(TextView) findViewById(R.id.welcome);
        resultText=(TextView) findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double kilos_entered=Double.parseDouble(editText.getText().toString());
                resultText.setText(""+converToPound(kilos_entered));

            }
            public double converToPound(double kilos)
            {
                double result_pound=kilos*2.20462;
                return result_pound;
            }
        });

    }
}