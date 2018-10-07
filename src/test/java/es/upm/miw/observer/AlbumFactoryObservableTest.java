package es.upm.miw.observer;

import es.upm.miw.Album;
import es.upm.miw.Genero;
import es.upm.miw.Sello;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlbumFactoryObservableTest {

    @Test
    void testObservableFactoryAddAlbum(){
        AlbumFactory factoryObservable = AlbumFactory.getInstance();
        ProgramaRadio observer = new ProgramaRadio(factoryObservable);
        factoryObservable.addObserver(observer);

        Album album = new Album("5", "Here are The Sonics", "The Sonics", LocalDateTime.of(1965, Month.MARCH, 5, 12, 30, 57), 12, Genero.GARAGE, new Sello("4", "Audio Recording", "USA"));
        factoryObservable.addAlbum(album);
    }
}
