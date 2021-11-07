package com.outven.bmtchallange.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.outven.bmtchallange.R;
import com.outven.bmtchallange.helper.HidenBar;

public class AchivmentActivity extends AppCompatActivity {

    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achivment);

        btnOk = findViewById(R.id.btnOk);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToNextPage(AchivmentActivity.this);
            }
        });

        HidenBar.WindowFlag(this, getWindow());
    }

    private void moveToNextPage(Context context){
        Intent intent = new Intent(context, DashboardActivity.class);
        if (true){
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        }
        startActivity(intent);
    }
}