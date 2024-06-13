package hsid.demo.HSID_Backend.Service.Impl;

import hsid.demo.HSID_Backend.Entities.ElementValue;
import hsid.demo.HSID_Backend.Repository.ElementValueRepository;
import hsid.demo.HSID_Backend.Service.ElementValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElementValueServiceImpl implements ElementValueService {

    @Autowired
    private ElementValueRepository elementValueRepository;

    @Override
    public List<ElementValue> getElementValuesByelementnumber(Integer elementnumber) {
        return elementValueRepository.findByelementnumber(elementnumber);
    }
}