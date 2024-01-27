package androidx.browser.customtabs;

import android.os.Bundle;

/* compiled from: CustomTabColorSchemeParams */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f1343a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f1344b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f1345c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f1346d;

    /* renamed from: androidx.browser.customtabs.a$a  reason: collision with other inner class name */
    /* compiled from: CustomTabColorSchemeParams */
    public static final class C0014a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f1347a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f1348b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f1349c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f1350d;

        public a a() {
            return new a(this.f1347a, this.f1348b, this.f1349c, this.f1350d);
        }

        public C0014a b(int i10) {
            this.f1347a = Integer.valueOf(i10 | -16777216);
            return this;
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f1343a = num;
        this.f1344b = num2;
        this.f1345c = num3;
        this.f1346d = num4;
    }

    /* access modifiers changed from: package-private */
    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f1343a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f1344b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f1345c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f1346d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
