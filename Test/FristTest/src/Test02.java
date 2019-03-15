public class Test02 {
    public static void main(String[] args) {
        getNum ();
        getNumber();
    }

    public static void getNum () {
        int count = 0;
        int[] a = new int[5];
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l  < 10; l++) {
                        for (int m = 0; m < 10; m++) {
                            a[0] = i;
                            a[1] = j;
                            a[2] = k;
                            a[3] = l;
                            a[4] = m;
                            if (a[0] == a[4] && a[1] == a[3]) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static void getNumber() {
        int count = 0;
        int[] a = new int[7];
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l  < 10; l++) {
                        for (int m = 0; m < 10; m++) {
                            for (int n = 0; n < 10; n++) {
                                for (int o = 0; o < 10; o++) {
                                    a[0] = i;
                                    a[1] = j;
                                    a[2] = k;
                                    a[3] = l;
                                    a[4] = m;
                                    a[5] = n;
                                    a[6] = o;
                                    if (a[0] ==a[6] && a[1] == a[5] && a[2] == a[4]) {
                                        count++;
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
