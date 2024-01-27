package androidx.media;

import androidx.media.AudioAttributesImpl;
import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public int f3593a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f3594b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f3595c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f3596d = -1;

    static class a implements AudioAttributesImpl.a {

        /* renamed from: a  reason: collision with root package name */
        private int f3597a = 0;

        /* renamed from: b  reason: collision with root package name */
        private int f3598b = 0;

        /* renamed from: c  reason: collision with root package name */
        private int f3599c = 0;

        /* renamed from: d  reason: collision with root package name */
        private int f3600d = -1;

        a() {
        }

        private a g(int i10) {
            switch (i10) {
                case 0:
                    this.f3598b = 1;
                    break;
                case 1:
                    break;
                case 2:
                    this.f3598b = 4;
                    break;
                case 3:
                    this.f3598b = 2;
                    break;
                case 4:
                    this.f3598b = 4;
                    break;
                case 5:
                    this.f3598b = 4;
                    break;
                case 6:
                    this.f3598b = 1;
                    this.f3599c |= 4;
                    break;
                case 7:
                    this.f3599c = 1 | this.f3599c;
                    break;
                case 8:
                    this.f3598b = 4;
                    break;
                case 9:
                    this.f3598b = 4;
                    break;
                case 10:
                    this.f3598b = 1;
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid stream type ");
                    sb.append(i10);
                    sb.append(" for AudioAttributesCompat");
                    break;
            }
            this.f3598b = 4;
            this.f3597a = AudioAttributesImplBase.f(i10);
            return this;
        }

        public AudioAttributesImpl build() {
            return new AudioAttributesImplBase(this.f3598b, this.f3599c, this.f3597a, this.f3600d);
        }

        /* renamed from: e */
        public a b(int i10) {
            if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                this.f3598b = i10;
            } else {
                this.f3598b = 0;
            }
            return this;
        }

        /* renamed from: f */
        public a d(int i10) {
            this.f3599c = (i10 & 1023) | this.f3599c;
            return this;
        }

        /* renamed from: h */
        public a a(int i10) {
            if (i10 != 10) {
                this.f3600d = i10;
                return g(i10);
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }

        /* renamed from: i */
        public a c(int i10) {
            switch (i10) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.f3597a = i10;
                    break;
                case 16:
                    this.f3597a = 12;
                    break;
                default:
                    this.f3597a = 0;
                    break;
            }
            return this;
        }
    }

    public AudioAttributesImplBase() {
    }

    static int f(int i10) {
        switch (i10) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 10:
                return 11;
            default:
                return 0;
        }
    }

    public int a() {
        int i10 = this.f3596d;
        if (i10 != -1) {
            return i10;
        }
        return AudioAttributesCompat.c(false, this.f3595c, this.f3593a);
    }

    public Object b() {
        return null;
    }

    public int c() {
        return this.f3594b;
    }

    public int d() {
        int i10 = this.f3595c;
        int a10 = a();
        if (a10 == 6) {
            i10 |= 4;
        } else if (a10 == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int e() {
        return this.f3593a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f3594b == audioAttributesImplBase.c() && this.f3595c == audioAttributesImplBase.d() && this.f3593a == audioAttributesImplBase.e() && this.f3596d == audioAttributesImplBase.f3596d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3594b), Integer.valueOf(this.f3595c), Integer.valueOf(this.f3593a), Integer.valueOf(this.f3596d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f3596d != -1) {
            sb.append(" stream=");
            sb.append(this.f3596d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.e(this.f3593a));
        sb.append(" content=");
        sb.append(this.f3594b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f3595c).toUpperCase());
        return sb.toString();
    }

    AudioAttributesImplBase(int i10, int i11, int i12, int i13) {
        this.f3594b = i10;
        this.f3595c = i11;
        this.f3593a = i12;
        this.f3596d = i13;
    }
}
