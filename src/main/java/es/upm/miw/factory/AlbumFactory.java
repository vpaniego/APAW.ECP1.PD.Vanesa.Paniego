package es.upm.miw.factory;

import es.upm.miw.Album;

import java.util.HashMap;
import java.util.Map;

public class AlbumFactory {

    private static AlbumFactory factory = null;

    private Map<String, Album> mapaAlbum;

    private AlbumFactory() {
        this.mapaAlbum = new HashMap<>();
    }

    public static AlbumFactory getInstance() {
        if (AlbumFactory.factory == null) {
            AlbumFactory.factory = new AlbumFactory();
        }
        return AlbumFactory.factory;
    }

    public Album getAlbum(String id) {
        assert id != null;
        assert this.mapaAlbum != null;

        return this.mapaAlbum.get(id);
    }

    public void removeAlbum(String id) {
        assert id != null;
        assert this.mapaAlbum != null;

        this.mapaAlbum.remove(id);
    }

    public void addAlbum(Album album) {
        assert this.mapaAlbum != null;
        this.mapaAlbum.put(album.getId(), album);
    }

}
