package br.univille.HealthToday.repository;

import br.univille.HealthToday.entity.Cardapio;
import br.univille.HealthToday.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CardapioRepository extends CrudRepository<Cardapio, Long> {
    List<Cardapio> findByUsuario(Usuario usuario);
}
