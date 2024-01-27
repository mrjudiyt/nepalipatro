package r3;

import java.util.Arrays;
import r3.l;

/* compiled from: AutoValue_LogEvent */
final class f extends l {

    /* renamed from: a  reason: collision with root package name */
    private final long f10934a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f10935b;

    /* renamed from: c  reason: collision with root package name */
    private final long f10936c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f10937d;

    /* renamed from: e  reason: collision with root package name */
    private final String f10938e;

    /* renamed from: f  reason: collision with root package name */
    private final long f10939f;

    /* renamed from: g  reason: collision with root package name */
    private final o f10940g;

    /* compiled from: AutoValue_LogEvent */
    static final class b extends l.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f10941a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f10942b;

        /* renamed from: c  reason: collision with root package name */
        private Long f10943c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f10944d;

        /* renamed from: e  reason: collision with root package name */
        private String f10945e;

        /* renamed from: f  reason: collision with root package name */
        private Long f10946f;

        /* renamed from: g  reason: collision with root package name */
        private o f10947g;

        b() {
        }

        public l a() {
            String str = "";
            if (this.f10941a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f10943c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f10946f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f10941a.longValue(), this.f10942b, this.f10943c.longValue(), this.f10944d, this.f10945e, this.f10946f.longValue(), this.f10947g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public l.a b(Integer num) {
            this.f10942b = num;
            return this;
        }

        public l.a c(long j10) {
            this.f10941a = Long.valueOf(j10);
            return this;
        }

        public l.a d(long j10) {
            this.f10943c = Long.valueOf(j10);
            return this;
        }

        public l.a e(o oVar) {
            this.f10947g = oVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public l.a f(byte[] bArr) {
            this.f10944d = bArr;
            return this;
        }

        /* access modifiers changed from: package-private */
        public l.a g(String str) {
            this.f10945e = str;
            return this;
        }

        public l.a h(long j10) {
            this.f10946f = Long.valueOf(j10);
            return this;
        }
    }

    public Integer b() {
        return this.f10935b;
    }

    public long c() {
        return this.f10934a;
    }

    public long d() {
        return this.f10936c;
    }

    public o e() {
        return this.f10940g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f10934a == lVar.c() && ((num = this.f10935b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f10936c == lVar.d()) {
            if (Arrays.equals(this.f10937d, lVar instanceof f ? ((f) lVar).f10937d : lVar.f()) && ((str = this.f10938e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f10939f == lVar.h()) {
                o oVar = this.f10940g;
                if (oVar == null) {
                    if (lVar.e() == null) {
                        return true;
                    }
                } else if (oVar.equals(lVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    public byte[] f() {
        return this.f10937d;
    }

    public String g() {
        return this.f10938e;
    }

    public long h() {
        return this.f10939f;
    }

    public int hashCode() {
        long j10 = this.f10934a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f10935b;
        int i11 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f10936c;
        int hashCode2 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f10937d)) * 1000003;
        String str = this.f10938e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f10939f;
        int i12 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        o oVar = this.f10940g;
        if (oVar != null) {
            i11 = oVar.hashCode();
        }
        return i12 ^ i11;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f10934a + ", eventCode=" + this.f10935b + ", eventUptimeMs=" + this.f10936c + ", sourceExtension=" + Arrays.toString(this.f10937d) + ", sourceExtensionJsonProto3=" + this.f10938e + ", timezoneOffsetSeconds=" + this.f10939f + ", networkConnectionInfo=" + this.f10940g + "}";
    }

    private f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f10934a = j10;
        this.f10935b = num;
        this.f10936c = j11;
        this.f10937d = bArr;
        this.f10938e = str;
        this.f10939f = j12;
        this.f10940g = oVar;
    }
}
