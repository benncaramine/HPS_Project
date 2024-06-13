package hsid.demo.HSID_Backend.Repository;

import hsid.demo.HSID_Backend.Entities.ElementValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ElementValueRepository extends JpaRepository<ElementValue, Long> {
    List<ElementValue> findByelementnumber(Integer elementnumber);
}
