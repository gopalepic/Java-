package code.Dailyquestion;

import java.util.Arrays;

import code.Patterns.pattern2;

public class VersionsString {
    public static void main(String[] args) {

        String version1 = "1.0";
        String version2 = "1.0.0.0";

        int value = compareVersion(version1, version2);
        System.out.println("ANS " + value);

    }

    
    // public static int compareVersion(String version1, String version2) {

        // Way 1 
        
        // String[] parts1 = version1.split("\\.");
        // String[] parts2 = version2.split("\\.");

       
        // int n = parts1.length, m = parts2.length;
        // int maxLen = Math.max(n, m);

        // for (int i = 0; i < maxLen; i++) {
        //     int num1 = i < n ? Integer.parseInt(parts1[i]) : 0;
        //     int num2 = i < m ? Integer.parseInt(parts2[i]) : 0;

        //     if (num1 < num2) return -1;
        //     if (num1 > num2) return 1;
        // }
        // return 0;

        // Approach 2 
    // }

    
    public static int compareVersion(String version1, String version2) {
        int n = version1.length(), m = version2.length();
        int i = 0, j = 0;
        
        while (i < n || j < m) {
            int num1 = 0, num2 = 0;
            
            // Read next number from version1
            while (i < n && version1.charAt(i) != '.') {
                num1 = num1 * 10 + (version1.charAt(i) - '0');
                i++;
            }
            
            // Read next number from version2
            while (j < m && version2.charAt(j) != '.') {
                num2 = num2 * 10 + (version2.charAt(j) - '0');
                j++;
            }
            
            if (num1 < num2) return -1;
            if (num1 > num2) return 1;
            
            i++; // skip dot
            j++; // skip dot
        }
        return 0;
    
}

}
