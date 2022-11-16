package EventoAutomotivo;

public class Pedestres {

    //Criação dos Atributos
    private Integer id;
    private Double valorIngresso;

    //Criação do Construtor
    public Pedestres() {
        this.valorIngresso = 30.00;
    }

    //Criação Métodos
    public Double valorTotalPedestre(Integer qtdVendas){
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

    public void setValorIngresso(Double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
}
