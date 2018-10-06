package es.upm.miw.builder;

import es.upm.miw.EdicionEspecial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EdicionEspecialBuilderTest {

    @Test
    void testEdicionEspecialBuilder() {
        EdicionEspecial edicionEspecial = new EdicionEspecialBuilder("1", "The Kinks Are the Village Green Preservation Society", LocalDate.of(2018, 10, 26), "The Kinks").build();
        Assertions.assertNotNull(edicionEspecial);
    }

    @Test
    void testEdicionEspecialBuilderNombre() {
        EdicionEspecial edicionEspecial = new EdicionEspecialBuilder().nombre("The Kinks Are the Village Green Preservation Society").build();
        Assertions.assertNotNull(edicionEspecial);
        Assertions.assertEquals("The Kinks Are the Village Green Preservation Society", edicionEspecial.getNombre());
    }

    @Test
    void testEdicionEspecialBuilderFechaPublicacion() {
        EdicionEspecial edicionEspecial = new EdicionEspecialBuilder().fechaPublicacion(LocalDate.of(1968, 6, 27)).build();
        Assertions.assertNotNull(edicionEspecial);
        Assertions.assertNotEquals(LocalDate.of(2018, 10, 26), edicionEspecial.getFechaPublicacion());
    }

    @Test
    void testEdicionEspecialBuilderArtista() {
        EdicionEspecial edicionEspecial = new EdicionEspecialBuilder().artista("The Kinks").build();
        Assertions.assertNotNull(edicionEspecial);
        Assertions.assertEquals("The Kinks", edicionEspecial.getArtista());
    }
}
