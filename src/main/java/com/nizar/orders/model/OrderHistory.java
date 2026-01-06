package com.nizar.orders.model;

import java.time.LocalDateTime;

public class OrderHistory {
    private String orderId;
    private String status;
    private String changedBy;
    private LocalDateTime changedAt;
    private String notes;

    public OrderHistory(String orderId, String status, String changedBy) {
        this.orderId = orderId;
        this.status = status;
        this.changedBy = changedBy;
        this.changedAt = LocalDateTime.now();
    }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    
    public String getChangedBy() { return changedBy; }
    public void setChangedBy(String changedBy) { this.changedBy = changedBy; }
    
    public LocalDateTime getChangedAt() { return changedAt; }
    public void setChangedAt(LocalDateTime changedAt) { this.changedAt = changedAt; }
    
    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
}




