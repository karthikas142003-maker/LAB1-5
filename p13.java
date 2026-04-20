package sting;
public class p13 {
    public static void main(String[] args) {

        int n = 10000;

        // StringBuffer Performance Test
        StringBuffer sbf = new StringBuffer();
        long start1 = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sbf.append("AIET");
        }

        long end1 = System.nanoTime();
        long timeBuffer = end1 - start1;

        // StringBuilder Performance Test
        StringBuilder sbd = new StringBuilder();
        long start2 = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sbd.append("AIET");
        }

        long end2 = System.nanoTime();
        long timeBuilder = end2 - start2;

        // Display Results
        System.out.println("StringBuffer Time: " + timeBuffer + " ns");
        System.out.println("StringBuilder Time: " + timeBuilder + " ns");

        // Conclusion
        if (timeBuffer > timeBuilder) {
            System.out.println("StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("StringBuffer is faster than StringBuilder.");
        }
    }
}