package com.application.model;

/**
 * created by Jialor Cheung on 4/7/18
 */

public class Item {

    private final Integer itemId;
    private final Integer parentItemId;
    private final String name;
    private final Integer msrp;
    private final Integer salePrice;
    private final String upc;
    private final String categoryPath;
    private final String shortDescription;
    private final String longDescription;
    private final String brandName;
    private final String thumbnailImage;
    private final String mediumImage;
    private final String largeImage;
    private final String productTrackingUrl;
    private final Boolean nenetySevenCentShipping;
    private final String size;
    private final String color;
    private final Boolean marketplace;
    private final Boolean shipToStore;
    private final Boolean freeShipToStore;
    private final String modelNumber;
    private final String productUrl;
    private final String customerRating;
    private final Integer numReviews;
    private final String customerRatingImage;
    private final String cateogryNode;
    private final Boolean bundle;
    private final Boolean clearance;
    private final Boolean preOrder;
    private final String stock;
    private final Boolean freight;
    private final Attributes attributes;
    private final String addToCartUrl;
    private final String affiliateAddToCartUrl;
    private final Boolean freeShippingOver50Dollars;
    private final Boolean availableOnline;

    public Item(Integer itemId, Integer parentItemId, String name,
                Integer msrp, Integer salePrice, String upc, String categoryPath,
                String shortDescription, String longDescription, String brandName,
                String thumbnailImage, String mediumImage, String largeImage, String productTrackingUrl,
                Boolean nenetySevenCentShipping, String size, String color, Boolean marketplace,
                Boolean shipToStore, Boolean freeShipToStore, String modelNumber, String productUrl,
                String customerRating, Integer numReviews, String customerRatingImage, String cateogryNode,
                Boolean bundle, Boolean clearance, Boolean preOrder, String stock,
                Boolean freight, Attributes attributes, String addToCartUrl,
                String affiliateAddToCartUrl, Boolean freeShippingOver50Dollars, Boolean availableOnline) {
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
        this.nenetySevenCentShipping = nenetySevenCentShipping;
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
        this.cateogryNode = cateogryNode;
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
    }

    public Integer getItemId() {
        return itemId;
    }

    public Integer getParentItemId() {
        return parentItemId;
    }

    public String getName() {
        return name;
    }

    public Integer getMsrp() {
        return msrp;
    }

    public Integer getSalePrice() {
        return salePrice;
    }

    public String getUpc() {
        return upc;
    }

    public String getCategoryPath() {
        return categoryPath;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getThumbnailImage() {
        return thumbnailImage;
    }

    public String getMediumImage() {
        return mediumImage;
    }

    public String getLargeImage() {
        return largeImage;
    }

    public String getProductTrackingUrl() {
        return productTrackingUrl;
    }

    public Boolean getNenetySevenCentShipping() {
        return nenetySevenCentShipping;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public Boolean getMarketplace() {
        return marketplace;
    }

    public Boolean getShipToStore() {
        return shipToStore;
    }

    public Boolean getFreeShipToStore() {
        return freeShipToStore;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public String getCustomerRating() {
        return customerRating;
    }

    public Integer getNumReviews() {
        return numReviews;
    }

    public String getCustomerRatingImage() {
        return customerRatingImage;
    }

    public String getCateogryNode() {
        return cateogryNode;
    }

    public Boolean getBundle() {
        return bundle;
    }

    public Boolean getClearance() {
        return clearance;
    }

    public Boolean getPreOrder() {
        return preOrder;
    }

    public String getStock() {
        return stock;
    }

    public Boolean getFreight() {
        return freight;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public String getAddToCartUrl() {
        return addToCartUrl;
    }

    public String getAffiliateAddToCartUrl() {
        return affiliateAddToCartUrl;
    }

    public Boolean getFreeShippingOver50Dollars() {
        return freeShippingOver50Dollars;
    }

    public Boolean getAvailableOnline() {
        return availableOnline;
    }
}
