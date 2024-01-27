package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import f.j;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {

    /* renamed from: h  reason: collision with root package name */
    private int f990h;

    /* renamed from: i  reason: collision with root package name */
    private int f991i;

    /* renamed from: j  reason: collision with root package name */
    private WeakReference<View> f992j;

    /* renamed from: k  reason: collision with root package name */
    private LayoutInflater f993k;

    /* renamed from: l  reason: collision with root package name */
    private a f994l;

    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f990h != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f993k;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f990h, viewGroup, false);
            int i10 = this.f991i;
            if (i10 != -1) {
                inflate.setId(i10);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f992j = new WeakReference<>(inflate);
            a aVar = this.f994l;
            if (aVar != null) {
                aVar.a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f991i;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f993k;
    }

    public int getLayoutResource() {
        return this.f990h;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i10) {
        this.f991i = i10;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f993k = layoutInflater;
    }

    public void setLayoutResource(int i10) {
        this.f990h = i10;
    }

    public void setOnInflateListener(a aVar) {
        this.f994l = aVar;
    }

    public void setVisibility(int i10) {
        WeakReference<View> weakReference = this.f992j;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i10);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f990h = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.V3, i10, 0);
        this.f991i = obtainStyledAttributes.getResourceId(j.Y3, -1);
        this.f990h = obtainStyledAttributes.getResourceId(j.X3, 0);
        setId(obtainStyledAttributes.getResourceId(j.W3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
