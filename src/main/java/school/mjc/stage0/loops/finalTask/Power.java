package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int product = numberToPrint;
        for(int i = 2; i <= power; i++) {
            product *= numberToPrint;
        }
        System.out.println(product);
    }

    public static void main(String[] args) {
        new Power().printPower(2, 5);
    }
}
