package hsid.demo.HSID_Backend.Controllers;

import hsid.demo.HSID_Backend.Dtos.MessagesDto;
import hsid.demo.HSID_Backend.Entities.Messages;
import hsid.demo.HSID_Backend.Service.MessagesService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping()
public class MessagesController {

    private MessagesService messagesService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/messages")
    public ResponseEntity<List<MessagesDto>> getMessages(){
        List<MessagesDto> messages = messagesService.getMessages();
        return ResponseEntity.ok(messages);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/messages/{code}")
    public ResponseEntity<MessagesDto> getMessageById(@PathVariable("code") String code){
       MessagesDto messagesDto = messagesService.getMessageById(code);
       return ResponseEntity.ok(messagesDto);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/messages/protocole/{nomprotocole}")
    public List<Messages> getMessagesByprotocol(@PathVariable String nomprotocole) {
        return messagesService.getMessagesByprotocol(nomprotocole);
    }
}



