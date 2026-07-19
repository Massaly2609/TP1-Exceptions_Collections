package sn.uasz.m1.tp1.exo1;

import static sn.uasz.m1.tp1.exo1.TestException.verifie;

public class Principale {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            try {
                verifie(i);
            } catch (Exception3 e) {
                System.out.println(" Capture d’" + e.getMessage());
            } catch (Exception1 e) {
                System.out.println(" Capture d’" + e.getMessage());
            } catch (Exception e) {
                System.out.println(" Capture d’" + e.getMessage());
            }
        }
    }
}
