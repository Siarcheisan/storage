package by.sankevich.storage.mapper;

import by.sankevich.storage.dto.ReceiverDto;
import by.sankevich.storage.entity.Order;
import by.sankevich.storage.entity.Receiver;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ReceiverMapper {
    public Receiver toEntity (ReceiverDto receiverDto){
        Receiver receiver = new Receiver();
        receiver.setCompanyName(receiverDto.getCompanyName());
        receiver.setPhoneNumber(receiverDto.getPhoneNumber());
        receiver.setTaxRegistrationNumber(receiverDto.getTaxRegistrationNumber());
        List < Order> orderList = new ArrayList<>();
        for (Long id:receiverDto.getOrderIdList()){
            Order order = new Order();
            order.setOrderId(id);
            orderList.add(order);
        }
        receiver.setOrder(orderList);
        return receiver;
    }
    public ReceiverDto toDto (Receiver receiver){
        ReceiverDto receiverDto = new ReceiverDto();
        receiverDto.setReceiverId(receiver.getReceiverId());
        receiverDto.setCompanyName(receiver.getCompanyName());
        receiverDto.setPhoneNumber(receiver.getPhoneNumber());
        receiverDto.setTaxRegistrationNumber(receiver.getTaxRegistrationNumber());
        return receiverDto;
    }
}
