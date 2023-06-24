package mx.axity.com.webapi.rest.client.service.util.player;

import dnd.axity.com.PlayerType;
import mx.axity.com.webapi.rest.client.commons.PlayerDTO;

public class PlayerFactory {

    public static PlayerType transform(PlayerDTO dto){
        PlayerType player= null;
        if (dto != null) {
            player = new PlayerType();
            player.setId(dto.getId());
            player.setName(dto.getName());
            player.setRace( dto.getRace() );
            player.setPlayerClass((dto.getPlayerClass()));
            player.setLevel(dto.getLevel());
            player.setHitPoints((dto.getHitPoints()));
            player.setStrength(dto.getStrength());
            player.setDexterity(dto.getDexterity());
            player.setConstitution(dto.getConstitution());
            player.setIntelligence(dto.getIntelligence());
            player.setWisdom(dto.getWisdom());
            player.setCharisma(dto.getCharisma());
        }
        return player;
    }


    public static PlayerDTO transform(PlayerType player) {
        PlayerDTO dto = null;
        if (player != null) {
            dto = new PlayerDTO();
            dto.setId(player.getId());
            dto.setName(player.getName());
            dto.setRace( player.getRace() );
            dto.setPlayerClass((player.getPlayerClass()));
            dto.setLevel(player.getLevel());
            dto.setHitPoints((player.getHitPoints()));
            dto.setStrength(player.getStrength());
            dto.setDexterity(player.getDexterity());
            dto.setConstitution(player.getConstitution());
            dto.setIntelligence(player.getIntelligence());
            dto.setWisdom(player.getWisdom());
            dto.setCharisma(player.getCharisma());
        }
        return dto;
    }

}
