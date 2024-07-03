package br.univille.HealthToday.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.HealthToday.entity.Usuario;

@Repository
public interface UsuarioRepository
        extends JpaRepository<Usuario,Long>{
    Usuario findByEmailAndSenha(String email, String senha);
    Usuario findByNome(String nome);
}
