package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.z;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends g0 implements l.c {

    /* renamed from: x0  reason: collision with root package name */
    static final n f890x0 = (Build.VERSION.SDK_INT < 29 ? new n() : null);
    final ImageView A;
    final ImageView B;
    final ImageView C;
    final ImageView D;
    private final View E;
    private p F;
    private Rect G;
    private Rect H;
    private int[] I;
    private int[] J;
    private final ImageView K;
    private final Drawable L;
    private final int M;
    private final int N;
    private final Intent O;
    private final Intent P;
    private final CharSequence Q;
    private l R;
    private k S;
    View.OnFocusChangeListener T;
    private m U;
    private View.OnClickListener V;
    private boolean W;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f891a0;

    /* renamed from: b0  reason: collision with root package name */
    d0.a f892b0;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f893c0;

    /* renamed from: d0  reason: collision with root package name */
    private CharSequence f894d0;

    /* renamed from: e0  reason: collision with root package name */
    private boolean f895e0;

    /* renamed from: f0  reason: collision with root package name */
    private boolean f896f0;

    /* renamed from: g0  reason: collision with root package name */
    private int f897g0;

    /* renamed from: h0  reason: collision with root package name */
    private boolean f898h0;

    /* renamed from: i0  reason: collision with root package name */
    private CharSequence f899i0;

    /* renamed from: j0  reason: collision with root package name */
    private CharSequence f900j0;

    /* renamed from: k0  reason: collision with root package name */
    private boolean f901k0;

    /* renamed from: l0  reason: collision with root package name */
    private int f902l0;

    /* renamed from: m0  reason: collision with root package name */
    SearchableInfo f903m0;

    /* renamed from: n0  reason: collision with root package name */
    private Bundle f904n0;

    /* renamed from: o0  reason: collision with root package name */
    private final Runnable f905o0;

    /* renamed from: p0  reason: collision with root package name */
    private Runnable f906p0;

    /* renamed from: q0  reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f907q0;

    /* renamed from: r0  reason: collision with root package name */
    private final View.OnClickListener f908r0;

    /* renamed from: s0  reason: collision with root package name */
    View.OnKeyListener f909s0;

    /* renamed from: t0  reason: collision with root package name */
    private final TextView.OnEditorActionListener f910t0;

    /* renamed from: u0  reason: collision with root package name */
    private final AdapterView.OnItemClickListener f911u0;

    /* renamed from: v0  reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f912v0;

    /* renamed from: w  reason: collision with root package name */
    final SearchAutoComplete f913w;

    /* renamed from: w0  reason: collision with root package name */
    private TextWatcher f914w0;

    /* renamed from: x  reason: collision with root package name */
    private final View f915x;

    /* renamed from: y  reason: collision with root package name */
    private final View f916y;

    /* renamed from: z  reason: collision with root package name */
    private final View f917z;

    public static class SearchAutoComplete extends d {

        /* renamed from: k  reason: collision with root package name */
        private int f918k;

        /* renamed from: l  reason: collision with root package name */
        private SearchView f919l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f920m;

        /* renamed from: n  reason: collision with root package name */
        final Runnable f921n;

        class a implements Runnable {
            a() {
            }

            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, f.a.f8199p);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return UserVerificationMethods.USER_VERIFY_HANDPRINT;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f890x0.c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            if (this.f920m) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f920m = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f918k <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f920m) {
                removeCallbacks(this.f921n);
                post(this.f921n);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f919l.X();
        }

        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f919l.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f919l.hasFocus() && getVisibility() == 0) {
                this.f920m = true;
                if (SearchView.K(getContext())) {
                    a();
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f920m = false;
                removeCallbacks(this.f921n);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f920m = false;
                removeCallbacks(this.f921n);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f920m = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f919l = searchView;
        }

        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f918k = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f921n = new a();
            this.f918k = getThreshold();
        }
    }

    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.W(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            SearchView.this.d0();
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            d0.a aVar = SearchView.this.f892b0;
            if (aVar instanceof o0) {
                aVar.a((Cursor) null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.T;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.z();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.A) {
                searchView.T();
            } else if (view == searchView.C) {
                searchView.P();
            } else if (view == searchView.B) {
                searchView.U();
            } else if (view == searchView.D) {
                searchView.Y();
            } else if (view == searchView.f913w) {
                searchView.F();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f903m0 == null) {
                return false;
            }
            if (searchView.f913w.isPopupShowing() && SearchView.this.f913w.getListSelection() != -1) {
                return SearchView.this.V(view, i10, keyEvent);
            }
            if (SearchView.this.f913w.b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.N(0, (String) null, searchView2.f913w.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.U();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.Q(i10, 0, (String) null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.R(i10);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface k {
        boolean onClose();
    }

    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    public interface m {
        boolean a(int i10);

        boolean b(int i10);
    }

    private static class n {

        /* renamed from: a  reason: collision with root package name */
        private Method f933a = null;

        /* renamed from: b  reason: collision with root package name */
        private Method f934b = null;

        /* renamed from: c  reason: collision with root package name */
        private Method f935c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        n() {
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f933a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f934b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f935c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* access modifiers changed from: package-private */
        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f934b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f933a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f935c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    static class o extends e0.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        boolean f936j;

        class a implements Parcelable.ClassLoaderCreator<o> {
            a() {
            }

            /* renamed from: a */
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            /* renamed from: c */
            public o[] newArray(int i10) {
                return new o[i10];
            }
        }

        o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f936j + "}";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f936j));
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f936j = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    private static class p extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        private final View f937a;

        /* renamed from: b  reason: collision with root package name */
        private final Rect f938b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        private final Rect f939c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        private final Rect f940d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        private final int f941e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f942f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f941e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.f937a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f938b.set(rect);
            this.f940d.set(rect);
            Rect rect3 = this.f940d;
            int i10 = this.f941e;
            rect3.inset(-i10, -i10);
            this.f939c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f942f
                r7.f942f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f942f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.f940d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.f938b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f942f = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x0072
                if (r2 == 0) goto L_0x005f
                android.graphics.Rect r2 = r7.f939c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005f
                android.view.View r0 = r7.f937a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f937a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                goto L_0x006c
            L_0x005f:
                android.graphics.Rect r2 = r7.f939c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r8.setLocation(r0, r1)
            L_0x006c:
                android.view.View r0 = r7.f937a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x0072:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    private Intent A(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f900j0);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f904n0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f903m0.getSearchActivity());
        return intent;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|20|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r10 = r10.getPosition();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        r11 = new java.lang.StringBuilder();
        r11.append("Search suggestions cursor at row ");
        r11.append(r10);
        r11.append(" returned exception.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0061 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.content.Intent B(android.database.Cursor r10, int r11, java.lang.String r12) {
        /*
            r9 = this;
            r0 = 0
            java.lang.String r1 = "suggest_intent_action"
            java.lang.String r1 = androidx.appcompat.widget.o0.o(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            if (r1 != 0) goto L_0x000f
            android.app.SearchableInfo r1 = r9.f903m0     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r1.getSuggestIntentAction()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x000f:
            if (r1 != 0) goto L_0x0013
            java.lang.String r1 = "android.intent.action.SEARCH"
        L_0x0013:
            r3 = r1
            java.lang.String r1 = "suggest_intent_data"
            java.lang.String r1 = androidx.appcompat.widget.o0.o(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            if (r1 != 0) goto L_0x0022
            android.app.SearchableInfo r1 = r9.f903m0     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r1.getSuggestIntentData()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x0022:
            if (r1 == 0) goto L_0x0044
            java.lang.String r2 = "suggest_intent_data_id"
            java.lang.String r2 = androidx.appcompat.widget.o0.o(r10, r2)     // Catch:{ RuntimeException -> 0x0061 }
            if (r2 == 0) goto L_0x0044
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0061 }
            r4.<init>()     // Catch:{ RuntimeException -> 0x0061 }
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = "/"
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = android.net.Uri.encode(r2)     // Catch:{ RuntimeException -> 0x0061 }
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r4.toString()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x0044:
            if (r1 != 0) goto L_0x0048
            r4 = r0
            goto L_0x004d
        L_0x0048:
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ RuntimeException -> 0x0061 }
            r4 = r1
        L_0x004d:
            java.lang.String r1 = "suggest_intent_query"
            java.lang.String r6 = androidx.appcompat.widget.o0.o(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = "suggest_intent_extra_data"
            java.lang.String r5 = androidx.appcompat.widget.o0.o(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            r2 = r9
            r7 = r11
            r8 = r12
            android.content.Intent r10 = r2.A(r3, r4, r5, r6, r7, r8)     // Catch:{ RuntimeException -> 0x0061 }
            return r10
        L_0x0061:
            int r10 = r10.getPosition()     // Catch:{ RuntimeException -> 0x0066 }
            goto L_0x0067
        L_0x0066:
            r10 = -1
        L_0x0067:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Search suggestions cursor at row "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = " returned exception."
            r11.append(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.B(android.database.Cursor, int, java.lang.String):android.content.Intent");
    }

    private Intent C(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f904n0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i10 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i10 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i10);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent D(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", str);
        return intent2;
    }

    private void E() {
        this.f913w.dismissDropDown();
    }

    private void G(View view, Rect rect) {
        view.getLocationInWindow(this.I);
        getLocationInWindow(this.J);
        int[] iArr = this.I;
        int i10 = iArr[1];
        int[] iArr2 = this.J;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence H(CharSequence charSequence) {
        if (!this.W || this.L == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f913w.getTextSize()) * 1.25d);
        this.L.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.L), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean I() {
        SearchableInfo searchableInfo = this.f903m0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f903m0.getVoiceSearchLaunchWebSearch()) {
            intent = this.O;
        } else if (this.f903m0.getVoiceSearchLaunchRecognizer()) {
            intent = this.P;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) == null) {
            return false;
        }
        return true;
    }

    static boolean K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean L() {
        return (this.f893c0 || this.f898h0) && !J();
    }

    private void M(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed launch activity: ");
                sb.append(intent);
            }
        }
    }

    private boolean O(int i10, int i11, String str) {
        Cursor b10 = this.f892b0.b();
        if (b10 == null || !b10.moveToPosition(i10)) {
            return false;
        }
        M(B(b10, i11, str));
        return true;
    }

    private void Z() {
        post(this.f905o0);
    }

    private void a0(int i10) {
        Editable text = this.f913w.getText();
        Cursor b10 = this.f892b0.b();
        if (b10 != null) {
            if (b10.moveToPosition(i10)) {
                CharSequence c10 = this.f892b0.c(b10);
                if (c10 != null) {
                    setQuery(c10);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    private void c0() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f913w.getText());
        int i10 = 0;
        if (!z11 && (!this.W || this.f901k0)) {
            z10 = false;
        }
        ImageView imageView = this.C;
        if (!z10) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        Drawable drawable = this.C.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void e0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f913w;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(H(queryHint));
    }

    private void f0() {
        this.f913w.setThreshold(this.f903m0.getSuggestThreshold());
        this.f913w.setImeOptions(this.f903m0.getImeOptions());
        int inputType = this.f903m0.getInputType();
        int i10 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f903m0.getSuggestAuthority() != null) {
                inputType = inputType | NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST | 524288;
            }
        }
        this.f913w.setInputType(inputType);
        d0.a aVar = this.f892b0;
        if (aVar != null) {
            aVar.a((Cursor) null);
        }
        if (this.f903m0.getSuggestAuthority() != null) {
            o0 o0Var = new o0(getContext(), this, this.f903m0, this.f907q0);
            this.f892b0 = o0Var;
            this.f913w.setAdapter(o0Var);
            o0 o0Var2 = (o0) this.f892b0;
            if (this.f895e0) {
                i10 = 2;
            }
            o0Var2.x(i10);
        }
    }

    private void g0() {
        this.f917z.setVisibility((!L() || !(this.B.getVisibility() == 0 || this.D.getVisibility() == 0)) ? 8 : 0);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(f.d.f8225g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(f.d.f8226h);
    }

    private void h0(boolean z10) {
        this.B.setVisibility((!this.f893c0 || !L() || !hasFocus() || (!z10 && this.f898h0)) ? 8 : 0);
    }

    private void i0(boolean z10) {
        this.f891a0 = z10;
        int i10 = 0;
        int i11 = z10 ? 0 : 8;
        boolean z11 = !TextUtils.isEmpty(this.f913w.getText());
        this.A.setVisibility(i11);
        h0(z11);
        this.f915x.setVisibility(z10 ? 8 : 0);
        if (this.K.getDrawable() == null || this.W) {
            i10 = 8;
        }
        this.K.setVisibility(i10);
        c0();
        j0(!z11);
        g0();
    }

    private void j0(boolean z10) {
        int i10 = 8;
        if (this.f898h0 && !J() && z10) {
            this.B.setVisibility(8);
            i10 = 0;
        }
        this.D.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.f913w.setText(charSequence);
        this.f913w.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* access modifiers changed from: package-private */
    public void F() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f913w.refreshAutoCompleteResults();
            return;
        }
        n nVar = f890x0;
        nVar.b(this.f913w);
        nVar.a(this.f913w);
    }

    public boolean J() {
        return this.f891a0;
    }

    /* access modifiers changed from: package-private */
    public void N(int i10, String str, String str2) {
        getContext().startActivity(A("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i10, str));
    }

    /* access modifiers changed from: package-private */
    public void P() {
        if (!TextUtils.isEmpty(this.f913w.getText())) {
            this.f913w.setText("");
            this.f913w.requestFocus();
            this.f913w.setImeVisibility(true);
        } else if (this.W) {
            k kVar = this.S;
            if (kVar == null || !kVar.onClose()) {
                clearFocus();
                i0(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean Q(int i10, int i11, String str) {
        m mVar = this.U;
        if (mVar != null && mVar.b(i10)) {
            return false;
        }
        O(i10, 0, (String) null);
        this.f913w.setImeVisibility(false);
        E();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean R(int i10) {
        m mVar = this.U;
        if (mVar != null && mVar.a(i10)) {
            return false;
        }
        a0(i10);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void S(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    public void T() {
        i0(false);
        this.f913w.requestFocus();
        this.f913w.setImeVisibility(true);
        View.OnClickListener onClickListener = this.V;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void U() {
        Editable text = this.f913w.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            l lVar = this.R;
            if (lVar == null || !lVar.b(text.toString())) {
                if (this.f903m0 != null) {
                    N(0, (String) null, text.toString());
                }
                this.f913w.setImeVisibility(false);
                E();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean V(View view, int i10, KeyEvent keyEvent) {
        int i11;
        if (this.f903m0 != null && this.f892b0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return Q(this.f913w.getListSelection(), 0, (String) null);
            }
            if (i10 == 21 || i10 == 22) {
                if (i10 == 21) {
                    i11 = 0;
                } else {
                    i11 = this.f913w.length();
                }
                this.f913w.setSelection(i11);
                this.f913w.setListSelection(0);
                this.f913w.clearListSelection();
                this.f913w.a();
                return true;
            } else if (i10 == 19) {
                this.f913w.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void W(CharSequence charSequence) {
        Editable text = this.f913w.getText();
        this.f900j0 = text;
        boolean z10 = !TextUtils.isEmpty(text);
        h0(z10);
        j0(!z10);
        c0();
        g0();
        if (this.R != null && !TextUtils.equals(charSequence, this.f899i0)) {
            this.R.a(charSequence.toString());
        }
        this.f899i0 = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    public void X() {
        i0(J());
        Z();
        if (this.f913w.hasFocus()) {
            F();
        }
    }

    /* access modifiers changed from: package-private */
    public void Y() {
        SearchableInfo searchableInfo = this.f903m0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(D(this.O, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(C(this.P, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    public void b0(CharSequence charSequence, boolean z10) {
        this.f913w.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f913w;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f900j0 = charSequence;
        }
        if (z10 && !TextUtils.isEmpty(charSequence)) {
            U();
        }
    }

    public void c() {
        if (!this.f901k0) {
            this.f901k0 = true;
            int imeOptions = this.f913w.getImeOptions();
            this.f902l0 = imeOptions;
            this.f913w.setImeOptions(imeOptions | 33554432);
            this.f913w.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.f896f0 = true;
        super.clearFocus();
        this.f913w.clearFocus();
        this.f913w.setImeVisibility(false);
        this.f896f0 = false;
    }

    public void d() {
        b0("", false);
        clearFocus();
        i0(true);
        this.f913w.setImeOptions(this.f902l0);
        this.f901k0 = false;
    }

    /* access modifiers changed from: package-private */
    public void d0() {
        int[] iArr = this.f913w.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f916y.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f917z.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f913w.getImeOptions();
    }

    public int getInputType() {
        return this.f913w.getInputType();
    }

    public int getMaxWidth() {
        return this.f897g0;
    }

    public CharSequence getQuery() {
        return this.f913w.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f894d0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f903m0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.Q;
        }
        return getContext().getText(this.f903m0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.N;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.M;
    }

    public d0.a getSuggestionsAdapter() {
        return this.f892b0;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f905o0);
        post(this.f906p0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            G(this.f913w, this.G);
            Rect rect = this.H;
            Rect rect2 = this.G;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            p pVar = this.F;
            if (pVar == null) {
                p pVar2 = new p(this.H, this.G, this.f913w);
                this.F = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.a(this.H, this.G);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        if (J()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f897g0;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f897g0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f897g0) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.b());
        i0(oVar.f936j);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f936j = J();
        return oVar;
    }

    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Z();
    }

    public boolean requestFocus(int i10, Rect rect) {
        if (this.f896f0 || !isFocusable()) {
            return false;
        }
        if (J()) {
            return super.requestFocus(i10, rect);
        }
        boolean requestFocus = this.f913w.requestFocus(i10, rect);
        if (requestFocus) {
            i0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f904n0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            P();
        } else {
            T();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            i0(z10);
            e0();
        }
    }

    public void setImeOptions(int i10) {
        this.f913w.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f913w.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f897g0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.S = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.T = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.R = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.V = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.U = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f894d0 = charSequence;
        e0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f895e0 = z10;
        d0.a aVar = this.f892b0;
        if (aVar instanceof o0) {
            ((o0) aVar).x(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f903m0 = searchableInfo;
        if (searchableInfo != null) {
            f0();
            e0();
        }
        boolean I2 = I();
        this.f898h0 = I2;
        if (I2) {
            this.f913w.setPrivateImeOptions("nm");
        }
        i0(J());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f893c0 = z10;
        i0(J());
    }

    public void setSuggestionsAdapter(d0.a aVar) {
        this.f892b0 = aVar;
        this.f913w.setAdapter(aVar);
    }

    /* access modifiers changed from: package-private */
    public void z() {
        int i10;
        if (this.E.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f916y.getPaddingLeft();
            Rect rect = new Rect();
            boolean b10 = a1.b(this);
            int dimensionPixelSize = this.W ? resources.getDimensionPixelSize(f.d.f8223e) + resources.getDimensionPixelSize(f.d.f8224f) : 0;
            this.f913w.getDropDownBackground().getPadding(rect);
            if (b10) {
                i10 = -rect.left;
            } else {
                i10 = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.f913w.setDropDownHorizontalOffset(i10);
            this.f913w.setDropDownWidth((((this.E.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.G);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.G = new Rect();
        this.H = new Rect();
        this.I = new int[2];
        this.J = new int[2];
        this.f905o0 = new b();
        this.f906p0 = new c();
        this.f907q0 = new WeakHashMap<>();
        f fVar = new f();
        this.f908r0 = fVar;
        this.f909s0 = new g();
        h hVar = new h();
        this.f910t0 = hVar;
        i iVar = new i();
        this.f911u0 = iVar;
        j jVar = new j();
        this.f912v0 = jVar;
        this.f914w0 = new a();
        u0 u10 = u0.u(context, attributeSet, f.j.f8362i2, i10, 0);
        LayoutInflater.from(context).inflate(u10.m(f.j.f8412s2, f.g.f8300r), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(f.f.D);
        this.f913w = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f915x = findViewById(f.f.f8282z);
        View findViewById = findViewById(f.f.C);
        this.f916y = findViewById;
        View findViewById2 = findViewById(f.f.J);
        this.f917z = findViewById2;
        ImageView imageView = (ImageView) findViewById(f.f.f8280x);
        this.A = imageView;
        ImageView imageView2 = (ImageView) findViewById(f.f.A);
        this.B = imageView2;
        ImageView imageView3 = (ImageView) findViewById(f.f.f8281y);
        this.C = imageView3;
        ImageView imageView4 = (ImageView) findViewById(f.f.E);
        this.D = imageView4;
        ImageView imageView5 = (ImageView) findViewById(f.f.B);
        this.K = imageView5;
        z.T(findViewById, u10.f(f.j.f8417t2));
        z.T(findViewById2, u10.f(f.j.f8437x2));
        int i11 = f.j.f8432w2;
        imageView.setImageDrawable(u10.f(i11));
        imageView2.setImageDrawable(u10.f(f.j.f8402q2));
        imageView3.setImageDrawable(u10.f(f.j.f8387n2));
        imageView4.setImageDrawable(u10.f(f.j.f8447z2));
        imageView5.setImageDrawable(u10.f(i11));
        this.L = u10.f(f.j.f8427v2);
        w0.a(imageView, getResources().getString(f.h.f8314l));
        this.M = u10.m(f.j.f8442y2, f.g.f8299q);
        this.N = u10.m(f.j.f8392o2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f914w0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f909s0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(u10.a(f.j.f8407r2, true));
        int e10 = u10.e(f.j.f8372k2, -1);
        if (e10 != -1) {
            setMaxWidth(e10);
        }
        this.Q = u10.o(f.j.f8397p2);
        this.f894d0 = u10.o(f.j.f8422u2);
        int j10 = u10.j(f.j.f8382m2, -1);
        if (j10 != -1) {
            setImeOptions(j10);
        }
        int j11 = u10.j(f.j.f8377l2, -1);
        if (j11 != -1) {
            setInputType(j11);
        }
        setFocusable(u10.a(f.j.f8367j2, true));
        u10.v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.O = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.P = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.E = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        i0(this.W);
        e0();
    }
}
