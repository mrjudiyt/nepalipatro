package j0;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.x;
import g0.j;
import i0.f;
import i0.h;
import j0.d;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import o8.q;

/* compiled from: PreferencesSerializer.kt */
public final class h implements j<d> {

    /* renamed from: a  reason: collision with root package name */
    public static final h f9398a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final String f9399b = "preferences_pb";

    /* compiled from: PreferencesSerializer.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9400a;

        static {
            int[] iArr = new int[h.b.values().length];
            iArr[h.b.BOOLEAN.ordinal()] = 1;
            iArr[h.b.FLOAT.ordinal()] = 2;
            iArr[h.b.DOUBLE.ordinal()] = 3;
            iArr[h.b.INTEGER.ordinal()] = 4;
            iArr[h.b.LONG.ordinal()] = 5;
            iArr[h.b.STRING.ordinal()] = 6;
            iArr[h.b.STRING_SET.ordinal()] = 7;
            iArr[h.b.VALUE_NOT_SET.ordinal()] = 8;
            f9400a = iArr;
        }
    }

    private h() {
    }

    private final void d(String str, i0.h hVar, a aVar) {
        h.b Z = hVar.Z();
        switch (Z == null ? -1 : a.f9400a[Z.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", (Throwable) null, 2, (g) null);
            case 1:
                aVar.j(f.a(str), Boolean.valueOf(hVar.R()));
                return;
            case 2:
                aVar.j(f.c(str), Float.valueOf(hVar.U()));
                return;
            case 3:
                aVar.j(f.b(str), Double.valueOf(hVar.T()));
                return;
            case 4:
                aVar.j(f.d(str), Integer.valueOf(hVar.V()));
                return;
            case 5:
                aVar.j(f.e(str), Long.valueOf(hVar.W()));
                return;
            case 6:
                d.a<String> f10 = f.f(str);
                String X = hVar.X();
                m.e(X, "value.string");
                aVar.j(f10, X);
                return;
            case 7:
                d.a<Set<String>> g10 = f.g(str);
                List<String> O = hVar.Y().O();
                m.e(O, "value.stringSet.stringsList");
                aVar.j(g10, x.V(O));
                return;
            case 8:
                throw new CorruptionException("Value not set.", (Throwable) null, 2, (g) null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final i0.h g(Object obj) {
        if (obj instanceof Boolean) {
            x o10 = i0.h.a0().w(((Boolean) obj).booleanValue()).build();
            m.e(o10, "newBuilder().setBoolean(value).build()");
            return (i0.h) o10;
        } else if (obj instanceof Float) {
            x o11 = i0.h.a0().y(((Number) obj).floatValue()).build();
            m.e(o11, "newBuilder().setFloat(value).build()");
            return (i0.h) o11;
        } else if (obj instanceof Double) {
            x o12 = i0.h.a0().x(((Number) obj).doubleValue()).build();
            m.e(o12, "newBuilder().setDouble(value).build()");
            return (i0.h) o12;
        } else if (obj instanceof Integer) {
            x o13 = i0.h.a0().z(((Number) obj).intValue()).build();
            m.e(o13, "newBuilder().setInteger(value).build()");
            return (i0.h) o13;
        } else if (obj instanceof Long) {
            x o14 = i0.h.a0().A(((Number) obj).longValue()).build();
            m.e(o14, "newBuilder().setLong(value).build()");
            return (i0.h) o14;
        } else if (obj instanceof String) {
            x o15 = i0.h.a0().B((String) obj).build();
            m.e(o15, "newBuilder().setString(value).build()");
            return (i0.h) o15;
        } else if (obj instanceof Set) {
            x o16 = i0.h.a0().C(i0.g.P().w((Set) obj)).build();
            m.e(o16, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
            return (i0.h) o16;
        } else {
            throw new IllegalStateException(m.o("PreferencesSerializer does not support type: ", obj.getClass().getName()));
        }
    }

    public Object b(InputStream inputStream, r8.d<? super d> dVar) {
        f a10 = i0.d.f9067a.a(inputStream);
        a b10 = e.b(new d.b[0]);
        Map<String, i0.h> M = a10.M();
        m.e(M, "preferencesProto.preferencesMap");
        for (Map.Entry next : M.entrySet()) {
            String str = (String) next.getKey();
            i0.h hVar = (i0.h) next.getValue();
            h hVar2 = f9398a;
            m.e(str, "name");
            m.e(hVar, "value");
            hVar2.d(str, hVar, b10);
        }
        return b10.d();
    }

    /* renamed from: e */
    public d a() {
        return e.a();
    }

    public final String f() {
        return f9399b;
    }

    /* renamed from: h */
    public Object c(d dVar, OutputStream outputStream, r8.d<? super q> dVar2) {
        Map<d.a<?>, Object> a10 = dVar.a();
        f.a P = f.P();
        for (Map.Entry next : a10.entrySet()) {
            P.w(((d.a) next.getKey()).a(), g(next.getValue()));
        }
        ((f) P.build()).p(outputStream);
        return q.f16189a;
    }
}
