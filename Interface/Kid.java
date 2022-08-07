import java.util.Random;

public class Kid extends Person{

    public Kid(double inputProbability) {
        Random random = new Random();
        hour = random.nextInt(24);
        age = random.nextInt(21);
        probability = random.nextDouble();
        this.inputProbability = inputProbability;
        start = 18;
        end = 14;
        punishment = 1000;
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
            System.out.printf("%nThe Person’s age is %d. And Kid wants to go out at %d %s.%n%n",age,h,s);
        }else {
            System.out.printf("%nThe Person’s age is %d. And Kid does not want to go out.%n%n",age);
        }
    }
}
