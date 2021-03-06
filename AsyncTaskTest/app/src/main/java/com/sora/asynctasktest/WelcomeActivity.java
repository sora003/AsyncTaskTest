package com.sora.asynctasktest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Sora on 2016/1/13.
 */
public class WelcomeActivity extends AppCompatActivity{

    private Button button;
    private Button button_pg;
    private Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        button = (Button) findViewById(R.id.button);
        button_pg = (Button) findViewById(R.id.bt_pg);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mContext,MainActivity.class));
            }
        });
        button_pg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mContext,ProgressBarTest.class));
            }
        });
    }
}
