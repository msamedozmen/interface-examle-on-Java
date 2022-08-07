import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Policeman policeman = new Policeman();
        int N = 1;
        while (N == 1){
            System.out.printf("Choose One option%n(1) Go out %n(2) Terminate%n");
            N = scanner.nextInt();
            if(N==1){
            System.out.printf("%nEnter the probability of going out%n");
            double probability = scanner.nextDouble();
            int randomPerson = random.nextInt(3);
            switch (randomPerson){
               case 0 :
                    policeman.add(new Kid(probability));
                    break;
                case 1:
                    policeman.add(new Parent(probability));
                    break;
                case 2:
                    policeman.add(new Elderly(probability));
                    break;
            }
            }else{
                System.out.printf("%nTerminated%nThe treasury cash: %d Turkish Lira%n%n",policeman.treasury);
            }
        }
    }
}
