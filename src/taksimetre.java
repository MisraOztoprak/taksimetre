import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        double ucret,km;

        System.out.println("gitmek istediğiniz km'yi giriniz:");
        km=input.nextDouble();

        ucret=10+2.20*km;

        if(ucret>20){
            System.out.println("ucretiniz:"+ucret);
        }
        else
            System.out.println("ucretiniz 20 liradır.");
    }

}
