public class FindSum {

    public static void main(String[] args) {
         int[] zahl1 = {1,2,3};
         int[] zahl2 = {7,8,9};

        //Add arrays zahl1 and zahl2.
        int [] zwischenarray = add(zahl1, zahl2);
        for (int i = 0; i < zwischenarray.length; i++) {
            System.out.println(zwischenarray[i]);
        }
    }


    private static int[] add(int[] zahl1, int[] zahl2) {
        int len;
        if (zahl1.length < zahl2.length) {
            len = zahl2.length;
        } else {
            len = zahl1.length;
        }

        int[] finalresult = new int [len + 1];
        int carryover = 0;

        for (int i = 0; i <= len-1; i++) {
            int a = (zahl1[i]);
            int b = (zahl2[i]);
            int c = a + b + carryover;
            if (c > 9) {
                carryover = 1;
                c = c - 10;
            } else {
                carryover = 0;
            }
            finalresult[i] = c;
        }

        if (carryover == 1) {
            finalresult[len] = 1;
        }

        return finalresult;
    }
}