package EventoAutomotivo;

public class Bilheteria {
    //Criação dos Atributos
    private Integer id;
    private Double precoTotal;

    //relacionamento de agregação
    private ZonaAberta zonaAberta;
    private ZonzaCoberta zonzaCoberta;
    private Pedestres pedestres;


    //Criação do Construtor
    public Bilheteria() {

    }
    //Criação de métodos
    public void PrecoTotal(Double valorArrecadado){

    }

    //Criação getter e setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPreco() {
        return precoTotal;
    }

    public void setPreco(Double preco) {
        this.precoTotal = preco;
    }
}


