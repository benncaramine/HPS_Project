package hsid.demo.HSID_Backend.Repository;

import hsid.demo.HSID_Backend.Entities.Messages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessagesRepository extends JpaRepository<Messages, Long> {
    Messages findByCode(String code);
}
