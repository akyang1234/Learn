package com.winson.learn.custom_controls;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.winson.learn.R;

/**
 * Created by Administrator on 2016/12/8.
 */
public class TitleLayout extends LinearLayout {
    public TitleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        layoutInflater.inflate(R.layout.title , this);
        Button btnBack =(Button)findViewById(R.id.btnTitleBack);
        Button btnConfig = (Button)findViewById(R.id.btnConfig);
        btnBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Activity)getContext() ).finish();
            }
        });

        btnConfig.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext() , "You push the config button!" , Toast.LENGTH_LONG).show();
            }
        });

    }
}
