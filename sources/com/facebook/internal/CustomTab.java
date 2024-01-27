package com.facebook.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.d;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.CustomTabPrefetchHelper;
import java.util.ArrayList;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: CustomTab.kt */
public class CustomTab {
    public static final Companion Companion = new Companion((g) null);
    private Uri uri;

    /* compiled from: CustomTab.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public Uri getURIForAction(String str, Bundle bundle) {
            m.f(str, NativeProtocol.WEB_DIALOG_ACTION);
            Utility utility = Utility.INSTANCE;
            ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
            String dialogAuthority = ServerProtocol.getDialogAuthority();
            StringBuilder sb = new StringBuilder();
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            sb.append(FacebookSdk.getGraphApiVersion());
            sb.append("/dialog/");
            sb.append(str);
            return Utility.buildUri(dialogAuthority, sb.toString(), bundle);
        }
    }

    public CustomTab(String str, Bundle bundle) {
        Uri uri2;
        m.f(str, NativeProtocol.WEB_DIALOG_ACTION);
        bundle = bundle == null ? new Bundle() : bundle;
        GamingAction[] values = GamingAction.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (GamingAction rawValue : values) {
            arrayList.add(rawValue.getRawValue());
        }
        if (arrayList.contains(str)) {
            Utility utility = Utility.INSTANCE;
            ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
            uri2 = Utility.buildUri(ServerProtocol.getGamingDialogAuthority(), m.o("/dialog/", str), bundle);
        } else {
            uri2 = Companion.getURIForAction(str, bundle);
        }
        this.uri = uri2;
    }

    public static Uri getURIForAction(String str, Bundle bundle) {
        Class<CustomTab> cls = CustomTab.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return Companion.getURIForAction(str, bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final Uri getUri() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.uri;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final boolean openCustomTab(Activity activity, String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            m.f(activity, "activity");
            d b10 = new d.b(CustomTabPrefetchHelper.Companion.getPreparedSessionOnce()).b();
            b10.f1357a.setPackage(str);
            try {
                b10.a(activity, this.uri);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void setUri(Uri uri2) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m.f(uri2, "<set-?>");
                this.uri = uri2;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
