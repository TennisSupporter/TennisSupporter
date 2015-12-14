

package ts.team.tennissupporter;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ManagerModeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_managermode);

        Button moveMatches = (Button) findViewById(R.id.moveMatches);

        moveMatches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManagerModeActivity.this, MatchesAdminActivity.class);
                startActivity(intent);
            }
        });
    }

    public void backButtonClicked(View v) {
        finish();
    }
}
