package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: NotificationCompat */
public class l {

    /* compiled from: NotificationCompat */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Bundle f2139a;

        /* renamed from: b  reason: collision with root package name */
        private IconCompat f2140b;

        /* renamed from: c  reason: collision with root package name */
        private final r[] f2141c;

        /* renamed from: d  reason: collision with root package name */
        private final r[] f2142d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f2143e;

        /* renamed from: f  reason: collision with root package name */
        boolean f2144f;

        /* renamed from: g  reason: collision with root package name */
        private final int f2145g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f2146h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public int f2147i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f2148j;

        /* renamed from: k  reason: collision with root package name */
        public PendingIntent f2149k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f2150l;

        /* renamed from: androidx.core.app.l$a$a  reason: collision with other inner class name */
        /* compiled from: NotificationCompat */
        public static final class C0026a {

            /* renamed from: a  reason: collision with root package name */
            private final IconCompat f2151a;

            /* renamed from: b  reason: collision with root package name */
            private final CharSequence f2152b;

            /* renamed from: c  reason: collision with root package name */
            private final PendingIntent f2153c;

            /* renamed from: d  reason: collision with root package name */
            private boolean f2154d;

            /* renamed from: e  reason: collision with root package name */
            private final Bundle f2155e;

            /* renamed from: f  reason: collision with root package name */
            private ArrayList<r> f2156f;

            /* renamed from: g  reason: collision with root package name */
            private int f2157g;

            /* renamed from: h  reason: collision with root package name */
            private boolean f2158h;

            /* renamed from: i  reason: collision with root package name */
            private boolean f2159i;

            /* renamed from: j  reason: collision with root package name */
            private boolean f2160j;

