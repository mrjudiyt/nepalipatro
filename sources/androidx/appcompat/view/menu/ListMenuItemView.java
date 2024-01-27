package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.u0;
import androidx.core.view.z;
import f.a;
import f.f;
import f.g;
import f.j;

public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: h  reason: collision with root package name */
    private g f653h;

    /* renamed from: i  reason: collision with root package name */
    private ImageView f654i;

    /* renamed from: j  reason: collision with root package name */
    private RadioButton f655j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f656k;

    /* renamed from: l  reason: collision with root package name */
    private CheckBox f657l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f658m;

    /* renamed from: n  reason: collision with root package name */
    private ImageView f659n;

    /* renamed from: o  reason: collision with root package name */
    private ImageView f660o;

    /* renamed from: p  reason: collision with root package name */
    private LinearLayout f661p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f662q;

    /* renamed from: r  reason: collision with root package name */
    private int f663r;

    /* renamed from: s  reason: collision with root package name */
    private Context f664s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f665t;

    /* renamed from: u  reason: collision with root package name */
    private Drawable f666u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f667v;

    /* renamed from: w  reason: collision with root package name */
    private LayoutInflater f668w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f669x;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.C);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f661p;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(g.f8290h, this, false);
        this.f657l = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(g.f8291i, this, false);
        this.f654i = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(g.f8293k, this, false);
        this.f655j = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f668w == null) {
            this.f668w = LayoutInflater.from(getContext());
        }
        return this.f668w;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f659n;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f660o;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f660o.getLayoutParams();
            rect.top += this.f660o.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public boolean c() {
        return false;
    }

    public void d(g gVar, int i10) {
        this.f653h = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    public g getItemData() {
        return this.f653h;
    }

    public void h(boolean z10, char c10) {
        int i10 = (!z10 || !this.f653h.A()) ? 8 : 0;
        if (i10 == 0) {
            this.f658m.setText(this.f653h.h());
        }
        if (this.f658m.getVisibility() != i10) {
            this.f658m.setVisibility(i10);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        z.T(this, this.f662q);
        TextView textView = (TextView) findViewById(f.M);
        this.f656k = textView;
        int i10 = this.f663r;
        if (i10 != -1) {
            textView.setTextAppearance(this.f664s, i10);
        }
        this.f658m = (TextView) findViewById(f.F);
        ImageView imageView = (ImageView) findViewById(f.I);
        this.f659n = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f666u);
        }
        this.f660o = (ImageView) findViewById(f.f8274r);
        this.f661p = (LinearLayout) findViewById(f.f8268l);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        if (this.f654i != null && this.f665t) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f654i.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z10 || this.f655j != null || this.f657l != null) {
            if (this.f653h.m()) {
                if (this.f655j == null) {
                    g();
                }
                compoundButton2 = this.f655j;
                compoundButton = this.f657l;
            } else {
                if (this.f657l == null) {
                    e();
                }
                compoundButton2 = this.f657l;
                compoundButton = this.f655j;
            }
            if (z10) {
                compoundButton2.setChecked(this.f653h.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f657l;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f655j;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f653h.m()) {
            if (this.f655j == null) {
                g();
            }
            compoundButton = this.f655j;
        } else {
            if (this.f657l == null) {
                e();
            }
            compoundButton = this.f657l;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f669x = z10;
        this.f665t = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f660o;
        if (imageView != null) {
            imageView.setVisibility((this.f667v || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f653h.z() || this.f669x;
        if (z10 || this.f665t) {
            ImageView imageView = this.f654i;
            if (imageView != null || drawable != null || this.f665t) {
                if (imageView == null) {
                    f();
                }
                if (drawable != null || this.f665t) {
                    ImageView imageView2 = this.f654i;
                    if (!z10) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f654i.getVisibility() != 0) {
                        this.f654i.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f654i.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f656k.setText(charSequence);
            if (this.f656k.getVisibility() != 0) {
                this.f656k.setVisibility(0);
            }
        } else if (this.f656k.getVisibility() != 8) {
            this.f656k.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        u0 u10 = u0.u(getContext(), attributeSet, j.W1, i10, 0);
        this.f662q = u10.f(j.Y1);
        this.f663r = u10.m(j.X1, -1);
        this.f665t = u10.a(j.Z1, false);
        this.f664s = context;
        this.f666u = u10.f(j.f8322a2);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, a.f8209z, 0);
        this.f667v = obtainStyledAttributes.hasValue(0);
        u10.v();
        obtainStyledAttributes.recycle();
    }
}
