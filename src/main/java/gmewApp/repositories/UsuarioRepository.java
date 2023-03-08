package gmewApp.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import gmewApp.dao.Usuario;
@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

	@Query("SELECT u.Usuario FROM Usuario u where u.claveUsuario = :claveUsuario AND u.codUsuario = :codUsuario")
	Usuario findUsuarioByPasswordAndCod(@Param("codUsuario") String codUsuario, @Param("claveUsuario") String claveUsuario);
}
