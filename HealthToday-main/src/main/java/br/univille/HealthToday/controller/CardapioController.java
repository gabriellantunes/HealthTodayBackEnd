package br.univille.HealthToday.controller;

import br.univille.HealthToday.entity.Cardapio;
import br.univille.HealthToday.entity.Usuario;
import br.univille.HealthToday.repository.CardapioRepository;
import br.univille.HealthToday.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CardapioController {

    @Autowired
    private CardapioRepository cardapioRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/cardapio")
    public String getCardapio(HttpSession session, Model model) {
        String username = (String) session.getAttribute("username");
        if (username == null) {
            return "redirect:/login";
        }
        Usuario usuario = usuarioRepository.findByNome(username);
        List<Cardapio> cardapios = cardapioRepository.findByUsuario(usuario);
        Cardapio cardapio;
        if (cardapios.isEmpty()) {
            cardapio = new Cardapio();
            cardapio.setUsuario(usuario);
        } else {
            cardapio = cardapios.get(0);
        }
        model.addAttribute("cardapio", cardapio);
        model.addAttribute("username", username);
        return "cardapio";
    }


    @PostMapping("/cardapio/salvar")
    public String salvarCardapio(Cardapio cardapio, HttpSession session) {
        String username = (String) session.getAttribute("username");
        if (username == null) {
            return "redirect:/login";
        }
        Usuario usuario = usuarioRepository.findByNome(username);
        List<Cardapio> cardapios = cardapioRepository.findByUsuario(usuario);
        if (!cardapios.isEmpty()) {
            Cardapio existingCardapio = cardapios.get(0);
            if (cardapio.getSegunda_cafe_manha() != null) {
                existingCardapio.setSegunda_cafe_manha(cardapio.getSegunda_cafe_manha());
            }
            if (cardapio.getSegunda_lanche_manha() != null) {
                existingCardapio.setSegunda_lanche_manha(cardapio.getSegunda_lanche_manha());
            }
            if (cardapio.getSegunda_almoco() != null) {
                existingCardapio.setSegunda_almoco(cardapio.getSegunda_almoco());
            }
            if (cardapio.getSegunda_cafe_tarde() != null) {
                existingCardapio.setSegunda_cafe_tarde(cardapio.getSegunda_cafe_tarde());
            }
            if (cardapio.getSegunda_janta() != null) {
                existingCardapio.setSegunda_janta(cardapio.getSegunda_janta());
            }
            if (cardapio.getTerca_cafe_manha() != null) {
                existingCardapio.setTerca_cafe_manha(cardapio.getTerca_cafe_manha());
            }
            if (cardapio.getTerca_lanche_manha() != null) {
                existingCardapio.setTerca_lanche_manha(cardapio.getTerca_lanche_manha());
            }
            if (cardapio.getTerca_almoco() != null) {
                existingCardapio.setTerca_almoco(cardapio.getTerca_almoco());
            }
            if (cardapio.getTerca_cafe_tarde() != null) {
                existingCardapio.setTerca_cafe_tarde(cardapio.getTerca_cafe_tarde());
            }
            if (cardapio.getTerca_janta() != null) {
                existingCardapio.setTerca_janta(cardapio.getTerca_janta());
            }
            if (cardapio.getQuarta_cafe_manha() != null) {
                existingCardapio.setQuarta_cafe_manha(cardapio.getQuarta_cafe_manha());
            }
            if (cardapio.getQuarta_lanche_manha() != null) {
                existingCardapio.setQuarta_lanche_manha(cardapio.getQuarta_lanche_manha());
            }
            if (cardapio.getQuarta_almoco() != null) {
                existingCardapio.setQuarta_almoco(cardapio.getQuarta_almoco());
            }
            if (cardapio.getQuarta_cafe_tarde() != null) {
                existingCardapio.setQuarta_cafe_tarde(cardapio.getQuarta_cafe_tarde());
            }
            if (cardapio.getQuarta_janta() != null) {
                existingCardapio.setQuarta_janta(cardapio.getQuarta_janta());
            }
            if (cardapio.getQuinta_cafe_manha() != null) {
                existingCardapio.setQuinta_cafe_manha(cardapio.getQuinta_cafe_manha());
            }
            if (cardapio.getQuinta_lanche_manha() != null) {
                existingCardapio.setQuinta_lanche_manha(cardapio.getQuinta_lanche_manha());
            }
            if (cardapio.getQuinta_almoco() != null) {
                existingCardapio.setQuinta_almoco(cardapio.getQuinta_almoco());
            }
            if (cardapio.getQuinta_cafe_tarde() != null) {
                existingCardapio.setQuinta_cafe_tarde(cardapio.getQuinta_cafe_tarde());
            }
            if (cardapio.getQuinta_janta() != null) {
                existingCardapio.setQuinta_janta(cardapio.getQuinta_janta());
            }
            if (cardapio.getSexta_cafe_manha() != null) {
                existingCardapio.setSexta_cafe_manha(cardapio.getSexta_cafe_manha());
            }
            if (cardapio.getSexta_lanche_manha() != null) {
                existingCardapio.setSexta_lanche_manha(cardapio.getSexta_lanche_manha());
            }
            if (cardapio.getSexta_almoco() != null) {
                existingCardapio.setSexta_almoco(cardapio.getSexta_almoco());
            }
            if (cardapio.getSexta_cafe_tarde() != null) {
                existingCardapio.setSexta_cafe_tarde(cardapio.getSexta_cafe_tarde());
            }
            if (cardapio.getSexta_janta() != null) {
                existingCardapio.setSexta_janta(cardapio.getSexta_janta());
            }
            if (cardapio.getSabado_cafe_manha() != null) {
                existingCardapio.setSabado_cafe_manha(cardapio.getSabado_cafe_manha());
            }
            if (cardapio.getSabado_lanche_manha() != null) {
                existingCardapio.setSabado_lanche_manha(cardapio.getSabado_lanche_manha());
            }
            if (cardapio.getSabado_almoco() != null) {
                existingCardapio.setSabado_almoco(cardapio.getSabado_almoco());
            }
            if (cardapio.getSabado_cafe_tarde() != null) {
                existingCardapio.setSabado_cafe_tarde(cardapio.getSabado_cafe_tarde());
            }
            if (cardapio.getSabado_janta() != null) {
                existingCardapio.setSabado_janta(cardapio.getSabado_janta());
            }
            if (cardapio.getDomingo_cafe_manha() != null) {
                existingCardapio.setDomingo_cafe_manha(cardapio.getDomingo_cafe_manha());
            }
            if (cardapio.getDomingo_lanche_manha() != null) {
                existingCardapio.setDomingo_lanche_manha(cardapio.getDomingo_lanche_manha());
            }
            if (cardapio.getDomingo_almoco() != null) {
                existingCardapio.setDomingo_almoco(cardapio.getDomingo_almoco());
            }
            if (cardapio.getDomingo_cafe_tarde() != null) {
                existingCardapio.setDomingo_cafe_tarde(cardapio.getDomingo_cafe_tarde());
            }
            if (cardapio.getDomingo_janta() != null) {
                existingCardapio.setDomingo_janta(cardapio.getDomingo_janta());
            }
            cardapio = existingCardapio;
        } else {
            cardapio.setUsuario(usuario);
        }
        cardapioRepository.save(cardapio);
        return "redirect:/cardapio";
    }
}
