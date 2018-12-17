package model;

import java.util.ArrayList;
import java.util.List;

public class User implements UserInterface {
    private String name;
    private List<MediaItem> myRentedMediaItem = new ArrayList<MediaItem>();

    public MediaItem findMediaItemToReturn(String mediaItemName) {
        return null;
    }

    public void addMediaItenToMyRentedMediaItem(MediaItem mediaItem) {
        mediaItem.setIsRent(true);
        myRentedMediaItem.add(mediaItem);
    }
}
