package hsid.demo.HSID_Backend.Controllers;

import hsid.demo.HSID_Backend.Dtos.MessagesDto;
import hsid.demo.HSID_Backend.Dtos.ProtocoleDto;
import hsid.demo.HSID_Backend.Service.ProtocoleService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping()
public class ProtocoleController {

    private ProtocoleService protocoleService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/protocoles")
    public ResponseEntity<List<ProtocoleDto>> getProtocoles(){
        List<ProtocoleDto> protocoles = protocoleService.getProtocoles();
        return ResponseEntity.ok(protocoles);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/protocoles/{nomprotocole}")
    public ResponseEntity<ProtocoleDto> getProtocoleById(@PathVariable("nomprotocole") String nomprotocole){
        ProtocoleDto protocoleDto = protocoleService.getProtocoleById(nomprotocole);
        return ResponseEntity.ok(protocoleDto);
    }
}
