package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for(int i = 1; i <= cathetusLength; i++){
            printRow(i, cathetusLength);
        }
    }

    public void printRow(int n, int rowLength) {
        final int SPACE_AMOUNT = rowLength - n;
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < SPACE_AMOUNT; i++) {
            res.append(" ");
        }
        res.append(getNumberInRow(n));
        System.out.println(res);
    }


    public String getNumberInRow(int n) {
        StringBuilder res = new StringBuilder();
        int inc = -1;
        for(int i = n ; i <= n ; i+= inc){
            res.append(i);
            if (i == 1) inc = 1;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
