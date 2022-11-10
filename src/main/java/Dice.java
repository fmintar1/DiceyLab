import java.util.Random;

public class Dice {
        Random random = new Random();
        int numOfDice;

        public Dice(int numOfDice) {
            this.numOfDice = numOfDice;
        }
        public int rollValue() {
            int dieSum = 0;
            for(int i = 1; i <= numOfDice; i++) {
                dieSum += random.nextInt(6) + 1;
            }
            return dieSum;
    }

}
