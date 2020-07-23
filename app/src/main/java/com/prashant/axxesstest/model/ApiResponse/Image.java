
package com.prashant.axxesstest.model.ApiResponse;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Image implements Parcelable, Serializable
{

    @SerializedName("account_id")
    private Object accountId;
    @SerializedName("account_url")
    private Object accountUrl;
    @SerializedName("ad_type")
    private Long adType;
    @SerializedName("ad_url")
    private String adUrl;
    @Expose
    private Boolean animated;
    @Expose
    private Long bandwidth;
    @SerializedName("comment_count")
    private Object commentCount;
    @Expose
    private Long datetime;
    @Expose
    private Object description;
    @Expose
    private Object downs;
    @Expose
    private String edited;
    @Expose
    private Boolean favorite;
    @SerializedName("favorite_count")
    private Object favoriteCount;
    @SerializedName("has_sound")
    private Boolean hasSound;
    @Expose
    private Long height;
    @Expose
    private String id;
    @SerializedName("in_gallery")
    private Boolean inGallery;
    @SerializedName("in_most_viral")
    private Boolean inMostViral;
    @SerializedName("is_ad")
    private Boolean isAd;
    @Expose
    private String link;
    @Expose
    private Object nsfw;
    @Expose
    private Object points;
    @Expose
    private Object score;
    @Expose
    private Object section;
    @Expose
    private Long size;
    @Expose
    private List<Tag> tags;
    @Expose
    private Object title;
    @Expose
    private String type;
    @Expose
    private Object ups;
    @Expose
    private Long views;
    @Expose
    private Object vote;
    @Expose
    private Long width;

    protected Image(Parcel in) {
        if (in.readByte() == 0) {
            adType = null;
        } else {
            adType = in.readLong();
        }
        adUrl = in.readString();
        byte tmpAnimated = in.readByte();
        animated = tmpAnimated == 0 ? null : tmpAnimated == 1;
        if (in.readByte() == 0) {
            bandwidth = null;
        } else {
            bandwidth = in.readLong();
        }
        if (in.readByte() == 0) {
            datetime = null;
        } else {
            datetime = in.readLong();
        }
        edited = in.readString();
        byte tmpFavorite = in.readByte();
        favorite = tmpFavorite == 0 ? null : tmpFavorite == 1;
        byte tmpHasSound = in.readByte();
        hasSound = tmpHasSound == 0 ? null : tmpHasSound == 1;
        if (in.readByte() == 0) {
            height = null;
        } else {
            height = in.readLong();
        }
        id = in.readString();
        byte tmpInGallery = in.readByte();
        inGallery = tmpInGallery == 0 ? null : tmpInGallery == 1;
        byte tmpInMostViral = in.readByte();
        inMostViral = tmpInMostViral == 0 ? null : tmpInMostViral == 1;
        byte tmpIsAd = in.readByte();
        isAd = tmpIsAd == 0 ? null : tmpIsAd == 1;
        link = in.readString();
        if (in.readByte() == 0) {
            size = null;
        } else {
            size = in.readLong();
        }
        type = in.readString();
        if (in.readByte() == 0) {
            views = null;
        } else {
            views = in.readLong();
        }
        if (in.readByte() == 0) {
            width = null;
        } else {
            width = in.readLong();
        }
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (adType == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(adType);
        }
        dest.writeString(adUrl);
        dest.writeByte((byte) (animated == null ? 0 : animated ? 1 : 2));
        if (bandwidth == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(bandwidth);
        }
        if (datetime == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(datetime);
        }
        dest.writeString(edited);
        dest.writeByte((byte) (favorite == null ? 0 : favorite ? 1 : 2));
        dest.writeByte((byte) (hasSound == null ? 0 : hasSound ? 1 : 2));
        if (height == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(height);
        }
        dest.writeString(id);
        dest.writeByte((byte) (inGallery == null ? 0 : inGallery ? 1 : 2));
        dest.writeByte((byte) (inMostViral == null ? 0 : inMostViral ? 1 : 2));
        dest.writeByte((byte) (isAd == null ? 0 : isAd ? 1 : 2));
        dest.writeString(link);
        if (size == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(size);
        }
        dest.writeString(type);
        if (views == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(views);
        }
        if (width == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(width);
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Image> CREATOR = new Creator<Image>() {
        @Override
        public Image createFromParcel(Parcel in) {
            return new Image(in);
        }

        @Override
        public Image[] newArray(int size) {
            return new Image[size];
        }
    };

    public Object getAccountId() {
        return accountId;
    }

    public void setAccountId(Object accountId) {
        this.accountId = accountId;
    }

    public Object getAccountUrl() {
        return accountUrl;
    }

    public void setAccountUrl(Object accountUrl) {
        this.accountUrl = accountUrl;
    }

    public Long getAdType() {
        return adType;
    }

    public void setAdType(Long adType) {
        this.adType = adType;
    }

    public String getAdUrl() {
        return adUrl;
    }

    public void setAdUrl(String adUrl) {
        this.adUrl = adUrl;
    }

    public Boolean getAnimated() {
        return animated;
    }

    public void setAnimated(Boolean animated) {
        this.animated = animated;
    }

    public Long getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Object getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Object commentCount) {
        this.commentCount = commentCount;
    }

    public Long getDatetime() {
        return datetime;
    }

    public void setDatetime(Long datetime) {
        this.datetime = datetime;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Object getDowns() {
        return downs;
    }

    public void setDowns(Object downs) {
        this.downs = downs;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public Object getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Object favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public Boolean getHasSound() {
        return hasSound;
    }

    public void setHasSound(Boolean hasSound) {
        this.hasSound = hasSound;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getInGallery() {
        return inGallery;
    }

    public void setInGallery(Boolean inGallery) {
        this.inGallery = inGallery;
    }

    public Boolean getInMostViral() {
        return inMostViral;
    }

    public void setInMostViral(Boolean inMostViral) {
        this.inMostViral = inMostViral;
    }

    public Boolean getIsAd() {
        return isAd;
    }

    public void setIsAd(Boolean isAd) {
        this.isAd = isAd;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Object getNsfw() {
        return nsfw;
    }

    public void setNsfw(Object nsfw) {
        this.nsfw = nsfw;
    }

    public Object getPoints() {
        return points;
    }

    public void setPoints(Object points) {
        this.points = points;
    }

    public Object getScore() {
        return score;
    }

    public void setScore(Object score) {
        this.score = score;
    }

    public Object getSection() {
        return section;
    }

    public void setSection(Object section) {
        this.section = section;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getUps() {
        return ups;
    }

    public void setUps(Object ups) {
        this.ups = ups;
    }

    public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
    }

    public Object getVote() {
        return vote;
    }

    public void setVote(Object vote) {
        this.vote = vote;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

}
