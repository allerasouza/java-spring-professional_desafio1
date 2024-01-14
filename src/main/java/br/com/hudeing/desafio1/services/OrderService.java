package br.com.hudeing.desafio1.services;

import br.com.hudeing.desafio1.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double freightCost = order.getBasic();
        double discountCost = freightCost * order.getDiscount() / 100;
        double shippingCost = shippingService.shipment(order);
        return freightCost - discountCost + shippingCost;
    }
}
