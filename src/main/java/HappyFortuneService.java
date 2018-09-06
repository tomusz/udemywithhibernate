import java.util.Random;

public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {

        String[] fortuneArray = {"Today is you lucky day!","Do not go out!", "You got 50/50 chance luck."};
        String randomArray = fortuneArray[new Random().nextInt(fortuneArray.length)];
        return randomArray;
    }
}
