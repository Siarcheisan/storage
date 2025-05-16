package by.sankevich.storage.service;

import by.sankevich.storage.dto.OrderDto;
import by.sankevich.storage.entity.Order;
import by.sankevich.storage.mapper.OrderMapper;
import by.sankevich.storage.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {
    private final OrderMapper orderMapper;
    private final OrderRepository orderRepository;

    @Override
    public OrderDto save(OrderDto orderDto) {
        Order order = orderMapper.toEntity(orderDto);
        Order savedFromDB = orderRepository.save(order);
        return orderMapper.toDto(savedFromDB);
    }

    @Override
    public void delete(Long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public OrderDto findById(Long id) {
        Order gottenFromDB = orderRepository.findById(id).get();
        return orderMapper.toDto(gottenFromDB);
    }

    @Override
    public List<OrderDto> findAll() {
       List<Order> gottenFromDB  = orderRepository.findAll();
        return orderMapper.toDtoList(gottenFromDB);
    }
}
