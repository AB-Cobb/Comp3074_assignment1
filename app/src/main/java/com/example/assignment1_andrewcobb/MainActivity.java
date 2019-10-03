package com.example.assignment1_andrewcobb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/*
 ----- ----- ASSIGNMENT ONE ----- -----
 ----- -----  ANDREW COBB   ----- -----
 ----- -----   101142044    ----- -----
*/

public class MainActivity extends AppCompatActivity {
    Button btn_calc;
    EditText txt_f,txt_w,txt_v;
    TextView lbl_ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_calc = findViewById(R.id.btn_calculate);
        txt_f = findViewById(R.id.txt_f);
        txt_w = findViewById(R.id.txt_w);
        txt_v = findViewById(R.id.txt_v);
        lbl_ans = findViewById(R.id.lbl_answer);

        btn_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vw) {
                double ans, f, v, w;

                f = !txt_f.getText().toString().matches("") ? Double.parseDouble(txt_f.getText().toString()) : 0;
                v = !txt_v.getText().toString().matches("") ? Double.parseDouble(txt_v.getText().toString()) : 0;
                w = !txt_w.getText().toString().matches("") ? Double.parseDouble(txt_w.getText().toString()) : 0;
                // */
                ans = 27 *f + 58 * w + 9 * v;
                lbl_ans.setText(String.valueOf(ans));
            }
        });
    }
}
