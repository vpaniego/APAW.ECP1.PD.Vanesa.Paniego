package es.upm.miw.strategy;

public class Contexto {

    private Estrategia estrategia;

    public Contexto(){
        this.estrategia = estrategia;
    }

    public void algoritmoInterface() {
        estrategia.algoritmoInterface();
    }

    public Estrategia getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

}
