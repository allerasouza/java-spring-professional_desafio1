package br.com.hudeing.desafio1.services;

import br.com.hudeing.desafio1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){
        double freightCost = order.getBasic();
        if (freightCost < 100.0) {
            return 20.0;
        } else if (freightCost >= 100 && freightCost < 200 ) {
            return 12.0;
        }
        return 0;
    }
}
