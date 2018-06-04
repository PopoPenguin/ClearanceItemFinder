package com.application.model;

/**
 * created by Jialor Cheung on 6/2/18
 */

public class GenericWalmartParams {

    String domain = "http://api.walmartlabs.com/v1";
    String categoryAPI = "/feeds/clearance";
    String isPublisherId;
    String format = "json";
    String apiKey;
    String upc = "035000521019";
    String ids;

    public GenericWalmartParams(String categoryAPI, String isPublisherId, String format, String apiKey, String upc, String ids) {
        this.categoryAPI = categoryAPI;
        this.isPublisherId = isPublisherId;
        this.format = format;
        this.apiKey = apiKey;
        this.upc = upc;
        this.ids = ids;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getCategoryAPI() {
        return categoryAPI;
    }

    public void setCategoryAPI(String categoryAPI) {
        this.categoryAPI = categoryAPI;
    }

    public String getIsPublisherId() {
        return isPublisherId;
    }

    public void setIsPublisherId(String isPublisherId) {
        this.isPublisherId = isPublisherId;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }


    public String domainParams (){
        StringBuilder sb = new StringBuilder();
        sb.append(getDomain()).append(getCategoryAPI());
        if ("/744021327" == getIds()) {
            sb.append(getIds());
        }
        if (null != getFormat()) {
            sb.append("?format=").append(getFormat());
        }
        if (null != getApiKey()){
            sb.append("&apiKey=").append(getApiKey());
        }
        if (null != getIsPublisherId()) {
            sb.append("&isPublisherId=").append(getIsPublisherId());
        }
        if (null != getUpc()) {
            sb.append("&upc=").append(getUpc());
        }
        return sb.toString();

    }

}
