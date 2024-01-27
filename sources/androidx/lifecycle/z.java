package androidx.lifecycle;

import android.os.Bundle;
import androidx.core.os.e;
import androidx.savedstate.a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import l9.n;
import o8.o;

/* compiled from: SavedStateHandle.kt */
public final class z {

    /* renamed from: f  reason: collision with root package name */
    public static final a f3539f = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Class<? extends Object>[] f3540g;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f3541a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, a.c> f3542b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Object> f3543c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, n<Object>> f3544d;

    /* renamed from: e  reason: collision with root package name */
    private final a.c f3545e;

    /* compiled from: SavedStateHandle.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final z a(Bundle bundle, Bundle bundle2) {
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(UserMetadata.KEYDATA_FILENAME);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
                if ((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size = parcelableArrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj = parcelableArrayList.get(i10);
                        m.d(obj, "null cannot be cast to non-null type kotlin.String");
                        linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
                    }
                    return new z(linkedHashMap);
                }
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            } else if (bundle2 == null) {
                return new z();
            } else {
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    m.e(str, Constants.KEY);
                    hashMap.put(str, bundle2.get(str));
                }
                return new z(hashMap);
            }
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : z.f3540g) {
                m.c(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Class<? extends java.lang.Object>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            androidx.lifecycle.z$a r0 = new androidx.lifecycle.z$a
            r1 = 0
            r0.<init>(r1)
            f3539f = r0
            r0 = 29
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r2 = 0
            r0[r2] = r1
            r1 = 1
            java.lang.Class<boolean[]> r2 = boolean[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Double.TYPE
            r2 = 2
            r0[r2] = r1
            r1 = 3
            java.lang.Class<double[]> r2 = double[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2 = 4
            r0[r2] = r1
            r2 = 5
            java.lang.Class<int[]> r3 = int[].class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Long.TYPE
            r3 = 6
            r0[r3] = r2
            r2 = 7
            java.lang.Class<long[]> r3 = long[].class
            r0[r2] = r3
            r2 = 8
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0[r2] = r3
            r2 = 9
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r0[r2] = r3
            r2 = 10
            java.lang.Class<android.os.Binder> r3 = android.os.Binder.class
            r0[r2] = r3
            r2 = 11
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Byte.TYPE
            r3 = 12
            r0[r3] = r2
            r2 = 13
            java.lang.Class<byte[]> r3 = byte[].class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Character.TYPE
            r3 = 14
            r0[r3] = r2
            r2 = 15
            java.lang.Class<char[]> r3 = char[].class
            r0[r2] = r3
            r2 = 16
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            r0[r2] = r3
            r2 = 17
            java.lang.Class<java.lang.CharSequence[]> r3 = java.lang.CharSequence[].class
            r0[r2] = r3
            r2 = 18
            java.lang.Class<java.util.ArrayList> r3 = java.util.ArrayList.class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Float.TYPE
            r3 = 19
            r0[r3] = r2
            r2 = 20
            java.lang.Class<float[]> r3 = float[].class
            r0[r2] = r3
            java.lang.Class<android.os.Parcelable> r2 = android.os.Parcelable.class
            r3 = 21
            r0[r3] = r2
            r2 = 22
            java.lang.Class<android.os.Parcelable[]> r4 = android.os.Parcelable[].class
            r0[r2] = r4
            r2 = 23
            java.lang.Class<java.io.Serializable> r4 = java.io.Serializable.class
            r0[r2] = r4
            java.lang.Class r2 = java.lang.Short.TYPE
            r4 = 24
            r0[r4] = r2
            r2 = 25
            java.lang.Class<short[]> r4 = short[].class
            r0[r2] = r4
            r2 = 26
            java.lang.Class<android.util.SparseArray> r4 = android.util.SparseArray.class
            r0[r2] = r4
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r3) goto L_0x00ad
            java.lang.Class<android.util.Size> r4 = android.util.Size.class
            goto L_0x00ae
        L_0x00ad:
            r4 = r1
        L_0x00ae:
            r5 = 27
            r0[r5] = r4
            r4 = 28
            if (r2 < r3) goto L_0x00b8
            java.lang.Class<android.util.SizeF> r1 = android.util.SizeF.class
        L_0x00b8:
            r0[r4] = r1
            f3540g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.z.<clinit>():void");
    }

    public z(Map<String, ? extends Object> map) {
        m.f(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f3541a = linkedHashMap;
        this.f3542b = new LinkedHashMap();
        this.f3543c = new LinkedHashMap();
        this.f3544d = new LinkedHashMap();
        this.f3545e = new y(this);
        linkedHashMap.putAll(map);
    }

    /* access modifiers changed from: private */
    public static final Bundle d(z zVar) {
        m.f(zVar, "this$0");
        for (Map.Entry entry : h0.l(zVar.f3542b).entrySet()) {
            zVar.e((String) entry.getKey(), ((a.c) entry.getValue()).a());
        }
        Set<String> keySet = zVar.f3541a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String next : keySet) {
            arrayList.add(next);
            arrayList2.add(zVar.f3541a.get(next));
        }
        return e.a(o.a(UserMetadata.KEYDATA_FILENAME, arrayList), o.a("values", arrayList2));
    }

    public final a.c c() {
        return this.f3545e;
    }

    public final <T> void e(String str, T t10) {
        m.f(str, Constants.KEY);
        if (f3539f.b(t10)) {
            Object obj = this.f3543c.get(str);
            s sVar = obj instanceof s ? (s) obj : null;
            if (sVar != null) {
                sVar.setValue(t10);
            } else {
                this.f3541a.put(str, t10);
            }
            n nVar = this.f3544d.get(str);
            if (nVar != null) {
                nVar.setValue(t10);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        m.c(t10);
        sb.append(t10.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString());
    }

    public z() {
        this.f3541a = new LinkedHashMap();
        this.f3542b = new LinkedHashMap();
        this.f3543c = new LinkedHashMap();
        this.f3544d = new LinkedHashMap();
        this.f3545e = new y(this);
    }
}
