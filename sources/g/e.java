package g;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.a1;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.u0;
import androidx.appcompat.widget.z0;
import androidx.core.content.res.h;
import androidx.core.view.e;
import androidx.core.view.f0;
import androidx.core.view.g0;
import androidx.core.view.h0;
import androidx.core.view.j0;
import androidx.core.view.z;
import androidx.lifecycle.h;
import java.lang.Thread;
import java.util.List;
import l.b;
import l.f;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: AppCompatDelegateImpl */
class e extends d implements e.a, LayoutInflater.Factory2 {

    /* renamed from: h0  reason: collision with root package name */
    private static final androidx.collection.h<String, Integer> f8538h0 = new androidx.collection.h<>();

    /* renamed from: i0  reason: collision with root package name */
    private static final boolean f8539i0;

    /* renamed from: j0  reason: collision with root package name */
    private static final int[] f8540j0 = {16842836};

    /* renamed from: k0  reason: collision with root package name */
    private static final boolean f8541k0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: l0  reason: collision with root package name */
    private static final boolean f8542l0;

    /* renamed from: m0  reason: collision with root package name */
    private static boolean f8543m0 = true;
    private boolean A;
    private boolean B;
    ViewGroup C;
    private TextView D;
    private View E;
    private boolean F;
    private boolean G;
    boolean H;
    boolean I;
    boolean J;
    boolean K;
    boolean L;
    private boolean M;
    private s[] N;
    private s O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    boolean T;
    private int U;
    private int V;
    private boolean W;
    private boolean X;
    private l Y;
    private l Z;

    /* renamed from: a0  reason: collision with root package name */
    boolean f8544a0;

    /* renamed from: b0  reason: collision with root package name */
    int f8545b0;

    /* renamed from: c0  reason: collision with root package name */
    private final Runnable f8546c0;

    /* renamed from: d0  reason: collision with root package name */
    private boolean f8547d0;

    /* renamed from: e0  reason: collision with root package name */
    private Rect f8548e0;

    /* renamed from: f0  reason: collision with root package name */
    private Rect f8549f0;

    /* renamed from: g0  reason: collision with root package name */
    private g f8550g0;

    /* renamed from: k  reason: collision with root package name */
    final Object f8551k;

    /* renamed from: l  reason: collision with root package name */
    final Context f8552l;

    /* renamed from: m  reason: collision with root package name */
    Window f8553m;

    /* renamed from: n  reason: collision with root package name */
    private j f8554n;

    /* renamed from: o  reason: collision with root package name */
    final c f8555o;

    /* renamed from: p  reason: collision with root package name */
    a f8556p;

    /* renamed from: q  reason: collision with root package name */
    MenuInflater f8557q;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f8558r;

    /* renamed from: s  reason: collision with root package name */
    private a0 f8559s;

    /* renamed from: t  reason: collision with root package name */
    private h f8560t;

    /* renamed from: u  reason: collision with root package name */
    private t f8561u;

    /* renamed from: v  reason: collision with root package name */
    l.b f8562v;

    /* renamed from: w  reason: collision with root package name */
    ActionBarContextView f8563w;

    /* renamed from: x  reason: collision with root package name */
    PopupWindow f8564x;

    /* renamed from: y  reason: collision with root package name */
    Runnable f8565y;

    /* renamed from: z  reason: collision with root package name */
    f0 f8566z;

