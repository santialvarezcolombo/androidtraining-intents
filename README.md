androidtraining-intents
=======================


#Training Intents:

Este proyecto consiste de un `Activity` que tiene 3 botones. Cada uno de estos botones por ahora no
hace nada. La idea del ejercicio es que implementen las siguientes acciones:

- Botón 1: Al presionarlo, 'MainActivity' debería mandar un DTO persona a la activity
'DetailActivity', la cual debería mostrar la información del DTO.
- Botón 2: Al presionarlo, abre la vista de edición 'EditableActivity' la cual permite editar
la información del DTO Persona que se pasa a dicha activity. Una vez realizados los cambios, oprimir
el botón 'Guardar', el cual debería llevarte de vuelta a 'MainActivity'. Una vez en dicha activity,
mostrar un [Toast](http://developer.android.com/guide/topics/ui/notifiers/toasts.html) con los
nuevos valores de la persona. Dicho [Toast](http://developer.android.com/guide/topics/ui/notifiers/toasts.html),
debería mostrarse solo si hubo cambios en la información de la persona. Si no hubo cambios,
no se muestra nada. Debes indicar que el DTO fue modificado, usando un result code. TIP: mirar
[onActivityResult]
(http://developer.android.com/reference/android/app/Activity.html#onActivityResult(int, int, android.content.Intent))
- Botón 3: Al presionarlo, abre la VIP de la app de Meli con un el un itemID de tu preferencia.


Ademas, somos metiches y queremos que nuestra aplicación sea usada por espías y revisar cuando se
va a realizar una llamada. Para lograr esto, debemos soportar el evento, usando un
'common intent'. Una vez que nuestra activity intercepto el evento, mostrar en un
[Toast](http://developer.android.com/guide/topics/ui/notifiers/toasts.html) el numero de telefono.
Parece complicado, no? Los [intent-filter](http://developer.android.com/guide/topics/manifest/intent-filter-element.html)
vienen a nuestro rescate :)