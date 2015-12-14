package ts.team.tennissupporter;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MatchesAdminActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matches);

        final SharedPreferences prefs = getSharedPreferences("person", MODE_PRIVATE);
        final SharedPreferences.Editor ed = prefs.edit();
        final String getCheck = prefs.getString("person0", "check");
        final String check = "check";


        Button finish = (Button) findViewById(R.id.btn_FINISH);
        final String person[] = new String[16];     // 16강 멤버
        final String person_8[] = new String[8];    // 8강 멤버
        final String person_4[] = new String[4];    // 4강 멤버
        final String person_f[] = new String[2];    // 결승 멤버


        // EditText 지정
        final EditText et1 = (EditText) findViewById(R.id.et1);
        final EditText et2 = (EditText) findViewById(R.id.et2);
        final EditText et3 = (EditText) findViewById(R.id.et3);
        final EditText et4 = (EditText) findViewById(R.id.et4);
        final EditText et5 = (EditText) findViewById(R.id.et5);
        final EditText et6 = (EditText) findViewById(R.id.et6);
        final EditText et7 = (EditText) findViewById(R.id.et7);
        final EditText et8 = (EditText) findViewById(R.id.et8);
        final EditText et9 = (EditText) findViewById(R.id.et9);
        final EditText et10 = (EditText) findViewById(R.id.et10);
        final EditText et11 = (EditText) findViewById(R.id.et11);
        final EditText et12 = (EditText) findViewById(R.id.et12);
        final EditText et13 = (EditText) findViewById(R.id.et13);
        final EditText et14 = (EditText) findViewById(R.id.et14);
        final EditText et15 = (EditText) findViewById(R.id.et15);
        final EditText et16 = (EditText) findViewById(R.id.et16);

        // 선수입력 완료 시 Finish 버튼 누르기
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_matches16);

                final LinearLayout matches8 = (LinearLayout) findViewById(R.id.matches8);
                final LinearLayout matches4 = (LinearLayout) findViewById(R.id.matches4);
                final LinearLayout matchesFinal = (LinearLayout) findViewById(R.id.matchesFinal);
                matches8.setVisibility(View.GONE);
                matches4.setVisibility(View.GONE);
                matchesFinal.setVisibility(View.GONE);



                // String person Array에 선수이름 저장하기
                if(getCheck == check) {

                    person[0] = et1.getText().toString();
                    ed.putString("person0", person[0]);
                    person[1] = et2.getText().toString();
                    ed.putString("person1", person[1]);
                    person[2] = et3.getText().toString();
                    ed.putString("person2", person[2]);
                    person[3] = et4.getText().toString();
                    ed.putString("person3", person[3]);
                    person[4] = et5.getText().toString();
                    ed.putString("person4", person[4]);
                    person[5] = et6.getText().toString();
                    ed.putString("person5", person[5]);
                    person[6] = et7.getText().toString();
                    ed.putString("person6", person[6]);
                    person[7] = et8.getText().toString();
                    ed.putString("person7", person[7]);
                    person[8] = et9.getText().toString();
                    ed.putString("person8", person[8]);
                    person[9] = et10.getText().toString();
                    ed.putString("person9", person[9]);
                    person[10] = et11.getText().toString();
                    ed.putString("person10", person[10]);
                    person[11] = et12.getText().toString();
                    ed.putString("person11", person[11]);
                    person[12] = et13.getText().toString();
                    ed.putString("person12", person[12]);
                    person[13] = et14.getText().toString();
                    ed.putString("person13", person[13]);
                    person[14] = et15.getText().toString();
                    ed.putString("person14", person[14]);
                    person[15] = et16.getText().toString();
                    ed.putString("person15", person[15]);

                    ed.commit();
                } else {
                    person[0] = prefs.getString("person0", "준비중");
                    person[1] = prefs.getString("person1", "준비중");
                    person[2] = prefs.getString("person2", "준비중");
                    person[3] = prefs.getString("person3", "준비중");
                    person[4] = prefs.getString("person4", "준비중");
                    person[5] = prefs.getString("person5", "준비중");
                    person[6] = prefs.getString("person6", "준비중");
                    person[7] = prefs.getString("person7", "준비중");
                    person[8] = prefs.getString("person8", "준비중");
                    person[9] = prefs.getString("person9", "준비중");
                    person[10] = prefs.getString("person10", "준비중");
                    person[11] = prefs.getString("person11", "준비중");
                    person[12] = prefs.getString("person12", "준비중");
                    person[13] = prefs.getString("person13", "준비중");
                    person[14] = prefs.getString("person14", "준비중");
                    person[15] = prefs.getString("person15", "준비중");
                }

                // 16강 대진표 입력
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

                ed.commit();

                Button next8 = (Button) findViewById(R.id.next8);

                // 버튼 누르면 8강으로 이동 하게
                next8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // 버튼 누른 후 matches8 보이게 하기
                        matches8.setVisibility(View.VISIBLE);

                        int[] matches16 = new int[16];
                        int getMatches16a_1 = Integer.parseInt(prefs.getString("matches16a_1", "100"));;

                        // 16강 Score 변수
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

                        if ( getMatches16a_1 == 100 ) {
                            // 16강 Score 받아오기
                            matches16[0] = Integer.parseInt(et1_16a.getText().toString());
                            matches16[1] = Integer.parseInt(et2_16b.getText().toString());
                            matches16[2] = Integer.parseInt(et3_16a.getText().toString());
                            matches16[3] = Integer.parseInt(et4_16b.getText().toString());
                            matches16[4] = Integer.parseInt(et5_16a.getText().toString());
                            matches16[5] = Integer.parseInt(et6_16b.getText().toString());
                            matches16[6] = Integer.parseInt(et7_16a.getText().toString());
                            matches16[7] = Integer.parseInt(et8_16b.getText().toString());
                            matches16[8] = Integer.parseInt(et9_16a.getText().toString());
                            matches16[9] = Integer.parseInt(et10_16b.getText().toString());
                            matches16[10] = Integer.parseInt(et11_16a.getText().toString());
                            matches16[11] = Integer.parseInt(et12_16b.getText().toString());
                            matches16[12] = Integer.parseInt(et13_16a.getText().toString());
                            matches16[13] = Integer.parseInt(et14_16b.getText().toString());
                            matches16[14] = Integer.parseInt(et15_16a.getText().toString());
                            matches16[15] = Integer.parseInt(et16_16b.getText().toString());

                            // Shared Preferences에 저장
                            ed.putString("matches16a_1", et1_16a.getText().toString());
                            ed.putString("matches16b_1", et2_16b.getText().toString());
                            ed.putString("matches16a_2", et3_16a.getText().toString());
                            ed.putString("matches16b_2", et4_16b.getText().toString());
                            ed.putString("matches16a_3", et5_16a.getText().toString());
                            ed.putString("matches16b_3", et6_16b.getText().toString());
                            ed.putString("matches16a_4", et7_16a.getText().toString());
                            ed.putString("matches16b_4", et8_16b.getText().toString());
                            ed.putString("matches16a_5", et9_16a.getText().toString());
                            ed.putString("matches16b_5", et10_16b.getText().toString());
                            ed.putString("matches16a_6", et11_16a.getText().toString());
                            ed.putString("matches16b_6", et12_16b.getText().toString());
                            ed.putString("matches16a_7", et13_16a.getText().toString());
                            ed.putString("matches16b_7", et14_16b.getText().toString());
                            ed.putString("matches16a_8", et15_16a.getText().toString());
                            ed.putString("matches16b_8", et16_16b.getText().toString());

                            ed.commit();

                        } else {
                            matches16[0] = Integer.parseInt(prefs.getString("matches16a_1", "0"));
                            matches16[1] = Integer.parseInt(prefs.getString("matches16b_1", "0"));
                            matches16[2] = Integer.parseInt(prefs.getString("matches16a_2", "0"));
                            matches16[3] = Integer.parseInt(prefs.getString("matches16b_2", "0"));
                            matches16[4] = Integer.parseInt(prefs.getString("matches16a_3", "0"));
                            matches16[5] = Integer.parseInt(prefs.getString("matches16b_3", "0"));
                            matches16[6] = Integer.parseInt(prefs.getString("matches16a_4", "0"));
                            matches16[7] = Integer.parseInt(prefs.getString("matches16b_4", "0"));
                            matches16[8] = Integer.parseInt(prefs.getString("matches16a_5", "0"));
                            matches16[9] = Integer.parseInt(prefs.getString("matches16b_5", "0"));
                            matches16[10] = Integer.parseInt(prefs.getString("matches16a_6", "0"));
                            matches16[11] = Integer.parseInt(prefs.getString("matches16b_6", "0"));
                            matches16[12] = Integer.parseInt(prefs.getString("matches16a_7", "0"));
                            matches16[13] = Integer.parseInt(prefs.getString("matches16b_7", "0"));
                            matches16[14] = Integer.parseInt(prefs.getString("matches16a_8", "0"));
                            matches16[15] = Integer.parseInt(prefs.getString("matches16b_8", "0"));

                            et1_16a.setText(prefs.getString("matches16a_1", "0"));
                            et2_16b.setText(prefs.getString("matches16b_1", "0"));
                            et3_16a.setText(prefs.getString("matches16a_2", "0"));
                            et4_16b.setText(prefs.getString("matches16b_2", "0"));
                            et5_16a.setText(prefs.getString("matches16a_3", "0"));
                            et6_16b.setText(prefs.getString("matches16b_3", "0"));
                            et7_16a.setText(prefs.getString("matches16a_4", "0"));
                            et8_16b.setText(prefs.getString("matches16b_4", "0"));
                            et9_16a.setText(prefs.getString("matches16a_5", "0"));
                            et10_16b.setText(prefs.getString("matches16b_5", "0"));
                            et11_16a.setText(prefs.getString("matches16a_6", "0"));
                            et12_16b.setText(prefs.getString("matches16b_6", "0"));
                            et13_16a.setText(prefs.getString("matches16a_7", "0"));
                            et14_16b.setText(prefs.getString("matches16b_7", "0"));
                            et15_16a.setText(prefs.getString("matches16a_8", "0"));
                            et16_16b.setText(prefs.getString("matches16b_8", "0"));

                        }

                        TextView tv1_8 = (TextView) findViewById(R.id.tv1_8);
                        TextView tv2_8 = (TextView) findViewById(R.id.tv2_8);
                        TextView tv3_8 = (TextView) findViewById(R.id.tv3_8);
                        TextView tv4_8 = (TextView) findViewById(R.id.tv4_8);
                        TextView tv5_8 = (TextView) findViewById(R.id.tv5_8);
                        TextView tv6_8 = (TextView) findViewById(R.id.tv6_8);
                        TextView tv7_8 = (TextView) findViewById(R.id.tv7_8);
                        TextView tv8_8 = (TextView) findViewById(R.id.tv8_8);


                        // 1번 씨드
                        if (matches16[0] > matches16[1]) {
                            tv1_8.setText(person[0]);
                            person_8[0] = person[1];
                        }
                        else {
                            tv1_8.setText(person[1]);
                            person_8[0] = person[1];
                        }
                        ed.putString("tv1_8", person_8[0]);

                        // 2번 씨드
                        if (matches16[2] > matches16[3]) {
                            tv2_8.setText(person[2]);
                            person_8[1] = person[2];
                        } else {
                            tv2_8.setText(person[3]);
                            person_8[1] = person[3];
                        }
                        ed.putString("tv2_8", person_8[1]);

                        // 3번 씨드
                        if (matches16[4] > matches16[5]) {
                            tv3_8.setText(person[4]);
                            person_8[2] = person[4];
                        } else {
                            tv3_8.setText(person[5]);
                            person_8[2] = person[5];
                        }
                        ed.putString("tv3_8", person_8[2]);

                        // 4번 씨드
                        if (matches16[6] > matches16[7]) {
                            tv4_8.setText(person[6]);
                            person_8[3] = person[6];
                        } else {
                            tv4_8.setText(person[7]);
                            person_8[3] = person[7];
                        }
                        ed.putString("tv4_8", person_8[3]);

                        // 5번 씨드
                        if (matches16[8] > matches16[9]) {
                            tv5_8.setText(person[8]);
                            person_8[4] = person[8];
                        } else {
                            tv5_8.setText(person[9]);
                            person_8[4] = person[9];
                        }
                        ed.putString("tv5_8", person_8[4]);

                        // 6번 씨드
                        if (matches16[10] > matches16[11]) {
                            tv6_8.setText(person[10]);
                            person_8[5] = person[10];
                        } else {
                            tv6_8.setText(person[11]);
                            person_8[5] = person[11];
                        }
                        ed.putString("tv6_8", person_8[5]);

                        // 7번 씨드
                        if (matches16[12] > matches16[13]) {
                            tv7_8.setText(person[12]);
                            person_8[6] = person[12];
                        } else {
                            tv7_8.setText(person[13]);
                            person_8[6] = person[13];
                        }
                        ed.putString("tv7_8", person_8[6]);

                        // 8번 씨드
                        if (matches16[14] > matches16[15]) {
                            tv8_8.setText(person[14]);
                            person_8[7] = person[14];
                        } else {
                            tv8_8.setText(person[15]);
                            person_8[7] = person[15];
                        }
                        ed.putString("tv8_8", person_8[7]);

                        ed.commit();

                        // 버튼 누르면 4강으로 이동 하게
                        Button next4 = (Button) findViewById(R.id.next4);

                        next4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                matches4.setVisibility(View.VISIBLE);

                                // 8강 Score 변수
                                final EditText et1_8a = (EditText) findViewById(R.id.s8_1a);
                                final EditText et2_8b = (EditText) findViewById(R.id.s8_1b);
                                final EditText et3_8a = (EditText) findViewById(R.id.s8_2a);
                                final EditText et4_8b = (EditText) findViewById(R.id.s8_2b);
                                final EditText et5_8a = (EditText) findViewById(R.id.s8_3a);
                                final EditText et6_8b = (EditText) findViewById(R.id.s8_3b);
                                final EditText et7_8a = (EditText) findViewById(R.id.s8_4a);
                                final EditText et8_8b = (EditText) findViewById(R.id.s8_4b);

                                int[] matches8 = new int[8];
                                int getMatches8a_1 = Integer.parseInt(prefs.getString("matches8a_1", "100"));

                                if ( getMatches8a_1 == 100 ) {
                                    // 8강 Score 받아오기
                                    matches8[0] = Integer.parseInt(et1_8a.getText().toString());
                                    matches8[1] = Integer.parseInt(et2_8b.getText().toString());
                                    matches8[2] = Integer.parseInt(et3_8a.getText().toString());
                                    matches8[3] = Integer.parseInt(et4_8b.getText().toString());
                                    matches8[4] = Integer.parseInt(et5_8a.getText().toString());
                                    matches8[5] = Integer.parseInt(et6_8b.getText().toString());
                                    matches8[6] = Integer.parseInt(et7_8a.getText().toString());
                                    matches8[7] = Integer.parseInt(et8_8b.getText().toString());

                                    // Shared Preferences에 저장
                                    ed.putString("matches8a_1", et1_8a.getText().toString());
                                    ed.putString("matches8b_1", et2_8b.getText().toString());
                                    ed.putString("matches8a_2", et3_8a.getText().toString());
                                    ed.putString("matches8b_2", et4_8b.getText().toString());
                                    ed.putString("matches8a_3", et5_8a.getText().toString());
                                    ed.putString("matches8b_3", et6_8b.getText().toString());
                                    ed.putString("matches8a_4", et7_8a.getText().toString());
                                    ed.putString("matches8b_4", et8_8b.getText().toString());

                                    ed.commit();
                                } else {
                                    matches8[0] = Integer.parseInt(prefs.getString("matches8a_1", "0"));
                                    matches8[1] = Integer.parseInt(prefs.getString("matches8b_1", "0"));
                                    matches8[2] = Integer.parseInt(prefs.getString("matches8a_2", "0"));
                                    matches8[3] = Integer.parseInt(prefs.getString("matches8b_2", "0"));
                                    matches8[4] = Integer.parseInt(prefs.getString("matches8a_3", "0"));
                                    matches8[5] = Integer.parseInt(prefs.getString("matches8b_3", "0"));
                                    matches8[6] = Integer.parseInt(prefs.getString("matches8a_4", "0"));
                                    matches8[7] = Integer.parseInt(prefs.getString("matches8b_4", "0"));

                                    et1_8a.setText(prefs.getString("matches8a_1", "0"));
                                    et2_8b.setText(prefs.getString("matches8b_1", "0"));
                                    et3_8a.setText(prefs.getString("matches8a_2", "0"));
                                    et4_8b.setText(prefs.getString("matches8b_2", "0"));
                                    et5_8a.setText(prefs.getString("matches8a_3", "0"));
                                    et6_8b.setText(prefs.getString("matches8b_3", "0"));
                                    et7_8a.setText(prefs.getString("matches8a_4", "0"));
                                    et8_8b.setText(prefs.getString("matches8b_4", "0"));
                                }

                                TextView tv1_4 = (TextView) findViewById(R.id.tv1_4);
                                TextView tv2_4 = (TextView) findViewById(R.id.tv2_4);
                                TextView tv3_4 = (TextView) findViewById(R.id.tv3_4);
                                TextView tv4_4 = (TextView) findViewById(R.id.tv4_4);

                                // 1번 씨드
                                if (matches8[0] > matches8[1]) {
                                    tv1_4.setText(person_8[0]);
                                    person_4[0] = person_8[0];
                                }
                                else {
                                    tv1_4.setText(person_8[1]);
                                    person_4[0] = person_8[1];
                                }
                                ed.putString("tv1_4", person_4[0]);

                                // 2번 씨드
                                if (matches8[2] > matches8[3]) {
                                    tv2_4.setText(person_8[2]);
                                    person_4[1] = person_8[2];
                                } else {
                                    tv2_4.setText(person_8[3]);
                                    person_4[1] = person_8[3];
                                }
                                ed.putString("tv2_4", person_4[1]);

                                // 3번 씨드
                                if (matches8[4] > matches8[5]) {
                                    tv3_4.setText(person_8[4]);
                                    person_4[2] = person_8[4];
                                } else {
                                    tv3_4.setText(person_8[5]);
                                    person_4[2] = person_8[5];
                                }
                                ed.putString("tv3_4", person_4[2]);

                                // 4번 씨드
                                if (matches8[6] > matches8[7]) {
                                    tv4_4.setText(person_8[6]);
                                    person_4[3] = person_8[6];
                                } else {
                                    tv4_4.setText(person_8[7]);
                                    person_4[3] = person_8[7];
                                }
                                ed.putString("tv4_4", person_4[3]);

                                ed.commit();

                                // 결승

                                // 버튼 누르면 결승으로 이동 하게
                                Button nextFinal = (Button) findViewById(R.id.nextFinal);

                                nextFinal.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        matchesFinal.setVisibility(View.VISIBLE);

                                        // 4강 Score 변수
                                        final EditText et1_4a = (EditText) findViewById(R.id.s4_1a);
                                        final EditText et2_4b = (EditText) findViewById(R.id.s4_1b);
                                        final EditText et3_4a = (EditText) findViewById(R.id.s4_2a);
                                        final EditText et4_4b = (EditText) findViewById(R.id.s4_2b);

                                        int[] matches4 = new int[4];
                                        int getMatches4a_1 = Integer.parseInt(prefs.getString("matches4a_1", "100"));

                                        if ( getMatches4a_1 == 100 ) {
                                            // 4강 Score 받아오기
                                            matches4[0] = Integer.parseInt(et1_4a.getText().toString());
                                            matches4[1] = Integer.parseInt(et2_4b.getText().toString());
                                            matches4[2] = Integer.parseInt(et3_4a.getText().toString());
                                            matches4[3] = Integer.parseInt(et4_4b.getText().toString());

                                            // Shared Preferences에 저장
                                            ed.putString("matches4a_1", et1_4a.getText().toString());
                                            ed.putString("matches4b_1", et2_4b.getText().toString());
                                            ed.putString("matches4a_2", et3_4a.getText().toString());
                                            ed.putString("matches4b_2", et4_4b.getText().toString());

                                            ed.commit();
                                        } else {
                                            matches4[0] = Integer.parseInt(prefs.getString("matches4a_1", "0"));
                                            matches4[1] = Integer.parseInt(prefs.getString("matches4b_1", "0"));
                                            matches4[2] = Integer.parseInt(prefs.getString("matches4a_2", "0"));
                                            matches4[3] = Integer.parseInt(prefs.getString("matches4b_2", "0"));

                                            et1_4a.setText(prefs.getString("matches4a_1", "0"));
                                            et2_4b.setText(prefs.getString("matches4b_1", "0"));
                                            et3_4a.setText(prefs.getString("matches4a_2", "0"));
                                            et4_4b.setText(prefs.getString("matches4b_2", "0"));
                                        }

                                        TextView tv1_FinalA = (TextView) findViewById(R.id.tv1_FinalA);
                                        TextView tv2_FinalB = (TextView) findViewById(R.id.tv2_FinalB);

                                        // 4강 Score 변수
                                        final EditText sFinal_1a = (EditText) findViewById(R.id.sFinal_1a);
                                        final EditText sFinal_1b = (EditText) findViewById(R.id.sFinal_1b);

                                        // 1번 씨드
                                        if (matches4[0] > matches4[1]) {
                                            tv1_FinalA.setText(person_4[0]);
                                            person_f[0] = person_4[1];
                                        }
                                        else {
                                            tv1_FinalA.setText(person_4[1]);
                                            person_f[0] = person_4[1];
                                        }
                                        ed.putString("tv1_FinalA", person_4[0]);

                                        // 2번 씨드
                                        if (matches4[2] > matches4[3]) {
                                            tv2_FinalB.setText(person_4[2]);
                                            person_f[1] = person_4[2];
                                        } else {
                                            tv2_FinalB.setText(person_4[3]);
                                            person_f[1] = person_4[3];
                                        }
                                        ed.putString("tv2_FinalB", person_4[1]);

                                        ed.commit();

                                        Button nextFinish = (Button) findViewById(R.id.nextFinish);
                                        nextFinish.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                // Shared Preferences에 저장
                                                ed.putString("matchesFa_1",sFinal_1a.getText().toString());
                                                ed.putString("matchesFb_1",sFinal_1b.getText().toString());

                                                ed.commit();
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }
}

