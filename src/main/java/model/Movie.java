package model;

public class Movie extends MediaItem implements Watchable {
    @Override
    public boolean isFind(String metaData) {
        if (getName().contains(metaData)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isPreview() {
        return false;
    }

    @Override
    public void returnMediaItem() {
    }

    @Override
    public void rentMediaItem() {
    }

    @Override
    public void reservedMediaItem() {
    }

    public void canBeWatched() {

    }
}
