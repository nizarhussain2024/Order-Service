package com.nizar.orders.service;

import com.nizar.orders.model.Order;
import java.time.LocalDateTime;
import java.util.List;

public class OrderCancellationService {
    
    public boolean canCancel(Order order) {
        // Orders can only be cancelled if they are pending or confirmed
        return "pending".equals(order.getStatus()) || 
               "confirmed".equals(order.getStatus());
    }
    
    public Order cancelOrder(Order order, String reason) {
        if (!canCancel(order)) {
            throw new IllegalStateException("Order cannot be cancelled in current status: " + order.getStatus());
        }
        
        order.setStatus("cancelled");
        order.setUpdatedAt(LocalDateTime.now());
        
        // In a real system, you'd add cancellation reason to order history
        return order;
    }
    
    public List<Order> getCancellableOrders(List<Order> orders) {
        return orders.stream()
            .filter(this::canCancel)
            .collect(java.util.stream.Collectors.toList());
    }
}

