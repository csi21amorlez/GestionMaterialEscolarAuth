package gmevWeb.dto;

import java.util.Calendar;

// TODO: Auto-generated Javadoc
/**
 * The Class UsuarioDTO.
 */
public class UsuarioDTO {
	
	/** The id. */
	private Long id;
	
	/** The cod empleado. */
	private String codUsuario;
	
	/** The clave empleado. */
	private String claveUsuario;
	
	/** The rol. */
	private RolDTO rol;
	
	/** The md uuid. */
	private String mdUuid;
	
	/** The md date. */
	private Calendar mdDate;
	

	/**
	 * Gets the md uuid.
	 *
	 * @return the md uuid
	 */
	public String getMdUuid() {
		return mdUuid;
	}

	/**
	 * Sets the md uuid.
	 *
	 * @param mdUuid the new md uuid
	 */
	public void setMdUuid(String mdUuid) {
		this.mdUuid = mdUuid;
	}

	/**
	 * Gets the md date.
	 *
	 * @return the md date
	 */
	public Calendar getMdDate() {
		return mdDate;
	}

	/**
	 * Sets the md date.
	 *
	 * @param mdDate the new md date
	 */
	public void setMdDate(Calendar mdDate) {
		this.mdDate = mdDate;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the cod usuario.
	 *
	 * @return the cod usuario
	 */
	public String getCodUsuario() {
		return codUsuario;
	}

	/**
	 * Sets the cod usuario.
	 *
	 * @param codUsuario the new cod usuario
	 */
	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}
	
	/**
	 * Gets the rol.
	 *
	 * @return the rol
	 */
	public RolDTO getRol() {
		return rol;
	}

	/**
	 * Sets the rol.
	 *
	 * @param rol the new rol
	 */
	public void setRol(RolDTO rol) {
		this.rol = rol;
	}

	/**
	 * Gets the clave usuario.
	 *
	 * @return the clave usuario
	 */
	public String getClaveUsuario() {
		return claveUsuario;
	}

	/**
	 * Sets the clave usuario.
	 *
	 * @param claveUsuario the new clave usuario
	 */
	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuario = claveUsuario;
	}
	
	

}
