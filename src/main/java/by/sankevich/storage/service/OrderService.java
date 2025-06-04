package by.sankevich.storage.service;

import by.sankevich.storage.dto.OrderDto;

import java.util.List;

public interface OrderService {
    OrderDto save (OrderDto orderDto);
    void delete (Long id);
    OrderDto findById (Long id);
    List <OrderDto> findAll ();
}
