package by.sankevich.storage.service;

import by.sankevich.storage.dto.ReceiverDto;
import by.sankevich.storage.entity.Receiver;

import java.util.List;

public interface ReceiverService {
    ReceiverDto save (ReceiverDto receiverDto);
    void delete (Long id);
    ReceiverDto get (Long id);
    List <ReceiverDto> getAllReceivers ();
}
