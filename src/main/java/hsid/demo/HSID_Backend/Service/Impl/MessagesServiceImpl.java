package hsid.demo.HSID_Backend.Service.Impl;

import hsid.demo.HSID_Backend.Dtos.MessagesDto;
import hsid.demo.HSID_Backend.Dtos.ProtocoleDto;
import hsid.demo.HSID_Backend.Entities.Messages;
import hsid.demo.HSID_Backend.Entities.Protocole;
import hsid.demo.HSID_Backend.Mappers.MessagesMapper;
import hsid.demo.HSID_Backend.Mappers.ProtocoleMapper;
import hsid.demo.HSID_Backend.Repository.MessagesRepository;
import hsid.demo.HSID_Backend.Service.MessagesService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MessagesServiceImpl implements MessagesService {
    private MessagesRepository messagesRepository;


    @Override
    public List<MessagesDto> getMessages() {
        List<Messages> message = messagesRepository.findAll();
        return message.stream().map((messages) -> MessagesMapper.mapToMessagesDto(messages))
                .collect(Collectors.toList());

    }

    @Override
    public MessagesDto getMessageById(String code) {
        Messages messages = messagesRepository.findByCode(code);
        if (messages == null) {
            throw new EntityNotFoundException("Message not found with code: " + code);
        }
        return MessagesMapper.mapToMessagesDto(messages);
    }


}
