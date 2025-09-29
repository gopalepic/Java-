package Contest.Biweekly.Biweekly166;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityFrequencyElemnt {

    public static void main(String[] args) {
        String s = "aaabbbccdddde";
       String ss = maxFrequencyChars(s);
       System.out.println(ss);
    }

    public static String maxFrequencyChars(String s) {
     Map<Character, Integer> freq = new HashMap<>();
    
    // Count character frequencies
    for (char c : s.toCharArray()) {
        freq.put(c, freq.getOrDefault(c, 0) + 1);
    }

    // Count how many characters have each frequency
    Map<Integer, Integer> freqCount = new HashMap<>();
    for (int f : freq.values()) {
        freqCount.put(f, freqCount.getOrDefault(f, 0) + 1);
    }

    // Find the frequency with maximum count (majority frequency group)
    int maxCount = 0;
    int targetFreq = 0;
    for (Map.Entry<Integer, Integer> entry : freqCount.entrySet()) {
        int frequency = entry.getKey();
        int count = entry.getValue();
        if (count > maxCount || (count == maxCount && frequency > targetFreq)) {
            maxCount = count;
            targetFreq = frequency;
        }
    }

    StringBuilder sb = new StringBuilder();
    for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
        if (entry.getValue() == targetFreq) {
            sb.append(entry.getKey());
        }
    }
    return sb.toString();
}
}
