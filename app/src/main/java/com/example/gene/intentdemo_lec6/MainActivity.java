package com.example.gene.intentdemo_lec6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import static com.example.gene.intentdemo_lec6.utils.Utils.AGE_MSG_KEY;
import static com.example.gene.intentdemo_lec6.utils.Utils.NAME_MSG_KEY;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private EditText editText1, editText2;
    private ListView lsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lsView=(ListView) findViewById(R.id.ls_view1_ma1);

        final String[] myItems = getResources().getStringArray(R.array.my_itm_list);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myItems);

        lsView.setAdapter(adapter);

        lsView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {


                Intent intent = new Intent(MainActivity.this,Main2Activity.class);

                intent.putExtra(AGE_MSG_KEY, "Item is " +myItems[i]);


                startActivity(intent);
            }
        });

        editText1 = (EditText) findViewById(R.id.edttxt_ma1);
        editText2 = (EditText) findViewById(R.id.edttxt_name);
        btn1 = (Button)findViewById(R.id.btn_ma1);
        btn1.setOnClickListener(new MyListener());
    }

    class MyListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra(NAME_MSG_KEY, "Name is: " +editText2.getText());
            intent.putExtra(AGE_MSG_KEY, "Age is: " +editText1.getText());

            startActivity(intent);
        }
    }
}
