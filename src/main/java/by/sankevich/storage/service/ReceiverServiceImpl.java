package by.sankevich.storage.service;

import by.sankevich.storage.dto.ReceiverDto;
import by.sankevich.storage.entity.Receiver;
import by.sankevich.storage.mapper.ReceiverMapper;
import by.sankevich.storage.repository.ReceiverRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service

public class ReceiverServiceImpl implements ReceiverService {
    private final ReceiverRepository receiverRepository;
    private final ReceiverMapper receiverMapper;

    /**
     * @param receiverDto
     * @return
     */
    @Override
    public ReceiverDto save(ReceiverDto receiverDto) {
        Receiver receiver = receiverMapper.toEntity(receiverDto);
        Receiver receiverToDb = receiverRepository.save(receiver);
        return receiverMapper.toDto(receiverToDb);
    }

    /**
     * @param id
     */
    @Override
    public void delete(Long id) {
        receiverRepository.deleteById(id);

    }

    /**
     * @param id
     * @return
     */
    @Override
    public ReceiverDto get(Long id) {
        Receiver receiver = receiverRepository.findById(id).orElse(new Receiver());
        ReceiverDto receiverDto = receiverMapper.toDto(receiver);
        return receiverDto;
    }

    /**
     * @return
     */
    @Override
    public List<ReceiverDto> getAllReceivers() {
        List<Receiver> receivers = receiverRepository.findAll();
        List<ReceiverDto> receiverDtos = new ArrayList<>();
        for (Receiver receiver : receivers) {
            ReceiverDto receiverDto = receiverMapper.toDto(receiver);
            receiverDtos.add(receiverDto);

        }
        return receiverDtos;
    }
}