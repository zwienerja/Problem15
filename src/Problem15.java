public class Problem15 {

    public static void main(String[] args) {
        long count = 1;
        int totalMoves = 40;
        int rightOrDownMoves = 20;

        for (int i = 0; i < rightOrDownMoves; i++) {
            count = (count * (totalMoves - i)) / (i + 1);
        }

        System.out.println(count);
    }
}

