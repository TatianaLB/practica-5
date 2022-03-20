function getDatosPersonales() {
        var headers = {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'
                };

        fetch("/respuestaForm", {
                method: 'GET',
                headers: {
                'Content-Type': 'application/json'
                }
            })
            .then(response => response.json())
            //data = persona tipo DatosPersonales
            .then(function(data) {
                    document.getElementById("datosGuardados").innerHTML = "Sus datos guardados son: ";
                    document.getElementById("nombre").innerHTML = "Nombre: " + data.nombre;
                    document.getElementById("primerApellido").innerHTML = "Primer apellido: " + data.primerApellido;
                    document.getElementById("segundoApellido").innerHTML = "Segundo apellido: " + data.segundoApellido;
                    document.getElementById("fechaNac").innerHTML = "Fecha de nacimiento: " + data.fecha;
                    document.getElementById("nacionalidad").innerHTML = "Nacionalidad: " + data.nacionalidad;
            })
            .then(data => {
                showContent(data, "content");
                document.getElementById("nombre").innerHTML = data.nombre;
            });
        console.log("End");
    }

//getDatosPersonales();