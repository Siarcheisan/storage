package by.sankevich.storage.service;

import by.sankevich.storage.dto.DeliveryRequestDto;
import by.sankevich.storage.dto.DeliveryResponseDto;

import java.util.List;

public interface DeliveryService {
    DeliveryResponseDto save (DeliveryRequestDto deliveryRequestDto);
    void delete (Long id);
    DeliveryResponseDto get (Long id);
    List <DeliveryResponseDto> getAllDelivery ();
}
