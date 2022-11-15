package EventoAutomotivo;

import java.time.LocalDate;

public class FoodTruck {
    //Criação de Atributos da classe "FoodTruck
    private Integer id;
    private String responsavel;
    private String produto;
    private static Double valorProduto;
    private static Integer numeroVendas;

    //Criação de construtor
    public FoodTruck(Integer numeroVendas) {
        this.valorProduto = 50.00;
        this.numeroVendas = numeroVendas;
    }

    //Criação dos métodos
    public static Double faturamento(){
        return valorProduto*numeroVendas;
    }

    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public Integer getNumeroVendas() {
        return numeroVendas;
    }

    public void setNumeroVendas(Integer numeroVendas) {
        this.numeroVendas = numeroVendas;
    }
}
