package mx.axity.com.webapi.rest.client.service;

import mx.axity.com.webapi.rest.client.commons.PlayerDTO;
import mx.axity.com.webapi.rest.client.commons.ResponseWrapperDTO;

public interface PlayerService {

    ResponseWrapperDTO<PlayerDTO> createPlayer(PlayerDTO playerDTO );

    ResponseWrapperDTO<PlayerDTO> getPlayer( Integer id );


    ResponseWrapperDTO<PlayerDTO> updatePlayer( PlayerDTO player );

    ResponseWrapperDTO<PlayerDTO> deletePlayer( Integer id );



}
