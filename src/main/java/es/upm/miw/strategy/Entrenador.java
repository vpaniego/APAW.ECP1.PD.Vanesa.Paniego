package es.upm.miw.strategy;

public class Entrenador {

    private Contexto contexto;

    public Entrenador(){
        this.contexto = new Contexto();
    }

    public void irAtacar(){
        Estrategia estrategia = new EstrategiaAtaque();
        contexto.setEstrategia(estrategia);
        contexto.algoritmoInterface();
    }

    public void irDefender(){
        Estrategia estrategia = new EstrategiaDefensa();
        contexto.setEstrategia(estrategia);
        contexto.algoritmoInterface();
    }

    public void irContragolpe(){
        Estrategia estrategia = new EstrategiaContragolpe();
        contexto.setEstrategia(estrategia);
        contexto.algoritmoInterface();
    }

    public void irTiroLobre(){
        Estrategia estrategia = new EstrategiaTiroLibre();
        contexto.setEstrategia(estrategia);
        contexto.algoritmoInterface();
    }

    public static void main(String[] args) {

        Entrenador entrenador = new Entrenador();
        entrenador.irAtacar();
        entrenador.irDefender();
        entrenador.irContragolpe();
        entrenador.irTiroLobre();
    }

}
