package com.example.franq.happyhouse;


import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.ArrayMap;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;


public class MemoryActivity extends Activity {

    private int amountClicked=0;
    private Map<Button,Boolean> btnBooleanMap = new HashMap<>();
    private Map<Button,String> btnMap = new HashMap<>();
    private Map<String,Integer> drawableAmountMap = new HashMap<>();
    private Map<String,Drawable> drawableStringMap = new HashMap<>();
    private Button lastClicked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.memory);
        //btnBooleanMap implementation

        btnBooleanMap.put((Button) findViewById(R.id.btnMemory1),false);
        btnBooleanMap.put((Button) findViewById(R.id.btnMemory2),false);
        btnBooleanMap.put((Button) findViewById(R.id.btnMemory3),false);
        btnBooleanMap.put((Button) findViewById(R.id.btnMemory4),false);
        btnBooleanMap.put((Button) findViewById(R.id.btnMemory5),false);
        btnBooleanMap.put((Button) findViewById(R.id.btnMemory6),false);
        btnBooleanMap.put((Button) findViewById(R.id.btnMemory7),false);
        btnBooleanMap.put((Button) findViewById(R.id.btnMemory8),false);
        btnBooleanMap.put((Button) findViewById(R.id.btnMemory9),false);
        btnBooleanMap.put((Button) findViewById(R.id.btnMemory10),false);
        btnBooleanMap.put((Button) findViewById(R.id.btnMemory11),false);
        btnBooleanMap.put((Button) findViewById(R.id.btnMemory12),false);
        //drawableAmountMap implementation
        drawableAmountMap.put("LION",0);
        drawableAmountMap.put("CAT",0);
        drawableAmountMap.put("DOG",0);
        drawableAmountMap.put("SNAKE",0);
        drawableAmountMap.put("GOAT",0);
        drawableAmountMap.put("MONKEY",0);

        //drawableStringMap implementation

        drawableStringMap.put("LION",getDrawable(R.drawable.lion));
        drawableStringMap.put("CAT",getDrawable(R.drawable.cat));
        drawableStringMap.put("DOG",getDrawable(R.drawable.dog));
        drawableStringMap.put("SNAKE",getDrawable(R.drawable.snake));
        drawableStringMap.put("GOAT",getDrawable(R.drawable.goat));
        drawableStringMap.put("MONKEY",getDrawable(R.drawable.monkey));

        //btnMap implementation


        Button btn1 = (Button) findViewById(R.id.btnMemory1);
        btnDrawableRandomizer(btn1);
        Button btn2 = (Button) findViewById(R.id.btnMemory2);
        btnDrawableRandomizer(btn2);
        Button btn3 = (Button) findViewById(R.id.btnMemory3);
        btnDrawableRandomizer(btn3);
        Button btn4 = (Button) findViewById(R.id.btnMemory4);
        btnDrawableRandomizer(btn4);
        Button btn5 = (Button) findViewById(R.id.btnMemory5);
        btnDrawableRandomizer(btn5);
        Button btn6 = (Button) findViewById(R.id.btnMemory6);
        btnDrawableRandomizer(btn6);
        Button btn7 = (Button) findViewById(R.id.btnMemory7);
        btnDrawableRandomizer(btn7);
        Button btn8 = (Button) findViewById(R.id.btnMemory8);
        btnDrawableRandomizer(btn8);
        Button btn9 = (Button) findViewById(R.id.btnMemory9);
        btnDrawableRandomizer(btn9);
        Button btn10 = (Button) findViewById(R.id.btnMemory10);
        btnDrawableRandomizer(btn10);
        Button btn11 = (Button) findViewById(R.id.btnMemory11);
        btnDrawableRandomizer(btn11);
        Button btn12 = (Button) findViewById(R.id.btnMemory12);
        btnDrawableRandomizer(btn12);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn = (Button) findViewById(R.id.btnMemory1);


                if(btn.getBackground() != getDrawable(R.drawable.house)){
                    if(amountClicked < 2 ) {

                        btn.setBackground(drawableStringMap.get(btnMap.get(btn)));

                      amountClicked++;
                    }
                   /* else if(view.){

                    }*/
                    if(amountClicked == 2){
                        resetAllNotCorrectImages(btn,lastClicked);
                        amountClicked = 0;}
                }
                lastClicked = btn;

            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn = (Button) findViewById(R.id.btnMemory2);


                if(btn.getBackground() != getDrawable(R.drawable.house)){
                    if(amountClicked < 2 ) {

                        btn.setBackground(drawableStringMap.get(btnMap.get(btn)));

                        amountClicked++;
                    }
                   /* else if(view.){

                    }*/
                    if(amountClicked == 2){
                        resetAllNotCorrectImages(btn,lastClicked);
                        amountClicked = 0;}
                }
                lastClicked = btn;

            }

        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn = (Button) findViewById(R.id.btnMemory3);


                if(btn.getBackground() != getDrawable(R.drawable.house)){
                    if(amountClicked < 2 ) {

                        btn.setBackground(drawableStringMap.get(btnMap.get(btn)));

                        amountClicked++;
                    }
                   /* else if(view.){

                    }*/
                    if(amountClicked == 2){
                        resetAllNotCorrectImages(btn,lastClicked);
                        amountClicked = 0;}
                }
                lastClicked = btn;

            }

        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn = (Button) findViewById(R.id.btnMemory4);


                if(btn.getBackground() != getDrawable(R.drawable.house)){
                    if(amountClicked < 2 ) {

                        btn.setBackground(drawableStringMap.get(btnMap.get(btn)));

                        amountClicked++;
                    }
                   /* else if(view.){

                    }*/
                    if(amountClicked == 2){
                        resetAllNotCorrectImages(btn,lastClicked);
                        amountClicked = 0;}
                }
                lastClicked = btn;

            }

        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn = (Button) findViewById(R.id.btnMemory5);


                if(btn.getBackground() != getDrawable(R.drawable.house)){
                    if(amountClicked < 2 ) {

                        btn.setBackground(drawableStringMap.get(btnMap.get(btn)));

                        amountClicked++;
                    }
                   /* else if(view.){

                    }*/
                    if(amountClicked == 2){
                        resetAllNotCorrectImages(btn,lastClicked);
                        amountClicked = 0;}
                }
                lastClicked = btn;

            }

        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn = (Button) findViewById(R.id.btnMemory6);


                if(btn.getBackground() != getDrawable(R.drawable.house)){
                    if(amountClicked < 2 ) {

                        btn.setBackground(drawableStringMap.get(btnMap.get(btn)));

                        amountClicked++;
                    }
                   /* else if(view.){

                    }*/
                    if(amountClicked == 2){
                        resetAllNotCorrectImages(btn,lastClicked);
                        amountClicked = 0;}
                }
                lastClicked = btn;

            }

        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn = (Button) findViewById(R.id.btnMemory7);


                if(btn.getBackground() != getDrawable(R.drawable.house)){
                    if(amountClicked < 2 ) {

                        btn.setBackground(drawableStringMap.get(btnMap.get(btn)));

                        amountClicked++;
                    }
                   /* else if(view.){

                    }*/
                    if(amountClicked == 2){
                        resetAllNotCorrectImages(btn,lastClicked);
                        amountClicked = 0;}
                }
                lastClicked = btn;

            }

        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn = (Button) findViewById(R.id.btnMemory8);

                if(btn.getBackground() != getDrawable(R.drawable.house)){
                    if(amountClicked < 2 ) {

                        btn.setBackground(drawableStringMap.get(btnMap.get(btn)));

                        amountClicked++;
                    }
                   /* else if(view.){

                    }*/
                    if(amountClicked == 2){
                        resetAllNotCorrectImages(btn,lastClicked);
                        amountClicked = 0;}
                }
                lastClicked = btn;

            }

        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn = (Button) findViewById(R.id.btnMemory9);

                if(btn.getBackground() != getDrawable(R.drawable.house)){
                    if(amountClicked < 2 ) {

                        btn.setBackground(drawableStringMap.get(btnMap.get(btn)));

                        amountClicked++;
                    }
                   /* else if(view.){

                    }*/
                    if(amountClicked == 2){
                        resetAllNotCorrectImages(btn,lastClicked);
                        amountClicked = 0;}
                }
                lastClicked = btn;

            }

        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn = (Button) findViewById(R.id.btnMemory10);


                if(btn.getBackground() != getDrawable(R.drawable.house)){
                    if(amountClicked < 2 ) {

                        btn.setBackground(drawableStringMap.get(btnMap.get(btn)));

                        amountClicked++;
                    }
                   /* else if(view.){

                    }*/
                    if(amountClicked == 2){
                        resetAllNotCorrectImages(btn,lastClicked);
                        amountClicked = 0;}
                }
                lastClicked = btn;

            }

        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button btn = (Button) findViewById(R.id.btnMemory11);
                if(btn.getBackground() != getDrawable(R.drawable.house)){
                    if(amountClicked < 2 ) {

                        btn.setBackground(drawableStringMap.get(btnMap.get(btn)));

                        amountClicked++;
                    }
                   /* else if(view.){

                    }*/
                    if(amountClicked == 2){
                        resetAllNotCorrectImages(btn,lastClicked);
                        amountClicked = 0;}
                }
                lastClicked = btn;

            }

        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn = (Button) findViewById(R.id.btnMemory12);



                if(btn.getBackground() != getDrawable(R.drawable.house)){
                    if(amountClicked < 2 ) {

                        btn.setBackground(drawableStringMap.get(btnMap.get(btn)));

                        amountClicked++;
                    }
                   /* else if(view.){

                    }*/
                    if(amountClicked == 2){
                        resetAllNotCorrectImages(btn,lastClicked);
                        amountClicked = 0;}
                }
                lastClicked = btn;

            }

        });


    }


    private void btnDrawableRandomizer(Button btn){
        Map<Integer,String> drawableRandomMap = new HashMap<>();
        Boolean changed = false;
        while(!changed) {
            drawableRandomMap.put(0, "LION");
            drawableRandomMap.put(1, "CAT");
            drawableRandomMap.put(2, "DOG");
            drawableRandomMap.put(3, "SNAKE");
            drawableRandomMap.put(4, "GOAT");
            drawableRandomMap.put(5, "MONKEY");
            int randomNum = ThreadLocalRandom.current().nextInt(0, 6);

            int currentDrawableAmountMapInt = drawableAmountMap.get(drawableRandomMap.get(randomNum));
            String currentAnimal = drawableRandomMap.get(randomNum);
            if (currentDrawableAmountMapInt < 2) {
                drawableAmountMap.put(drawableRandomMap.get(randomNum), ++currentDrawableAmountMapInt);
               // btn.setBackground(drawableStringMap.get(drawableRandomMap.get(randomNum)));
                btnMap.put(btn, drawableRandomMap.get(randomNum));
                changed = true;
            }
        }
    }
    private void resetAllNotCorrectImages(final Button last, final Button current){
        final Handler handler = new Handler();
        final Button btn1 = (Button) findViewById(R.id.btnMemory1);
        final Button btn2 = (Button) findViewById(R.id.btnMemory2);
        final Button btn3 = (Button) findViewById(R.id.btnMemory3);
        final Button btn4 = (Button) findViewById(R.id.btnMemory4);
        final Button btn5 = (Button) findViewById(R.id.btnMemory5);
        final Button btn6 = (Button) findViewById(R.id.btnMemory6);
        final Button btn7 = (Button) findViewById(R.id.btnMemory7);
        final Button btn8 = (Button) findViewById(R.id.btnMemory8);
        final Button btn9 = (Button) findViewById(R.id.btnMemory9);
        final Button btn10 = (Button) findViewById(R.id.btnMemory10);
        final Button btn11 = (Button) findViewById(R.id.btnMemory11);
        final Button btn12 = (Button) findViewById(R.id.btnMemory12);

        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        if(!last.getBackground().equals(current.getBackground())) {
            handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        last.setBackground(getDrawable(R.drawable.house));
                                        current.setBackground(getDrawable(R.drawable.house));
                                        btn1.setEnabled(true);
                                        btn2.setEnabled(true);
                                        btn3.setEnabled(true);
                                        btn4.setEnabled(true);
                                        btn5.setEnabled(true);
                                        btn6.setEnabled(true);
                                        btn7.setEnabled(true);
                                        btn8.setEnabled(true);
                                        btn9.setEnabled(true);
                                        btn10.setEnabled(true);
                                        btn11.setEnabled(true);
                                        btn12.setEnabled(true);
                                    }
                                }
                    , 3000);
        }
         else{
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btn10.setEnabled(true);
            btn11.setEnabled(true);
            btn12.setEnabled(true);
        }
    }

}
