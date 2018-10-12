package es.upm.miw.observer;

import es.upm.miw.Album;
import org.apache.logging.log4j.LogManager;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class ProgramaRadio implements Observer {

    private String id;
    private boolean nocturno;
    private String nombre;
    private DayOfWeek diaEmision;
    private List<Album> albumes;

    private AlbumFactory albumFactory;

    public ProgramaRadio(AlbumFactory albumFactory) {
        this.albumFactory = albumFactory;
        this.albumFactory.addObserver(this);
    }

    public ProgramaRadio(String id, boolean nocturno, String nombre, DayOfWeek diaEmision, List<Album> albumes) {
        this.id = id;
        this.nocturno = nocturno;
        this.nombre = nombre;
        this.diaEmision = diaEmision;
        this.albumes = albumes;
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

    public List<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(List<Album> albumes) {
        this.albumes = albumes;
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

    @Override
    public void update() {
        LogManager.getLogger(this.getClass()).debug("Un nuevo album se ha editado. Actualiza tu lista!");
    }
}
