package mx.axity.com.webapi.rest.client.commons;

import java.io.Serializable;

/**
 * Response wrapper class.
 *
 * @param <T>
 */

public class ResponseWrapperDTO<T> implements Serializable {

    private static final long serialVersionUID =1l;

    private HeaderDTO header;
    private T body;

    /**
     * Default constructor.
     */
    public ResponseWrapperDTO()
    {
    }

    /**
     * Constructor by header and body.
     *
     * @param header
     * @param body
     */
    public ResponseWrapperDTO( HeaderDTO header, T body )
    {
        this.header = header;
        this.body = body;
    }

    /**
     * @return the header
     */
    public HeaderDTO getHeader()
    {
        return header;
    }

    /**
     * @param header the header to set
     */
    public void setHeader( HeaderDTO header )
    {
        this.header = header;
    }

    /**
     * @return the body
     */
    public T getBody()
    {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody( T body )
    {
        this.body = body;
    }
}
