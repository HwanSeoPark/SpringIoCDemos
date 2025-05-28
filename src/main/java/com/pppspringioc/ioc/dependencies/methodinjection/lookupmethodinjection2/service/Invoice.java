package com.pppspringioc.ioc.dependencies.methodinjection.lookupmethodinjection2.service;

import java.time.LocalDateTime;
import java.util.UUID;

public class Invoice {
    private final String invoiceId = UUID.randomUUID().toString();
    private LocalDateTime createdAt;
    private String orderId;
    private double amount;

    public void generate(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
        this.createdAt = LocalDateTime.now();
    }

    public void printInvoice() {
        System.out.printf("Invoice ID: %s%nOrder ID: %s%nAmount: %.2f%nCreated At: %s%n%n",
                invoiceId, orderId, amount, createdAt);
    }
}