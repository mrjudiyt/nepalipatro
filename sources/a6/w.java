package a6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: NetworkTypeObserver */
public final class w {

    /* renamed from: e  reason: collision with root package name */
    private static w f266e;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f267a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<WeakReference<c>> f268b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final Object f269c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private int f270d = 0;

    /* compiled from: NetworkTypeObserver */
    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static volatile boolean f271a;
    }

    /* compiled from: NetworkTypeObserver */
    public interface c {
        void a(int i10);
    }

    /* compiled from: NetworkTypeObserver */
    private final class d extends BroadcastReceiver {
        private d() {
        }

        public void onReceive(Context context, Intent intent) {
            int b10 = w.g(context);
            int i10 = m0.f205a;
            if (i10 >= 29 && !b.f271a && b10 == 5) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) a.e((TelephonyManager) context.getSystemService("phone"));
                    e eVar = new e();
                    if (i10 < 31) {
                        telephonyManager.listen(eVar, 1);
                    } else {
                        telephonyManager.listen(eVar, 1048576);
                    }
                    telephonyManager.listen(eVar, 0);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            w.this.k(b10);
        }
    }

    /* compiled from: NetworkTypeObserver */
    private class e extends PhoneStateListener {
        private e() {
        }

        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            w.this.k(overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
        }

        public void onServiceStateChanged(ServiceState serviceState) {
            String serviceState2 = serviceState == null ? "" : serviceState.toString();
            w.this.k(serviceState2.contains("nrState=CONNECTED") || serviceState2.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
        }
    }

    private w(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    public static synchronized w d(Context context) {
        w wVar;
        synchronized (w.class) {
            if (f266e == null) {
                f266e = new w(context);
            }
            wVar = f266e;
        }
        return wVar;
    }

    private static int e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 18:
                return 2;
            case 20:
                return m0.f205a >= 29 ? 9 : 0;
            default:
                return 6;
        }
    }

    /* access modifiers changed from: private */
    public static int g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (!(type == 4 || type == 5)) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(c cVar) {
        cVar.a(f());
    }

    private void j() {
        Iterator<WeakReference<c>> it = this.f268b.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            if (next.get() == null) {
                this.f268b.remove(next);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r0.hasNext() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = r0.next();
        r2 = (a6.w.c) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r2.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        r3.f268b.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r0 = r3.f268b.iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(int r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f269c
            monitor-enter(r0)
            int r1 = r3.f270d     // Catch:{ all -> 0x0031 }
            if (r1 != r4) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x0009:
            r3.f270d = r4     // Catch:{ all -> 0x0031 }
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<a6.w$c>> r0 = r3.f268b
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            a6.w$c r2 = (a6.w.c) r2
            if (r2 == 0) goto L_0x002a
            r2.a(r4)
            goto L_0x0012
        L_0x002a:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<a6.w$c>> r2 = r3.f268b
            r2.remove(r1)
            goto L_0x0012
        L_0x0030:
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.w.k(int):void");
    }

    public int f() {
        int i10;
        synchronized (this.f269c) {
            i10 = this.f270d;
        }
        return i10;
    }

    public void i(c cVar) {
        j();
        this.f268b.add(new WeakReference(cVar));
        this.f267a.post(new v(this, cVar));
    }
}
