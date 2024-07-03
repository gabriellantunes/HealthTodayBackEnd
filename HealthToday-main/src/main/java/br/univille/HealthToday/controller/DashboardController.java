package br.univille.HealthToday.controller;

import br.univille.HealthToday.entity.Usuario;
import br.univille.HealthToday.entity.Lembrete;
import br.univille.HealthToday.repository.UsuarioRepository;
import br.univille.HealthToday.repository.LembreteRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@EnableCaching
@RequestMapping("/dashboard")
public class DashboardController {

    @Autowired
    private UsuarioRepository usuarioRepo;

    @Autowired
    private LembreteRepository lembreteRepo;

    @GetMapping
    @CacheEvict(value = "dashboard", allEntries = true)
    @Cacheable("dashboard")
    public String dashboard(HttpSession session, Model model, HttpServletResponse response) {
        String username = (String) session.getAttribute("username");

        if (username == null) {
            return "redirect:/login";
        }

        Usuario usuario = usuarioRepo.findByNome(username);
        List<Lembrete> lembretes = lembreteRepo.findByUsuario(usuario);

        model.addAttribute("username", username);
        model.addAttribute("lembretes", lembretes);

        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
        response.setHeader("Pragma", "no-cache"); // HTTP 1.0
        response.setHeader("Expires", "0"); // Proxies

        return "dashboard";
    }

    @PostMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }

    @GetMapping("/configuracoes")
    public ModelAndView configuracoes(HttpSession session) {
        String username = (String) session.getAttribute("username");

        if (username == null) {
            return new ModelAndView("redirect:/login");
        }

        Usuario usuario = usuarioRepo.findByNome(username);

        ModelAndView modelAndView = new ModelAndView("configuracoes");
        modelAndView.addObject("usuario", usuario);
        modelAndView.addObject("username", username);

        return modelAndView;
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable("id") Long id, Model model) {
        Lembrete lembrete = lembreteRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Lembrete inválido:" + id));
        model.addAttribute("lembrete", lembrete);
        return "editar";
    }

    @PostMapping("/editar/{id}")
    public String updateLembrete(@PathVariable("id") long id, @ModelAttribute Lembrete lembrete, Model model) {
        Lembrete lembreteExistente = lembreteRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Lembrete inválido:" + id));

        lembreteExistente.setTitulo(lembrete.getTitulo());
        lembreteExistente.setDescricao(lembrete.getDescricao());
        lembreteExistente.setDataHora(lembrete.getDataHora());

        lembreteRepo.save(lembreteExistente);
        return "redirect:/dashboard";
    }

    @PostMapping("/excluir/{id}")
    public String deleteLembrete(@PathVariable("id") long id) {
        Lembrete lembreteExistente = lembreteRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Lembrete inválido:" + id));

        lembreteRepo.delete(lembreteExistente);
        return "redirect:/dashboard";
    }

}
