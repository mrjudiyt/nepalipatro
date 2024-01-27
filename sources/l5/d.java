package l5;

import a6.i0;
import a6.t;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import e4.j;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k4.i;
import q4.f;
import r4.g;
import r4.o;
import u4.b;
import u4.e;
import u4.h;
import u4.h0;
import u4.i0;
import x4.a;

/* compiled from: DefaultHlsExtractorFactory */
public final class d implements h {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f9991d = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b  reason: collision with root package name */
    private final int f9992b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9993c;

    public d() {
        this(0, true);
    }

    private static void b(int i10, List<Integer> list) {
        if (n6.d.g(f9991d, i10) != -1 && !list.contains(Integer.valueOf(i10))) {
            list.add(Integer.valueOf(i10));
        }
    }

    @SuppressLint({"SwitchIntDef"})
    private i d(int i10, j jVar, List<j> list, i0 i0Var) {
        if (i10 == 0) {
            return new b();
        }
        if (i10 == 1) {
            return new e();
        }
        if (i10 == 2) {
            return new h();
        }
        if (i10 == 7) {
            return new f(0, 0);
        }
        if (i10 == 8) {
            return e(i0Var, jVar, list);
        }
        if (i10 == 11) {
            return f(this.f9992b, this.f9993c, jVar, list, i0Var);
        }
        if (i10 != 13) {
            return null;
        }
        return new s(jVar.f8087j, i0Var);
    }

    private static g e(i0 i0Var, j jVar, List<j> list) {
        int i10 = g(jVar) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new g(i10, i0Var, (o) null, list);
    }

    private static h0 f(int i10, boolean z10, j jVar, List<j> list, i0 i0Var) {
        int i11 = i10 | 16;
        if (list != null) {
            i11 |= 32;
        } else if (z10) {
            list = Collections.singletonList(new j.b().e0("application/cea-608").E());
        } else {
            list = Collections.emptyList();
        }
        String str = jVar.f8093p;
        if (!TextUtils.isEmpty(str)) {
            if (!t.b(str, "audio/mp4a-latm")) {
                i11 |= 2;
            }
            if (!t.b(str, "video/avc")) {
                i11 |= 4;
            }
        }
        return new h0(2, i0Var, (i0.c) new u4.j(i11, list));
    }

    private static boolean g(j jVar) {
        a aVar = jVar.f8094q;
        if (aVar == null) {
            return false;
        }
        for (int i10 = 0; i10 < aVar.e(); i10++) {
            a.b d10 = aVar.d(i10);
            if (d10 instanceof q) {
                return !((q) d10).f10099j.isEmpty();
            }
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    private static boolean h(i iVar, k4.j jVar) {
        try {
            boolean d10 = iVar.d(jVar);
            jVar.k();
            return d10;
        } catch (EOFException unused) {
            jVar.k();
            return false;
        } catch (Throwable th) {
            jVar.k();
            throw th;
        }
    }

    /* renamed from: c */
    public b a(Uri uri, j jVar, List<j> list, a6.i0 i0Var, Map<String, List<String>> map, k4.j jVar2) {
        int a10 = a6.h.a(jVar.f8096s);
        int b10 = a6.h.b(map);
        int c10 = a6.h.c(uri);
        int[] iArr = f9991d;
        ArrayList arrayList = new ArrayList(iArr.length);
        b(a10, arrayList);
        b(b10, arrayList);
        b(c10, arrayList);
        for (int b11 : iArr) {
            b(b11, arrayList);
        }
        i iVar = null;
        jVar2.k();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            int intValue = ((Integer) arrayList.get(i10)).intValue();
            i iVar2 = (i) a6.a.e(d(intValue, jVar, list, i0Var));
            if (h(iVar2, jVar2)) {
                return new b(iVar2, jVar, i0Var);
            }
            if (iVar == null && (intValue == a10 || intValue == b10 || intValue == c10 || intValue == 11)) {
                iVar = iVar2;
            }
        }
        return new b((i) a6.a.e(iVar), jVar, i0Var);
    }

    public d(int i10, boolean z10) {
        this.f9992b = i10;
        this.f9993c = z10;
    }
}
