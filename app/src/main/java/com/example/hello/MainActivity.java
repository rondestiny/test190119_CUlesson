package com.example.hello;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDisplayButton();
    }

    private void initDisplayButton(){
        Button displayButton = (Button) findViewById(R.id.button);
        displayButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                EditText editName = (EditText) findViewById(R.id.editText);
                TextView textDisplay = (TextView) findViewById(R.id.textView2);
                String nameToDisplay = editName.getText().toString();
                textDisplay.setText("Hello " + nameToDisplay);
            }

        });



    }


}
