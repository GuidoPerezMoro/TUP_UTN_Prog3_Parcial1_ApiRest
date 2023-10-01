package prog3.apirest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import prog3.apirest.entities.Domicilio;
import prog3.apirest.services.DomicilioServiceImpl;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios") //URI
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl> {
}
