#Training: Intents

Este proyecto consiste de un `Activity` que tiene 3 botones que no funcionan. 
Cambiemos eso; implementemos acciones para cada botón.
Hay comentarios de ayuda adicionales dentro del proyecto.

- Botón 1: Al presionarlo, `MainActivity` debería mandar un DTO `Person` a 
`DetailActivity`; esta  debería mostrar la información del DTO.
- Botón 2: Al presionarlo, `MainActivity` debería enviar un DTO `Person` a 
`EditableActivity`; esta permite editar la información del objeto `Person`.
`EditableActivity` consiste de un formulario similar al utilizado en 
[androidtraining-fragments](https://github.com/wmora/androidtraining-fragments). El formulario
deberia tener un boton de "Guardar" el cual debería llevarte de vuelta a `MainActivity`. Una vez en ella,
mostrar un [Toast](http://developer.android.com/guide/topics/ui/notifiers/toasts.html) con los
nuevos valores del objeto `Person`. Dicho [Toast](http://developer.android.com/guide/topics/ui/notifiers/toasts.html),
debería mostrarse solo si hubo cambios en la información de la persona. Si no hubo cambios,
no se muestra nada. 
**IMPORTANTE:** Debes indicar que el DTO fue modificado *utilizando un result code* (TIP: ver
[onActivityResult]
(http://developer.android.com/reference/android/app/Activity.html#onActivityResult(int, int, android.content.Intent)))
- Botón 3: Al presionarlo, abre una búsqueda en la app de Meli. **Debes tener
la app instalada para probar esto**. Si estás utilizando un emulador y no tienes acceso a Google Play,
descarga la última versión de la app [acá](https://github.com/mercadolibre/mobile-android/releases/download/v3.13.0/Mercadolibre-3.13.0.apk)
- Queremos que nuestra aplicación soporte la recepción de datos de tipo "text/plain"; así podremos
revisar el contenido a compartir para hacer alguna modificación y compartirlo de vuelta. Para lograr
esto, debemos soportar el evento utilizando un
[common intent](https://developer.android.com/guide/components/intents-common.html). Una vez que
nuestra activity recibe el intent, muestra el contenido del texto en un
[EditText](http://developer.android.com/reference/android/widget/EditText.html).

##Extra
Imagina que la aplicación de MercadoLibre deje de dar soporte a la URL que utilizaste para el tercer botón.
Prueba esto cambiando la URL de deep link por "meli://link_que_no_existe". Cómo puedes evitar que la app no falle
si ninguna Activity es capaz de procesar el Intent? Agrega la validación en el código del tercer botón
(obviamente sin utilizar un try/catch :P).
