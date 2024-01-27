package e;

import android.content.Context;
import android.content.Intent;
import e.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import o8.k;
import o8.o;

/* compiled from: ActivityResultContracts.kt */
public final class b extends a<String[], Map<String, Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7968a = new a((g) null);

    /* compiled from: ActivityResultContracts.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final Intent a(String[] strArr) {
            m.f(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            m.e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }
    }

    /* renamed from: a */
    public Intent createIntent(Context context, String[] strArr) {
        m.f(context, "context");
        m.f(strArr, "input");
        return f7968a.a(strArr);
    }

    /* renamed from: b */
    public a.C0127a<Map<String, Boolean>> getSynchronousResult(Context context, String[] strArr) {
        m.f(context, "context");
        m.f(strArr, "input");
        boolean z10 = true;
        if (strArr.length == 0) {
            return new a.C0127a<>(h0.d());
        }
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!(androidx.core.content.a.a(context, strArr[i10]) == 0)) {
                z10 = false;
                break;
            }
            i10++;
        }
        if (!z10) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(l.a(g0.a(strArr.length), 16));
        for (String a10 : strArr) {
            k a11 = o.a(a10, Boolean.TRUE);
            linkedHashMap.put(a11.c(), a11.d());
        }
        return new a.C0127a<>(linkedHashMap);
    }

    /* renamed from: c */
    public Map<String, Boolean> parseResult(int i10, Intent intent) {
        if (i10 != -1) {
            return h0.d();
        }
        if (intent == null) {
            return h0.d();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return h0.d();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        int length = intArrayExtra.length;
        for (int i11 = 0; i11 < length; i11++) {
            arrayList.add(Boolean.valueOf(intArrayExtra[i11] == 0));
        }
        return h0.j(x.W(k.n(stringArrayExtra), arrayList));
    }
}
