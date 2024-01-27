package com.google.common.collect;

import com.google.common.collect.z;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import l6.p;

/* compiled from: RegularImmutableMap */
final class y0<K, V> extends z<K, V> {

    /* renamed from: o  reason: collision with root package name */
    static final z<Object, Object> f13709o = new y0((Object) null, new Object[0], 0);

    /* renamed from: l  reason: collision with root package name */
    private final transient Object f13710l;

    /* renamed from: m  reason: collision with root package name */
    final transient Object[] f13711m;

    /* renamed from: n  reason: collision with root package name */
    private final transient int f13712n;

    /* compiled from: RegularImmutableMap */
    static class a<K, V> extends b0<Map.Entry<K, V>> {

        /* renamed from: j  reason: collision with root package name */
        private final transient z<K, V> f13713j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public final transient Object[] f13714k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public final transient int f13715l;
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public final transient int f13716m;

        /* renamed from: com.google.common.collect.y0$a$a  reason: collision with other inner class name */
        /* compiled from: RegularImmutableMap */
        class C0237a extends x<Map.Entry<K, V>> {
            C0237a() {
            }

            /* renamed from: F */
            public Map.Entry<K, V> get(int i10) {
                p.h(i10, a.this.f13716m);
                int i11 = i10 * 2;
                Object obj = a.this.f13714k[a.this.f13715l + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f13714k[i11 + (a.this.f13715l ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            public boolean f() {
                return true;
            }

            public int size() {
                return a.this.f13716m;
            }
        }

        a(z<K, V> zVar, Object[] objArr, int i10, int i11) {
            this.f13713j = zVar;
            this.f13714k = objArr;
            this.f13715l = i10;
            this.f13716m = i11;
        }

        /* access modifiers changed from: package-private */
        public int b(Object[] objArr, int i10) {
            return a().b(objArr, i10);
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f13713j.get(key))) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return true;
        }

        /* renamed from: g */
        public k1<Map.Entry<K, V>> iterator() {
            return a().iterator();
        }

        /* access modifiers changed from: package-private */
        public x<Map.Entry<K, V>> p() {
            return new C0237a();
        }

        public int size() {
            return this.f13716m;
        }
    }

    /* compiled from: RegularImmutableMap */
    static final class b<K> extends b0<K> {

        /* renamed from: j  reason: collision with root package name */
        private final transient z<K, ?> f13718j;

        /* renamed from: k  reason: collision with root package name */
        private final transient x<K> f13719k;

        b(z<K, ?> zVar, x<K> xVar) {
            this.f13718j = zVar;
            this.f13719k = xVar;
        }

        public x<K> a() {
            return this.f13719k;
        }

        /* access modifiers changed from: package-private */
        public int b(Object[] objArr, int i10) {
            return a().b(objArr, i10);
        }

        public boolean contains(Object obj) {
            return this.f13718j.get(obj) != null;
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return true;
        }

        /* renamed from: g */
        public k1<K> iterator() {
            return a().iterator();
        }

        public int size() {
            return this.f13718j.size();
        }
    }

    /* compiled from: RegularImmutableMap */
    static final class c extends x<Object> {

        /* renamed from: j  reason: collision with root package name */
        private final transient Object[] f13720j;

        /* renamed from: k  reason: collision with root package name */
        private final transient int f13721k;

        /* renamed from: l  reason: collision with root package name */
        private final transient int f13722l;

        c(Object[] objArr, int i10, int i11) {
            this.f13720j = objArr;
            this.f13721k = i10;
            this.f13722l = i11;
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return true;
        }

        public Object get(int i10) {
            p.h(i10, this.f13722l);
            Object obj = this.f13720j[(i10 * 2) + this.f13721k];
            Objects.requireNonNull(obj);
            return obj;
        }

        public int size() {
            return this.f13722l;
        }
    }

    private y0(Object obj, Object[] objArr, int i10) {
        this.f13710l = obj;
        this.f13711m = objArr;
        this.f13712n = i10;
    }

