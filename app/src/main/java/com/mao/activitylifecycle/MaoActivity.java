package com.mao.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MaoActivity extends AppCompatActivity {
    private static final String TAG = "MaoActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mao);
        Log.d(TAG, "onCreate: 执行了");
        Button button = (Button) findViewById(R.id.activity_mao_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MaoActivity.this, ActivitySecond.class);
//                startActivity(intent);
                Toast.makeText(MaoActivity.this, "单击按钮", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart:执行了 ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: 执行了");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume:执行了");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause:执行了 ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop:执行了 ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy:执行了 ");
    }
}
