package gmevWeb.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import gmevWeb.dto.AlumnoDTO;
import gmevWeb.dto.PortatilDTO;
import gmevWeb.dto.converters.DtoToImpl;
import gmevWeb.dto.converters.ToDtoImpl;
import gmevWeb.services.AlumnoImpl;
import gmevWeb.services.PortatilImpl;



// TODO: Auto-generated Javadoc
/**
 * The Class IndexController.
 */
@Controller
public class IndexController {


	@Autowired
	AlumnoImpl alumnoRepo;
	
	
	@Autowired
	PortatilImpl portatilRepo;
	

	@Autowired
	ToDtoImpl toDto;
	
	
	@Autowired
	DtoToImpl dtoTo;

	/**
	 * Navegacion a la vista principal de alumnos.
	 *
	 * @return ModelAndView(nombreVista, nombreModelo, objetoModelo)
	 */
	@RequestMapping(value = "/alumnos")
	public ModelAndView navAlumnos() {

		try {
			ArrayList<AlumnoDTO> listAlumnos = alumnoRepo.findAll();
			return new ModelAndView("alumnos", "listAlumnos", listAlumnos);
		} catch (Exception e) {
			return new ModelAndView("alumnos", "listAlumnos", "Error cargando la lista de alumnos");
		}
	}

	/**
	 * Navegacion a la vista principal de portatiles.
	 *
	 * @return ModelAndView(nombreVista, nombreModelo, objetoModelo)
	 */
	@RequestMapping(value = "/portatiles")
	public ModelAndView navPortatiles() {

		try {
			ArrayList<PortatilDTO> listPortatiles = portatilRepo.buscarTodos();
			return new ModelAndView("portatiles", "listPortatiles", listPortatiles);

		} catch (Exception e) {
			return new ModelAndView("portatiles", "listPortatiles", "Error cargando la lista de portatiles");
		}

	}
}
