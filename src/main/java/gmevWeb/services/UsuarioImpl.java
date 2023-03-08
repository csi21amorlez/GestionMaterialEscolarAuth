package gmevWeb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gmevWeb.dto.UsuarioDTO;
import gmevWeb.dto.converters.DtoToImpl;
import gmevWeb.dto.converters.ToDtoImpl;
import gmewApp.repositories.UsuarioRepository;

@Component
public class UsuarioImpl implements UsuarioService {

	@Autowired
	UsuarioRepository usuRepo;
	@Autowired
	ToDtoImpl toDto;
	@Autowired
	DtoToImpl dtoTo;

	@Override
	public UsuarioDTO findById(long id) {
		try {
			return toDto.usuarioToDto(usuRepo.findById(id).orElse(null));
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}

	@Override
	public UsuarioDTO login(String codUsuario, String claveUsuario) {
		
		try {
			return toDto.usuarioToDto(usuRepo.findUsuarioByPasswordAndCod(codUsuario, claveUsuario));			
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}

	@Override
	public void eliminarUsuario(UsuarioDTO usu) {
		try{
			usuRepo.delete(dtoTo.usuarioDtoToDao(usu));
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void createUsuario(UsuarioDTO usu) {
		try{
			usuRepo.save(dtoTo.usuarioDtoToDao(usu));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
