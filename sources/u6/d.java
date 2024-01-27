package u6;

import r6.f;
import r6.s;
import r6.t;
import s6.b;
import t6.c;
import x6.a;

/* compiled from: JsonAdapterAnnotationTypeAdapterFactory */
public final class d implements t {

    /* renamed from: h  reason: collision with root package name */
    private final c f16617h;

    public d(c cVar) {
        this.f16617h = cVar;
    }

    public <T> s<T> a(f fVar, a<T> aVar) {
        b bVar = (b) aVar.c().getAnnotation(b.class);
        if (bVar == null) {
            return null;
        }
        return b(this.f16617h, fVar, aVar, bVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: u6.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: r6.s<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: r6.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: u6.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: u6.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: u6.l} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r6.s<?> b(t6.c r9, r6.f r10, x6.a<?> r11, s6.b r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            x6.a r0 = x6.a.a(r0)
            t6.i r9 = r9.a(r0)
            java.lang.Object r9 = r9.a()
            boolean r0 = r9 instanceof r6.s
            if (r0 == 0) goto L_0x0017
            r6.s r9 = (r6.s) r9
            goto L_0x0075
        L_0x0017:
            boolean r0 = r9 instanceof r6.t
            if (r0 == 0) goto L_0x0022
            r6.t r9 = (r6.t) r9
            r6.s r9 = r9.a(r10, r11)
            goto L_0x0075
        L_0x0022:
            boolean r0 = r9 instanceof r6.q
            if (r0 != 0) goto L_0x005b
            boolean r1 = r9 instanceof r6.k
            if (r1 == 0) goto L_0x002b
            goto L_0x005b
        L_0x002b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r12.append(r0)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.String r9 = r11.toString()
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L_0x005b:
            r1 = 0
            if (r0 == 0) goto L_0x0063
            r0 = r9
            r6.q r0 = (r6.q) r0
            r3 = r0
            goto L_0x0064
        L_0x0063:
            r3 = r1
        L_0x0064:
            boolean r0 = r9 instanceof r6.k
            if (r0 == 0) goto L_0x006b
            r1 = r9
            r6.k r1 = (r6.k) r1
        L_0x006b:
            r4 = r1
            u6.l r9 = new u6.l
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0075:
            if (r9 == 0) goto L_0x0081
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x0081
            r6.s r9 = r9.a()
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.d.b(t6.c, r6.f, x6.a, s6.b):r6.s");
    }
}
