package code.AfterJob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortsCharacterByFrequency {
    public static void main(String[] args) {
        String s = "tree";
        frequencySort(s);
    }

    public static String frequencySort(String s) {

        int[] freqArr = new int[128];

        for (char c : s.toCharArray()) {
            freqArr[c]++;

        }

        int maxcnt = 0;
        for (int i = 0; i < freqArr.length; i++) {
            if (freqArr[i] > maxcnt) {
                maxcnt = freqArr[i];
            }
        }

        List<Character>[] buckets = new List[maxcnt + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (int i = 0; i < freqArr.length; i++) {
            if (freqArr[i] > 0) {
                buckets[freqArr[i]].add((char) i);
            }
        }

        return buckets.toString();

    }
}
