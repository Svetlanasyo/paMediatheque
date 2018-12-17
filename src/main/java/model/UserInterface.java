package model;

public interface UserInterface {
    MediaItem findMediaItemToReturn(String mediaItemName);

    void addMediaItenToMyRentedMediaItem(MediaItem mediaItem);
}
