package com.example.myeggapplication;

//이미지 클릭 이벤트
//출처: https://bitsoul.tistory.com/49 [Happy Programmer~]

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;
//import android.support.v7.widget.Toolbar;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class EggActivity extends AppCompatActivity implements View.OnClickListener {

    //Toolbar tb;
    Button goCikBtn;
    Button coinBtn;
    //Button eggGame;
    //Button cikGame;
    //Button exit;
    Intent intent;
    private int count = 0;

    ImageView imgEgg1;
   int[] ImageId = {R.drawable.egg1,R.drawable.egg2,R.drawable.egg3,R.drawable.egg_piyac};
   ImageView iv;


   protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_egg);

       this.SetLister();
       this.Initi();
       coinBtn = (Button)findViewById(R.id.changeBtn_egg);

       imgEgg1 =  (ImageView)findViewById(R.id.img_egg1);



       iv = (ImageView)findViewById(R.id.img_egg);

       //res/drawable 폴더에 있는 이미지로 셋팅하기 //1)최초 이미지 등록
       iv.setImageResource(R.drawable.egg1);

       iv.setOnClickListener(new MyListener());

   } //end onCreate

   class MyListener implements View.OnClickListener {
       //2) ImageView.setOnClickListener (View.OnClickListener l) 로 리스너 등록
       int i = 0;
       int lenth = ImageId.length;
       final TextView tv = (TextView)findViewById(R.id.egg_count);

       public void onClick(View v){
           iv.setImageResource(ImageId[i]);//몫만 남기기로 1~5까지는 egg1, 6~10까지는 egg2..
           tv.setText("계란 클릭 횟수:"+count);
           i+=1;
           count+=1;
           if(i == ImageId.length) i = 0;
       } // end onClick
   }// end MyListener()
    //엑션바
//    public boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.menu_sample,menu);
//        return true;
//    }
//    //툴바
//    Toolbar tb = (Toolbar) findViewById(R.id.app_toolbar);
//    setSupportActionBar(tb);
//    public boolean onOptionItemSelected(MenuItem item){
//        switch (item.getItemId()){
//            case R.id.action_bar_coin:
//                coinNumber();
//                return  true;
//            case R.id.action_bar_Egg:
//                GoEggActivity();
//                return  true;
//            case R.id.action_bar_cik:
//                GoCikActivity();
//                return true;
//                default:
//                return super.onOptionsItemSelected(item);
//
//        }
//    }
////  setsupportAaction
//    //Toolbar에 대한 참조 획득하기
//    ActionBar ab= getSupportActionBar();
//    protected void onCreate(Bundle savedIntanceState) {
//
//        super.onCreate(savedIntanceState);
//        tb = findViewById(R.id.app_toolbar);
//        tb.setTitle(R.string.egg_play);
//        setSupportActionBar(tb);
//    }


    private void SetLister(){
        goCikBtn.setOnClickListener(this);
    }
    private void Initi(){
        goCikBtn = (Button)findViewById(R.id.goCikBtn);
    }

    @Override
    public void onClick(View v) {
        goCikBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //인텐트 생성
                intent = new Intent(EggActivity.this, CikActivity.class);
                EggActivity.this.startActivity(intent);
            }
        });

    }

}