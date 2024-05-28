package hsid.demo.HSID_Backend.Service;


import hsid.demo.HSID_Backend.Dtos.ProtocoleDto;

import java.util.List;

public interface ProtocoleService {

    List<ProtocoleDto> getProtocoles();
    ProtocoleDto getProtocoleById(String nomprotocole);
}
