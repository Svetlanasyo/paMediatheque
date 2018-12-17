package model;

public interface ManagerInterface {
    void addNewMediaItemToLibrary(MediaItem mediaItem);

    void removeMediaItemFromLibrary(MediaItem mediaItem);

    MediaItem editMediaItem(MediaItem mediaItem);
}
