package w7;

import ea.e;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import v7.u;

/* compiled from: Platform */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final f f16996a = e();

    /* compiled from: Platform */
    private static class a extends f {

        /* renamed from: b  reason: collision with root package name */
        private final Class<?> f16997b;

        /* renamed from: c  reason: collision with root package name */
        private final e<Socket> f16998c;

        /* renamed from: d  reason: collision with root package name */
        private final e<Socket> f16999d;

        /* renamed from: e  reason: collision with root package name */
        private final Method f17000e;

        /* renamed from: f  reason: collision with root package name */
        private final Method f17001f;

        /* renamed from: g  reason: collision with root package name */
        private final e<Socket> f17002g;

        /* renamed from: h  reason: collision with root package name */
        private final e<Socket> f17003h;

        public a(Class<?> cls, e<Socket> eVar, e<Socket> eVar2, Method method, Method method2, e<Socket> eVar3, e<Socket> eVar4) {
            this.f16997b = cls;
            this.f16998c = eVar;
            this.f16999d = eVar2;
            this.f17000e = method;
            this.f17001f = method2;
            this.f17002g = eVar3;
            this.f17003h = eVar4;
        }

        public void c(SSLSocket sSLSocket, String str, List<u> list) {
            if (str != null) {
                this.f16998c.e(sSLSocket, Boolean.TRUE);
                this.f16999d.e(sSLSocket, str);
            }
            e<Socket> eVar = this.f17003h;
            if (eVar != null && eVar.g(sSLSocket)) {
                this.f17003h.f(sSLSocket, f.b(list));
            }
        }

        public void d(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
            try {
                socket.connect(inetSocketAddress, i10);
            } catch (AssertionError e10) {
                if (h.o(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            } catch (SecurityException e11) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e11);
                throw iOException;
            }
        }

        public String h(SSLSocket sSLSocket) {
            byte[] bArr;
            e<Socket> eVar = this.f17002g;
            if (eVar == null || !eVar.g(sSLSocket) || (bArr = (byte[]) this.f17002g.f(sSLSocket, new Object[0])) == null) {
                return null;
            }
            return new String(bArr, h.f17016c);
        }

        public X509TrustManager j(SSLSocketFactory sSLSocketFactory) {
            Object i10 = f.i(sSLSocketFactory, this.f16997b, "sslParameters");
            if (i10 == null) {
                try {
                    i10 = f.i(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
                } catch (ClassNotFoundException unused) {
                    return null;
                }
            }
            X509TrustManager x509TrustManager = (X509TrustManager) f.i(i10, X509TrustManager.class, "x509TrustManager");
            if (x509TrustManager != null) {
                return x509TrustManager;
            }
            return (X509TrustManager) f.i(i10, X509TrustManager.class, "trustManager");
        }

        public a8.f k(X509TrustManager x509TrustManager) {
            a8.f b10 = a8.a.b(x509TrustManager);
            if (b10 != null) {
                return b10;
            }
            return f.super.k(x509TrustManager);
        }
    }

    /* compiled from: Platform */
    private static class b extends f {

        /* renamed from: b  reason: collision with root package name */
        private final Class<?> f17004b;

        public b(Class<?> cls) {
            this.f17004b = cls;
        }

        public X509TrustManager j(SSLSocketFactory sSLSocketFactory) {
            Object i10 = f.i(sSLSocketFactory, this.f17004b, "context");
            if (i10 == null) {
                return null;
            }
            return (X509TrustManager) f.i(i10, X509TrustManager.class, "trustManager");
        }
    }

    /* compiled from: Platform */
    private static class c extends b {

        /* renamed from: c  reason: collision with root package name */
        private final Method f17005c;

        /* renamed from: d  reason: collision with root package name */
        private final Method f17006d;

        /* renamed from: e  reason: collision with root package name */
        private final Method f17007e;

        /* renamed from: f  reason: collision with root package name */
        private final Class<?> f17008f;

        /* renamed from: g  reason: collision with root package name */
        private final Class<?> f17009g;

        public c(Class<?> cls, Method method, Method method2, Method method3, Class<?> cls2, Class<?> cls3) {
            super(cls);
            this.f17005c = method;
            this.f17006d = method2;
            this.f17007e = method3;
            this.f17008f = cls2;
            this.f17009g = cls3;
        }

        public void a(SSLSocket sSLSocket) {
            try {
                this.f17007e.invoke((Object) null, new Object[]{sSLSocket});
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }

        public void c(SSLSocket sSLSocket, String str, List<u> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                u uVar = list.get(i10);
                if (uVar != u.HTTP_1_0) {
                    arrayList.add(uVar.toString());
                }
            }
            try {
                Object newProxyInstance = Proxy.newProxyInstance(f.class.getClassLoader(), new Class[]{this.f17008f, this.f17009g}, new d(arrayList));
                this.f17005c.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new AssertionError(e10);
            }
        }

        public String h(SSLSocket sSLSocket) {
            try {
                d dVar = (d) Proxy.getInvocationHandler(this.f17006d.invoke((Object) null, new Object[]{sSLSocket}));
                if (!dVar.f17011b && dVar.f17012c == null) {
                    b.f16990a.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                } else if (dVar.f17011b) {
                    return null;
                } else {
                    return dVar.f17012c;
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }
    }

    /* compiled from: Platform */
    private static class d implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f17010a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f17011b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f17012c;

        public d(List<String> list) {
            this.f17010a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = h.f17015b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f17011b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f17010a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f17010a.contains(list.get(i10))) {
                            String str = (String) list.get(i10);
                            this.f17012c = str;
                            return str;
                        }
                    }
                    String str2 = this.f17010a.get(0);
                    this.f17012c = str2;
                    return str2;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f17012c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    static byte[] b(List<u> list) {
        e eVar = new e();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            u uVar = list.get(i10);
            if (uVar != u.HTTP_1_0) {
                eVar.G(uVar.toString().length());
                eVar.U(uVar.toString());
            }
        }
        return eVar.D();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:40|41|42) */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fb, code lost:
        return new w7.f.b(r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00f6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static w7.f e() {
        /*
            java.lang.Class<byte[]> r0 = byte[].class
            r1 = 1
            r2 = 0
            java.lang.String r3 = "com.android.org.conscrypt.SSLParametersImpl"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x000c }
        L_0x000a:
            r5 = r3
            goto L_0x0013
        L_0x000c:
            java.lang.String r3 = "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x007a }
            goto L_0x000a
        L_0x0013:
            w7.e r6 = new w7.e     // Catch:{ ClassNotFoundException -> 0x007a }
            java.lang.String r3 = "setUseSessionTickets"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x007a }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x007a }
            r4[r2] = r7     // Catch:{ ClassNotFoundException -> 0x007a }
            r7 = 0
            r6.<init>(r7, r3, r4)     // Catch:{ ClassNotFoundException -> 0x007a }
            w7.e r3 = new w7.e     // Catch:{ ClassNotFoundException -> 0x007a }
            java.lang.String r4 = "setHostname"
            java.lang.Class[] r8 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x007a }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r2] = r9     // Catch:{ ClassNotFoundException -> 0x007a }
            r3.<init>(r7, r4, r8)     // Catch:{ ClassNotFoundException -> 0x007a }
            java.lang.String r4 = "android.net.TrafficStats"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006c }
            java.lang.String r8 = "tagSocket"
            java.lang.Class[] r9 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006c }
            java.lang.Class<java.net.Socket> r10 = java.net.Socket.class
            r9[r2] = r10     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006c }
            java.lang.reflect.Method r8 = r4.getMethod(r8, r9)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006c }
            java.lang.String r9 = "untagSocket"
            java.lang.Class[] r10 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0069 }
            java.lang.Class<java.net.Socket> r11 = java.net.Socket.class
            r10[r2] = r11     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0069 }
            java.lang.reflect.Method r4 = r4.getMethod(r9, r10)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0069 }
            java.lang.String r9 = "android.net.Network"
            java.lang.Class.forName(r9)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0067 }
            w7.e r9 = new w7.e     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0067 }
            java.lang.String r10 = "getAlpnSelectedProtocol"
            java.lang.Class[] r11 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0067 }
            r9.<init>(r0, r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0067 }
            w7.e r10 = new w7.e     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006f }
            java.lang.String r11 = "setAlpnProtocols"
            java.lang.Class[] r12 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006f }
            r12[r2] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006f }
            r10.<init>(r7, r11, r12)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006f }
            r7 = r10
            goto L_0x006f
        L_0x0067:
            r9 = r7
            goto L_0x006f
        L_0x0069:
            r4 = r7
            r9 = r4
            goto L_0x006f
        L_0x006c:
            r4 = r7
            r8 = r4
            r9 = r8
        L_0x006f:
            r11 = r7
            r10 = r9
            r9 = r4
            w7.f$a r0 = new w7.f$a     // Catch:{ ClassNotFoundException -> 0x007a }
            r4 = r0
            r7 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ ClassNotFoundException -> 0x007a }
            return r0
        L_0x007a:
            java.lang.String r0 = "sun.security.ssl.SSLContextImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x00fc }
            java.lang.String r3 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            r5.<init>()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            r5.append(r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            java.lang.String r6 = "$Provider"
            r5.append(r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            java.lang.String r5 = r5.toString()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            r6.<init>()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            r6.append(r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            java.lang.String r7 = "$ClientProvider"
            r6.append(r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            java.lang.String r6 = r6.toString()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            java.lang.Class r8 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            r6.<init>()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            r6.append(r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            java.lang.String r3 = "$ServerProvider"
            r6.append(r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            java.lang.String r3 = r6.toString()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            java.lang.Class r9 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            java.lang.String r3 = "put"
            r6 = 2
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r2] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            r6[r1] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            java.lang.reflect.Method r5 = r4.getMethod(r3, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            java.lang.String r3 = "get"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r2] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            java.lang.reflect.Method r6 = r4.getMethod(r3, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            java.lang.String r3 = "remove"
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r1[r2] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            java.lang.reflect.Method r7 = r4.getMethod(r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            w7.f$c r1 = new w7.f$c     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            r3 = r1
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f6 }
            return r1
        L_0x00f6:
            w7.f$b r1 = new w7.f$b     // Catch:{ ClassNotFoundException -> 0x00fc }
            r1.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x00fc }
            return r1
        L_0x00fc:
            w7.f r0 = new w7.f
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.f.e():w7.f");
    }

    public static f f() {
        return f16996a;
    }

    static <T> T i(Object obj, Class<T> cls, String str) {
        Object i10;
        Class<Object> cls2 = Object.class;
        Class cls3 = obj.getClass();
        while (cls3 != cls2) {
            try {
                Field declaredField = cls3.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (obj2 != null) {
                    if (cls.isInstance(obj2)) {
                        return cls.cast(obj2);
                    }
                }
                return null;
            } catch (NoSuchFieldException unused) {
                cls3 = cls3.getSuperclass();
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        }
        if (str.equals("delegate") || (i10 = i(obj, cls2, "delegate")) == null) {
            return null;
        }
        return i(i10, cls, str);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List<u> list) {
    }

    public void d(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        socket.connect(inetSocketAddress, i10);
    }

    public String g() {
        return "OkHttp";
    }

    public String h(SSLSocket sSLSocket) {
        return null;
    }

    public X509TrustManager j(SSLSocketFactory sSLSocketFactory) {
        return null;
    }

    public a8.f k(X509TrustManager x509TrustManager) {
        return new a8.e(x509TrustManager.getAcceptedIssuers());
    }
}
