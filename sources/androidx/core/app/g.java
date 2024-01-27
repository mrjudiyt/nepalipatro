package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.h;
import androidx.core.view.e;
import androidx.lifecycle.h;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.x;

/* compiled from: ComponentActivity */
public class g extends Activity implements m, e.a {
    private h<Class<? extends a>, a> mExtraDataMap = new h<>();
    private n mLifecycleRegistry = new n(this);

    @Deprecated
    /* compiled from: ComponentActivity */
    public static class a {
    }

    private static boolean shouldSkipDump(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        String str = strArr[0];
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -645125871:
                if (str.equals("--translation")) {
                    c10 = 0;
                    break;
                }
                break;
            case 100470631:
                if (str.equals("--dump-dumpable")) {
                    c10 = 1;
                    break;
                }
                break;
            case 472614934:
                if (str.equals("--list-dumpables")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1159329357:
                if (str.equals("--contentcapture")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1455016274:
                if (str.equals("--autofill")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31) {
                    return true;
                }
                return false;
            case 1:
            case 2:
                if (Build.VERSION.SDK_INT >= 33) {
                    return true;
                }
                return false;
            case 3:
                if (Build.VERSION.SDK_INT >= 29) {
                    return true;
                }
                return false;
            case 4:
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !e.d(decorView, keyEvent)) {
            return e.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !e.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Deprecated
    public <T extends a> T getExtraData(Class<T> cls) {
        return (a) this.mExtraDataMap.get(cls);
    }

    public androidx.lifecycle.h getLifecycle() {
        return this.mLifecycleRegistry;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x.e(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.j(h.b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Deprecated
    public void putExtraData(a aVar) {
        this.mExtraDataMap.put(aVar.getClass(), aVar);
    }

    /* access modifiers changed from: protected */
    public final boolean shouldDumpInternalState(String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
