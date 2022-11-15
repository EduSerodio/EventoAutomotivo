package EventoAutomotivo;

public class Main {
    public static void main(String[] args) {

        FoodTruck foodTruck1 = new FoodTruck(150);
        System.out.println("O valor do faturamento do foodtruck1 foi de:" + foodTruck1.faturamento() + " reais." );
        FoodTruck foodTruck2 = new FoodTruck(50);
        System.out.println("O valor do faturamento do foodtruck2 foi de:" + foodTruck2.faturamento() + " reais.");
        FoodTruck foodTruck3 = new FoodTruck(85);
        System.out.println("O valor do faturamento do foodtruck3 foi de:" + foodTruck3.faturamento() + " reais.\n");


        Fotografos fotografos1 = new Fotografos(752);
        System.out.println("O fotografo1 teve um faturamento total de:" + fotografos1.totalFotos() + " reais.");
        Fotografos fotografos2 = new Fotografos(232);
        System.out.println("O fotografo2 teve um faturamento total de:" + fotografos2.totalFotos() + " reais.");
        Fotografos fotografos3 = new Fotografos(100);
        System.out.println("O fotografo3 teve um faturamento total de:" + fotografos3.totalFotos() + " reais.\n");


    }

}
