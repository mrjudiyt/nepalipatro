package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
abstract class zad<T> extends zac {
    protected final TaskCompletionSource<T> zaa;

    public zad(int i10, TaskCompletionSource<T> taskCompletionSource) {
        super(i10);
        this.zaa = taskCompletionSource;
    }

    /* access modifiers changed from: protected */
    public abstract void zac(zabq<?> zabq);

    public final void zad(Status status) {
        this.zaa.trySetException(new ApiException(status));
    }

    public final void zae(Exception exc) {
        this.zaa.trySetException(exc);
    }

    public final void zaf(zabq<?> zabq) {
        try {
            zac(zabq);
        } catch (DeadObjectException e10) {
            zad(zai.zah(e10));
            throw e10;
        } catch (RemoteException e11) {
            zad(zai.zah(e11));
        } catch (RuntimeException e12) {
            this.zaa.trySetException(e12);
        }
    }

    public void zag(zaad zaad, boolean z10) {
    }
}
