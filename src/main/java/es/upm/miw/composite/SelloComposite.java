package es.upm.miw.composite;

import java.util.ArrayList;
import java.util.List;

public class SelloComposite extends SelloComponent {

    private List<SelloComponent> listaSelloComposite;

    public SelloComposite(String name) {
        super(name);
        this.listaSelloComposite = new ArrayList<>();
    }

    @Override
    public boolean isComposite() {
        return true;
    }


    @Override
    public void add(SelloComponent selloComponente) {
        assert selloComponente != null;
        this.listaSelloComposite.add(selloComponente);

    }

    @Override
    public void remove(SelloComponent selloComponente) {
        assert selloComponente != null;
        this.listaSelloComposite.remove(selloComponente);
    }

    @Override
    public String view() {
        return null;
    }

    @Override
    public void name(String nombre) {
        this.setName(nombre);
    }
}
