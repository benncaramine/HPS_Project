package hsid.demo.HSID_Backend.Controllers;

import hsid.demo.HSID_Backend.Dtos.MessagesDto;
import hsid.demo.HSID_Backend.Service.MessagesService;
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
public class MessagesController {

    private MessagesService messagesService;

    @GetMapping("/messages")
    public ResponseEntity<List<MessagesDto>> getMessages(){
        List<MessagesDto> messages = messagesService.getMessages();
        return ResponseEntity.ok(messages);
    }
    @GetMapping("/messages/{code}")
    public ResponseEntity<MessagesDto> getMessageById(@PathVariable("code") String code){
       MessagesDto messagesDto = messagesService.getMessageById(code);
       return ResponseEntity.ok(messagesDto);
    }

}


