package EventoAutomotivo;

public class ZonzaCoberta {

    //Criação Atributos
    private Integer id;
    private Double valorIngresso;

    //Criação do Construtor
    public ZonzaCoberta() {
        this.valorIngresso = 100.00;
    }
    //Criação Métodos
    public Double valorTotalZonaCoberta(Integer qtdVendas){
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
