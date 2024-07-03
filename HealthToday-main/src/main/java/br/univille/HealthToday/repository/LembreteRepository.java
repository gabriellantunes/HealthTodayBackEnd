package br.univille.HealthToday.repository;

import br.univille.HealthToday.entity.Lembrete;
import br.univille.HealthToday.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LembreteRepository extends CrudRepository<Lembrete, Long> {
    List<Lembrete> findByUsuarioNome(String nome);

    List<Lembrete> findByUsuario(Usuario usuario);
}
