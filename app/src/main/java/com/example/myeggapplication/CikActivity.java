package com.example.myeggapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CikActivity extends AppCompatActivity implements View.OnClickListener {

    Button goEggBtn;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cik);

        this.SetLister();
        this.Initi();



    }

    private void SetLister(){
        goEggBtn.setOnClickListener(this);
    }
    private void Initi(){
        goEggBtn = (Button)findViewById(R.id.goCikBtn);
    }

    @Override
    public void onClick(View v) {
        goEggBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //인텐트 생성
                CikActivity.this.startActivity(intent);

                intent = new Intent(CikActivity.this, CikActivity.class);
                CikActivity.this.startActivity(intent);
            }
        });
    }


}
