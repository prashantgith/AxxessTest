
package com.prashant.axxesstest.model.ApiResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Tag {

    @Expose
    private String accent;
    @SerializedName("background_hash")
    private String backgroundHash;
    @SerializedName("background_is_animated")
    private Boolean backgroundIsAnimated;
    @Expose
    private String description;
    @SerializedName("description_annotations")
    private DescriptionAnnotations descriptionAnnotations;
    @SerializedName("display_name")
    private String displayName;
    @Expose
    private Long followers;
    @Expose
    private Boolean following;
    @SerializedName("is_promoted")
    private Boolean isPromoted;
    @SerializedName("is_whitelisted")
    private Boolean isWhitelisted;
    @SerializedName("logo_destination_url")
    private Object logoDestinationUrl;
    @SerializedName("logo_hash")
    private Object logoHash;
    @Expose
    private String name;
    @SerializedName("thumbnail_hash")
    private Object thumbnailHash;
    @SerializedName("thumbnail_is_animated")
    private Boolean thumbnailIsAnimated;
    @SerializedName("total_items")
    private Long totalItems;

    public String getAccent() {
        return accent;
    }

    public void setAccent(String accent) {
        this.accent = accent;
    }

    public String getBackgroundHash() {
        return backgroundHash;
    }

    public void setBackgroundHash(String backgroundHash) {
        this.backgroundHash = backgroundHash;
    }

    public Boolean getBackgroundIsAnimated() {
        return backgroundIsAnimated;
    }

    public void setBackgroundIsAnimated(Boolean backgroundIsAnimated) {
        this.backgroundIsAnimated = backgroundIsAnimated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DescriptionAnnotations getDescriptionAnnotations() {
        return descriptionAnnotations;
    }

    public void setDescriptionAnnotations(DescriptionAnnotations descriptionAnnotations) {
        this.descriptionAnnotations = descriptionAnnotations;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Long getFollowers() {
        return followers;
    }

    public void setFollowers(Long followers) {
        this.followers = followers;
    }

    public Boolean getFollowing() {
        return following;
    }

    public void setFollowing(Boolean following) {
        this.following = following;
    }

    public Boolean getIsPromoted() {
        return isPromoted;
    }

    public void setIsPromoted(Boolean isPromoted) {
        this.isPromoted = isPromoted;
    }

    public Boolean getIsWhitelisted() {
        return isWhitelisted;
    }

    public void setIsWhitelisted(Boolean isWhitelisted) {
        this.isWhitelisted = isWhitelisted;
    }

    public Object getLogoDestinationUrl() {
        return logoDestinationUrl;
    }

    public void setLogoDestinationUrl(Object logoDestinationUrl) {
        this.logoDestinationUrl = logoDestinationUrl;
    }

    public Object getLogoHash() {
        return logoHash;
    }

    public void setLogoHash(Object logoHash) {
        this.logoHash = logoHash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getThumbnailHash() {
        return thumbnailHash;
    }

    public void setThumbnailHash(Object thumbnailHash) {
        this.thumbnailHash = thumbnailHash;
    }

    public Boolean getThumbnailIsAnimated() {
        return thumbnailIsAnimated;
    }

    public void setThumbnailIsAnimated(Boolean thumbnailIsAnimated) {
        this.thumbnailIsAnimated = thumbnailIsAnimated;
    }

    public Long getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Long totalItems) {
        this.totalItems = totalItems;
    }

}
