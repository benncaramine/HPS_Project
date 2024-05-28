package hsid.demo.HSID_Backend.Mappers;

import hsid.demo.HSID_Backend.Dtos.MessagesDto;
import hsid.demo.HSID_Backend.Entities.Messages;


public class MessagesMapper {
    public static MessagesDto mapToMessagesDto(Messages messages){
        return new MessagesDto(
                messages.getId(),
                messages.getNomprotocole(),
                messages.getCode(),
                messages.getSpecification()
        );
    }
    public static Messages mapToMessages(MessagesDto messagesDto){
        return new Messages(
                messagesDto.getId(),
                messagesDto.getNomprotocole(),
                messagesDto.getCode(),
                messagesDto.getSpecification()
        );
    }
}
