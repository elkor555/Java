import java.util.Random;
public class zmienne {
    public static void main(String[] args) {
        Random rand = new Random();
        int x=rand.nextInt(50);
        int y=rand.nextInt(50);
        boolean isXhigh =(x>y);
        boolean is2xhigh= ((2*x)>y);
        boolean i2isX =(y < (x+3))&& (y> (x-2));
        int z= (x*y);
        boolean a= ((z%2)==0);
        System.out.println("x= " + x);
        System.out.println("y= " + y);
        System.out.println("czy x jest wieksze od y : " + isXhigh);
        System.out.println("czy x * 2 jest wiekszy od Y : " + is2xhigh);
        System.out.println("Czy y jest mniej od sum x+3 i jednocze większe od x pomniejszonego o 2? : " + i2isX);
        System.out.println("czy parzyste "+a);


    }
}
