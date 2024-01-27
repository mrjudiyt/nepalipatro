package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzm;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import z1.p;
import z1.q;
import z1.r;
import z1.s;
import z1.t;
import z1.u;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public class e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public boolean f5391a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public String f5392b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public String f5393c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public c f5394d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public zzu f5395e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f5396f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f5397g;

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f5398a;

        /* renamed from: b  reason: collision with root package name */
        private String f5399b;

        /* renamed from: c  reason: collision with root package name */
        private List f5400c;

        /* renamed from: d  reason: collision with root package name */
        private ArrayList f5401d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f5402e;

        /* renamed from: f  reason: collision with root package name */
        private c.a f5403f;

        /* synthetic */ a(p pVar) {
            c.a a10 = c.a();
            c.a unused = a10.f5414c = true;
            this.f5403f = a10;
        }

        public e a() {
            ArrayList arrayList;
            zzu zzu;
            ArrayList arrayList2 = this.f5401d;
            boolean z10 = true;
            boolean z11 = arrayList2 != null && !arrayList2.isEmpty();
            List list = this.f5400c;
            boolean z12 = list != null && !list.isEmpty();
            if (!z11 && !z12) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            } else if (!z11 || !z12) {
                if (!z11) {
                    b bVar = (b) this.f5400c.get(0);
                    int i10 = 0;
                    while (i10 < this.f5400c.size()) {
                        b bVar2 = (b) this.f5400c.get(i10);
                        if (bVar2 == null) {
                            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                        } else if (i10 == 0 || bVar2.b().e().equals(bVar.b().e()) || bVar2.b().e().equals("play_pass_subs")) {
                            i10++;
                        } else {
                            throw new IllegalArgumentException("All products should have same ProductType.");
                        }
                    }
                    String h10 = bVar.b().h();
                    for (b bVar3 : this.f5400c) {
                        if (!bVar.b().e().equals("play_pass_subs") && !bVar3.b().e().equals("play_pass_subs") && !h10.equals(bVar3.b().h())) {
                            throw new IllegalArgumentException("All products must have the same package name.");
                        }
                    }
                } else if (this.f5401d.contains((Object) null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                } else if (this.f5401d.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.f5401d.get(0);
                    String b10 = skuDetails.b();
                    ArrayList arrayList3 = this.f5401d;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList3.get(i11);
                        if (b10.equals("play_pass_subs") || skuDetails2.b().equals("play_pass_subs") || b10.equals(skuDetails2.b())) {
                            i11++;
                        } else {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String f10 = skuDetails.f();
                    ArrayList arrayList4 = this.f5401d;
                    int size2 = arrayList4.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList4.get(i12);
                        if (b10.equals("play_pass_subs") || skuDetails3.b().equals("play_pass_subs") || f10.equals(skuDetails3.f())) {
                            i12++;
                        } else {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
                e eVar = new e((u) null);
                if ((!z11 || ((SkuDetails) this.f5401d.get(0)).f().isEmpty()) && (!z12 || ((b) this.f5400c.get(0)).b().h().isEmpty())) {
                    z10 = false;
                }
                eVar.f5391a = z10;
                eVar.f5392b = this.f5398a;
                eVar.f5393c = this.f5399b;
                eVar.f5394d = this.f5403f.a();
                ArrayList arrayList5 = this.f5401d;
                if (arrayList5 != null) {
                    arrayList = new ArrayList(arrayList5);
                } else {
                    arrayList = new ArrayList();
                }
                eVar.f5396f = arrayList;
                eVar.f5397g = this.f5402e;
                List list2 = this.f5400c;
                if (list2 != null) {
                    zzu = zzu.zzj(list2);
                } else {
                    zzu = zzu.zzk();
                }
                eVar.f5395e = zzu;
                return eVar;
            } else {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
        }

        public a b(String str) {
            this.f5398a = str;
            return this;
        }

        public a c(String str) {
            this.f5399b = str;
            return this;
        }

        public a d(List<b> list) {
            this.f5400c = new ArrayList(list);
            return this;
        }

        public a e(c cVar) {
            this.f5403f = c.d(cVar);
            return this;
        }
    }

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final g f5404a;

        /* renamed from: b  reason: collision with root package name */
        private final String f5405b;

        /* compiled from: com.android.billingclient:billing@@6.0.1 */
        public static class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public g f5406a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public String f5407b;

            /* synthetic */ a(q qVar) {
            }

            public b a() {
                zzm.zzc(this.f5406a, "ProductDetails is required for constructing ProductDetailsParams.");
                zzm.zzc(this.f5407b, "offerToken is required for constructing ProductDetailsParams.");
                return new b(this, (r) null);
            }

            public a b(String str) {
                this.f5407b = str;
                return this;
            }

            public a c(g gVar) {
                this.f5406a = gVar;
                if (gVar.c() != null) {
                    Objects.requireNonNull(gVar.c());
                    this.f5407b = gVar.c().d();
                }
                return this;
            }
        }

        /* synthetic */ b(a aVar, r rVar) {
            this.f5404a = aVar.f5406a;
            this.f5405b = aVar.f5407b;
        }

        public static a a() {
            return new a((q) null);
        }

        public final g b() {
            return this.f5404a;
        }

        public final String c() {
            return this.f5405b;
        }
    }

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    public static class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f5408a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f5409b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f5410c = 0;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f5411d = 0;

        /* compiled from: com.android.billingclient:billing@@6.0.1 */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private String f5412a;

            /* renamed from: b  reason: collision with root package name */
            private String f5413b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public boolean f5414c;

            /* renamed from: d  reason: collision with root package name */
            private int f5415d = 0;

            /* renamed from: e  reason: collision with root package name */
            private int f5416e = 0;

            /* synthetic */ a(s sVar) {
            }

            public c a() {
                boolean z10 = !TextUtils.isEmpty(this.f5412a) || !TextUtils.isEmpty((CharSequence) null);
                boolean isEmpty = true ^ TextUtils.isEmpty(this.f5413b);
                if (z10 && isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                } else if (this.f5414c || z10 || isEmpty) {
                    c cVar = new c((t) null);
                    cVar.f5408a = this.f5412a;
                    cVar.f5410c = this.f5415d;
                    cVar.f5411d = this.f5416e;
                    cVar.f5409b = this.f5413b;
                    return cVar;
                } else {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
            }

            public a b(String str) {
                this.f5412a = str;
                return this;
            }

            @Deprecated
            public a c(String str) {
                this.f5412a = str;
                return this;
            }

            public a d(String str) {
                this.f5413b = str;
                return this;
            }

            @Deprecated
            public a e(int i10) {
                this.f5415d = i10;
                return this;
            }

            @Deprecated
            public a f(int i10) {
                this.f5415d = i10;
                return this;
            }

            public a g(int i10) {
                this.f5416e = i10;
                return this;
            }
        }

        /* synthetic */ c(t tVar) {
        }

        public static a a() {
            return new a((s) null);
        }

        static /* bridge */ /* synthetic */ a d(c cVar) {
            a a10 = a();
            a10.c(cVar.f5408a);
            a10.f(cVar.f5410c);
            a10.g(cVar.f5411d);
            a10.d(cVar.f5409b);
            return a10;
        }

        /* access modifiers changed from: package-private */
        @Deprecated
        public final int b() {
            return this.f5410c;
        }

        /* access modifiers changed from: package-private */
        public final int c() {
            return this.f5411d;
        }

        /* access modifiers changed from: package-private */
        public final String e() {
            return this.f5408a;
        }

        /* access modifiers changed from: package-private */
        public final String f() {
            return this.f5409b;
        }
    }

    /* synthetic */ e(u uVar) {
    }

    public static a a() {
        return new a((p) null);
    }

    @Deprecated
    public final int b() {
        return this.f5394d.b();
    }

    public final int c() {
        return this.f5394d.c();
    }

    public final String d() {
        return this.f5392b;
    }

    public final String e() {
        return this.f5393c;
    }

    public final String f() {
        return this.f5394d.e();
    }

    public final String g() {
        return this.f5394d.f();
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f5396f);
        return arrayList;
    }

    public final List i() {
        return this.f5395e;
    }

    public final boolean q() {
        return this.f5397g;
    }

    /* access modifiers changed from: package-private */
    public final boolean r() {
        return (this.f5392b == null && this.f5393c == null && this.f5394d.f() == null && this.f5394d.b() == 0 && this.f5394d.c() == 0 && !this.f5391a && !this.f5397g) ? false : true;
    }
}
