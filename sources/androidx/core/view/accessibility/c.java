package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.f;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.ref.WeakReference;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: AccessibilityNodeInfoCompat */
public class c {

    /* renamed from: d  reason: collision with root package name */
    private static int f2469d;

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityNodeInfo f2470a;

    /* renamed from: b  reason: collision with root package name */
    public int f2471b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f2472c = -1;

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;
        public static final a V;

        /* renamed from: e  reason: collision with root package name */
        public static final a f2473e = new a(1, (CharSequence) null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f2474f = new a(2, (CharSequence) null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f2475g = new a(4, (CharSequence) null);

        /* renamed from: h  reason: collision with root package name */
        public static final a f2476h = new a(8, (CharSequence) null);

        /* renamed from: i  reason: collision with root package name */
        public static final a f2477i = new a(16, (CharSequence) null);

        /* renamed from: j  reason: collision with root package name */
        public static final a f2478j = new a(32, (CharSequence) null);

        /* renamed from: k  reason: collision with root package name */
        public static final a f2479k = new a(64, (CharSequence) null);

        /* renamed from: l  reason: collision with root package name */
        public static final a f2480l = new a(128, (CharSequence) null);

        /* renamed from: m  reason: collision with root package name */
        public static final a f2481m;

        /* renamed from: n  reason: collision with root package name */
        public static final a f2482n;

        /* renamed from: o  reason: collision with root package name */
        public static final a f2483o;

        /* renamed from: p  reason: collision with root package name */
        public static final a f2484p;

        /* renamed from: q  reason: collision with root package name */
        public static final a f2485q = new a(4096, (CharSequence) null);

        /* renamed from: r  reason: collision with root package name */
        public static final a f2486r = new a(8192, (CharSequence) null);

        /* renamed from: s  reason: collision with root package name */
        public static final a f2487s = new a(16384, (CharSequence) null);

        /* renamed from: t  reason: collision with root package name */
        public static final a f2488t = new a(32768, (CharSequence) null);

        /* renamed from: u  reason: collision with root package name */
        public static final a f2489u = new a(NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST, (CharSequence) null);

        /* renamed from: v  reason: collision with root package name */
        public static final a f2490v = new a(131072, (CharSequence) null, f.g.class);

        /* renamed from: w  reason: collision with root package name */
        public static final a f2491w = new a(262144, (CharSequence) null);

        /* renamed from: x  reason: collision with root package name */
        public static final a f2492x = new a(524288, (CharSequence) null);

        /* renamed from: y  reason: collision with root package name */
        public static final a f2493y = new a(1048576, (CharSequence) null);

        /* renamed from: z  reason: collision with root package name */
        public static final a f2494z = new a(2097152, (CharSequence) null, f.h.class);

        /* renamed from: a  reason: collision with root package name */
        final Object f2495a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2496b;

        /* renamed from: c  reason: collision with root package name */
        private final Class<? extends f.a> f2497c;

        /* renamed from: d  reason: collision with root package name */
        protected final f f2498d;

        static {
            Class<f.c> cls = f.c.class;
            Class<f.b> cls2 = f.b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            f2481m = new a(UserVerificationMethods.USER_VERIFY_HANDPRINT, (CharSequence) null, cls2);
            f2482n = new a(512, (CharSequence) null, cls2);
            f2483o = new a(1024, (CharSequence) null, cls);
            f2484p = new a(2048, (CharSequence) null, cls);
            int i10 = Build.VERSION.SDK_INT;
            A = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            B = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (f) null, f.e.class);
            C = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            D = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            E = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            F = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            K = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            L = new a(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (f) null, f.C0040f.class);
            M = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (f) null, f.d.class);
            N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            U = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, 16908376, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            if (i10 >= 34) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
            }
            V = new a(accessibilityAction, 16908382, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        }

        public a(int i10, CharSequence charSequence) {
            this((Object) null, i10, charSequence, (f) null, (Class<? extends f.a>) null);
        }

