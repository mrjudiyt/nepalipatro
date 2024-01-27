package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.flutter.plugins.firebase.crashlytics.Constants;
import l0.c;

/* compiled from: FragmentLayoutInflaterFactory */
class l implements LayoutInflater.Factory2 {

    /* renamed from: h  reason: collision with root package name */
    final n f3211h;

    /* compiled from: FragmentLayoutInflaterFactory */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ u f3212h;

        a(u uVar) {
            this.f3212h = uVar;
        }

        public void onViewAttachedToWindow(View view) {
            Fragment k10 = this.f3212h.k();
            this.f3212h.m();
            c0.n((ViewGroup) k10.mView.getParent(), l.this.f3211h).j();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    l(n nVar) {
        this.f3211h = nVar;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        u uVar;
        if (h.class.getName().equals(str)) {
            return new h(context, attributeSet, this.f3211h);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, Constants.CLASS);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f9811d);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(c.f9812e);
        }
        int resourceId = obtainStyledAttributes.getResourceId(c.f9813f, -1);
        String string = obtainStyledAttributes.getString(c.f9814g);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !j.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.f3211h.h0(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f3211h.i0(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.f3211h.h0(id);
        }
        if (fragment == null) {
            fragment = this.f3211h.q0().a(context.getClassLoader(), attributeValue);
            fragment.mFromLayout = true;
            fragment.mFragmentId = resourceId != 0 ? resourceId : id;
            fragment.mContainerId = id;
            fragment.mTag = string;
            fragment.mInLayout = true;
            n nVar = this.f3211h;
            fragment.mFragmentManager = nVar;
            fragment.mHost = nVar.t0();
            fragment.onInflate(this.f3211h.t0().f(), attributeSet, fragment.mSavedFragmentState);
            uVar = this.f3211h.g(fragment);
            if (n.F0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(fragment);
                sb.append(" has been inflated via the <fragment> tag: id=0x");
                sb.append(Integer.toHexString(resourceId));
            }
        } else if (!fragment.mInLayout) {
            fragment.mInLayout = true;
            n nVar2 = this.f3211h;
            fragment.mFragmentManager = nVar2;
            fragment.mHost = nVar2.t0();
            fragment.onInflate(this.f3211h.t0().f(), attributeSet, fragment.mSavedFragmentState);
            uVar = this.f3211h.w(fragment);
            if (n.F0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Retained Fragment ");
                sb2.append(fragment);
                sb2.append(" has been re-attached via the <fragment> tag: id=0x");
                sb2.append(Integer.toHexString(resourceId));
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
        fragment.mContainer = (ViewGroup) view;
        uVar.m();
        uVar.j();
        View view2 = fragment.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.mView.getTag() == null) {
                fragment.mView.setTag(string);
            }
            fragment.mView.addOnAttachStateChangeListener(new a(uVar));
            return fragment.mView;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}
