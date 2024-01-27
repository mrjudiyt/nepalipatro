package g4;

import a6.m0;
import android.media.AudioAttributes;
import b6.y;

/* compiled from: AudioAttributes */
public final class d {

    /* renamed from: f  reason: collision with root package name */
    public static final d f8846f = new b().a();

    /* renamed from: g  reason: collision with root package name */
    public static final e4.b<d> f8847g = y.f5134a;

    /* renamed from: a  reason: collision with root package name */
    public final int f8848a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8849b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8850c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8851d;

    /* renamed from: e  reason: collision with root package name */
    private AudioAttributes f8852e;

    /* compiled from: AudioAttributes */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private int f8853a = 0;

        /* renamed from: b  reason: collision with root package name */
        private int f8854b = 0;

        /* renamed from: c  reason: collision with root package name */
        private int f8855c = 1;

        /* renamed from: d  reason: collision with root package name */
        private int f8856d = 1;

        public d a() {
            return new d(this.f8853a, this.f8854b, this.f8855c, this.f8856d);
        }

        public b b(int i10) {
            this.f8853a = i10;
            return this;
        }

        public b c(int i10) {
            this.f8854b = i10;
            return this;
        }

        public b d(int i10) {
            this.f8855c = i10;
            return this;
        }
    }

    public AudioAttributes a() {
        if (this.f8852e == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f8848a).setFlags(this.f8849b).setUsage(this.f8850c);
            if (m0.f205a >= 29) {
                usage.setAllowedCapturePolicy(this.f8851d);
            }
            this.f8852e = usage.build();
        }
        return this.f8852e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f8848a == dVar.f8848a && this.f8849b == dVar.f8849b && this.f8850c == dVar.f8850c && this.f8851d == dVar.f8851d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f8848a) * 31) + this.f8849b) * 31) + this.f8850c) * 31) + this.f8851d;
    }

    private d(int i10, int i11, int i12, int i13) {
        this.f8848a = i10;
        this.f8849b = i11;
        this.f8850c = i12;
        this.f8851d = i13;
    }
}
