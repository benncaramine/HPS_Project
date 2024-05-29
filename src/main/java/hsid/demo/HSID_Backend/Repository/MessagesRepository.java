package hsid.demo.HSID_Backend.Repository;

import hsid.demo.HSID_Backend.Entities.Messages;
import org.apache.logging.log4j.message.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessagesRepository extends JpaRepository<Messages, Long> {
    Messages findByCode(String code);

    List<Messages> findByNomprotocole(String nomprotocole);
}
