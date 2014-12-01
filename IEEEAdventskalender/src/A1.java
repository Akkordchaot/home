import java.math.BigDecimal;
import java.util.Scanner;



public class A1 {

    static final BigDecimal FLASCHE_VOL = new BigDecimal(0.5);
    static final BigDecimal KISTE_VOL = FLASCHE_VOL.multiply(new BigDecimal(20));
    static final BigDecimal PALETTE_VOL = KISTE_VOL.multiply(new BigDecimal(45));
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line;
    }
    
    
    public static BigDecimal[] getPalettenKistenFlaschen(BigDecimal b) {
        BigDecimal[] pkf = new BigDecimal[3];
        if (b.divide(PALETTE_VOL).compareTo(new BigDecimal(1)) >= 0) {
            pkf[0] = b.divide(PALETTE_VOL);
            b = b.divide(PALETTE_VOL);
        }
        if (b.divide(KISTE_VOL).compareTo(new BigDecimal(1)) >= 0) {
            b = b.divide(KISTE_VOL);
        }
        if (b.divide(FLASCHE_VOL).compareTo(new BigDecimal(1)) >= 0) {
        }    
        return null;
    }
}
