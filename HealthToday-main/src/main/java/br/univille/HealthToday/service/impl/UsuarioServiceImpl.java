package br.univille.HealthToday.service.impl;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.univille.HealthToday.entity.Usuario;
import br.univille.HealthToday.repository.UsuarioRepository;
import br.univille.HealthToday.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public List<Usuario> getAll() {
        return repository.findAll();
    }

    @Override
    public void save(Usuario usuario) {
        long randomNum = ThreadLocalRandom.current().nextLong(10000000L, 100000000L);
        usuario.setIdUsuario(randomNum);
        repository.save(usuario);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }
}
