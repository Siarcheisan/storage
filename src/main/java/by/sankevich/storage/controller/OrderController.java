package by.sankevich.storage.controller;

import by.sankevich.storage.dto.OrderDto;
import by.sankevich.storage.entity.Order;
import by.sankevich.storage.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping ("/orders")

@AllArgsConstructor
@RestController
public class OrderController {
    private final OrderRepository orderRepository;

//    @PostMapping
//    public OrderDto save(@RequestBody OrderDto order) {
//        return orderRepository.save(order);
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(Long id) {
//        orderRepository.deleteById(id);
//    }
//
//
//
//    @GetMapping("/{id}")
//    public OrderDto get(Long id) {
//        return orderRepository.getReferenceById(id);
//    }
//
//    @GetMapping
//    public List <OrderDto> getAllOrders (){
//        return orderRepository.findAll();
//    }




}
