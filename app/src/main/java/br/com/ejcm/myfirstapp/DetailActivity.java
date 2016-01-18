package br.com.ejcm.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        String msg = intent.getStringExtra(MainActivity.MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(msg);
        RelativeLayout rl = (RelativeLayout)
                findViewById(R.id.detail_view_group);
        rl.addView(textView);
    }
}