    static <K, V> y0<K, V> l(int i10, Object[] objArr, z.a<K, V> aVar) {
        if (i10 == 0) {
            return (y0) f13709o;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            i.a(obj, obj2);
            return new y0<>((Object) null, objArr, 1);
        }
        p.l(i10, objArr.length >> 1);
        Object m10 = m(objArr, i10, b0.l(i10), 0);
        if (m10 instanceof Object[]) {
            Object[] objArr2 = (Object[]) m10;
            z.a.C0238a aVar2 = (z.a.C0238a) objArr2[2];
            if (aVar != null) {
                aVar.f13731e = aVar2;
                Object obj3 = objArr2[0];
                int intValue = ((Integer) objArr2[1]).intValue();
                objArr = Arrays.copyOf(objArr, intValue * 2);
                m10 = obj3;
                i10 = intValue;
            } else {
                throw aVar2.a();
            }
        }
        return new y0<>(m10, objArr, i10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m(java.lang.Object[] r16, int r17, int r18, int r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L_0x0018
            r0 = r16[r19]
            java.util.Objects.requireNonNull(r0)
            r1 = r19 ^ 1
            r1 = r16[r1]
            java.util.Objects.requireNonNull(r1)
            com.google.common.collect.i.a(r0, r1)
            return r2
        L_0x0018:
            int r4 = r1 + -1
            r5 = 128(0x80, float:1.794E-43)
            r6 = 3
            r7 = -1
            r8 = 2
            r9 = 0
            if (r1 > r5) goto L_0x008c
            byte[] r1 = new byte[r1]
            java.util.Arrays.fill(r1, r7)
            r5 = 0
            r7 = 0
        L_0x0029:
            if (r5 >= r0) goto L_0x007b
            int r10 = r5 * 2
            int r10 = r10 + r19
            int r11 = r7 * 2
            int r11 = r11 + r19
            r12 = r16[r10]
            java.util.Objects.requireNonNull(r12)
            r10 = r10 ^ r3
            r10 = r16[r10]
            java.util.Objects.requireNonNull(r10)
            com.google.common.collect.i.a(r12, r10)
            int r13 = r12.hashCode()
            int r13 = com.google.common.collect.u.b(r13)
        L_0x0049:
            r13 = r13 & r4
            byte r14 = r1[r13]
            r15 = 255(0xff, float:3.57E-43)
            r14 = r14 & r15
            if (r14 != r15) goto L_0x005f
            byte r14 = (byte) r11
            r1[r13] = r14
            if (r7 >= r5) goto L_0x005c
            r16[r11] = r12
            r11 = r11 ^ 1
            r16[r11] = r10
        L_0x005c:
            int r7 = r7 + 1
            goto L_0x0075
        L_0x005f:
            r15 = r16[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x0078
            com.google.common.collect.z$a$a r2 = new com.google.common.collect.z$a$a
            r11 = r14 ^ 1
            r13 = r16[r11]
            java.util.Objects.requireNonNull(r13)
            r2.<init>(r12, r10, r13)
            r16[r11] = r10
        L_0x0075:
            int r5 = r5 + 1
            goto L_0x0029
        L_0x0078:
            int r13 = r13 + 1
            goto L_0x0049
        L_0x007b:
            if (r7 != r0) goto L_0x007e
            goto L_0x008b
        L_0x007e:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0[r3] = r1
            r0[r8] = r2
            r1 = r0
        L_0x008b:
            return r1
        L_0x008c:
            r5 = 32768(0x8000, float:4.5918E-41)
            if (r1 > r5) goto L_0x00fc
            short[] r1 = new short[r1]
            java.util.Arrays.fill(r1, r7)
            r5 = 0
            r7 = 0
        L_0x0098:
            if (r5 >= r0) goto L_0x00eb
            int r10 = r5 * 2
            int r10 = r10 + r19
            int r11 = r7 * 2
            int r11 = r11 + r19
            r12 = r16[r10]
            java.util.Objects.requireNonNull(r12)
            r10 = r10 ^ r3
            r10 = r16[r10]
            java.util.Objects.requireNonNull(r10)
            com.google.common.collect.i.a(r12, r10)
            int r13 = r12.hashCode()
            int r13 = com.google.common.collect.u.b(r13)
        L_0x00b8:
            r13 = r13 & r4
            short r14 = r1[r13]
            r15 = 65535(0xffff, float:9.1834E-41)
            r14 = r14 & r15
            if (r14 != r15) goto L_0x00cf
            short r14 = (short) r11
            r1[r13] = r14
            if (r7 >= r5) goto L_0x00cc
            r16[r11] = r12
            r11 = r11 ^ 1
            r16[r11] = r10
        L_0x00cc:
            int r7 = r7 + 1
            goto L_0x00e5
        L_0x00cf:
            r15 = r16[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x00e8
            com.google.common.collect.z$a$a r2 = new com.google.common.collect.z$a$a
            r11 = r14 ^ 1
            r13 = r16[r11]
            java.util.Objects.requireNonNull(r13)
            r2.<init>(r12, r10, r13)
            r16[r11] = r10
        L_0x00e5:
            int r5 = r5 + 1
            goto L_0x0098
        L_0x00e8:
            int r13 = r13 + 1
            goto L_0x00b8
        L_0x00eb:
            if (r7 != r0) goto L_0x00ee
            goto L_0x00fb
        L_0x00ee:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0[r3] = r1
            r0[r8] = r2
            r1 = r0
        L_0x00fb:
            return r1
        L_0x00fc:
            int[] r1 = new int[r1]
            java.util.Arrays.fill(r1, r7)
            r5 = 0
            r10 = 0
        L_0x0103:
            if (r5 >= r0) goto L_0x0153
            int r11 = r5 * 2
            int r11 = r11 + r19
            int r12 = r10 * 2
            int r12 = r12 + r19
            r13 = r16[r11]
            java.util.Objects.requireNonNull(r13)
            r11 = r11 ^ r3
            r11 = r16[r11]
            java.util.Objects.requireNonNull(r11)
            com.google.common.collect.i.a(r13, r11)
            int r14 = r13.hashCode()
            int r14 = com.google.common.collect.u.b(r14)
        L_0x0123:
            r14 = r14 & r4
            r15 = r1[r14]
            if (r15 != r7) goto L_0x0135
            r1[r14] = r12
            if (r10 >= r5) goto L_0x0132
            r16[r12] = r13
            r12 = r12 ^ 1
            r16[r12] = r11
        L_0x0132:
            int r10 = r10 + 1
            goto L_0x014b
        L_0x0135:
            r7 = r16[r15]
            boolean r7 = r13.equals(r7)
            if (r7 == 0) goto L_0x014f
            com.google.common.collect.z$a$a r2 = new com.google.common.collect.z$a$a
            r7 = r15 ^ 1
            r12 = r16[r7]
            java.util.Objects.requireNonNull(r12)
            r2.<init>(r13, r11, r12)
            r16[r7] = r11
        L_0x014b:
            int r5 = r5 + 1
            r7 = -1
            goto L_0x0103
        L_0x014f:
            int r14 = r14 + 1
            r7 = -1
            goto L_0x0123
        L_0x0153:
            if (r10 != r0) goto L_0x0156
            goto L_0x0163
        L_0x0156:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r3] = r1
            r0[r8] = r2
            r1 = r0
        L_0x0163:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.y0.m(java.lang.Object[], int, int, int):java.lang.Object");
    }

    static Object n(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int b10 = u.b(obj2.hashCode());
                while (true) {
                    int i12 = b10 & length;
                    byte b11 = bArr[i12] & 255;
                    if (b11 == 255) {
                        return null;
                    }
                    if (obj2.equals(objArr[b11])) {
                        return objArr[b11 ^ 1];
                    }
                    b10 = i12 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int b12 = u.b(obj2.hashCode());
                while (true) {
                    int i13 = b12 & length2;
                    short s10 = sArr[i13] & 65535;
                    if (s10 == 65535) {
                        return null;
                    }
                    if (obj2.equals(objArr[s10])) {
                        return objArr[s10 ^ 1];
                    }
                    b12 = i13 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int b13 = u.b(obj2.hashCode());
                while (true) {
                    int i14 = b13 & length3;
                    int i15 = iArr[i14];
                    if (i15 == -1) {
                        return null;
                    }
                    if (obj2.equals(objArr[i15])) {
                        return objArr[i15 ^ 1];
                    }
                    b13 = i14 + 1;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public b0<Map.Entry<K, V>> d() {
        return new a(this, this.f13711m, 0, this.f13712n);
    }

    /* access modifiers changed from: package-private */
    public b0<K> e() {
        return new b(this, new c(this.f13711m, 0, this.f13712n));
    }

    /* access modifiers changed from: package-private */
    public v<V> f() {
        return new c(this.f13711m, 1, this.f13712n);
    }

    public V get(Object obj) {
        V n10 = n(this.f13710l, this.f13711m, this.f13712n, 0, obj);
        if (n10 == null) {
            return null;
        }
        return n10;
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return false;
    }

    public int size() {
        return this.f13712n;
    }
}
