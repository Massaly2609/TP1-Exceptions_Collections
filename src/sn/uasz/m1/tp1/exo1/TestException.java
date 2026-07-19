package sn.uasz.m1.tp1.exo1;

public class TestException {

    public static void verifie ( int i) throws Exception {
        switch (i) {
            case 1:
                throw new Exception1(" exception de type Exception1 ");
            case 2:
                throw new Exception2(" exception de type Exception2 ");
            case 3:
                throw new Exception3(" exception de type Exception3 ");
            default:
                throw new Exception(" exception de type Exception ");
        }
    }
}
