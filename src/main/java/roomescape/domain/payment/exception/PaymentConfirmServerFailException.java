package roomescape.domain.payment.exception;

public class PaymentConfirmServerFailException extends RuntimeException {
    public PaymentConfirmServerFailException(final String message) {
        super(message);
    }
}
