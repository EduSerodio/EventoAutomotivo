package EventoAutomotivo;


import java.time.LocalDate;

public class EventoAutomotivo {

    //Criação de Atributos
    private LocalDate data;
    private String local;

    //Relacionamento de Associação
    private Fotografos[] fotografos;
    private FoodTruck[] foodTrucks;
    private Bilheteria[] bilheteria;
    private Administradores[] administradores;

    //Criação de Construtor
    public EventoAutomotivo(LocalDate data, String local) {
        this.data = data;
        this.local = local;
    }

    //Criação dos setters e getters
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
