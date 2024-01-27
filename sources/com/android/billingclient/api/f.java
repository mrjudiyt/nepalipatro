package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzb;
import z1.w;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public final class f {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int f5420a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public String f5421b;

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f5422a;

        /* renamed from: b  reason: collision with root package name */
        private String f5423b = "";

        /* synthetic */ a(w wVar) {
        }

        public f a() {
            f fVar = new f();
            fVar.f5420a = this.f5422a;
            fVar.f5421b = this.f5423b;
            return fVar;
        }

        public a b(String str) {
            this.f5423b = str;
            return this;
        }

        public a c(int i10) {
            this.f5422a = i10;
            return this;
        }
    }

    public static a c() {
        return new a((w) null);
    }

    public String a() {
        return this.f5421b;
    }

    public int b() {
        return this.f5420a;
    }

    public String toString() {
        String zzg = zzb.zzg(this.f5420a);
        String str = this.f5421b;
        return "Response Code: " + zzg + ", Debug Message: " + str;
    }
}
