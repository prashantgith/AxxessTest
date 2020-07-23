
package com.prashant.axxesstest.model.ApiResponse;

import java.util.List;
import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class Response {

    @Expose
    private List<Datum> data;
    @Expose
    private Long status;
    @Expose
    private Boolean success;

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

}
