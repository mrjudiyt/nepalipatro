package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzarl implements zzark {
    protected static volatile zzasp zza;
    protected MotionEvent zzb;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected boolean zzp = false;
    protected DisplayMetrics zzq;
    protected zzash zzr;
    private double zzs;
    private double zzt;
    private boolean zzu = false;

    protected zzarl(Context context) {
        try {
            zzaqd.zzd();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) zzba.zzc().zzb(zzbci.zzcw)).booleanValue()) {
                this.zzr = new zzash();
            }
        } catch (Throwable unused) {
        }
    }

    private final void zzj() {
        this.zzh = 0;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzj = 0;
        if (!this.zzc.isEmpty()) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.zzc.clear();
        } else {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.zzb = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ad A[SYNTHETIC, Splitter:B:44:0x00ad] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String zzm(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24, byte[] r25) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r22
            r3 = r23
            r4 = r24
            long r5 = java.lang.System.currentTimeMillis()
            com.google.android.gms.internal.ads.zzbca r7 = com.google.android.gms.internal.ads.zzbci.zzco
            com.google.android.gms.internal.ads.zzbcg r8 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r7 = r8.zzb(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = 0
            if (r7 == 0) goto L_0x0030
            com.google.android.gms.internal.ads.zzasp r9 = zza
            if (r9 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.zzasp r9 = zza
            com.google.android.gms.internal.ads.zzarj r9 = r9.zzd()
            goto L_0x002d
        L_0x002c:
            r9 = r8
        L_0x002d:
            java.lang.String r10 = "be"
            goto L_0x0032
        L_0x0030:
            r9 = r8
            r10 = r9
        L_0x0032:
            r14 = 1
            r15 = 2
            r13 = 3
            if (r2 != r13) goto L_0x004e
            com.google.android.gms.internal.ads.zzaom r8 = r1.zzb(r0, r3, r4)     // Catch:{ Exception -> 0x0049 }
            r1.zzu = r14     // Catch:{ Exception -> 0x0042 }
            r0 = 1002(0x3ea, float:1.404E-42)
            r12 = 1002(0x3ea, float:1.404E-42)
            goto L_0x0063
        L_0x0042:
            r0 = move-exception
            r17 = r0
            r1 = 3
            r18 = 1
            goto L_0x0082
        L_0x0049:
            r0 = move-exception
            r1 = 3
            r18 = 1
            goto L_0x0080
        L_0x004e:
            if (r2 != r15) goto L_0x005a
            com.google.android.gms.internal.ads.zzaom r0 = r1.zzd(r0, r3, r4)     // Catch:{ Exception -> 0x0049 }
            r3 = 1008(0x3f0, float:1.413E-42)
            r8 = r0
            r12 = 1008(0x3f0, float:1.413E-42)
            goto L_0x0063
        L_0x005a:
            com.google.android.gms.internal.ads.zzaom r0 = r1.zzc(r0, r8)     // Catch:{ Exception -> 0x0049 }
            r3 = 1000(0x3e8, float:1.401E-42)
            r8 = r0
            r12 = 1000(0x3e8, float:1.401E-42)
        L_0x0063:
            if (r7 == 0) goto L_0x007d
            if (r9 == 0) goto L_0x007d
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0049 }
            long r3 = r3 - r5
            r0 = -1
            r17 = 0
            r11 = r9
            r1 = 3
            r13 = r0
            r18 = 1
            r14 = r3
            r16 = r10
            r11.zzc(r12, r13, r14, r16, r17)     // Catch:{ Exception -> 0x007b }
            goto L_0x007e
        L_0x007b:
            r0 = move-exception
            goto L_0x0080
        L_0x007d:
            r1 = 3
        L_0x007e:
            r3 = 2
            goto L_0x00a7
        L_0x0080:
            r17 = r0
        L_0x0082:
            if (r7 == 0) goto L_0x007e
            if (r9 == 0) goto L_0x007e
            if (r2 != r1) goto L_0x008e
            r0 = 1003(0x3eb, float:1.406E-42)
            r3 = 2
            r12 = 1003(0x3eb, float:1.406E-42)
            goto L_0x009b
        L_0x008e:
            r3 = 2
            if (r2 != r3) goto L_0x0096
            r0 = 1009(0x3f1, float:1.414E-42)
            r12 = 1009(0x3f1, float:1.414E-42)
            goto L_0x009b
        L_0x0096:
            r0 = 1001(0x3e9, float:1.403E-42)
            r2 = 1
            r12 = 1001(0x3e9, float:1.403E-42)
        L_0x009b:
            r13 = -1
            long r14 = java.lang.System.currentTimeMillis()
            long r14 = r14 - r5
            r11 = r9
            r16 = r10
            r11.zzc(r12, r13, r14, r16, r17)
        L_0x00a7:
            long r4 = java.lang.System.currentTimeMillis()
            if (r8 == 0) goto L_0x00f2
            com.google.android.gms.internal.ads.zzgtz r0 = r8.zzal()     // Catch:{ Exception -> 0x00f8 }
            com.google.android.gms.internal.ads.zzapj r0 = (com.google.android.gms.internal.ads.zzapj) r0     // Catch:{ Exception -> 0x00f8 }
            int r0 = r0.zzaz()     // Catch:{ Exception -> 0x00f8 }
            if (r0 != 0) goto L_0x00ba
            goto L_0x00f2
        L_0x00ba:
            com.google.android.gms.internal.ads.zzgtz r0 = r8.zzal()     // Catch:{ Exception -> 0x00f8 }
            com.google.android.gms.internal.ads.zzapj r0 = (com.google.android.gms.internal.ads.zzapj) r0     // Catch:{ Exception -> 0x00f8 }
            int r6 = com.google.android.gms.internal.ads.zzaqd.zzc     // Catch:{ Exception -> 0x00f8 }
            byte[] r0 = r0.zzax()     // Catch:{ Exception -> 0x00f8 }
            r6 = r21
            java.lang.String r0 = com.google.android.gms.internal.ads.zzaqd.zza(r0, r6)     // Catch:{ Exception -> 0x00f8 }
            if (r7 == 0) goto L_0x0123
            if (r9 == 0) goto L_0x0123
            if (r2 != r1) goto L_0x00d7
            r6 = 1006(0x3ee, float:1.41E-42)
            r12 = 1006(0x3ee, float:1.41E-42)
            goto L_0x00e2
        L_0x00d7:
            if (r2 != r3) goto L_0x00de
            r6 = 1010(0x3f2, float:1.415E-42)
            r12 = 1010(0x3f2, float:1.415E-42)
            goto L_0x00e2
        L_0x00de:
            r6 = 1004(0x3ec, float:1.407E-42)
            r12 = 1004(0x3ec, float:1.407E-42)
        L_0x00e2:
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00f8 }
            long r14 = r13 - r4
            r13 = -1
            r17 = 0
            r11 = r9
            r16 = r10
            r11.zzc(r12, r13, r14, r16, r17)     // Catch:{ Exception -> 0x00f8 }
            goto L_0x0123
        L_0x00f2:
            r0 = 5
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ Exception -> 0x00f8 }
            goto L_0x0123
        L_0x00f8:
            r0 = move-exception
            r17 = r0
            r0 = 7
            java.lang.String r0 = java.lang.Integer.toString(r0)
            if (r7 == 0) goto L_0x0123
            if (r9 == 0) goto L_0x0123
            if (r2 != r1) goto L_0x010b
            r1 = 1007(0x3ef, float:1.411E-42)
            r12 = 1007(0x3ef, float:1.411E-42)
            goto L_0x0116
        L_0x010b:
            if (r2 != r3) goto L_0x0112
            r1 = 1011(0x3f3, float:1.417E-42)
            r12 = 1011(0x3f3, float:1.417E-42)
            goto L_0x0116
        L_0x0112:
            r1 = 1005(0x3ed, float:1.408E-42)
            r12 = 1005(0x3ed, float:1.408E-42)
        L_0x0116:
            r13 = -1
            long r1 = java.lang.System.currentTimeMillis()
            long r14 = r1 - r4
            r11 = r9
            r16 = r10
            r11.zzc(r12, r13, r14, r16, r17)
        L_0x0123:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarl.zzm(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    /* access modifiers changed from: protected */
    public abstract long zza(StackTraceElement[] stackTraceElementArr);

    /* access modifiers changed from: protected */
    public abstract zzaom zzb(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    public abstract zzaom zzc(Context context, zzaof zzaof);

    /* access modifiers changed from: protected */
    public abstract zzaom zzd(Context context, View view, Activity activity);

    public final String zze(Context context, String str, View view) {
        return zzm(context, str, 3, view, (Activity) null, (byte[]) null);
    }

    public final String zzf(Context context, String str, View view, Activity activity) {
        return zzm(context, str, 3, view, activity, (byte[]) null);
    }

    public final String zzg(Context context) {
        if (!zzass.zzc()) {
            return zzm(context, (String) null, 1, (View) null, (Activity) null, (byte[]) null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    public final String zzh(Context context, View view, Activity activity) {
        return zzm(context, (String) null, 2, view, activity, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    public abstract zzasr zzi(MotionEvent motionEvent);

    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l10;
        if (this.zzu) {
            zzj();
            this.zzu = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzk = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            this.zzs = (double) motionEvent.getRawX();
            this.zzt = (double) motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = (double) motionEvent.getRawX();
            double rawY = (double) motionEvent.getRawY();
            double d10 = rawX - this.zzs;
            double d11 = rawY - this.zzt;
            this.zzk += Math.sqrt((d10 * d10) + (d11 * d11));
            this.zzs = rawX;
            this.zzt = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            this.zzl = motionEvent.getX();
            this.zzm = motionEvent.getY();
            this.zzn = motionEvent.getRawX();
            this.zzo = motionEvent.getRawY();
            this.zzd++;
        } else if (action2 == 1) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.zzb = obtain;
            this.zzc.add(obtain);
            if (this.zzc.size() > 6) {
                ((MotionEvent) this.zzc.remove()).recycle();
            }
            this.zzf++;
            this.zzh = zza(new Throwable().getStackTrace());
        } else if (action2 == 2) {
            this.zze += (long) (motionEvent.getHistorySize() + 1);
            try {
                zzasr zzi2 = zzi(motionEvent);
                Long l11 = zzi2.zzd;
                if (!(l11 == null || zzi2.zzg == null)) {
                    this.zzi += l11.longValue() + zzi2.zzg.longValue();
                }
                if (!(this.zzq == null || (l10 = zzi2.zze) == null || zzi2.zzh == null)) {
                    this.zzj += l10.longValue() + zzi2.zzh.longValue();
                }
            } catch (zzasf unused) {
            }
        } else if (action2 == 3) {
            this.zzg++;
        }
        this.zzp = true;
    }

    public final synchronized void zzl(int i10, int i11, int i12) {
        synchronized (this) {
            if (this.zzb != null) {
                if (((Boolean) zzba.zzc().zzb(zzbci.zzcm)).booleanValue()) {
                    zzj();
                } else {
                    this.zzb.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.zzq;
            if (displayMetrics != null) {
                float f10 = displayMetrics.density;
                this.zzb = MotionEvent.obtain(0, (long) i12, 1, ((float) i10) * f10, ((float) i11) * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.zzb = null;
            }
            this.zzp = false;
        }
    }

    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzash zzash;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzcw)).booleanValue() && (zzash = this.zzr) != null) {
            zzash.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    public void zzo(View view) {
    }
}
