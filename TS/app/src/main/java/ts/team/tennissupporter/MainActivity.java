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
    }

    public void informationButtonClicked(View v){
        Toast.makeText(getApplicationContext(), "��ȸ���� �Խ������� �̵��մϴ�.", Toast.LENGTH_LONG).show();
        Intent myIntent = new  Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kutca.com/bbs/zboard.php?id=circle_open&category="));
        startActivity(myIntent);
    }

    public void boardButtonClicked(View v){
        Toast.makeText(getApplicationContext(), "���� �Խ������� �̵��մϴ�.", Toast.LENGTH_LONG).show();
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kutca.com/bbs/zboard.php?id=freeboard&category="));
        startActivity(myIntent);
    }

    public void mangerButtonClicked(View v) {
        Intent intent = new Intent(getApplicationContext(), ManagerModeActivity.class);
        startActivity(intent);

    }
    public void matchesButtonClicked(View v) {
        Intent intent = new Intent(getApplicationContext(), ManagerModeActivity.class);
        startActivity(intent);

    }

}