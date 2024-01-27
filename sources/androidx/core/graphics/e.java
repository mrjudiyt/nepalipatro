package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.collection.f;
import androidx.core.content.res.e;
import androidx.core.content.res.h;
import androidx.core.provider.g;

/* compiled from: TypefaceCompat */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final k f2352a;

    /* renamed from: b  reason: collision with root package name */
    private static final f<String, Typeface> f2353b = new f<>(16);

    /* compiled from: TypefaceCompat */
    public static class a extends g.c {

        /* renamed from: a  reason: collision with root package name */
        private h.e f2354a;

        public a(h.e eVar) {
            this.f2354a = eVar;
        }

        public void a(int i10) {
            h.e eVar = this.f2354a;
            if (eVar != null) {
                eVar.f(i10);
            }
        }

        public void b(Typeface typeface) {
            h.e eVar = this.f2354a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f2352a = new j();
        } else if (i10 >= 28) {
            f2352a = new i();
        } else if (i10 >= 26) {
            f2352a = new h();
        } else if (i10 >= 24 && g.n()) {
            f2352a = new g();
        } else if (i10 >= 21) {
            f2352a = new f();
        } else {
            f2352a = new k();
        }
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        Typeface g10;
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        } else if (Build.VERSION.SDK_INT >= 21 || (g10 = g(context, typeface, i10)) == null) {
            return Typeface.create(typeface, i10);
        } else {
            return g10;
        }
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        return f2352a.c(context, cancellationSignal, bVarArr, i10);
    }

    public static Typeface c(Context context, e.b bVar, Resources resources, int i10, String str, int i11, int i12, h.e eVar, Handler handler, boolean z10) {
        Typeface typeface;
        e.b bVar2 = bVar;
        h.e eVar2 = eVar;
        Handler handler2 = handler;
        if (bVar2 instanceof e.C0031e) {
            e.C0031e eVar3 = (e.C0031e) bVar2;
            Typeface h10 = h(eVar3.c());
            if (h10 != null) {
                if (eVar2 != null) {
                    eVar2.d(h10, handler2);
                }
                return h10;
            }
            typeface = g.a(context, eVar3.b(), i12, !z10 ? eVar2 == null : eVar3.a() == 0, z10 ? eVar3.d() : -1, h.e.e(handler), new a(eVar2));
            Resources resources2 = resources;
            int i13 = i12;
        } else {
            Context context2 = context;
            Resources resources3 = resources;
            typeface = f2352a.b(context, (e.c) bVar2, resources, i12);
            if (eVar2 != null) {
                if (typeface != null) {
                    eVar2.d(typeface, handler2);
                } else {
                    eVar2.c(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            f2353b.put(e(resources, i10, str, i11, i12), typeface);
        }
        return typeface;
    }

    public static Typeface d(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface e10 = f2352a.e(context, resources, i10, str, i12);
        if (e10 != null) {
            f2353b.put(e(resources, i10, str, i11, i12), e10);
        }
        return e10;
    }

    private static String e(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface f(Resources resources, int i10, String str, int i11, int i12) {
        return f2353b.get(e(resources, i10, str, i11, i12));
    }

    private static Typeface g(Context context, Typeface typeface, int i10) {
        k kVar = f2352a;
        e.c j10 = kVar.j(typeface);
        if (j10 == null) {
            return null;
        }
        return kVar.b(context, j10, context.getResources(), i10);
    }

    private static Typeface h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
