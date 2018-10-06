package es.upm.miw.composite;

public abstract class SelloComponent {

    private String name;

    public SelloComponent(String name) {
        this.name = name;
    }

    public abstract boolean isComposite();

    public abstract void add(SelloComponent selloComponente);

    public abstract void remove(SelloComponent selloComponente);

    public abstract String view();

    public abstract void name(String name);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
