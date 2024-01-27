package c8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.actions.SearchIntents;
import e8.c;
import e8.d;
import e8.e;
import e8.g;
import e8.h;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Database */
class i {

    /* renamed from: n  reason: collision with root package name */
    private static Boolean f13389n;

    /* renamed from: a  reason: collision with root package name */
    final boolean f13390a;

    /* renamed from: b  reason: collision with root package name */
    final String f13391b;

    /* renamed from: c  reason: collision with root package name */
    final int f13392c;

    /* renamed from: d  reason: collision with root package name */
    final int f13393d;

    /* renamed from: e  reason: collision with root package name */
    final Context f13394e;

    /* renamed from: f  reason: collision with root package name */
    final List<g> f13395f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    final Map<Integer, t> f13396g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public o f13397h;

    /* renamed from: i  reason: collision with root package name */
    SQLiteDatabase f13398i;

    /* renamed from: j  reason: collision with root package name */
    private int f13399j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f13400k = 0;

    /* renamed from: l  reason: collision with root package name */
    private Integer f13401l;

    /* renamed from: m  reason: collision with root package name */
    private int f13402m = 0;

    /* compiled from: Database */
    class a implements DatabaseErrorHandler {
        a() {
        }

        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }

    i(Context context, String str, int i10, boolean z10, int i11) {
        this.f13394e = context;
        this.f13391b = str;
        this.f13390a = z10;
        this.f13392c = i10;
        this.f13393d = i11;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H(e eVar) {
        Boolean h10 = eVar.h();
        boolean z10 = Boolean.TRUE.equals(h10) && eVar.e();
        if (z10) {
            int i10 = this.f13400k + 1;
            this.f13400k = i10;
            this.f13401l = Integer.valueOf(i10);
        }
        if (!w(eVar)) {
            if (z10) {
                this.f13401l = null;
            }
        } else if (z10) {
            HashMap hashMap = new HashMap();
            hashMap.put("transactionId", this.f13401l);
            eVar.success(hashMap);
        } else {
            if (Boolean.FALSE.equals(h10)) {
                this.f13401l = null;
            }
            eVar.success((Object) null);
        }
    }

    /* access modifiers changed from: private */
    public void Q() {
        while (!this.f13395f.isEmpty() && this.f13401l == null) {
            this.f13395f.get(0).a();
            this.f13395f.remove(0);
        }
    }

    private void S(e eVar, Runnable runnable) {
        Integer d10 = eVar.d();
        Integer num = this.f13401l;
        if (num == null) {
            runnable.run();
        } else if (d10 == null || (!d10.equals(num) && d10.intValue() != -1)) {
            this.f13395f.add(new g(eVar, runnable));
        } else {
            runnable.run();
            if (this.f13401l == null && !this.f13395f.isEmpty()) {
                this.f13397h.c(this, new c(this));
            }
        }
    }

    protected static boolean i(Context context, String str, boolean z10) {
        ApplicationInfo applicationInfo;
        try {
            String packageName = context.getPackageName();
            if (Build.VERSION.SDK_INT >= 33) {
                applicationInfo = context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(128));
            } else {
                applicationInfo = y(context, packageName, 128);
            }
            if (applicationInfo.metaData.getBoolean(str, z10)) {
                return true;
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    protected static boolean j(Context context) {
        return i(context, "com.tekartik.sqflite.wal_enabled", false);
    }

    private void l(int i10) {
        t tVar = this.f13396g.get(Integer.valueOf(i10));
        if (tVar != null) {
            m(tVar);
        }
    }

    private void m(t tVar) {
        try {
            int i10 = tVar.f13425a;
            if (r.c(this.f13393d)) {
                StringBuilder sb = new StringBuilder();
                sb.append(A());
                sb.append("closing cursor ");
                sb.append(i10);
            }
            this.f13396g.remove(Integer.valueOf(i10));
            tVar.f13427c.close();
        } catch (Exception unused) {
        }
    }

    private Map<String, Object> n(Cursor cursor, Integer num) {
        HashMap hashMap = null;
        ArrayList arrayList = null;
        int i10 = 0;
        while (cursor.moveToNext()) {
            if (hashMap == null) {
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap2 = new HashMap();
                i10 = cursor.getColumnCount();
                hashMap2.put("columns", Arrays.asList(cursor.getColumnNames()));
                hashMap2.put("rows", arrayList2);
                HashMap hashMap3 = hashMap2;
                arrayList = arrayList2;
                hashMap = hashMap3;
            }
            arrayList.add(e0.a(cursor, i10));
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return hashMap == null ? new HashMap() : hashMap;
    }

    static void o(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    private boolean p(e eVar) {
        if (!w(eVar)) {
            return false;
        }
        eVar.success((Object) null);
        return true;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b8  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean I(e8.e r9) {
        /*
            r8 = this;
            boolean r0 = r8.w(r9)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r9.c()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0014
            r9.success(r2)
            return r3
        L_0x0014:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            android.database.sqlite.SQLiteDatabase r4 = r8.C()     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            if (r0 == 0) goto L_0x008b
            int r4 = r0.getCount()     // Catch:{ Exception -> 0x0089 }
            if (r4 <= 0) goto L_0x008b
            boolean r4 = r0.moveToFirst()     // Catch:{ Exception -> 0x0089 }
            if (r4 == 0) goto L_0x008b
            int r4 = r0.getInt(r1)     // Catch:{ Exception -> 0x0089 }
            if (r4 != 0) goto L_0x005e
            int r4 = r8.f13393d     // Catch:{ Exception -> 0x0089 }
            boolean r4 = c8.r.b(r4)     // Catch:{ Exception -> 0x0089 }
            if (r4 == 0) goto L_0x0057
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0089 }
            r4.<init>()     // Catch:{ Exception -> 0x0089 }
            java.lang.String r5 = r8.A()     // Catch:{ Exception -> 0x0089 }
            r4.append(r5)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r5 = "no changes (id was "
            r4.append(r5)     // Catch:{ Exception -> 0x0089 }
            long r5 = r0.getLong(r3)     // Catch:{ Exception -> 0x0089 }
            r4.append(r5)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r5 = ")"
            r4.append(r5)     // Catch:{ Exception -> 0x0089 }
        L_0x0057:
            r9.success(r2)     // Catch:{ Exception -> 0x0089 }
            r0.close()
            return r3
        L_0x005e:
            long r4 = r0.getLong(r3)     // Catch:{ Exception -> 0x0089 }
            int r2 = r8.f13393d     // Catch:{ Exception -> 0x0089 }
            boolean r2 = c8.r.b(r2)     // Catch:{ Exception -> 0x0089 }
            if (r2 == 0) goto L_0x007e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0089 }
            r2.<init>()     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = r8.A()     // Catch:{ Exception -> 0x0089 }
            r2.append(r6)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = "inserted "
            r2.append(r6)     // Catch:{ Exception -> 0x0089 }
            r2.append(r4)     // Catch:{ Exception -> 0x0089 }
        L_0x007e:
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0089 }
            r9.success(r2)     // Catch:{ Exception -> 0x0089 }
            r0.close()
            return r3
        L_0x0089:
            r2 = move-exception
            goto L_0x00ab
        L_0x008b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0089 }
            r4.<init>()     // Catch:{ Exception -> 0x0089 }
            java.lang.String r5 = r8.A()     // Catch:{ Exception -> 0x0089 }
            r4.append(r5)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r5 = "fail to read changes for Insert"
            r4.append(r5)     // Catch:{ Exception -> 0x0089 }
            r9.success(r2)     // Catch:{ Exception -> 0x0089 }
            if (r0 == 0) goto L_0x00a4
            r0.close()
        L_0x00a4:
            return r3
        L_0x00a5:
            r9 = move-exception
            goto L_0x00b6
        L_0x00a7:
            r0 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
        L_0x00ab:
            r8.D(r2, r9)     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x00b3
            r0.close()
        L_0x00b3:
            return r1
        L_0x00b4:
            r9 = move-exception
            r2 = r0
        L_0x00b6:
            if (r2 == 0) goto L_0x00bb
            r2.close()
        L_0x00bb:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.i.I(e8.e):boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008f A[Catch:{ all -> 0x009a }] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean J(e8.e r10) {
        /*
            r9 = this;
            java.lang.String r0 = "cursorPageSize"
            java.lang.Object r0 = r10.a(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            c8.d0 r1 = r10.b()
            int r2 = r9.f13393d
            boolean r2 = c8.r.b(r2)
            if (r2 == 0) goto L_0x0023
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r9.A()
            r2.append(r3)
            r2.append(r1)
        L_0x0023:
            r2 = 0
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r9.z()     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            c8.b r5 = new c8.b     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            java.lang.String r1 = r1.c()     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            java.lang.String[] r6 = c8.a.f13367a     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            android.database.Cursor r1 = r4.rawQueryWithFactory(r5, r1, r6, r2)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            java.util.Map r4 = r9.n(r1, r0)     // Catch:{ Exception -> 0x0083 }
            r5 = 1
            if (r0 == 0) goto L_0x004d
            boolean r6 = r1.isLast()     // Catch:{ Exception -> 0x0083 }
            if (r6 != 0) goto L_0x004d
            boolean r6 = r1.isAfterLast()     // Catch:{ Exception -> 0x0083 }
            if (r6 != 0) goto L_0x004d
            r6 = 1
            goto L_0x004e
        L_0x004d:
            r6 = 0
        L_0x004e:
            if (r6 == 0) goto L_0x0078
            int r6 = r9.f13402m     // Catch:{ Exception -> 0x0083 }
            int r6 = r6 + r5
            r9.f13402m = r6     // Catch:{ Exception -> 0x0083 }
            java.lang.String r7 = "cursorId"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0083 }
            r4.put(r7, r8)     // Catch:{ Exception -> 0x0083 }
            c8.t r7 = new c8.t     // Catch:{ Exception -> 0x0083 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0083 }
            r7.<init>(r6, r0, r1)     // Catch:{ Exception -> 0x0083 }
            java.util.Map<java.lang.Integer, c8.t> r0 = r9.f13396g     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            r0.put(r2, r7)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            r2 = r7
            goto L_0x0078
        L_0x0072:
            r10 = move-exception
            r2 = r7
            goto L_0x009b
        L_0x0075:
            r0 = move-exception
            r2 = r7
            goto L_0x008a
        L_0x0078:
            r10.success(r4)     // Catch:{ Exception -> 0x0083 }
            if (r2 != 0) goto L_0x0082
            if (r1 == 0) goto L_0x0082
            r1.close()
        L_0x0082:
            return r5
        L_0x0083:
            r0 = move-exception
            goto L_0x008a
        L_0x0085:
            r10 = move-exception
            r1 = r2
            goto L_0x009b
        L_0x0088:
            r0 = move-exception
            r1 = r2
        L_0x008a:
            r9.D(r0, r10)     // Catch:{ all -> 0x009a }
            if (r2 == 0) goto L_0x0092
            r9.m(r2)     // Catch:{ all -> 0x009a }
        L_0x0092:
            if (r2 != 0) goto L_0x0099
            if (r1 == 0) goto L_0x0099
            r1.close()
        L_0x0099:
            return r3
        L_0x009a:
            r10 = move-exception
        L_0x009b:
            if (r2 != 0) goto L_0x00a2
            if (r1 == 0) goto L_0x00a2
            r1.close()
        L_0x00a2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.i.J(e8.e):boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ad A[Catch:{ all -> 0x00ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b1  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean K(e8.e r10) {
        /*
            r9 = this;
            java.lang.String r0 = "cursorId"
            java.lang.Object r1 = r10.a(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "cancel"
            java.lang.Object r3 = r10.a(r3)
            boolean r2 = r2.equals(r3)
            int r3 = r9.f13393d
            boolean r3 = c8.r.c(r3)
            if (r3 == 0) goto L_0x003e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r9.A()
            r3.append(r4)
            java.lang.String r4 = "cursor "
            r3.append(r4)
            r3.append(r1)
            if (r2 == 0) goto L_0x0039
            java.lang.String r4 = " cancel"
            goto L_0x003b
        L_0x0039:
            java.lang.String r4 = " next"
        L_0x003b:
            r3.append(r4)
        L_0x003e:
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0049
            r9.l(r1)
            r10.success(r3)
            return r4
        L_0x0049:
            java.util.Map<java.lang.Integer, c8.t> r2 = r9.f13396g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r2.get(r5)
            c8.t r2 = (c8.t) r2
            r5 = 0
            if (r2 == 0) goto L_0x008c
            android.database.Cursor r6 = r2.f13427c     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
            int r7 = r2.f13426b     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
            java.util.Map r7 = r9.n(r6, r7)     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
            boolean r8 = r6.isLast()     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
            if (r8 != 0) goto L_0x0072
            boolean r6 = r6.isAfterLast()     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
            if (r6 != 0) goto L_0x0072
            r6 = 1
            goto L_0x0073
        L_0x0072:
            r6 = 0
        L_0x0073:
            if (r6 == 0) goto L_0x007c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0085 }
            r7.put(r0, r1)     // Catch:{ Exception -> 0x0085 }
        L_0x007c:
            r10.success(r7)     // Catch:{ Exception -> 0x0085 }
            if (r6 != 0) goto L_0x0084
            r9.m(r2)
        L_0x0084:
            return r4
        L_0x0085:
            r0 = move-exception
            goto L_0x00a8
        L_0x0087:
            r10 = move-exception
            goto L_0x00bc
        L_0x0089:
            r0 = move-exception
            r6 = 0
            goto L_0x00a8
        L_0x008c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
            r4.<init>()     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
            java.lang.String r6 = "Cursor "
            r4.append(r6)     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
            r4.append(r1)     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
            java.lang.String r1 = " not found"
            r4.append(r1)     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
            throw r0     // Catch:{ Exception -> 0x0089, all -> 0x0087 }
        L_0x00a8:
            r9.D(r0, r10)     // Catch:{ all -> 0x00ba }
            if (r2 == 0) goto L_0x00b1
            r9.m(r2)     // Catch:{ all -> 0x00ba }
            goto L_0x00b2
        L_0x00b1:
            r3 = r2
        L_0x00b2:
            if (r6 != 0) goto L_0x00b9
            if (r3 == 0) goto L_0x00b9
            r9.m(r3)
        L_0x00b9:
            return r5
        L_0x00ba:
            r10 = move-exception
            r5 = r6
        L_0x00bc:
            if (r5 != 0) goto L_0x00c3
            if (r2 == 0) goto L_0x00c3
            r9.m(r2)
        L_0x00c3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.i.K(e8.e):boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0085  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean L(e8.e r7) {
        /*
            r6 = this;
            boolean r0 = r6.w(r7)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r7.c()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0014
            r7.success(r3)
            return r2
        L_0x0014:
            android.database.sqlite.SQLiteDatabase r0 = r6.C()     // Catch:{ Exception -> 0x0079 }
            java.lang.String r4 = "SELECT changes()"
            android.database.Cursor r0 = r0.rawQuery(r4, r3)     // Catch:{ Exception -> 0x0079 }
            if (r0 == 0) goto L_0x005d
            int r4 = r0.getCount()     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            if (r4 <= 0) goto L_0x005d
            boolean r4 = r0.moveToFirst()     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            if (r4 == 0) goto L_0x005d
            int r3 = r0.getInt(r1)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            int r4 = r6.f13393d     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            boolean r4 = c8.r.b(r4)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            if (r4 == 0) goto L_0x004c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            r4.<init>()     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            java.lang.String r5 = r6.A()     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            r4.append(r5)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            java.lang.String r5 = "changed "
            r4.append(r5)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            r4.append(r3)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
        L_0x004c:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            r7.success(r3)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            r0.close()
            return r2
        L_0x0057:
            r7 = move-exception
            r3 = r0
            goto L_0x0083
        L_0x005a:
            r2 = move-exception
            r3 = r0
            goto L_0x007a
        L_0x005d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            r4.<init>()     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            java.lang.String r5 = r6.A()     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            r4.append(r5)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            java.lang.String r5 = "fail to read changes for Update/Delete"
            r4.append(r5)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            r7.success(r3)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            if (r0 == 0) goto L_0x0076
            r0.close()
        L_0x0076:
            return r2
        L_0x0077:
            r7 = move-exception
            goto L_0x0083
        L_0x0079:
            r2 = move-exception
        L_0x007a:
            r6.D(r2, r7)     // Catch:{ all -> 0x0077 }
            if (r3 == 0) goto L_0x0082
            r3.close()
        L_0x0082:
            return r1
        L_0x0083:
            if (r3 == 0) goto L_0x0088
            r3.close()
        L_0x0088:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.i.L(e8.e):boolean");
    }

    private boolean w(e eVar) {
        d0 b10 = eVar.b();
        if (r.b(this.f13393d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(A());
            sb.append(b10);
        }
        Boolean h10 = eVar.h();
        try {
            C().execSQL(b10.c(), b10.d());
            u(h10);
            return true;
        } catch (Exception e10) {
            D(e10, eVar);
            return false;
        }
    }

    public static boolean x(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    static ApplicationInfo y(Context context, String str, int i10) {
        return context.getPackageManager().getApplicationInfo(str, i10);
    }

    /* access modifiers changed from: package-private */
    public String A() {
        return "[" + B() + "] ";
    }

    /* access modifiers changed from: package-private */
    public String B() {
        Thread currentThread = Thread.currentThread();
        return "" + this.f13392c + "," + currentThread.getName() + "(" + currentThread.getId() + ")";
    }

    public SQLiteDatabase C() {
        return this.f13398i;
    }

    /* access modifiers changed from: package-private */
    public void D(Exception exc, e eVar) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            eVar.error("sqlite_error", "open_failed " + this.f13391b, (Object) null);
        } else if (exc instanceof SQLException) {
            eVar.error("sqlite_error", exc.getMessage(), h.a(eVar));
        } else {
            eVar.error("sqlite_error", exc.getMessage(), h.a(eVar));
        }
    }

    public void E(e eVar) {
        S(eVar, new d(this, eVar));
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean F() {
        return this.f13399j > 0;
    }

    public void M() {
        if (f13389n == null) {
            Boolean valueOf = Boolean.valueOf(j(this.f13394e));
            f13389n = valueOf;
            if (valueOf.booleanValue() && r.c(this.f13393d)) {
                StringBuilder sb = new StringBuilder();
                sb.append(A());
                sb.append("[sqflite] WAL enabled");
            }
        }
        this.f13398i = SQLiteDatabase.openDatabase(this.f13391b, (SQLiteDatabase.CursorFactory) null, f13389n.booleanValue() ? 805306368 : 268435456);
    }

    public void N() {
        this.f13398i = SQLiteDatabase.openDatabase(this.f13391b, (SQLiteDatabase.CursorFactory) null, 1, new a());
    }

    public void O(e eVar) {
        S(eVar, new f(this, eVar));
    }

    public void P(e eVar) {
        S(eVar, new e(this, eVar));
    }

    public void R(e eVar) {
        S(eVar, new g(this, eVar));
    }

    /* access modifiers changed from: package-private */
    public void h(MethodCall methodCall, MethodChannel.Result result) {
        d dVar = new d(methodCall, result);
        boolean c10 = dVar.c();
        boolean j10 = dVar.j();
        ArrayList arrayList = new ArrayList();
        for (Map cVar : (List) dVar.a("operations")) {
            c cVar2 = new c(cVar, c10);
            String f10 = cVar2.f();
            f10.hashCode();
            char c11 = 65535;
            switch (f10.hashCode()) {
                case -1319569547:
                    if (f10.equals("execute")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1183792455:
                    if (f10.equals("insert")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -838846263:
                    if (f10.equals("update")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 107944136:
                    if (f10.equals(SearchIntents.EXTRA_QUERY)) {
                        c11 = 3;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    if (p(cVar2)) {
                        cVar2.r(arrayList);
                        break;
                    } else if (j10) {
                        cVar2.q(arrayList);
                        break;
                    } else {
                        cVar2.p(result);
                        return;
                    }
                case 1:
                    if (I(cVar2)) {
                        cVar2.r(arrayList);
                        break;
                    } else if (j10) {
                        cVar2.q(arrayList);
                        break;
                    } else {
                        cVar2.p(result);
                        return;
                    }
                case 2:
                    if (L(cVar2)) {
                        cVar2.r(arrayList);
                        break;
                    } else if (j10) {
                        cVar2.q(arrayList);
                        break;
                    } else {
                        cVar2.p(result);
                        return;
                    }
                case 3:
                    if (J(cVar2)) {
                        cVar2.r(arrayList);
                        break;
                    } else if (j10) {
                        cVar2.q(arrayList);
                        break;
                    } else {
                        cVar2.p(result);
                        return;
                    }
                default:
                    result.error("bad_param", "Batch method '" + f10 + "' not supported", (Object) null);
                    return;
            }
        }
        if (c10) {
            result.success((Object) null);
        } else {
            result.success(arrayList);
        }
    }

    public void k() {
        if (!this.f13396g.isEmpty() && r.b(this.f13393d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(A());
            sb.append(this.f13396g.size());
            sb.append(" cursor(s) are left opened");
        }
        this.f13398i.close();
    }

    /* access modifiers changed from: package-private */
    public synchronized void u(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            this.f13399j++;
        } else if (Boolean.FALSE.equals(bool)) {
            this.f13399j--;
        }
    }

    public void v(e eVar) {
        S(eVar, new h(this, eVar));
    }

    public SQLiteDatabase z() {
        return this.f13398i;
    }
}
