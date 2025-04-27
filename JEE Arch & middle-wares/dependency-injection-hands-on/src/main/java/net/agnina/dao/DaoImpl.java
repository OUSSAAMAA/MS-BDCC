package net.agnina.dao;

import org.springframework.stereotype.Component;

@Component("d1")
public class DaoImpl implements Idao{

    @Override
    public double getData() {
        System.out.println("Version BD :");
        return 28;
    }
}