        public int a() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f2495a).getId();
            }
            return 0;
        }

        public CharSequence b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f2495a).getLabel();
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0024  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0027  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean c(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                androidx.core.view.accessibility.f r0 = r4.f2498d
                r1 = 0
                if (r0 == 0) goto L_0x003f
                r0 = 0
                java.lang.Class<? extends androidx.core.view.accessibility.f$a> r2 = r4.f2497c
                if (r2 == 0) goto L_0x0038
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x001f }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x001f }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x001f }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x001f }
                androidx.core.view.accessibility.f$a r1 = (androidx.core.view.accessibility.f.a) r1     // Catch:{ Exception -> 0x001f }
                r1.a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0038
            L_0x001d:
                r0 = r1
                goto L_0x0020
            L_0x001f:
            L_0x0020:
                java.lang.Class<? extends androidx.core.view.accessibility.f$a> r6 = r4.f2497c
                if (r6 != 0) goto L_0x0027
                java.lang.String r6 = "null"
                goto L_0x002b
            L_0x0027:
                java.lang.String r6 = r6.getName()
            L_0x002b:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed to execute command with argument class ViewCommandArgument: "
                r1.append(r2)
                r1.append(r6)
            L_0x0038:
                androidx.core.view.accessibility.f r6 = r4.f2498d
                boolean r5 = r6.a(r5, r0)
                return r5
            L_0x003f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.accessibility.c.a.c(android.view.View, android.os.Bundle):boolean");
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f2495a;
            if (obj2 == null) {
                if (aVar.f2495a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.f2495a)) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            Object obj = this.f2495a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String h10 = c.h(this.f2496b);
            if (h10.equals("ACTION_UNKNOWN") && b() != null) {
                h10 = b().toString();
            }
            sb.append(h10);
            return sb.toString();
        }

        a(Object obj) {
            this(obj, 0, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        }

        private a(int i10, CharSequence charSequence, Class<? extends f.a> cls) {
            this((Object) null, i10, charSequence, (f) null, cls);
        }

        a(Object obj, int i10, CharSequence charSequence, f fVar, Class<? extends f.a> cls) {
            this.f2496b = i10;
            this.f2498d = fVar;
            if (Build.VERSION.SDK_INT < 21 || obj != null) {
                this.f2495a = obj;
            } else {
                this.f2495a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            }
            this.f2497c = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    private static class b {
        public static g a(int i10, int i11, int i12, int i13, boolean z10) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
        }

        public static Object b(int i10, float f10, float f11, float f12) {
            return AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12);
        }

        public static Bundle c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    /* renamed from: androidx.core.view.accessibility.c$c  reason: collision with other inner class name */
    /* compiled from: AccessibilityNodeInfoCompat */
    private static class C0039c {
        public static Object a(int i10, float f10, float f11, float f12) {
            return new AccessibilityNodeInfo.RangeInfo(i10, f10, f11, f12);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    private static class d {
        public static g a(boolean z10, int i10, int i11, int i12, int i13, boolean z11, String str, String str2) {
            return new g(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z10).setColumnIndex(i10).setRowIndex(i11).setColumnSpan(i12).setRowSpan(i13).setSelected(z11).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static c b(AccessibilityNodeInfo accessibilityNodeInfo, int i10, int i11) {
            return c.h0(accessibilityNodeInfo.getChild(i10, i11));
        }

        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static c f(AccessibilityNodeInfo accessibilityNodeInfo, int i10) {
            return c.h0(accessibilityNodeInfo.getParent(i10));
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setTextSelectable(z10);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    private static class e {
        public static void a(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void f(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z10);
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, long j10) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j10));
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z10) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z10);
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z10);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        final Object f2499a;

        f(Object obj) {
            this.f2499a = obj;
        }

        public static f a(int i10, int i11, boolean z10, int i12) {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 21) {
                return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
            }
            if (i13 >= 19) {
                return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
            }
            return new f((Object) null);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        final Object f2500a;

        g(Object obj) {
            this.f2500a = obj;
        }

        public static g a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 21) {
                return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
            }
            if (i14 >= 19) {
                return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
            }
            return new g((Object) null);
        }
    }

    @Deprecated
    public c(Object obj) {
        this.f2470a = (AccessibilityNodeInfo) obj;
    }

    private boolean C() {
        return !f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int D(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i10).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f2469d;
        f2469d = i11 + 1;
        return i11;
    }

    private void V(View view) {
        SparseArray<WeakReference<ClickableSpan>> w10 = w(view);
        if (w10 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < w10.size(); i10++) {
                if (w10.valueAt(i10).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                w10.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    private void W(int i10, boolean z10) {
        Bundle s10 = s();
        if (s10 != null) {
            int i11 = s10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            s10.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    private void c(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    private void e() {
        if (Build.VERSION.SDK_INT >= 19) {
            b.c(this.f2470a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            b.c(this.f2470a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            b.c(this.f2470a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            b.c(this.f2470a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    private List<Integer> f(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = b.c(this.f2470a).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        b.c(this.f2470a).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public static c g0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new c(accessibilityNodeInfo);
    }

    static String h(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case UserVerificationMethods.USER_VERIFY_HANDPRINT /*256*/:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST /*65536*/:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908382:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    static c h0(Object obj) {
        if (obj != null) {
            return new c(obj);
        }
        return null;
    }

    private boolean j(int i10) {
        Bundle s10 = s();
        if (s10 != null && (s10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10) {
            return true;
        }
        return false;
    }

    public static ClickableSpan[] o(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> u(View view) {
        SparseArray<WeakReference<ClickableSpan>> w10 = w(view);
        if (w10 != null) {
            return w10;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(y.e.X, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> w(View view) {
        return (SparseArray) view.getTag(y.e.X);
    }

    public String A() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return d.g(this.f2470a);
        }
        if (i10 >= 19) {
            return b.c(this.f2470a).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        return null;
    }

    public String B() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f2470a.getViewIdResourceName();
        }
        return null;
    }

    public boolean E() {
        if (Build.VERSION.SDK_INT >= 34) {
            return e.e(this.f2470a);
        }
        return j(64);
    }

    public boolean F() {
        return this.f2470a.isCheckable();
    }

    public boolean G() {
        return this.f2470a.isChecked();
    }

    public boolean H() {
        return this.f2470a.isClickable();
    }

    public boolean I() {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.f2470a.isContextClickable();
        }
        return false;
    }

    public boolean J() {
        return this.f2470a.isEnabled();
    }

    public boolean K() {
        return this.f2470a.isFocusable();
    }

    public boolean L() {
        return this.f2470a.isFocused();
    }

    public boolean M() {
        return j(67108864);
    }

    public boolean N() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f2470a.isImportantForAccessibility();
        }
        return true;
    }

    public boolean O() {
        return this.f2470a.isLongClickable();
    }

    public boolean P() {
        return this.f2470a.isPassword();
    }

    public boolean Q() {
        return this.f2470a.isScrollable();
    }

    public boolean R() {
        return this.f2470a.isSelected();
    }

    public boolean S() {
        if (Build.VERSION.SDK_INT >= 33) {
            return d.h(this.f2470a);
        }
        return j(8388608);
    }

    public boolean T() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f2470a.isVisibleToUser();
        }
        return false;
    }

    public boolean U(int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f2470a.performAction(i10, bundle);
        }
        return false;
    }

    public void X(CharSequence charSequence) {
        this.f2470a.setClassName(charSequence);
    }

    public void Y(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        if (Build.VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f2470a;
            if (obj == null) {
                collectionInfo = null;
            } else {
                collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((f) obj).f2499a;
            }
            accessibilityNodeInfo.setCollectionInfo(collectionInfo);
        }
    }

    public void Z(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        if (Build.VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f2470a;
            if (obj == null) {
                collectionItemInfo = null;
            } else {
                collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((g) obj).f2500a;
            }
            accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
        }
    }

    public void a(int i10) {
        this.f2470a.addAction(i10);
    }

    public void a0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2470a.setHeading(z10);
        } else {
            W(2, z10);
        }
    }

    public void b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2470a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2495a);
        }
    }

    public void b0(CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f2470a.setPaneTitle(charSequence);
        } else if (i10 >= 19) {
            b.c(this.f2470a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void c0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2470a.setScreenReaderFocusable(z10);
        } else {
            W(1, z10);
        }
    }

    public void d(CharSequence charSequence, View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 19 && i10 < 26) {
            e();
            V(view);
            ClickableSpan[] o10 = o(charSequence);
            if (o10 != null && o10.length > 0) {
                s().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", y.e.f12862a);
                SparseArray<WeakReference<ClickableSpan>> u10 = u(view);
                for (int i11 = 0; i11 < o10.length; i11++) {
                    int D = D(o10[i11], u10);
                    u10.put(D, new WeakReference(o10[i11]));
                    c(o10[i11], (Spanned) charSequence, D);
                }
            }
        }
    }

    public void d0(boolean z10) {
        this.f2470a.setScrollable(z10);
    }

    public void e0(CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            C0039c.c(this.f2470a, charSequence);
        } else if (i10 >= 19) {
            b.c(this.f2470a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2470a;
        if (accessibilityNodeInfo == null) {
            if (cVar.f2470a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f2470a)) {
            return false;
        }
        return this.f2472c == cVar.f2472c && this.f2471b == cVar.f2471b;
    }

    public AccessibilityNodeInfo f0() {
        return this.f2470a;
    }

    public List<a> g() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f2470a.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2470a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f2470a.getActions();
    }

    @Deprecated
    public void k(Rect rect) {
        this.f2470a.getBoundsInParent(rect);
    }

    public void l(Rect rect) {
        this.f2470a.getBoundsInScreen(rect);
    }

    public void m(Rect rect) {
        Rect rect2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            e.a(this.f2470a, rect);
        } else if (i10 >= 19 && (rect2 = (Rect) b.c(this.f2470a).getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY")) != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public CharSequence n() {
        return this.f2470a.getClassName();
    }

    public CharSequence p() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return e.b(this.f2470a);
        }
        if (i10 >= 19) {
            return b.c(this.f2470a).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        }
        return null;
    }

    public CharSequence q() {
        return this.f2470a.getContentDescription();
    }

    public CharSequence r() {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f2470a.getError();
        }
        return null;
    }

    public Bundle s() {
        if (Build.VERSION.SDK_INT >= 19) {
            return b.c(this.f2470a);
        }
        return new Bundle();
    }

    public int t() {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f2470a.getMaxTextLength();
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        k(rect);
        sb.append("; boundsInParent: " + rect);
        l(rect);
        sb.append("; boundsInScreen: " + rect);
        m(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(v());
        sb.append("; className: ");
        sb.append(n());
        sb.append("; text: ");
        sb.append(y());
        sb.append("; error: ");
        sb.append(r());
        sb.append("; maxTextLength: ");
        sb.append(t());
        sb.append("; stateDescription: ");
        sb.append(x());
        sb.append("; contentDescription: ");
        sb.append(q());
        sb.append("; tooltipText: ");
        sb.append(z());
        sb.append("; viewIdResName: ");
        sb.append(B());
        sb.append("; uniqueId: ");
        sb.append(A());
        sb.append("; checkable: ");
        sb.append(F());
        sb.append("; checked: ");
        sb.append(G());
        sb.append("; focusable: ");
        sb.append(K());
        sb.append("; focused: ");
        sb.append(L());
        sb.append("; selected: ");
        sb.append(R());
        sb.append("; clickable: ");
        sb.append(H());
        sb.append("; longClickable: ");
        sb.append(O());
        sb.append("; contextClickable: ");
        sb.append(I());
        sb.append("; enabled: ");
        sb.append(J());
        sb.append("; password: ");
        sb.append(P());
        sb.append("; scrollable: " + Q());
        sb.append("; containerTitle: ");
        sb.append(p());
        sb.append("; granularScrollingSupported: ");
        sb.append(M());
        sb.append("; importantForAccessibility: ");
        sb.append(N());
        sb.append("; visible: ");
        sb.append(T());
        sb.append("; isTextSelectable: ");
        sb.append(S());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(E());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<a> g10 = g();
            for (int i10 = 0; i10 < g10.size(); i10++) {
                a aVar = g10.get(i10);
                String h10 = h(aVar.a());
                if (h10.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                    h10 = aVar.b().toString();
                }
                sb.append(h10);
                if (i10 != g10.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int i11 = i();
            while (i11 != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i11);
                i11 &= ~numberOfTrailingZeros;
                sb.append(h(numberOfTrailingZeros));
                if (i11 != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public CharSequence v() {
        return this.f2470a.getPackageName();
    }

    public CharSequence x() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            return C0039c.b(this.f2470a);
        }
        if (i10 >= 19) {
            return b.c(this.f2470a).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        }
        return null;
    }

    public CharSequence y() {
        if (!C()) {
            return this.f2470a.getText();
        }
        List<Integer> f10 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> f11 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> f12 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> f13 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2470a.getText(), 0, this.f2470a.getText().length()));
        for (int i10 = 0; i10 < f10.size(); i10++) {
            spannableString.setSpan(new a(f13.get(i10).intValue(), this, s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), f10.get(i10).intValue(), f11.get(i10).intValue(), f12.get(i10).intValue());
        }
        return spannableString;
    }

    public CharSequence z() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return this.f2470a.getTooltipText();
        }
        if (i10 >= 19) {
            return b.c(this.f2470a).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        return null;
    }

    private c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2470a = accessibilityNodeInfo;
    }
}
