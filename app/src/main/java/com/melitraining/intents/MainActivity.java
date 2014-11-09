package com.melitraining.intents;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.melitraining.intents.dto.Person;

public class MainActivity extends Activity {

    private static final String MELI_SEARCH_URL = "meli://search?go=http://electronica.mercadolibre.com.ar";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Inicia {@link com.melitraining.intents.DetailActivity} y le envía una instancia de
     * {@link com.melitraining.intents.dto.Person} para ser vista.
     */
    public void goToDetailActivity(View v) {
        // TODO: Implement me!!!
    }

    /**
     * Inicia {@link com.melitraining.intents.EditableActivity} y le envía una instancia de
     * {@link com.melitraining.intents.dto.Person} para ser editada. Esta vez queremos
     * saber si el objeto fue modificado o no <b>UTILIZANDO UN RESULT CODE</b>
     */
    public void goToEditableActivity(View v) {
        // TODO: Implement me!!!
    }

    /**
     * Inicia una búsqueda en la app de MercadoLibre. Como ayuda, te dejamos una variable
     * {@link #MELI_SEARCH_URL} que contiene el deep link para el listado de productos de
     * electrónica en MLA.
     * <p/>
     * Para que esto funcione, debes tener la app de MercadoLibre instalada en el dispositivo o
     * emulador donde corras la aplicación. Si no la tienes instalada, puedes descargarla
     * directamente desde Google Play o desde el tag en GitHub.
     * <a href="https://github.com/mercadolibre/mobile-android/releases/download/v3.13.0/Mercadolibre-3.13.0.apk">link</a>
     * <p/>
     * Revisa el application manifest <a href="https://github.com/mercadolibre/mobile-android/blob/091afb9ca8a300b035581420336102d798bfdc3f/Mercadolibre/src/main/AndroidManifest.xml">link</a>
     * de la aplicación de MercadoLibre. Cómo podrías comunicarte
     * con ella utilizando el deep link que tenemos?
     */
    public void goToMeliSearch(View v) {
        // TODO: Implement me!!!
    }

    /**
     * Muestra un {@link android.widget.Toast} con la descripción de la persona modificada.
     * Este método debería llamarse sólo si una persona fue modificada en
     * {@link com.melitraining.intents.EditableActivity}
     */
    private void showModifiedPerson(Person person) {
        Toast.makeText(this, person.toString(), Toast.LENGTH_LONG).show();
    }

}
