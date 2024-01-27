package androidx.datastore.preferences.protobuf;

import java.util.List;

public class UninitializedMessageException extends RuntimeException {

    /* renamed from: h  reason: collision with root package name */
    private final List<String> f2693h = null;

    public UninitializedMessageException(p0 p0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
