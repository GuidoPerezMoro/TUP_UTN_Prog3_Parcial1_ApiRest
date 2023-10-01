package prog3.apirest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import prog3.apirest.entities.Libro;
import prog3.apirest.services.LibroServiceImpl;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libros") //URI
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl> {
}
