package com.melitraining.intents;

import android.app.Activity;

/**
 * Formulario de una persona.
 *
 * El layout debería contener cuatro {@link android.widget.EditText} con sus respectivos
 * {@link android.widget.TextView} labels. También debe haber un {@link android.widget.Button} para
 * guardar los cambios.
 *
 * La información de la persona debe venir de {@link com.melitraining.intents.MainActivity}. Carga
 * los datos en el formulario en el evento mas apropiado del ciclo de vida. No te olvides de
 * manejar la rotación de pantalla!!!
 *
 * Al guardar los cambios, debemos finalizar esta pantalla y notificarle a nuestro
 * {@link com.melitraining.intents.MainActivity} si los datos de la persona fueron modificados.
 * Esto se hace devolviendo un resultado. Ve a
 * <a href="http://developer.android.com/training/basics/intents/result.html">la doc</a>
 * para mas detalle. Si el usuario hace back desde el ActionBar o con el botón de back nativo,
 * notifica el resultado como cancelado.
 */
public class EditableActivity extends Activity {

}
