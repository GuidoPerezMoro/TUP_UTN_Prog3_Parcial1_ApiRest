package prog3.apirest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import prog3.apirest.entities.Localidad;
import prog3.apirest.services.LocalidadServiceImpl;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades") //URI
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
}
