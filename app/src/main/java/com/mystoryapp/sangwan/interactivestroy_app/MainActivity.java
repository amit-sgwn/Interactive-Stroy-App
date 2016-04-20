package com.mystoryapp.sangwan.interactivestroy_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mNameField;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNameField = (EditText)findViewById(R.id.editText);
        mButton = (Button)findViewById(R.id.startButton);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mNameField.getText().toString();
                startStory(text);
            }
        });
    }
    private void startStory(String name){
        Intent in = new Intent(this,StoryActivity.class);
        in.putExtra("name",name);
        startActivity(in);
    }
}
