package gmewApp.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Rol.
 */
@Entity
@Table(name = "dlk_gus_roles", schema = "sc_dlk_gestion_usuarios")
public class Rol {

	/** The id. */
	@Id	
	private int id;
	
	/** The desc rol. */
	@Column(name = "descRol")
	private String descRol;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the desc rol.
	 *
	 * @return the desc rol
	 */
	public String getDescRol() {
		return descRol;
	}

	/**
	 * Sets the desc rol.
	 *
	 * @param descRol the new desc rol
	 */
	public void setDescRol(String descRol) {
		this.descRol = descRol;
	}

}
