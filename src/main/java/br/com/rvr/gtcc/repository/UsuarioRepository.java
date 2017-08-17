package br.com.rvr.gtcc.repository;

import br.com.rvr.gtcc.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * Criado por Raphael em 20/07/2017.
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @Transactional
    Usuario findById(Integer id);

    @Transactional
    Usuario findFirstByEmailAndSenha(String email, String senha);
}
