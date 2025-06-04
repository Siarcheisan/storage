package by.sankevich.storage.service;

import by.sankevich.storage.dto.DeliveryRequestDto;
import by.sankevich.storage.dto.DeliveryResponseDto;
import by.sankevich.storage.entity.Delivery;
import by.sankevich.storage.mapper.DeliveryMapper;
import by.sankevich.storage.repository.DeliveryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DeliveryServiceImpl implements DeliveryService {
    private final DeliveryRepository deliveryRepository;
    private final DeliveryMapper deliveryMapper;

    /**
     * saves entity
     *
     * @param deliveryRequestDto for saving
     * @return {@code Delivery}
     */
    @Override
    public DeliveryResponseDto save(DeliveryRequestDto deliveryRequestDto) {
        Delivery deliveryToSave = deliveryMapper.toEntity(deliveryRequestDto);
        Date date = new Date();
        deliveryToSave.setDate(date);
        Delivery savedInDbProduct = deliveryRepository.save(deliveryToSave);
        return deliveryMapper.toDto(savedInDbProduct);
    }

    /**
     * @param id
     */
    @Override
    public void delete(Long id) {
        deliveryRepository.deleteById(id);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public DeliveryResponseDto get(Long id) {
        Delivery delivery = deliveryRepository.findById(id).orElse(new Delivery());
        return deliveryMapper.toDto(delivery);
    }

    /**
     * @return
     */
    @Override
    public List<DeliveryResponseDto> getAllDelivery() {
        List<Delivery> deliveries = deliveryRepository.findAll();
        List<DeliveryResponseDto> deliveryResponseDtos = new ArrayList<>();
        for (Delivery delivery : deliveries) {
            DeliveryResponseDto deliveryResponseDto = deliveryMapper.toDto(delivery);
            deliveryResponseDtos.add(deliveryResponseDto);
        }
        return deliveryResponseDtos;
    }
}
