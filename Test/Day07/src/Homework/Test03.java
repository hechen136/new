package Homework;

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("abc");
        list.add("def");
        list.add("def");
        list.add("ghi");
        list.add("def");
        list.add("hij");
        list.add("jkol");

        int count = 0;
        for (String aList : list) {
            if (aList.equals("def")) {
                count++;
            }
        }
        System.out.println("\"def\"字符串一共出现" + count + "次");

        getString(list);
    }

    private static void getString(ArrayList<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).equals("def")) {
                list.remove(i);
            }
            //System.out.println(list.size() + " ");
        }

        for (String aList : list) {
            System.out.print(aList + " ");
        }

    }
}
