package hsid.demo.HSID_Backend.Service;

import hsid.demo.HSID_Backend.Dtos.MessagesDto;

import java.util.List;

public interface MessagesService {

    List<MessagesDto> getMessages();
    MessagesDto getMessageById(String code);
}
