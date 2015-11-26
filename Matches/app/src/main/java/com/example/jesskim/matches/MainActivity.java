package com.example.jesskim.matches;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button admin = (Button) findViewById(R.id.bt_1);
        Button user = (Button) findViewById(R.id.user);

        // 관리자 모드 들어가기
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action on Click
                Intent intent = new Intent(MainActivity.this, PasswordActivity.class);
                startActivity(intent);
            }
        });

        // 일반 사용자 모드 들어가기
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Perform action on Click

            }
        });
    }

}
