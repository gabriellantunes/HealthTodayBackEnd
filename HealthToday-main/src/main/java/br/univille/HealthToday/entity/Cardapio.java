package br.univille.HealthToday.entity;

import javax.persistence.*;

@Entity
public class Cardapio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario;

    private String segunda_cafe_manha;
    private String segunda_lanche_manha;
    private String segunda_almoco;
    private String segunda_cafe_tarde;
    private String segunda_janta;
    private String terca_cafe_manha;
    private String terca_lanche_manha;
    private String terca_almoco;
    private String terca_cafe_tarde;
    private String terca_janta;
    private String quarta_cafe_manha;
    private String quarta_lanche_manha;
    private String quarta_almoco;
    private String quarta_cafe_tarde;
    private String quarta_janta;
    private String quinta_cafe_manha;
    private String quinta_lanche_manha;
    private String quinta_almoco;
    private String quinta_cafe_tarde;
    private String quinta_janta;
    private String sexta_cafe_manha;
    private String sexta_lanche_manha;
    private String sexta_almoco;
    private String sexta_cafe_tarde;
    private String sexta_janta;
    private String sabado_cafe_manha;
    private String sabado_lanche_manha;
    private String sabado_almoco;
    private String sabado_cafe_tarde;
    private String sabado_janta;
    private String domingo_cafe_manha;
    private String domingo_lanche_manha;
    private String domingo_almoco;
    private String domingo_cafe_tarde;
    private String domingo_janta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getSegunda_cafe_manha() {
        return segunda_cafe_manha;
    }

    public void setSegunda_cafe_manha(String segunda_cafe_manha) {
        this.segunda_cafe_manha = segunda_cafe_manha;
    }

    public String getSegunda_lanche_manha() {
        return segunda_lanche_manha;
    }

    public void setSegunda_lanche_manha(String segunda_lanche_manha) {
        this.segunda_lanche_manha = segunda_lanche_manha;
    }

    public String getSegunda_almoco() {
        return segunda_almoco;
    }

    public void setSegunda_almoco(String segunda_almoco) {
        this.segunda_almoco = segunda_almoco;
    }

    public String getSegunda_cafe_tarde() {
        return segunda_cafe_tarde;
    }

    public void setSegunda_cafe_tarde(String segunda_cafe_tarde) {
        this.segunda_cafe_tarde = segunda_cafe_tarde;
    }

    public String getSegunda_janta() {
        return segunda_janta;
    }

    public void setSegunda_janta(String segunda_janta) {
        this.segunda_janta = segunda_janta;
    }

    public String getTerca_cafe_manha() {
        return terca_cafe_manha;
    }

    public void setTerca_cafe_manha(String terca_cafe_manha) {
        this.terca_cafe_manha = terca_cafe_manha;
    }

    public String getTerca_lanche_manha() {
        return terca_lanche_manha;
    }

    public void setTerca_lanche_manha(String terca_lanche_manha) {
        this.terca_lanche_manha = terca_lanche_manha;
    }

    public String getTerca_almoco() {
        return terca_almoco;
    }

    public void setTerca_almoco(String terca_almoco) {
        this.terca_almoco = terca_almoco;
    }

    public String getTerca_cafe_tarde() {
        return terca_cafe_tarde;
    }

    public void setTerca_cafe_tarde(String terca_cafe_tarde) {
        this.terca_cafe_tarde = terca_cafe_tarde;
    }

    public String getTerca_janta() {
        return terca_janta;
    }

    public void setTerca_janta(String terca_janta) {
        this.terca_janta = terca_janta;
    }

    public String getQuarta_cafe_manha() {
        return quarta_cafe_manha;
    }

    public void setQuarta_cafe_manha(String quarta_cafe_manha) {
        this.quarta_cafe_manha = quarta_cafe_manha;
    }

    public String getQuarta_lanche_manha() {
        return quarta_lanche_manha;
    }

    public void setQuarta_lanche_manha(String quarta_lanche_manha) {
        this.quarta_lanche_manha = quarta_lanche_manha;
    }

    public String getQuarta_almoco() {
        return quarta_almoco;
    }

    public void setQuarta_almoco(String quarta_almoco) {
        this.quarta_almoco = quarta_almoco;
    }

    public String getQuarta_cafe_tarde() {
        return quarta_cafe_tarde;
    }

    public void setQuarta_cafe_tarde(String quarta_cafe_tarde) {
        this.quarta_cafe_tarde = quarta_cafe_tarde;
    }

    public String getQuarta_janta() {
        return quarta_janta;
    }

    public void setQuarta_janta(String quarta_janta) {
        this.quarta_janta = quarta_janta;
    }

    public String getQuinta_cafe_manha() {
        return quinta_cafe_manha;
    }

    public void setQuinta_cafe_manha(String quinta_cafe_manha) {
        this.quinta_cafe_manha = quinta_cafe_manha;
    }

    public String getQuinta_lanche_manha() {
        return quinta_lanche_manha;
    }

    public void setQuinta_lanche_manha(String quinta_lanche_manha) {
        this.quinta_lanche_manha = quinta_lanche_manha;
    }

    public String getQuinta_almoco() {
        return quinta_almoco;
    }

    public void setQuinta_almoco(String quinta_almoco) {
        this.quinta_almoco = quinta_almoco;
    }

    public String getQuinta_cafe_tarde() {
        return quinta_cafe_tarde;
    }

    public void setQuinta_cafe_tarde(String quinta_cafe_tarde) {
        this.quinta_cafe_tarde = quinta_cafe_tarde;
    }

    public String getQuinta_janta() {
        return quinta_janta;
    }

    public void setQuinta_janta(String quinta_janta) {
        this.quinta_janta = quinta_janta;
    }

    public String getSexta_cafe_manha() {
        return sexta_cafe_manha;
    }

    public void setSexta_cafe_manha(String sexta_cafe_manha) {
        this.sexta_cafe_manha = sexta_cafe_manha;
    }

    public String getSexta_lanche_manha() {
        return sexta_lanche_manha;
    }

    public void setSexta_lanche_manha(String sexta_lanche_manha) {
        this.sexta_lanche_manha = sexta_lanche_manha;
    }

    public String getSexta_almoco() {
        return sexta_almoco;
    }

    public void setSexta_almoco(String sexta_almoco) {
        this.sexta_almoco = sexta_almoco;
    }

    public String getSexta_cafe_tarde() {
        return sexta_cafe_tarde;
    }

    public void setSexta_cafe_tarde(String sexta_cafe_tarde) {
        this.sexta_cafe_tarde = sexta_cafe_tarde;
    }

    public String getSexta_janta() {
        return sexta_janta;
    }

    public void setSexta_janta(String sexta_janta) {
        this.sexta_janta = sexta_janta;
    }

    public String getSabado_cafe_manha() {
        return sabado_cafe_manha;
    }

    public void setSabado_cafe_manha(String sabado_cafe_manha) {
        this.sabado_cafe_manha = sabado_cafe_manha;
    }

    public String getSabado_lanche_manha() {
        return sabado_lanche_manha;
    }

    public void setSabado_lanche_manha(String sabado_lanche_manha) {
        this.sabado_lanche_manha = sabado_lanche_manha;
    }

    public String getSabado_almoco() {
        return sabado_almoco;
    }

    public void setSabado_almoco(String sabado_almoco) {
        this.sabado_almoco = sabado_almoco;
    }

    public String getSabado_cafe_tarde() {
        return sabado_cafe_tarde;
    }

    public void setSabado_cafe_tarde(String sabado_cafe_tarde) {
        this.sabado_cafe_tarde = sabado_cafe_tarde;
    }

    public String getSabado_janta() {
        return sabado_janta;
    }

    public void setSabado_janta(String sabado_janta) {
        this.sabado_janta = sabado_janta;
    }

    public String getDomingo_cafe_manha() {
        return domingo_cafe_manha;
    }

    public void setDomingo_cafe_manha(String domingo_cafe_manha) {
        this.domingo_cafe_manha = domingo_cafe_manha;
    }

    public String getDomingo_lanche_manha() {
        return domingo_lanche_manha;
    }

    public void setDomingo_lanche_manha(String domingo_lanche_manha) {
        this.domingo_lanche_manha = domingo_lanche_manha;
    }

    public String getDomingo_almoco() {
        return domingo_almoco;
    }

    public void setDomingo_almoco(String domingo_almoco) {
        this.domingo_almoco = domingo_almoco;
    }

    public String getDomingo_cafe_tarde() {
        return domingo_cafe_tarde;
    }

    public void setDomingo_cafe_tarde(String domingo_cafe_tarde) {
        this.domingo_cafe_tarde = domingo_cafe_tarde;
    }

    public String getDomingo_janta() {
        return domingo_janta;
    }

    public void setDomingo_janta(String domingo_janta) {
        this.domingo_janta = domingo_janta;
    }
}
