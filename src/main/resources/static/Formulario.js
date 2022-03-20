//Probando un get
/*function getStatus() {
            const address = '/status';
            fetch(address, {method: 'GET'})
                .then(response => response.json())
                .then(data => {
                    console.log(data);
                });
        }*/

function validateForm()
{
    try
    {
        var nombreValue = document.getElementById("nombre").value;
        var primerApellidoValue = document.getElementById("primerApellido").value;
        var segundoApellidoValue = document.getElementById("segundoApellido").value;
        var fechaNacValue = document.getElementById("fechaNac").value;
        var nacionalidadValue = document.getElementById("nacionalidad").value;

        const data = {
                      nombre: nombreValue,
                      primerApellido: primerApellidoValue,
                      segundoApellido: segundoApellidoValue,
                      fecha: fechaNacValue,
                      nacionalidad: nacionalidadValue
                      };
        const address = '/enviarForm';
        fetch(address, {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify(data)
        })
        .then(response => response.json())
        .then(data => {
            console.log(data);
            if(data.result == "OK") {
                 console.log("Consulta exitosa");
                 document.location.href="./acceptedForm.html";
                 alert("Gracias por tu interés " + nombreValue + " " + primerApellidoValue);
            } else {
                  document.location.href="./Formulario.html";
                  alert("Por favor, rellene todos los campos correctamente");
            }
        });

    } catch (err) {
         console.error(err.message);
    }

    return false;
}
