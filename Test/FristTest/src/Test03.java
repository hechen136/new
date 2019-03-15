public class Test03 {
    public static void main(String[] args) {
        int[] arr = {15,26,98,56,77,42,30,14,45};
        printArr(arr);
        int max = getMax(arr);
        int min = getMin(arr);

        System.out.println("数组arr元素中最大值为：" + max);
        System.out.println("数组arr元素中最小值为：" + min);

        getNum(arr);
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
                break;
            }
            System.out.print(arr[i] + ",");
        }
    }

    //
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void getNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 != 0) {
                arr[i] = 0;
            } else {
                if (arr[i] % 5 != 0) {
                    arr[i] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println("数组中即是3的倍数又是5的倍数的元素有:"+arr[i]);
            }
        }
    }
}
