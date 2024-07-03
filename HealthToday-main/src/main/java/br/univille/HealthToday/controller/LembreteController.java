package br.univille.HealthToday.controller;

import br.univille.HealthToday.entity.Lembrete;
import br.univille.HealthToday.entity.Usuario;
import br.univille.HealthToday.repository.LembreteRepository;
import br.univille.HealthToday.repository.UsuarioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LembreteController {

    private final LembreteRepository lembreteRepository;
    private final UsuarioRepository usuarioRepository;

    public LembreteController(LembreteRepository lembreteRepository, UsuarioRepository usuarioRepository) {
        this.lembreteRepository = lembreteRepository;
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("/lembretes")
    public String list(Model model, HttpSession session) {
        String username = (String) session.getAttribute("username");

        if (username == null) {
            return "redirect:/login";
        }

        List<Lembrete> lembretes = lembreteRepository.findByUsuarioNome(username);

        model.addAttribute("username", username);
        model.addAttribute("lembretes", lembretes);
        model.addAttribute("lembrete", new Lembrete());

        return "lembretes";
    }

    @GetMapping("/lembretes/novo")
    public String novo(Model model) {
        model.addAttribute("lembrete", new Lembrete());
        return "lembretesForm";
    }

    @PostMapping("/lembretes/salvar")
    public String salvar(@ModelAttribute Lembrete lembrete, HttpSession session) {
        String username = (String) session.getAttribute("username");

        if (username == null) {
            return "redirect:/login";
        }

        Usuario usuario = usuarioRepository.findByNome(username);
        lembrete.setUsuario(usuario);

        lembreteRepository.save(lembrete);

        return "redirect:/lembretes";
    }
}
