package com.rotnocse.curehealth.healthcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.rotnocse.curehealth.R;

public class Dashboard extends AppCompatActivity implements View.OnClickListener{

    private TextView mBMITextView, mHeartRateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        mBMITextView = (TextView) findViewById(R.id.bmi_text_view);
        mBMITextView.setOnClickListener(this);

        mHeartRateTextView = (TextView) findViewById(R.id.heart_rate_text_view);
        mHeartRateTextView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bmi_text_view:
                Intent startBMIActivity = new Intent(Dashboard.this, BMIActivity.class);
                startActivity(startBMIActivity);
                break;
            case R.id.heart_rate_text_view:
                Intent startHeartRateActivity = new Intent(Dashboard.this, HeartRatesActivity.class);
                startActivity(startHeartRateActivity);
                break;
        }
    }
}