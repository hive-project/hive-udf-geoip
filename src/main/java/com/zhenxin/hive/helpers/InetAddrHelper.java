package com.zhenxin.hive.helpers;
public class InetAddrHelper {
    public static long IPToLong(String addr) {
        String[] addrArray = addr.split("\\.");
        long num = 0;
        for (int i = 0; i < addrArray.length; i++) {
            int power = 3 - i;

            num += ((Integer.parseInt(addrArray[i]) % 256 * Math.pow(256, power)));
        }
        return num;
    }

    public static String longToIP(long ip) {
        return ((ip >> 24) & 0xFF) + "."
                + ((ip >> 16) & 0xFF) + "."
                + ((ip >> 8) & 0xFF) + "."
                + (ip & 0xFF);
    }
}
