package ro.fasttrackit.curs14.codeWars.exercise5;

import java.util.Arrays;

public class CountIPAddresses {
    public static long ipsBetween(String start, String end) {
        int result = 0;
        String[] ip1 = start.split("\\.");
        String[] ip2 = end.split("\\.");
        System.out.println(Arrays.toString(ip1));
        System.out.println(Arrays.toString(ip2));
        result += Integer.parseInt(ip2[3]) - Integer.parseInt(ip1[3]);
        System.out.println("result before for: " + result);
        for (int i = 2; i >= 0; i--) {
            if (Integer.parseInt(ip2[i]) - Integer.parseInt(ip1[i]) != 0) {
                result += Math.pow(256, (Integer.parseInt(ip2[i]) - Integer.parseInt(ip1[i])));
            }
//            result += ((Integer.parseInt(ip2[i]) - Integer.parseInt(ip1[i])) * 256);
            System.out.println("result for " + i + " = " + result);
        }
        return result;
    }

}
