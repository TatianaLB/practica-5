# practica-5
En esta práctica se conecta el formulario con un endpoint implementado con Spring Boot.
Para llegar a la página del formulario pinchar en "Contáctanos" situado en el nav-bar.
En primer lugar se toman los datos cuando se rellena el formulario y se le da al botón enviar.
Estos datos se cogen haciendo un POST al endpoint /enviarForm.
Si no se rellenan todas las casillas de la parte de Datos personales sin exceder el máximo impuesto en cada uno,
sale un mensaje pidiendo que se rellene corectamente para que se pueda enviar.
Una vez se han rellenado todos los campos corectamente y le hemos dado al botón de enviar nos lleva a la 
página de formulario aceptado en la que podemos darle al botón de "Mostrar los datos enviados", y nos muestra los datos 
introducidos anteriormente. Para conseguir esto he creado el endpoint /respuestaForm con el que he hecho un @GetMapping
del objeto anterior recibido y luego en JS los muestro en la página haciendo un fetch del GET para obtener los datos, 
y usando innerHTML para conseguir que aparezcan en la página.
