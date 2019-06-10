package com.example.franq.happyhouse;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class WhichPictureActivity extends Activity {
private String TAG = "HappyHouse";
private String currentRecognitionAnimal = "none";
   public SpeechRecognizer speechRecognizer = SpeechRecognizer.createSpeechRecognizer(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        setContentView(R.layout.which_picture);


        ivDrawableRandomizer();





    }



    private void ivDrawableRandomizer(){

        RecognitionListener recognitionListener = new RecognitionListener() {
            @Override
            public void onReadyForSpeech(Bundle bundle) {
                Log.d(TAG,"READYFORSPEECH");
            }

            @Override
            public void onBeginningOfSpeech() {
                Log.d(TAG,"BEGGINING");
            }

            @Override
            public void onRmsChanged(float v) {
                Log.d(TAG,"RMS");
            }

            @Override
            public void onBufferReceived(byte[] bytes) {
                Log.d(TAG,"BUFFER");
            }

            @Override
            public void onEndOfSpeech() {
                Log.d(TAG,"ENDBEG");
                //speechRecognizer.cancel();

                //speechRecognizer = null;
                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                  intent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE,"voice.recognition.test");
                intent.putExtra( RecognizerIntent.EXTRA_LANGUAGE, "pl-PL");
                intent.putExtra(RecognizerIntent.EXTRA_MAX_RESULTS,5);

               // speechRecognizer.setRecognitionListener(recognitionListener);
              //  speechRecognizer.destroy();

               // speechRecognizer.stopListening();
               // speechRecognizer.startListening(intent);
                Log.d(TAG,"END");
            }

            @Override
            public void onError(int i) {
                Log.d(TAG, "ERRORBEG" + i);
                //speechRecognizer.cancel();
                //speechRecognizer = null;
                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                intent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE,"voice.recognition.test");
                intent.putExtra( RecognizerIntent.EXTRA_LANGUAGE, "pl-PL");
                intent.putExtra(RecognizerIntent.EXTRA_MAX_RESULTS,5);

                // speechRecognizer.setRecognitionListener(recognitionListener);
               // speechRecognizer.stopListening();
              //  speechRecognizer.startListening(intent);
                if(i==7){
                    speechRecognizer.stopListening();
                    speechRecognizer.startListening(intent);
                }

                Log.d(TAG, "ERROR" + i);
            }

            @Override
            public void onResults(Bundle bundle) {
                // handler.removeCallbacks(stopListening);
                ArrayList<String> matches = bundle.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                intent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE,"voice.recognition.test");
                intent.putExtra( RecognizerIntent.EXTRA_LANGUAGE, "pl-PL");
                intent.putExtra(RecognizerIntent.EXTRA_MAX_RESULTS,5);
                Handler handler = new Handler();

                if(matches.toString().contains(currentRecognitionAnimal)) {
                   /* handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                        }
                    }, 500);*/
                   // speechRecognizer.stopListening();
                    Log.d(TAG, "RESULT:" + matches.toString());
                   // speechRecognizer.cancel();
                    ivDrawableRandomizer();
                }
                else
                    speechRecognizer.startListening(intent);
            }

            @Override
            public void onPartialResults(Bundle bundle) {
                ArrayList<String> matches = bundle.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
                Log.d(TAG,"PARTIALRESULT"+matches.toString());
                if(matches.toString().contains("raz")) {
                    speechRecognizer.stopListening();
                    Log.d(TAG, "RESULT:" + matches.toString());
                }
            }

            @Override
            public void onEvent(int i, Bundle bundle) {
                Log.d(TAG,"EVENT");
            }
        };







        ImageView imageView =  findViewById(R.id.ivAnimal);
        Map<Integer,String> drawableRandomMap = new HashMap<>();
        Map<String,Drawable> drawableStringMap = new HashMap<>();
        Map<String,String> recognitionMap = new HashMap<>();
        drawableStringMap.put("LION",getDrawable(R.drawable.lion));
        drawableStringMap.put("CAT",getDrawable(R.drawable.cat));
        drawableStringMap.put("DOG",getDrawable(R.drawable.dog));
        drawableStringMap.put("SNAKE",getDrawable(R.drawable.snake));
        drawableStringMap.put("GOAT",getDrawable(R.drawable.goat));
        drawableStringMap.put("MONKEY",getDrawable(R.drawable.monkey));

       // Boolean changed = false;

        drawableRandomMap.put(0, "LION");
        drawableRandomMap.put(1, "CAT");
        drawableRandomMap.put(2, "DOG");
        drawableRandomMap.put(3, "SNAKE");
        drawableRandomMap.put(4, "GOAT");
        drawableRandomMap.put(5, "MONKEY");
        //


        recognitionMap.put("LION", "lew");
        recognitionMap.put("CAT", "kot");
        recognitionMap.put("DOG", "pies");
        recognitionMap.put("SNAKE", "wąż");
        recognitionMap.put("GOAT", "koza");
        recognitionMap.put("MONKEY", "małpa");

        int randomNum = ThreadLocalRandom.current().nextInt(0, 6);
        // String currentAnimal = drawableRandomMap.get(randomNum);
        imageView.setImageDrawable(drawableStringMap.get(drawableRandomMap.get(randomNum)));
        currentRecognitionAnimal = recognitionMap.get(drawableRandomMap.get(randomNum));
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        //intent.putExtra(RecognizerIntent.EXTRA_SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS,new Long(2000));
       // intent.putExtra(RecognizerIntent.EXTRA_SPEECH_INPUT_MINIMUM_LENGTH_MILLIS,new Long(2000));
        //intent.putExtra(RecognizerIntent.EXTRA_SPEECH_INPUT_POSSIBLY_COMPLETE_SILENCE_LENGTH_MILLIS,1000000);
        //  intent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE,"voice.recognition.test");
        intent.putExtra( RecognizerIntent.EXTRA_LANGUAGE, "pl-PL");
        intent.putExtra(RecognizerIntent.EXTRA_MAX_RESULTS,5);

        speechRecognizer.setRecognitionListener(recognitionListener);
        speechRecognizer.startListening(intent);
    }


}