    /* compiled from: AppCompatDelegateImpl */
    class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f8567a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f8567a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            if (message.contains("drawable") || message.contains("Drawable")) {
                return true;
            }
            return false;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f8567a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f8567a.uncaughtException(thread, th);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class b implements Runnable {
        b() {
        }

        public void run() {
            e eVar = e.this;
            if ((eVar.f8545b0 & 1) != 0) {
                eVar.U(0);
            }
            e eVar2 = e.this;
            if ((eVar2.f8545b0 & 4096) != 0) {
                eVar2.U(108);
            }
            e eVar3 = e.this;
            eVar3.f8544a0 = false;
            eVar3.f8545b0 = 0;
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class c implements androidx.core.view.t {
        c() {
        }

        public j0 a(View view, j0 j0Var) {
            int k10 = j0Var.k();
            int L0 = e.this.L0(j0Var, (Rect) null);
            if (k10 != L0) {
                j0Var = j0Var.p(j0Var.i(), L0, j0Var.j(), j0Var.h());
            }
            return z.K(view, j0Var);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class d implements e0.a {
        d() {
        }

        public void a(Rect rect) {
            rect.top = e.this.L0((j0) null, rect);
        }
    }

    /* renamed from: g.e$e  reason: collision with other inner class name */
    /* compiled from: AppCompatDelegateImpl */
    class C0134e implements ContentFrameLayout.a {
        C0134e() {
        }

        public void a() {
        }

        public void onDetachedFromWindow() {
            e.this.S();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class f implements Runnable {

        /* compiled from: AppCompatDelegateImpl */
        class a extends h0 {
            a() {
            }

            public void b(View view) {
                e.this.f8563w.setAlpha(1.0f);
                e.this.f8566z.h((g0) null);
                e.this.f8566z = null;
            }

            public void c(View view) {
                e.this.f8563w.setVisibility(0);
            }
        }

        f() {
        }

        public void run() {
            e eVar = e.this;
            eVar.f8564x.showAtLocation(eVar.f8563w, 55, 0, 0);
            e.this.V();
            if (e.this.D0()) {
                e.this.f8563w.setAlpha(0.0f);
                e eVar2 = e.this;
                eVar2.f8566z = z.b(eVar2.f8563w).b(1.0f);
                e.this.f8566z.h(new a());
                return;
            }
            e.this.f8563w.setAlpha(1.0f);
            e.this.f8563w.setVisibility(0);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class g extends h0 {
        g() {
        }

        public void b(View view) {
            e.this.f8563w.setAlpha(1.0f);
            e.this.f8566z.h((g0) null);
            e.this.f8566z = null;
        }

        public void c(View view) {
            e.this.f8563w.setVisibility(0);
            e.this.f8563w.sendAccessibilityEvent(32);
            if (e.this.f8563w.getParent() instanceof View) {
                z.P((View) e.this.f8563w.getParent());
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private final class h implements j.a {
        h() {
        }

        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            e.this.L(eVar);
        }

        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback f02 = e.this.f0();
            if (f02 == null) {
                return true;
            }
            f02.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class i implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private b.a f8576a;

        /* compiled from: AppCompatDelegateImpl */
        class a extends h0 {
            a() {
            }

            public void b(View view) {
                e.this.f8563w.setVisibility(8);
                e eVar = e.this;
                PopupWindow popupWindow = eVar.f8564x;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (eVar.f8563w.getParent() instanceof View) {
                    z.P((View) e.this.f8563w.getParent());
                }
                e.this.f8563w.removeAllViews();
                e.this.f8566z.h((g0) null);
                e eVar2 = e.this;
                eVar2.f8566z = null;
                z.P(eVar2.C);
            }
        }

        public i(b.a aVar) {
            this.f8576a = aVar;
        }

        public boolean a(l.b bVar, Menu menu) {
            return this.f8576a.a(bVar, menu);
        }

        public boolean b(l.b bVar, Menu menu) {
            z.P(e.this.C);
            return this.f8576a.b(bVar, menu);
        }

        public void c(l.b bVar) {
            this.f8576a.c(bVar);
            e eVar = e.this;
            if (eVar.f8564x != null) {
                eVar.f8553m.getDecorView().removeCallbacks(e.this.f8565y);
            }
            e eVar2 = e.this;
            if (eVar2.f8563w != null) {
                eVar2.V();
                e eVar3 = e.this;
                eVar3.f8566z = z.b(eVar3.f8563w).b(0.0f);
                e.this.f8566z.h(new a());
            }
            e eVar4 = e.this;
            c cVar = eVar4.f8555o;
            if (cVar != null) {
                cVar.d(eVar4.f8562v);
            }
            e eVar5 = e.this;
            eVar5.f8562v = null;
            z.P(eVar5.C);
        }

        public boolean d(l.b bVar, MenuItem menuItem) {
            return this.f8576a.d(bVar, menuItem);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private class k extends l {

        /* renamed from: c  reason: collision with root package name */
        private final PowerManager f8580c;

        k(Context context) {
            super();
            this.f8580c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public int c() {
            if (Build.VERSION.SDK_INT < 21 || !this.f8580c.isPowerSaveMode()) {
                return 1;
            }
            return 2;
        }

        public void d() {
            e.this.F();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    abstract class l {

        /* renamed from: a  reason: collision with root package name */
        private BroadcastReceiver f8582a;

        /* compiled from: AppCompatDelegateImpl */
        class a extends BroadcastReceiver {
            a() {
            }

            public void onReceive(Context context, Intent intent) {
                l.this.d();
            }
        }

        l() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            BroadcastReceiver broadcastReceiver = this.f8582a;
            if (broadcastReceiver != null) {
                try {
                    e.this.f8552l.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f8582a = null;
            }
        }

        /* access modifiers changed from: package-private */
        public abstract IntentFilter b();

        /* access modifiers changed from: package-private */
        public abstract int c();

        /* access modifiers changed from: package-private */
        public abstract void d();

        /* access modifiers changed from: package-private */
        public void e() {
            a();
            IntentFilter b10 = b();
            if (b10 != null && b10.countActions() != 0) {
                if (this.f8582a == null) {
                    this.f8582a = new a();
                }
                e.this.f8552l.registerReceiver(this.f8582a, b10);
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private class m extends l {

        /* renamed from: c  reason: collision with root package name */
        private final j f8585c;

        m(j jVar) {
            super();
            this.f8585c = jVar;
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        public int c() {
            return this.f8585c.d() ? 2 : 1;
        }

        public void d() {
            e.this.F();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    static class n {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.densityDpi;
            int i11 = configuration2.densityDpi;
            if (i10 != i11) {
                configuration3.densityDpi = i11;
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    static class o {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    static class p {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private static class q {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private class r extends ContentFrameLayout {
        public r(Context context) {
            super(context);
        }

        private boolean c(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return e.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            e.this.N(0);
            return true;
        }

        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(h.a.d(getContext(), i10));
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    protected static final class s {

        /* renamed from: a  reason: collision with root package name */
        int f8588a;

        /* renamed from: b  reason: collision with root package name */
        int f8589b;

        /* renamed from: c  reason: collision with root package name */
        int f8590c;

        /* renamed from: d  reason: collision with root package name */
        int f8591d;

        /* renamed from: e  reason: collision with root package name */
        int f8592e;

        /* renamed from: f  reason: collision with root package name */
        int f8593f;

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f8594g;

        /* renamed from: h  reason: collision with root package name */
        View f8595h;

        /* renamed from: i  reason: collision with root package name */
        View f8596i;

        /* renamed from: j  reason: collision with root package name */
        androidx.appcompat.view.menu.e f8597j;

        /* renamed from: k  reason: collision with root package name */
        androidx.appcompat.view.menu.c f8598k;

        /* renamed from: l  reason: collision with root package name */
        Context f8599l;

        /* renamed from: m  reason: collision with root package name */
        boolean f8600m;

        /* renamed from: n  reason: collision with root package name */
        boolean f8601n;

        /* renamed from: o  reason: collision with root package name */
        boolean f8602o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f8603p;

        /* renamed from: q  reason: collision with root package name */
        boolean f8604q = false;

        /* renamed from: r  reason: collision with root package name */
        boolean f8605r;

        /* renamed from: s  reason: collision with root package name */
        Bundle f8606s;

        s(int i10) {
            this.f8588a = i10;
        }

        /* access modifiers changed from: package-private */
        public androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.f8597j == null) {
                return null;
            }
            if (this.f8598k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f8599l, f.g.f8292j);
                this.f8598k = cVar;
                cVar.g(aVar);
                this.f8597j.b(this.f8598k);
            }
            return this.f8598k.i(this.f8594g);
        }

        public boolean b() {
            if (this.f8595h == null) {
                return false;
            }
            if (this.f8596i == null && this.f8598k.a().getCount() <= 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f8597j;
            if (eVar != eVar2) {
                if (eVar2 != null) {
                    eVar2.O(this.f8598k);
                }
                this.f8597j = eVar;
                if (eVar != null && (cVar = this.f8598k) != null) {
                    eVar.b(cVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(f.a.f8184a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(f.a.D, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                newTheme.applyStyle(i11, true);
            } else {
                newTheme.applyStyle(f.i.f8316b, true);
            }
            l.d dVar = new l.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f8599l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(f.j.f8445z0);
            this.f8589b = obtainStyledAttributes.getResourceId(f.j.C0, 0);
            this.f8593f = obtainStyledAttributes.getResourceId(f.j.B0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private final class t implements j.a {
        t() {
        }

        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e D = eVar.D();
            boolean z11 = D != eVar;
            e eVar2 = e.this;
            if (z11) {
                eVar = D;
            }
            s Y = eVar2.Y(eVar);
            if (Y == null) {
                return;
            }
            if (z11) {
                e.this.K(Y.f8588a, Y, D);
                e.this.O(Y, true);
                return;
            }
            e.this.O(Y, z10);
        }

        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback f02;
            if (eVar != eVar.D()) {
                return true;
            }
            e eVar2 = e.this;
            if (!eVar2.H || (f02 = eVar2.f0()) == null || e.this.T) {
                return true;
            }
            f02.onMenuOpened(108, eVar);
            return true;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        boolean z11 = i10 < 21;
        f8539i0 = z11;
        if (i10 >= 17) {
            z10 = true;
        }
        f8542l0 = z10;
        if (z11 && !f8543m0) {
            Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    e(Activity activity, c cVar) {
        this(activity, (Window) null, cVar, activity);
    }

    private boolean A0(s sVar, KeyEvent keyEvent) {
        a0 a0Var;
        a0 a0Var2;
        a0 a0Var3;
        if (this.T) {
            return false;
        }
        if (sVar.f8600m) {
            return true;
        }
        s sVar2 = this.O;
        if (!(sVar2 == null || sVar2 == sVar)) {
            O(sVar2, false);
        }
        Window.Callback f02 = f0();
        if (f02 != null) {
            sVar.f8596i = f02.onCreatePanelView(sVar.f8588a);
        }
        int i10 = sVar.f8588a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (a0Var3 = this.f8559s) != null) {
            a0Var3.c();
        }
        if (sVar.f8596i == null) {
            if (z10) {
                y0();
            }
            androidx.appcompat.view.menu.e eVar = sVar.f8597j;
            if (eVar == null || sVar.f8605r) {
                if (eVar == null && (!j0(sVar) || sVar.f8597j == null)) {
                    return false;
                }
                if (z10 && this.f8559s != null) {
                    if (this.f8560t == null) {
                        this.f8560t = new h();
                    }
                    this.f8559s.a(sVar.f8597j, this.f8560t);
                }
                sVar.f8597j.d0();
                if (!f02.onCreatePanelMenu(sVar.f8588a, sVar.f8597j)) {
                    sVar.c((androidx.appcompat.view.menu.e) null);
                    if (z10 && (a0Var2 = this.f8559s) != null) {
                        a0Var2.a((Menu) null, this.f8560t);
                    }
                    return false;
                }
                sVar.f8605r = false;
            }
            sVar.f8597j.d0();
            Bundle bundle = sVar.f8606s;
            if (bundle != null) {
                sVar.f8597j.P(bundle);
                sVar.f8606s = null;
            }
            if (!f02.onPreparePanel(0, sVar.f8596i, sVar.f8597j)) {
                if (z10 && (a0Var = this.f8559s) != null) {
                    a0Var.a((Menu) null, this.f8560t);
                }
                sVar.f8597j.c0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            sVar.f8603p = z11;
            sVar.f8597j.setQwertyMode(z11);
            sVar.f8597j.c0();
        }
        sVar.f8600m = true;
        sVar.f8601n = false;
        this.O = sVar;
        return true;
    }

    private void B0(boolean z10) {
        a0 a0Var = this.f8559s;
        if (a0Var == null || !a0Var.d() || (ViewConfiguration.get(this.f8552l).hasPermanentMenuKey() && !this.f8559s.e())) {
            s d02 = d0(0, true);
            d02.f8604q = true;
            O(d02, false);
            x0(d02, (KeyEvent) null);
            return;
        }
        Window.Callback f02 = f0();
        if (this.f8559s.b() && z10) {
            this.f8559s.f();
            if (!this.T) {
                f02.onPanelClosed(108, d0(0, true).f8597j);
            }
        } else if (f02 != null && !this.T) {
            if (this.f8544a0 && (this.f8545b0 & 1) != 0) {
                this.f8553m.getDecorView().removeCallbacks(this.f8546c0);
                this.f8546c0.run();
            }
            s d03 = d0(0, true);
            androidx.appcompat.view.menu.e eVar = d03.f8597j;
            if (eVar != null && !d03.f8605r && f02.onPreparePanel(0, d03.f8596i, eVar)) {
                f02.onMenuOpened(108, d03.f8597j);
                this.f8559s.g();
            }
        }
    }

    private int C0(int i10) {
        if (i10 == 8) {
            return 108;
        }
        if (i10 == 9) {
            return 109;
        }
        return i10;
    }

    private boolean E0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f8553m.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || z.E((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean G(boolean z10) {
        if (this.T) {
            return false;
        }
        int J2 = J();
        boolean J0 = J0(n0(this.f8552l, J2), z10);
        if (J2 == 0) {
            c0(this.f8552l).e();
        } else {
            l lVar = this.Y;
            if (lVar != null) {
                lVar.a();
            }
        }
        if (J2 == 3) {
            b0(this.f8552l).e();
        } else {
            l lVar2 = this.Z;
            if (lVar2 != null) {
                lVar2.a();
            }
        }
        return J0;
    }

    private void H() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.C.findViewById(16908290);
        View decorView = this.f8553m.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f8552l.obtainStyledAttributes(f.j.f8445z0);
        obtainStyledAttributes.getValue(f.j.L0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(f.j.M0, contentFrameLayout.getMinWidthMinor());
        int i10 = f.j.J0;
        if (obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = f.j.K0;
        if (obtainStyledAttributes.hasValue(i11)) {
            obtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = f.j.H0;
        if (obtainStyledAttributes.hasValue(i12)) {
            obtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = f.j.I0;
        if (obtainStyledAttributes.hasValue(i13)) {
            obtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void H0() {
        if (this.B) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void I(Window window) {
        if (this.f8553m == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof j)) {
                j jVar = new j(callback);
                this.f8554n = jVar;
                window.setCallback(jVar);
                u0 t10 = u0.t(this.f8552l, (AttributeSet) null, f8540j0);
                Drawable g10 = t10.g(0);
                if (g10 != null) {
                    window.setBackgroundDrawable(g10);
                }
                t10.v();
                this.f8553m = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private b I0() {
        Context context = this.f8552l;
        while (context != null) {
            if (!(context instanceof b)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (b) context;
            }
        }
        return null;
    }

    private int J() {
        int i10 = this.U;
        return i10 != -100 ? i10 : d.j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean J0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f8552l
            r1 = 0
            android.content.res.Configuration r0 = r6.P(r0, r7, r1)
            boolean r2 = r6.l0()
            android.content.Context r3 = r6.f8552l
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L_0x0047
            if (r8 == 0) goto L_0x0047
            if (r2 != 0) goto L_0x0047
            boolean r8 = r6.Q
            if (r8 == 0) goto L_0x0047
            boolean r8 = f8541k0
            if (r8 != 0) goto L_0x0030
            boolean r8 = r6.R
            if (r8 == 0) goto L_0x0047
        L_0x0030:
            java.lang.Object r8 = r6.f8551k
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0047
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L_0x0047
            java.lang.Object r8 = r6.f8551k
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.b.v(r8)
            r8 = 1
            goto L_0x0048
        L_0x0047:
            r8 = 0
        L_0x0048:
            if (r8 != 0) goto L_0x0050
            if (r3 == r0) goto L_0x0050
            r6.K0(r0, r2, r1)
            goto L_0x0051
        L_0x0050:
            r4 = r8
        L_0x0051:
            if (r4 == 0) goto L_0x005e
            java.lang.Object r8 = r6.f8551k
            boolean r0 = r8 instanceof g.b
            if (r0 == 0) goto L_0x005e
            g.b r8 = (g.b) r8
            r8.j(r7)
        L_0x005e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.J0(int, boolean):boolean");
    }

    private void K0(int i10, boolean z10, Configuration configuration) {
        Resources resources = this.f8552l.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            h.a(resources);
        }
        int i12 = this.V;
        if (i12 != 0) {
            this.f8552l.setTheme(i12);
            if (i11 >= 23) {
                this.f8552l.getTheme().applyStyle(this.V, true);
            }
        }
        if (z10) {
            Object obj = this.f8551k;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.m) {
                    if (((androidx.lifecycle.m) activity).getLifecycle().b().d(h.b.STARTED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.S) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    private void M() {
        l lVar = this.Y;
        if (lVar != null) {
            lVar.a();
        }
        l lVar2 = this.Z;
        if (lVar2 != null) {
            lVar2.a();
        }
    }

    private void M0(View view) {
        int i10;
        if ((z.z(view) & 8192) != 0) {
            i10 = androidx.core.content.a.d(this.f8552l, f.c.f8212b);
        } else {
            i10 = androidx.core.content.a.d(this.f8552l, f.c.f8211a);
        }
        view.setBackgroundColor(i10);
    }

    private Configuration P(Context context, int i10, Configuration configuration) {
        int i11 = i10 != 1 ? i10 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & -49);
        return configuration2;
    }

    private ViewGroup Q() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f8552l.obtainStyledAttributes(f.j.f8445z0);
        int i10 = f.j.E0;
        if (obtainStyledAttributes.hasValue(i10)) {
            if (obtainStyledAttributes.getBoolean(f.j.N0, false)) {
                z(1);
            } else if (obtainStyledAttributes.getBoolean(i10, false)) {
                z(108);
            }
            if (obtainStyledAttributes.getBoolean(f.j.F0, false)) {
                z(109);
            }
            if (obtainStyledAttributes.getBoolean(f.j.G0, false)) {
                z(10);
            }
            this.K = obtainStyledAttributes.getBoolean(f.j.A0, false);
            obtainStyledAttributes.recycle();
            X();
            this.f8553m.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f8552l);
            if (this.L) {
                viewGroup = this.J ? (ViewGroup) from.inflate(f.g.f8297o, (ViewGroup) null) : (ViewGroup) from.inflate(f.g.f8296n, (ViewGroup) null);
            } else if (this.K) {
                viewGroup = (ViewGroup) from.inflate(f.g.f8288f, (ViewGroup) null);
                this.I = false;
                this.H = false;
            } else if (this.H) {
                TypedValue typedValue = new TypedValue();
                this.f8552l.getTheme().resolveAttribute(f.a.f8189f, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new l.d(this.f8552l, typedValue.resourceId);
                } else {
                    context = this.f8552l;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(f.g.f8298p, (ViewGroup) null);
                a0 a0Var = (a0) viewGroup.findViewById(f.f.f8272p);
                this.f8559s = a0Var;
                a0Var.setWindowCallback(f0());
                if (this.I) {
                    this.f8559s.h(109);
                }
                if (this.F) {
                    this.f8559s.h(2);
                }
                if (this.G) {
                    this.f8559s.h(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    z.c0(viewGroup, new c());
                } else if (viewGroup instanceof e0) {
                    ((e0) viewGroup).setOnFitSystemWindowsListener(new d());
                }
                if (this.f8559s == null) {
                    this.D = (TextView) viewGroup.findViewById(f.f.M);
                }
                a1.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(f.f.f8258b);
                ViewGroup viewGroup2 = (ViewGroup) this.f8553m.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f8553m.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0134e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.H + ", windowActionBarOverlay: " + this.I + ", android:windowIsFloating: " + this.K + ", windowActionModeOverlay: " + this.J + ", windowNoTitle: " + this.L + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void W() {
        if (!this.B) {
            this.C = Q();
            CharSequence e02 = e0();
            if (!TextUtils.isEmpty(e02)) {
                a0 a0Var = this.f8559s;
                if (a0Var != null) {
                    a0Var.setWindowTitle(e02);
                } else if (y0() != null) {
                    y0().s(e02);
                } else {
                    TextView textView = this.D;
                    if (textView != null) {
                        textView.setText(e02);
                    }
                }
            }
            H();
            w0(this.C);
            this.B = true;
            s d02 = d0(0, false);
            if (this.T) {
                return;
            }
            if (d02 == null || d02.f8597j == null) {
                k0(108);
            }
        }
    }

    private void X() {
        if (this.f8553m == null) {
            Object obj = this.f8551k;
            if (obj instanceof Activity) {
                I(((Activity) obj).getWindow());
            }
        }
        if (this.f8553m == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration Z(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                o.a(configuration, configuration2, configuration3);
            } else if (!androidx.core.util.c.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & 192;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 192)) {
                configuration3.screenLayout |= i30 & 192;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                p.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            if (i14 >= 17) {
                n.a(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    private l b0(Context context) {
        if (this.Z == null) {
            this.Z = new k(context);
        }
        return this.Z;
    }

    private l c0(Context context) {
        if (this.Y == null) {
            this.Y = new m(j.a(context));
        }
        return this.Y;
    }

    private void g0() {
        W();
        if (this.H && this.f8556p == null) {
            Object obj = this.f8551k;
            if (obj instanceof Activity) {
                this.f8556p = new k((Activity) this.f8551k, this.I);
            } else if (obj instanceof Dialog) {
                this.f8556p = new k((Dialog) this.f8551k);
            }
            a aVar = this.f8556p;
            if (aVar != null) {
                aVar.q(this.f8547d0);
            }
        }
    }

    private boolean h0(s sVar) {
        View view = sVar.f8596i;
        if (view != null) {
            sVar.f8595h = view;
            return true;
        } else if (sVar.f8597j == null) {
            return false;
        } else {
            if (this.f8561u == null) {
                this.f8561u = new t();
            }
            View view2 = (View) sVar.a(this.f8561u);
            sVar.f8595h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    private boolean i0(s sVar) {
        sVar.d(a0());
        sVar.f8594g = new r(sVar.f8599l);
        sVar.f8590c = 81;
        return true;
    }

    private boolean j0(s sVar) {
        Context context = this.f8552l;
        int i10 = sVar.f8588a;
        if ((i10 == 0 || i10 == 108) && this.f8559s != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(f.a.f8189f, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(f.a.f8190g, typedValue, true);
            } else {
                theme.resolveAttribute(f.a.f8190g, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                l.d dVar = new l.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.R(this);
        sVar.c(eVar);
        return true;
    }

    private void k0(int i10) {
        this.f8545b0 = (1 << i10) | this.f8545b0;
        if (!this.f8544a0) {
            z.N(this.f8553m.getDecorView(), this.f8546c0);
            this.f8544a0 = true;
        }
    }

    private boolean l0() {
        if (!this.X && (this.f8551k instanceof Activity)) {
            PackageManager packageManager = this.f8552l.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i10 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f8552l, this.f8551k.getClass()), i10 >= 29 ? 269221888 : i10 >= 24 ? 786432 : 0);
                this.W = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException unused) {
                this.W = false;
            }
        }
        this.X = true;
        return this.W;
    }

    private boolean q0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        s d02 = d0(i10, true);
        if (!d02.f8602o) {
            return A0(d02, keyEvent);
        }
        return false;
    }

    private boolean t0(int i10, KeyEvent keyEvent) {
        AudioManager audioManager;
        boolean z10;
        a0 a0Var;
        if (this.f8562v != null) {
            return false;
        }
        boolean z11 = true;
        s d02 = d0(i10, true);
        if (i10 != 0 || (a0Var = this.f8559s) == null || !a0Var.d() || ViewConfiguration.get(this.f8552l).hasPermanentMenuKey()) {
            boolean z12 = d02.f8602o;
            if (z12 || d02.f8601n) {
                O(d02, true);
                z11 = z12;
                if (z11 && (audioManager = (AudioManager) this.f8552l.getApplicationContext().getSystemService("audio")) != null) {
                    audioManager.playSoundEffect(0);
                }
                return z11;
            } else if (d02.f8600m) {
                if (d02.f8605r) {
                    d02.f8600m = false;
                    z10 = A0(d02, keyEvent);
                } else {
                    z10 = true;
                }
                if (z10) {
                    x0(d02, keyEvent);
                    audioManager.playSoundEffect(0);
                    return z11;
                }
            }
        } else {
            if (this.f8559s.b()) {
                z11 = this.f8559s.f();
            } else if (!this.T && A0(d02, keyEvent)) {
                z11 = this.f8559s.g();
            }
            audioManager.playSoundEffect(0);
            return z11;
        }
        z11 = false;
        audioManager.playSoundEffect(0);
        return z11;
    }

    private void x0(s sVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (!sVar.f8602o && !this.T) {
            if (sVar.f8588a == 0) {
                if ((this.f8552l.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback f02 = f0();
            if (f02 == null || f02.onMenuOpened(sVar.f8588a, sVar.f8597j)) {
                WindowManager windowManager = (WindowManager) this.f8552l.getSystemService("window");
                if (windowManager != null && A0(sVar, keyEvent)) {
                    ViewGroup viewGroup = sVar.f8594g;
                    if (viewGroup == null || sVar.f8604q) {
                        if (viewGroup == null) {
                            if (!i0(sVar) || sVar.f8594g == null) {
                                return;
                            }
                        } else if (sVar.f8604q && viewGroup.getChildCount() > 0) {
                            sVar.f8594g.removeAllViews();
                        }
                        if (!h0(sVar) || !sVar.b()) {
                            sVar.f8604q = true;
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams2 = sVar.f8595h.getLayoutParams();
                        if (layoutParams2 == null) {
                            layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        sVar.f8594g.setBackgroundResource(sVar.f8589b);
                        ViewParent parent = sVar.f8595h.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(sVar.f8595h);
                        }
                        sVar.f8594g.addView(sVar.f8595h, layoutParams2);
                        if (!sVar.f8595h.hasFocus()) {
                            sVar.f8595h.requestFocus();
                        }
                    } else {
                        View view = sVar.f8596i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i10 = -1;
                            sVar.f8601n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i10, -2, sVar.f8591d, sVar.f8592e, 1002, 8519680, -3);
                            layoutParams3.gravity = sVar.f8590c;
                            layoutParams3.windowAnimations = sVar.f8593f;
                            windowManager.addView(sVar.f8594g, layoutParams3);
                            sVar.f8602o = true;
                            return;
                        }
                    }
                    i10 = -2;
                    sVar.f8601n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i10, -2, sVar.f8591d, sVar.f8592e, 1002, 8519680, -3);
                    layoutParams32.gravity = sVar.f8590c;
                    layoutParams32.windowAnimations = sVar.f8593f;
                    windowManager.addView(sVar.f8594g, layoutParams32);
                    sVar.f8602o = true;
                    return;
                }
                return;
            }
            O(sVar, true);
        }
    }

    private boolean z0(s sVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((sVar.f8600m || A0(sVar, keyEvent)) && (eVar = sVar.f8597j) != null) {
            z10 = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.f8559s == null) {
            O(sVar, true);
        }
        return z10;
    }

    public void A(int i10) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f8552l).inflate(i10, viewGroup);
        this.f8554n.a().onContentChanged();
    }

    public void B(View view) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f8554n.a().onContentChanged();
    }

    public void C(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f8554n.a().onContentChanged();
    }

    public void D(int i10) {
        this.V = i10;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.C;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean D0() {
        /*
            r1 = this;
            boolean r0 = r1.B
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.C
            if (r0 == 0) goto L_0x0010
            boolean r0 = androidx.core.view.z.F(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.D0():boolean");
    }

    public final void E(CharSequence charSequence) {
        this.f8558r = charSequence;
        a0 a0Var = this.f8559s;
        if (a0Var != null) {
            a0Var.setWindowTitle(charSequence);
        } else if (y0() != null) {
            y0().s(charSequence);
        } else {
            TextView textView = this.D;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public boolean F() {
        return G(true);
    }

    public l.b F0(b.a aVar) {
        c cVar;
        if (aVar != null) {
            l.b bVar = this.f8562v;
            if (bVar != null) {
                bVar.c();
            }
            i iVar = new i(aVar);
            a m10 = m();
            if (m10 != null) {
                l.b t10 = m10.t(iVar);
                this.f8562v = t10;
                if (!(t10 == null || (cVar = this.f8555o) == null)) {
                    cVar.a(t10);
                }
            }
            if (this.f8562v == null) {
                this.f8562v = G0(iVar);
            }
            return this.f8562v;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l.b G0(l.b.a r8) {
        /*
            r7 = this;
            r7.V()
            l.b r0 = r7.f8562v
            if (r0 == 0) goto L_0x000a
            r0.c()
        L_0x000a:
            boolean r0 = r8 instanceof g.e.i
            if (r0 != 0) goto L_0x0014
            g.e$i r0 = new g.e$i
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            g.c r0 = r7.f8555o
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.T
            if (r2 != 0) goto L_0x0022
            l.b r0 = r0.c(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f8562v = r0
            goto L_0x0162
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f8563w
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.K
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f8552l
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = f.a.f8189f
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f8552l
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            l.d r4 = new l.d
            android.content.Context r6 = r7.f8552l
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f8552l
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f8563w = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = f.a.f8192i
            r5.<init>(r4, r1, r6)
            r7.f8564x = r5
            r6 = 2
            androidx.core.widget.h.b(r5, r6)
            android.widget.PopupWindow r5 = r7.f8564x
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f8563w
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f8564x
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = f.a.f8185b
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f8563w
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f8564x
            r4 = -2
            r0.setHeight(r4)
            g.e$f r0 = new g.e$f
            r0.<init>()
            r7.f8565y = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.C
            int r4 = f.f.f8264h
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.a0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f8563w = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f8563w
            if (r0 == 0) goto L_0x0162
            r7.V()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f8563w
            r0.k()
            l.e r0 = new l.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f8563w
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f8563w
            android.widget.PopupWindow r6 = r7.f8564x
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = 0
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.e()
            boolean r8 = r8.a(r0, r3)
            if (r8 == 0) goto L_0x0160
            r0.k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f8563w
            r8.h(r0)
            r7.f8562v = r0
            boolean r8 = r7.D0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f8563w
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f8563w
            androidx.core.view.f0 r8 = androidx.core.view.z.b(r8)
            androidx.core.view.f0 r8 = r8.b(r0)
            r7.f8566z = r8
            g.e$g r0 = new g.e$g
            r0.<init>()
            r8.h(r0)
            goto L_0x0150
        L_0x012a:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f8563w
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f8563w
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f8563w
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f8563w
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0150
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f8563w
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            androidx.core.view.z.P(r8)
        L_0x0150:
            android.widget.PopupWindow r8 = r7.f8564x
            if (r8 == 0) goto L_0x0162
            android.view.Window r8 = r7.f8553m
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f8565y
            r8.post(r0)
            goto L_0x0162
        L_0x0160:
            r7.f8562v = r1
        L_0x0162:
            l.b r8 = r7.f8562v
            if (r8 == 0) goto L_0x016d
            g.c r0 = r7.f8555o
            if (r0 == 0) goto L_0x016d
            r0.a(r8)
        L_0x016d:
            l.b r8 = r7.f8562v
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.G0(l.b$a):l.b");
    }

    /* access modifiers changed from: package-private */
    public void K(int i10, s sVar, Menu menu) {
        if (menu == null) {
            if (sVar == null && i10 >= 0) {
                s[] sVarArr = this.N;
                if (i10 < sVarArr.length) {
                    sVar = sVarArr[i10];
                }
            }
            if (sVar != null) {
                menu = sVar.f8597j;
            }
        }
        if ((sVar == null || sVar.f8602o) && !this.T) {
            this.f8554n.a().onPanelClosed(i10, menu);
        }
    }

    /* access modifiers changed from: package-private */
    public void L(androidx.appcompat.view.menu.e eVar) {
        if (!this.M) {
            this.M = true;
            this.f8559s.i();
            Window.Callback f02 = f0();
            if (f02 != null && !this.T) {
                f02.onPanelClosed(108, eVar);
            }
            this.M = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final int L0(j0 j0Var, Rect rect) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i13;
        int i14 = 0;
        if (j0Var != null) {
            i10 = j0Var.k();
        } else {
            i10 = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f8563w;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f8563w.getLayoutParams();
            boolean z12 = true;
            if (this.f8563w.isShown()) {
                if (this.f8548e0 == null) {
                    this.f8548e0 = new Rect();
                    this.f8549f0 = new Rect();
                }
                Rect rect2 = this.f8548e0;
                Rect rect3 = this.f8549f0;
                if (j0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(j0Var.i(), j0Var.k(), j0Var.j(), j0Var.h());
                }
                a1.a(this.C, rect2, rect3);
                int i15 = rect2.top;
                int i16 = rect2.left;
                int i17 = rect2.right;
                j0 w10 = z.w(this.C);
                if (w10 == null) {
                    i11 = 0;
                } else {
                    i11 = w10.i();
                }
                if (w10 == null) {
                    i12 = 0;
                } else {
                    i12 = w10.j();
                }
                if (marginLayoutParams2.topMargin == i15 && marginLayoutParams2.leftMargin == i16 && marginLayoutParams2.rightMargin == i17) {
                    z11 = false;
                } else {
                    marginLayoutParams2.topMargin = i15;
                    marginLayoutParams2.leftMargin = i16;
                    marginLayoutParams2.rightMargin = i17;
                    z11 = true;
                }
                if (i15 <= 0 || this.E != null) {
                    View view = this.E;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i13 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12))) {
                        marginLayoutParams.height = i13;
                        marginLayoutParams.leftMargin = i11;
                        marginLayoutParams.rightMargin = i12;
                        this.E.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f8552l);
                    this.E = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i11;
                    layoutParams.rightMargin = i12;
                    this.C.addView(this.E, -1, layoutParams);
                }
                View view3 = this.E;
                if (view3 == null) {
                    z12 = false;
                }
                if (z12 && view3.getVisibility() != 0) {
                    M0(this.E);
                }
                if (!this.J && z12) {
                    i10 = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                this.f8563w.setLayoutParams(marginLayoutParams2);
            }
        }
        View view4 = this.E;
        if (view4 != null) {
            if (!z10) {
                i14 = 8;
            }
            view4.setVisibility(i14);
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public void N(int i10) {
        O(d0(i10, true), true);
    }

    /* access modifiers changed from: package-private */
    public void O(s sVar, boolean z10) {
        ViewGroup viewGroup;
        a0 a0Var;
        if (!z10 || sVar.f8588a != 0 || (a0Var = this.f8559s) == null || !a0Var.b()) {
            WindowManager windowManager = (WindowManager) this.f8552l.getSystemService("window");
            if (!(windowManager == null || !sVar.f8602o || (viewGroup = sVar.f8594g) == null)) {
                windowManager.removeView(viewGroup);
                if (z10) {
                    K(sVar.f8588a, sVar, (Menu) null);
                }
            }
            sVar.f8600m = false;
            sVar.f8601n = false;
            sVar.f8602o = false;
            sVar.f8595h = null;
            sVar.f8604q = true;
            if (this.O == sVar) {
                this.O = null;
                return;
            }
            return;
        }
        L(sVar.f8597j);
    }

    public View R(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        boolean z11 = false;
        if (this.f8550g0 == null) {
            String string = this.f8552l.obtainStyledAttributes(f.j.f8445z0).getString(f.j.D0);
            if (string == null) {
                this.f8550g0 = new g();
            } else {
                try {
                    this.f8550g0 = (g) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    this.f8550g0 = new g();
                }
            }
        }
        boolean z12 = f8539i0;
        if (z12) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z11 = E0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z11 = true;
            }
            z10 = z11;
        } else {
            z10 = false;
        }
        return this.f8550g0.q(view, str, context, attributeSet, z10, z12, true, z0.b());
    }

    /* access modifiers changed from: package-private */
    public void S() {
        androidx.appcompat.view.menu.e eVar;
        a0 a0Var = this.f8559s;
        if (a0Var != null) {
            a0Var.i();
        }
        if (this.f8564x != null) {
            this.f8553m.getDecorView().removeCallbacks(this.f8565y);
            if (this.f8564x.isShowing()) {
                try {
                    this.f8564x.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f8564x = null;
        }
        V();
        s d02 = d0(0, false);
        if (d02 != null && (eVar = d02.f8597j) != null) {
            eVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean T(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f8551k;
        boolean z10 = true;
        if (((obj instanceof e.a) || (obj instanceof f)) && (decorView = this.f8553m.getDecorView()) != null && androidx.core.view.e.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f8554n.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z10 = false;
        }
        return z10 ? p0(keyCode, keyEvent) : s0(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    public void U(int i10) {
        s d02;
        s d03 = d0(i10, true);
        if (d03.f8597j != null) {
            Bundle bundle = new Bundle();
            d03.f8597j.Q(bundle);
            if (bundle.size() > 0) {
                d03.f8606s = bundle;
            }
            d03.f8597j.d0();
            d03.f8597j.clear();
        }
        d03.f8605r = true;
        d03.f8604q = true;
        if ((i10 == 108 || i10 == 0) && this.f8559s != null && (d02 = d0(0, false)) != null) {
            d02.f8600m = false;
            A0(d02, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void V() {
        f0 f0Var = this.f8566z;
        if (f0Var != null) {
            f0Var.c();
        }
    }

    /* access modifiers changed from: package-private */
    public s Y(Menu menu) {
        s[] sVarArr = this.N;
        int length = sVarArr != null ? sVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            s sVar = sVarArr[i10];
            if (sVar != null && sVar.f8597j == menu) {
                return sVar;
            }
        }
        return null;
    }

    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        s Y2;
        Window.Callback f02 = f0();
        if (f02 == null || this.T || (Y2 = Y(eVar.D())) == null) {
            return false;
        }
        return f02.onMenuItemSelected(Y2.f8588a, menuItem);
    }

    /* access modifiers changed from: package-private */
    public final Context a0() {
        a m10 = m();
        Context j10 = m10 != null ? m10.j() : null;
        return j10 == null ? this.f8552l : j10;
    }

    public void b(androidx.appcompat.view.menu.e eVar) {
        B0(true);
    }

    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ((ViewGroup) this.C.findViewById(16908290)).addView(view, layoutParams);
        this.f8554n.a().onContentChanged();
    }

    /* access modifiers changed from: protected */
    public s d0(int i10, boolean z10) {
        s[] sVarArr = this.N;
        if (sVarArr == null || sVarArr.length <= i10) {
            s[] sVarArr2 = new s[(i10 + 1)];
            if (sVarArr != null) {
                System.arraycopy(sVarArr, 0, sVarArr2, 0, sVarArr.length);
            }
            this.N = sVarArr2;
            sVarArr = sVarArr2;
        }
        s sVar = sVarArr[i10];
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(i10);
        sVarArr[i10] = sVar2;
        return sVar2;
    }

    /* access modifiers changed from: package-private */
    public final CharSequence e0() {
        Object obj = this.f8551k;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f8558r;
    }

    public Context f(Context context) {
        boolean z10 = true;
        this.Q = true;
        int n02 = n0(context, J());
        Configuration configuration = null;
        if (f8542l0 && (context instanceof ContextThemeWrapper)) {
            try {
                q.a((ContextThemeWrapper) context, P(context, n02, (Configuration) null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof l.d) {
            try {
                ((l.d) context).a(P(context, n02, (Configuration) null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f8541k0) {
            return super.f(context);
        }
        try {
            Configuration configuration2 = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
            Configuration configuration3 = context.getResources().getConfiguration();
            if (!configuration2.equals(configuration3)) {
                configuration = Z(configuration2, configuration3);
            }
            Configuration P2 = P(context, n02, configuration);
            l.d dVar = new l.d(context, f.i.f8317c);
            dVar.a(P2);
            boolean z11 = false;
            try {
                if (context.getTheme() == null) {
                    z10 = false;
                }
                z11 = z10;
            } catch (NullPointerException unused3) {
            }
            if (z11) {
                h.f.a(dVar.getTheme());
            }
            return super.f(dVar);
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("Application failed to obtain resources from itself", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final Window.Callback f0() {
        return this.f8553m.getCallback();
    }

    public <T extends View> T i(int i10) {
        W();
        return this.f8553m.findViewById(i10);
    }

    public int k() {
        return this.U;
    }

    public MenuInflater l() {
        if (this.f8557q == null) {
            g0();
            a aVar = this.f8556p;
            this.f8557q = new l.g(aVar != null ? aVar.j() : this.f8552l);
        }
        return this.f8557q;
    }

    public a m() {
        g0();
        return this.f8556p;
    }

    public boolean m0() {
        return this.A;
    }

    public void n() {
        LayoutInflater from = LayoutInflater.from(this.f8552l);
        if (from.getFactory() == null) {
            androidx.core.view.f.b(from, this);
        } else {
            boolean z10 = from.getFactory2() instanceof e;
        }
    }

    /* access modifiers changed from: package-private */
    public int n0(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (!(i10 == 1 || i10 == 2)) {
                    if (i10 == 3) {
                        return b0(context).c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() != 0) {
                return c0(context).c();
            } else {
                return -1;
            }
        }
        return i10;
    }

    public void o() {
        a m10 = m();
        if (m10 == null || !m10.k()) {
            k0(0);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean o0() {
        l.b bVar = this.f8562v;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        a m10 = m();
        if (m10 == null || !m10.g()) {
            return false;
        }
        return true;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return R(view, str, context, attributeSet);
    }

    public void p(Configuration configuration) {
        a m10;
        if (this.H && this.B && (m10 = m()) != null) {
            m10.l(configuration);
        }
        androidx.appcompat.widget.i.b().g(this.f8552l);
        G(false);
    }

    /* access modifiers changed from: package-private */
    public boolean p0(int i10, KeyEvent keyEvent) {
        boolean z10 = true;
        if (i10 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z10 = false;
            }
            this.P = z10;
        } else if (i10 == 82) {
            q0(0, keyEvent);
            return true;
        }
        return false;
    }

    public void q(Bundle bundle) {
        this.Q = true;
        G(false);
        X();
        Object obj = this.f8551k;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.j.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                a y02 = y0();
                if (y02 == null) {
                    this.f8547d0 = true;
                } else {
                    y02.q(true);
                }
            }
            d.c(this);
        }
        this.R = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void r() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f8551k
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            g.d.x(r3)
        L_0x0009:
            boolean r0 = r3.f8544a0
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f8553m
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f8546c0
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 0
            r3.S = r0
            r0 = 1
            r3.T = r0
            int r0 = r3.U
            r1 = -100
            if (r0 == r1) goto L_0x0048
            java.lang.Object r0 = r3.f8551k
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0048
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0048
            androidx.collection.h<java.lang.String, java.lang.Integer> r0 = f8538h0
            java.lang.Object r1 = r3.f8551k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.U
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0057
        L_0x0048:
            androidx.collection.h<java.lang.String, java.lang.Integer> r0 = f8538h0
            java.lang.Object r1 = r3.f8551k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0057:
            g.a r0 = r3.f8556p
            if (r0 == 0) goto L_0x005e
            r0.m()
        L_0x005e:
            r3.M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.r():void");
    }

    /* access modifiers changed from: package-private */
    public boolean r0(int i10, KeyEvent keyEvent) {
        a m10 = m();
        if (m10 != null && m10.n(i10, keyEvent)) {
            return true;
        }
        s sVar = this.O;
        if (sVar == null || !z0(sVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.O == null) {
                s d02 = d0(0, true);
                A0(d02, keyEvent);
                boolean z02 = z0(d02, keyEvent.getKeyCode(), keyEvent, 1);
                d02.f8600m = false;
                if (z02) {
                    return true;
                }
            }
            return false;
        }
        s sVar2 = this.O;
        if (sVar2 != null) {
            sVar2.f8601n = true;
        }
        return true;
    }

    public void s(Bundle bundle) {
        W();
    }

    /* access modifiers changed from: package-private */
    public boolean s0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            boolean z10 = this.P;
            this.P = false;
            s d02 = d0(0, false);
            if (d02 != null && d02.f8602o) {
                if (!z10) {
                    O(d02, true);
                }
                return true;
            } else if (o0()) {
                return true;
            }
        } else if (i10 == 82) {
            t0(0, keyEvent);
            return true;
        }
        return false;
    }

    public void t() {
        a m10 = m();
        if (m10 != null) {
            m10.r(true);
        }
    }

    public void u(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public void u0(int i10) {
        a m10;
        if (i10 == 108 && (m10 = m()) != null) {
            m10.h(true);
        }
    }

    public void v() {
        this.S = true;
        F();
    }

    /* access modifiers changed from: package-private */
    public void v0(int i10) {
        if (i10 == 108) {
            a m10 = m();
            if (m10 != null) {
                m10.h(false);
            }
        } else if (i10 == 0) {
            s d02 = d0(i10, true);
            if (d02.f8602o) {
                O(d02, false);
            }
        }
    }

    public void w() {
        this.S = false;
        a m10 = m();
        if (m10 != null) {
            m10.r(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void w0(ViewGroup viewGroup) {
    }

    /* access modifiers changed from: package-private */
    public final a y0() {
        return this.f8556p;
    }

    public boolean z(int i10) {
        int C0 = C0(i10);
        if (this.L && C0 == 108) {
            return false;
        }
        if (this.H && C0 == 1) {
            this.H = false;
        }
        if (C0 == 1) {
            H0();
            this.L = true;
            return true;
        } else if (C0 == 2) {
            H0();
            this.F = true;
            return true;
        } else if (C0 == 5) {
            H0();
            this.G = true;
            return true;
        } else if (C0 == 10) {
            H0();
            this.J = true;
            return true;
        } else if (C0 == 108) {
            H0();
            this.H = true;
            return true;
        } else if (C0 != 109) {
            return this.f8553m.requestFeature(C0);
        } else {
            H0();
            this.I = true;
            return true;
        }
    }

    e(Dialog dialog, c cVar) {
        this(dialog.getContext(), dialog.getWindow(), cVar, dialog);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        r3 = f8538h0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private e(android.content.Context r3, android.view.Window r4, g.c r5, java.lang.Object r6) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f8566z = r0
            r0 = 1
            r2.A = r0
            r0 = -100
            r2.U = r0
            g.e$b r1 = new g.e$b
            r1.<init>()
            r2.f8546c0 = r1
            r2.f8552l = r3
            r2.f8555o = r5
            r2.f8551k = r6
            int r3 = r2.U
            if (r3 != r0) goto L_0x0032
            boolean r3 = r6 instanceof android.app.Dialog
            if (r3 == 0) goto L_0x0032
            g.b r3 = r2.I0()
            if (r3 == 0) goto L_0x0032
            g.d r3 = r3.g()
            int r3 = r3.k()
            r2.U = r3
        L_0x0032:
            int r3 = r2.U
            if (r3 != r0) goto L_0x0059
            androidx.collection.h<java.lang.String, java.lang.Integer> r3 = f8538h0
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.Object r5 = r3.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0059
            int r5 = r5.intValue()
            r2.U = r5
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            r3.remove(r5)
        L_0x0059:
            if (r4 == 0) goto L_0x005e
            r2.I(r4)
        L_0x005e:
            androidx.appcompat.widget.i.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.<init>(android.content.Context, android.view.Window, g.c, java.lang.Object):void");
    }

    /* compiled from: AppCompatDelegateImpl */
    class j extends l.i {
        j(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        public final ActionMode b(ActionMode.Callback callback) {
            f.a aVar = new f.a(e.this.f8552l, callback);
            l.b F0 = e.this.F0(aVar);
            if (F0 != null) {
                return aVar.e(F0);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return e.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || e.this.r0(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            e.this.u0(i10);
            return true;
        }

        public void onPanelClosed(int i10, Menu menu) {
            super.onPanelClosed(i10, menu);
            e.this.v0(i10);
        }

        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.a0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i10, view, menu);
            if (eVar != null) {
                eVar.a0(false);
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            s d02 = e.this.d0(0, true);
            if (d02 == null || (eVar = d02.f8597j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (e.this.m0()) {
                return b(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            if (!e.this.m0() || i10 != 0) {
                return super.onWindowStartingActionMode(callback, i10);
            }
            return b(callback);
        }
    }
}
