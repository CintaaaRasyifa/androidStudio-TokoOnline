package com.example.a11rpl1_09_cintaa;
import android.os.Bundle;
import android.content.Intent;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class activitylogin extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginactivity);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();
                if (usernameKey.equals("admin") &&
                        passwordKey.equals("12345")) {
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(activitylogin.this,
                            activityshop.class);
                    activitylogin.this.startActivity(intent);
                    finish();
                } else {
                    AlertDialog.Builder builder = new
                            AlertDialog.Builder(activitylogin.this);
                    builder.setMessage("Username atau Password Anda salah!")
                            .setNegativeButton("Retry",
                                    null).create().show();
                }
            }
        });
    }
}

