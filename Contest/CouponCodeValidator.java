package Contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CouponCodeValidator {
    public static void main(String[] args) {
        String[] code = {"SAVE20","","PHARMA5","SAVE@20"};
        String[] businessLine = {"restaurant","grocery","pharmacy","restaurant"};
        boolean[] isActive ={ true,true,true,true};
        List<String> Arrayylist = validateCoupons(code,businessLine,isActive);
        System.out.println("I am yours answer" + Arrayylist);

    }

    public static List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        HashMap<String,Integer> businesspriority = new HashMap<>();
        businesspriority.put("electronics", 0);
        businesspriority.put("grocery", 1);
        businesspriority.put("pharmacy", 2);
        businesspriority.put("restaurant", 3);

        List<String[]> validCoupons = new ArrayList<>();

        for(int i = 0 ; i<code.length;i++){
            if(isActive[i] && !code[i].isEmpty() && code[i].matches("[a-zA-Z0-9_]+" ) && businesspriority.containsKey(businessLine[i])){
                validCoupons.add(new String[] {
                    code[i],businessLine[i]
                });
            }

        }

        validCoupons.sort((a,b) -> {
            int cmd = Integer.compare(businesspriority.get(a[1]),businesspriority.get(a[1]));
            if(cmd == 0 ){
                return a[0].compareTo(b[0]);
            }
            return cmd;
        });


        List<String> result = new ArrayList<>();

        for(String[] values : validCoupons){
            result.add(values[0]);
        }
        return result;
    }
}
