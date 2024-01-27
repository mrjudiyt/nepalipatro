package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.z;
import androidx.fragment.app.c0;
import androidx.lifecycle.h;
import androidx.lifecycle.l0;
import com.facebook.internal.AnalyticsEvents;

/* compiled from: FragmentStateManager */
class u {

    /* renamed from: a  reason: collision with root package name */
    private final m f3296a;

    /* renamed from: b  reason: collision with root package name */
    private final v f3297b;

    /* renamed from: c  reason: collision with root package name */
    private final Fragment f3298c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3299d = false;

    /* renamed from: e  reason: collision with root package name */
    private int f3300e = -1;

    /* compiled from: FragmentStateManager */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ View f3301h;

        a(View view) {
            this.f3301h = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f3301h.removeOnAttachStateChangeListener(this);
            z.P(this.f3301h);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: FragmentStateManager */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3303a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.h$b[] r0 = androidx.lifecycle.h.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3303a = r0
                androidx.lifecycle.h$b r1 = androidx.lifecycle.h.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3303a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.h$b r1 = androidx.lifecycle.h.b.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3303a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.h$b r1 = androidx.lifecycle.h.b.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3303a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.h$b r1 = androidx.lifecycle.h.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.u.b.<clinit>():void");
        }
    }

    u(m mVar, v vVar, Fragment fragment) {
        this.f3296a = mVar;
        this.f3297b = vVar;
        this.f3298c = fragment;
    }

    private boolean l(View view) {
        if (view == this.f3298c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f3298c.mView) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f3298c.performSaveInstanceState(bundle);
        this.f3296a.j(this.f3298c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f3298c.mView != null) {
            s();
        }
        if (this.f3298c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f3298c.mSavedViewState);
        }
        if (this.f3298c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f3298c.mSavedViewRegistryState);
        }
        if (!this.f3298c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f3298c.mUserVisibleHint);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (n.F0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ACTIVITY_CREATED: ");
            sb.append(this.f3298c);
        }
        Fragment fragment = this.f3298c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        m mVar = this.f3296a;
        Fragment fragment2 = this.f3298c;
        mVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int j10 = this.f3297b.j(this.f3298c);
        Fragment fragment = this.f3298c;
        fragment.mContainer.addView(fragment.mView, j10);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (n.F0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ATTACHED: ");
            sb.append(this.f3298c);
        }
        Fragment fragment = this.f3298c;
        Fragment fragment2 = fragment.mTarget;
        u uVar = null;
        if (fragment2 != null) {
            u m10 = this.f3297b.m(fragment2.mWho);
            if (m10 != null) {
                Fragment fragment3 = this.f3298c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                uVar = m10;
            } else {
                throw new IllegalStateException("Fragment " + this.f3298c + " declared target fragment " + this.f3298c.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (uVar = this.f3297b.m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f3298c + " declared target fragment " + this.f3298c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (uVar != null && (n.P || uVar.k().mState < 1)) {
            uVar.m();
        }
        Fragment fragment4 = this.f3298c;
        fragment4.mHost = fragment4.mFragmentManager.t0();
        Fragment fragment5 = this.f3298c;
        fragment5.mParentFragment = fragment5.mFragmentManager.w0();
        this.f3296a.g(this.f3298c, false);
        this.f3298c.performAttach();
        this.f3296a.b(this.f3298c, false);
    }

    /* access modifiers changed from: package-private */
    public int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f3298c;
        if (fragment2.mFragmentManager == null) {
            return fragment2.mState;
        }
        int i10 = this.f3300e;
        int i11 = b.f3303a[fragment2.mMaxState.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                i10 = Math.min(i10, 5);
            } else if (i11 == 3) {
                i10 = Math.min(i10, 1);
            } else if (i11 != 4) {
                i10 = Math.min(i10, -1);
            } else {
                i10 = Math.min(i10, 0);
            }
        }
        Fragment fragment3 = this.f3298c;
        if (fragment3.mFromLayout) {
            if (fragment3.mInLayout) {
                i10 = Math.max(this.f3300e, 2);
                View view = this.f3298c.mView;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f3300e < 4 ? Math.min(i10, fragment3.mState) : Math.min(i10, 1);
            }
        }
        if (!this.f3298c.mAdded) {
            i10 = Math.min(i10, 1);
        }
        c0.e.b bVar = null;
        if (n.P && (viewGroup = fragment.mContainer) != null) {
            bVar = c0.n(viewGroup, (fragment = this.f3298c).getParentFragmentManager()).l(this);
        }
        if (bVar == c0.e.b.ADDING) {
            i10 = Math.min(i10, 6);
        } else if (bVar == c0.e.b.REMOVING) {
            i10 = Math.max(i10, 3);
        } else {
            Fragment fragment4 = this.f3298c;
            if (fragment4.mRemoving) {
                if (fragment4.isInBackStack()) {
                    i10 = Math.min(i10, 1);
                } else {
                    i10 = Math.min(i10, -1);
                }
            }
        }
        Fragment fragment5 = this.f3298c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i10 = Math.min(i10, 4);
        }
        if (n.F0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("computeExpectedState() of ");
            sb.append(i10);
            sb.append(" for ");
            sb.append(this.f3298c);
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (n.F0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATED: ");
            sb.append(this.f3298c);
        }
        Fragment fragment = this.f3298c;
        if (!fragment.mIsCreated) {
            this.f3296a.h(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.f3298c;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            m mVar = this.f3296a;
            Fragment fragment3 = this.f3298c;
            mVar.c(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.f3298c.mState = 1;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        String str;
        if (!this.f3298c.mFromLayout) {
            if (n.F0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.f3298c);
            }
            Fragment fragment = this.f3298c;
            LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
            ViewGroup viewGroup = null;
            Fragment fragment2 = this.f3298c;
            ViewGroup viewGroup2 = fragment2.mContainer;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i10 = fragment2.mContainerId;
                if (i10 != 0) {
                    if (i10 != -1) {
                        viewGroup = (ViewGroup) fragment2.mFragmentManager.o0().c(this.f3298c.mContainerId);
                        if (viewGroup == null) {
                            Fragment fragment3 = this.f3298c;
                            if (!fragment3.mRestored) {
                                try {
                                    str = fragment3.getResources().getResourceName(this.f3298c.mContainerId);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f3298c.mContainerId) + " (" + str + ") for fragment " + this.f3298c);
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create fragment " + this.f3298c + " for a container view with no id");
                    }
                }
            }
            Fragment fragment4 = this.f3298c;
            fragment4.mContainer = viewGroup;
            fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
            View view = this.f3298c.mView;
            if (view != null) {
                boolean z10 = false;
                view.setSaveFromParentEnabled(false);
                Fragment fragment5 = this.f3298c;
                fragment5.mView.setTag(l0.b.f9805a, fragment5);
                if (viewGroup != null) {
                    b();
                }
                Fragment fragment6 = this.f3298c;
                if (fragment6.mHidden) {
                    fragment6.mView.setVisibility(8);
                }
                if (z.E(this.f3298c.mView)) {
                    z.P(this.f3298c.mView);
                } else {
                    View view2 = this.f3298c.mView;
                    view2.addOnAttachStateChangeListener(new a(view2));
                }
                this.f3298c.performViewCreated();
                m mVar = this.f3296a;
                Fragment fragment7 = this.f3298c;
                mVar.m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
                int visibility = this.f3298c.mView.getVisibility();
                float alpha = this.f3298c.mView.getAlpha();
                if (n.P) {
                    this.f3298c.setPostOnViewCreatedAlpha(alpha);
                    Fragment fragment8 = this.f3298c;
                    if (fragment8.mContainer != null && visibility == 0) {
                        View findFocus = fragment8.mView.findFocus();
                        if (findFocus != null) {
                            this.f3298c.setFocusedView(findFocus);
                            if (n.F0(2)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("requestFocus: Saved focused view ");
                                sb2.append(findFocus);
                                sb2.append(" for Fragment ");
                                sb2.append(this.f3298c);
                            }
                        }
                        this.f3298c.mView.setAlpha(0.0f);
                    }
                } else {
                    Fragment fragment9 = this.f3298c;
                    if (visibility == 0 && fragment9.mContainer != null) {
                        z10 = true;
                    }
                    fragment9.mIsNewlyAdded = z10;
                }
            }
            this.f3298c.mState = 2;
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        Fragment f10;
        if (n.F0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATED: ");
            sb.append(this.f3298c);
        }
        Fragment fragment = this.f3298c;
        boolean z10 = true;
        boolean z11 = fragment.mRemoving && !fragment.isInBackStack();
        if (z11 || this.f3297b.o().p(this.f3298c)) {
            k<?> kVar = this.f3298c.mHost;
            if (kVar instanceof l0) {
                z10 = this.f3297b.o().m();
            } else if (kVar.f() instanceof Activity) {
                z10 = true ^ ((Activity) kVar.f()).isChangingConfigurations();
            }
            if (z11 || z10) {
                this.f3297b.o().g(this.f3298c);
            }
            this.f3298c.performDestroy();
            this.f3296a.d(this.f3298c, false);
            for (u next : this.f3297b.k()) {
                if (next != null) {
                    Fragment k10 = next.k();
                    if (this.f3298c.mWho.equals(k10.mTargetWho)) {
                        k10.mTarget = this.f3298c;
                        k10.mTargetWho = null;
                    }
                }
            }
            Fragment fragment2 = this.f3298c;
            String str = fragment2.mTargetWho;
            if (str != null) {
                fragment2.mTarget = this.f3297b.f(str);
            }
            this.f3297b.q(this);
            return;
        }
        String str2 = this.f3298c.mTargetWho;
        if (!(str2 == null || (f10 = this.f3297b.f(str2)) == null || !f10.mRetainInstance)) {
            this.f3298c.mTarget = f10;
        }
        this.f3298c.mState = 0;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        View view;
        if (n.F0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATE_VIEW: ");
            sb.append(this.f3298c);
        }
        Fragment fragment = this.f3298c;
        ViewGroup viewGroup = fragment.mContainer;
        if (!(viewGroup == null || (view = fragment.mView) == null)) {
            viewGroup.removeView(view);
        }
        this.f3298c.performDestroyView();
        this.f3296a.n(this.f3298c, false);
        Fragment fragment2 = this.f3298c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.setValue(null);
        this.f3298c.mInLayout = false;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (n.F0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom ATTACHED: ");
            sb.append(this.f3298c);
        }
        this.f3298c.performDetach();
        boolean z10 = false;
        this.f3296a.e(this.f3298c, false);
        Fragment fragment = this.f3298c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z10 = true;
        }
        if (z10 || this.f3297b.o().p(this.f3298c)) {
            if (n.F0(3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("initState called for fragment: ");
                sb2.append(this.f3298c);
            }
            this.f3298c.initState();
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        Fragment fragment = this.f3298c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (n.F0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.f3298c);
            }
            Fragment fragment2 = this.f3298c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), (ViewGroup) null, this.f3298c.mSavedFragmentState);
            View view = this.f3298c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f3298c;
                fragment3.mView.setTag(l0.b.f9805a, fragment3);
                Fragment fragment4 = this.f3298c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f3298c.performViewCreated();
                m mVar = this.f3296a;
                Fragment fragment5 = this.f3298c;
                mVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f3298c.mState = 2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment k() {
        return this.f3298c;
    }

    /* access modifiers changed from: package-private */
    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f3299d) {
            boolean z10 = false;
            z10 = true;
            try {
                while (true) {
                    int d10 = d();
                    Fragment fragment = this.f3298c;
                    int i10 = fragment.mState;
                    if (d10 != i10) {
                        if (d10 <= i10) {
                            switch (i10 - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    g();
                                    break;
                                case 1:
                                    h();
                                    this.f3298c.mState = z10 ? 1 : 0;
                                    break;
                                case 2:
                                    fragment.mInLayout = z10;
                                    fragment.mState = 2;
                                    break;
                                case 3:
                                    if (n.F0(3)) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("movefrom ACTIVITY_CREATED: ");
                                        sb.append(this.f3298c);
                                    }
                                    Fragment fragment2 = this.f3298c;
                                    if (fragment2.mView != null && fragment2.mSavedViewState == null) {
                                        s();
                                    }
                                    Fragment fragment3 = this.f3298c;
                                    if (!(fragment3.mView == null || (viewGroup2 = fragment3.mContainer) == null)) {
                                        c0.n(viewGroup2, fragment3.getParentFragmentManager()).d(this);
                                    }
                                    this.f3298c.mState = 3;
                                    break;
                                case 4:
                                    v();
                                    break;
                                case 5:
                                    fragment.mState = 5;
                                    break;
                                case 6:
                                    n();
                                    break;
                            }
                        } else {
                            switch (i10 + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(fragment.mView == null || (viewGroup3 = fragment.mContainer) == null)) {
                                        c0.n(viewGroup3, fragment.getParentFragmentManager()).b(c0.e.c.d(this.f3298c.mView.getVisibility()), this);
                                    }
                                    this.f3298c.mState = 4;
                                    break;
                                case 5:
                                    u();
                                    break;
                                case 6:
                                    fragment.mState = 6;
                                    break;
                                case 7:
                                    p();
                                    break;
                            }
                        }
                    } else {
                        if (n.P && fragment.mHiddenChanged) {
                            if (!(fragment.mView == null || (viewGroup = fragment.mContainer) == null)) {
                                c0 n10 = c0.n(viewGroup, fragment.getParentFragmentManager());
                                if (this.f3298c.mHidden) {
                                    n10.c(this);
                                } else {
                                    n10.e(this);
                                }
                            }
                            Fragment fragment4 = this.f3298c;
                            n nVar = fragment4.mFragmentManager;
                            if (nVar != null) {
                                nVar.D0(fragment4);
                            }
                            Fragment fragment5 = this.f3298c;
                            fragment5.mHiddenChanged = z10;
                            fragment5.onHiddenChanged(fragment5.mHidden);
                        }
                        this.f3299d = z10;
                        return;
                    }
                }
            } finally {
                this.f3299d = z10;
            }
        } else if (n.F0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Ignoring re-entrant call to moveToExpectedState() for ");
            sb2.append(k());
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
        if (n.F0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom RESUMED: ");
            sb.append(this.f3298c);
        }
        this.f3298c.performPause();
        this.f3296a.f(this.f3298c, false);
    }

    /* access modifiers changed from: package-private */
    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f3298c.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f3298c;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f3298c;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
            Fragment fragment3 = this.f3298c;
            fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
            Fragment fragment4 = this.f3298c;
            if (fragment4.mTargetWho != null) {
                fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.f3298c;
            Boolean bool = fragment5.mSavedUserVisibleHint;
            if (bool != null) {
                fragment5.mUserVisibleHint = bool.booleanValue();
                this.f3298c.mSavedUserVisibleHint = null;
            } else {
                fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.f3298c;
            if (!fragment6.mUserVisibleHint) {
                fragment6.mDeferStart = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        if (n.F0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESUMED: ");
            sb.append(this.f3298c);
        }
        View focusedView = this.f3298c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (n.F0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(requestFocus ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f3298c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f3298c.mView.findFocus());
            }
        }
        this.f3298c.setFocusedView((View) null);
        this.f3298c.performResume();
        this.f3296a.i(this.f3298c, false);
        Fragment fragment = this.f3298c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* access modifiers changed from: package-private */
    public t r() {
        t tVar = new t(this.f3298c);
        Fragment fragment = this.f3298c;
        if (fragment.mState <= -1 || tVar.f3295t != null) {
            tVar.f3295t = fragment.mSavedFragmentState;
        } else {
            Bundle q10 = q();
            tVar.f3295t = q10;
            if (this.f3298c.mTargetWho != null) {
                if (q10 == null) {
                    tVar.f3295t = new Bundle();
                }
                tVar.f3295t.putString("android:target_state", this.f3298c.mTargetWho);
                int i10 = this.f3298c.mTargetRequestCode;
                if (i10 != 0) {
                    tVar.f3295t.putInt("android:target_req_state", i10);
                }
            }
        }
        return tVar;
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (this.f3298c.mView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f3298c.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f3298c.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f3298c.mViewLifecycleOwner.e(bundle);
            if (!bundle.isEmpty()) {
                this.f3298c.mSavedViewRegistryState = bundle;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void t(int i10) {
        this.f3300e = i10;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        if (n.F0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto STARTED: ");
            sb.append(this.f3298c);
        }
        this.f3298c.performStart();
        this.f3296a.k(this.f3298c, false);
    }

    /* access modifiers changed from: package-private */
    public void v() {
        if (n.F0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom STARTED: ");
            sb.append(this.f3298c);
        }
        this.f3298c.performStop();
        this.f3296a.l(this.f3298c, false);
    }

    u(m mVar, v vVar, ClassLoader classLoader, j jVar, t tVar) {
        this.f3296a = mVar;
        this.f3297b = vVar;
        Fragment a10 = jVar.a(classLoader, tVar.f3283h);
        this.f3298c = a10;
        Bundle bundle = tVar.f3292q;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a10.setArguments(tVar.f3292q);
        a10.mWho = tVar.f3284i;
        a10.mFromLayout = tVar.f3285j;
        a10.mRestored = true;
        a10.mFragmentId = tVar.f3286k;
        a10.mContainerId = tVar.f3287l;
        a10.mTag = tVar.f3288m;
        a10.mRetainInstance = tVar.f3289n;
        a10.mRemoving = tVar.f3290o;
        a10.mDetached = tVar.f3291p;
        a10.mHidden = tVar.f3293r;
        a10.mMaxState = h.b.values()[tVar.f3294s];
        Bundle bundle2 = tVar.f3295t;
        if (bundle2 != null) {
            a10.mSavedFragmentState = bundle2;
        } else {
            a10.mSavedFragmentState = new Bundle();
        }
        if (n.F0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(a10);
        }
    }

    u(m mVar, v vVar, Fragment fragment, t tVar) {
        this.f3296a = mVar;
        this.f3297b = vVar;
        this.f3298c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = tVar.f3295t;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
