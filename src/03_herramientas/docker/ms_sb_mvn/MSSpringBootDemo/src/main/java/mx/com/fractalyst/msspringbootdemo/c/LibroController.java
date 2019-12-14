package mx.com.fractalyst.msspringbootdemo.c;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.ServletContextAware;

import mx.com.fractalyst.msspringbootdemo.m.Libro;
import mx.com.fractalyst.msspringbootdemo.m.LibroDAO;
import mx.com.fractalyst.msspringbootdemo.web.RespuestaWeb;

@RestController
@RequestMapping("/libros")
public class LibroController implements ServletContextAware {

	private ServletContext servletContext;

	// C
	@PostMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Libro creaLibro(@RequestBody final Libro libro) {
		LibroDAO dao = (LibroDAO) servletContext.getAttribute("libroDAO");
		return dao.creaLibro(libro);
	}

	// R
	@GetMapping(path = "{id}", produces = "application/json;charset=UTF-8")
	public Libro obtenLibro(@PathVariable("id") final int id) {
		LibroDAO dao = (LibroDAO) servletContext.getAttribute("libroDAO");
		return dao.obtenLibro(id);
	}

	@GetMapping(path = "/", produces = "application/json;charset=UTF-8")
	public List<Libro> obtenLibros() {
		LibroDAO dao = (LibroDAO) servletContext.getAttribute("libroDAO");
		return dao.obtenLibros();
	}

	// U
	@PutMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Libro actualizaLibro(@RequestBody final Libro libro) {
		LibroDAO dao = (LibroDAO) servletContext.getAttribute("libroDAO");
		return dao.actualizaLibro(libro);
	}

	// D
	@PutMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public RespuestaWeb eliminaLibro(@PathVariable("id") final int id) {
		LibroDAO dao = (LibroDAO) servletContext.getAttribute("libroDAO");
		RespuestaWeb respuestaWeb = new RespuestaWeb(500, "Problema en la eliminación");
		boolean borradoExitoso = dao.eliminaLibro(id);
		if (borradoExitoso) {
			respuestaWeb = new RespuestaWeb(200, "Eliminación Exitosa");
		}
		return respuestaWeb;
	}

	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;

	}
}
