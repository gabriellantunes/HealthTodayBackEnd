package br.univille.HealthToday.service;

import java.util.List;
import br.univille.HealthToday.entity.Usuario;

public interface UsuarioService {
    List<Usuario> getAll();

    void save(Usuario usuario);

    void delete(long id);


}
