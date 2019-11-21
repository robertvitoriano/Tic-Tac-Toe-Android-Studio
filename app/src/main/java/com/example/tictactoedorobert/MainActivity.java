package com.example.tictactoedorobert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    int aux = 1;
    boolean hasWinner =false;
    public void Start() {
        TextView result = (TextView) findViewById(R.id.Result);
        result.setText("       Vez do Jogador 1");


    }
    protected void onStart()
    {
        super.onStart();
        Start();

    }



    public void Player1Move() {
        TextView result = (TextView) findViewById(R.id.Result);

        this.aux = 1;
        result.setText("       Vez do Jogador 1");



    }

    public void Player2Move() {
        TextView result = (TextView) findViewById(R.id.Result);

        this.aux = 2;
        result.setText("       Vez do Jogador 2");

    }

    char Pos1;
    char Pos2;
    char Pos3;
    char Pos4;
    char Pos5;
    char Pos6;
    char Pos7;
    char Pos8;
    char Pos9;


    Random aleatorio = new Random();


    public void  pos1(View view) {


        ImageView positions[]= new ImageView[8];


        ImageView Field1 = findViewById(R.id.field1);
        if (aux == 1) {
            Field1.setImageResource(R.drawable.x);
            Player2Move();
            this.Pos1='X';
        } else if (aux == 2) {
            Field1.setImageResource(R.drawable.o);
            Player1Move();
            this.Pos1='O';




        }

        this.checkVictory();





    }

    public void pos2(View view) {


        ImageView Field2 = findViewById(R.id.field2);
        if (aux == 1) {
            Field2.setImageResource(R.drawable.x);
            Player2Move();
            this.Pos2 ='X';
        } else if (aux == 2) {
            Field2.setImageResource(R.drawable.o);
            Player1Move();
            this.Pos2 ='O';


        }
        this.checkVictory();

    }



    public void pos3(View view) {



        ImageView Field3 = findViewById(R.id.field3);
        if (aux == 1) {
            Field3.setImageResource(R.drawable.x);
            Player2Move();
            this.Pos3='X';
        } else if (aux == 2) {
            Field3.setImageResource(R.drawable.o);
            Player1Move();
            this.Pos3='O';



        }
        this.checkVictory();


    }
    public void pos4(View view) {



        ImageView Field4 = findViewById(R.id.field4);
        if (aux == 1) {
            Field4.setImageResource(R.drawable.x);
            Player2Move();
            this.Pos4 ='X';
        } else if (aux == 2) {
            Field4.setImageResource(R.drawable.o);
            Player1Move();
            this.Pos4='O';


        }
        this.checkVictory();



    }
    public void pos5(View view) {



        ImageView Field5 = findViewById(R.id.field5);
        if (aux == 1) {
            Field5.setImageResource(R.drawable.x);
            Player2Move();
            this.Pos5 = 'X';

        } else if (aux == 2) {
            Field5.setImageResource(R.drawable.o);
            Player1Move();
            this.Pos5 ='O';



        }
        this.checkVictory();



    }
    public void pos6(View view) {



        ImageView Field6 = findViewById(R.id.field6);
        if (aux == 1) {
            Field6.setImageResource(R.drawable.x);
            Player2Move();
            this.Pos6 = 'X';

        } else if (aux == 2) {
            Field6.setImageResource(R.drawable.o);
            Player1Move();
            this.Pos6 = 'O';



        }
        this.checkVictory();



    }
    public void pos7(View view) {

        ImageView Field7 = findViewById(R.id.field7);
        if (aux == 1) {
            Field7.setImageResource(R.drawable.x);
            Player2Move();
            this.Pos7 ='X';

        } else if (aux == 2) {
            Field7.setImageResource(R.drawable.o);
            Player1Move();
            this.Pos8='O';


        }
        this.checkVictory();




    }
    public void pos8(View view) {


        ImageView Field8 = findViewById(R.id.field8);
        if (aux == 1) {
            Field8.setImageResource(R.drawable.x);
            Player2Move();

        } else if (aux == 2) {
            Field8.setImageResource(R.drawable.o);
            Player1Move();



        }
        this.checkVictory();



    }

    public void pos9(View view) {


        ImageView Field9 = findViewById(R.id.field9);
        if (aux == 1) {
            Field9.setImageResource(R.drawable.x);
            Player2Move();
            this.Pos9='X';

        } else if (aux == 2) {
            Field9.setImageResource(R.drawable.o);
            Player1Move();
            this.Pos9 ='O';
        }
        this.checkVictory();

    }


    public void checkVictory(){
        TextView result = (TextView) findViewById(R.id.Result);

        if (this.Pos1 == 'X' && this.Pos5 == 'X' && this.Pos9 == 'X' ||
                this.Pos1 == 'X' && this.Pos4 == 'X' && this.Pos7 == 'X' ||
                this.Pos1 == 'X' && this.Pos2 == 'X' && this.Pos3 == 'X' ||
                this.Pos4 == 'X' && this.Pos5 == 'X' && this.Pos6 == 'X' ||
                this.Pos7 == 'X' && this.Pos8 == 'X' && this.Pos9 == 'X' ||
                this.Pos2 == 'X' && this.Pos5 == 'X' && this.Pos8 == 'X' ||
                this.Pos3 == 'X' && this.Pos6 == 'X' && this.Pos9 == 'X' ||
                this.Pos3 == 'X' && this.Pos5 == 'X' && this.Pos7 == 'X') {

            result.setText("        O jogador 1(X) Ganhou");
            hasWinner = true;
        }
        else if (this.Pos1 == 'O' && this.Pos5 == 'O' && this.Pos9 == 'O' ||
                this.Pos1 == 'O' && this.Pos4 == 'O' && this.Pos7 == 'O' ||
                this.Pos1 == 'O' && this.Pos2 == 'O' && this.Pos3 == 'O' ||
                this.Pos4 == 'O' && this.Pos5 == 'O' && this.Pos6 == 'O' ||
                this.Pos7 == 'O' && this.Pos8 == 'O' && this.Pos9 == 'O' ||
                this.Pos2 == 'O' && this.Pos5 == 'O' && this.Pos8 == 'O' ||
                this.Pos3 == 'O' && this.Pos6 == 'O' && this.Pos9 == 'O' ||
                this.Pos3 == 'O' && this.Pos5 == 'O' && this.Pos7 == 'O') {

            result.setText("       O jogador 2(O) Ganhou");
            hasWinner = true;

        }

        else if((this.Pos1 == 'O' || this.Pos1 == 'X') && (this.Pos2 == 'O' ||
                this.Pos2 == 'X') && (this.Pos3 == 'O' || this.Pos3 == 'X') &&
                (this.Pos4 == 'O' || this.Pos4 == 'X') && (this.Pos5 == 'O' ||
                this.Pos5 == 'X') && (this.Pos6 == 'O' || this.Pos6 == 'X') &&
                (this.Pos7 == 'O' || this.Pos7 == 'X') && (this.Pos8 == 'O' ||
                this.Pos8 == 'X') && (this.Pos9 == 'O' || this.Pos9 == 'X')){
            result.setText("                 Houve um empate");


        }








            if(hasWinner){
                getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                        WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);






            }



    }



    }





















