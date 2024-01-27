package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import androidx.lifecycle.f;
import com.facebook.FacebookException;
import java.util.Objects;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import p0.a;

/* compiled from: FacebookDialogFragment.kt */
public final class FacebookDialogFragment extends d {
    public static final Companion Companion = new Companion((g) null);
    public static final String TAG = "FacebookDialogFragment";
    private Dialog innerDialog;

    /* compiled from: FacebookDialogFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initDialog$lambda-0  reason: not valid java name */
    public static final void m90initDialog$lambda0(FacebookDialogFragment facebookDialogFragment, Bundle bundle, FacebookException facebookException) {
        m.f(facebookDialogFragment, "this$0");
        facebookDialogFragment.onCompleteWebDialog(bundle, facebookException);
    }

    /* access modifiers changed from: private */
    /* renamed from: initDialog$lambda-1  reason: not valid java name */
    public static final void m91initDialog$lambda1(FacebookDialogFragment facebookDialogFragment, Bundle bundle, FacebookException facebookException) {
        m.f(facebookDialogFragment, "this$0");
        facebookDialogFragment.onCompleteWebFallbackDialog(bundle);
    }

    private final void onCompleteWebDialog(Bundle bundle, FacebookException facebookException) {
        e activity = getActivity();
        if (activity != null) {
            NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
            Intent intent = activity.getIntent();
            m.e(intent, "fragmentActivity.intent");
            activity.setResult(facebookException == null ? -1 : 0, NativeProtocol.createProtocolResultIntent(intent, bundle, facebookException));
            activity.finish();
        }
    }

    private final void onCompleteWebFallbackDialog(Bundle bundle) {
        e activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            if (bundle == null) {
                bundle = new Bundle();
            }
            intent.putExtras(bundle);
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    public /* bridge */ /* synthetic */ a getDefaultViewModelCreationExtras() {
        return f.a(this);
    }

    public final Dialog getInnerDialog() {
        return this.innerDialog;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: android.os.Bundle} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void initDialog$facebook_common_release() {
        /*
            r7 = this;
            android.app.Dialog r0 = r7.innerDialog
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            androidx.fragment.app.e r0 = r7.getActivity()
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            android.content.Intent r1 = r0.getIntent()
            com.facebook.internal.NativeProtocol r2 = com.facebook.internal.NativeProtocol.INSTANCE
            java.lang.String r2 = "intent"
            kotlin.jvm.internal.m.e(r1, r2)
            android.os.Bundle r1 = com.facebook.internal.NativeProtocol.getMethodArgumentsFromIntent(r1)
            r2 = 0
            if (r1 != 0) goto L_0x0020
            r3 = 0
            goto L_0x0026
        L_0x0020:
            java.lang.String r3 = "is_fallback"
            boolean r3 = r1.getBoolean(r3, r2)
        L_0x0026:
            java.lang.String r4 = "FacebookDialogFragment"
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
            r6 = 0
            if (r3 != 0) goto L_0x0067
            if (r1 != 0) goto L_0x0031
            r2 = r6
            goto L_0x0037
        L_0x0031:
            java.lang.String r2 = "action"
            java.lang.String r2 = r1.getString(r2)
        L_0x0037:
            if (r1 != 0) goto L_0x003a
            goto L_0x0040
        L_0x003a:
            java.lang.String r3 = "params"
            android.os.Bundle r6 = r1.getBundle(r3)
        L_0x0040:
            com.facebook.internal.Utility r1 = com.facebook.internal.Utility.INSTANCE
            boolean r1 = com.facebook.internal.Utility.isNullOrEmpty((java.lang.String) r2)
            if (r1 == 0) goto L_0x0051
            java.lang.String r1 = "Cannot start a WebDialog with an empty/missing 'actionName'"
            com.facebook.internal.Utility.logd((java.lang.String) r4, (java.lang.String) r1)
            r0.finish()
            return
        L_0x0051:
            com.facebook.internal.WebDialog$Builder r1 = new com.facebook.internal.WebDialog$Builder
            java.util.Objects.requireNonNull(r2, r5)
            r1.<init>(r0, r2, r6)
            com.facebook.internal.b r0 = new com.facebook.internal.b
            r0.<init>(r7)
            com.facebook.internal.WebDialog$Builder r0 = r1.setOnCompleteListener(r0)
            com.facebook.internal.WebDialog r0 = r0.build()
            goto L_0x00ae
        L_0x0067:
            if (r1 != 0) goto L_0x006a
            goto L_0x0070
        L_0x006a:
            java.lang.String r3 = "url"
            java.lang.String r6 = r1.getString(r3)
        L_0x0070:
            com.facebook.internal.Utility r1 = com.facebook.internal.Utility.INSTANCE
            boolean r1 = com.facebook.internal.Utility.isNullOrEmpty((java.lang.String) r6)
            if (r1 == 0) goto L_0x0081
            java.lang.String r1 = "Cannot start a fallback WebDialog with an empty/missing 'url'"
            com.facebook.internal.Utility.logd((java.lang.String) r4, (java.lang.String) r1)
            r0.finish()
            return
        L_0x0081:
            kotlin.jvm.internal.b0 r1 = kotlin.jvm.internal.b0.f15559a
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.facebook.FacebookSdk r4 = com.facebook.FacebookSdk.INSTANCE
            java.lang.String r4 = com.facebook.FacebookSdk.getApplicationId()
            r3[r2] = r4
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)
            java.lang.String r2 = "fb%s://bridge/"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.String r2 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.m.e(r1, r2)
            com.facebook.internal.FacebookWebFallbackDialog$Companion r2 = com.facebook.internal.FacebookWebFallbackDialog.Companion
            java.util.Objects.requireNonNull(r6, r5)
            com.facebook.internal.FacebookWebFallbackDialog r0 = r2.newInstance(r0, r6, r1)
            com.facebook.internal.c r1 = new com.facebook.internal.c
            r1.<init>(r7)
            r0.setOnCompleteListener(r1)
        L_0x00ae:
            r7.innerDialog = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.FacebookDialogFragment.initDialog$facebook_common_release():void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        m.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if ((this.innerDialog instanceof WebDialog) && isResumed()) {
            Dialog dialog = this.innerDialog;
            Objects.requireNonNull(dialog, "null cannot be cast to non-null type com.facebook.internal.WebDialog");
            ((WebDialog) dialog).resize();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initDialog$facebook_common_release();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.innerDialog;
        if (dialog == null) {
            onCompleteWebDialog((Bundle) null, (FacebookException) null);
            setShowsDialog(false);
            Dialog onCreateDialog = super.onCreateDialog(bundle);
            m.e(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
            return onCreateDialog;
        }
        Objects.requireNonNull(dialog, "null cannot be cast to non-null type android.app.Dialog");
        return dialog;
    }

    public void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage((Message) null);
        }
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        Dialog dialog = this.innerDialog;
        if (dialog instanceof WebDialog) {
            Objects.requireNonNull(dialog, "null cannot be cast to non-null type com.facebook.internal.WebDialog");
            ((WebDialog) dialog).resize();
        }
    }

    public final void setInnerDialog(Dialog dialog) {
        this.innerDialog = dialog;
    }
}
