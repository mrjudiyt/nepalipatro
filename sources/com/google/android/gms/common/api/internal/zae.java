package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zae<A extends BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient>> extends zai {
    protected final A zaa;

    public zae(int i10, A a10) {
        super(i10);
        this.zaa = (BaseImplementation.ApiMethodImpl) Preconditions.checkNotNull(a10, "Null methods are not runnable.");
    }

    public final void zad(Status status) {
        try {
            this.zaa.setFailedResult(status);
        } catch (IllegalStateException unused) {
        }
    }

    public final void zae(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.zaa.setFailedResult(new Status(10, sb.toString()));
        } catch (IllegalStateException unused) {
        }
    }

    public final void zaf(zabq<?> zabq) {
        try {
            this.zaa.run(zabq.zaf());
        } catch (RuntimeException e10) {
            zae(e10);
        }
    }

    public final void zag(zaad zaad, boolean z10) {
        zaad.zac(this.zaa, z10);
    }
}
