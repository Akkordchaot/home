package de.akkordchaot.git.first.ProjectEuler;

import java.math.BigDecimal;
import java.util.BitSet;
import java.util.Scanner;

public class LatticePaths {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while(sc.hasNextInt()) {
                System.out.println(calc(sc.nextInt()).toPlainString());
            }
            sc.close();
    }
    
    public static BigDecimal calc(int n) {
        int[] ks = new int[]{n,n};
        return nPs(2*n, ks);
    }
    
    public static BigDecimal nPs(int n, int[] ks) {
        BigDecimal r = fac(n);
        for (int k : ks) {
            r = r.divide(fac(k));
        }
        return r;
    }
    
    public static BigDecimal fac(int n) {
       BigDecimal fac = new BigDecimal(1);
       for (int i = 1; i <= n; i++) {
           fac = fac.multiply(new BigDecimal(i));
       }
        return fac;
    }
    
    
    public static long getPos(int n) {
        long possibilities = 0;
        
        for (long b = (long) Math.pow(2, n) - 1; b < Math.pow(2, 2 * n); b++) {
            if (getBitSet(b, 2 * n)) {
                possibilities++;
                //System.out.println(addZeros(Integer.toBinaryString(b), 2 * n));
            }
        }
        return possibilities;
    }
    
    public static boolean getBitSet(long num, int size){
        
        String str = addZeros(Long.toBinaryString(num), size);
        char[] bits = str.toCharArray();
        int ones = 0;
        int zeros = 0;
        
        for(int i = 0; i < bits.length; i++){  
            if(bits[i] == '1'){
                ones++;
            }
            else if (bits[i] == '0') {
                zeros++;
            }
        }
        return ones == zeros;
    }
    
    public static String addZeros(String b, int n) {
        while (b.length() < n) {
            b = "0" + b;
        }
        return b;
    }
    
    
    public static boolean zerosEqualsOnes(BitSet bs) {
        int ones = 0;
        int zeros = 0;
        for (int i = 0; i < bs.size(); i++) {
            if (bs.get(i)) {
                ones++;
            } else {
                zeros++;
            }
        }
        return ones == zeros;
    }
}
