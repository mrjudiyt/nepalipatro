package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.w0;
import androidx.appcompat.widget.x;
import f.j;

public class ActionMenuItemView extends x implements k.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: l  reason: collision with root package name */
    g f638l;

    /* renamed from: m  reason: collision with root package name */
    private CharSequence f639m;

    /* renamed from: n  reason: collision with root package name */
    private Drawable f640n;

    /* renamed from: o  reason: collision with root package name */
    e.b f641o;

    /* renamed from: p  reason: collision with root package name */
    private f0 f642p;

    /* renamed from: q  reason: collision with root package name */
    b f643q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f644r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f645s;

    /* renamed from: t  reason: collision with root package name */
    private int f646t;

    /* renamed from: u  reason: collision with root package name */
    private int f647u;

    /* renamed from: v  reason: collision with root package name */
    private int f648v;

    private class a extends f0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        public m.e b() {
            b bVar = ActionMenuItemView.this.f643q;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public boolean c() {
            m.e b10;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f641o;
            if (bVar == null || !bVar.a(actionMenuItemView.f638l) || (b10 = b()) == null || !b10.a()) {
                return false;
            }
            return true;
        }
    }

    public static abstract class b {
        public abstract m.e a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void h() {
        CharSequence charSequence;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f639m);
        if (this.f640n != null && (!this.f638l.B() || (!this.f644r && !this.f645s))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        CharSequence charSequence2 = null;
        setText(z12 ? this.f639m : null);
        CharSequence contentDescription = this.f638l.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z12) {
                charSequence = null;
            } else {
                charSequence = this.f638l.getTitle();
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f638l.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z12) {
                charSequence2 = this.f638l.getTitle();
            }
            w0.a(this, charSequence2);
            return;
        }
        w0.a(this, tooltipText);
    }

    public boolean a() {
        return f();
    }

    public boolean b() {
        return f() && this.f638l.getIcon() == null;
    }

    public boolean c() {
        return true;
    }

    public void d(g gVar, int i10) {
        this.f638l = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f642p == null) {
            this.f642p = new a();
        }
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    public g getItemData() {
        return this.f638l;
    }

    public void onClick(View view) {
        e.b bVar = this.f641o;
        if (bVar != null) {
            bVar.a(this.f638l);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f644r = g();
        h();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean f10 = f();
        if (f10 && (i13 = this.f647u) >= 0) {
            super.setPadding(i13, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(size, this.f646t);
        } else {
            i12 = this.f646t;
        }
        if (mode != 1073741824 && this.f646t > 0 && measuredWidth < i12) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }
        if (!f10 && this.f640n != null) {
            super.setPadding((getMeasuredWidth() - this.f640n.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var;
        if (!this.f638l.hasSubMenu() || (f0Var = this.f642p) == null || !f0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f645s != z10) {
            this.f645s = z10;
            g gVar = this.f638l;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f640n = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f648v;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i10) / ((float) intrinsicWidth)));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i10) / ((float) intrinsicHeight)));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        h();
    }

    public void setItemInvoker(e.b bVar) {
        this.f641o = bVar;
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f647u = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f643q = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f639m = charSequence;
        h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f644r = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f8424v, i10, 0);
        this.f646t = obtainStyledAttributes.getDimensionPixelSize(j.f8429w, 0);
        obtainStyledAttributes.recycle();
        this.f648v = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f647u = -1;
        setSaveEnabled(false);
    }
}
