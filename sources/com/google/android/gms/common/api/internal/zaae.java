package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.collection.b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zaae extends zap {
    private final b<ApiKey<?>> zad = new b<>();
    private final GoogleApiManager zae;

    @VisibleForTesting
    zaae(LifecycleFragment lifecycleFragment, GoogleApiManager googleApiManager, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment, googleApiAvailability);
        this.zae = googleApiManager;
        this.mLifecycleFragment.addCallback("ConnectionlessLifecycleHelper", this);
    }

    public static void zad(Activity activity, GoogleApiManager googleApiManager, ApiKey<?> apiKey) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        zaae zaae = (zaae) fragment.getCallbackOrNull("ConnectionlessLifecycleHelper", zaae.class);
        if (zaae == null) {
            zaae = new zaae(fragment, googleApiManager, GoogleApiAvailability.getInstance());
        }
        Preconditions.checkNotNull(apiKey, "ApiKey cannot be null");
        zaae.zad.add(apiKey);
        googleApiManager.zaC(zaae);
    }

    private final void zae() {
        if (!this.zad.isEmpty()) {
            this.zae.zaC(this);
        }
    }

    public final void onResume() {
        super.onResume();
        zae();
    }

    public final void onStart() {
        super.onStart();
        zae();
    }

    public final void onStop() {
        super.onStop();
        this.zae.zaD(this);
    }

    /* access modifiers changed from: package-private */
    public final b<ApiKey<?>> zaa() {
        return this.zad;
    }

    /* access modifiers changed from: protected */
    public final void zab(ConnectionResult connectionResult, int i10) {
        this.zae.zaz(connectionResult, i10);
    }

    /* access modifiers changed from: protected */
    public final void zac() {
        this.zae.zaA();
    }
}
