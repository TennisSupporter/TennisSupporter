package ts.team.tennissupporter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Splash(로딩화명) 띄우기
        startActivity(new Intent(this, Splash_Activity.class));
    }

    public void informationButtonClicked(View v){
        Toast.makeText(getApplicationContext(), "대회정보 게시판으로 이동합니다.", Toast.LENGTH_LONG).show();
        Intent myIntent = new  Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kutca.com/bbs/zboard.php?id=circle_open&category="));
        startActivity(myIntent);
    }

    public void boardButtonClicked(View v){
        Toast.makeText(getApplicationContext(), "자유게시판으로 이동합니다.", Toast.LENGTH_LONG).show();
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kutca.com/bbs/zboard.php?id=freeboard&category="));
        startActivity(myIntent);
    }

    public void mangerButtonClicked(View v) {
        Intent intent = new Intent(getApplicationContext(), PasswordActivity.class);
        startActivity(intent);

    }
    public void matchesButtonClicked(View v) {
        Intent intent = new Intent(getApplicationContext(), MatchesActivity.class);
        startActivity(intent);

    }

}