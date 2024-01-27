package r3;

import r3.o;

/* compiled from: AutoValue_NetworkConnectionInfo */
final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    private final o.c f10963a;

    /* renamed from: b  reason: collision with root package name */
    private final o.b f10964b;

    /* compiled from: AutoValue_NetworkConnectionInfo */
    static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private o.c f10965a;

        /* renamed from: b  reason: collision with root package name */
        private o.b f10966b;

        b() {
        }

        public o a() {
            return new i(this.f10965a, this.f10966b);
        }

        public o.a b(o.b bVar) {
            this.f10966b = bVar;
            return this;
        }

        public o.a c(o.c cVar) {
            this.f10965a = cVar;
            return this;
        }
    }

    public o.b b() {
        return this.f10964b;
    }

    public o.c c() {
        return this.f10963a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.c cVar = this.f10963a;
        if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
            o.b bVar = this.f10964b;
            if (bVar == null) {
                if (oVar.b() == null) {
                    return true;
                }
            } else if (bVar.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f10963a;
        int i10 = 0;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f10964b;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f10963a + ", mobileSubtype=" + this.f10964b + "}";
    }

    private i(o.c cVar, o.b bVar) {
        this.f10963a = cVar;
        this.f10964b = bVar;
    }
}
