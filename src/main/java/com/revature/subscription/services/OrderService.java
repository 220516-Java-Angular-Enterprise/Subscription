package com.revature.subscription.services;

import java.util.List;

public class OrderService {


    public class OrderService {
        private final OrderDAO orderDAO;

        public OrderService(OrderDAO orderDAO) {
            this.orderDAO = orderDAO;
        }

        public void register(Order order) {
            orderDAO.save(order);
        }

        public List<Order> getAllOrder() {
            return orderDAO.getAll();
        }



    }

}
