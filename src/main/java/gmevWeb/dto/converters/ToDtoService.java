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
 * Interfaz de la clase convertidora de DAO a DTO.
 */
public interface ToDtoService {
	
/**
 * Alumno to dto.
 *
 * @param alumno the alumno
 * @return the alumno DTO
 */
public AlumnoDTO AlumnoToDto(Alumno alumno); 
	
	/**
	 * List alumno to dto.
	 *
	 * @param listAlumno the list alumno
	 * @return the array list
	 */
	public ArrayList<AlumnoDTO> ListAlumnoToDto(ArrayList<Alumno> listAlumno);
	
	/**
	 * Portatil to dto.
	 *
	 * @param portatil the portatil
	 * @return the portatil DTO
	 */
	public PortatilDTO PortatilToDto(Portatil portatil);
	
	/**
	 * List portatil to dto.
	 *
	 * @param listPortatil the list portatil
	 * @return the array list
	 */
	public ArrayList<PortatilDTO> ListPortatilToDto(ArrayList<Portatil> listPortatil);
	
	/**
	 * List usuario to dto.
	 *
	 * @param listUsuario the list usuario
	 * @return the array list
	 */
	public ArrayList<UsuarioDTO> ListUsuarioToDto(ArrayList<Usuario> listUsuario);
	
	/**
	 * Usuario to dto.
	 *
	 * @param usuario the usuario
	 * @return the usuario DTO
	 */
	public UsuarioDTO usuarioToDto(Usuario usuario);
	
	/**
	 * List rol to dto.
	 *
	 * @param listRoles the list roles
	 * @return the array list
	 */
	public ArrayList<RolDTO> listRolToDto(ArrayList<Rol> listRoles);
	
	/**
	 * Rol to dto.
	 *
	 * @param rol the rol
	 * @return the rol DTO
	 */
	public RolDTO rolToDto(Rol rol);
	

}
