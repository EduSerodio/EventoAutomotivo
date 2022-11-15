package EventoAutomotivo;

public class Administradores {
    //Criação dos Atributos
    private String nome;
    private Integer id;

    //Criação do construtor
    public Administradores(String nome, Integer id) {
        this.nome = nome;
        this.id = id;
    }

    //Criação dos métodos
    public void ingressosVendidos(Integer qtdIngressos){

    }

    //Criação getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
