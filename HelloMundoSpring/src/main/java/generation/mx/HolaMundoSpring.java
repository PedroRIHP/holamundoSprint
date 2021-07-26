package generation.mx;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //indica que vamos a trabajar con el HTTp va a interceptar esto
public class HolaMundoSpring {
//@RequestMapping nos dice que va  aejecutar // el RequestMethod es para pedir metodos
	@RequestMapping (path = "/", method = RequestMethod.GET) //path dice la ruta (en este caso le ponemos "/", por que es la ruta sencilla ejemplo:(http://ejemplo/ruta) aqui la palabra ruta estaria delante de nuestro "/Ruta", pero nosotros lo dejamos simple con un "/"y el method la forma o el metodo
	public String holaMundo(@RequestParam (name = "nombre", defaultValue ="defecto")String nombre) {
		return "hola Mundo con Spring Java " + nombre ;
	}
}
//@RequestParam nos dice que trabaja con la url