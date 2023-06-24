package mx.axity.com.webapi.rest.client.commons.exception;

public class BusinessException extends RuntimeException{
    private static final long serialVersionUID = 1l;
    private int code;
    private String details;

    public BusinessException()
    {
        super();
        this.code = 1;
    }

    public BusinessException( String message )
    {
        super( message );
        this.code = 1;
    }

    public BusinessException( Throwable cause )
    {
        super( cause );
        this.code = 1;
    }

    public BusinessException( String message, Throwable cause )
    {
        super( message, cause );
        this.code = 1;
    }
    public BusinessException( int code, String message )
    {
        super(message);
        this.code = code;
    }

    public BusinessException( int code, String message, String details )
    {
        super( message );
        this.code = code;
        this.details = details;
    }
    public BusinessException( int code, String message, String details, Throwable cause )
    {
        super( message, cause );
        this.code = code;
        this.details = details;
    }

    public BusinessException( int code, String message, Throwable cause )
    {
        super( message, cause );
        this.code = code;
    }

    public int getCode()
    {
        return code;
    }

    public String getDetails()
    {
        return details;
    }
}
