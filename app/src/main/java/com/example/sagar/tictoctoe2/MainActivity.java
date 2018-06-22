package com.example.sagar.tictoctoe2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton ib1;
    ImageButton ib2;
    ImageButton ib3;
    ImageButton ib4;ImageButton ib5;
    ImageButton ib6;
    ImageButton ib7;
    ImageButton ib8;
    ImageButton ib9;
    public int count =-1;
    public int abc=1;
    public int[][] a=new int[3][3];
    public void OnClick(View view){
        ib1=(ImageButton)findViewById(R.id.nota0);
        ib2=(ImageButton)findViewById(R.id.nota1);
        ib3=(ImageButton)findViewById(R.id.nota2);ib9=(ImageButton)findViewById(R.id.nota8);
        ib4=(ImageButton)findViewById(R.id.nota3);
        ib5=(ImageButton)findViewById(R.id.nota4);
        ib6=(ImageButton)findViewById(R.id.nota5);
        ib7=(ImageButton)findViewById(R.id.nota6);
        ib8=(ImageButton)findViewById(R.id.nota7);
        count=count+1;

        String s=Integer.toString(count);
        Log.i("sao",s);
        if(count%2==0) {
            Toast.makeText(MainActivity.this, "player2", Toast.LENGTH_SHORT).show();
        }
        if(count%2!=0) {
            Toast.makeText(MainActivity.this, "player1", Toast.LENGTH_SHORT).show();
        }switch (view.getId()){

            case R.id.nota0:if(count%2==0) {
                ib1.setImageResource(R.drawable.play1);
                Log.i("s","OnClick: vacindi");
                a[0][0]=1;
                ib1.setEnabled(false);
                break;
            }
            else{
                ib1.setImageResource(R.drawable.play2);
                a[0][0]=2;
                Log.i("s","OnClick: vacindi");
                ib1.setEnabled(false);
                break;
            }
            case R.id.nota1:if(count%2==0) {
                ib2.setImageResource(R.drawable.play1);
                a[0][1]=1;
                ib2.setEnabled(false);
                break;
            }
            else{
                ib2.setImageResource(R.drawable.play2);
                a[0][1]=2;
                ib2.setEnabled(false);
                break;
            }
            case R.id.nota2:if(count%2==0) {
                ib3.setImageResource(R.drawable.play1);
                a[0][2]=1;
                ib3.setEnabled(false);
                break;
            }
            else{
                ib3.setImageResource(R.drawable.play2);
                a[0][2]=2;
                ib3.setEnabled(false);
                break;
            }
            case R.id.nota3:if(count%2==0) {
                ib4.setImageResource(R.drawable.play1);
                a[1][0]=1;
                ib4.setEnabled(false);
                break;
            }
            else{
                ib4.setImageResource(R.drawable.play2);
                Log.i("sao",s);
                a[1][0]=2;
                ib4.setEnabled(false);
                break;
            }
            case R.id.nota4:if(count%2==0) {

                ib5.setImageResource(R.drawable.play1);
                a[1][1]=1;
                ib5.setEnabled(false);
                break;
            }
            else{
                ib5.setImageResource(R.drawable.play2);
                a[1][1]=2;
                ib5.setEnabled(false);
                break;
            }
            case R.id.nota5:if(count%2==0) {
                ib6.setImageResource(R.drawable.play1);
                a[1][2]=1;
                ib6.setEnabled(false);
                break;
            }
            else{
                ib6.setImageResource(R.drawable.play2);
                a[1][2]=2;
                ib6.setEnabled(false);
                break;
            }
            case R.id.nota6:if(count%2==0) {
                ib7.setImageResource(R.drawable.play1);
                a[2][0]=1;
                ib7.setEnabled(false);
                break;
            }
            else{
                ib7.setImageResource(R.drawable.play2);
                a[2][0]=2;
                ib7.setEnabled(false);
                break;
            }
            case R.id.nota7:if(count%2==0) {
                ib8.setImageResource(R.drawable.play1);
                a[2][1]=1;
                ib8.setEnabled(false);
                break;
            }
            else{
                ib8.setImageResource(R.drawable.play2);
                a[2][1]=2;
                ib8.setEnabled(false);
                break;
            }
                case R.id.nota8:if(count%2==0) {
                ib9.setImageResource(R.drawable.play1);
                a[2][2]=1;
                    ib9.setEnabled(false);
                break;
            }
            else{
                ib9.setImageResource(R.drawable.play2);
                a[2][2]=2;
                    ib9.setEnabled(false);
                break;}
        }
        if(count>=4){
            if(count==8)
            {
                verify();
                if(abc==1){
                Intent i = new Intent(this, Main4Activity.class);
                startActivity(i);
            }}
            else{
            verify();
        }}

    }
    public void verify(){
        if((a[0][0]==a[0][1]&&a[0][0]==a[0][2]&&a[0][0]==1)||(a[1][0]==a[1][1]&&a[1][0]==a[1][2]&&a[1][0]==1)||(a[2][0]==a[2][1]&&a[2][0]==a[2][2]&&a[2][0]==1)||(a[0][0]==a[1][0]&&a[0][0]==a[2][0])&&a[0][0]==1||(a[0][1]==a[1][1]&&a[0][1]==a[2][1]&&a[0][1]==1)||(a[0][2]==a[1][2]&&a[0][2]==a[2][2]&&a[0][2]==1)||(a[0][0]==a[1][1]&&a[0][0]==a[2][2]&&a[0][0]==1)||(a[0][2]==a[1][1]&&a[0][2]==a[2][0]&&a[0][2]==1)){
Toast.makeText(MainActivity.this,"player 1 win",Toast.LENGTH_SHORT).show();
abc=0;

            Intent i = new Intent(this, Main2Activity.class);
            startActivity(i);
    }
    else if((a[0][0]==a[0][1]&&a[0][0]==a[0][2]&&a[0][0]==2)||(a[1][0]==a[1][1]&&a[1][0]==a[1][2]&&a[1][0]==2)||(a[2][0]==a[2][1]&&a[2][0]==a[2][2]&&a[2][0]==2)||(a[0][0]==a[1][0]&&a[0][0]==a[2][0])&&a[0][0]==2||(a[0][1]==a[1][1]&&a[0][1]==a[2][1]&&a[0][1]==2)||(a[0][2]==a[1][2]&&a[0][2]==a[2][2]&&a[0][2]==2)||(a[0][0]==a[1][1]&&a[0][0]==a[2][2]&&a[0][0]==2)||(a[0][2]==a[1][1]&&a[0][2]==a[2][0]&&a[0][2]==2)){
            Toast.makeText(MainActivity.this,"player 2 win",Toast.LENGTH_SHORT).show();
            abc=0;
            Intent i = new Intent(this, Main3Activity.class);
            startActivity(i);
        }}

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ClickableAreasImage area=new ClickableAreasImage(new PhotoViewAttacher(tictoe), this);
        //List<ClickableArea> clickableAreas = new ArrayList<>();
        //clickableAreas.add(new ClickableArea(500, 200, 125, 200);


    }
}
