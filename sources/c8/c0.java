package c8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.actions.SearchIntents;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SqflitePlugin */
public class c0 implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: j  reason: collision with root package name */
    static final Map<String, Integer> f13368j = new HashMap();
    @SuppressLint({"UseSparseArrays"})

    /* renamed from: k  reason: collision with root package name */
    static final Map<Integer, i> f13369k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    private static final Object f13370l = new Object();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final Object f13371m = new Object();

    /* renamed from: n  reason: collision with root package name */
    static int f13372n = 0;

    /* renamed from: o  reason: collision with root package name */
    static String f13373o;

    /* renamed from: p  reason: collision with root package name */
    private static int f13374p = 0;

    /* renamed from: q  reason: collision with root package name */
    private static int f13375q = 1;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static int f13376r = 0;

    /* renamed from: s  reason: collision with root package name */
    private static o f13377s;

    /* renamed from: h  reason: collision with root package name */
    private Context f13378h;

    /* renamed from: i  reason: collision with root package name */
    private MethodChannel f13379i;

    /* compiled from: SqflitePlugin */
    class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ i f13380h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f13381i;

        a(i iVar, MethodChannel.Result result) {
            this.f13380h = iVar;
            this.f13381i = result;
        }

        public void run() {
            synchronized (c0.f13371m) {
                c0.this.l(this.f13380h);
            }
            this.f13381i.success((Object) null);
        }
    }

    /* compiled from: SqflitePlugin */
    class b implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ i f13383h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f13384i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f13385j;

        b(i iVar, String str, MethodChannel.Result result) {
            this.f13383h = iVar;
            this.f13384i = str;
            this.f13385j = result;
        }

        public void run() {
            synchronized (c0.f13371m) {
                i iVar = this.f13383h;
                if (iVar != null) {
                    c0.this.l(iVar);
                }
                try {
                    if (r.c(c0.f13372n)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("delete database ");
                        sb.append(this.f13384i);
                    }
                    i.o(this.f13384i);
                } catch (Exception e10) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("error ");
                    sb2.append(e10);
                    sb2.append(" while closing database ");
                    sb2.append(c0.f13376r);
                }
            }
            this.f13385j.success((Object) null);
        }
    }

    private void A(MethodCall methodCall, MethodChannel.Result result) {
        int intValue = ((Integer) methodCall.argument("id")).intValue();
        i n10 = n(methodCall, result);
        if (n10 != null) {
            if (r.b(n10.f13393d)) {
                StringBuilder sb = new StringBuilder();
                sb.append(n10.A());
                sb.append("closing ");
                sb.append(intValue);
                sb.append(" ");
                sb.append(n10.f13391b);
            }
            String str = n10.f13391b;
            synchronized (f13370l) {
                f13369k.remove(Integer.valueOf(intValue));
                if (n10.f13390a) {
                    f13368j.remove(str);
                }
            }
            f13377s.c(n10, new a(n10, result));
        }
    }

    private void B(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Boolean.valueOf(i.x((String) methodCall.argument("path"))));
    }

    private void C(MethodCall methodCall, MethodChannel.Result result) {
        HashMap hashMap = new HashMap();
        if ("get".equals((String) methodCall.argument("cmd"))) {
            int i10 = f13372n;
            if (i10 > 0) {
                hashMap.put("logLevel", Integer.valueOf(i10));
            }
            Map<Integer, i> map = f13369k;
            if (!map.isEmpty()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry next : map.entrySet()) {
                    i iVar = (i) next.getValue();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("path", iVar.f13391b);
                    hashMap3.put("singleInstance", Boolean.valueOf(iVar.f13390a));
                    int i11 = iVar.f13393d;
                    if (i11 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i11));
                    }
                    hashMap2.put(((Integer) next.getKey()).toString(), hashMap3);
                }
                hashMap.put("databases", hashMap2);
            }
        }
        result.success(hashMap);
    }

    private void D(MethodCall methodCall, MethodChannel.Result result) {
        d8.a.f14158a = Boolean.TRUE.equals(methodCall.arguments());
        d8.a.f14160c = d8.a.f14159b && d8.a.f14158a;
        if (!d8.a.f14158a) {
            f13372n = 0;
        } else if (d8.a.f14160c) {
            f13372n = 2;
        } else if (d8.a.f14158a) {
            f13372n = 1;
        }
        result.success((Object) null);
    }

    private void E(MethodCall methodCall, MethodChannel.Result result) {
        i iVar;
        Map<Integer, i> map;
        String str = (String) methodCall.argument("path");
        synchronized (f13370l) {
            if (r.c(f13372n)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Look for ");
                sb.append(str);
                sb.append(" in ");
                sb.append(f13368j.keySet());
            }
            Map<String, Integer> map2 = f13368j;
            Integer num = map2.get(str);
            if (num == null || (iVar = map.get(num)) == null || !iVar.f13398i.isOpen()) {
                iVar = null;
            } else {
                if (r.c(f13372n)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iVar.A());
                    sb2.append("found single instance ");
                    sb2.append(iVar.F() ? "(in transaction) " : "");
                    sb2.append(num);
                    sb2.append(" ");
                    sb2.append(str);
                }
                (map = f13369k).remove(num);
                map2.remove(str);
            }
        }
        b bVar = new b(iVar, str, result);
        o oVar = f13377s;
        if (oVar != null) {
            oVar.c(iVar, bVar);
        } else {
            bVar.run();
        }
    }

    private void F(MethodCall methodCall, MethodChannel.Result result) {
        i n10 = n(methodCall, result);
        if (n10 != null) {
            f13377s.c(n10, new z(methodCall, result, n10));
        }
    }

    private void H(MethodCall methodCall, MethodChannel.Result result) {
        i n10 = n(methodCall, result);
        if (n10 != null) {
            f13377s.c(n10, new x(methodCall, result, n10));
        }
    }

    private void I(MethodCall methodCall, MethodChannel.Result result) {
        int i10;
        i iVar;
        MethodCall methodCall2 = methodCall;
        String str = (String) methodCall2.argument("path");
        Boolean bool = (Boolean) methodCall2.argument("readOnly");
        boolean o10 = o(str);
        boolean z10 = !Boolean.FALSE.equals(methodCall2.argument("singleInstance")) && !o10;
        if (z10) {
            synchronized (f13370l) {
                if (r.c(f13372n)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Look for ");
                    sb.append(str);
                    sb.append(" in ");
                    sb.append(f13368j.keySet());
                }
                Integer num = f13368j.get(str);
                if (!(num == null || (iVar = f13369k.get(num)) == null)) {
                    if (iVar.f13398i.isOpen()) {
                        if (r.c(f13372n)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(iVar.A());
                            sb2.append("re-opened single instance ");
                            sb2.append(iVar.F() ? "(in transaction) " : "");
                            sb2.append(num);
                            sb2.append(" ");
                            sb2.append(str);
                        }
                        result.success(x(num.intValue(), true, iVar.F()));
                        return;
                    } else if (r.c(f13372n)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iVar.A());
                        sb3.append("single instance database of ");
                        sb3.append(str);
                        sb3.append(" not opened");
                    }
                }
                MethodChannel.Result result2 = result;
            }
        } else {
            MethodChannel.Result result3 = result;
        }
        Object obj = f13370l;
        synchronized (obj) {
            i10 = f13376r + 1;
            f13376r = i10;
        }
        i iVar2 = new i(this.f13378h, str, i10, z10, f13372n);
        synchronized (obj) {
            if (f13377s == null) {
                o b10 = n.b("Sqflite", f13375q, f13374p);
                f13377s = b10;
                b10.start();
                if (r.b(iVar2.f13393d)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(iVar2.A());
                    sb4.append("starting worker pool with priority ");
                    sb4.append(f13374p);
                }
            }
            iVar2.f13397h = f13377s;
            if (r.b(iVar2.f13393d)) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(iVar2.A());
                sb5.append("opened ");
                sb5.append(i10);
                sb5.append(" ");
                sb5.append(str);
            }
            b0 b0Var = r1;
            o oVar = f13377s;
            b0 b0Var2 = new b0(o10, str, result, bool, iVar2, methodCall, z10, i10);
            oVar.c(iVar2, b0Var);
        }
    }

    private void K(MethodCall methodCall, MethodChannel.Result result) {
        i n10 = n(methodCall, result);
        if (n10 != null) {
            f13377s.c(n10, new w(methodCall, result, n10));
        }
    }

    private void L(MethodCall methodCall, MethodChannel.Result result) {
        i n10 = n(methodCall, result);
        if (n10 != null) {
            f13377s.c(n10, new a0(methodCall, result, n10));
        }
    }

    private void M(MethodCall methodCall, MethodChannel.Result result) {
        i n10 = n(methodCall, result);
        if (n10 != null) {
            f13377s.c(n10, new v(methodCall, n10, result));
        }
    }

    private void N(MethodCall methodCall, MethodChannel.Result result) {
        i n10 = n(methodCall, result);
        if (n10 != null) {
            f13377s.c(n10, new y(methodCall, result, n10));
        }
    }

    /* access modifiers changed from: private */
    public void l(i iVar) {
        try {
            if (r.b(iVar.f13393d)) {
                StringBuilder sb = new StringBuilder();
                sb.append(iVar.A());
                sb.append("closing database ");
            }
            iVar.k();
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("error ");
            sb2.append(e10);
            sb2.append(" while closing database ");
            sb2.append(f13376r);
        }
        synchronized (f13370l) {
            if (f13369k.isEmpty() && f13377s != null) {
                if (r.b(iVar.f13393d)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(iVar.A());
                    sb3.append("stopping thread");
                }
                f13377s.b();
                f13377s = null;
            }
        }
    }

    private i m(int i10) {
        return f13369k.get(Integer.valueOf(i10));
    }

    private i n(MethodCall methodCall, MethodChannel.Result result) {
        int intValue = ((Integer) methodCall.argument("id")).intValue();
        i m10 = m(intValue);
        if (m10 != null) {
            return m10;
        }
        result.error("sqlite_error", "database_closed " + intValue, (Object) null);
        return null;
    }

    static boolean o(String str) {
        return str == null || str.equals(":memory:");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        r4.success(x(r9, false, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0092, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0096, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a4, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void s(boolean r2, java.lang.String r3, io.flutter.plugin.common.MethodChannel.Result r4, java.lang.Boolean r5, c8.i r6, io.flutter.plugin.common.MethodCall r7, boolean r8, int r9) {
        /*
            java.lang.Object r0 = f13371m
            monitor-enter(r0)
            if (r2 != 0) goto L_0x003e
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0096 }
            r2.<init>(r3)     // Catch:{ all -> 0x0096 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0096 }
            java.lang.String r2 = r2.getParent()     // Catch:{ all -> 0x0096 }
            r1.<init>(r2)     // Catch:{ all -> 0x0096 }
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0096 }
            if (r2 != 0) goto L_0x003e
            boolean r2 = r1.mkdirs()     // Catch:{ all -> 0x0096 }
            if (r2 != 0) goto L_0x003e
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0096 }
            if (r2 != 0) goto L_0x003e
            java.lang.String r2 = "sqlite_error"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r5.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r6 = "open_failed "
            r5.append(r6)     // Catch:{ all -> 0x0096 }
            r5.append(r3)     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0096 }
            r5 = 0
            r4.error(r2, r3, r5)     // Catch:{ all -> 0x0096 }
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return
        L_0x003e:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0098 }
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x0098 }
            if (r2 == 0) goto L_0x004a
            r6.N()     // Catch:{ Exception -> 0x0098 }
            goto L_0x004d
        L_0x004a:
            r6.M()     // Catch:{ Exception -> 0x0098 }
        L_0x004d:
            java.lang.Object r2 = f13370l     // Catch:{ all -> 0x0096 }
            monitor-enter(r2)     // Catch:{ all -> 0x0096 }
            if (r8 == 0) goto L_0x005b
            java.util.Map<java.lang.String, java.lang.Integer> r5 = f13368j     // Catch:{ all -> 0x0093 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0093 }
            r5.put(r3, r7)     // Catch:{ all -> 0x0093 }
        L_0x005b:
            java.util.Map<java.lang.Integer, c8.i> r5 = f13369k     // Catch:{ all -> 0x0093 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0093 }
            r5.put(r7, r6)     // Catch:{ all -> 0x0093 }
            monitor-exit(r2)     // Catch:{ all -> 0x0093 }
            int r2 = r6.f13393d     // Catch:{ all -> 0x0096 }
            boolean r2 = c8.r.b(r2)     // Catch:{ all -> 0x0096 }
            if (r2 == 0) goto L_0x0089
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r2.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r5 = r6.A()     // Catch:{ all -> 0x0096 }
            r2.append(r5)     // Catch:{ all -> 0x0096 }
            java.lang.String r5 = "opened "
            r2.append(r5)     // Catch:{ all -> 0x0096 }
            r2.append(r9)     // Catch:{ all -> 0x0096 }
            java.lang.String r5 = " "
            r2.append(r5)     // Catch:{ all -> 0x0096 }
            r2.append(r3)     // Catch:{ all -> 0x0096 }
        L_0x0089:
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            r2 = 0
            java.util.Map r2 = x(r9, r2, r2)
            r4.success(r2)
            return
        L_0x0093:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0093 }
            throw r3     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r2 = move-exception
            goto L_0x00a3
        L_0x0098:
            r2 = move-exception
            e8.d r3 = new e8.d     // Catch:{ all -> 0x0096 }
            r3.<init>(r7, r4)     // Catch:{ all -> 0x0096 }
            r6.D(r2, r3)     // Catch:{ all -> 0x0096 }
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return
        L_0x00a3:
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.c0.s(boolean, java.lang.String, io.flutter.plugin.common.MethodChannel$Result, java.lang.Boolean, c8.i, io.flutter.plugin.common.MethodCall, boolean, int):void");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void v(MethodCall methodCall, i iVar, MethodChannel.Result result) {
        try {
            iVar.f13398i.setLocale(e0.e((String) methodCall.argument("locale")));
            result.success((Object) null);
        } catch (Exception e10) {
            result.error("sqlite_error", "Error calling setLocale: " + e10.getMessage(), (Object) null);
        }
    }

    static Map x(int i10, boolean z10, boolean z11) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i10));
        if (z10) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z11) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    private void y(Context context, BinaryMessenger binaryMessenger) {
        this.f13378h = context;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.tekartik.sqflite", StandardMethodCodec.INSTANCE, binaryMessenger.makeBackgroundTaskQueue());
        this.f13379i = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    private void z(MethodCall methodCall, MethodChannel.Result result) {
        i n10 = n(methodCall, result);
        if (n10 != null) {
            f13377s.c(n10, new u(n10, methodCall, result));
        }
    }

    /* access modifiers changed from: package-private */
    public void G(MethodCall methodCall, MethodChannel.Result result) {
        if (f13373o == null) {
            f13373o = this.f13378h.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        result.success(f13373o);
    }

    /* access modifiers changed from: package-private */
    public void J(MethodCall methodCall, MethodChannel.Result result) {
        Object argument = methodCall.argument("androidThreadPriority");
        if (argument != null) {
            f13374p = ((Integer) argument).intValue();
        }
        Object argument2 = methodCall.argument("androidThreadCount");
        if (argument2 != null && !argument2.equals(Integer.valueOf(f13375q))) {
            f13375q = ((Integer) argument2).intValue();
            o oVar = f13377s;
            if (oVar != null) {
                oVar.b();
                f13377s = null;
            }
        }
        Integer a10 = r.a(methodCall);
        if (a10 != null) {
            f13372n = a10.intValue();
        }
        result.success((Object) null);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        y(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f13378h = null;
        this.f13379i.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.f13379i = null;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1319569547:
                if (str.equals("execute")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1253581933:
                if (str.equals("closeDatabase")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1249474914:
                if (str.equals("options")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1183792455:
                if (str.equals("insert")) {
                    c10 = 3;
                    break;
                }
                break;
            case -838846263:
                if (str.equals("update")) {
                    c10 = 4;
                    break;
                }
                break;
            case -396289107:
                if (str.equals("androidSetLocale")) {
                    c10 = 5;
                    break;
                }
                break;
            case -263511994:
                if (str.equals("deleteDatabase")) {
                    c10 = 6;
                    break;
                }
                break;
            case -198450538:
                if (str.equals("debugMode")) {
                    c10 = 7;
                    break;
                }
                break;
            case -17190427:
                if (str.equals("openDatabase")) {
                    c10 = 8;
                    break;
                }
                break;
            case 93509434:
                if (str.equals("batch")) {
                    c10 = 9;
                    break;
                }
                break;
            case 95458899:
                if (str.equals("debug")) {
                    c10 = 10;
                    break;
                }
                break;
            case 107944136:
                if (str.equals(SearchIntents.EXTRA_QUERY)) {
                    c10 = 11;
                    break;
                }
                break;
            case 956410295:
                if (str.equals("databaseExists")) {
                    c10 = 12;
                    break;
                }
                break;
            case 1193546321:
                if (str.equals("queryCursorNext")) {
                    c10 = 13;
                    break;
                }
                break;
            case 1385449135:
                if (str.equals("getPlatformVersion")) {
                    c10 = 14;
                    break;
                }
                break;
            case 1863829223:
                if (str.equals("getDatabasesPath")) {
                    c10 = 15;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                F(methodCall, result);
                return;
            case 1:
                A(methodCall, result);
                return;
            case 2:
                J(methodCall, result);
                return;
            case 3:
                H(methodCall, result);
                return;
            case 4:
                N(methodCall, result);
                return;
            case 5:
                M(methodCall, result);
                return;
            case 6:
                E(methodCall, result);
                return;
            case 7:
                D(methodCall, result);
                return;
            case 8:
                I(methodCall, result);
                return;
            case 9:
                z(methodCall, result);
                return;
            case 10:
                C(methodCall, result);
                return;
            case 11:
                K(methodCall, result);
                return;
            case 12:
                B(methodCall, result);
                return;
            case 13:
                L(methodCall, result);
                return;
            case 14:
                result.success("Android " + Build.VERSION.RELEASE);
                return;
            case 15:
                G(methodCall, result);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
