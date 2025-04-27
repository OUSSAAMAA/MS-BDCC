package net.agnina.metier;

import net.agnina.dao.DaoImpl;
import net.agnina.dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements Imetier {
    private Idao dao;

    @Override
    public double calcul() {
        double data = dao.getData();
        double res = data*Math.PI;
        return res;
    }
    public MetierImpl(@Qualifier("d1") Idao dao) {
        this.dao = dao;
    }
}
