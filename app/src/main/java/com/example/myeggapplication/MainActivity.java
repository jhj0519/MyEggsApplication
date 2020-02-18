package com.example.myeggapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button eggGame;
    Button cikGame;
    Button exit;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.InitializeView();
        this.SetListener();
    }

    private void SetListener() {
  /*      eggGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), EggActivity.class);
                startActivity(intent);
            }
        });
        cikGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), CikActivity.class);
                startActivity(intent);
            }
        });

   */
  //리스너 등록
        eggGame.setOnClickListener((this));
        cikGame.setOnClickListener(this);

    }



    //앱 종료//xml을 같이 이용한 액션이벤트
    public void exit(View view){
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("종료하시겠습니까");
                builder.setTitle("알림창")
                        .setCancelable(false)
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("no", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                //
                AlertDialog alert = builder.create();
                alert.setTitle("alerts 뭐지");
                alert.show();
            }
        });
    }

    private void InitializeView(){
        eggGame = (Button)findViewById(R.id.goEgg);
        cikGame = (Button)findViewById(R.id.goCik);
        exit = (Button)findViewById(R.id.exit);
    }


    @Override
    public void onClick(View v) {
        eggGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), EggActivity.class);
                startActivity(intent);
            }
        });
        cikGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), CikActivity.class);
                startActivity(intent);
            }
        });
    }
}
