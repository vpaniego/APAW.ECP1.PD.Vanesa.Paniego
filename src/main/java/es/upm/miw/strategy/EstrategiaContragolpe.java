package es.upm.miw.strategy;

import org.apache.logging.log4j.LogManager;

public class EstrategiaContragolpe implements Estrategia {

    @Override
    public void algoritmoInterface() {
        LogManager.getLogger(this.getClass()).debug("Estrategia basada en el CONTRAGOLPE!");
    }
}
