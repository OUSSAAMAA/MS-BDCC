package net.agnina.dao;

import org.springframework.stereotype.Component;

@Component("d2")
public class DaoImlp_V2 implements  Idao{

    @Override
    public double getData() {
        System.out.println("Version Web Service :");
        return 15;    }
}
