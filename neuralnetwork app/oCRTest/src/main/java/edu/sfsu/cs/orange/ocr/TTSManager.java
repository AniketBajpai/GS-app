package edu.sfsu.cs.orange.ocr;

/**
 * Created by Manish Singh,Aniket Bajpai and Ayush Gupta on 10/11/2015.
 */


        import java.util.Locale;

        import android.app.Activity;
        import android.content.Context;
        import android.os.Bundle;
        import android.speech.tts.TextToSpeech;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class TTSManager extends Activity implements
        TextToSpeech.OnInitListener {
    /** Called when the activity is first created. */

    private TextToSpeech tts;
    private Button btnSpeak;
    private EditText txtText;


    public void init( Context A) {
        //super.onCreate(A);
       // setContentView(R.layout.main);

        tts = new TextToSpeech(A, this);

        //btnSpeak = (Button) findViewById(R.id.btnSpeak);

        //txtText = (EditText) findViewById(R.id.txtText);


    }

    @Override
    public void onDestroy() {
        // Don't forget to shutdown tts!
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }

    @Override
    public void onInit(int status) {

        if (status == TextToSpeech.SUCCESS) {

            int result = tts.setLanguage(Locale.US);

            if (result == TextToSpeech.LANG_MISSING_DATA
                    || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS", "This Language is not supported");
            } else {
                btnSpeak.setEnabled(true);
                speakOut();
            }

        } else {
            Log.e("TTS", "Initilization Failed!");
        }

    }

    private void speakOut() {

        String text = txtText.getText().toString();

        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }
}