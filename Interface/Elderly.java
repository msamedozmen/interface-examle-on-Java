import java.util.Random;

public class Elderly extends Person{
    public Elderly(double inputProbability) {
        Random random = new Random();
        hour = random.nextInt(24);
        age = random.nextInt(35) + 65;
        probability = random.nextDouble();
        this.inputProbability = inputProbability;
        start = 14;
        end = 10;
        punishment = 3000;
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
            System.out.printf("%nThe Person’s age is %d. And elderly wants to go out at %d %s.%n%n",age,h,s);
        }else {
            System.out.printf("%nThe Person’s age is %d. And elderly does not want to go out.%n%n",age);
        }
    }
}
