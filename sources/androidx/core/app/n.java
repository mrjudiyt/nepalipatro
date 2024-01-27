package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.core.app.l;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.bolts.AppLinks;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.messaging.Constants;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: NotificationCompatJellybean */
class n {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f2216a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static Field f2217b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f2218c;

    /* renamed from: d  reason: collision with root package name */
    private static final Object f2219d = new Object();

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            Bundle bundle = list.get(i10);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i10, bundle);
            }
        }
        return sparseArray;
    }

    static Bundle b(l.a aVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat f10 = aVar.f();
        bundle2.putInt("icon", f10 != null ? f10.p() : 0);
        bundle2.putCharSequence(ShareConstants.WEB_DIALOG_PARAM_TITLE, aVar.j());
        bundle2.putParcelable("actionIntent", aVar.a());
        if (aVar.d() != null) {
            bundle = new Bundle(aVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle2.putBundle(AppLinks.KEY_NAME_EXTRAS, bundle);
        bundle2.putParcelableArray("remoteInputs", e(aVar.g()));
        bundle2.putBoolean("showsUserInterface", aVar.i());
        bundle2.putInt("semanticAction", aVar.h());
        return bundle2;
    }

    public static Bundle c(Notification notification) {
        synchronized (f2216a) {
            if (f2218c) {
                return null;
            }
            try {
                if (f2217b == null) {
                    Field declaredField = Notification.class.getDeclaredField(AppLinks.KEY_NAME_EXTRAS);
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        f2218c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f2217b = declaredField;
                }
                Bundle bundle = (Bundle) f2217b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f2217b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException | NoSuchFieldException unused) {
                f2218c = true;
                return null;
            }
        }
    }

    private static Bundle d(r rVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", rVar.i());
        bundle.putCharSequence(Constants.ScionAnalytics.PARAM_LABEL, rVar.h());
        bundle.putCharSequenceArray("choices", rVar.e());
        bundle.putBoolean("allowFreeFormInput", rVar.c());
        bundle.putBundle(AppLinks.KEY_NAME_EXTRAS, rVar.g());
        Set<String> d10 = rVar.d();
        if (d10 != null && !d10.isEmpty()) {
            ArrayList arrayList = new ArrayList(d10.size());
            for (String add : d10) {
                arrayList.add(add);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] e(r[] rVarArr) {
        if (rVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[rVarArr.length];
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            bundleArr[i10] = d(rVarArr[i10]);
        }
        return bundleArr;
    }

    public static Bundle f(Notification.Builder builder, l.a aVar) {
        IconCompat f10 = aVar.f();
        builder.addAction(f10 != null ? f10.p() : 0, aVar.j(), aVar.a());
        Bundle bundle = new Bundle(aVar.d());
        if (aVar.g() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", e(aVar.g()));
        }
        if (aVar.c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", e(aVar.c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        return bundle;
    }
}
