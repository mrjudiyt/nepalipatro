package w7;

import com.facebook.internal.security.CertificateUtil;
import ea.e;
import ea.z;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Array;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import v7.q;

/* compiled from: Util */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f17014a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f17015b = new String[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f17016c = Charset.forName("UTF-8");

    /* compiled from: Util */
    static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f17017a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f17018b;

        a(String str, boolean z10) {
            this.f17017a = str;
            this.f17018b = z10;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f17017a);
            thread.setDaemon(this.f17018b);
            return thread;
        }
    }

    public static void a(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void b(Closeable closeable, Closeable closeable2) {
        try {
            closeable.close();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            closeable2.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            } else if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            } else if (th instanceof Error) {
                throw th;
            } else {
                throw new AssertionError(th);
            }
        }
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static void d(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e10) {
                if (!o(e10)) {
                    throw e10;
                }
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    public static String[] e(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    public static boolean f(String[] strArr, String str) {
        return Arrays.asList(strArr).contains(str);
    }

    public static boolean g(z zVar, int i10, TimeUnit timeUnit) {
        try {
            return q(zVar, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String i(q qVar) {
        if (qVar.A() == q.i(qVar.E())) {
            return qVar.q();
        }
        return qVar.q() + CertificateUtil.DELIMITER + qVar.A();
    }

    public static <T> List<T> j(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> k(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static <K, V> Map<K, V> l(Map<K, V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    private static <T> List<T> m(T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            int length = tArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                T t11 = tArr2[i10];
                if (t10.equals(t11)) {
                    arrayList.add(t11);
                    break;
                }
                i10++;
            }
        }
        return arrayList;
    }

    public static <T> T[] n(Class<T> cls, T[] tArr, T[] tArr2) {
        List m10 = m(tArr, tArr2);
        return m10.toArray((Object[]) Array.newInstance(cls, m10.size()));
    }

    public static boolean o(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static ea.h p(ea.h hVar) {
        try {
            return ea.h.q(MessageDigest.getInstance("SHA-1").digest(hVar.w()));
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    public static boolean q(z zVar, int i10, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c10 = zVar.d().e() ? zVar.d().c() - nanoTime : Long.MAX_VALUE;
        zVar.d().d(Math.min(c10, timeUnit.toNanos((long) i10)) + nanoTime);
        try {
            e eVar = new e();
            while (zVar.S(eVar, 2048) != -1) {
                eVar.a();
            }
            if (c10 == Long.MAX_VALUE) {
                zVar.d().a();
            } else {
                zVar.d().d(nanoTime + c10);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c10 == Long.MAX_VALUE) {
                zVar.d().a();
            } else {
                zVar.d().d(nanoTime + c10);
            }
            return false;
        } catch (Throwable th) {
            if (c10 == Long.MAX_VALUE) {
                zVar.d().a();
            } else {
                zVar.d().d(nanoTime + c10);
            }
            throw th;
        }
    }

    public static ThreadFactory r(String str, boolean z10) {
        return new a(str, z10);
    }
}
