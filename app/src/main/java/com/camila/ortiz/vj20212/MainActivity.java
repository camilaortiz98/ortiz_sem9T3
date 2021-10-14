package com.camila.ortiz.vj20212;

import static com.camila.ortiz.vj20212.R.id.btnMessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btnCalls);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                EditText input = findViewById(R.id.inputNumber);
                String value = String.valueOf(input.getText());
                Log.i("MAIN_APP", "El valor es: "+ value);

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",value,null));
                startActivity(intent);

            }
        });

       Button button2 = findViewById(R.id.btnMessage);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText input = findViewById(R.id.inputNumber);
                String value = String.valueOf(input.getText());
                Log.i("MAIN_APP", "El valor es: "+ value);

                String sms= "";
                Intent smsIntent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", value, null));
                smsIntent.putExtra("sms_body",sms);
                startActivity(smsIntent);

            }
        });

    }
}