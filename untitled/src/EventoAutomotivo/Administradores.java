package EventoAutomotivo;

import org.w3c.dom.ls.LSOutput;

public class Administradores {
    //Criação dos Atributos
    private String nome;
    private Integer id;
    private Boolean respostaAdm;

    //Criação do construtor
    public Administradores(String nome, Boolean respostaAdm) {
        this.nome = nome;
        this.respostaAdm = respostaAdm;
    }

    //Criação dos métodos
    public String retornoResposta() {
        if (respostaAdm == true) {
            return "O evento foi um sucesso!";
        } else {
            return "O evento teve ocorrências";
        }

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

    public Boolean getRespostaAdm() {
        return respostaAdm;
    }

    public void setRespostaAdm(Boolean respostaAdm) {
        this.respostaAdm = respostaAdm;
    }
}



