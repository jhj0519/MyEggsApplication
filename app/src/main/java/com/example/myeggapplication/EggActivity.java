package com.example.myeggapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class EggActivity extends AppCompatActivity {

    Button eggGame;
    Button cikGame;
    Button exit;
    Intent intent;

    //엑션바
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_sample,menu);
        return true;
    }
    public boolean onOptionItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.action_bar_coin:
                coinNumber();
                return  true;
            case R.id.action_bar_Egg:
                GoEggActivity();
                return  true;
            case R.id.action_bar_cik:
                GoCikActivity();
                return true;
                default:
                return super.onOptionsItemSelected(item);

        }
    }

    private void coinNumber() {
    }

    private void GoEggActivity(){

    }
    private void  GoCikActivity(){

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egg);
    }
}
