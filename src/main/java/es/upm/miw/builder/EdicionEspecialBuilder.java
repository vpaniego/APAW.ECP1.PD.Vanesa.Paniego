package es.upm.miw.builder;

import es.upm.miw.EdicionEspecial;

import java.time.LocalDate;

public class EdicionEspecialBuilder {

    private EdicionEspecial edicionEspecial;

    public EdicionEspecialBuilder() {
        this.edicionEspecial = new EdicionEspecial();
    }

    public EdicionEspecialBuilder(String id, String nombre, LocalDate fechaPublicacion, String artista) {
        this.edicionEspecial = new EdicionEspecial(id, nombre, fechaPublicacion, artista);
    }

    public EdicionEspecialBuilder nombre(String nombre) {
        this.edicionEspecial.setNombre(nombre);
        return this;
    }

    public EdicionEspecialBuilder fechaPublicacion(LocalDate fechaPublicacion) {
        this.edicionEspecial.setFechaPublicacion(fechaPublicacion);
        return this;
    }

    public EdicionEspecialBuilder artista(String artista) {
        this.edicionEspecial.setArtista(artista);
        return this;
    }

    public EdicionEspecial build() {
        return this.edicionEspecial;
    }

    public EdicionEspecial getEdicionEspecial() {
        return edicionEspecial;
    }

    public void setEdicionEspecial(EdicionEspecial edicionEspecial) {
        this.edicionEspecial = edicionEspecial;
    }


}
