package net.agnina.pres;

import net.agnina.metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Pres_Annotation {
    public static void main(String[] args) {
        ApplicationContext springContext = new AnnotationConfigApplicationContext("net.agnina");
        Imetier metier = springContext.getBean(Imetier.class);
        System.out.println("res = "+metier.calcul());

    }
}
