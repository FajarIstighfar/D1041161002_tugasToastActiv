package com.example.d1041161002_tugastoastactiv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    int mCount = 02;
    TextView mShowCount;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        final TextView textView = findViewById(R.id.text_header);
        textView.setText(message);
        final TextView textCount = findViewById(R.id.showCount);
        //mShowCount = (TextView)findViewById(R.id.showCount);
        textCount.setText(Integer.toString(mCount));
        final Button buttonTambah = findViewById(R.id.btnTambah);
        buttonTambah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mCount++;
                textCount.setText(Integer.toString(mCount));
                // Code here executes on main thread after user presses button
            }
        });
        final Button buttonKurang = findViewById(R.id.btnKurang);
        buttonKurang.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mCount--;
                textCount.setText(Integer.toString(mCount));
                // Code here executes on main thread after user presses button
            }
        });

//        if (mShowCount !=null)
//            mShowCount.setText(Integer.toString(mCount));
    }

//    public void countUp(View view){
//        mCount++;
//        if (mShowCount !=null)
//            mShowCount.setText(Integer.toString(mCount));
//
//    }
//    public void showToast(View view){
//        Toast toast = Toast.makeText(this, R.string.toast_button_toast, Toast.LENGTH_LONG);
//        toast.show();
//    }
}
