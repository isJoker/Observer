package com.jokerwan.observer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.jokerwan.observer.observer.IObserver;

public class ThirdActivity extends AppCompatActivity implements IObserver {

    TextView tv_third;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tv_third = (TextView)findViewById(R.id.tv_third);
        findViewById(R.id.btn_third).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //被观察者有了动作
                ConcreteSubject.getInstance().operation();
            }
        });

        //订阅
        ConcreteSubject.getInstance().addObserver(this);
    }

    @Override
    public void update(String content) {
        tv_third.setText(content);
    }
}
