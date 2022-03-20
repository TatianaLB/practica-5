package com.example.demo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.DatosPersonales;
import java.util.Date;


@RestController
public class MainController
{
    //con el endpoint /statusForm el endpoint procesa los datos y enviará un resultado con fetch de validación

    @GetMapping("/status")
    public ResponseEntity<String> status()
    {
       // return "Hello world";
       return new ResponseEntity<String>("{\"result\" : \"OK\"}", HttpStatus.OK);
    }

    /*@PostMapping("/statusForm")
    public ResponseEntity<String> status1()
    {
        // return "Hello world";
        return new ResponseEntity<String>("{\"result\" : \"OK\"}", HttpStatus.OK);
    }*/
    DatosPersonales persona;

    @GetMapping("/respuestaForm")
    public DatosPersonales showPersonInfo()
    {
        // return "Hello world";
        return persona;
    }

    @PostMapping(
            path = "/enviarForm",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
            public ResponseEntity<String> checkPersonInfo(
                    @Valid @RequestBody DatosPersonales persona,
                    BindingResult bindingResult) {

                if (bindingResult.hasErrors()) {
                    System.out.println("binding result has erros");
                    return new ResponseEntity<>("{\"result\" : \"KO: BAD REQUEST\"}", HttpStatus.BAD_REQUEST);
                }
                this.persona = persona;

        /*if ((persona.getNombre().equals("Tatiana")) && (persona.getPrimerApellido().equals("López")))
        {
            return new ResponseEntity<>("{\"result\" : \"OK\"}", HttpStatus.OK);
        }else if((persona.getNombre().equals("Juan Antonio")) && (persona.getPrimerApellido().equals("Breña")))
        {
            return new ResponseEntity<>("{\"result\" : \"OK\"}", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("{\"result\" : \"USUARIO NO REGISTRADO\"}", HttpStatus.UNAUTHORIZED);
        }*/
                return new ResponseEntity<>("{\"result\" : \"OK\"}", HttpStatus.OK);

    }

}
