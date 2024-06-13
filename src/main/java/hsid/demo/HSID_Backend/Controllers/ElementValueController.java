package hsid.demo.HSID_Backend.Controllers;

import hsid.demo.HSID_Backend.Entities.ElementValue;
import hsid.demo.HSID_Backend.Service.ElementValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class ElementValueController {

    @Autowired
    private ElementValueService elementValueService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/element-values")
    public ResponseEntity<List<ElementValue>> getElementValuesByelementnumber(@RequestParam Integer elementnumber) {
        List<ElementValue> elementValues = elementValueService.getElementValuesByelementnumber(elementnumber);
        return ResponseEntity.ok(elementValues);
    }
}