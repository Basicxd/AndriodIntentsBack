package com.example.intentspersonaleinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.transform.Result;

public class PersonaleInfo extends AppCompatActivity {

    public static final String NAVN = "navn";
    public static final String ADDRESS = "address";
    public static final String SHOESIZE = "shoeSize";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personale_info);
    }

    public void sendButton(View view) {
        Intent data = new Intent();
        EditText navnField = (EditText) findViewById((R.id.navnText));
        EditText addressField = (EditText) findViewById((R.id.addressText));
        EditText shoeSizeField = (EditText) findViewById((R.id.shoeSizeText));


        data.putExtra(NAVN, navnField.getText().toString());
        data.putExtra(ADDRESS, addressField.getText().toString());
        data.putExtra(SHOESIZE, shoeSizeField.getText().toString());


        setResult(RESULT_OK, data);

        finish();

    }

}
