package com.example.vibhor.checkboxdemoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private CheckBox andCheckbox,IphoneCheckbox,WinCheckbox;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addOnClickListener();
    }


    public void addOnClickListener(){

        submitButton= (Button) findViewById(R.id.submit_button);
        andCheckbox = (CheckBox) findViewById(R.id.android_checkbox);
        IphoneCheckbox = (CheckBox) findViewById(R.id.iphone_checkbox);
        WinCheckbox = (CheckBox) findViewById(R.id.windows_checkbox);


        andCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"You  have android phone",Toast.LENGTH_LONG).show();


            }
        });

        IphoneCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You  have iphone",Toast.LENGTH_LONG).show();
            }
        });

        WinCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You  have windows phone cheee",Toast.LENGTH_LONG).show();
            }
        });


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuffer result = new StringBuffer();
                result.append("IPhone check : ").append(IphoneCheckbox.isChecked());
                result.append("\nAndroid check : ").append(andCheckbox.isChecked());
                result.append("\nWindows Mobile check :").append(WinCheckbox.isChecked());

                Toast.makeText(MainActivity.this,result.toString(),Toast.LENGTH_LONG).show();

            }
        });
    }

}
