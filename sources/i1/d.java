package i1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.z;

/* compiled from: Fade */
public class d extends j0 {

    /* compiled from: Fade */
    class a extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f9111a;

        a(View view) {
            this.f9111a = view;
        }

        public void b(m mVar) {
            c0.g(this.f9111a, 1.0f);
            c0.a(this.f9111a);
            mVar.R(this);
        }
    }

    /* compiled from: Fade */
    private static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final View f9113a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f9114b = false;

        b(View view) {
            this.f9113a = view;
        }

        public void onAnimationEnd(Animator animator) {
            c0.g(this.f9113a, 1.0f);
            if (this.f9114b) {
                this.f9113a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (z.B(this.f9113a) && this.f9113a.getLayerType() == 0) {
                this.f9114b = true;
                this.f9113a.setLayerType(2, (Paint) null);
            }
        }
    }

    public d(int i10) {
        k0(i10);
    }

    private Animator l0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        c0.g(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, c0.f9109b, new float[]{f11});
        ofFloat.addListener(new b(view));
        a(new a(view));
        return ofFloat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.f9209a.get("android:fade:transitionAlpha");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float m0(i1.s r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f9209a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.d.m0(i1.s, float):float");
    }

    public Animator g0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float f10 = 0.0f;
        float m02 = m0(sVar, 0.0f);
        if (m02 != 1.0f) {
            f10 = m02;
        }
        return l0(view, f10, 1.0f);
    }

    public Animator i0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        c0.e(view);
        return l0(view, m0(sVar, 1.0f), 0.0f);
    }

    public void l(s sVar) {
        super.l(sVar);
        sVar.f9209a.put("android:fade:transitionAlpha", Float.valueOf(c0.c(sVar.f9210b)));
    }
}
