package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.k;
import androidx.lifecycle.m;

class FragmentManager$6 implements k {

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ String f3075h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ s f3076i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ h f3077j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ n f3078k;

    public void onStateChanged(m mVar, h.a aVar) {
        Bundle bundle;
        if (aVar == h.a.ON_START && (bundle = (Bundle) this.f3078k.f3227j.get(this.f3075h)) != null) {
            this.f3076i.a(this.f3075h, bundle);
            this.f3078k.r(this.f3075h);
        }
        if (aVar == h.a.ON_DESTROY) {
            this.f3077j.c(this);
            this.f3078k.f3228k.remove(this.f3075h);
        }
    }
}
