#Training: Intents

Este proyecto consiste de un `Activity` que tiene 3 botones que no funcionan. 
Cambiemos eso; implementemos las siguientes acciones:

- Botón 1: Al presionarlo, 'MainActivity' debería mandar un DTO `Person` a 
'DetailActivity'; esta  debería mostrar la información del DTO.
- Botón 2: Al presionarlo, `MainActivity` debería enviar un DTO `Person` a 
'EditableActivity'; esta permite editar la información del objeto `Person`.
`EditableActivity` consiste de un formulario similar al utilizado en 
[androidtraining-fragments](https://github.com/wmora/androidtraining-fragments). El formulario
deberia tener un boton de "Guardar" el cual debería llevarte de vuelta a 'MainActivity'. Una vez en ella,
mostrar un [Toast](http://developer.android.com/guide/topics/ui/notifiers/toasts.html) con los
nuevos valores del objeto `Person`. Dicho [Toast](http://developer.android.com/guide/topics/ui/notifiers/toasts.html),
debería mostrarse solo si hubo cambios en la información de la persona. Si no hubo cambios,
no se muestra nada. IMPORTANTE: Debes indicar que el DTO fue modificado, *utilizando un result code*. TIP: mirar
[onActivityResult]
(http://developer.android.com/reference/android/app/Activity.html#onActivityResult(int, int, android.content.Intent))
- Botón 3: Al presionarlo, abre la VIP de la app de Meli con un itemID de tu preferencia. Debes tener
la app instalada para probar esto
- Queremos que nuestra aplicación sea usada por espías y revisar cuando se
va a realizar una llamada. Para lograr esto, debemos soportar el evento, usando un
[common intent](https://developer.android.com/guide/components/intents-common.html). Una vez que nuestra activity intercepto el evento, mostrar en un
[Toast](http://developer.android.com/guide/topics/ui/notifiers/toasts.html) el numero de telefono.
Parece complicado, no? Los [intent-filter](http://developer.android.com/guide/topics/manifest/intent-filter-element.html)
vienen a nuestro rescate :)
