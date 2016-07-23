package com.mao.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by lsx on 2016/7/22.
 */
public class ActivitySecond extends AppCompatActivity {
    private TextView mtextView;
    private Button mSendBackButton;
    private EditText mNameEdittext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        String inforcontent=getIntent().getStringExtra(MaoActivity.BOOK_NAME_OF_CATEGORY_PHYSICAL);
        mtextView = (TextView) findViewById(R.id.second_activity_text_view);
        mtextView.setText(inforcontent);

        mNameEdittext = (EditText) findViewById(R.id.second_activity_edit_text);
        mSendBackButton = (Button) findViewById(R.id.second_activity_button);

        mSendBackButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String name=mNameEdittext.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("back", name);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
