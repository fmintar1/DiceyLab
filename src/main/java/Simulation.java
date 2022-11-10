import java.util.*;

public class Simulation {


    public static void main(String[] args) {
        Dice dice = new Dice(2);
        Bins bins = new Bins(2, 12);
        bins.binCount(1000000);
        System.out.println("\n Dice  |    Rolls  | Percent  |  Level \n");
        bins.count.forEach((k,v) ->
                System.out.printf("  %2d   |   %6d  |  %5.2f%%  |  %s\n", k, v, bins.getAverage(k), bins.starPrint(k)));
        System.out.println("\n Total |  1000000  | 100.00%  |  *");
        }
    }

