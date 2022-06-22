package com.batch.batchcsvtopostgres.model;

public class SalesRecord {
    private String country;
    private String itemType;
    private String orderId;
    private String unitsSold;
    private String unitPrice;
    private String unitCost;

    public SalesRecord() {
    }

    public SalesRecord(String country, String itemType, String orderId,
            String unitsSold, String unitPrice, String unitCost) {
        this.country = country;
        this.itemType = itemType;
        this.orderId = orderId;
        this.unitsSold = unitsSold;
        this.unitPrice = unitPrice;
        this.unitCost = unitCost;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(String unitsSold) {
        this.unitsSold = unitsSold;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(String unitCost) {
        this.unitCost = unitCost;
    }
}
