package com.aquino.junick;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }


    public void process(View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.btnscreen2) {
            i = new Intent(this, Activity2.class);
            startActivity(i);
        } else if (v.getId() == R.id.btnmap) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:17.570463,120.386983"));
            chooser = Intent.createChooser(i, "create a map application");
            startActivity(chooser);
        }
    }
}