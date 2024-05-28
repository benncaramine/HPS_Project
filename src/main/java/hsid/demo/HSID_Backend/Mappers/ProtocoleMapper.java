package hsid.demo.HSID_Backend.Mappers;

import hsid.demo.HSID_Backend.Dtos.ProtocoleDto;
import hsid.demo.HSID_Backend.Entities.Protocole;

public class ProtocoleMapper {
public static ProtocoleDto mapToProtocoleDto(Protocole protocole){
    return new ProtocoleDto(
            protocole.getId(),
            protocole.getNomprotocole(),
            protocole.getDescription(),
            protocole.getVersion()
    );
}
public static Protocole mapToProtocole(ProtocoleDto protocoleDto){
    return new Protocole(
            protocoleDto.getId(),
            protocoleDto.getNomprotocole(),
            protocoleDto.getDescription(),
            protocoleDto.getVersion()
    );
}
}
