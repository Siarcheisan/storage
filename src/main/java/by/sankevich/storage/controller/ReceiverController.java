package by.sankevich.storage.controller;

import by.sankevich.storage.dto.ReceiverDto;
import by.sankevich.storage.entity.Receiver;
import by.sankevich.storage.repository.ReceiverRepository;
import by.sankevich.storage.service.ReceiverService;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping ("/receivers")

@AllArgsConstructor
@RestController
public class ReceiverController {
    private final ReceiverService receiverService;

    @PostMapping
    public ResponseEntity <ReceiverDto> save(@RequestBody ReceiverDto receiver) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(receiverService.save(receiver));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <Void> delete(@PathVariable Long id) {
        receiverService.delete(id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .build();
    }


    @GetMapping("/{id}")
    public ResponseEntity <ReceiverDto> get(@PathVariable Long id) {
        return ResponseEntity
                .ok(receiverService.get(id));
    }

    @GetMapping
    public ResponseEntity <List<ReceiverDto>> getAllReceivers() {
        return ResponseEntity
                .ok(receiverService.getAllReceivers());
    }
}
