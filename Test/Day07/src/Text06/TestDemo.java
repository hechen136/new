package Text06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        ArrayList<Card> list;
        list = new ArrayList<>();
        ArrayList<Card> getlist;
        addCardList(list);
        getlist = getCard(list);
        for (Card card : getlist) {
            card.showCard();
        }
    }

    private static void addCardList(ArrayList<Card> list) {
        // 花色数组         
        String[] hs = {"黑桃", "红桃", "梅花", "方片"};
        // 点数数组         
        String[] sz = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (String h : hs) {
            for (String aSz : sz) {
                Card card;
                card = new Card(h, aSz);
                list.add(card);
            }
        }
    }

    private static ArrayList<Card> getCard(ArrayList<Card> list) {
        ArrayList<Card> getlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("你要摸几张牌：");
        int n = sc.nextInt();

        if (n < 0 || n > 52) {
            System.out.println("超出范围！");
        }else {
            for (int i = 0; i < n; i++) {
                getlist.add(list.get(r.nextInt(53)));
            }
        }

        return getlist;
    }
}
