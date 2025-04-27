package net.agnina.pres;

import net.agnina.dao.DaoImpl;
import net.agnina.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        double res = metier.calcul();
        System.out.println(res);
    }
}
