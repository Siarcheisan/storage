package by.sankevich.storage.controller;

import by.sankevich.storage.dto.OrderDto;
import by.sankevich.storage.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/orders")
@RequiredArgsConstructor
@RestController
public class OrderController {
    private final OrderService orderService;


    @PostMapping
    public ResponseEntity<OrderDto> save(@RequestBody OrderDto order) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(orderService.save(order));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <Void> delete(@PathVariable Long id) {
        orderService.delete(id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .build();
    }

    @GetMapping("/{id}")
    public ResponseEntity <OrderDto> findById(@PathVariable Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(orderService.findById(id));
    }

    @GetMapping
    public ResponseEntity <List<OrderDto>> getAllOrders() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(orderService.findAll());
    }
}
