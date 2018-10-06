package es.upm.miw;

import java.time.LocalDate;

public class EdicionEspecial {

    private String id;
    private LocalDate fechaPublicacion;
    private String nombre;
    private String artista;

    public EdicionEspecial() {
    }

    public EdicionEspecial(String id) {
        this.id = id;
    }

    public EdicionEspecial(String id, String nombre, LocalDate fechaPublicacion, String artista) {
        this.id = id;
        this.nombre = nombre;
        this.fechaPublicacion = fechaPublicacion;
        this.artista = artista;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "EdicionEspecial{" +
                "id='" + id + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                ", nombre='" + nombre + '\'' +
                ", artista='" + artista + '\'' +
                '}';
    }
}
