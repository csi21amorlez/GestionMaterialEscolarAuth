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

		return toDto.usuarioToDto(usuRepo.findById(id).orElse(null));

	}

	@Override
	public UsuarioDTO login(String codUsuario, String claveUsuario) {
		return toDto.usuarioToDto(usuRepo.findUsuarioByPasswordAndCod(codUsuario, claveUsuario));
	}

	@Override
	public void eliminarUsuario(UsuarioDTO usu) {
		usuRepo.delete(dtoTo.usuarioDtoToDao(usu));

	}

	@Override
	public void createUsuario(UsuarioDTO usu) {
		usuRepo.save(dtoTo.usuarioDtoToDao(usu));
	}

}
