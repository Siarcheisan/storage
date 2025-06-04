package by.sankevich.storage.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter

public class ReceiverDto {
    private Long receiverId;

    private List<Long> orderIdList;
    private String companyName;
    private Long phoneNumber;
    private Long taxRegistrationNumber;
}
