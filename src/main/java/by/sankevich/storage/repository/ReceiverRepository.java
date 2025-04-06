package by.sankevich.storage.repository;

import by.sankevich.storage.entity.Receiver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiverRepository extends JpaRepository <Receiver, Long> {
}
