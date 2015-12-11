package ts.team.tennissupporter;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ManagerModeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_managermode);
    }

    public void backButtonClicked(View v) {
        finish();
    }


}
