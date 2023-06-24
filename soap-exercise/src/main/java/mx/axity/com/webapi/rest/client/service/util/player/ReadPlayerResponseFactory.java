package mx.axity.com.webapi.rest.client.service.util.player;

import dnd.axity.com.PlayerType;
import dnd.axity.com.ReadPlayerResponse;
import mx.axity.com.webapi.rest.client.commons.PlayerDTO;
import mx.axity.com.webapi.rest.client.commons.ResponseWrapperDTO;

public class ReadPlayerResponseFactory {


    public static ReadPlayerResponse transform(ResponseWrapperDTO<PlayerDTO> response) {
        ReadPlayerResponse wrapper = new ReadPlayerResponse();
        wrapper.setPlayer(PlayerFactory.transform(response.getBody()));
        return wrapper;
    }




}
