package org.allegro.pojo;

public class Option {

    private boolean advertisement;
    private boolean advertisementPriceOptional;
    private boolean variantsByColorPatternAllowed;
    private boolean offersWithProductPublicationEnabled;
    private boolean productCreationEnabled;
    private boolean productEANRequired;
    private boolean customParametersEnabled;
    private boolean variantsAllowed;
    private boolean variantsEqual;
    private Integer ambiguousValueId;
    private Integer dependsOnParameterId;
    private String requiredDependsOnValueIds[];
    private String displayDependsOnValueIds[];
    private boolean describesProduct;
    private boolean customValuesEnabled;

    public boolean isAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(boolean advertisement) {
        this.advertisement = advertisement;
    }

    public boolean isAdvertisementPriceOptional() {
        return advertisementPriceOptional;
    }

    public void setAdvertisementPriceOptional(boolean advertisementPriceOptional) {
        this.advertisementPriceOptional = advertisementPriceOptional;
    }

    public boolean isVariantsByColorPatternAllowed() {
        return variantsByColorPatternAllowed;
    }

    public void setVariantsByColorPatternAllowed(boolean variantsByColorPatternAllowed) {
        this.variantsByColorPatternAllowed = variantsByColorPatternAllowed;
    }

    public boolean isOffersWithProductPublicationEnabled() {
        return offersWithProductPublicationEnabled;
    }

    public void setOffersWithProductPublicationEnabled(boolean offersWithProductPublicationEnabled) {
        this.offersWithProductPublicationEnabled = offersWithProductPublicationEnabled;
    }

    public boolean isProductCreationEnabled() {
        return productCreationEnabled;
    }

    public void setProductCreationEnabled(boolean productCreationEnabled) {
        this.productCreationEnabled = productCreationEnabled;
    }

    public boolean isProductEANRequired() {
        return productEANRequired;
    }

    public void setProductEANRequired(boolean productEANRequired) {
        this.productEANRequired = productEANRequired;
    }

    public boolean isCustomParametersEnabled() {
        return customParametersEnabled;
    }

    public void setCustomParametersEnabled(boolean customParametersEnabled) {
        this.customParametersEnabled = customParametersEnabled;
    }

    public boolean isVariantsAllowed() {
        return variantsAllowed;
    }

    public void setVariantsAllowed(boolean variantsAllowed) {
        this.variantsAllowed = variantsAllowed;
    }

    public boolean isVariantsEqual() {
        return variantsEqual;
    }

    public void setVariantsEqual(boolean variantsEqual) {
        this.variantsEqual = variantsEqual;
    }

    public Integer getAmbiguousValueId() {
        return ambiguousValueId;
    }

    public void setAmbiguousValueId(Integer ambiguousValueId) {
        this.ambiguousValueId = ambiguousValueId;
    }

    public Integer getDependsOnParameterId() {
        return dependsOnParameterId;
    }

    public void setDependsOnParameterId(Integer dependsOnParameterId) {
        this.dependsOnParameterId = dependsOnParameterId;
    }

    public String[] getRequiredDependsOnValueIds() {
        return requiredDependsOnValueIds;
    }

    public void setRequiredDependsOnValueIds(String[] requiredDependsOnValueIds) {
        this.requiredDependsOnValueIds = requiredDependsOnValueIds;
    }

    public String[] getDisplayDependsOnValueIds() {
        return displayDependsOnValueIds;
    }

    public void setDisplayDependsOnValueIds(String[] displayDependsOnValueIds) {
        this.displayDependsOnValueIds = displayDependsOnValueIds;
    }

    public boolean isDescribesProduct() {
        return describesProduct;
    }

    public void setDescribesProduct(boolean describesProduct) {
        this.describesProduct = describesProduct;
    }

    public boolean isCustomValuesEnabled() {
        return customValuesEnabled;
    }

    public void setCustomValuesEnabled(boolean customValuesEnabled) {
        this.customValuesEnabled = customValuesEnabled;
    }
}
