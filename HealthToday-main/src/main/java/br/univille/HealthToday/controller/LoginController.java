package br.univille.HealthToday.controller;

import br.univille.HealthToday.entity.Usuario;
import br.univille.HealthToday.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {
    @Autowired
    private UsuarioRepository usuarioRepo;

    @PostMapping("/login")
    public String login(@RequestParam("email") String email, @RequestParam("senha") String senha, RedirectAttributes redirectAttributes, HttpSession session) {
        Usuario usuario = usuarioRepo.findByEmailAndSenha(email, senha);
        if (usuario != null) {
            session.setAttribute("username", usuario.getNome());

            return "redirect:/dashboard";
        } else {
            redirectAttributes.addFlashAttribute("loginError", true);
            return "redirect:/login";
        }
    }

    @GetMapping("/login")
    public String showLoginForm(HttpServletResponse response, HttpSession session) {
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
        response.setHeader("Pragma", "no-cache"); // HTTP 1.0
        response.setHeader("Expires", "0"); // Proxies

        String username = (String) session.getAttribute("username");

        if (username != null) {
            return "redirect:/dashboard";
        }

        return "login";
    }
}
