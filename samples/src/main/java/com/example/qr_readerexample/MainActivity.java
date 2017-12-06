package com.example.qr_readerexample;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by firec on 08.11.2017.
 */

public class MainActivity extends Activity implements View.OnClickListener {

    Button login;
    EditText user;
    EditText pass;
    String cred = "123456";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        login = (Button) findViewById(R.id.button);
        user   = (EditText)findViewById(R.id.editText2);
        pass   = (EditText)findViewById(R.id.editText3);
        login.setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View v) {
        if((user.getText().toString() + pass.getText().toString()).equals(cred)){
            Intent myIntent = new Intent(MainActivity.this, DecoderActivity.class);
            //myIntent.putExtra("key", value); //Optional parameters
            MainActivity.this.startActivity(myIntent);
        }else {
            Toast.makeText(MainActivity.this, "Login failed" + "|" + user.getText().toString() + pass.getText().toString() + "|" + cred, Toast.LENGTH_LONG).show();
        }
    }
}
