package org.example.mapper;

import org.example.dto.OrderDto;
import org.example.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface DtoMapper {

    @Mapping(target = "customer.id", source = "customerId")
    @Mapping(target = "customer", source = "order.customerData")
    Order mapOrder(OrderDto order);
}
