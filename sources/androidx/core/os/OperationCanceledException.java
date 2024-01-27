package androidx.core.os;

import androidx.core.util.c;

public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this((String) null);
    }

    public OperationCanceledException(String str) {
        super(c.f(str, "The operation has been canceled."));
    }
}
