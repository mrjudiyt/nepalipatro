package k4;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m4.d;
import o4.a;
import q4.f;
import r4.k;
import u4.a0;
import u4.b;
import u4.e;
import u4.h;
import u4.h0;

/* compiled from: DefaultExtractorsFactory */
public final class g implements o {

    /* renamed from: m  reason: collision with root package name */
    private static final int[] f9584m = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: n  reason: collision with root package name */
    private static final Constructor<? extends i> f9585n;

    /* renamed from: b  reason: collision with root package name */
    private boolean f9586b;

    /* renamed from: c  reason: collision with root package name */
    private int f9587c;

    /* renamed from: d  reason: collision with root package name */
    private int f9588d;

    /* renamed from: e  reason: collision with root package name */
    private int f9589e;

    /* renamed from: f  reason: collision with root package name */
    private int f9590f;

    /* renamed from: g  reason: collision with root package name */
    private int f9591g;

    /* renamed from: h  reason: collision with root package name */
    private int f9592h;

    /* renamed from: i  reason: collision with root package name */
    private int f9593i;

    /* renamed from: j  reason: collision with root package name */
    private int f9594j = 1;

    /* renamed from: k  reason: collision with root package name */
    private int f9595k;

    /* renamed from: l  reason: collision with root package name */
    private int f9596l = 112800;

    static {
        Constructor<? extends U> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke((Object) null, new Object[0]))) {
                constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(i.class).getConstructor(new Class[]{Integer.TYPE});
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e10) {
            throw new RuntimeException("Error instantiating FLAC extension", e10);
        }
        f9585n = constructor;
    }

    private void c(int i10, List<i> list) {
        switch (i10) {
            case 0:
                list.add(new b());
                return;
            case 1:
                list.add(new e());
                return;
            case 2:
                list.add(new h(this.f9587c | this.f9586b ? 1 : 0));
                return;
            case 3:
                list.add(new l4.b(this.f9588d | this.f9586b ? 1 : 0));
                return;
            case 4:
                Constructor<? extends i> constructor = f9585n;
                if (constructor != null) {
                    try {
                        list.add((i) constructor.newInstance(new Object[]{Integer.valueOf(this.f9589e)}));
                        return;
                    } catch (Exception e10) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e10);
                    }
                } else {
                    list.add(new d(this.f9589e));
                    return;
                }
            case 5:
                list.add(new com.google.android.exoplayer2.extractor.flv.b());
                return;
            case 6:
                list.add(new p4.e(this.f9590f));
                return;
            case 7:
                list.add(new f(this.f9593i | this.f9586b ? 1 : 0));
                return;
            case 8:
                list.add(new r4.g(this.f9592h));
                list.add(new k(this.f9591g));
                return;
            case 9:
                list.add(new s4.d());
                return;
            case 10:
                list.add(new a0());
                return;
            case 11:
                list.add(new h0(this.f9594j, this.f9595k, this.f9596l));
                return;
            case 12:
                list.add(new v4.b());
                return;
            case 14:
                list.add(new a());
                return;
            default:
                return;
        }
    }

    public synchronized i[] a() {
        return b(Uri.EMPTY, new HashMap());
    }

    public synchronized i[] b(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        arrayList = new ArrayList(14);
        int b10 = a6.h.b(map);
        if (b10 != -1) {
            c(b10, arrayList);
        }
        int c10 = a6.h.c(uri);
        if (!(c10 == -1 || c10 == b10)) {
            c(c10, arrayList);
        }
        for (int i10 : f9584m) {
            if (!(i10 == b10 || i10 == c10)) {
                c(i10, arrayList);
            }
        }
        return (i[]) arrayList.toArray(new i[arrayList.size()]);
    }
}
