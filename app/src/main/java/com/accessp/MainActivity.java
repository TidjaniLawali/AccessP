package com.accessp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submit = (Button) findViewById(R.id.Button);
        final EditText password = (EditText) findViewById(R.id.editText2);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String passwordRawText = password.getText().toString();
                if(!passwordRawText.trim().equals(""))
                {
                    Toast.makeText(MainActivity.this, passwordRawText, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "empty password", Toast.LENGTH_LONG).show();
                }


            }
        });

    }
}
