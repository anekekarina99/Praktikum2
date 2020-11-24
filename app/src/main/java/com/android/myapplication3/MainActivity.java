package com.android.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements onClick {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity=findViewById(R.id.btn_move_activity);
        Button btnMoveActivityData=findViewById(R.id.btn_move_activity_data);
        Button btnDialPhone=findViewById(R.id.btn_dial_number);

    }


    public void OnClick(View v) {
        switch (v.getId()) {
            case R.id.btn_move_activity:
                Intent moveIntent=new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;

            case R.id.btn_move_activity_data:
                Intent moveWithDataInt=new Intent(MainActivity.this, MoveActivityData.class);
                moveWithDataInt.putExtra(MoveActivityData.EXTRA_NAME, "Praktikum PBP Go Brrrrr");
                moveWithDataInt.putExtra(MoveActivityData.EXTRA_AGE, 5);
                startActivity(moveWithDataInt);
                break;

            case R.id.btn_dial_number:
                String phoneNumber="081210841382";
                Intent dialPhoneIntent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(dialPhoneIntent);
        }
        System.out.println("Error");
    }

}