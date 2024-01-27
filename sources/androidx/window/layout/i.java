package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.j;
import androidx.window.layout.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import m1.b;

/* compiled from: ExtensionsWindowLayoutInfoAdapter.kt */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f4611a = new i();

    private i() {
    }

    private final boolean c(Activity activity, b bVar) {
        Rect a10 = y.f4674b.b(activity).a();
        if (bVar.e()) {
            return false;
        }
        if (bVar.d() != a10.width() && bVar.a() != a10.height()) {
            return false;
        }
        if (bVar.d() < a10.width() && bVar.a() < a10.height()) {
            return false;
        }
        if (bVar.d() == a10.width() && bVar.a() == a10.height()) {
            return false;
        }
        return true;
    }

    public final j a(Activity activity, FoldingFeature foldingFeature) {
        k.b bVar;
        j.b bVar2;
        m.f(activity, "activity");
        m.f(foldingFeature, "oemFeature");
        int type = foldingFeature.getType();
        if (type == 1) {
            bVar = k.b.f4624b.a();
        } else if (type != 2) {
            return null;
        } else {
            bVar = k.b.f4624b.b();
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar2 = j.b.f4617c;
        } else if (state != 2) {
            return null;
        } else {
            bVar2 = j.b.f4618d;
        }
        Rect bounds = foldingFeature.getBounds();
        m.e(bounds, "oemFeature.bounds");
        if (!c(activity, new b(bounds))) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        m.e(bounds2, "oemFeature.bounds");
        return new k(new b(bounds2), bVar, bVar2);
    }

    public final u b(Activity activity, WindowLayoutInfo windowLayoutInfo) {
        j jVar;
        m.f(activity, "activity");
        m.f(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        m.e(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                i iVar = f4611a;
                m.e(foldingFeature, "feature");
                jVar = iVar.a(activity, foldingFeature);
            } else {
                jVar = null;
            }
            if (jVar != null) {
                arrayList.add(jVar);
            }
        }
        return new u(arrayList);
    }
}
