package com.mao.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MaoActivity extends AppCompatActivity {
    private static final String TAG = "MaoActivity";
    public static final String BOOK_NAME_OF_CATEGORY_PHYSICAL="booknameofcategoryphysical";
    private  Button mButton;
    private EditText mEditText;
    private Button mThirdButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mao);
        Log.d(TAG, "onCreate: 执行了");
        mButton = (Button) findViewById(R.id.activity_mao_button);
        mEditText = (EditText) findViewById(R.id.activity_mao_edittext);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  Log.d(TAG, "onClick: 执行了");
                  Intent intent=new Intent(MaoActivity.this,ActivitySecond.class);
                  intent.putExtra(BOOK_NAME_OF_CATEGORY_PHYSICAL,mEditText.getText().toString());
                  startActivityForResult(intent,0);
            }
        });

        mThirdButton = (Button) findViewById(R.id.activity_mao_third_button);
        mThirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaoActivity.this, ThirdActivity.class);
                startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String name = "";
        switch (requestCode) {
            case 0:
                name = data.getStringExtra("back");
                break;
            case 1:
                name = data.getStringExtra("backThird");
        }
        Toast.makeText(this,name,Toast.LENGTH_SHORT).show();
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
