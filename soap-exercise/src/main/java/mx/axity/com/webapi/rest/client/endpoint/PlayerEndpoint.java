package mx.axity.com.webapi.rest.client.endpoint;

import dnd.axity.com.DeletePlayerRequest;
import dnd.axity.com.ReadPlayerRequest;
import dnd.axity.com.ReadPlayerResponse;
import dnd.axity.com.UpdatePlayerRequest;
import mx.axity.com.webapi.rest.client.commons.PlayerDTO;
import mx.axity.com.webapi.rest.client.commons.ResponseWrapperDTO;
import mx.axity.com.webapi.rest.client.service.PlayerService;
import mx.axity.com.webapi.rest.client.service.util.player.PlayerFactory;
import mx.axity.com.webapi.rest.client.service.util.player.ReadPlayerResponseFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PlayerEndpoint {
  private static final String NAMESPACE_URI = "com.axity.dnd";

  @Autowired
  PlayerService playerService;

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ReadPlayerRequest")
  @ResponsePayload
  public ReadPlayerResponse readPlayer(@RequestPayload ReadPlayerRequest request) {
    ReadPlayerResponse response = null;
    ResponseWrapperDTO<PlayerDTO> player = playerService.getPlayer(request.getPlayerId());
    response = ReadPlayerResponseFactory.transform(player);

    return response;
  }



  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeletePlayerRequest")
  @ResponsePayload
  public void deletePerson(@RequestPayload DeletePlayerRequest request) {
    playerService.deletePlayer(request.getPlayerId());

  }




}
