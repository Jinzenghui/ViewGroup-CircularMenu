package com.example.biac.customview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.biac.customview.view.CircularMenu;

public class MainActivity extends AppCompatActivity {

    private CircularMenu wheelMenuView;
    private EditText editText1, editText2, editText3, editText4, editText5, editText6;
    private Button button;
    private PanAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wheelMenuView = (CircularMenu) findViewById(R.id.panview);
        adapter = new PanAdapter();
        wheelMenuView.setAdapter(adapter);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);
        editText6 = (EditText) findViewById(R.id.editText6);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float radius = Float.valueOf(editText1.getText().toString());
                float innerRadius = Float.valueOf(editText2.getText().toString());
                float lineWidth = Float.valueOf(editText3.getText().toString());
                float radiusLineWidth = Float.valueOf(editText4.getText().toString());
                int itemCount = Integer.valueOf(editText5.getText().toString());
                int startAngle = Integer.valueOf(editText6.getText().toString());
                wheelMenuView.setInnerRadius(innerRadius);
                wheelMenuView.setLineWidth(lineWidth);
                wheelMenuView.setItemCount(itemCount);
                wheelMenuView.setStartAngle(startAngle);
                wheelMenuView.setRadiusLineWidth(radiusLineWidth);
                wheelMenuView.setRadius(radius);
            }
        });
    }
}
