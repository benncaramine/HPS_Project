package hsid.demo.HSID_Backend.Service;

import hsid.demo.HSID_Backend.Entities.ElementValue;

import java.util.List;

public interface ElementValueService {
    List<ElementValue> getElementValuesByelementnumber(Integer elementnumber);
}