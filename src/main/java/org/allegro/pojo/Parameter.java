package org.allegro.pojo;

public class Parameter {

    public String id;
    public String name;
    public String type;
    public boolean required;
    public boolean requiredForProduct;
    public Object unit;
    public Option option;
    public Restriction restriction;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public boolean isRequiredForProduct() {
        return requiredForProduct;
    }

    public void setRequiredForProduct(boolean requiredForProduct) {
        this.requiredForProduct = requiredForProduct;
    }

    public Object getUnit() {
        return unit;
    }

    public void setUnit(Object unit) {
        this.unit = unit;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    public Restriction getRestriction() {
        return restriction;
    }

    public void setRestriction(Restriction restriction) {
        this.restriction = restriction;
    }
}
