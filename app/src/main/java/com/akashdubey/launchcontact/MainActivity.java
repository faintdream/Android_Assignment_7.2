package com.akashdubey.launchcontact;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    Button launchContacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        launchContacts=(Button)findViewById(R.id.launchBtn);

        launchContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contacts= new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/1"));
                startActivity(contacts);
            }
        });
    }
}
