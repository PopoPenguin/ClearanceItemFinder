package com.application.model.Walmart;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * created by Jialor Cheung on 4/7/18
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {

    private Integer itemId;
    private Integer parentItemId;
    private String name;
    private Double msrp;
    private Double salePrice;
    private String upc;
    private String categoryPath;
    private String categoryNode;
    private String shortDescription;
    private String longDescription;
    private String brandName;
    private String thumbnailImage;
    private String mediumImage;
    private String largeImage;
    private String productTrackingUrl;
    private Boolean ninetySevenCentShipping;
    private Double standardShipRate;
    private Double twoThreeDayShippingRate;
    private String size;
    private String color;
    private Boolean marketplace;
    private String sellerInfo;
    private Boolean shipToStore;
    private Boolean freeShipToStore;
    private String modelNumber;
    private String productUrl;
    private Boolean availableOnline;
    private String stock;
    private String customerRating;
    private String customerRatingImage;
    private Integer numReviews;
    private Boolean clearance;
    private Boolean preOrder;
    private String preOrderShipsOn;
    private String offerType;
    private Integer rhid;
    private Boolean bundle;
    private Attributes attributes;
    private String addToCartUrl;
    private String affiliateAddToCartUrl;
    private Boolean freeShippingOver50Dollars;
    private String gender;
    private String age;
    private ImageEntities imageEntities;
    private Boolean isTwoDayShippingEligible;
    private GiftOption giftOption;
    private BestMarketplacePrice bestMarketplacePrice;
    private Boolean freight;


    public Item() {
    }

    public Item(@JsonProperty("itemId")Integer itemId, @JsonProperty("parentItemId")Integer parentItemId, @JsonProperty("name")String name, @JsonProperty("msrp")Double msrp, @JsonProperty("salePrice")Double salePrice, @JsonProperty("upc")String upc,
                @JsonProperty("categoryPath")String categoryPath, @JsonProperty("shortDescription")String shortDescription, @JsonProperty("longDescription")String longDescription, @JsonProperty("brandName")String brandName,
                @JsonProperty("thumbnailImage")String thumbnailImage, @JsonProperty("mediumImage")String mediumImage, @JsonProperty("largeImage")String largeImage, @JsonProperty("productTrackingUrl")String productTrackingUrl,
                @JsonProperty("ninetySevenCentShipping")Boolean ninetySevenCentShipping, @JsonProperty("size")String size, @JsonProperty("color")String color, @JsonProperty("marketplace")Boolean marketplace, @JsonProperty("shipToStore")Boolean shipToStore,
                @JsonProperty("freeShipToStore")Boolean freeShipToStore, @JsonProperty("modelNumber")String modelNumber, @JsonProperty("productUrl")String productUrl, @JsonProperty("customerRating")String customerRating, @JsonProperty("numReviews")Integer numReviews,
                @JsonProperty("customerRatingImage")String customerRatingImage, @JsonProperty("categoryNode")String categoryNode, @JsonProperty("bundle")Boolean bundle, @JsonProperty("clearance")Boolean clearance, @JsonProperty("preOrder")Boolean preOrder,
                @JsonProperty("stock")String stock, @JsonProperty("freight")Boolean freight, @JsonProperty("attributes")Attributes attributes, @JsonProperty("addToCartUrl")String addToCartUrl, @JsonProperty("affiliateAddToCartUrl")String affiliateAddToCartUrl,
                @JsonProperty("freeShippingOver50Dollars")Boolean freeShippingOver50Dollars, @JsonProperty("availableOnline")Boolean availableOnline, @JsonProperty("imageEntities")ImageEntities imageEntities, @JsonProperty("giftOption")GiftOption giftOption,
                @JsonProperty("standardShipRate")Double standardShipRate,@JsonProperty("twoThreeDayShippingRate") Double twoThreeDayShippingRate, @JsonProperty("sellerInfo")String sellerInfo, @JsonProperty("preOrderShipsOn")String preOrderShipsOn,
                @JsonProperty("offerType")String offerType, @JsonProperty("rhid")Integer rhid, @JsonProperty("gender")String gender,@JsonProperty("age") String age,
                @JsonProperty("isTwoDayShippingEligible")Boolean isTwoDayShippingEligible, @JsonProperty("bestMarketplacePrice")BestMarketplacePrice bestMarketplacePrice){

        this.itemId = itemId;
        this.parentItemId = parentItemId;
        this.name = name;
        this.msrp = msrp;
        this.salePrice = salePrice;
        this.upc = upc;
        this.categoryPath = categoryPath;
        this.categoryNode = categoryNode;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.brandName = brandName;
        this.thumbnailImage = thumbnailImage;
        this.mediumImage = mediumImage;
        this.largeImage = largeImage;
        this.productTrackingUrl = productTrackingUrl;
        this.ninetySevenCentShipping = ninetySevenCentShipping;
        this.standardShipRate = standardShipRate;
        this.twoThreeDayShippingRate = twoThreeDayShippingRate;
        this.size = size;
        this.color = color;
        this.marketplace = marketplace;
        this.sellerInfo = sellerInfo;
        this.shipToStore = shipToStore;
        this.freeShipToStore = freeShipToStore;
        this.modelNumber = modelNumber;
        this.productUrl = productUrl;
        this.availableOnline = availableOnline;
        this.stock = stock;
        this.customerRating = customerRating;
        this.customerRatingImage = customerRatingImage;
        this.numReviews = numReviews;
        this.clearance = clearance;
        this.preOrder = preOrder;
        this.preOrderShipsOn = preOrderShipsOn;
        this.offerType = offerType;
        this.rhid = rhid;
        this.bundle = bundle;
        this.attributes = attributes;
        this.addToCartUrl = addToCartUrl;
        this.affiliateAddToCartUrl = affiliateAddToCartUrl;
        this.freeShippingOver50Dollars = freeShippingOver50Dollars;
        this.gender = gender;
        this.age = age;
        this.imageEntities = imageEntities;
        this.isTwoDayShippingEligible = isTwoDayShippingEligible;
        this.giftOption = giftOption;
        this.bestMarketplacePrice = bestMarketplacePrice;
        this.freight = freight;
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

    public Double getMsrp() {
        return msrp;
    }

    public void setMsrp(Double msrp) {
        this.msrp = msrp;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
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

    public ImageEntities getImageEntities() {
        return imageEntities;
    }

    public void setImageEntities(ImageEntities imageEntities) {
        this.imageEntities = imageEntities;
    }

    public GiftOption getGiftOption() {
        return giftOption;
    }

    public void setGiftOption(GiftOption giftOption) {
        this.giftOption = giftOption;
    }

    public Double getStandardShipRate() {
        return standardShipRate;
    }

    public void setStandardShipRate(Double standardShipRate) {
        this.standardShipRate = standardShipRate;
    }

    public Double getTwoThreeDayShippingRate() {
        return twoThreeDayShippingRate;
    }

    public void setTwoThreeDayShippingRate(Double twoThreeDayShippingRate) {
        this.twoThreeDayShippingRate = twoThreeDayShippingRate;
    }

    public String getSellerInfo() {
        return sellerInfo;
    }

    public void setSellerInfo(String sellerInfo) {
        this.sellerInfo = sellerInfo;
    }

    public String getPreOrderShipsOn() {
        return preOrderShipsOn;
    }

    public void setPreOrderShipsOn(String preOrderShipsOn) {
        this.preOrderShipsOn = preOrderShipsOn;
    }

    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    public Integer getRhid() {
        return rhid;
    }

    public void setRhid(Integer rhid) {
        this.rhid = rhid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Boolean getTwoDayShippingEligible() {
        return isTwoDayShippingEligible;
    }

    public void setTwoDayShippingEligible(Boolean twoDayShippingEligible) {
        isTwoDayShippingEligible = twoDayShippingEligible;
    }

    public BestMarketplacePrice getBestMarketplacePrice() {
        return bestMarketplacePrice;
    }

    public void setBestMarketplacePrice(BestMarketplacePrice bestMarketplacePrice) {
        this.bestMarketplacePrice = bestMarketplacePrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", parentItemId=" + parentItemId +
                ", name='" + name + '\'' +
                ", msrp=" + msrp +
                ", salePrice=" + salePrice +
                ", upc='" + upc + '\'' +
                ", categoryPath='" + categoryPath + '\'' +
                ", categoryNode='" + categoryNode + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", brandName='" + brandName + '\'' +
                ", thumbnailImage='" + thumbnailImage + '\'' +
                ", mediumImage='" + mediumImage + '\'' +
                ", largeImage='" + largeImage + '\'' +
                ", productTrackingUrl='" + productTrackingUrl + '\'' +
                ", ninetySevenCentShipping=" + ninetySevenCentShipping +
                ", standardShipRate=" + standardShipRate +
                ", twoThreeDayShippingRate=" + twoThreeDayShippingRate +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", marketplace=" + marketplace +
                ", sellerInfo='" + sellerInfo + '\'' +
                ", shipToStore=" + shipToStore +
                ", freeShipToStore=" + freeShipToStore +
                ", modelNumber='" + modelNumber + '\'' +
                ", productUrl='" + productUrl + '\'' +
                ", availableOnline=" + availableOnline +
                ", stock='" + stock + '\'' +
                ", customerRating='" + customerRating + '\'' +
                ", customerRatingImage='" + customerRatingImage + '\'' +
                ", numReviews=" + numReviews +
                ", clearance=" + clearance +
                ", preOrder=" + preOrder +
                ", preOrderShipsOn='" + preOrderShipsOn + '\'' +
                ", offerType='" + offerType + '\'' +
                ", rhid=" + rhid +
                ", bundle=" + bundle +
                ", attributes=" + attributes +
                ", addToCartUrl='" + addToCartUrl + '\'' +
                ", affiliateAddToCartUrl='" + affiliateAddToCartUrl + '\'' +
                ", freeShippingOver50Dollars=" + freeShippingOver50Dollars +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", imageEntities=" + imageEntities +
                ", isTwoDayShippingEligible=" + isTwoDayShippingEligible +
                ", giftOption=" + giftOption +
                ", bestMarketplacePrice=" + bestMarketplacePrice +
                ", freight=" + freight +
                '}';
    }
}
