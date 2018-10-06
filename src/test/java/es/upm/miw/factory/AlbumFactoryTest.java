package es.upm.miw.factory;

import es.upm.miw.Album;
import es.upm.miw.Genero;
import es.upm.miw.Sello;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

public class AlbumFactoryTest {

    @Test
    void testAddAlbum() {
        AlbumFactory factory = AlbumFactory.getInstance();
        Album album = new Album("1", "Something Else by The Kinks", "The Kinks", LocalDateTime.of(1967, Month.SEPTEMBER, 15, 12, 30, 57), 13, Genero.ROCK, new Sello("3", "Pye Records", "Reino Unido"));
        factory.addAlbum(album);
        assertEquals("1", factory.getAlbum(album.getId()).getId());
    }

    @Test
    void testGetAlbum() {
        AlbumFactory factory = AlbumFactory.getInstance();
        Album album2 = new Album("2", "Kinda Kinks", "The Kinks", LocalDateTime.of(1965, Month.MARCH, 12, 10, 42, 57), 12, Genero.ROCK, new Sello("3", "Pye Records", "Reino Unido"));
        Album album3 = new Album("3", "The Kink Kontroversy", "The Kinks", LocalDateTime.of(1965, Month.NOVEMBER, 26, 23, 12, 34), 12, Genero.ROCK, new Sello("3", "Pye Records", "Reino Unido"));
        factory.addAlbum(album2);
        factory.addAlbum(album3);
        assertEquals(album2, AlbumFactory.getInstance().getAlbum("2"));
    }

    @Test
    void testRemoveProgramaRadio() {
        AlbumFactory factory = AlbumFactory.getInstance();
        Album album = new Album("4", "Low Budget", "The Kinks", LocalDateTime.of(1979, Month.JULY, 10, 0, 0, 0), 12, Genero.ROCK, new Sello("3", "Pye Records", "Reino Unido"));
        factory.addAlbum(album);
        factory.removeAlbum(album.getId());
        assertNull(factory.getAlbum(album.getId()));
    }

}
