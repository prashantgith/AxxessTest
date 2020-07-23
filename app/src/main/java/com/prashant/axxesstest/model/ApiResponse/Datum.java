
package com.prashant.axxesstest.model.ApiResponse;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Datum implements Parcelable, Serializable
{

    @SerializedName("account_id")
    private Long accountId;
    @SerializedName("account_url")
    private String accountUrl;
    @SerializedName("ad_config")
    private AdConfig adConfig;
    @SerializedName("ad_type")
    private Long adType;
    @SerializedName("ad_url")
    private String adUrl;
    @SerializedName("comment_count")
    private Long commentCount;
    @Expose
    private String cover;
    @SerializedName("cover_height")
    private Long coverHeight;
    @SerializedName("cover_width")
    private Long coverWidth;
    @Expose
    private Long datetime;
    @Expose
    private Object description;
    @Expose
    private Long downs;
    @Expose
    private Boolean favorite;
    @SerializedName("favorite_count")
    private Long favoriteCount;
    @Expose
    private String id;
    @Expose
    private List<Image> images = new ArrayList<>();
    @SerializedName("images_count")
    private Long imagesCount;
    @SerializedName("in_gallery")
    private Boolean inGallery;
    @SerializedName("in_most_viral")
    private Boolean inMostViral;
    @SerializedName("include_album_ads")
    private Boolean includeAlbumAds;
    @SerializedName("is_ad")
    private Boolean isAd;
    @SerializedName("is_album")
    private Boolean isAlbum;
    @Expose
    private String layout;
    @Expose
    private String link;
    @Expose
    private Boolean nsfw;
    @Expose
    private Long points;
    @Expose
    private String privacy;
    @Expose
    private Long score;
    @Expose
    private String section;
    @Expose
    private List<Tag> tags = new ArrayList<>();
    @Expose
    private String title;
    @Expose
    private String topic;
    @SerializedName("topic_id")
    private Long topicId;
    @Expose
    private Long ups;
    @Expose
    private Long views;
    @Expose
    private Object vote;

    protected Datum(Parcel in) {
        if (in.readByte() == 0) {
            accountId = null;
        } else {
            accountId = in.readLong();
        }
        accountUrl = in.readString();
        if (in.readByte() == 0) {
            adType = null;
        } else {
            adType = in.readLong();
        }
        adUrl = in.readString();
        if (in.readByte() == 0) {
            commentCount = null;
        } else {
            commentCount = in.readLong();
        }
        cover = in.readString();
        if (in.readByte() == 0) {
            coverHeight = null;
        } else {
            coverHeight = in.readLong();
        }
        if (in.readByte() == 0) {
            coverWidth = null;
        } else {
            coverWidth = in.readLong();
        }
        if (in.readByte() == 0) {
            datetime = null;
        } else {
            datetime = in.readLong();
        }
        if (in.readByte() == 0) {
            downs = null;
        } else {
            downs = in.readLong();
        }
        byte tmpFavorite = in.readByte();
        favorite = tmpFavorite == 0 ? null : tmpFavorite == 1;
        if (in.readByte() == 0) {
            favoriteCount = null;
        } else {
            favoriteCount = in.readLong();
        }
        id = in.readString();
        if (in.readByte() == 0) {
            imagesCount = null;
        } else {
            imagesCount = in.readLong();
        }
        byte tmpInGallery = in.readByte();
        inGallery = tmpInGallery == 0 ? null : tmpInGallery == 1;
        byte tmpInMostViral = in.readByte();
        inMostViral = tmpInMostViral == 0 ? null : tmpInMostViral == 1;
        byte tmpIncludeAlbumAds = in.readByte();
        includeAlbumAds = tmpIncludeAlbumAds == 0 ? null : tmpIncludeAlbumAds == 1;
        byte tmpIsAd = in.readByte();
        isAd = tmpIsAd == 0 ? null : tmpIsAd == 1;
        byte tmpIsAlbum = in.readByte();
        isAlbum = tmpIsAlbum == 0 ? null : tmpIsAlbum == 1;
        layout = in.readString();
        link = in.readString();
        byte tmpNsfw = in.readByte();
        nsfw = tmpNsfw == 0 ? null : tmpNsfw == 1;
        if (in.readByte() == 0) {
            points = null;
        } else {
            points = in.readLong();
        }
        privacy = in.readString();
        if (in.readByte() == 0) {
            score = null;
        } else {
            score = in.readLong();
        }
        section = in.readString();
        title = in.readString();
        topic = in.readString();
        if (in.readByte() == 0) {
            topicId = null;
        } else {
            topicId = in.readLong();
        }
        if (in.readByte() == 0) {
            ups = null;
        } else {
            ups = in.readLong();
        }
        if (in.readByte() == 0) {
            views = null;
        } else {
            views = in.readLong();
        }
    }

    public static final Creator<Datum> CREATOR = new Creator<Datum>() {
        @Override
        public Datum createFromParcel(Parcel in) {
            return new Datum(in);
        }

        @Override
        public Datum[] newArray(int size) {
            return new Datum[size];
        }
    };

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountUrl() {
        return accountUrl;
    }

    public void setAccountUrl(String accountUrl) {
        this.accountUrl = accountUrl;
    }

    public AdConfig getAdConfig() {
        return adConfig;
    }

    public void setAdConfig(AdConfig adConfig) {
        this.adConfig = adConfig;
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

    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Long getCoverHeight() {
        return coverHeight;
    }

    public void setCoverHeight(Long coverHeight) {
        this.coverHeight = coverHeight;
    }

    public Long getCoverWidth() {
        return coverWidth;
    }

    public void setCoverWidth(Long coverWidth) {
        this.coverWidth = coverWidth;
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

    public Long getDowns() {
        return downs;
    }

    public void setDowns(Long downs) {
        this.downs = downs;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public Long getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Long favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Long getImagesCount() {
        return imagesCount;
    }

    public void setImagesCount(Long imagesCount) {
        this.imagesCount = imagesCount;
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

    public Boolean getIncludeAlbumAds() {
        return includeAlbumAds;
    }

    public void setIncludeAlbumAds(Boolean includeAlbumAds) {
        this.includeAlbumAds = includeAlbumAds;
    }

    public Boolean getIsAd() {
        return isAd;
    }

    public void setIsAd(Boolean isAd) {
        this.isAd = isAd;
    }

    public Boolean getIsAlbum() {
        return isAlbum;
    }

    public void setIsAlbum(Boolean isAlbum) {
        this.isAlbum = isAlbum;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Boolean getNsfw() {
        return nsfw;
    }

    public void setNsfw(Boolean nsfw) {
        this.nsfw = nsfw;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public Long getUps() {
        return ups;
    }

    public void setUps(Long ups) {
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (accountId == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(accountId);
        }
        dest.writeString(accountUrl);
        if (adType == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(adType);
        }
        dest.writeString(adUrl);
        if (commentCount == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(commentCount);
        }
        dest.writeString(cover);
        if (coverHeight == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(coverHeight);
        }
        if (coverWidth == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(coverWidth);
        }
        if (datetime == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(datetime);
        }
        if (downs == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(downs);
        }
        dest.writeByte((byte) (favorite == null ? 0 : favorite ? 1 : 2));
        if (favoriteCount == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(favoriteCount);
        }
        dest.writeString(id);
        if (imagesCount == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(imagesCount);
        }
        dest.writeByte((byte) (inGallery == null ? 0 : inGallery ? 1 : 2));
        dest.writeByte((byte) (inMostViral == null ? 0 : inMostViral ? 1 : 2));
        dest.writeByte((byte) (includeAlbumAds == null ? 0 : includeAlbumAds ? 1 : 2));
        dest.writeByte((byte) (isAd == null ? 0 : isAd ? 1 : 2));
        dest.writeByte((byte) (isAlbum == null ? 0 : isAlbum ? 1 : 2));
        dest.writeString(layout);
        dest.writeString(link);
        dest.writeByte((byte) (nsfw == null ? 0 : nsfw ? 1 : 2));
        if (points == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(points);
        }
        dest.writeString(privacy);
        if (score == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(score);
        }
        dest.writeString(section);
        dest.writeString(title);
        dest.writeString(topic);
        if (topicId == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(topicId);
        }
        if (ups == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(ups);
        }
        if (views == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(views);
        }
    }


}
