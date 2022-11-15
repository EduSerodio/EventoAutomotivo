package EventoAutomotivo;

public class ZonaAberta {

    //Criação dos Atributos
    private Integer id;
    private Double valorIngresso;

    //Criação do construtor
    public ZonaAberta() {
        this.valorIngresso = 70.00;
    }
    //Criação Métodos
    public Double valorTotalZonaAberta(Integer qtdVendas){
        return valorIngresso*qtdVendas;
    }

    //Criação getters e setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(Double valorIgresso) {
        this.valorIngresso = valorIgresso;
    }
}
