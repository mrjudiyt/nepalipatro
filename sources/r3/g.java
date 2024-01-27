package r3;

import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;
import r3.m;

/* compiled from: AutoValue_LogRequest */
final class g extends m {

    /* renamed from: a  reason: collision with root package name */
    private final long f10948a;

    /* renamed from: b  reason: collision with root package name */
    private final long f10949b;

    /* renamed from: c  reason: collision with root package name */
    private final k f10950c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f10951d;

    /* renamed from: e  reason: collision with root package name */
    private final String f10952e;

    /* renamed from: f  reason: collision with root package name */
    private final List<l> f10953f;

    /* renamed from: g  reason: collision with root package name */
    private final p f10954g;

    /* compiled from: AutoValue_LogRequest */
    static final class b extends m.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f10955a;

        /* renamed from: b  reason: collision with root package name */
        private Long f10956b;

        /* renamed from: c  reason: collision with root package name */
        private k f10957c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f10958d;

        /* renamed from: e  reason: collision with root package name */
        private String f10959e;

        /* renamed from: f  reason: collision with root package name */
        private List<l> f10960f;

        /* renamed from: g  reason: collision with root package name */
        private p f10961g;

        b() {
        }

        public m a() {
            String str = "";
            if (this.f10955a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f10956b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f10955a.longValue(), this.f10956b.longValue(), this.f10957c, this.f10958d, this.f10959e, this.f10960f, this.f10961g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public m.a b(k kVar) {
            this.f10957c = kVar;
            return this;
        }

        public m.a c(List<l> list) {
            this.f10960f = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        public m.a d(Integer num) {
            this.f10958d = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        public m.a e(String str) {
            this.f10959e = str;
            return this;
        }

        public m.a f(p pVar) {
            this.f10961g = pVar;
            return this;
        }

        public m.a g(long j10) {
            this.f10955a = Long.valueOf(j10);
            return this;
        }

        public m.a h(long j10) {
            this.f10956b = Long.valueOf(j10);
            return this;
        }
    }

    public k b() {
        return this.f10950c;
    }

    @Encodable.Field(name = "logEvent")
    public List<l> c() {
        return this.f10953f;
    }

    public Integer d() {
        return this.f10951d;
    }

    public String e() {
        return this.f10952e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f10948a == mVar.g() && this.f10949b == mVar.h() && ((kVar = this.f10950c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f10951d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f10952e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f10953f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
            p pVar = this.f10954g;
            if (pVar == null) {
                if (mVar.f() == null) {
                    return true;
                }
            } else if (pVar.equals(mVar.f())) {
                return true;
            }
        }
        return false;
    }

    public p f() {
        return this.f10954g;
    }

    public long g() {
        return this.f10948a;
    }

    public long h() {
        return this.f10949b;
    }

    public int hashCode() {
        long j10 = this.f10948a;
        long j11 = this.f10949b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        k kVar = this.f10950c;
        int i11 = 0;
        int hashCode = (i10 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f10951d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f10952e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f10953f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f10954g;
        if (pVar != null) {
            i11 = pVar.hashCode();
        }
        return hashCode4 ^ i11;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f10948a + ", requestUptimeMs=" + this.f10949b + ", clientInfo=" + this.f10950c + ", logSource=" + this.f10951d + ", logSourceName=" + this.f10952e + ", logEvents=" + this.f10953f + ", qosTier=" + this.f10954g + "}";
    }

    private g(long j10, long j11, k kVar, Integer num, String str, List<l> list, p pVar) {
        this.f10948a = j10;
        this.f10949b = j11;
        this.f10950c = kVar;
        this.f10951d = num;
        this.f10952e = str;
        this.f10953f = list;
        this.f10954g = pVar;
    }
}
