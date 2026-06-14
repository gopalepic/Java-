package code.AfterJob;

import java.util.*;

public class totalFruit {
    public static void main(String[] args) {

        int[] fruits = { 1, 2, 3, 2, 2 };
        System.out.println(totalFruit(fruits));
    }

    // public static int totalFruit(int[] fruits) {

    // int maxfruits = 0;

    // for (int i = 0; i < fruits.length; i++) {

    // HashMap<Integer, Integer> map = new HashMap<>();

    // int cnt = 0;
    // int j = i;
    // while (map.size() < 3 && j < fruits.length) {

    // int num = fruits[j];
    // if (!map.containsKey(num) ) {

    // map.put(num, 0);
    // }
    // if(map.size()<=2) cnt++;

    // maxfruits = Math.max(cnt, maxfruits);
    // j++;

    // }
    // }
    // return maxfruits;
    // }

    public static int totalFruit(int[] fruits) {

        int maxFruits = 0;
        int i = 0; // left pointer

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j = 0; j < fruits.length; j++) {

            int fruit = fruits[j];

            map.put(fruit, map.getOrDefault(fruit, 0) + 1);

            while (map.size() > 2) {

                int leftFruit = fruits[i];

                map.put(leftFruit, map.get(leftFruit) - 1);

                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }

                i++;
            }

            maxFruits = Math.max(maxFruits, j - i + 1);
        }

        return maxFruits;

    }
}
