package com.example.metertoinches;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

private Button convertButton;
private TextView resulttextview;
private  EditText enterMeters;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

convertButton=(Button)findViewById(R.id.convertid);
resulttextview=(TextView)findViewById(R.id.resultid);
enterMeters = (EditText) findViewById(R.id.meterseditTextid);

convertButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        //conversion logic
        double multipler = 39.37;
        double result = 0.0;


        if (enterMeters.getText().toString().equals("")) {
            resulttextview.setText(R.string.error_message);
            resulttextview.setTextColor(Color.RED);
        } else {

            double meterValue = Double.parseDouble(enterMeters.getText().toString());

            result = meterValue * multipler;

            resulttextview.setTextColor(Color.GREEN);
            resulttextview.setText(String.format("%.2f", result) + "Inches");
        }
    }});

}}