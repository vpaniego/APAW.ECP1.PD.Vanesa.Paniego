package es.upm.miw;

import java.time.LocalDateTime;

public class EdicionEspecial {

    private String id;
    private LocalDateTime fechaPublicacion;
    private String nombre;

    public EdicionEspecial() {
    }

    public EdicionEspecial(String id) {
        this.id = id;
    }

    public EdicionEspecial(String id, String nombre, LocalDateTime fechaPublicacion) {
        this.id = id;
        this.nombre = nombre;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "EdicionEspecial{" +
                "id='" + id + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
