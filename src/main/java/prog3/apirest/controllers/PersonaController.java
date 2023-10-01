package prog3.apirest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import prog3.apirest.entities.Persona;
import prog3.apirest.services.PersonaServiceImpl;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas") //URI
public class PersonaController extends BaseControllerImpl<Persona,PersonaServiceImpl> {

}
