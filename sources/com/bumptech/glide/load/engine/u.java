package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import h2.c;

/* compiled from: ResourceRecycler */
class u {

    /* renamed from: a  reason: collision with root package name */
    private boolean f5841a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f5842b = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: ResourceRecycler */
    private static final class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((c) message.obj).a();
            return true;
        }
    }

    u() {
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(c<?> cVar, boolean z10) {
        if (!this.f5841a) {
            if (!z10) {
                this.f5841a = true;
                cVar.a();
                this.f5841a = false;
            }
        }
        this.f5842b.obtainMessage(1, cVar).sendToTarget();
    }
}
