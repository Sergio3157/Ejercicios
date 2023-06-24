package mx.axity.com.webapi.rest.client.model.base;

import java.io.Serializable;

public abstract class AbstractBaseDO implements Serializable {

    private static final long serialVersionUID = 1l;

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

}
