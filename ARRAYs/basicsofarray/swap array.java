 public static void main(String []args) {

        int[] a1 = { 1, 2, 3, 4 };
        int[] a2 = { 23, 12, 14, 7 };
        System.out.println(a1[1] + " " + a2[1]);

        swap_in(a1, a2, 1);
        System.out.println(a1[1] + " " + a2[1]);
    }

    

    public static void swap_in(int[] a, int[] b, int c) {
        a = new int[99];
        int d = a[c];
        a[c] = b[c];
        b[c] = d;
    }

   
