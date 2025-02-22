package com.queirozisrael.springBoot.entities.enums;

import com.queirozisrael.springBoot.entities.Order;
import org.aspectj.weaver.ast.Or;

public enum  OrderStatus {

    WAITING_PAYMENT(1),
    PAYED(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static OrderStatus valueOf(int code) {
        for (OrderStatus value: OrderStatus.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid order status code");
    }
}
