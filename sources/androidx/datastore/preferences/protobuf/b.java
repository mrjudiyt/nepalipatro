package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p0;

/* compiled from: AbstractParser */
public abstract class b<MessageType extends p0> implements x0<MessageType> {

    /* renamed from: a  reason: collision with root package name */
    private static final o f2711a = o.b();

    private MessageType c(MessageType messagetype) {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw d(messagetype).a().i(messagetype);
    }

    private UninitializedMessageException d(MessageType messagetype) {
        if (messagetype instanceof a) {
            return ((a) messagetype).n();
        }
        return new UninitializedMessageException(messagetype);
    }

    /* renamed from: e */
    public MessageType a(h hVar, o oVar) {
        return c(f(hVar, oVar));
    }

    public MessageType f(h hVar, o oVar) {
        MessageType messagetype;
        try {
            i o10 = hVar.o();
            messagetype = (p0) b(o10, oVar);
            o10.a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.i(messagetype);
        } catch (InvalidProtocolBufferException e11) {
            throw e11;
        }
    }
}
