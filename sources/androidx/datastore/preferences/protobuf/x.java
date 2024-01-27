package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.p0;
import androidx.datastore.preferences.protobuf.q1;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.x.a;
import androidx.datastore.preferences.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: GeneratedMessageLite */
public abstract class x<MessageType extends x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a<MessageType, BuilderType> {
    private static Map<Object, x<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize = -1;
    protected l1 unknownFields = l1.e();

    /* compiled from: GeneratedMessageLite */
    public static abstract class a<MessageType extends x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.C0043a<MessageType, BuilderType> {

        /* renamed from: h  reason: collision with root package name */
        private final MessageType f3002h;

        /* renamed from: i  reason: collision with root package name */
        protected MessageType f3003i;

        /* renamed from: j  reason: collision with root package name */
        protected boolean f3004j = false;

        protected a(MessageType messagetype) {
            this.f3002h = messagetype;
            this.f3003i = (x) messagetype.t(f.NEW_MUTABLE_INSTANCE);
        }

        private void v(MessageType messagetype, MessageType messagetype2) {
            a1.a().e(messagetype).a(messagetype, messagetype2);
        }

        /* renamed from: o */
        public final MessageType build() {
            MessageType p10 = j();
            if (p10.isInitialized()) {
                return p10;
            }
            throw a.C0043a.n(p10);
        }

        /* renamed from: p */
        public MessageType j() {
            if (this.f3004j) {
                return this.f3003i;
            }
            this.f3003i.B();
            this.f3004j = true;
            return this.f3003i;
        }

        /* renamed from: q */
        public BuilderType clone() {
            BuilderType D = a().f();
            D.u(j());
            return D;
        }

        /* access modifiers changed from: protected */
        public void r() {
            if (this.f3004j) {
                MessageType messagetype = (x) this.f3003i.t(f.NEW_MUTABLE_INSTANCE);
                v(messagetype, this.f3003i);
                this.f3003i = messagetype;
                this.f3004j = false;
            }
        }

        /* renamed from: s */
        public MessageType a() {
            return this.f3002h;
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public BuilderType l(MessageType messagetype) {
            return u(messagetype);
        }

        public BuilderType u(MessageType messagetype) {
            r();
            v(this.f3003i, messagetype);
            return this;
        }
    }

    /* compiled from: GeneratedMessageLite */
    protected static class b<T extends x<T, ?>> extends b<T> {

        /* renamed from: b  reason: collision with root package name */
        private final T f3005b;

        public b(T t10) {
            this.f3005b = t10;
        }

        /* renamed from: g */
        public T b(i iVar, o oVar) {
            return x.G(this.f3005b, iVar, oVar);
        }
    }

    /* compiled from: GeneratedMessageLite */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends x<MessageType, BuilderType> implements q0 {
        protected t<d> extensions = t.h();

        /* access modifiers changed from: package-private */
        public t<d> J() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        public /* bridge */ /* synthetic */ p0 a() {
            return x.super.a();
        }

        public /* bridge */ /* synthetic */ p0.a b() {
            return x.super.b();
        }

        public /* bridge */ /* synthetic */ p0.a f() {
            return x.super.f();
        }
    }

    /* compiled from: GeneratedMessageLite */
    static final class d implements t.b<d> {

        /* renamed from: h  reason: collision with root package name */
        final z.d<?> f3006h;

        /* renamed from: i  reason: collision with root package name */
        final int f3007i;

        /* renamed from: j  reason: collision with root package name */
        final q1.b f3008j;

        /* renamed from: k  reason: collision with root package name */
        final boolean f3009k;

        /* renamed from: l  reason: collision with root package name */
        final boolean f3010l;

        /* renamed from: a */
        public int compareTo(d dVar) {
            return this.f3007i - dVar.f3007i;
        }

        public boolean b() {
            return this.f3009k;
        }

        public q1.b c() {
            return this.f3008j;
        }

        public z.d<?> d() {
            return this.f3006h;
        }

        public int getNumber() {
            return this.f3007i;
        }

        public q1.c h() {
            return this.f3008j.a();
        }

        public boolean i() {
            return this.f3010l;
        }

        public p0.a j(p0.a aVar, p0 p0Var) {
            return ((a) aVar).u((x) p0Var);
        }
    }

