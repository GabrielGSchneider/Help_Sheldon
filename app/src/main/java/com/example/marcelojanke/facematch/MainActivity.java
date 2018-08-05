package com.example.marcelojanke.facematch;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.marcelojanke.facematch.WebRequest.WebInit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton button = findViewById(R.id.Like);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                WebInit init =
                        new WebInit(getApplicationContext(),
                                "http://192.168.2.25/Help_sheldon/SetInfo.php");
                init.Info();

            }
        });


    }

}
