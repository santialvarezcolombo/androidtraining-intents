package com.melitraining.intents;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ComposeMessageActivity extends Activity {

    private EditText messageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose_message);
        messageEditText = (EditText) findViewById(R.id.message);
    }

    /**
     * Carga el mensaje de texto enviado en el {@link android.content.Intent} en
     * {@link #messageEditText} para poder modificarlo
     */
    @Override
    protected void onResume() {
        super.onResume();
        // TODO: Implement me!!!
    }

    /**
     * Comparte el contenido de {@link #messageEditText}. TIP: Utiliza el mismo action que
     * colocaste en el <intent-filter> de esta Activity.
     */
    public void share(View view) {
        // TODO: Implement me!!!
    }
}
