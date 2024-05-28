package hsid.demo.HSID_Backend.Service.Impl;

import hsid.demo.HSID_Backend.Dtos.MessagesDto;
import hsid.demo.HSID_Backend.Dtos.ProtocoleDto;
import hsid.demo.HSID_Backend.Entities.Messages;
import hsid.demo.HSID_Backend.Entities.Protocole;
import hsid.demo.HSID_Backend.Mappers.MessagesMapper;
import hsid.demo.HSID_Backend.Mappers.ProtocoleMapper;
import hsid.demo.HSID_Backend.Repository.ProtocoleRepository;
import hsid.demo.HSID_Backend.Service.ProtocoleService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProtocoleServiceImpl implements ProtocoleService {
    private ProtocoleRepository protocoleRepository;

    @Override
    public List<ProtocoleDto> getProtocoles() {
       List<Protocole> protocoles = protocoleRepository.findAll();
        return protocoles.stream().map((protocole) -> ProtocoleMapper.mapToProtocoleDto(protocole))
                .collect(Collectors.toList());
    }

    @Override
    public ProtocoleDto getProtocoleById(String nomprotocole) {
        Protocole protocole = protocoleRepository.findBynomprotocole(nomprotocole);
        if (protocole == null) {
            throw new EntityNotFoundException("Message not found with code: " + nomprotocole);
        }
        return ProtocoleMapper.mapToProtocoleDto(protocole);
    }
}
