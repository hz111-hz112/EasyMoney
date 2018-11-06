package com.example.xxx.easymoney;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EasyMoney extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_money);
    }


    public void jackWelcome(View view) {
        Intent intent = new Intent(EasyMoney.this, HandsomeJack.class);
        startActivity(intent);
    }

    public void uglyBitch(View v) {

        Intent asd = new Intent(EasyMoney.this, UglyBetty.class);
        startActivity(asd);

    }


}
