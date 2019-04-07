package com.if9.pretest_if9_10116384_khoerulagengoktaviana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class hasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        Intent intent = getIntent();
        //mengambil nilai dari intent

        String message = intent.getStringExtra(inputdata.EXTRA_MESSAGE);
        //mengambil nilai yang diteruskan dari class mainactivity

        TextView textView = (TextView)findViewById(R.id.textv10);
        //inisialisasi objek textview

        textView.setText(message);
        //menampilkan output nilai dari editext
    }
    public void keluar(View view){

    }
    }

