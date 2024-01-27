package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* compiled from: AudioBecomingNoisyManager */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6438a;

    /* renamed from: b  reason: collision with root package name */
    private final a f6439b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f6440c;

    /* compiled from: AudioBecomingNoisyManager */
    private final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        private final C0110b f6441h;

        /* renamed from: i  reason: collision with root package name */
        private final Handler f6442i;

        public a(Handler handler, C0110b bVar) {
            this.f6442i = handler;
            this.f6441h = bVar;
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f6442i.post(this);
            }
        }

        public void run() {
            if (b.this.f6440c) {
                this.f6441h.n();
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.b$b  reason: collision with other inner class name */
    /* compiled from: AudioBecomingNoisyManager */
    public interface C0110b {
        void n();
    }

    public b(Context context, Handler handler, C0110b bVar) {
        this.f6438a = context.getApplicationContext();
        this.f6439b = new a(handler, bVar);
    }

    public void b(boolean z10) {
        if (z10 && !this.f6440c) {
            this.f6438a.registerReceiver(this.f6439b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f6440c = true;
        } else if (!z10 && this.f6440c) {
            this.f6438a.unregisterReceiver(this.f6439b);
            this.f6440c = false;
        }
    }
}
