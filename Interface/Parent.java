import java.util.Random;

public class Parent extends Person{


    public Parent(double inputProbability) {
        Random random = new Random();
        hour = random.nextInt(24);
        age = random.nextInt(44) + 21;
        probability = random.nextDouble();
        this.inputProbability = inputProbability;
        start = 19;
        end = 5;
        punishment = 2000;
        showFreeHours();
    }

    @Override
    public void showFreeHours() {
        super.showFreeHours();
        if(inputProbability<=probability){
            int h = hour%12;
            if(h == 0)
                h = 12;
            String s = "am";
            if(hour>=12)
                s = "pm";
            System.out.printf("%nThe Person’s age is %d. And Parent wants to go out at %d %s.%n%n",age,h,s);
        }else {
            System.out.printf("%nThe Person’s age is %d. And Parent does not want to go out.%n%n",age);
        }
    }
}
