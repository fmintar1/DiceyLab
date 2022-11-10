import java.util.*;

public class Simulation {
    public static void main(String[] args) {
        Dice dice = new Dice(2);
        Bins bins = new Bins(2, 12);
        int numberOfRolls = 2147483647;
        bins.binCount(numberOfRolls);
        System.out.println("\n Dice  |    Rolls     | Percent  |  Level \n");
        bins.count.forEach((k,v) ->
                System.out.printf("  %2d   |   %9d  |  %5.2f%%  |  %s\n", k, v, bins.getAverage(k), bins.starPrint(k)));
        System.out.println("\n Total |  " + numberOfRolls + "  | 100.00%  |  *");
        }
    }

