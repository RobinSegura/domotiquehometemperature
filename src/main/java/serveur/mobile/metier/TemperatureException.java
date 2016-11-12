package serveur.mobile.metier;

/**
 * Created by dv on 09/02/2016.
 */
public class TemperatureException extends RuntimeException {
    public TemperatureException() {}

    public TemperatureException(String detailMessage) {
        super(detailMessage);
    }

    public TemperatureException(Throwable throwable) {
        super(throwable);
    }

    public TemperatureException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }
}
