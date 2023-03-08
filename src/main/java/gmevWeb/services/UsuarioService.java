package gmevWeb.services;

import gmevWeb.dto.UsuarioDTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface UsuarioService.
 */
public interface UsuarioService {

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the usuario DTO
	 */
	public UsuarioDTO findById(long id);

	/**
	 * Login.
	 *
	 * @param codUsuario the cod usuario
	 * @param claveUsuario the clave usuario
	 * @return the usuario DTO
	 */
	public UsuarioDTO login(String codUsuario, String claveUsuario);

	/**
	 * Eliminar usuario.
	 *
	 * @param usu the usu
	 */
	public void eliminarUsuario(UsuarioDTO usu);

	/**
	 * Creates new user.
	 *
	 * @param usu the usu
	 */
	public void createUsuario(UsuarioDTO usu);
	

}
