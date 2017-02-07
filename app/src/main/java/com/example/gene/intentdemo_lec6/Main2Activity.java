package com.example.gene.intentdemo_lec6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.gene.intentdemo_lec6.utils.Utils.AGE_MSG_KEY;
import static com.example.gene.intentdemo_lec6.utils.Utils.NAME_MSG_KEY;

public class Main2Activity extends AppCompatActivity {

    private TextView textView1, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView1 = (TextView) findViewById(R.id.tv1_ma2);
        textView2 = (TextView) findViewById(R.id.tv2_ma2);

        String incoming_msg= getIntent().getStringExtra(AGE_MSG_KEY);
        String incoming_name = getIntent().getStringExtra(NAME_MSG_KEY);
        textView2.setText(incoming_name);
        textView1.setText(incoming_msg);
    }
}
