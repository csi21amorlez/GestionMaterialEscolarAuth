package gmevWeb.dto.converters;

import java.util.ArrayList;

import gmevWeb.dto.AlumnoDTO;
import gmevWeb.dto.PortatilDTO;
import gmevWeb.dto.RolDTO;
import gmevWeb.dto.UsuarioDTO;
import gmewApp.dao.Alumno;
import gmewApp.dao.Portatil;
import gmewApp.dao.Rol;
import gmewApp.dao.Usuario;

// TODO: Auto-generated Javadoc
/**
 * Interfaz de la clase convertidora de objetos DTO a DAO.
 */
public interface DtoToService {

	/**
	 * Alumno dto to dao.
	 *
	 * @param dto the dto
	 * @return the alumno
	 */
	public Alumno AlumnoDtoToDao(AlumnoDTO dto);

	/**
	 * List alumno dto to dao.
	 *
	 * @param listDto the list dto
	 * @return the array list
	 */
	public ArrayList<Alumno> ListAlumnoDtoToDao(ArrayList<AlumnoDTO> listDto);

	/**
	 * Portatil dto to dao.
	 *
	 * @param dto the dto
	 * @return the portatil
	 */
	public Portatil PortatilDtoToDao(PortatilDTO dto);

	/**
	 * List portatil dto to dao.
	 *
	 * @param listDto the list dto
	 * @return the array list
	 */
	public ArrayList<Portatil> ListPortatilDtoToDao(ArrayList<PortatilDTO> listDto);

	/**
	 * List usuario dto to dao.
	 *
	 * @param listDto the list dto
	 * @return the array list
	 */
	public ArrayList<Usuario> ListUsuarioDtoToDao(ArrayList<UsuarioDTO> listDto);

	/**
	 * Usuario dto to dao.
	 *
	 * @param dto the dto
	 * @return the usuario
	 */
	public Usuario usuarioDtoToDao(UsuarioDTO dto);

	/**
	 * List rol dto to dao.
	 *
	 * @param listDto the list dto
	 * @return the array list
	 */
	public ArrayList<Rol> listRolDtoToDao(ArrayList<RolDTO> listDto);

	/**
	 * Rol dto to dao.
	 *
	 * @param dto the dto
	 * @return the rol
	 */
	public Rol rolDtoToDao(RolDTO dto);

}
