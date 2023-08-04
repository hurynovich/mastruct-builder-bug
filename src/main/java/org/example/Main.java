package org.example;

import org.example.dto.OrderDto;
import org.example.mapper.DtoMapper;
import org.example.model.Order;
import org.jeasy.random.EasyRandom;
import org.mapstruct.factory.Mappers;

public class Main {
    public static void main(String[] args) {
        EasyRandom rnd = new EasyRandom();
        DtoMapper mapper = Mappers.getMapper(DtoMapper.class);
        OrderDto orderDto = rnd.nextObject(OrderDto.class);

        Order order = mapper.mapOrder(orderDto);

        System.out.println(orderDto);
        System.out.println(order);
    }
}
