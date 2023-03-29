package com.random.testi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class AddUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
    }

    public void addUser (View view) {

        Button btnTite = findViewById(R.id.btnTite);
        Button btnTuta = findViewById(R.id.btnTuta);
        Button btnLate = findViewById(R.id.btnLate);
        Button btnSate = findViewById(R.id.btnSate);
        Button btnAddUser = findViewById(R.id.btnAddUser);

        RadioGroup rgDegreeProgram = findViewById(R.id.radioGroupDegree);

        EditText firstNameEditText = (EditText) findViewById(R.id.textFirstName);
        EditText lastNameEditText = findViewById(R.id.textLastName);
        EditText emailEditText = findViewById(R.id.textEmail);

        switch (rgDegreeProgram.getCheckedRadioButtonId()) {
            case R.id.btnTite:
                UserStorage.getInstance().addUser(new User(firstNameEditText.getText().toString(), lastNameEditText.getText().toString(), emailEditText.getText().toString(), "Tietotekniikka"));
                break;
            case R.id.btnTuta:
                UserStorage.getInstance().addUser(new User(firstNameEditText.getText().toString(), lastNameEditText.getText().toString(), emailEditText.getText().toString(), "Tuotantotalous"));
                break;
            case R.id.btnLate:
                UserStorage.getInstance().addUser(new User(firstNameEditText.getText().toString(), lastNameEditText.getText().toString(), emailEditText.getText().toString(), "Laskennallinen tekniikka"));
                break;
            case R.id.btnSate:
                UserStorage.getInstance().addUser(new User(firstNameEditText.getText().toString(), lastNameEditText.getText().toString(), emailEditText.getText().toString(), "Sähkötekniikka"));
                break;
        }
    }
}