package doublelinkedlist;

public class mainSkor {
    public static void main(String[] args) {
        skor scores = new skor();

        scores.addLast(80);
        scores.addLast(95);
        scores.addLast(75);

        int maxScore = scores.findMax();

        System.out.println("Skor tertinggi: " + maxScore);
    }
    }
