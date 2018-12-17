package model;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MediathequeTest {
    Book book = new Book();
    AudioBook audiobook = new AudioBook();
    Movie movie = new Movie();

    List<MediaItem> testable = List.of(book, audiobook, movie);

    @Test
    public void findItemsByMetaDataWhenLibraryHas() {
        book.setName("Harry Poter");
        audiobook.setName("foo bar bas");
        movie.setName("bar basx foo");
        Mediatheque mediatheque = new Mediatheque();
        mediatheque.setAllMediaItems(testable);
        List<MediaItem> expected = List.of(book);
        List<MediaItem> aktual = mediatheque.findItemsByMetaData("Harry");
        Assert.assertArrayEquals(expected.toArray(), aktual.toArray());
    }

    @Test
    public void findItemsByMetaDataWhenLibraryHasNot() {
        book.setName("Harry Poter");
        audiobook.setName("foo bar bas");
        movie.setName("bar basx foo");
        Mediatheque mediatheque = new Mediatheque();
        mediatheque.setAllMediaItems(testable);
        List<MediaItem> expected = List.of();
        List<MediaItem> aktual = mediatheque.findItemsByMetaData("bars");
        Assert.assertArrayEquals(expected.toArray(), aktual.toArray());
    }

    @Test
    public void rentMediaItemByUser() {
        book.setName("Harry Poter");
        audiobook.setName("foo bar bas");
        movie.setName("bar basx foo");
        Mediatheque mediatheque = new Mediatheque();
        mediatheque.setAllMediaItems(testable);
        List<MediaItem> expected = List.of(book);
        List<MediaItem> aktual = mediatheque.rentMediaItemByUser(book);

    }

    @Test
    public void returnMediaItemToLibrary() {
    }
}