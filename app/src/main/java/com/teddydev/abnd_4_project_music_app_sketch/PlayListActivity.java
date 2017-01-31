package com.teddydev.abnd_4_project_music_app_sketch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PlayListActivity extends AppCompatActivity {

    private TextView searchActivityButton;
    private TextView playNowActivityButton;
    private TextView paymentsActivityButton;


    private TextView.OnClickListener changeActivityOnClickListener = new TextView.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view != null) {
                Intent intent = null;
                switch (view.getId()) {
                    case R.id.button_search_activity:
                        intent = new Intent(PlayListActivity.this, SearchActivity.class);
                        break;
                    case R.id.button_play_now_activity:
                        intent = new Intent(PlayListActivity.this, PlayNowActivity.class);
                        break;
                    case R.id.button_payments_activity:
                        intent = new Intent(PlayListActivity.this, PaymentsActivity.class);
                        break;
                }
                if (intent != null) {
                    startActivity(intent);
                }
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        searchActivityButton = (TextView) findViewById(R.id.button_search_activity);
        playNowActivityButton = (TextView) findViewById(R.id.button_play_now_activity);
        paymentsActivityButton = (TextView) findViewById(R.id.button_payments_activity);

        searchActivityButton.setOnClickListener(changeActivityOnClickListener);
        playNowActivityButton.setOnClickListener(changeActivityOnClickListener);
        paymentsActivityButton.setOnClickListener(changeActivityOnClickListener);
    }
}
