package com.jokerwan.observer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.jokerwan.observer.observer.IObserver;
import com.jokerwan.observer.observer.ObserverManager;

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
                ObserverManager.getInstance().notifyObservers("数据被刷新了");
            }
        });

        //订阅
        ObserverManager.getInstance().addObserver(this);
    }

    @Override
    public void update(String content) {
        tv_third.setText(content);
    }
}
