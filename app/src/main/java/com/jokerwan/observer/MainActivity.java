package com.jokerwan.observer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.jokerwan.observer.observer.IObserver;
import com.jokerwan.observer.observer.ObserverManager;

public class MainActivity extends AppCompatActivity implements IObserver{

    TextView tv_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_main = (TextView)findViewById(R.id.tv_main);
        findViewById(R.id.btn_main).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ScondActivity.class);
                startActivity(intent);
            }
        });

        //订阅
        ObserverManager.getInstance().addObserver(this);
    }

    @Override
    public void update(String content) {
        tv_main.setText(content);
    }
}
