package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.a;
import androidx.core.view.x;
import androidx.core.view.z;

/* compiled from: AppCompatSpinner */
public class u extends Spinner implements x {

    /* renamed from: p  reason: collision with root package name */
    private static final int[] f1232p = {16843505};

    /* renamed from: h  reason: collision with root package name */
    private final e f1233h;

    /* renamed from: i  reason: collision with root package name */
    private final Context f1234i;

    /* renamed from: j  reason: collision with root package name */
    private f0 f1235j;

    /* renamed from: k  reason: collision with root package name */
    private SpinnerAdapter f1236k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f1237l;

    /* renamed from: m  reason: collision with root package name */
    private g f1238m;

    /* renamed from: n  reason: collision with root package name */
    int f1239n;

    /* renamed from: o  reason: collision with root package name */
    final Rect f1240o;

    /* compiled from: AppCompatSpinner */
    class a extends f0 {

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ e f1241q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.f1241q = eVar;
        }

        public m.e b() {
            return this.f1241q;
        }

        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (u.this.getInternalPopup().a()) {
                return true;
            }
            u.this.b();
            return true;
        }
    }

    /* compiled from: AppCompatSpinner */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        public void onGlobalLayout() {
            if (!u.this.getInternalPopup().a()) {
                u.this.b();
            }
            ViewTreeObserver viewTreeObserver = u.this.getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* compiled from: AppCompatSpinner */
    class c implements g, DialogInterface.OnClickListener {

        /* renamed from: h  reason: collision with root package name */
        androidx.appcompat.app.a f1244h;

        /* renamed from: i  reason: collision with root package name */
        private ListAdapter f1245i;

        /* renamed from: j  reason: collision with root package name */
        private CharSequence f1246j;

        c() {
        }

        public boolean a() {
            androidx.appcompat.app.a aVar = this.f1244h;
            if (aVar != null) {
                return aVar.isShowing();
            }
            return false;
        }

        public int b() {
            return 0;
        }

        public void d(int i10) {
        }

        public void dismiss() {
            androidx.appcompat.app.a aVar = this.f1244h;
            if (aVar != null) {
                aVar.dismiss();
                this.f1244h = null;
            }
        }

        public CharSequence e() {
            return this.f1246j;
        }

        public Drawable g() {
            return null;
        }

        public void h(CharSequence charSequence) {
            this.f1246j = charSequence;
        }

        public void j(Drawable drawable) {
        }

        public void k(int i10) {
        }

        public void l(int i10) {
        }

        public void m(int i10, int i11) {
            if (this.f1245i != null) {
                a.C0010a aVar = new a.C0010a(u.this.getPopupContext());
                CharSequence charSequence = this.f1246j;
                if (charSequence != null) {
                    aVar.h(charSequence);
                }
                androidx.appcompat.app.a a10 = aVar.g(this.f1245i, u.this.getSelectedItemPosition(), this).a();
                this.f1244h = a10;
                ListView h10 = a10.h();
                if (Build.VERSION.SDK_INT >= 17) {
                    h10.setTextDirection(i10);
                    h10.setTextAlignment(i11);
                }
                this.f1244h.show();
            }
        }

        public int n() {
            return 0;
        }

        public void o(ListAdapter listAdapter) {
            this.f1245i = listAdapter;
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            u.this.setSelection(i10);
            if (u.this.getOnItemClickListener() != null) {
                u.this.performItemClick((View) null, i10, this.f1245i.getItemId(i10));
            }
            dismiss();
        }
    }

    /* compiled from: AppCompatSpinner */
    private static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: h  reason: collision with root package name */
        private SpinnerAdapter f1248h;

        /* renamed from: i  reason: collision with root package name */
        private ListAdapter f1249i;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1248h = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1249i = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof q0) {
                q0 q0Var = (q0) spinnerAdapter;
                if (q0Var.getDropDownViewTheme() == null) {
                    q0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1249i;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1248h;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1248h;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1248h;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1248h;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i10);
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1248h;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f1249i;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1248h;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1248h;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* compiled from: AppCompatSpinner */
    class e extends h0 implements g {
        private CharSequence Q;
        ListAdapter R;
        private final Rect S = new Rect();
        private int T;

        /* compiled from: AppCompatSpinner */
        class a implements AdapterView.OnItemClickListener {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ u f1250h;

            a(u uVar) {
                this.f1250h = uVar;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                u.this.setSelection(i10);
                if (u.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    u.this.performItemClick(view, i10, eVar.R.getItemId(i10));
                }
                e.this.dismiss();
            }
        }

        /* compiled from: AppCompatSpinner */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.P(u.this)) {
                    e.this.dismiss();
                    return;
                }
                e.this.N();
                e.super.show();
            }
        }

        /* compiled from: AppCompatSpinner */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1253h;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1253h = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = u.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1253h);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            y(u.this);
            E(true);
            J(0);
            G(new a(u.this));
        }

        /* access modifiers changed from: package-private */
        public void N() {
            int i10;
            int i11;
            Drawable g10 = g();
            int i12 = 0;
            if (g10 != null) {
                g10.getPadding(u.this.f1240o);
                if (a1.b(u.this)) {
                    i11 = u.this.f1240o.right;
                } else {
                    i11 = -u.this.f1240o.left;
                }
                i12 = i11;
            } else {
                Rect rect = u.this.f1240o;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = u.this.getPaddingLeft();
            int paddingRight = u.this.getPaddingRight();
            int width = u.this.getWidth();
            u uVar = u.this;
            int i13 = uVar.f1239n;
            if (i13 == -2) {
                int a10 = uVar.a((SpinnerAdapter) this.R, g());
                int i14 = u.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = u.this.f1240o;
                int i15 = (i14 - rect2.left) - rect2.right;
                if (a10 > i15) {
                    a10 = i15;
                }
                A(Math.max(a10, (width - paddingLeft) - paddingRight));
            } else if (i13 == -1) {
                A((width - paddingLeft) - paddingRight);
            } else {
                A(i13);
            }
            if (a1.b(u.this)) {
                i10 = i12 + (((width - paddingRight) - u()) - O());
            } else {
                i10 = i12 + paddingLeft + O();
            }
            d(i10);
        }

        public int O() {
            return this.T;
        }

        /* access modifiers changed from: package-private */
        public boolean P(View view) {
            return z.E(view) && view.getGlobalVisibleRect(this.S);
        }

        public CharSequence e() {
            return this.Q;
        }

        public void h(CharSequence charSequence) {
            this.Q = charSequence;
        }

        public void l(int i10) {
            this.T = i10;
        }

        public void m(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean a10 = a();
            N();
            D(2);
            super.show();
            ListView i12 = i();
            i12.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                i12.setTextDirection(i10);
                i12.setTextAlignment(i11);
            }
            K(u.this.getSelectedItemPosition());
            if (!a10 && (viewTreeObserver = u.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                F(new c(bVar));
            }
        }

        public void o(ListAdapter listAdapter) {
            super.o(listAdapter);
            this.R = listAdapter;
        }
    }

    /* compiled from: AppCompatSpinner */
    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        boolean f1255h;

        /* compiled from: AppCompatSpinner */
        class a implements Parcelable.Creator<f> {
            a() {
            }

            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            /* renamed from: b */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f1255h ? (byte) 1 : 0);
        }

        f(Parcel parcel) {
            super(parcel);
            this.f1255h = parcel.readByte() != 0;
        }
    }

    /* compiled from: AppCompatSpinner */
    interface g {
        boolean a();

        int b();

        void d(int i10);

        void dismiss();

        CharSequence e();

        Drawable g();

        void h(CharSequence charSequence);

        void j(Drawable drawable);

        void k(int i10);

        void l(int i10);

        void m(int i10, int i11);

        int n();

        void o(ListAdapter listAdapter);
    }

    public u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.I);
    }

    /* access modifiers changed from: package-private */
    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i11;
        }
        drawable.getPadding(this.f1240o);
        Rect rect = this.f1240o;
        return i11 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f1238m.m(getTextDirection(), getTextAlignment());
        } else {
            this.f1238m.m(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1233h;
        if (eVar != null) {
            eVar.b();
        }
    }

    public int getDropDownHorizontalOffset() {
        g gVar = this.f1238m;
        if (gVar != null) {
            return gVar.b();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        g gVar = this.f1238m;
        if (gVar != null) {
            return gVar.n();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f1238m != null) {
            return this.f1239n;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final g getInternalPopup() {
        return this.f1238m;
    }

    public Drawable getPopupBackground() {
        g gVar = this.f1238m;
        if (gVar != null) {
            return gVar.g();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.f1234i;
    }

    public CharSequence getPrompt() {
        g gVar = this.f1238m;
        return gVar != null ? gVar.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1233h;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1233h;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f1238m;
        if (gVar != null && gVar.a()) {
            this.f1238m.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1238m != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (fVar.f1255h && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new b());
        }
    }

    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f1238m;
        fVar.f1255h = gVar != null && gVar.a();
        return fVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var = this.f1235j;
        if (f0Var == null || !f0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        g gVar = this.f1238m;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.a()) {
            return true;
        }
        b();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1233h;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1233h;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setDropDownHorizontalOffset(int i10) {
        g gVar = this.f1238m;
        if (gVar != null) {
            gVar.l(i10);
            this.f1238m.d(i10);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i10);
        }
    }

    public void setDropDownVerticalOffset(int i10) {
        g gVar = this.f1238m;
        if (gVar != null) {
            gVar.k(i10);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i10);
        }
    }

    public void setDropDownWidth(int i10) {
        if (this.f1238m != null) {
            this.f1239n = i10;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i10);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f1238m;
        if (gVar != null) {
            gVar.j(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(h.a.d(getPopupContext(), i10));
    }

    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f1238m;
        if (gVar != null) {
            gVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1233h;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1233h;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public u(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1237l) {
            this.f1236k = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1238m != null) {
            Context context = this.f1234i;
            if (context == null) {
                context = getContext();
            }
            this.f1238m.o(new d(spinnerAdapter, context.getTheme()));
        }
    }

    public u(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r10 != null) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u(android.content.Context r6, android.util.AttributeSet r7, int r8, int r9, android.content.res.Resources.Theme r10) {
        /*
            r5 = this;
            r5.<init>(r6, r7, r8)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.f1240o = r0
            android.content.Context r0 = r5.getContext()
            androidx.appcompat.widget.p0.a(r5, r0)
            int[] r0 = f.j.A2
            r1 = 0
            androidx.appcompat.widget.u0 r0 = androidx.appcompat.widget.u0.u(r6, r7, r0, r8, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r5)
            r5.f1233h = r2
            if (r10 == 0) goto L_0x0029
            l.d r2 = new l.d
            r2.<init>((android.content.Context) r6, (android.content.res.Resources.Theme) r10)
            r5.f1234i = r2
            goto L_0x003b
        L_0x0029:
            int r10 = f.j.F2
            int r10 = r0.m(r10, r1)
            if (r10 == 0) goto L_0x0039
            l.d r2 = new l.d
            r2.<init>((android.content.Context) r6, (int) r10)
            r5.f1234i = r2
            goto L_0x003b
        L_0x0039:
            r5.f1234i = r6
        L_0x003b:
            r10 = -1
            r2 = 0
            if (r9 != r10) goto L_0x0061
            int[] r10 = f1232p     // Catch:{ Exception -> 0x005d, all -> 0x0056 }
            android.content.res.TypedArray r10 = r6.obtainStyledAttributes(r7, r10, r8, r1)     // Catch:{ Exception -> 0x005d, all -> 0x0056 }
            boolean r3 = r10.hasValue(r1)     // Catch:{ Exception -> 0x005e, all -> 0x0053 }
            if (r3 == 0) goto L_0x004f
            int r9 = r10.getInt(r1, r1)     // Catch:{ Exception -> 0x005e, all -> 0x0053 }
        L_0x004f:
            r10.recycle()
            goto L_0x0061
        L_0x0053:
            r6 = move-exception
            r2 = r10
            goto L_0x0057
        L_0x0056:
            r6 = move-exception
        L_0x0057:
            if (r2 == 0) goto L_0x005c
            r2.recycle()
        L_0x005c:
            throw r6
        L_0x005d:
            r10 = r2
        L_0x005e:
            if (r10 == 0) goto L_0x0061
            goto L_0x004f
        L_0x0061:
            r10 = 1
            if (r9 == 0) goto L_0x009e
            if (r9 == r10) goto L_0x0067
            goto L_0x00ae
        L_0x0067:
            androidx.appcompat.widget.u$e r9 = new androidx.appcompat.widget.u$e
            android.content.Context r3 = r5.f1234i
            r9.<init>(r3, r7, r8)
            android.content.Context r3 = r5.f1234i
            int[] r4 = f.j.A2
            androidx.appcompat.widget.u0 r1 = androidx.appcompat.widget.u0.u(r3, r7, r4, r8, r1)
            int r3 = f.j.E2
            r4 = -2
            int r3 = r1.l(r3, r4)
            r5.f1239n = r3
            int r3 = f.j.C2
            android.graphics.drawable.Drawable r3 = r1.f(r3)
            r9.j(r3)
            int r3 = f.j.D2
            java.lang.String r3 = r0.n(r3)
            r9.h(r3)
            r1.v()
            r5.f1238m = r9
            androidx.appcompat.widget.u$a r1 = new androidx.appcompat.widget.u$a
            r1.<init>(r5, r9)
            r5.f1235j = r1
            goto L_0x00ae
        L_0x009e:
            androidx.appcompat.widget.u$c r9 = new androidx.appcompat.widget.u$c
            r9.<init>()
            r5.f1238m = r9
            int r1 = f.j.D2
            java.lang.String r1 = r0.n(r1)
            r9.h(r1)
        L_0x00ae:
            int r9 = f.j.B2
            java.lang.CharSequence[] r9 = r0.p(r9)
            if (r9 == 0) goto L_0x00c6
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r6, r3, r9)
            int r6 = f.g.f8302t
            r1.setDropDownViewResource(r6)
            r5.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00c6:
            r0.v()
            r5.f1237l = r10
            android.widget.SpinnerAdapter r6 = r5.f1236k
            if (r6 == 0) goto L_0x00d4
            r5.setAdapter((android.widget.SpinnerAdapter) r6)
            r5.f1236k = r2
        L_0x00d4:
            androidx.appcompat.widget.e r6 = r5.f1233h
            r6.e(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.u.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
