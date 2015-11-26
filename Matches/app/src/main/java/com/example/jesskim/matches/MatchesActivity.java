package com.example.jesskim.matches;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class MatchesActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matches);

        Button finish = (Button) findViewById(R.id.btn_FINISH);

        // 관리자 모드 들어가기
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action on Click
                setContentView(R.layout.activity_realmatches);

            }
        });
    }

}
