package EventoAutomotivo;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //Criação das 3 instâncias da classe EventoAutomotivo
        EventoAutomotivo eventoAutomotivo1 = new EventoAutomotivo(LocalDate.of(2020,12,02), "Ibuina");
        System.out.println("O evento1 será realizado na data:" + eventoAutomotivo1.getData() + " no local:" + eventoAutomotivo1.getLocal());
        EventoAutomotivo eventoAutomotivo2 = new EventoAutomotivo(LocalDate.of(2020,8,10), "Águas de lindóia");
        System.out.println("O evento2 será realizado na data:" + eventoAutomotivo2.getData() + " no local:" + eventoAutomotivo2.getLocal());
        EventoAutomotivo eventoAutomotivo3 = new EventoAutomotivo(LocalDate.of(2020,2,26), "Aldeia da serra");
        System.out.println("O evento3 será realizado na data:" + eventoAutomotivo3.getData() + " no local:" + eventoAutomotivo3.getLocal() +"\n");

        //Criação das 3 instâncias da classe de Foodtruck
        FoodTruck foodTruck1 = new FoodTruck(150);
        System.out.println("O valor do faturamento do foodtruck1 foi de:" + foodTruck1.faturamento() + " reais." );
        FoodTruck foodTruck2 = new FoodTruck(50);
        System.out.println("O valor do faturamento do foodtruck2 foi de:" + foodTruck2.faturamento() + " reais.");
        FoodTruck foodTruck3 = new FoodTruck(85);
        System.out.println("O valor do faturamento do foodtruck3 foi de:" + foodTruck3.faturamento() + " reais.\n");

        //Criação das3 instâncias da classe Fotografos
        Fotografos fotografos1 = new Fotografos(752);
        System.out.println("O fotografo1 teve um faturamento total de:" + fotografos1.totalFotos() + " reais.");
        Fotografos fotografos2 = new Fotografos(232);
        System.out.println("O fotografo2 teve um faturamento total de:" + fotografos2.totalFotos() + " reais.");
        Fotografos fotografos3 = new Fotografos(100);
        System.out.println("O fotografo3 teve um faturamento total de:" + fotografos3.totalFotos() + " reais.\n");

        //Criação das 3 instancias da classe Administrador
        Administradores administradores1 = new Administradores("Carlos", true);
        System.out.println( "O(a) administrador " + administradores1.getNome() + " reportou que: " + administradores1.retornoResposta());
        Administradores administradores2 = new Administradores("Katlyn", false);
        System.out.println("O(a) administradora " + administradores2.getNome() +" reportou que: " + administradores2.retornoResposta());
        Administradores administradores3 = new Administradores("Eduardo", true);
        System.out.println("O(a) administrador " + administradores3.getNome() + " reportou que: " + administradores3.retornoResposta() + "\n");

        //Criação das 3 instâncias da classe Bilheteria
        Pedestres pedestres = new Pedestres();
        System.out.println("A bilheteria lucrou um total de:" + pedestres.valorTotalPedestre(150) + " no final do evento com igressos de pedestres");
        ZonaAberta zonaAberta = new ZonaAberta();
        System.out.println("A bilheteria lucoru um totoal de:" + zonaAberta.valorTotalZonaAberta(200) + " no final do evento com ingressos da zona aberta");
        ZonzaCoberta zonzaCoberta = new ZonzaCoberta();
        System.out.println("A bilheteria lucrou um total de: " + zonzaCoberta.valorTotalZonaCoberta(50) + " no final do evento com ingressos da zona coberta");

    }

}
