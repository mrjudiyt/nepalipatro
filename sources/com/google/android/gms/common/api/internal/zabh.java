package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.zaq;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class zabh extends zaq {
    final /* synthetic */ zabi zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zabh(zabi zabi, Looper looper) {
        super(looper);
        this.zaa = zabi;
    }

    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            ((zabg) message.obj).zab(this.zaa);
        } else if (i10 != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i10);
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
