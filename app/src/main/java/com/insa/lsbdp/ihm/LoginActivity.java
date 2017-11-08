package com.insa.lsbdp.ihm;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {

    private static final String TEACHER_ID = "alesignac";
    private static final String STUDENT_ID = "nflantier";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login_button = (Button) findViewById(R.id.login_button);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginFunction(view);
            }
        });
    }

    public void loginFunction(View view) {
        EditText edit =  (EditText) findViewById(R.id.login_id_entry);
        String entry = edit.getText().toString();
        switch(entry) {
            case STUDENT_ID: Snackbar.make(view, "OSS 117 logged in", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            case TEACHER_ID: Snackbar.make(view, "Ce cher Armand", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            default: Snackbar.make(view, "NTM", Snackbar.LENGTH_LONG).setAction("Action", null).show();
        }

    }

}

