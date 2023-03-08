package gmevWeb.dto.converters;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gmevWeb.dto.AlumnoDTO;
import gmevWeb.dto.PortatilDTO;
import gmevWeb.dto.RolDTO;
import gmevWeb.dto.UsuarioDTO;
import gmevWeb.services.PortatilImpl;
import gmewApp.dao.Alumno;
import gmewApp.dao.Portatil;
import gmewApp.dao.Rol;
import gmewApp.dao.Usuario;

@Component
public class DtoToImpl implements DtoToService {

	@Autowired
	PortatilImpl portatilRepo;

	private UUID mdUuid = UUID.randomUUID();
	private Calendar fecha;

	@Override
	public Alumno AlumnoDtoToDao(AlumnoDTO dto) {
		Alumno alumno = new Alumno();
		alumno.setId(dto.getId());
		alumno.setCodAlumno(dto.getCodigoAlumno());
		alumno.setNombreCompleto(dto.getNombreCompleto());
		alumno.setNumeroTelefono(dto.getNumeroTelefono());
		alumno.setCodAlumno(dto.getCodigoAlumno());
		alumno.setMdDate(Calendar.getInstance());
		alumno.setMdUuid(mdUuid.toString());
		alumno.setPortatil(PortatilDtoToDao(portatilRepo.findById(dto.getPortatilId())));
		System.out.println();
		return alumno;
	}

	@Override
	public ArrayList<Alumno> ListAlumnoDtoToDao(ArrayList<AlumnoDTO> listDto) {
		ArrayList<Alumno> listAlumno = new ArrayList<>();
		for (AlumnoDTO alumno : listDto) {
			listAlumno.add(AlumnoDtoToDao(alumno));
		}
		return listAlumno;
	}

	@Override
	public Portatil PortatilDtoToDao(PortatilDTO dto) {
		Portatil portatil = new Portatil();
		portatil.setId(dto.getId());
		portatil.setMarca(dto.getMarca());
		portatil.setCodigo(dto.getCodigo());
		portatil.setModelo(dto.getModelo());
		portatil.setMdDate(Calendar.getInstance());
		portatil.setMdUuid(mdUuid.toString());
		return portatil;
	}

	@Override
	public ArrayList<Portatil> ListPortatilDtoToDao(ArrayList<PortatilDTO> listDto) {
		ArrayList<Portatil> listPortatil = new ArrayList<>();
		for (PortatilDTO portatil : listDto) {
			listPortatil.add(PortatilDtoToDao(portatil));
		}
		return listPortatil;
	}

	@Override
	public ArrayList<Usuario> ListUsuarioDtoToDao(ArrayList<UsuarioDTO> listDto) {
		ArrayList<Usuario> listUsu = new ArrayList<Usuario>();

		for (UsuarioDTO usu : listDto) {
			listUsu.add(usuarioDtoToDao(usu));
		}

		return null;
	}

	@Override
	public Usuario usuarioDtoToDao(UsuarioDTO dto) {
		Usuario usu = new Usuario();
		usu.setMdUuid(mdUuid.toString());
		usu.setMdDate(fecha.getInstance());
		usu.setClaveUsuario(dto.getClaveUsuario());
		usu.setCodUsuario(dto.getCodUsuario());
		usu.setId(dto.getId());
		usu.setRolUsuario(rolDtoToDao(dto.getRol()));
		return usu;
	}

	@Override
	public ArrayList<Rol> listRolDtoToDao(ArrayList<RolDTO> listDto) {
		ArrayList<Rol> listRol = new ArrayList<Rol>();

		for (RolDTO rol : listDto) {
			listRol.add(rolDtoToDao(rol));
		}

		return listRol;
	}

	@Override
	public Rol rolDtoToDao(RolDTO dto) {
		Rol rol = new Rol();
		rol.setDescRol(dto.getDescRol());
		rol.setId(dto.getId());
		return rol;
	}

}
