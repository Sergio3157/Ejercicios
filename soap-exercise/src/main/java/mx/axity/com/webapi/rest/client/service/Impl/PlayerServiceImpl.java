package mx.axity.com.webapi.rest.client.service.Impl;

import dnd.axity.com.PlayerType;
import mx.axity.com.webapi.rest.client.commons.exception.BusinessException;
import mx.axity.com.webapi.rest.client.model.PlayerDO;
import mx.axity.com.webapi.rest.client.commons.HeaderDTO;
import mx.axity.com.webapi.rest.client.commons.PlayerDTO;
import mx.axity.com.webapi.rest.client.commons.ResponseWrapperDTO;
import mx.axity.com.webapi.rest.client.persistance.repository.PlayerRepository;
import mx.axity.com.webapi.rest.client.service.PlayerService;
import mx.axity.com.webapi.rest.client.service.util.PlayerDTOFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public ResponseWrapperDTO<PlayerDTO> createPlayer(PlayerDTO playerDTO) {
        return null;
    }

    @Override
    public ResponseWrapperDTO<PlayerDTO> getPlayer(Integer id) {
        PlayerDO entity = this.findPlayerById(id);

        return new ResponseWrapperDTO<>(new HeaderDTO(0, "OK", "Record found"), PlayerDTOFactory.transform(entity));

    }

    @Override
    public ResponseWrapperDTO<PlayerDTO> updatePlayer(PlayerDTO player) {
        return null;
    }


    @Override
    public ResponseWrapperDTO<PlayerDTO> deletePlayer(Integer id) {
        PlayerDO entity = this.findPlayerById(id);;

        if (!entity.isActive()) {
            throw new BusinessException(101, "Record already deleted");
        }

        entity.setActive(false);
        entity = this.playerRepository.save(entity);

        return new ResponseWrapperDTO<>(new HeaderDTO(0, "OK", "Record deleted"), null);

    }


    private PlayerDO findPlayerById(Integer id) {
        return this.playerRepository.findById(id)
                .orElseThrow(() -> new BusinessException(100, "Record not found", "The person does not exists."));
    }
}
