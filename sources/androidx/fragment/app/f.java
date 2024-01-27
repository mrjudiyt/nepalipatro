package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.os.f;
import androidx.core.view.v;
import androidx.fragment.app.x;

/* compiled from: FragmentAnim */
class f {

    /* compiled from: FragmentAnim */
    class a implements f.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f3182a;

        a(Fragment fragment) {
            this.f3182a = fragment;
        }

        public void onCancel() {
            if (this.f3182a.getAnimatingAway() != null) {
                View animatingAway = this.f3182a.getAnimatingAway();
                this.f3182a.setAnimatingAway((View) null);
                animatingAway.clearAnimation();
            }
            this.f3182a.setAnimator((Animator) null);
        }
    }

    /* compiled from: FragmentAnim */
    class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3183a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f3184b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ x.g f3185c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.f f3186d;

        /* compiled from: FragmentAnim */
        class a implements Runnable {
            a() {
            }

            public void run() {
                if (b.this.f3184b.getAnimatingAway() != null) {
                    b.this.f3184b.setAnimatingAway((View) null);
                    b bVar = b.this;
                    bVar.f3185c.a(bVar.f3184b, bVar.f3186d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, x.g gVar, androidx.core.os.f fVar) {
            this.f3183a = viewGroup;
            this.f3184b = fragment;
            this.f3185c = gVar;
            this.f3186d = fVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f3183a.post(new a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: FragmentAnim */
    class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3188a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f3189b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f3190c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ x.g f3191d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.f f3192e;

        c(ViewGroup viewGroup, View view, Fragment fragment, x.g gVar, androidx.core.os.f fVar) {
            this.f3188a = viewGroup;
            this.f3189b = view;
            this.f3190c = fragment;
            this.f3191d = gVar;
            this.f3192e = fVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3188a.endViewTransition(this.f3189b);
            Animator animator2 = this.f3190c.getAnimator();
            this.f3190c.setAnimator((Animator) null);
            if (animator2 != null && this.f3188a.indexOfChild(this.f3189b) < 0) {
                this.f3191d.a(this.f3190c, this.f3192e);
            }
        }
    }

    static void a(Fragment fragment, d dVar, x.g gVar) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        androidx.core.os.f fVar = new androidx.core.os.f();
        fVar.c(new a(fragment));
        gVar.b(fragment, fVar);
        if (dVar.f3193a != null) {
            e eVar = new e(dVar.f3193a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, fVar));
            fragment.mView.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f3194b;
        fragment.setAnimator(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, fVar));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    private static int b(Fragment fragment, boolean z10, boolean z11) {
        if (z11) {
            if (z10) {
                return fragment.getPopEnterAnim();
            }
            return fragment.getPopExitAnim();
        } else if (z10) {
            return fragment.getEnterAnim();
        } else {
            return fragment.getExitAnim();
        }
    }

    static d c(Context context, Fragment fragment, boolean z10, boolean z11) {
        int nextTransition = fragment.getNextTransition();
        int b10 = b(fragment, z10, z11);
        boolean z12 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i10 = l0.b.f9807c;
            if (viewGroup.getTag(i10) != null) {
                fragment.mContainer.setTag(i10, (Object) null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z10, b10);
        if (onCreateAnimation != null) {
            return new d(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z10, b10);
        if (onCreateAnimator != null) {
            return new d(onCreateAnimator);
        }
        if (b10 == 0 && nextTransition != 0) {
            b10 = d(nextTransition, z10);
        }
        if (b10 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(b10));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, b10);
                    if (loadAnimation != null) {
                        return new d(loadAnimation);
                    }
                    z12 = true;
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                }
            }
            if (!z12) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, b10);
                    if (loadAnimator != null) {
                        return new d(loadAnimator);
                    }
                } catch (RuntimeException e11) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, b10);
                        if (loadAnimation2 != null) {
                            return new d(loadAnimation2);
                        }
                    } else {
                        throw e11;
                    }
                }
            }
        }
        return null;
    }

    private static int d(int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? l0.a.f9803e : l0.a.f9804f;
        }
        if (i10 == 4099) {
            return z10 ? l0.a.f9801c : l0.a.f9802d;
        }
        if (i10 != 8194) {
            return -1;
        }
        return z10 ? l0.a.f9799a : l0.a.f9800b;
    }

    /* compiled from: FragmentAnim */
    static class d {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f3193a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f3194b;

        d(Animation animation) {
            this.f3193a = animation;
            this.f3194b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        d(Animator animator) {
            this.f3193a = null;
            this.f3194b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* compiled from: FragmentAnim */
    static class e extends AnimationSet implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        private final ViewGroup f3195h;

        /* renamed from: i  reason: collision with root package name */
        private final View f3196i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f3197j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f3198k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f3199l = true;

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f3195h = viewGroup;
            this.f3196i = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j10, Transformation transformation) {
            this.f3199l = true;
            if (this.f3197j) {
                return !this.f3198k;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f3197j = true;
                v.a(this.f3195h, this);
            }
            return true;
        }

        public void run() {
            if (this.f3197j || !this.f3199l) {
                this.f3195h.endViewTransition(this.f3196i);
                this.f3198k = true;
                return;
            }
            this.f3199l = false;
            this.f3195h.post(this);
        }

        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f3199l = true;
            if (this.f3197j) {
                return !this.f3198k;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f3197j = true;
                v.a(this.f3195h, this);
            }
            return true;
        }
    }
}
