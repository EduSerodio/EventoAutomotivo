package EventoAutomotivo;

import java.time.LocalDate;

public class Fotografos{

    //Criação dos atributos
    private Integer id;
    private String nome;
    private Double preco;

    //Agregação
    private Integer qtdFotos;
    private Double precoFoto;

    //Criação do construtor
    public Fotografos(Integer qtdFotos) {
        this.qtdFotos = qtdFotos;
        this.precoFoto = 10.00;
    }

    //Métodos
    public Double totalFotos(){
        return precoFoto*qtdFotos;
    }

    //Criação getters e setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQtdFotos() {
        return qtdFotos;
    }

    public void setQtdFotos(Integer qtdFotos) {
        this.qtdFotos = qtdFotos;
    }

    public Double getPrecoFoto() {
        return precoFoto;
    }

    public void setPrecoFoto(Double precoFoto) {
        this.precoFoto = precoFoto;
    }
}
