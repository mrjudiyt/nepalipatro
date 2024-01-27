package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.Map;
import java.util.Set;

/* compiled from: RemoteInput */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final String f2239a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f2240b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence[] f2241c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f2242d;

    /* renamed from: e  reason: collision with root package name */
    private final int f2243e;

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f2244f;

    /* renamed from: g  reason: collision with root package name */
    private final Set<String> f2245g;

    /* compiled from: RemoteInput */
    static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(r rVar) {
            Set<String> d10;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(rVar.i()).setLabel(rVar.h()).setChoices(rVar.e()).setAllowFreeFormInput(rVar.c()).addExtras(rVar.g());
            if (Build.VERSION.SDK_INT >= 26 && (d10 = rVar.d()) != null) {
                for (String d11 : d10) {
                    b.d(addExtras, d11, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(addExtras, rVar.f());
            }
            return addExtras.build();
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* compiled from: RemoteInput */
    static class b {
        static void a(r rVar, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(r.a(rVar), intent, map);
        }

        static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    /* compiled from: RemoteInput */
    static class c {
        static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        static RemoteInput.Builder b(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    static RemoteInput a(r rVar) {
        return a.b(rVar);
    }

    static RemoteInput[] b(r[] rVarArr) {
        if (rVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[rVarArr.length];
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            remoteInputArr[i10] = a(rVarArr[i10]);
        }
        return remoteInputArr;
    }

    public boolean c() {
        return this.f2242d;
    }

    public Set<String> d() {
        return this.f2245g;
    }

    public CharSequence[] e() {
        return this.f2241c;
    }

    public int f() {
        return this.f2243e;
    }

    public Bundle g() {
        return this.f2244f;
    }

    public CharSequence h() {
        return this.f2240b;
    }

    public String i() {
        return this.f2239a;
    }

    public boolean j() {
        return !c() && (e() == null || e().length == 0) && d() != null && !d().isEmpty();
    }
}
