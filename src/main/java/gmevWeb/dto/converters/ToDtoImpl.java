package gmevWeb.dto.converters;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import gmevWeb.dto.AlumnoDTO;
import gmevWeb.dto.PortatilDTO;
import gmevWeb.dto.RolDTO;
import gmevWeb.dto.UsuarioDTO;
import gmewApp.dao.Alumno;
import gmewApp.dao.Portatil;
import gmewApp.dao.Rol;
import gmewApp.dao.Usuario;

@Component
public class ToDtoImpl implements ToDtoService {

	@Override
	public AlumnoDTO AlumnoToDto(Alumno alumno) {
		AlumnoDTO dto = new AlumnoDTO();
		dto.setId(alumno.getId());
		dto.setCodigoAlumno(alumno.getCodAlumno());
		dto.setNombreCompleto(alumno.getNombreCompleto());
		dto.setNumeroTelefono(alumno.getNumeroTelefono());
		dto.setCodigoAlumno(alumno.getCodAlumno());
		if (alumno.getPortatil() != null) {
			dto.setPortatilId(alumno.getPortatil().getId());
		}
		return dto;
	}

	@Override
	public ArrayList<AlumnoDTO> ListAlumnoToDto(ArrayList<Alumno> listAlumno) {
		ArrayList<AlumnoDTO> listDto = new ArrayList<>();
		for (Alumno alumno : listAlumno) {
			listDto.add(AlumnoToDto(alumno));
		}
		return listDto;
	}

	@Override
	public PortatilDTO PortatilToDto(Portatil portatil) {
		PortatilDTO dto = new PortatilDTO();
		dto.setId(portatil.getId());
		dto.setMarca(portatil.getMarca());
		dto.setCodigo(portatil.getCodigo());
		dto.setModelo(portatil.getModelo());
		if (portatil.getAlumno() != null) {
			dto.setAlumnoId(portatil.getAlumno().getId());
		}
		return dto;
	}

	@Override
	public ArrayList<PortatilDTO> ListPortatilToDto(ArrayList<Portatil> listPortatil) {
		ArrayList<PortatilDTO> listDto = new ArrayList<>();
		for (Portatil portatil : listPortatil) {
			listDto.add(PortatilToDto(portatil));
		}
		return listDto;
	}

	@Override
	public ArrayList<UsuarioDTO> ListUsuarioToDto(ArrayList<Usuario> listUsuario) {
		ArrayList<UsuarioDTO> listDTO = new ArrayList<UsuarioDTO>();

		for (Usuario usu : listUsuario) {
			listDTO.add(usuarioToDto(usu));
		}

		return listDTO;
	}

	@Override
	public UsuarioDTO usuarioToDto(Usuario usuario) {
		UsuarioDTO dto = new UsuarioDTO();
		dto.setMdDate(usuario.getMdDate());
		dto.setMdUuid(usuario.getMdUuid());
		dto.setId(usuario.getId());
		dto.setClaveUsuario(usuario.getClaveUsuario());
		dto.setCodUsuario(usuario.getCodUsuario());
		dto.setRol(rolToDto(usuario.getRolUsuario()));
		return dto;
	}

	@Override
	public ArrayList<RolDTO> listRolToDto(ArrayList<Rol> listRoles) {
		ArrayList<RolDTO> listDTO = new ArrayList<RolDTO>();

		for (Rol rol : listRoles) {
			listDTO.add(rolToDto(rol));
		}

		return listDTO;
	}

	@Override
	public RolDTO rolToDto(Rol rol) {
		RolDTO dto = new RolDTO();
		dto.setId(rol.getId());
		dto.setDescRol(rol.getDescRol());

		return dto;
	}

}
