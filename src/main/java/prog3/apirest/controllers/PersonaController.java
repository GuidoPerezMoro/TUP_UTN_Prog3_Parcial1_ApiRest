package prog3.apirest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import prog3.apirest.entities.Persona;
import prog3.apirest.services.PersonaService;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas") //URI
public class PersonaController {
    PersonaService personaService;
    public PersonaController(PersonaService personaService){   //¿Se podrá reemplazar con un @Autowired para la inyección de dependencia?
        this.personaService = personaService;
    }

    @GetMapping("") //URI
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(personaService.findAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente mas tarde.\"}");
        }
    }

    @GetMapping("/{id}") //URI
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(personaService.findById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, no se encontró el valor solicitado.\"}");
        }
    }

    @PostMapping("") //URI
    public ResponseEntity<?> save(@RequestBody Persona entity) { //@RequestBody sirve para que la entidad esté dentro del body del request
        try {
            return ResponseEntity.status(HttpStatus.OK).body(personaService.save(entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente mas tarde.\"}");
        }
    }

    @PutMapping("/{id}") //URI
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Persona entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(personaService.update(id, entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente mas tarde.\"}");
        }
    }

    @DeleteMapping("/{id}") //URI
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(personaService.delete(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente mas tarde.\"}");
        }
    }
}
