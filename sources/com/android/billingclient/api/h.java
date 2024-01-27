package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzu;
import java.util.HashSet;
import java.util.List;
import z1.f0;
import z1.g0;
import z1.h0;
import z1.i0;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final zzu f5465a;

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public zzu f5466a;

        /* synthetic */ a(f0 f0Var) {
        }

        public h a() {
            return new h(this, (i0) null);
        }

        public a b(List<b> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            for (b next : list) {
                if (!"play_pass_subs".equals(next.c())) {
                    hashSet.add(next.c());
                }
            }
            if (hashSet.size() <= 1) {
                this.f5466a = zzu.zzj(list);
                return this;
            }
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
    }

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f5467a;

        /* renamed from: b  reason: collision with root package name */
        private final String f5468b;

        /* compiled from: com.android.billingclient:billing@@6.0.1 */
        public static class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public String f5469a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public String f5470b;

            /* synthetic */ a(g0 g0Var) {
            }

            public b a() {
                if ("first_party".equals(this.f5470b)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                } else if (this.f5469a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                } else if (this.f5470b != null) {
                    return new b(this, (h0) null);
                } else {
                    throw new IllegalArgumentException("Product type must be provided.");
                }
            }

            public a b(String str) {
                this.f5469a = str;
                return this;
            }

            public a c(String str) {
                this.f5470b = str;
                return this;
            }
        }

        /* synthetic */ b(a aVar, h0 h0Var) {
            this.f5467a = aVar.f5469a;
            this.f5468b = aVar.f5470b;
        }

        public static a a() {
            return new a((g0) null);
        }

        public final String b() {
            return this.f5467a;
        }

        public final String c() {
            return this.f5468b;
        }
    }

    /* synthetic */ h(a aVar, i0 i0Var) {
        this.f5465a = aVar.f5466a;
    }

    public static a a() {
        return new a((f0) null);
    }

    public final zzu b() {
        return this.f5465a;
    }

    public final String c() {
        return ((b) this.f5465a.get(0)).c();
    }
}
