package org.example.homework_nr_6;

public class Invoice {
    private String modelName;
    private String modelDescription;
    private int quantity;
    private double price;

    public Invoice(String modelName, String modelDescription, int quantity, double price) {
        this.modelName = modelName;
        this.modelDescription = modelDescription;
        this.quantity = quantity;
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelDescription() {
        return modelDescription;
    }

    public void setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount(){
        if(getQuantity()<=0){
            setQuantity(0);
        }else if(getPrice()<=0){
            setPrice(0.0);
        }
        return (getPrice()*getQuantity());
    }
}

