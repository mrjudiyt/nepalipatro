package com.google.android.exoplayer2;

import a6.m0;
import a6.p;
import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: AudioFocusManager */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private final AudioManager f6456a;

    /* renamed from: b  reason: collision with root package name */
    private final a f6457b;

    /* renamed from: c  reason: collision with root package name */
    private b f6458c;

    /* renamed from: d  reason: collision with root package name */
    private g4.d f6459d;

    /* renamed from: e  reason: collision with root package name */
    private int f6460e;

    /* renamed from: f  reason: collision with root package name */
    private int f6461f;

    /* renamed from: g  reason: collision with root package name */
    private float f6462g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    private AudioFocusRequest f6463h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6464i;

    /* compiled from: AudioFocusManager */
    private class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: h  reason: collision with root package name */
        private final Handler f6465h;

        public a(Handler handler) {
            this.f6465h = handler;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(int i10) {
            d.this.h(i10);
        }

        public void onAudioFocusChange(int i10) {
            this.f6465h.post(new c(this, i10));
        }
    }

    /* compiled from: AudioFocusManager */
    public interface b {
        void w(float f10);

        void z(int i10);
    }

    public d(Context context, Handler handler, b bVar) {
        this.f6456a = (AudioManager) a6.a.e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f6458c = bVar;
        this.f6457b = new a(handler);
        this.f6460e = 0;
    }

    private void a() {
        this.f6456a.abandonAudioFocus(this.f6457b);
    }

    private void b() {
        if (this.f6460e != 0) {
            if (m0.f205a >= 26) {
                c();
            } else {
                a();
            }
            n(0);
        }
    }

    private void c() {
        AudioFocusRequest audioFocusRequest = this.f6463h;
        if (audioFocusRequest != null) {
            this.f6456a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private static int e(g4.d dVar) {
        if (dVar == null) {
            return 0;
        }
        int i10 = dVar.f8850c;
        switch (i10) {
            case 0:
                p.h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (dVar.f8848a == 1) {
                    return 2;
                }
                break;
            case 16:
                if (m0.f205a >= 19) {
                    return 4;
                }
                return 2;
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unidentified audio usage: ");
                sb.append(i10);
                p.h("AudioFocusManager", sb.toString());
                return 0;
        }
        return 3;
    }

    private void f(int i10) {
        b bVar = this.f6458c;
        if (bVar != null) {
            bVar.z(i10);
        }
    }

    /* access modifiers changed from: private */
    public void h(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 == -2 || q()) {
                f(0);
                n(2);
                return;
            }
            n(3);
        } else if (i10 == -1) {
            f(-1);
            b();
        } else if (i10 != 1) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown focus change type: ");
            sb.append(i10);
            p.h("AudioFocusManager", sb.toString());
        } else {
            n(1);
            f(1);
        }
    }

    private int j() {
        if (this.f6460e == 1) {
            return 1;
        }
        if ((m0.f205a >= 26 ? l() : k()) == 1) {
            n(1);
            return 1;
        }
        n(0);
        return -1;
    }

    private int k() {
        return this.f6456a.requestAudioFocus(this.f6457b, m0.a0(((g4.d) a6.a.e(this.f6459d)).f8850c), this.f6461f);
    }

    private int l() {
        AudioFocusRequest.Builder builder;
        AudioFocusRequest audioFocusRequest = this.f6463h;
        if (audioFocusRequest == null || this.f6464i) {
            if (audioFocusRequest == null) {
                builder = new AudioFocusRequest.Builder(this.f6461f);
            } else {
                builder = new AudioFocusRequest.Builder(this.f6463h);
            }
            this.f6463h = builder.setAudioAttributes(((g4.d) a6.a.e(this.f6459d)).a()).setWillPauseWhenDucked(q()).setOnAudioFocusChangeListener(this.f6457b).build();
            this.f6464i = false;
        }
        return this.f6456a.requestAudioFocus(this.f6463h);
    }

    private void n(int i10) {
        if (this.f6460e != i10) {
            this.f6460e = i10;
            float f10 = i10 == 3 ? 0.2f : 1.0f;
            if (this.f6462g != f10) {
                this.f6462g = f10;
                b bVar = this.f6458c;
                if (bVar != null) {
                    bVar.w(f10);
                }
            }
        }
    }

    private boolean o(int i10) {
        return i10 == 1 || this.f6461f != 1;
    }

    private boolean q() {
        g4.d dVar = this.f6459d;
        return dVar != null && dVar.f8848a == 1;
    }

    public float g() {
        return this.f6462g;
    }

    public void i() {
        this.f6458c = null;
        b();
    }

    public void m(g4.d dVar) {
        if (!m0.c(this.f6459d, dVar)) {
            this.f6459d = dVar;
            int e10 = e(dVar);
            this.f6461f = e10;
            boolean z10 = true;
            if (!(e10 == 1 || e10 == 0)) {
                z10 = false;
            }
            a6.a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }

    public int p(boolean z10, int i10) {
        if (o(i10)) {
            b();
            if (z10) {
                return 1;
            }
            return -1;
        } else if (z10) {
            return j();
        } else {
            return -1;
        }
    }
}