    /* compiled from: GeneratedMessageLite */
    public static class e<ContainingType extends p0, Type> extends m<ContainingType, Type> {

        /* renamed from: a  reason: collision with root package name */
        final p0 f3011a;

        /* renamed from: b  reason: collision with root package name */
        final d f3012b;

        public q1.b a() {
            return this.f3012b.c();
        }

        public p0 b() {
            return this.f3011a;
        }

        public int c() {
            return this.f3012b.getNumber();
        }

        public boolean d() {
            return this.f3012b.f3009k;
        }
    }

    /* compiled from: GeneratedMessageLite */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static final <T extends x<T, ?>> boolean A(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.t(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d10 = a1.a().e(t10).d(t10);
        if (z10) {
            t10.u(f.SET_MEMOIZED_IS_INITIALIZED, d10 ? t10 : null);
        }
        return d10;
    }

    protected static <E> z.i<E> C(z.i<E> iVar) {
        int size = iVar.size();
        return iVar.q(size == 0 ? 10 : size * 2);
    }

    protected static Object E(p0 p0Var, String str, Object[] objArr) {
        return new c1(p0Var, str, objArr);
    }

    protected static <T extends x<T, ?>> T F(T t10, InputStream inputStream) {
        return r(G(t10, i.f(inputStream), o.b()));
    }

    static <T extends x<T, ?>> T G(T t10, i iVar, o oVar) {
        T t11 = (x) t10.t(f.NEW_MUTABLE_INSTANCE);
        try {
            e1 e10 = a1.a().e(t11);
            e10.b(t11, j.Q(iVar), oVar);
            e10.c(t11);
            return t11;
        } catch (IOException e11) {
            if (e11.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e11.getCause());
            }
            throw new InvalidProtocolBufferException(e11.getMessage()).i(t11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw e12;
        }
    }

    protected static <T extends x<?, ?>> void H(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    private static <T extends x<T, ?>> T r(T t10) {
        if (t10 == null || t10.isInitialized()) {
            return t10;
        }
        throw t10.n().a().i(t10);
    }

    protected static <E> z.i<E> w() {
        return b1.c();
    }

    static <T extends x<?, ?>> T x(Class<T> cls) {
        T t10 = (x) defaultInstanceMap.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (x) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 == null) {
            t10 = ((x) o1.i(cls)).a();
            if (t10 != null) {
                defaultInstanceMap.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    static Object z(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void B() {
        a1.a().e(this).c(this);
    }

    /* renamed from: D */
    public final BuilderType f() {
        return (a) t(f.NEW_BUILDER);
    }

    /* renamed from: I */
    public final BuilderType b() {
        BuilderType buildertype = (a) t(f.NEW_BUILDER);
        buildertype.u(this);
        return buildertype;
    }

    public int d() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = a1.a().e(this).g(this);
        }
        return this.memoizedSerializedSize;
    }

    public void e(CodedOutputStream codedOutputStream) {
        a1.a().e(this).e(this, k.P(codedOutputStream));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a().getClass().isInstance(obj)) {
            return false;
        }
        return a1.a().e(this).f(this, (x) obj);
    }

    public final x0<MessageType> g() {
        return (x0) t(f.GET_PARSER);
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int i11 = a1.a().e(this).i(this);
        this.memoizedHashCode = i11;
        return i11;
    }

    public final boolean isInitialized() {
        return A(this, true);
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.memoizedSerializedSize;
    }

    /* access modifiers changed from: package-private */
    public void o(int i10) {
        this.memoizedSerializedSize = i10;
    }

    /* access modifiers changed from: package-private */
    public Object q() {
        return t(f.BUILD_MESSAGE_INFO);
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType s() {
        return (a) t(f.NEW_BUILDER);
    }

    /* access modifiers changed from: protected */
    public Object t(f fVar) {
        return v(fVar, (Object) null, (Object) null);
    }

    public String toString() {
        return r0.e(this, super.toString());
    }

    /* access modifiers changed from: protected */
    public Object u(f fVar, Object obj) {
        return v(fVar, obj, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object v(f fVar, Object obj, Object obj2);

    /* renamed from: y */
    public final MessageType a() {
        return (x) t(f.GET_DEFAULT_INSTANCE);
    }
}
