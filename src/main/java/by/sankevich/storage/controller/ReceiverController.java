package by.sankevich.storage.controller;

import by.sankevich.storage.dto.ReceiverDto;
import by.sankevich.storage.entity.Receiver;
import by.sankevich.storage.repository.ReceiverRepository;
import by.sankevich.storage.service.ReceiverService;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping ("/receivers")

@AllArgsConstructor
@RestController
public class ReceiverController {
    private final ReceiverService receiverService;

    @PostMapping
    public ReceiverDto save(@RequestBody ReceiverDto receiver) {
        return receiverService.save(receiver);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        receiverService.delete(id);
    }


    @GetMapping("/{id}")
    public ReceiverDto get(@PathVariable Long id) {
        return receiverService.get(id);
    }

    @GetMapping
    public List<ReceiverDto> getAllReceivers() {
        return receiverService.getAllReceivers();
    }
}
