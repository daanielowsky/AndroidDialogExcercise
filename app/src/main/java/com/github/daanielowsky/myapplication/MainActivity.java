package com.github.daanielowsky.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.go);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAlert();
            }
        };
        button.setOnClickListener(onClickListener);

    }

    public void getAlert(){
        DialogFragment dialogFragment = new DialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "");
    }


}
