package by.sankevich.storage.controller;

import by.sankevich.storage.dto.DeliveryRequestDto;
import by.sankevich.storage.dto.DeliveryResponseDto;
import by.sankevich.storage.service.DeliveryService;
import by.sankevich.storage.service.DeliveryServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/deliveries")
@AllArgsConstructor
@RestController

public class DeliveryController {
    private final DeliveryService deliveryService;


    @PostMapping
    public ResponseEntity<DeliveryResponseDto> save(@RequestBody DeliveryRequestDto delivery) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(deliveryService.save(delivery));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        deliveryService.delete(id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .build();
    }


    @GetMapping("/{id}")
    public ResponseEntity<DeliveryResponseDto> get(@PathVariable Long id) {
        return ResponseEntity.ok(deliveryService.get(id));
    }

    @GetMapping
    public ResponseEntity <List<DeliveryResponseDto>> getAllDelivery() {
        return ResponseEntity.ok(deliveryService.getAllDelivery());
    }


}
