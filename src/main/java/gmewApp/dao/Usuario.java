package gmewApp.dao;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Usuario.
 */
@Entity
@Table(name = "dlk_gus_usuarios", schema = "sc_dlk_gestion_usuarios")
public class Usuario {
	
	/** The md uuid. */
	@Column(name="md_uuid")
	private String mdUuid;
	
	/** The md date. */
	@Column(name = "md_date")
	private Calendar mdDate;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuarios_sequence")
	@SequenceGenerator(name = "usuarios_sequence", sequenceName = "usuarios_sequence", allocationSize = 1)
	private Long id;
	
	/** The cod usuario. */
	@Column(name = "codigo_usuario")
	private String codUsuario;
	
	/** The clave usuario. */
	@Column(name = "clave_usuario")
	private String claveUsuario;
	
	/** The rol usuario. */
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "rol_id")
	private Rol rolUsuario;

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

	/**
	 * Gets the rol usuario.
	 *
	 * @return the rol usuario
	 */
	public Rol getRolUsuario() {
		return rolUsuario;
	}

	/**
	 * Sets the rol usuario.
	 *
	 * @param rolUsuario the new rol usuario
	 */
	public void setRolUsuario(Rol rolUsuario) {
		this.rolUsuario = rolUsuario;
	}

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

}
