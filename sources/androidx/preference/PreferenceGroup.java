package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.collection.h;
import androidx.core.content.res.k;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.List;
import t0.g;

public abstract class PreferenceGroup extends Preference {
    final h<String, Long> O;
    private final Handler P;
    private final List<Preference> Q;
    private boolean R;
    private int S;
    private boolean T;
    private int U;
    private b V;
    private final Runnable W;

    class a implements Runnable {
        a() {
        }

        public void run() {
            synchronized (this) {
                PreferenceGroup.this.O.clear();
            }
        }
    }

    public interface b {
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.O = new h<>();
        this.P = new Handler(Looper.getMainLooper());
        this.R = true;
        this.S = 0;
        this.T = false;
        this.U = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.V = null;
        this.W = new a();
        this.Q = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f11563v0, i10, i11);
        int i12 = g.f11567x0;
        this.R = k.b(obtainStyledAttributes, i12, i12, true);
        int i13 = g.f11565w0;
        if (obtainStyledAttributes.hasValue(i13)) {
            M(k.d(obtainStyledAttributes, i13, i13, Api.BaseClientBuilder.API_PRIORITY_OTHER));
        }
        obtainStyledAttributes.recycle();
    }

    public Preference K(int i10) {
        return this.Q.get(i10);
    }

    public int L() {
        return this.Q.size();
    }

    public void M(int i10) {
        if (i10 != Integer.MAX_VALUE && !t()) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" should have a key defined if it contains an expandable preference");
        }
        this.U = i10;
    }

    public void x(boolean z10) {
        super.x(z10);
        int L = L();
        for (int i10 = 0; i10 < L; i10++) {
            K(i10).B(this, z10);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
