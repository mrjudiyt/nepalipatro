package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzarn extends zzarm {
    protected zzarn(Context context, String str, boolean z10) {
        super(context, str, z10);
    }

    public static zzarn zzt(String str, Context context, boolean z10) {
        zzarm.zzr(context, false);
        return new zzarn(context, str, false);
    }

    @Deprecated
    public static zzarn zzu(String str, Context context, boolean z10, int i10) {
        zzarm.zzr(context, z10);
        return new zzarn(context, str, z10);
    }

    /* access modifiers changed from: protected */
    public final List zzp(zzasp zzasp, Context context, zzaom zzaom, zzaof zzaof) {
        if (zzasp.zzk() == null || !this.zzu) {
            return super.zzp(zzasp, context, zzaom, (zzaof) null);
        }
        int zza = zzasp.zza();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zzp(zzasp, context, zzaom, (zzaof) null));
        arrayList.add(new zzath(zzasp, "9mv9Ihk+HlE8P3WJWSjhrxWrdB7cEu1gaxdteA5kBJ6DKumpWYk1Q5Vf8aocVg4i", "s7rU1m4XsqJ83s2reIjdkboWJYkg+gYouDrDcn3Ghpw=", zzaom, zza, 24));
        return arrayList;
    }
}
