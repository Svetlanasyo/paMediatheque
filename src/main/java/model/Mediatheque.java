package model;

import java.util.ArrayList;
import java.util.List;

public class Mediatheque {
    private java.util.List<MediaItem> allMediaItems;
    private java.util.List<User> allUsers;
    private List<Manager> allManagers;


    public List<MediaItem> findItemsByMetaData(String metaData) {
        List<MediaItem> listItemsByMetaData = new ArrayList<>();
        for (MediaItem mediaItem : getAllMediaItems()) {
            if (mediaItem.isFind(metaData) != false) {
                listItemsByMetaData.add(mediaItem);
            }
        }
        return listItemsByMetaData;
    }

    public List<MediaItem> getAllMediaItems() {
        return allMediaItems;
    }

    public void setAllMediaItems(List<MediaItem> allMediaItems) {
        this.allMediaItems = allMediaItems;
    }

    public List<MediaItem> rentMediaItemByUser(MediaItem mediaItem) {
        return null;
    }

    public void returnMediaItemToLibrary() {
    }
}
