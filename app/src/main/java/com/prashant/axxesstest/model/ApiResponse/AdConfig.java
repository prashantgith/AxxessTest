
package com.prashant.axxesstest.model.ApiResponse;

import java.util.List;
import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class AdConfig {

    @Expose
    private List<Object> highRiskFlags;
    @Expose
    private List<String> safeFlags;
    @Expose
    private Boolean showsAds;
    @Expose
    private List<String> unsafeFlags;
    @Expose
    private List<Object> wallUnsafeFlags;

    public List<Object> getHighRiskFlags() {
        return highRiskFlags;
    }

    public void setHighRiskFlags(List<Object> highRiskFlags) {
        this.highRiskFlags = highRiskFlags;
    }

    public List<String> getSafeFlags() {
        return safeFlags;
    }

    public void setSafeFlags(List<String> safeFlags) {
        this.safeFlags = safeFlags;
    }

    public Boolean getShowsAds() {
        return showsAds;
    }

    public void setShowsAds(Boolean showsAds) {
        this.showsAds = showsAds;
    }

    public List<String> getUnsafeFlags() {
        return unsafeFlags;
    }

    public void setUnsafeFlags(List<String> unsafeFlags) {
        this.unsafeFlags = unsafeFlags;
    }

    public List<Object> getWallUnsafeFlags() {
        return wallUnsafeFlags;
    }

    public void setWallUnsafeFlags(List<Object> wallUnsafeFlags) {
        this.wallUnsafeFlags = wallUnsafeFlags;
    }

}
