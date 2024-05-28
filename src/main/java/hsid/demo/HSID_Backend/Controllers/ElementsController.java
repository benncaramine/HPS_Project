package hsid.demo.HSID_Backend.Controllers;

import hsid.demo.HSID_Backend.Repository.ElementsRepository;
import hsid.demo.HSID_Backend.Service.ElementsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@AllArgsConstructor
@RestController
@RequestMapping()
public class ElementsController {

    private ElementsService elementsService;

    @GetMapping("/attribute")
    public Map<Integer, String> getSpecificAttribute(@RequestParam String attribute) {
        return elementsService.getSpecificAttribute(attribute);
    }

}
