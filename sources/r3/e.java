package r3;

import r3.k;

/* compiled from: AutoValue_ClientInfo */
final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    private final k.b f10930a;

    /* renamed from: b  reason: collision with root package name */
    private final a f10931b;

    /* compiled from: AutoValue_ClientInfo */
    static final class b extends k.a {

        /* renamed from: a  reason: collision with root package name */
        private k.b f10932a;

        /* renamed from: b  reason: collision with root package name */
        private a f10933b;

        b() {
        }

        public k a() {
            return new e(this.f10932a, this.f10933b);
        }

        public k.a b(a aVar) {
            this.f10933b = aVar;
            return this;
        }

        public k.a c(k.b bVar) {
            this.f10932a = bVar;
            return this;
        }
    }

    public a b() {
        return this.f10931b;
    }

    public k.b c() {
        return this.f10930a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.b bVar = this.f10930a;
        if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
            a aVar = this.f10931b;
            if (aVar == null) {
                if (kVar.b() == null) {
                    return true;
                }
            } else if (aVar.equals(kVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f10930a;
        int i10 = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        a aVar = this.f10931b;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f10930a + ", androidClientInfo=" + this.f10931b + "}";
    }

    private e(k.b bVar, a aVar) {
        this.f10930a = bVar;
        this.f10931b = aVar;
    }
}
