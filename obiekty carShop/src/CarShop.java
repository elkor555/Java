import java.util.concurrent.Callable;

public class CarShop {
    public static void main(String[] args) {
        Car sam1 = new Car();
        sam1.marka= "Audi";
        sam1.model= "A6";
        sam1.pojemność= 2.0;
        sam1.moc= 200;
        sam1.kolor= "różowy";

        Car sam2 = new Car();
        sam2.marka= "VW";
        sam2.model= "jetta";
        sam2.pojemność= 2.5;
        sam2.moc= 120;
        sam2.kolor= "brak danych";
        System.out.println(sam1.kolor + sam1.pojemność);


    }
}
