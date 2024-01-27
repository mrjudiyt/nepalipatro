package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f3590a;

    /* renamed from: b  reason: collision with root package name */
    public int f3591b;

    static class a implements AudioAttributesImpl.a {

        /* renamed from: a  reason: collision with root package name */
        final AudioAttributes.Builder f3592a = new AudioAttributes.Builder();

        a() {
        }

        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi21(this.f3592a.build());
        }

        /* renamed from: e */
        public a b(int i10) {
            this.f3592a.setContentType(i10);
            return this;
        }

        /* renamed from: f */
        public a d(int i10) {
            this.f3592a.setFlags(i10);
            return this;
        }

        /* renamed from: g */
        public a a(int i10) {
            this.f3592a.setLegacyStreamType(i10);
            return this;
        }

        /* renamed from: h */
        public a c(int i10) {
            if (i10 == 16) {
                i10 = 12;
            }
            this.f3592a.setUsage(i10);
            return this;
        }
    }

    public AudioAttributesImplApi21() {
        this.f3591b = -1;
    }

    public int a() {
        int i10 = this.f3591b;
        if (i10 != -1) {
            return i10;
        }
        return AudioAttributesCompat.c(false, c(), d());
    }

    public Object b() {
        return this.f3590a;
    }

    public int c() {
        return this.f3590a.getFlags();
    }

    public int d() {
        return this.f3590a.getUsage();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f3590a.equals(((AudioAttributesImplApi21) obj).f3590a);
    }

    public int hashCode() {
        return this.f3590a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f3590a;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i10) {
        this.f3591b = -1;
        this.f3590a = audioAttributes;
        this.f3591b = i10;
    }
}
