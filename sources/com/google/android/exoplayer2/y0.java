package com.google.android.exoplayer2;

import a6.m0;
import a6.p;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: StreamVolumeManager */
final class y0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7856a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Handler f7857b;

    /* renamed from: c  reason: collision with root package name */
    private final b f7858c;

    /* renamed from: d  reason: collision with root package name */
    private final AudioManager f7859d;

    /* renamed from: e  reason: collision with root package name */
    private c f7860e;

    /* renamed from: f  reason: collision with root package name */
    private int f7861f = 3;

    /* renamed from: g  reason: collision with root package name */
    private int f7862g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7863h;

    /* compiled from: StreamVolumeManager */
    public interface b {
        void M(int i10, boolean z10);

        void l(int i10);
    }

    /* compiled from: StreamVolumeManager */
    private final class c extends BroadcastReceiver {
        private c() {
        }

        public void onReceive(Context context, Intent intent) {
            y0.this.f7857b.post(new z0(y0.this));
        }
    }

    public y0(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f7856a = applicationContext;
        this.f7857b = handler;
        this.f7858c = bVar;
        AudioManager audioManager = (AudioManager) a6.a.h((AudioManager) applicationContext.getSystemService("audio"));
        this.f7859d = audioManager;
        this.f7862g = f(audioManager, 3);
        this.f7863h = e(audioManager, this.f7861f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f7860e = cVar;
        } catch (RuntimeException e10) {
            p.i("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    private static boolean e(AudioManager audioManager, int i10) {
        if (m0.f205a >= 23) {
            return audioManager.isStreamMute(i10);
        }
        return f(audioManager, i10) == 0;
    }

    private static int f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i10);
            p.i("StreamVolumeManager", sb.toString(), e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    /* access modifiers changed from: private */
    public void i() {
        int f10 = f(this.f7859d, this.f7861f);
        boolean e10 = e(this.f7859d, this.f7861f);
        if (this.f7862g != f10 || this.f7863h != e10) {
            this.f7862g = f10;
            this.f7863h = e10;
            this.f7858c.M(f10, e10);
        }
    }

    public int c() {
        return this.f7859d.getStreamMaxVolume(this.f7861f);
    }

    public int d() {
        if (m0.f205a >= 28) {
            return this.f7859d.getStreamMinVolume(this.f7861f);
        }
        return 0;
    }

    public void g() {
        c cVar = this.f7860e;
        if (cVar != null) {
            try {
                this.f7856a.unregisterReceiver(cVar);
            } catch (RuntimeException e10) {
                p.i("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f7860e = null;
        }
    }

    public void h(int i10) {
        if (this.f7861f != i10) {
            this.f7861f = i10;
            i();
            this.f7858c.l(i10);
        }
    }
}
