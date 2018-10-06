package es.upm.miw.composite;

import es.upm.miw.Sello;

public class SelloLeaf extends SelloComponent {

    private Sello sello;

    public SelloLeaf(Sello sello) {
        super(sello.getNombre());
        this.sello = sello;
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public String view() {
        return this.sello.getId();
    }

    @Override
    public void add(SelloComponent selloComponente) {
        // Do nothing because is leaf
    }

    @Override
    public void remove(SelloComponent selloComponente) {
        // Do nothing because is leaf
    }

    @Override
    public void name(String name) {
        // Do nothing because is leaf
    }

    public Sello getSello() {
        return sello;
    }

    public void setSello(Sello sello) {
        this.sello = sello;
    }

}
