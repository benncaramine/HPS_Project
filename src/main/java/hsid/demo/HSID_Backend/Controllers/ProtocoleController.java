package hsid.demo.HSID_Backend.Controllers;

import hsid.demo.HSID_Backend.Dtos.MessagesDto;
import hsid.demo.HSID_Backend.Dtos.ProtocoleDto;
import hsid.demo.HSID_Backend.Service.ProtocoleService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping()
public class ProtocoleController {

    private ProtocoleService protocoleService;

    @GetMapping("/protocoles")
    public ResponseEntity<List<ProtocoleDto>> getProtocoles(){
        List<ProtocoleDto> protocoles = protocoleService.getProtocoles();
        return ResponseEntity.ok(protocoles);
    }
    @GetMapping("/protocoles/{nomprotocole}")
    public ResponseEntity<ProtocoleDto> getProtocoleById(@PathVariable("nomprotocole") String nomprotocole){
        ProtocoleDto protocoleDto = protocoleService.getProtocoleById(nomprotocole);
        return ResponseEntity.ok(protocoleDto);
    }
}
