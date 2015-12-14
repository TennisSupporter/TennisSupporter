package ts.team.tennissupporter;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class MatchesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matches16);
        final SharedPreferences prefs = getSharedPreferences("person", MODE_PRIVATE);
        final SharedPreferences.Editor ed = prefs.edit();

        // 16강 대진표 등록되어 있으면 가져오기 (선수)
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setText(prefs.getString("person0", "준비중"));
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        tv2.setText(prefs.getString("person1", "준비중"));
        TextView tv3 = (TextView) findViewById(R.id.tv3);
        tv3.setText(prefs.getString("person2", "준비중"));
        TextView tv4 = (TextView) findViewById(R.id.tv4);
        tv4.setText(prefs.getString("person3", "준비중"));
        TextView tv5 = (TextView) findViewById(R.id.tv5);
        tv5.setText(prefs.getString("person4", "준비중"));
        TextView tv6 = (TextView) findViewById(R.id.tv6);
        tv6.setText(prefs.getString("person5", "준비중"));
        TextView tv7 = (TextView) findViewById(R.id.tv7);
        tv7.setText(prefs.getString("person6", "준비중"));
        TextView tv8 = (TextView) findViewById(R.id.tv8);
        tv8.setText(prefs.getString("person7", "준비중"));
        TextView tv9 = (TextView) findViewById(R.id.tv9);
        tv9.setText(prefs.getString("person8", "준비중"));
        TextView tv10 = (TextView) findViewById(R.id.tv10);
        tv10.setText(prefs.getString("person9", "준비중"));
        TextView tv11 = (TextView) findViewById(R.id.tv11);
        tv11.setText(prefs.getString("person10", "준비중"));
        TextView tv12 = (TextView) findViewById(R.id.tv12);
        tv12.setText(prefs.getString("person11", "준비중"));
        TextView tv13 = (TextView) findViewById(R.id.tv13);
        tv13.setText(prefs.getString("person12", "준비중"));
        TextView tv14 = (TextView) findViewById(R.id.tv14);
        tv14.setText(prefs.getString("person13", "준비중"));
        TextView tv15 = (TextView) findViewById(R.id.tv15);
        tv15.setText(prefs.getString("person14", "준비중"));
        TextView tv16 = (TextView) findViewById(R.id.tv16);
        tv16.setText(prefs.getString("person15", "준비중"));

        // 16강 대진표 Score 가져오기
        final EditText et1_16a = (EditText) findViewById(R.id.s16_1a);
        final EditText et2_16b = (EditText) findViewById(R.id.s16_1b);
        final EditText et3_16a = (EditText) findViewById(R.id.s16_2a);
        final EditText et4_16b = (EditText) findViewById(R.id.s16_2b);
        final EditText et5_16a = (EditText) findViewById(R.id.s16_3a);
        final EditText et6_16b = (EditText) findViewById(R.id.s16_3b);
        final EditText et7_16a = (EditText) findViewById(R.id.s16_4a);
        final EditText et8_16b = (EditText) findViewById(R.id.s16_4b);
        final EditText et9_16a = (EditText) findViewById(R.id.s16_5a);
        final EditText et10_16b = (EditText) findViewById(R.id.s16_5b);
        final EditText et11_16a = (EditText) findViewById(R.id.s16_6a);
        final EditText et12_16b = (EditText) findViewById(R.id.s16_6b);
        final EditText et13_16a = (EditText) findViewById(R.id.s16_7a);
        final EditText et14_16b = (EditText) findViewById(R.id.s16_7b);
        final EditText et15_16a = (EditText) findViewById(R.id.s16_8a);
        final EditText et16_16b = (EditText) findViewById(R.id.s16_8b);

        et1_16a.setText(prefs.getString("matches16a_1", "-1"));
        et2_16b.setText(prefs.getString("matches16b_1", "-1"));
        et3_16a.setText(prefs.getString("matches16a_2", "-1"));
        et4_16b.setText(prefs.getString("matches16b_2", "-1"));
        et5_16a.setText(prefs.getString("matches16a_3", "-1"));
        et6_16b.setText(prefs.getString("matches16b_3", "-1"));
        et7_16a.setText(prefs.getString("matches16a_4", "-1"));
        et8_16b.setText(prefs.getString("matches16b_4", "-1"));
        et9_16a.setText(prefs.getString("matches16a_5", "-1"));
        et10_16b.setText(prefs.getString("matches16b_5", "-1"));
        et11_16a.setText(prefs.getString("matches16a_6", "-1"));
        et12_16b.setText(prefs.getString("matches16b_6", "-1"));
        et13_16a.setText(prefs.getString("matches16a_7", "-1"));
        et14_16b.setText(prefs.getString("matches16b_7", "-1"));
        et15_16a.setText(prefs.getString("matches16a_8", "-1"));
        et16_16b.setText(prefs.getString("matches16b_8", "-1"));


        // 8강 대진표 등록되어 있으면 가져오기 (선수)
        TextView tv1_8 = (TextView) findViewById(R.id.tv1_8);
        TextView tv2_8 = (TextView) findViewById(R.id.tv2_8);
        TextView tv3_8 = (TextView) findViewById(R.id.tv3_8);
        TextView tv4_8 = (TextView) findViewById(R.id.tv4_8);
        TextView tv5_8 = (TextView) findViewById(R.id.tv5_8);
        TextView tv6_8 = (TextView) findViewById(R.id.tv6_8);
        TextView tv7_8 = (TextView) findViewById(R.id.tv7_8);
        TextView tv8_8 = (TextView) findViewById(R.id.tv8_8);

        tv1_8.setText(prefs.getString("tv1_8", "준비중"));
        tv2_8.setText(prefs.getString("tv2_8", "준비중"));
        tv3_8.setText(prefs.getString("tv3_8", "준비중"));
        tv4_8.setText(prefs.getString("tv4_8", "준비중"));
        tv5_8.setText(prefs.getString("tv5_8", "준비중"));
        tv6_8.setText(prefs.getString("tv6_8", "준비중"));
        tv7_8.setText(prefs.getString("tv7_8", "준비중"));
        tv8_8.setText(prefs.getString("tv8_8", "준비중"));

        // 8강 대진표 Score 가져오기
        final EditText et1_8a = (EditText) findViewById(R.id.s8_1a);
        final EditText et2_8b = (EditText) findViewById(R.id.s8_1b);
        final EditText et3_8a = (EditText) findViewById(R.id.s8_2a);
        final EditText et4_8b = (EditText) findViewById(R.id.s8_2b);
        final EditText et5_8a = (EditText) findViewById(R.id.s8_3a);
        final EditText et6_8b = (EditText) findViewById(R.id.s8_3b);
        final EditText et7_8a = (EditText) findViewById(R.id.s8_4a);
        final EditText et8_8b = (EditText) findViewById(R.id.s8_4b);

        et1_8a.setText(prefs.getString("matches8a_1", "-1"));
        et2_8b.setText(prefs.getString("matches8b_1", "-1"));
        et3_8a.setText(prefs.getString("matches8a_2", "-1"));
        et4_8b.setText(prefs.getString("matches8b_2", "-1"));
        et5_8a.setText(prefs.getString("matches8a_3", "-1"));
        et6_8b.setText(prefs.getString("matches8b_3", "-1"));
        et7_8a.setText(prefs.getString("matches8a_4", "-1"));
        et8_8b.setText(prefs.getString("matches8b_4", "-1"));

        // 4강 대진표 등록되어 있으면 가져오기 (선수)
        TextView tv1_4 = (TextView) findViewById(R.id.tv1_4);
        TextView tv2_4 = (TextView) findViewById(R.id.tv2_4);
        TextView tv3_4 = (TextView) findViewById(R.id.tv3_4);
        TextView tv4_4 = (TextView) findViewById(R.id.tv4_4);

        tv1_4.setText(prefs.getString("tv1_4", "준비중"));
        tv2_4.setText(prefs.getString("tv2_4", "준비중"));
        tv3_4.setText(prefs.getString("tv3_4", "준비중"));
        tv4_4.setText(prefs.getString("tv4_4", "준비중"));

        // 4강 대진표 Score 가져오기
        final EditText et1_4a = (EditText) findViewById(R.id.s4_1a);
        final EditText et2_4b = (EditText) findViewById(R.id.s4_1b);
        final EditText et3_4a = (EditText) findViewById(R.id.s4_2a);
        final EditText et4_4b = (EditText) findViewById(R.id.s4_2b);

        et1_4a.setText(prefs.getString("matches4a_1", "-1"));
        et2_4b.setText(prefs.getString("matches4b_1", "-1"));
        et3_4a.setText(prefs.getString("matches4a_2", "-1"));
        et4_4b.setText(prefs.getString("matches4b_2", "-1"));

        // 결승 대진표 등록되어 있으면 가져오기 (선수)
        TextView tv1_FinalA = (TextView) findViewById(R.id.tv1_FinalA);
        TextView tv2_FinalB = (TextView) findViewById(R.id.tv2_FinalB);

        tv1_FinalA.setText(prefs.getString("tv1_FinalA", "준비중"));
        tv2_FinalB.setText(prefs.getString("tv2_FinalB", "준비중"));

        // 결승 대진표 Score 가져오기
        final EditText et1_FinalA = (EditText) findViewById(R.id.sFinal_1a);
        final EditText et2_FinalB = (EditText) findViewById(R.id.sFinal_1b);

        et1_4a.setText(prefs.getString("matchesFa_1", "-1"));
        et2_4b.setText(prefs.getString("matchesFb_1", "-1"));


        // 일반 사용자 모드에서는 수정할 수 없게 끔
        // 16강 쪽
        et1_16a.setFocusable(false);
        et1_16a.setClickable(false);
        et2_16b.setFocusable(false);
        et2_16b.setClickable(false);
        et3_16a.setFocusable(false);
        et3_16a.setClickable(false);
        et4_16b.setFocusable(false);
        et4_16b.setClickable(false);
        et5_16a.setFocusable(false);
        et5_16a.setClickable(false);
        et6_16b.setFocusable(false);
        et6_16b.setClickable(false);
        et7_16a.setFocusable(false);
        et7_16a.setClickable(false);
        et8_16b.setFocusable(false);
        et8_16b.setClickable(false);
        et9_16a.setFocusable(false);
        et9_16a.setClickable(false);
        et10_16b.setFocusable(false);
        et10_16b.setClickable(false);
        et11_16a.setFocusable(false);
        et11_16a.setClickable(false);
        et12_16b.setFocusable(false);
        et12_16b.setClickable(false);
        et13_16a.setFocusable(false);
        et13_16a.setClickable(false);
        et14_16b.setFocusable(false);
        et14_16b.setClickable(false);
        et15_16a.setFocusable(false);
        et15_16a.setClickable(false);
        et16_16b.setFocusable(false);
        et16_16b.setClickable(false);

        // 8강 쪽
        et1_8a.setFocusable(false);
        et1_8a.setClickable(false);
        et2_8b.setFocusable(false);
        et2_8b.setClickable(false);
        et3_8a.setFocusable(false);
        et3_8a.setClickable(false);
        et4_8b.setFocusable(false);
        et4_8b.setClickable(false);
        et5_8a.setFocusable(false);
        et5_8a.setClickable(false);
        et6_8b.setFocusable(false);
        et6_8b.setClickable(false);
        et7_8a.setFocusable(false);
        et7_8a.setClickable(false);
        et8_8b.setFocusable(false);
        et8_8b.setClickable(false);

        // 4강 쪽
        et1_4a.setFocusable(false);
        et1_4a.setClickable(false);
        et2_4b.setFocusable(false);
        et2_4b.setClickable(false);
        et3_4a.setFocusable(false);
        et3_4a.setClickable(false);
        et4_4b.setFocusable(false);
        et4_4b.setClickable(false);

        //결승
        et1_FinalA.setFocusable(false);
        et1_FinalA.setClickable(false);
        et2_FinalB.setFocusable(false);
        et2_FinalB.setClickable(false);

    }
}
