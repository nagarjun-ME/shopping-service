package com.naga.spring.orderservice.model;

public class Order {

    private String orderId;
    private int quantity;
    private String orderInfo;

    public Order() {

    }

    public Order(String orderId, int quantity, String orderInfo) {
        this.orderId = orderId;
        this.quantity = quantity;
        this.orderInfo = orderInfo;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", quantity=" + quantity +
                ", orderInfo='" + orderInfo + '\'' +
                '}';
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }
}
