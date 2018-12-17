package model;

import java.util.ArrayList;
import java.util.List;

public abstract class User implements UserInterface {
    private String name;
    private List<MediaItem> myRentedMediaItem = new ArrayList<MediaItem>();

    public abstract MediaItem findMediaItemToReturn(String mediaItemName);

    public abstract void addMediaItenToMyRentedMediaItem(MediaItem mediaItem);
}
