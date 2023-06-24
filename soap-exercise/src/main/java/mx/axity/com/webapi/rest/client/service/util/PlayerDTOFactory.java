package mx.axity.com.webapi.rest.client.service.util;

import mx.axity.com.webapi.rest.client.commons.PlayerDTO;
import mx.axity.com.webapi.rest.client.model.PlayerDO;

public final class PlayerDTOFactory {

    public static PlayerDTO transform(PlayerDO entity )
    {
        PlayerDTO player = new PlayerDTO();
        player.setId( entity.getId() );
        player.setName( entity.getName() );
        player.setRace( entity.getRace() );
        player.setPlayerClass((entity.getPlayerClass()));
        player.setLevel(entity.getLevel());
        player.setHitPoints((entity.getHitPoints()));
        player.setStrength(entity.getStrength());
        player.setDexterity(entity.getDexterity());
        player.setConstitution(entity.getConstitution());
        player.setIntelligence(entity.getIntelligence());
        player.setWisdom(entity.getWisdom());
        player.setCharisma(entity.getCharisma());
        return player;
    }


}
