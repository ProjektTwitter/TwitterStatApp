package com.sdplab.twitterstat.twitterapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class AddHashActivity extends AppCompatActivity implements View.OnClickListener {

    private HashtagContainer hc;
    private EditText etOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_hash);
        Button one = findViewById(R.id.button_add);
        etOne = findViewById(R.id.editText1);
        hc = HashtagContainer.getInstance();
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.button_add:
                hc.addTag(String.valueOf(etOne.getText()));
                break;

        }
    }
}
