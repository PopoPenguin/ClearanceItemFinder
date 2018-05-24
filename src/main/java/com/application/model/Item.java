package com.application.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * created by Jialor Cheung on 4/7/18
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {

    private Integer itemId;
    private Integer parentItemId;
    private String name;
    private Integer msrp;
    private Integer salePrice;
    private String upc;
    private String categoryPath;
    private String shortDescription;
    private String longDescription;
    private String brandName;
    private String thumbnailImage;
    private String mediumImage;
    private String largeImage;
    private String productTrackingUrl;
    private Boolean ninetySevenCentShipping;
    private String size;
    private String color;
    private Boolean marketplace;
    private Boolean shipToStore;
    private Boolean freeShipToStore;
    private String modelNumber;
    private String productUrl;
    private String customerRating;
    private Integer numReviews;
    private String customerRatingImage;
    private String categoryNode;
    private Boolean bundle;
    private Boolean clearance;
    private Boolean preOrder;
    private String stock;
    private Boolean freight;
    private Attributes attributes;
    private String addToCartUrl;
    private String affiliateAddToCartUrl;
    private Boolean freeShippingOver50Dollars;
    private Boolean availableOnline;
    private ImageEntities imageEntities;
    private GiftOption giftOption;

    public Item() {
    }

    public Item(Integer itemId, Integer parentItemId, String name, Integer msrp, Integer salePrice, String upc,
                String categoryPath, String shortDescription, String longDescription, String brandName,
                String thumbnailImage, String mediumImage, String largeImage, String productTrackingUrl,
                Boolean ninetySevenCentShipping, String size, String color, Boolean marketplace, Boolean shipToStore,
                Boolean freeShipToStore, String modelNumber, String productUrl, String customerRating, Integer numReviews,
                String customerRatingImage, String categoryNode, Boolean bundle, Boolean clearance, Boolean preOrder,
                String stock, Boolean freight, Attributes attributes, String addToCartUrl, String affiliateAddToCartUrl,
                Boolean freeShippingOver50Dollars, Boolean availableOnline, ImageEntities imageEntities, GiftOption giftOption) {
        this.itemId = itemId;
        this.parentItemId = parentItemId;
        this.name = name;
        this.msrp = msrp;
        this.salePrice = salePrice;
        this.upc = upc;
        this.categoryPath = categoryPath;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.brandName = brandName;
        this.thumbnailImage = thumbnailImage;
        this.mediumImage = mediumImage;
        this.largeImage = largeImage;
        this.productTrackingUrl = productTrackingUrl;
        this.ninetySevenCentShipping = ninetySevenCentShipping;
        this.size = size;
        this.color = color;
        this.marketplace = marketplace;
        this.shipToStore = shipToStore;
        this.freeShipToStore = freeShipToStore;
        this.modelNumber = modelNumber;
        this.productUrl = productUrl;
        this.customerRating = customerRating;
        this.numReviews = numReviews;
        this.customerRatingImage = customerRatingImage;
        this.categoryNode = categoryNode;
        this.bundle = bundle;
        this.clearance = clearance;
        this.preOrder = preOrder;
        this.stock = stock;
        this.freight = freight;
        this.attributes = attributes;
        this.addToCartUrl = addToCartUrl;
        this.affiliateAddToCartUrl = affiliateAddToCartUrl;
        this.freeShippingOver50Dollars = freeShippingOver50Dollars;
        this.availableOnline = availableOnline;
        this.imageEntities = imageEntities;
        this.giftOption = giftOption;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getParentItemId() {
        return parentItemId;
    }

    public void setParentItemId(Integer parentItemId) {
        this.parentItemId = parentItemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMsrp() {
        return msrp;
    }

    public void setMsrp(Integer msrp) {
        this.msrp = msrp;
    }

    public Integer getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getCategoryPath() {
        return categoryPath;
    }

    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getThumbnailImage() {
        return thumbnailImage;
    }

    public void setThumbnailImage(String thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }

    public String getMediumImage() {
        return mediumImage;
    }

    public void setMediumImage(String mediumImage) {
        this.mediumImage = mediumImage;
    }

    public String getLargeImage() {
        return largeImage;
    }

    public void setLargeImage(String largeImage) {
        this.largeImage = largeImage;
    }

    public String getProductTrackingUrl() {
        return productTrackingUrl;
    }

    public void setProductTrackingUrl(String productTrackingUrl) {
        this.productTrackingUrl = productTrackingUrl;
    }

    public Boolean getNinetySevenCentShipping() {
        return ninetySevenCentShipping;
    }

    public void setNinetySevenCentShipping(Boolean ninetySevenCentShipping) {
        this.ninetySevenCentShipping = ninetySevenCentShipping;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getMarketplace() {
        return marketplace;
    }

    public void setMarketplace(Boolean marketplace) {
        this.marketplace = marketplace;
    }

    public Boolean getShipToStore() {
        return shipToStore;
    }

    public void setShipToStore(Boolean shipToStore) {
        this.shipToStore = shipToStore;
    }

    public Boolean getFreeShipToStore() {
        return freeShipToStore;
    }

    public void setFreeShipToStore(Boolean freeShipToStore) {
        this.freeShipToStore = freeShipToStore;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getCustomerRating() {
        return customerRating;
    }

    public void setCustomerRating(String customerRating) {
        this.customerRating = customerRating;
    }

    public Integer getNumReviews() {
        return numReviews;
    }

    public void setNumReviews(Integer numReviews) {
        this.numReviews = numReviews;
    }

    public String getCustomerRatingImage() {
        return customerRatingImage;
    }

    public void setCustomerRatingImage(String customerRatingImage) {
        this.customerRatingImage = customerRatingImage;
    }

    public String getCategoryNode() {
        return categoryNode;
    }

    public void setCategoryNode(String categoryNode) {
        this.categoryNode = categoryNode;
    }

    public Boolean getBundle() {
        return bundle;
    }

    public void setBundle(Boolean bundle) {
        this.bundle = bundle;
    }

    public Boolean getClearance() {
        return clearance;
    }

    public void setClearance(Boolean clearance) {
        this.clearance = clearance;
    }

    public Boolean getPreOrder() {
        return preOrder;
    }

    public void setPreOrder(Boolean preOrder) {
        this.preOrder = preOrder;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public Boolean getFreight() {
        return freight;
    }

    public void setFreight(Boolean freight) {
        this.freight = freight;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public String getAddToCartUrl() {
        return addToCartUrl;
    }

    public void setAddToCartUrl(String addToCartUrl) {
        this.addToCartUrl = addToCartUrl;
    }

    public String getAffiliateAddToCartUrl() {
        return affiliateAddToCartUrl;
    }

    public void setAffiliateAddToCartUrl(String affiliateAddToCartUrl) {
        this.affiliateAddToCartUrl = affiliateAddToCartUrl;
    }

    public Boolean getFreeShippingOver50Dollars() {
        return freeShippingOver50Dollars;
    }

    public void setFreeShippingOver50Dollars(Boolean freeShippingOver50Dollars) {
        this.freeShippingOver50Dollars = freeShippingOver50Dollars;
    }

    public Boolean getAvailableOnline() {
        return availableOnline;
    }

    public void setAvailableOnline(Boolean availableOnline) {
        this.availableOnline = availableOnline;
    }
}
