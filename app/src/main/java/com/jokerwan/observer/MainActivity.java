package com.jokerwan.observer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.jokerwan.observer.observer.IObserver;

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
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });

        //添加观察者到被观察者的被订阅列表，简称：订阅
        ConcreteObservable.getInstance().addObserver(this);
    }

    @Override
    public void update(String content) {
        tv_main.setText(content);
    }
}
