package com.company;

public class Invoice implements Payable {
    private double partNumber;
    private double quantity;
    private double pricePerItem;
    private String partDescription;

    public Invoice(double partNumber, double quantity, double pricePerItem, String partDescription) {
        this.partNumber = partNumber;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
        this.partDescription = partDescription;
    }

    public double getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(double partNumber) {
        this.partNumber = partNumber;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    @Override
    public double getPaymentAmount() {
        return getQuantity()*getPricePerItem();
    }
}
