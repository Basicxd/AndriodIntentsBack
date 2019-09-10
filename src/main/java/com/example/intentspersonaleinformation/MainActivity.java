package com.example.intentspersonaleinformation;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goButton(View view){
        Intent intent = new Intent(this, PersonaleInfo.class);
        startActivityForResult(intent,42);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);

        String navn = intent.getStringExtra(PersonaleInfo.NAVN);
        String address = intent.getStringExtra(PersonaleInfo.ADDRESS);
        String shoeSize = intent.getStringExtra(PersonaleInfo.SHOESIZE);

        final TextView navnView = (TextView) findViewById(R.id.personaleNavn);
        final TextView addressView = (TextView) findViewById(R.id.personaleAddress);
        final TextView shoeSizeView = (TextView) findViewById(R.id.personaleShoeSize);

        navnView.setVisibility(View.VISIBLE);
        addressView.setVisibility(View.VISIBLE);
        shoeSizeView.setVisibility(View.VISIBLE);

        navnView.setText("Navn: " + navn);
        addressView.setText("Address: " + address);
        shoeSizeView.setText("Shoe Size: " + shoeSize);
    }
}
