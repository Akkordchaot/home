package de.akkordchaot.git.first.ProjectEuler;

import java.math.BigDecimal;

public class PowerDigitSum {
    
    public static void main(String[] args) {
        
        BigDecimal d = new BigDecimal(23415);
        System.out.println(digitSum(d.toPlainString()));
    }
    
    public static int calc() {
        BigDecimal b = new BigDecimal(2);
        b = b.pow(1000);
        b.toPlainString();
        return 0;
    }
    
    public static int digitSum(String str) {
        int dSum = 0;
        for (char digit : str.toCharArray()) {
            dSum += Integer.valueOf(digit);
        }
        return dSum;
    }
}
