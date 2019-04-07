package com.if9.pretest_if9_10116384_khoerulagengoktaviana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class inputdata extends AppCompatActivity {

    public static final String EXTRA_MESSAGE ="app.com.if9.pretest_if9_10116384_khoerulagengoktaviana" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputdata);
    }

    public void selanjutnya(View view){
        Intent intent = new Intent(this,hasil.class);
        //inisialisasi intent
        EditText edtnama = (EditText)findViewById(R.id.edit2);
        EditText edtumur = (EditText)findViewById(R.id.edit3);
        //inisialisasi editext
        String message = edtnama.getText().toString();


        intent.putExtra(EXTRA_MESSAGE,message);


        //dengan tipe data key value
        startActivity(intent);

    }
}
