package com.winson.learn.activities;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.winson.learn.R;

/**
 * Created by Administrator on 2016/12/7.
 */
public class AlertDialogAct extends AppCompatActivity implements View.OnClickListener{
    Button btnAlertDialog ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alertdialo);
        btnAlertDialog = (Button)findViewById(R.id.btnAlert);
        btnAlertDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(AlertDialogAct.this);
        alertDialog.setTitle("alertDialog.setTitle设置标题");
        alertDialog.setMessage("alertDialog.setMessage设置信息");
        alertDialog.setCancelable(false);
        alertDialog.setPositiveButton("O K" , new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {

            }
        });

        alertDialog.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        alertDialog.show();
    }
}
