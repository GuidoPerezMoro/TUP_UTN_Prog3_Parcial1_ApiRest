package prog3.apirest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import prog3.apirest.entities.Autor;
import prog3.apirest.services.AutorServiceImpl;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores") //URI
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{
}
