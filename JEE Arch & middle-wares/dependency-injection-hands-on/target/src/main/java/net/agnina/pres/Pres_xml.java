package net.agnina.pres;

import net.agnina.metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pres_xml {
    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
        Imetier metier = (Imetier) springContext.getBean("metier");
        System.out.println("res = "+metier.calcul());
    }
}
