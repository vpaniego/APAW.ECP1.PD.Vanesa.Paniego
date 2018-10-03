package es.upm.miw;

import java.time.DayOfWeek;

public class ProgramaRadio {

    private String id;

    private boolean nocturno;
    private String nombre;
    private DayOfWeek diaEmision;

    public ProgramaRadio() {
    }

    public ProgramaRadio(String nombre, DayOfWeek diaEmision, boolean nocturno) {
        this.nombre = nombre;
        this.diaEmision = diaEmision;
        this.nocturno = nocturno;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isNocturno() {
        return nocturno;
    }

    public void setNocturno(boolean nocturno) {
        this.nocturno = nocturno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DayOfWeek getDiaEmision() {
        return diaEmision;
    }

    public void setDiaEmision(DayOfWeek diaEmision) {
        this.diaEmision = diaEmision;
    }

    @Override
    public String toString() {
        return "ProgramaRadio{" +
                "id='" + id + '\'' +
                ", nocturno=" + nocturno +
                ", nombre='" + nombre + '\'' +
                ", diaEmision=" + diaEmision +
                '}';
    }
}
