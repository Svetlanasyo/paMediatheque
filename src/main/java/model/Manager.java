package model;

public abstract class Manager implements ManagerInterface {
    private String name;

    public abstract void addNewMediaItemToLibrary(MediaItem mediaItem);

    public abstract void removeMediaItemFromLibrary(MediaItem mediaItem);

    public abstract MediaItem editMediaItem(MediaItem mediaItem);
}
