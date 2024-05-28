package hsid.demo.HSID_Backend.Controllers;

import hsid.demo.HSID_Backend.Repository.ElementsRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping()
public class ElementsController {

    private ElementsRepository elementsRepository;


}
