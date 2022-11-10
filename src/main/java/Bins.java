import java.util.TreeMap;

public class Bins {
    TreeMap<Integer, Integer> count;
    Integer counter = 0;
    Dice dice = new Dice(2);

    public Bins(Integer start, Integer finish) {
        count = new TreeMap<Integer, Integer>();
        for (int i = start; i <= finish; i++) {
            count.put(i, 0);
        }
    }
    public int binCount (int numberOfRolls) {
        int result = 0;
        for(int i = 0; i < numberOfRolls; i++) {
            result = dice.rollValue();
            count.put(result, count.get(result) + 1);
            counter++;
        }
        return result;
    }
    public int getBin (int binNumber) {
        return count.get(binNumber);
    }
    public float getAverage(int binNumber) {
        return (count.get(binNumber) / (float) counter) * 100;
    }
    public String starPrint(int binNumber) {
        String result = "";
            for(int j = 0; j < Math.round(getAverage(binNumber)); j++) {
                result+="*";
            }
        return result;
    }
}