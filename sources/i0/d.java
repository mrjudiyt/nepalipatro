package i0;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: PreferencesMapCompat.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9067a = new a((g) null);

    /* compiled from: PreferencesMapCompat.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final f a(InputStream inputStream) {
            m.f(inputStream, "input");
            try {
                f Q = f.Q(inputStream);
                m.e(Q, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return Q;
            } catch (InvalidProtocolBufferException e10) {
                throw new CorruptionException("Unable to parse preferences proto.", e10);
            }
        }
    }
}
