package androidx.window.layout;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.window.layout.j;
import androidx.window.layout.k;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import m1.f;
import y8.l;

/* compiled from: SidecarAdapter.kt */
public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static final a f4635b = new a((g) null);

    /* renamed from: c  reason: collision with root package name */
    private static final String f4636c = m.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final f.b f4637a;

    /* compiled from: SidecarAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final int a(SidecarDeviceState sidecarDeviceState) {
            kotlin.jvm.internal.m.f(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                if (invoke != null) {
                    return ((Integer) invoke).intValue();
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }

        public final int b(SidecarDeviceState sidecarDeviceState) {
            kotlin.jvm.internal.m.f(sidecarDeviceState, "sidecarDeviceState");
            int a10 = a(sidecarDeviceState);
            if (a10 < 0 || a10 > 4) {
                return 0;
            }
            return a10;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final List<SidecarDisplayFeature> c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            kotlin.jvm.internal.m.f(sidecarWindowLayoutInfo, "info");
            try {
                List<SidecarDisplayFeature> list = sidecarWindowLayoutInfo.displayFeatures;
                return list == null ? p.e() : list;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                if (invoke != null) {
                    return (List) invoke;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return p.e();
            }
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void d(SidecarDeviceState sidecarDeviceState, int i10) {
            kotlin.jvm.internal.m.f(sidecarDeviceState, "sidecarDeviceState");
            try {
                sidecarDeviceState.posture = i10;
            } catch (NoSuchFieldError unused) {
                Class<SidecarDeviceState> cls = SidecarDeviceState.class;
                try {
                    cls.getMethod("setPosture", new Class[]{Integer.TYPE}).invoke(sidecarDeviceState, new Object[]{Integer.valueOf(i10)});
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                }
            }
        }
    }

    /* compiled from: SidecarAdapter.kt */
    static final class b extends n implements l<SidecarDisplayFeature, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        public static final b f4638h = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
            kotlin.jvm.internal.m.f(sidecarDisplayFeature, "$this$require");
            boolean z10 = true;
            if (!(sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2)) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* compiled from: SidecarAdapter.kt */
    static final class c extends n implements l<SidecarDisplayFeature, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        public static final c f4639h = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
            kotlin.jvm.internal.m.f(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
        }
    }

    /* compiled from: SidecarAdapter.kt */
    static final class d extends n implements l<SidecarDisplayFeature, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        public static final d f4640h = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
            kotlin.jvm.internal.m.f(sidecarDisplayFeature, "$this$require");
            boolean z10 = true;
            if (!(sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0)) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* compiled from: SidecarAdapter.kt */
    static final class e extends n implements l<SidecarDisplayFeature, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        public static final e f4641h = new e();

        e() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
            kotlin.jvm.internal.m.f(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
        }
    }

    public m() {
        this((f.b) null, 1, (g) null);
    }

    public m(f.b bVar) {
        kotlin.jvm.internal.m.f(bVar, "verificationMode");
        this.f4637a = bVar;
    }

    private final boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (kotlin.jvm.internal.m.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return kotlin.jvm.internal.m.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    private final boolean c(List<SidecarDisplayFeature> list, List<SidecarDisplayFeature> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (!b(list.get(i10), list2.get(i10))) {
                return false;
            }
            i10 = i11;
        }
        return true;
    }

    public final boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (kotlin.jvm.internal.m.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        a aVar = f4635b;
        if (aVar.b(sidecarDeviceState) == aVar.b(sidecarDeviceState2)) {
            return true;
        }
        return false;
    }

    public final boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (kotlin.jvm.internal.m.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        a aVar = f4635b;
        return c(aVar.c(sidecarWindowLayoutInfo), aVar.c(sidecarWindowLayoutInfo2));
    }

    public final u e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        kotlin.jvm.internal.m.f(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new u(p.e());
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        a aVar = f4635b;
        aVar.d(sidecarDeviceState2, aVar.b(sidecarDeviceState));
        return new u(f(aVar.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final List<e> f(List<SidecarDisplayFeature> list, SidecarDeviceState sidecarDeviceState) {
        kotlin.jvm.internal.m.f(list, "sidecarDisplayFeatures");
        kotlin.jvm.internal.m.f(sidecarDeviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        for (SidecarDisplayFeature g10 : list) {
            e g11 = g(g10, sidecarDeviceState);
            if (g11 != null) {
                arrayList.add(g11);
            }
        }
        return arrayList;
    }

    public final e g(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        k.b bVar;
        j.b bVar2;
        kotlin.jvm.internal.m.f(sidecarDisplayFeature, "feature");
        kotlin.jvm.internal.m.f(sidecarDeviceState, "deviceState");
        f.a aVar = f.f10170a;
        String str = f4636c;
        kotlin.jvm.internal.m.e(str, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) f.a.b(aVar, sidecarDisplayFeature, str, this.f4637a, (m1.e) null, 4, (Object) null).c("Type must be either TYPE_FOLD or TYPE_HINGE", b.f4638h).c("Feature bounds must not be 0", c.f4639h).c("TYPE_FOLD must have 0 area", d.f4640h).c("Feature be pinned to either left or top", e.f4641h).a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            bVar = k.b.f4624b.a();
        } else if (type != 2) {
            return null;
        } else {
            bVar = k.b.f4624b.b();
        }
        int b10 = f4635b.b(sidecarDeviceState);
        if (b10 == 0 || b10 == 1) {
            return null;
        }
        if (b10 == 2) {
            bVar2 = j.b.f4618d;
        } else if (b10 == 3) {
            bVar2 = j.b.f4617c;
        } else if (b10 == 4) {
            return null;
        } else {
            bVar2 = j.b.f4617c;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        kotlin.jvm.internal.m.e(rect, "feature.rect");
        return new k(new m1.b(rect), bVar, bVar2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(f.b bVar, int i10, g gVar) {
        this((i10 & 1) != 0 ? f.b.QUIET : bVar);
    }
}
