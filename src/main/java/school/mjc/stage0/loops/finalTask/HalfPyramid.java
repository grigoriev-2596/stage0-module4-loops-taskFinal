package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for(int i = 1; i <= cathetusLength; i++) {
            System.out.println(createRow(i, cathetusLength));
        }
    }

    public  String createRow(int n, int rowLength) {
        StringBuilder row = new StringBuilder();
        for(int i = 0; i < rowLength; i++) {
            if (i < rowLength - n) row.append(" ");
            else row.append("*");
        }
        return row.toString();
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
