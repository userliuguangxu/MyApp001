package com.example.administrator.myapp001;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView idd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//dsadsa
        initView();
        init();
    }

  private void init() {
        idd.setText("张三丰");//

    }

    private void initView() {
        idd = (TextView) findViewById(R.id.idd);
    }
}
