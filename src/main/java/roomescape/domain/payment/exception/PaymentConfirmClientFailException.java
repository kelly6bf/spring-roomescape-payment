package roomescape.domain.payment.exception;

public class PaymentConfirmClientFailException extends RuntimeException {
    public PaymentConfirmClientFailException(final String message) {
        super(message);
    }
}
