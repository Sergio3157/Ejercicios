package mx.axity.com.webapi.rest.client.model;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

import mx.axity.com.webapi.rest.client.model.base.AbstractSignedBaseDO;



@Entity
@Table(name = "Player")
public class PlayerDO  extends AbstractSignedBaseDO {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private BigInteger id;
    @Column(name = "name")
    private String name;
    @Column(name = "race")
    private String race;
    @Column(name = "playerClass")
    private String playerClass;
    @Column(name = "level")
    private int level;
    @Column(name = "hitPoints")
    private int hitPoints;
    @Column(name = "strength")
    private int strength;
    @Column(name = "dexterity")
    private int dexterity;
    @Column(name = "constitution")
    private int constitution;
    @Column(name = "intelligence")
    private int intelligence;
    @Column(name = "wisdom")
    private int wisdom;
    @Column(name = "charisma")
    private int charisma;

    public void setId(BigInteger id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public BigInteger getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public int getLevel() {
        return level;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }



    @Override
    public boolean equals( Object object )
    {
        boolean isEquals = false;
        if( this == object )
        {
            isEquals = true;
        }
        else if( object != null && object.getClass().equals( this.getClass() ) )
        {
            PlayerDO that = (PlayerDO) object;

            isEquals = Objects.equals( this.id, that.id );
        }
        return isEquals;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode()
    {
        return Objects.hash( this.id );
    }


}
