package com.if9.pretest_if9_10116384_khoerulagengoktaviana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mulai (View view) {
        Intent intent = new Intent(MainActivity.this,kodekeluarga.class );
        startActivity(intent);
    }
}
