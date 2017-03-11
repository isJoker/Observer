package com.jokerwan.observer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.jokerwan.observer.observer.IObserver;
import com.jokerwan.observer.observer.ObserverManager;

public class ScondActivity extends AppCompatActivity implements IObserver{

    TextView tv_second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scond);
        tv_second = (TextView)findViewById(R.id.tv_second);
        findViewById(R.id.btn_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScondActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });

        //订阅
        ObserverManager.getInstance().addObserver(this);
    }

    @Override
    public void update(String content) {
        tv_second.setText(content);
    }
}
