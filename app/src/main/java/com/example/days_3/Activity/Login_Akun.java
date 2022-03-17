package com.example.days_3.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.days_3.R;

public class Login_Akun extends AppCompatActivity {
    Button sign_in;
    EditText Username,Password;

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

       setContentView(R.layout.login_relative);

       sign_in = (Button) findViewById(R.id.btnSign_in);
       Username = (EditText) findViewById(R.id.etUsername);
       Password = (EditText) findViewById(R.id.etPassword);

       sign_in.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(Password.getText().toString().toUpperCase().equals("TEST1")){
                   sign_in_sukses();

               }else{
                   Toast.makeText(getApplicationContext(), "Password salah", Toast.LENGTH_SHORT).show();
               }
           }
       });
    }

    private void sign_in_sukses() {
        Intent i = new Intent(this, MainActivity.class);
        String username = Username.getText().toString();
        //mengirim username ke tampilan utama
        i.putExtra("USERNAME",username);
        startActivity(i);
    }
}
