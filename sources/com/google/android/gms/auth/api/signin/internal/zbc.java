package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.loader.content.a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
public final class zbc extends a implements SignInConnectionListener {
    private final Semaphore zba = new Semaphore(0);
    private final Set zbb;

    public zbc(Context context, Set set) {
        super(context);
        this.zbb = set;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        int i10 = 0;
        for (GoogleApiClient maybeSignIn : this.zbb) {
            if (maybeSignIn.maybeSignIn(this)) {
                i10++;
            }
        }
        try {
            this.zba.tryAcquire(i10, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    public final void onComplete() {
        this.zba.release();
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        this.zba.drainPermits();
        forceLoad();
    }
}
