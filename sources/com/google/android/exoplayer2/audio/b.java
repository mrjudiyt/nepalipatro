package com.google.android.exoplayer2.audio;

import a6.m0;
import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* compiled from: AudioTimestampPoller */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final a f6333a;

    /* renamed from: b  reason: collision with root package name */
    private int f6334b;

    /* renamed from: c  reason: collision with root package name */
    private long f6335c;

    /* renamed from: d  reason: collision with root package name */
    private long f6336d;

    /* renamed from: e  reason: collision with root package name */
    private long f6337e;

    /* renamed from: f  reason: collision with root package name */
    private long f6338f;

    /* compiled from: AudioTimestampPoller */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final AudioTrack f6339a;

        /* renamed from: b  reason: collision with root package name */
        private final AudioTimestamp f6340b = new AudioTimestamp();

        /* renamed from: c  reason: collision with root package name */
        private long f6341c;

        /* renamed from: d  reason: collision with root package name */
        private long f6342d;

        /* renamed from: e  reason: collision with root package name */
        private long f6343e;

        public a(AudioTrack audioTrack) {
            this.f6339a = audioTrack;
        }

        public long a() {
            return this.f6343e;
        }

        public long b() {
            return this.f6340b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f6339a.getTimestamp(this.f6340b);
            if (timestamp) {
                long j10 = this.f6340b.framePosition;
                if (this.f6342d > j10) {
                    this.f6341c++;
                }
                this.f6342d = j10;
                this.f6343e = j10 + (this.f6341c << 32);
            }
            return timestamp;
        }
    }

    public b(AudioTrack audioTrack) {
        if (m0.f205a >= 19) {
            this.f6333a = new a(audioTrack);
            g();
            return;
        }
        this.f6333a = null;
        h(3);
    }

    private void h(int i10) {
        this.f6334b = i10;
        if (i10 == 0) {
            this.f6337e = 0;
            this.f6338f = -1;
            this.f6335c = System.nanoTime() / 1000;
            this.f6336d = 10000;
        } else if (i10 == 1) {
            this.f6336d = 10000;
        } else if (i10 == 2 || i10 == 3) {
            this.f6336d = 10000000;
        } else if (i10 == 4) {
            this.f6336d = 500000;
        } else {
            throw new IllegalStateException();
        }
    }

    public void a() {
        if (this.f6334b == 4) {
            g();
        }
    }

    @TargetApi(19)
    public long b() {
        a aVar = this.f6333a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1;
    }

    @TargetApi(19)
    public long c() {
        a aVar = this.f6333a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        return this.f6334b == 2;
    }

    @TargetApi(19)
    public boolean e(long j10) {
        a aVar = this.f6333a;
        if (aVar == null || j10 - this.f6337e < this.f6336d) {
            return false;
        }
        this.f6337e = j10;
        boolean c10 = aVar.c();
        int i10 = this.f6334b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (c10) {
                        g();
                    }
                } else if (!c10) {
                    g();
                }
            } else if (!c10) {
                g();
            } else if (this.f6333a.a() > this.f6338f) {
                h(2);
            }
        } else if (c10) {
            if (this.f6333a.b() < this.f6335c) {
                return false;
            }
            this.f6338f = this.f6333a.a();
            h(1);
        } else if (j10 - this.f6335c > 500000) {
            h(3);
        }
        return c10;
    }

    public void f() {
        h(4);
    }

    public void g() {
        if (this.f6333a != null) {
            h(0);
        }
    }
}
