package com.application.model.Walmart;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * created by Jialor Cheung on 5/22/18
 */

@JsonIgnoreProperties(ignoreUnknown = true)

public class GiftOption {

    Boolean allowGiftWrap;
    Boolean allowGiftMessage;
    Boolean allowGiftReceipt;

    public GiftOption(@JsonProperty("id")Boolean allowGiftWrap, @JsonProperty("id")Boolean allowGiftMessage, @JsonProperty("id")Boolean allowGiftReceipt) {
        this.allowGiftWrap = allowGiftWrap;
        this.allowGiftMessage = allowGiftMessage;
        this.allowGiftReceipt = allowGiftReceipt;
    }

    public Boolean getAllowGiftWrap() {
        return allowGiftWrap;
    }

    public void setAllowGiftWrap(Boolean allowGiftWrap) {
        this.allowGiftWrap = allowGiftWrap;
    }

    public Boolean getAllowGiftMessage() {
        return allowGiftMessage;
    }

    public void setAllowGiftMessage(Boolean allowGiftMessage) {
        this.allowGiftMessage = allowGiftMessage;
    }

    public Boolean getAllowGiftReceipt() {
        return allowGiftReceipt;
    }

    public void setAllowGiftReceipt(Boolean allowGiftReceipt) {
        this.allowGiftReceipt = allowGiftReceipt;
    }
}
