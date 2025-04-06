package by.sankevich.storage.controller;

import by.sankevich.storage.dto.DeliveryRequestDto;
import by.sankevich.storage.dto.DeliveryResponseDto;
import by.sankevich.storage.service.DeliveryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping ("/deliveries")
@AllArgsConstructor
@RestController

public class DeliveryController {
    private final DeliveryService deliveryService;


    @PostMapping
    public DeliveryResponseDto save(@RequestBody DeliveryRequestDto delivery) {
        return deliveryService.save(delivery);
    }



    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        deliveryService.delete(id);

    }



    @GetMapping ("/{id}")
    public DeliveryResponseDto get(@PathVariable Long id) {
        return deliveryService.get(id);


    }
    @GetMapping
    public List <DeliveryResponseDto> getAllDelivery() {
        return deliveryService.getAllDelivery();
    }




}
