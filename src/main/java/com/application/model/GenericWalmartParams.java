package com.application.model;

/**
 * created by Jialor Cheung on 6/2/18
 */

public class GenericWalmartParams {

    String domain = "http://api.walmartlabs.com/v1";
    String categoryAPI = "/feeds/clearance";
    String isPublisherId;
    String format = "json";
    String apikey = "{apikey}";
    String upc = "035000521019";
    String ids = "744021327";

    public GenericWalmartParams(String domain, String categoryAPI, String isPublisherId, String format, String apikey, String upc, String ids) {
        this.domain = domain;
        this.categoryAPI = categoryAPI;
        this.isPublisherId = isPublisherId;
        this.format = format;
        this.apikey = apikey;
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

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
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
        if (null != getIds()) {
            sb.append(getIds());
        }
        if (null != getFormat()) {
            sb.append("?format=").append(getFormat());
        }
        if (null != getApikey()){
            sb.append("&apikey=").append(getApikey());
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