            public C0026a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), (r[]) null, true, 0, true, false, false);
            }

            private void b() {
                if (this.f2159i) {
                    Objects.requireNonNull(this.f2153c, "Contextual Actions must contain a valid PendingIntent");
                }
            }

            /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object[]] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public androidx.core.app.l.a a() {
                /*
                    r17 = this;
                    r0 = r17
                    r17.b()
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.ArrayList<androidx.core.app.r> r3 = r0.f2156f
                    if (r3 == 0) goto L_0x0031
                    java.util.Iterator r3 = r3.iterator()
                L_0x0017:
                    boolean r4 = r3.hasNext()
                    if (r4 == 0) goto L_0x0031
                    java.lang.Object r4 = r3.next()
                    androidx.core.app.r r4 = (androidx.core.app.r) r4
                    boolean r5 = r4.j()
                    if (r5 == 0) goto L_0x002d
                    r1.add(r4)
                    goto L_0x0017
                L_0x002d:
                    r2.add(r4)
                    goto L_0x0017
                L_0x0031:
                    boolean r3 = r1.isEmpty()
                    r4 = 0
                    if (r3 == 0) goto L_0x003a
                    r11 = r4
                    goto L_0x0047
                L_0x003a:
                    int r3 = r1.size()
                    androidx.core.app.r[] r3 = new androidx.core.app.r[r3]
                    java.lang.Object[] r1 = r1.toArray(r3)
                    androidx.core.app.r[] r1 = (androidx.core.app.r[]) r1
                    r11 = r1
                L_0x0047:
                    boolean r1 = r2.isEmpty()
                    if (r1 == 0) goto L_0x004e
                    goto L_0x005b
                L_0x004e:
                    int r1 = r2.size()
                    androidx.core.app.r[] r1 = new androidx.core.app.r[r1]
                    java.lang.Object[] r1 = r2.toArray(r1)
                    r4 = r1
                    androidx.core.app.r[] r4 = (androidx.core.app.r[]) r4
                L_0x005b:
                    r10 = r4
                    androidx.core.app.l$a r1 = new androidx.core.app.l$a
                    androidx.core.graphics.drawable.IconCompat r6 = r0.f2151a
                    java.lang.CharSequence r7 = r0.f2152b
                    android.app.PendingIntent r8 = r0.f2153c
                    android.os.Bundle r9 = r0.f2155e
                    boolean r12 = r0.f2154d
                    int r13 = r0.f2157g
                    boolean r14 = r0.f2158h
                    boolean r15 = r0.f2159i
                    boolean r2 = r0.f2160j
                    r5 = r1
                    r16 = r2
                    r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.l.a.C0026a.a():androidx.core.app.l$a");
            }

            private C0026a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r[] rVarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                ArrayList<r> arrayList;
                this.f2154d = true;
                this.f2158h = true;
                this.f2151a = iconCompat;
                this.f2152b = e.k(charSequence);
                this.f2153c = pendingIntent;
                this.f2155e = bundle;
                if (rVarArr == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(Arrays.asList(rVarArr));
                }
                this.f2156f = arrayList;
                this.f2154d = z10;
                this.f2157g = i10;
                this.f2158h = z11;
                this.f2159i = z12;
                this.f2160j = z13;
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.n((Resources) null, "", i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f2149k;
        }

        public boolean b() {
            return this.f2143e;
        }

        public r[] c() {
            return this.f2142d;
        }

        public Bundle d() {
            return this.f2139a;
        }

        @Deprecated
        public int e() {
            return this.f2147i;
        }

        public IconCompat f() {
            int i10;
            if (this.f2140b == null && (i10 = this.f2147i) != 0) {
                this.f2140b = IconCompat.n((Resources) null, "", i10);
            }
            return this.f2140b;
        }

        public r[] g() {
            return this.f2141c;
        }

        public int h() {
            return this.f2145g;
        }

        public boolean i() {
            return this.f2144f;
        }

        public CharSequence j() {
            return this.f2148j;
        }

        public boolean k() {
            return this.f2150l;
        }

        public boolean l() {
            return this.f2146h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (r[]) null, (r[]) null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r[] rVarArr, r[] rVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f2144f = true;
            this.f2140b = iconCompat;
            if (iconCompat != null && iconCompat.s() == 2) {
                this.f2147i = iconCompat.p();
            }
            this.f2148j = e.k(charSequence);
            this.f2149k = pendingIntent;
            this.f2139a = bundle == null ? new Bundle() : bundle;
            this.f2141c = rVarArr;
            this.f2142d = rVarArr2;
            this.f2143e = z10;
            this.f2145g = i10;
            this.f2144f = z11;
            this.f2146h = z12;
            this.f2150l = z13;
        }
    }

    /* compiled from: NotificationCompat */
    public static class b extends h {

        /* renamed from: e  reason: collision with root package name */
        private IconCompat f2161e;

        /* renamed from: f  reason: collision with root package name */
        private IconCompat f2162f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f2163g;

        /* renamed from: h  reason: collision with root package name */
        private CharSequence f2164h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f2165i;

        /* compiled from: NotificationCompat */
        private static class a {
            static Notification.BigPictureStyle a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                return bigPictureStyle.bigPicture(bitmap);
            }

            static Notification.BigPictureStyle b(Notification.Builder builder) {
                return new Notification.BigPictureStyle(builder);
            }

            static Notification.BigPictureStyle c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                return bigPictureStyle.setBigContentTitle(charSequence);
            }

            static void d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            static void e(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: androidx.core.app.l$b$b  reason: collision with other inner class name */
        /* compiled from: NotificationCompat */
        private static class C0027b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* compiled from: NotificationCompat */
        private static class c {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        public void b(k kVar) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 16) {
                Notification.BigPictureStyle c10 = a.c(a.b(kVar.a()), this.f2204b);
                IconCompat iconCompat = this.f2161e;
                Context context = null;
                if (iconCompat != null) {
                    if (i10 >= 31) {
                        c.a(c10, this.f2161e.z(kVar instanceof m ? ((m) kVar).f() : null));
                    } else if (iconCompat.s() == 1) {
                        c10 = a.a(c10, this.f2161e.o());
                    }
                }
                if (this.f2163g) {
                    IconCompat iconCompat2 = this.f2162f;
                    if (iconCompat2 == null) {
                        a.d(c10, (Bitmap) null);
                    } else if (i10 >= 23) {
                        if (kVar instanceof m) {
                            context = ((m) kVar).f();
                        }
                        C0027b.a(c10, this.f2162f.z(context));
                    } else if (iconCompat2.s() == 1) {
                        a.d(c10, this.f2162f.o());
                    } else {
                        a.d(c10, (Bitmap) null);
                    }
                }
                if (this.f2206d) {
                    a.e(c10, this.f2205c);
                }
                if (i10 >= 31) {
                    c.c(c10, this.f2165i);
                    c.b(c10, this.f2164h);
                }
            }
        }

        /* access modifiers changed from: protected */
        public String l() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b r(Bitmap bitmap) {
            this.f2162f = bitmap == null ? null : IconCompat.j(bitmap);
            this.f2163g = true;
            return this;
        }

        public b s(Bitmap bitmap) {
            this.f2161e = bitmap == null ? null : IconCompat.j(bitmap);
            return this;
        }
    }

    /* compiled from: NotificationCompat */
    public static class c extends h {

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f2166e;

        /* compiled from: NotificationCompat */
        static class a {
            static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            static Notification.BigTextStyle b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            static Notification.BigTextStyle d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setSummaryText(charSequence);
            }
        }

        public void a(Bundle bundle) {
            super.a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f2166e);
            }
        }

        public void b(k kVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle a10 = a.a(a.c(a.b(kVar.a()), this.f2204b), this.f2166e);
                if (this.f2206d) {
                    a.d(a10, this.f2205c);
                }
            }
        }

        /* access modifiers changed from: protected */
        public String l() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c r(CharSequence charSequence) {
            this.f2166e = e.k(charSequence);
            return this;
        }
    }

    /* compiled from: NotificationCompat */
    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    /* compiled from: NotificationCompat */
    public static class f extends h {

        /* renamed from: e  reason: collision with root package name */
        private int f2193e;

        /* renamed from: f  reason: collision with root package name */
        private p f2194f;

        /* renamed from: g  reason: collision with root package name */
        private PendingIntent f2195g;

        /* renamed from: h  reason: collision with root package name */
        private PendingIntent f2196h;

        /* renamed from: i  reason: collision with root package name */
        private PendingIntent f2197i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f2198j;

        /* renamed from: k  reason: collision with root package name */
        private Integer f2199k;

        /* renamed from: l  reason: collision with root package name */
        private Integer f2200l;

        /* renamed from: m  reason: collision with root package name */
        private IconCompat f2201m;

        /* renamed from: n  reason: collision with root package name */
        private CharSequence f2202n;

        /* compiled from: NotificationCompat */
        static class a {
            static void a(Notification.CallStyle callStyle, Notification.Builder builder) {
                callStyle.setBuilder(builder);
            }
        }

        /* compiled from: NotificationCompat */
        static class b {
            static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        /* compiled from: NotificationCompat */
        static class c {
            static Parcelable a(Icon icon) {
                return icon;
            }

            static Notification.Action.Builder b(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            static void c(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        /* compiled from: NotificationCompat */
        static class d {
            static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            static Parcelable b(Person person) {
                return person;
            }
        }

        /* compiled from: NotificationCompat */
        static class e {
            static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle d(Notification.CallStyle callStyle, int i10) {
                return callStyle.setAnswerButtonColorHint(i10);
            }

            static Notification.Action.Builder e(Notification.Action.Builder builder, boolean z10) {
                return builder.setAuthenticationRequired(z10);
            }

            static Notification.CallStyle f(Notification.CallStyle callStyle, int i10) {
                return callStyle.setDeclineButtonColorHint(i10);
            }

            static Notification.CallStyle g(Notification.CallStyle callStyle, boolean z10) {
                return callStyle.setIsVideo(z10);
            }

            static Notification.CallStyle h(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            static Notification.CallStyle i(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        private String s() {
            int i10 = this.f2193e;
            if (i10 == 1) {
                return this.f2203a.f2167a.getResources().getString(y.h.f12907e);
            }
            if (i10 == 2) {
                return this.f2203a.f2167a.getResources().getString(y.h.f12908f);
            }
            if (i10 != 3) {
                return null;
            }
            return this.f2203a.f2167a.getResources().getString(y.h.f12909g);
        }

        private boolean t(a aVar) {
            return aVar != null && aVar.d().getBoolean("key_action_priority");
        }

        private a u(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(androidx.core.content.a.d(this.f2203a.f2167a, i12));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(this.f2203a.f2167a.getResources().getString(i11));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a a10 = new a.C0026a(IconCompat.m(this.f2203a.f2167a, i10), spannableStringBuilder, pendingIntent).a();
            a10.d().putBoolean("key_action_priority", true);
            return a10;
        }

        private a v() {
            int i10;
            int i11 = y.d.f12854d;
            int i12 = y.d.f12852b;
            if (Build.VERSION.SDK_INT >= 21) {
                i11 = y.d.f12853c;
                i12 = y.d.f12851a;
            }
            PendingIntent pendingIntent = this.f2195g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z10 = this.f2198j;
            int i13 = z10 ? i11 : i12;
            if (z10) {
                i10 = y.h.f12904b;
            } else {
                i10 = y.h.f12903a;
            }
            return u(i13, i10, this.f2199k, y.b.f12838a, pendingIntent);
        }

        private a w() {
            int i10 = y.d.f12856f;
            if (Build.VERSION.SDK_INT >= 21) {
                i10 = y.d.f12855e;
            }
            int i11 = i10;
            PendingIntent pendingIntent = this.f2196h;
            if (pendingIntent == null) {
                return u(i11, y.h.f12906d, this.f2200l, y.b.f12839b, this.f2197i);
            }
            return u(i11, y.h.f12905c, this.f2200l, y.b.f12839b, pendingIntent);
        }

        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", this.f2193e);
            bundle.putBoolean("android.callIsVideo", this.f2198j);
            p pVar = this.f2194f;
            if (pVar != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", d.b(pVar.h()));
                } else {
                    bundle.putParcelable("android.callPersonCompat", pVar.i());
                }
            }
            IconCompat iconCompat = this.f2201m;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    bundle.putParcelable("android.verificationIcon", c.a(iconCompat.z(this.f2203a.f2167a)));
                } else {
                    bundle.putParcelable("android.verificationIconCompat", iconCompat.x());
                }
            }
            bundle.putCharSequence("android.verificationText", this.f2202n);
            bundle.putParcelable("android.answerIntent", this.f2195g);
            bundle.putParcelable("android.declineIntent", this.f2196h);
            bundle.putParcelable("android.hangUpIntent", this.f2197i);
            Integer num = this.f2199k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f2200l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        public void b(k kVar) {
            int i10 = Build.VERSION.SDK_INT;
            Notification.CallStyle callStyle = null;
            if (i10 >= 31) {
                int i11 = this.f2193e;
                if (i11 == 1) {
                    callStyle = e.a(this.f2194f.h(), this.f2196h, this.f2195g);
                } else if (i11 == 2) {
                    callStyle = e.b(this.f2194f.h(), this.f2197i);
                } else if (i11 == 3) {
                    callStyle = e.c(this.f2194f.h(), this.f2197i, this.f2195g);
                } else if (Log.isLoggable("NotifCompat", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unrecognized call type in CallStyle: ");
                    sb.append(String.valueOf(this.f2193e));
                }
                if (callStyle != null) {
                    a.a(callStyle, kVar.a());
                    Integer num = this.f2199k;
                    if (num != null) {
                        e.d(callStyle, num.intValue());
                    }
                    Integer num2 = this.f2200l;
                    if (num2 != null) {
                        e.f(callStyle, num2.intValue());
                    }
                    e.i(callStyle, this.f2202n);
                    IconCompat iconCompat = this.f2201m;
                    if (iconCompat != null) {
                        e.h(callStyle, iconCompat.z(this.f2203a.f2167a));
                    }
                    e.g(callStyle, this.f2198j);
                    return;
                }
                return;
            }
            Notification.Builder a10 = kVar.a();
            p pVar = this.f2194f;
            a10.setContentTitle(pVar != null ? pVar.c() : null);
            Bundle bundle = this.f2203a.E;
            if (bundle != null && bundle.containsKey("android.text")) {
                callStyle = this.f2203a.E.getCharSequence("android.text");
            }
            if (callStyle == null) {
                callStyle = s();
            }
            a10.setContentText(callStyle);
            p pVar2 = this.f2194f;
            if (pVar2 != null) {
                if (i10 >= 23 && pVar2.a() != null) {
                    c.c(a10, this.f2194f.a().z(this.f2203a.f2167a));
                }
                if (i10 >= 28) {
                    d.a(a10, this.f2194f.h());
                } else if (i10 >= 21) {
                    b.a(a10, this.f2194f.d());
                }
            }
            if (i10 >= 21) {
                b.b(a10, "call");
            }
        }

        /* access modifiers changed from: protected */
        public String l() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        public ArrayList<a> r() {
            a w10 = w();
            a v10 = v();
            ArrayList<a> arrayList = new ArrayList<>(3);
            arrayList.add(w10);
            int i10 = 2;
            ArrayList<a> arrayList2 = this.f2203a.f2168b;
            if (arrayList2 != null) {
                for (a next : arrayList2) {
                    if (next.l()) {
                        arrayList.add(next);
                    } else if (!t(next) && i10 > 1) {
                        arrayList.add(next);
                        i10--;
                    }
                    if (v10 != null && i10 == 1) {
                        arrayList.add(v10);
                        i10--;
                    }
                }
            }
            if (v10 != null && i10 >= 1) {
                arrayList.add(v10);
            }
            return arrayList;
        }
    }

    /* compiled from: NotificationCompat */
    public static class g extends h {

        /* compiled from: NotificationCompat */
        static class a {
            static void a(RemoteViews remoteViews, int i10, CharSequence charSequence) {
                remoteViews.setContentDescription(i10, charSequence);
            }
        }

        /* compiled from: NotificationCompat */
        static class b {
            static Notification.Builder a(Notification.Builder builder, Object obj) {
                return builder.setStyle((Notification.Style) obj);
            }
        }

        /* compiled from: NotificationCompat */
        static class c {
            static Notification.DecoratedCustomViewStyle a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        private RemoteViews r(RemoteViews remoteViews, boolean z10) {
            int min;
            boolean z11 = true;
            int i10 = 0;
            RemoteViews c10 = c(true, y.g.f12902c, false);
            c10.removeAllViews(y.e.L);
            List<a> t10 = t(this.f2203a.f2168b);
            if (!z10 || t10 == null || (min = Math.min(t10.size(), 3)) <= 0) {
                z11 = false;
            } else {
                for (int i11 = 0; i11 < min; i11++) {
                    c10.addView(y.e.L, s(t10.get(i11)));
                }
            }
            if (!z11) {
                i10 = 8;
            }
            c10.setViewVisibility(y.e.L, i10);
            c10.setViewVisibility(y.e.I, i10);
            d(c10, remoteViews);
            return c10;
        }

        private RemoteViews s(a aVar) {
            int i10;
            boolean z10 = aVar.f2149k == null;
            String packageName = this.f2203a.f2167a.getPackageName();
            if (z10) {
                i10 = y.g.f12901b;
            } else {
                i10 = y.g.f12900a;
            }
            RemoteViews remoteViews = new RemoteViews(packageName, i10);
            IconCompat f10 = aVar.f();
            if (f10 != null) {
                remoteViews.setImageViewBitmap(y.e.J, i(f10, y.b.f12840c));
            }
            remoteViews.setTextViewText(y.e.K, aVar.f2148j);
            if (!z10) {
                remoteViews.setOnClickPendingIntent(y.e.H, aVar.f2149k);
            }
            if (Build.VERSION.SDK_INT >= 15) {
                a.a(remoteViews, y.e.H, aVar.f2148j);
            }
            return remoteViews;
        }

        private static List<a> t(List<a> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (a next : list) {
                if (!next.l()) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        public void b(k kVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                b.a(kVar.a(), c.a());
            }
        }

        /* access modifiers changed from: protected */
        public String l() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        public RemoteViews n(k kVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews d10 = this.f2203a.d();
            if (d10 == null) {
                d10 = this.f2203a.f();
            }
            if (d10 == null) {
                return null;
            }
            return r(d10, true);
        }

        public RemoteViews o(k kVar) {
            if (Build.VERSION.SDK_INT < 24 && this.f2203a.f() != null) {
                return r(this.f2203a.f(), false);
            }
            return null;
        }

        public RemoteViews p(k kVar) {
            RemoteViews remoteViews;
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews h10 = this.f2203a.h();
            if (h10 != null) {
                remoteViews = h10;
            } else {
                remoteViews = this.f2203a.f();
            }
            if (h10 == null) {
                return null;
            }
            return r(remoteViews, true);
        }
    }

    /* compiled from: NotificationCompat */
    public static abstract class h {

        /* renamed from: a  reason: collision with root package name */
        protected e f2203a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f2204b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f2205c;

        /* renamed from: d  reason: collision with root package name */
        boolean f2206d = false;

        /* compiled from: NotificationCompat */
        static class a {
            static void a(RemoteViews remoteViews, int i10, int i11, float f10) {
                remoteViews.setTextViewTextSize(i10, i11, f10);
            }

            static void b(RemoteViews remoteViews, int i10, int i11, int i12, int i13, int i14) {
                remoteViews.setViewPadding(i10, i11, i12, i13, i14);
            }
        }

        /* compiled from: NotificationCompat */
        static class b {
            static void a(RemoteViews remoteViews, int i10, boolean z10) {
                remoteViews.setChronometerCountDown(i10, z10);
            }
        }

        private int e() {
            Resources resources = this.f2203a.f2167a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(y.c.f12849i);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(y.c.f12850j);
            float f10 = (f(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - f10) * ((float) dimensionPixelSize)) + (f10 * ((float) dimensionPixelSize2)));
        }

        private static float f(float f10, float f11, float f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }

        private Bitmap h(int i10, int i11, int i12) {
            return j(IconCompat.m(this.f2203a.f2167a, i10), i11, i12);
        }

        private Bitmap j(IconCompat iconCompat, int i10, int i11) {
            Drawable v10 = iconCompat.v(this.f2203a.f2167a);
            int intrinsicWidth = i11 == 0 ? v10.getIntrinsicWidth() : i11;
            if (i11 == 0) {
                i11 = v10.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i11, Bitmap.Config.ARGB_8888);
            v10.setBounds(0, 0, intrinsicWidth, i11);
            if (i10 != 0) {
                v10.mutate().setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            v10.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        private Bitmap k(int i10, int i11, int i12, int i13) {
            int i14 = y.d.f12859i;
            if (i13 == 0) {
                i13 = 0;
            }
            Bitmap h10 = h(i14, i13, i11);
            Canvas canvas = new Canvas(h10);
            Drawable mutate = this.f2203a.f2167a.getResources().getDrawable(i10).mutate();
            mutate.setFilterBitmap(true);
            int i15 = (i11 - i12) / 2;
            int i16 = i12 + i15;
            mutate.setBounds(i15, i15, i16, i16);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return h10;
        }

        private void m(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(y.e.f12883k0, 8);
            remoteViews.setViewVisibility(y.e.f12879i0, 8);
            remoteViews.setViewVisibility(y.e.f12877h0, 8);
        }

        public void a(Bundle bundle) {
            if (this.f2206d) {
                bundle.putCharSequence("android.summaryText", this.f2205c);
            }
            CharSequence charSequence = this.f2204b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String l10 = l();
            if (l10 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", l10);
            }
        }

        public abstract void b(k kVar);

        /* JADX WARNING: Removed duplicated region for block: B:60:0x017b  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0185  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0191  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x01b3  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01f9  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01fe  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0200  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x020a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.widget.RemoteViews c(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                androidx.core.app.l$e r1 = r0.f2203a
                android.content.Context r1 = r1.f2167a
                android.content.res.Resources r1 = r1.getResources()
                android.widget.RemoteViews r8 = new android.widget.RemoteViews
                androidx.core.app.l$e r2 = r0.f2203a
                android.content.Context r2 = r2.f2167a
                java.lang.String r2 = r2.getPackageName()
                r3 = r18
                r8.<init>(r2, r3)
                androidx.core.app.l$e r2 = r0.f2203a
                int r2 = r2.i()
                r3 = -1
                r9 = 1
                r10 = 0
                if (r2 >= r3) goto L_0x0026
                r2 = 1
                goto L_0x0027
            L_0x0026:
                r2 = 0
            L_0x0027:
                int r11 = android.os.Build.VERSION.SDK_INT
                r4 = 21
                r12 = 16
                if (r11 < r12) goto L_0x0052
                if (r11 >= r4) goto L_0x0052
                java.lang.String r5 = "setBackgroundResource"
                if (r2 == 0) goto L_0x0044
                int r2 = y.e.R
                int r6 = y.d.f12858h
                r8.setInt(r2, r5, r6)
                int r2 = y.e.N
                int r6 = y.d.f12861k
                r8.setInt(r2, r5, r6)
                goto L_0x0052
            L_0x0044:
                int r2 = y.e.R
                int r6 = y.d.f12857g
                r8.setInt(r2, r5, r6)
                int r2 = y.e.N
                int r6 = y.d.f12860j
                r8.setInt(r2, r5, r6)
            L_0x0052:
                androidx.core.app.l$e r2 = r0.f2203a
                androidx.core.graphics.drawable.IconCompat r5 = r2.f2176j
                r13 = 8
                if (r5 == 0) goto L_0x00b7
                if (r11 < r12) goto L_0x006d
                int r2 = y.e.N
                r8.setViewVisibility(r2, r10)
                androidx.core.app.l$e r5 = r0.f2203a
                androidx.core.graphics.drawable.IconCompat r5 = r5.f2176j
                android.graphics.Bitmap r5 = r0.i(r5, r10)
                r8.setImageViewBitmap(r2, r5)
                goto L_0x0072
            L_0x006d:
                int r2 = y.e.N
                r8.setViewVisibility(r2, r13)
            L_0x0072:
                if (r17 == 0) goto L_0x00f8
                androidx.core.app.l$e r2 = r0.f2203a
                android.app.Notification r2 = r2.T
                int r2 = r2.icon
                if (r2 == 0) goto L_0x00f8
                int r2 = y.c.f12845e
                int r2 = r1.getDimensionPixelSize(r2)
                int r5 = y.c.f12846f
                int r5 = r1.getDimensionPixelSize(r5)
                int r5 = r5 * 2
                int r5 = r2 - r5
                if (r11 < r4) goto L_0x00a2
                androidx.core.app.l$e r3 = r0.f2203a
                android.app.Notification r6 = r3.T
                int r6 = r6.icon
                int r3 = r3.e()
                android.graphics.Bitmap r2 = r0.k(r6, r2, r5, r3)
                int r3 = y.e.U
                r8.setImageViewBitmap(r3, r2)
                goto L_0x00b1
            L_0x00a2:
                int r2 = y.e.U
                androidx.core.app.l$e r5 = r0.f2203a
                android.app.Notification r5 = r5.T
                int r5 = r5.icon
                android.graphics.Bitmap r3 = r0.g(r5, r3)
                r8.setImageViewBitmap(r2, r3)
            L_0x00b1:
                int r2 = y.e.U
                r8.setViewVisibility(r2, r10)
                goto L_0x00f8
            L_0x00b7:
                if (r17 == 0) goto L_0x00f8
                android.app.Notification r2 = r2.T
                int r2 = r2.icon
                if (r2 == 0) goto L_0x00f8
                int r2 = y.e.N
                r8.setViewVisibility(r2, r10)
                if (r11 < r4) goto L_0x00eb
                int r3 = y.c.f12844d
                int r3 = r1.getDimensionPixelSize(r3)
                int r5 = y.c.f12843c
                int r5 = r1.getDimensionPixelSize(r5)
                int r3 = r3 - r5
                int r5 = y.c.f12847g
                int r5 = r1.getDimensionPixelSize(r5)
                androidx.core.app.l$e r6 = r0.f2203a
                android.app.Notification r7 = r6.T
                int r7 = r7.icon
                int r6 = r6.e()
                android.graphics.Bitmap r3 = r0.k(r7, r3, r5, r6)
                r8.setImageViewBitmap(r2, r3)
                goto L_0x00f8
            L_0x00eb:
                androidx.core.app.l$e r5 = r0.f2203a
                android.app.Notification r5 = r5.T
                int r5 = r5.icon
                android.graphics.Bitmap r3 = r0.g(r5, r3)
                r8.setImageViewBitmap(r2, r3)
            L_0x00f8:
                androidx.core.app.l$e r2 = r0.f2203a
                java.lang.CharSequence r2 = r2.f2171e
                if (r2 == 0) goto L_0x0103
                int r3 = y.e.f12883k0
                r8.setTextViewText(r3, r2)
            L_0x0103:
                androidx.core.app.l$e r2 = r0.f2203a
                java.lang.CharSequence r2 = r2.f2172f
                if (r2 == 0) goto L_0x0110
                int r3 = y.e.f12877h0
                r8.setTextViewText(r3, r2)
                r2 = 1
                goto L_0x0111
            L_0x0110:
                r2 = 0
            L_0x0111:
                if (r11 >= r4) goto L_0x011b
                androidx.core.app.l$e r3 = r0.f2203a
                androidx.core.graphics.drawable.IconCompat r3 = r3.f2176j
                if (r3 == 0) goto L_0x011b
                r3 = 1
                goto L_0x011c
            L_0x011b:
                r3 = 0
            L_0x011c:
                androidx.core.app.l$e r4 = r0.f2203a
                java.lang.CharSequence r5 = r4.f2177k
                if (r5 == 0) goto L_0x012d
                int r2 = y.e.O
                r8.setTextViewText(r2, r5)
                r8.setViewVisibility(r2, r10)
            L_0x012a:
                r14 = 1
                r15 = 1
                goto L_0x0168
            L_0x012d:
                int r4 = r4.f2178l
                if (r4 <= 0) goto L_0x0161
                int r2 = y.f.f12899a
                int r2 = r1.getInteger(r2)
                androidx.core.app.l$e r3 = r0.f2203a
                int r3 = r3.f2178l
                if (r3 <= r2) goto L_0x0149
                int r2 = y.e.O
                int r3 = y.h.f12910h
                java.lang.String r3 = r1.getString(r3)
                r8.setTextViewText(r2, r3)
                goto L_0x015b
            L_0x0149:
                java.text.NumberFormat r2 = java.text.NumberFormat.getIntegerInstance()
                int r3 = y.e.O
                androidx.core.app.l$e r4 = r0.f2203a
                int r4 = r4.f2178l
                long r4 = (long) r4
                java.lang.String r2 = r2.format(r4)
                r8.setTextViewText(r3, r2)
            L_0x015b:
                int r2 = y.e.O
                r8.setViewVisibility(r2, r10)
                goto L_0x012a
            L_0x0161:
                int r4 = y.e.O
                r8.setViewVisibility(r4, r13)
                r14 = r2
                r15 = r3
            L_0x0168:
                androidx.core.app.l$e r2 = r0.f2203a
                java.lang.CharSequence r2 = r2.f2184r
                if (r2 == 0) goto L_0x018a
                if (r11 < r12) goto L_0x018a
                int r3 = y.e.f12877h0
                r8.setTextViewText(r3, r2)
                androidx.core.app.l$e r2 = r0.f2203a
                java.lang.CharSequence r2 = r2.f2172f
                if (r2 == 0) goto L_0x0185
                int r3 = y.e.f12879i0
                r8.setTextViewText(r3, r2)
                r8.setViewVisibility(r3, r10)
                r2 = 1
                goto L_0x018b
            L_0x0185:
                int r2 = y.e.f12879i0
                r8.setViewVisibility(r2, r13)
            L_0x018a:
                r2 = 0
            L_0x018b:
                if (r2 == 0) goto L_0x01a7
                if (r11 < r12) goto L_0x01a7
                if (r19 == 0) goto L_0x019d
                int r2 = y.c.f12848h
                int r1 = r1.getDimensionPixelSize(r2)
                float r1 = (float) r1
                int r2 = y.e.f12877h0
                androidx.core.app.l.h.a.a(r8, r2, r10, r1)
            L_0x019d:
                int r3 = y.e.P
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r2 = r8
                androidx.core.app.l.h.a.b(r2, r3, r4, r5, r6, r7)
            L_0x01a7:
                androidx.core.app.l$e r1 = r0.f2203a
                long r1 = r1.j()
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L_0x01f9
                androidx.core.app.l$e r1 = r0.f2203a
                boolean r1 = r1.f2181o
                if (r1 == 0) goto L_0x01e8
                if (r11 < r12) goto L_0x01e8
                int r1 = y.e.M
                r8.setViewVisibility(r1, r10)
                androidx.core.app.l$e r2 = r0.f2203a
                long r2 = r2.j()
                long r4 = android.os.SystemClock.elapsedRealtime()
                long r6 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r6
                long r2 = r2 + r4
                java.lang.String r4 = "setBase"
                r8.setLong(r1, r4, r2)
                java.lang.String r2 = "setStarted"
                r8.setBoolean(r1, r2, r9)
                androidx.core.app.l$e r2 = r0.f2203a
                boolean r2 = r2.f2182p
                if (r2 == 0) goto L_0x01fa
                r3 = 24
                if (r11 < r3) goto L_0x01fa
                androidx.core.app.l.h.b.a(r8, r1, r2)
                goto L_0x01fa
            L_0x01e8:
                int r1 = y.e.f12881j0
                r8.setViewVisibility(r1, r10)
                androidx.core.app.l$e r2 = r0.f2203a
                long r2 = r2.j()
                java.lang.String r4 = "setTime"
                r8.setLong(r1, r4, r2)
                goto L_0x01fa
            L_0x01f9:
                r9 = r15
            L_0x01fa:
                int r1 = y.e.V
                if (r9 == 0) goto L_0x0200
                r2 = 0
                goto L_0x0202
            L_0x0200:
                r2 = 8
            L_0x0202:
                r8.setViewVisibility(r1, r2)
                int r1 = y.e.Q
                if (r14 == 0) goto L_0x020a
                goto L_0x020c
            L_0x020a:
                r10 = 8
            L_0x020c:
                r8.setViewVisibility(r1, r10)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.l.h.c(boolean, int, boolean):android.widget.RemoteViews");
        }

        public void d(RemoteViews remoteViews, RemoteViews remoteViews2) {
            m(remoteViews);
            int i10 = y.e.S;
            remoteViews.removeAllViews(i10);
            remoteViews.addView(i10, remoteViews2.clone());
            remoteViews.setViewVisibility(i10, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                a.b(remoteViews, y.e.T, 0, e(), 0, 0);
            }
        }

        public Bitmap g(int i10, int i11) {
            return h(i10, i11, 0);
        }

        /* access modifiers changed from: package-private */
        public Bitmap i(IconCompat iconCompat, int i10) {
            return j(iconCompat, i10, 0);
        }

        /* access modifiers changed from: protected */
        public String l() {
            return null;
        }

        public RemoteViews n(k kVar) {
            return null;
        }

        public RemoteViews o(k kVar) {
            return null;
        }

        public RemoteViews p(k kVar) {
            return null;
        }

        public void q(e eVar) {
            if (this.f2203a != eVar) {
                this.f2203a = eVar;
                if (eVar != null) {
                    eVar.L(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 19) {
            return notification.extras;
        }
        if (i10 >= 16) {
            return n.c(notification);
        }
        return null;
    }

    public static Bitmap b(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(y.c.f12842b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(y.c.f12841a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
    }

    /* compiled from: NotificationCompat */
    public static class e {
        boolean A;
        boolean B;
        boolean C;
        String D;
        Bundle E;
        int F;
        int G;
        Notification H;
        RemoteViews I;
        RemoteViews J;
        RemoteViews K;
        String L;
        int M;
        String N;
        long O;
        int P;
        int Q;
        boolean R;
        d S;
        Notification T;
        boolean U;
        Object V;
        @Deprecated
        public ArrayList<String> W;

        /* renamed from: a  reason: collision with root package name */
        public Context f2167a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f2168b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<p> f2169c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<a> f2170d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f2171e;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f2172f;

        /* renamed from: g  reason: collision with root package name */
        PendingIntent f2173g;

        /* renamed from: h  reason: collision with root package name */
        PendingIntent f2174h;

        /* renamed from: i  reason: collision with root package name */
        RemoteViews f2175i;

        /* renamed from: j  reason: collision with root package name */
        IconCompat f2176j;

        /* renamed from: k  reason: collision with root package name */
        CharSequence f2177k;

        /* renamed from: l  reason: collision with root package name */
        int f2178l;

        /* renamed from: m  reason: collision with root package name */
        int f2179m;

        /* renamed from: n  reason: collision with root package name */
        boolean f2180n;

        /* renamed from: o  reason: collision with root package name */
        boolean f2181o;

        /* renamed from: p  reason: collision with root package name */
        boolean f2182p;

        /* renamed from: q  reason: collision with root package name */
        h f2183q;

        /* renamed from: r  reason: collision with root package name */
        CharSequence f2184r;

        /* renamed from: s  reason: collision with root package name */
        CharSequence f2185s;

        /* renamed from: t  reason: collision with root package name */
        CharSequence[] f2186t;

        /* renamed from: u  reason: collision with root package name */
        int f2187u;

        /* renamed from: v  reason: collision with root package name */
        int f2188v;

        /* renamed from: w  reason: collision with root package name */
        boolean f2189w;

        /* renamed from: x  reason: collision with root package name */
        String f2190x;

        /* renamed from: y  reason: collision with root package name */
        boolean f2191y;

        /* renamed from: z  reason: collision with root package name */
        String f2192z;

        /* compiled from: NotificationCompat */
        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setLegacyStreamType(i10);
            }

            static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        public e(Context context, String str) {
            this.f2168b = new ArrayList<>();
            this.f2169c = new ArrayList<>();
            this.f2170d = new ArrayList<>();
            this.f2180n = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.P = 0;
            this.Q = 0;
            Notification notification = new Notification();
            this.T = notification;
            this.f2167a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.T.audioStreamType = -1;
            this.f2179m = 0;
            this.W = new ArrayList<>();
            this.R = true;
        }

        protected static CharSequence k(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void w(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.T;
                notification.flags = i10 | notification.flags;
                return;
            }
            Notification notification2 = this.T;
            notification2.flags = (~i10) & notification2.flags;
        }

        public e A(boolean z10) {
            this.f2191y = z10;
            return this;
        }

        public e B(Bitmap bitmap) {
            IconCompat iconCompat;
            if (bitmap == null) {
                iconCompat = null;
            } else {
                iconCompat = IconCompat.j(l.b(this.f2167a, bitmap));
            }
            this.f2176j = iconCompat;
            return this;
        }

        public e C(int i10, int i11, int i12) {
            Notification notification = this.T;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & -2);
            return this;
        }

        public e D(boolean z10) {
            this.A = z10;
            return this;
        }

        public e E(int i10) {
            this.f2178l = i10;
            return this;
        }

        public e F(boolean z10) {
            w(2, z10);
            return this;
        }

        public e G(boolean z10) {
            w(8, z10);
            return this;
        }

        public e H(int i10) {
            this.f2179m = i10;
            return this;
        }

        public e I(boolean z10) {
            this.f2180n = z10;
            return this;
        }

        public e J(int i10) {
            this.T.icon = i10;
            return this;
        }

        public e K(Uri uri) {
            Notification notification = this.T;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                AudioAttributes.Builder e10 = a.e(a.c(a.b(), 4), 5);
                this.T.audioAttributes = a.a(e10);
            }
            return this;
        }

        public e L(h hVar) {
            if (this.f2183q != hVar) {
                this.f2183q = hVar;
                if (hVar != null) {
                    hVar.q(this);
                }
            }
            return this;
        }

        public e M(CharSequence charSequence) {
            this.f2184r = k(charSequence);
            return this;
        }

        public e N(CharSequence charSequence) {
            this.T.tickerText = k(charSequence);
            return this;
        }

        public e O(long[] jArr) {
            this.T.vibrate = jArr;
            return this;
        }

        public e P(int i10) {
            this.G = i10;
            return this;
        }

        public e Q(long j10) {
            this.T.when = j10;
            return this;
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f2168b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f2168b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new m(this).c();
        }

        public RemoteViews d() {
            return this.J;
        }

        public int e() {
            return this.F;
        }

        public RemoteViews f() {
            return this.I;
        }

        public Bundle g() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        public RemoteViews h() {
            return this.K;
        }

        public int i() {
            return this.f2179m;
        }

        public long j() {
            if (this.f2180n) {
                return this.T.when;
            }
            return 0;
        }

        public e l(boolean z10) {
            w(16, z10);
            return this;
        }

        public e m(String str) {
            this.L = str;
            return this;
        }

        public e n(int i10) {
            this.F = i10;
            return this;
        }

        public e o(RemoteViews remoteViews) {
            this.T.contentView = remoteViews;
            return this;
        }

        public e p(PendingIntent pendingIntent) {
            this.f2173g = pendingIntent;
            return this;
        }

        public e q(CharSequence charSequence) {
            this.f2172f = k(charSequence);
            return this;
        }

        public e r(CharSequence charSequence) {
            this.f2171e = k(charSequence);
            return this;
        }

        public e s(RemoteViews remoteViews) {
            this.J = remoteViews;
            return this;
        }

        public e t(RemoteViews remoteViews) {
            this.I = remoteViews;
            return this;
        }

        public e u(int i10) {
            Notification notification = this.T;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e v(PendingIntent pendingIntent) {
            this.T.deleteIntent = pendingIntent;
            return this;
        }

        public e x(int i10) {
            this.Q = i10;
            return this;
        }

        public e y(String str) {
            this.f2190x = str;
            return this;
        }

        public e z(int i10) {
            this.P = i10;
            return this;
        }

        @Deprecated
        public e(Context context) {
            this(context, (String) null);
        }
    }
}
