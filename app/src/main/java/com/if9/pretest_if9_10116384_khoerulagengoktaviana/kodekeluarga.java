package com.if9.pretest_if9_10116384_khoerulagengoktaviana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class kodekeluarga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kodekeluarga);
    }
    public void masuk (View view) {
        Intent intent = new Intent(kodekeluarga.this,inputdata.class );
        startActivity(intent);
    }
}
