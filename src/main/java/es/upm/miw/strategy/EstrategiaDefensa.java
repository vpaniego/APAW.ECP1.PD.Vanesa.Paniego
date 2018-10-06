package es.upm.miw.strategy;

import org.apache.logging.log4j.LogManager;

public class EstrategiaDefensa implements  Estrategia {

    @Override
    public void algoritmoInterface() {
        LogManager.getLogger(this.getClass()).debug("Estrategia basada en la DEFENSA!");
    }
}
