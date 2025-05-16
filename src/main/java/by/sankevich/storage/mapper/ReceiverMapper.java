package by.sankevich.storage.mapper;

import by.sankevich.storage.dto.ReceiverDto;
import by.sankevich.storage.entity.Order;
import by.sankevich.storage.entity.Receiver;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Mapper (componentModel = "spring")
public interface ReceiverMapper {
     Receiver toEntity(ReceiverDto receiverDto);

     ReceiverDto toDto(Receiver receiver);
}
