package EventoAutomotivo;

public class Bilheteria {
    //Criação dos Atributos
    private Integer id;
    private Double precoTotal;
    private Integer qtdIngressos;

    //relacionamento de agregação
    private ZonaAberta zonaAberta;
    private ZonzaCoberta zonzaCoberta;
    private Pedestres pedestres;


    //Criação do Construtor
    public Bilheteria(Integer qtdIngressos) {
        this.qtdIngressos = qtdIngressos;
    }

    //Criação getter e setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public Integer getQtdIngressos() {
        return qtdIngressos;
    }

    public void setQtdIngressos(Integer qtdIngressos) {
        this.qtdIngressos = qtdIngressos;
    }

}


