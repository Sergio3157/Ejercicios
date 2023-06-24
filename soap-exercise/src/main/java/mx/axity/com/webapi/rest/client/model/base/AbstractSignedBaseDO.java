package mx.axity.com.webapi.rest.client.model.base;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractSignedBaseDO extends AbstractBaseDO{

    private static final long serialVersionUID = 1l;

    @Column(name = "st_active", nullable = false)
    protected boolean active;

    /**
     * {@inheritDoc}
     */
    @Override
    public abstract boolean equals( Object object );

    /**
     * {@inheritDoc}
     */
    @Override
    public abstract int hashCode();

    /**
     * @return the active
     */
    public boolean isActive()
    {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive( boolean active )
    {
        this.active = active;
    }


}
