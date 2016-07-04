package com.example.tj.gridtest;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridLayout gridLayout;
    Resources res;
    int max;


    //Test
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridLayout = (GridLayout)findViewById(R.id.gridLayout);
        int size = 20;
        TextView[] textView = new TextView[size];
        res = getResources();
        max = 30;
        int stringsize = 0;
        int count = 1;
        for(int i= 0;i<size;i++){
            textView[i] = new TextView(this);
            textView[i].setText("떠라"+i);
            textView[i].setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            stringsize += textView[i].getText().length();
            if(stringsize >= max){
                gridLayout.setColumnCount(count);
                stringsize = 0;
                count=0;
            }
            textView[i].setTextColor(Color.WHITE);
            textView[i].setBackground(res.getDrawable(R.drawable.cloud_size));
            textView[i].setPadding(5,5,5,5);
            Log.d("TAG","텍스트 필드의 크기는 "+textView[0].getText().length());

            gridLayout.addView(textView[i]);
            count++;

        }

    }
}
