package com.winson.learn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.winson.learn.activities.AlertDialogAct;
import com.winson.learn.activities.LinearLayoutAct;

public class MainActivity extends AppCompatActivity {
    Button btn1 ;
    Button btn2 ;
    Button btn3 ;
    Button btn4 ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 =(Button) findViewById(R.id.btn1);
        btn2 =(Button) findViewById(R.id.btn2);
        btn3 =(Button) findViewById(R.id.btn3);
        btn4 =(Button) findViewById(R.id.btn4);

    }

    public void goToActivity(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.btn1:
                intent = new Intent(this , AlertDialogAct.class);

                break;
            case R.id.btn2:
                intent = new Intent(this , LinearLayoutAct.class);
                break;
            case R.id.btn3:

                break;
            case R.id.btn4:

                break;
            case R.id.btn5:

                break;
            default:
                break;
        }
        startActivity(intent);

    }


}
