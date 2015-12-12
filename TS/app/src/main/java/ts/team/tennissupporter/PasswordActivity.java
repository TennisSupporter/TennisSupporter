package ts.team.tennissupporter;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        Button login = (Button) findViewById(R.id.login);
        final EditText pw = (EditText) findViewById(R.id.pw);

        // 관리자 모드에서 비밀번호 입력 후 login 버튼 누름
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // EditText의 내용과 password와 비교
                // 같으면 다음 Activity로, 다르면 원래 hint : Administer로
                final String password = pw.getText().toString();
                final String admin = "Tennis";        // password : Tennis

                if( admin.equals(password) ) {
                    Intent intent_match = new Intent(PasswordActivity.this, ManagerModeActivity.class);
                    startActivity(intent_match);
                }
            }
        });
    }

    public void backButtonClicked(View v) {
        finish();
    }




}
