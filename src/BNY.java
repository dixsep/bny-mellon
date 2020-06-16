import java.util.*;

public class BNY {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(1);

        System.out.println(numberOfPairs(list, 10));
        System.out.println(getTotalCandlesBurnt(6, 2, 2));
        System.out.println(dnaComplement("ACCGGGTTTT"));
    }

    public static int numberOfPairs(List<Integer> a, long k) {
        // Write your code here
        Set<Integer> set = new HashSet<>(a);
        List<Integer> list = new ArrayList<>(set);
        Map<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < set.size(); i++) {
            if (!map.containsKey(Long.valueOf(list.get(i)))) {
                if (map.containsKey(k - list.get(i))) {
                    map.put(k - list.get(i), list.get(i));
                } else {
                    map.put(Long.valueOf(list.get(i)), null);
                }
            }
        }
        return (int) map.values().stream().filter(Objects::nonNull).count();
    }

    static int getTotalCandlesBurnt(int amount, int costOfCandle, int noOfResidueCandles) {
        int initialCandles = amount / costOfCandle;

        return initialCandles + getResued(initialCandles, noOfResidueCandles);

    }

    static int getResued(int candles, int noOfResidueCandles) {
        if (candles < noOfResidueCandles)
            return 0;

        int temp = candles / noOfResidueCandles;

        return temp + getResued(temp + candles % noOfResidueCandles, noOfResidueCandles);
    }

    public static String dnaComplement(String s) {
        // Write your code here
        StringBuilder result = new StringBuilder(s);
        result.reverse();

        for (int i = 0; i < result.length(); i++) {
            switch (result.charAt(i)) {
                case 'A':
                    result.setCharAt(i, 'T');
                    break;
                case 'T':
                    result.setCharAt(i, 'A');
                    break;
                case 'C':
                    result.setCharAt(i, 'G');
                    break;
                case 'G':
                    result.setCharAt(i, 'C');
                    break;
            }
        }

        return String.valueOf(result);
    }

    public static int maxStep(int n, int k) {
        // Write your code here

       return (int) Math.pow(2, n);
    }

    private static int action(int n, int k, int max) {
        return 0;
    }
}
