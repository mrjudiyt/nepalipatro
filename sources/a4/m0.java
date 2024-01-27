package a4;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import b4.a;
import com.facebook.bolts.AppLinks;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import s3.h;
import s3.i;
import s3.p;
import v3.a;
import v3.c;
import v3.e;
import v3.f;

/* compiled from: SQLiteEventStore */
public class m0 implements d, b4.a, c {

    /* renamed from: m  reason: collision with root package name */
    private static final q3.b f85m = q3.b.b("proto");

    /* renamed from: h  reason: collision with root package name */
    private final t0 f86h;

    /* renamed from: i  reason: collision with root package name */
    private final c4.a f87i;

    /* renamed from: j  reason: collision with root package name */
    private final c4.a f88j;

    /* renamed from: k  reason: collision with root package name */
    private final e f89k;

    /* renamed from: l  reason: collision with root package name */
    private final n8.a<String> f90l;

    /* compiled from: SQLiteEventStore */
    interface b<T, U> {
        U apply(T t10);
    }

    /* compiled from: SQLiteEventStore */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final String f91a;

        /* renamed from: b  reason: collision with root package name */
        final String f92b;

        private c(String str, String str2) {
            this.f91a = str;
            this.f92b = str2;
        }
    }

    /* compiled from: SQLiteEventStore */
    interface d<T> {
        T a();
    }

    m0(c4.a aVar, c4.a aVar2, e eVar, t0 t0Var, n8.a<String> aVar3) {
        this.f86h = t0Var;
        this.f87i = aVar;
        this.f88j = aVar2;
        this.f89k = eVar;
        this.f90l = aVar3;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object A1(long j10, p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(d4.a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", Integer.valueOf(d4.a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object B1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f87i.a()).execute();
        return null;
    }

    private List<k> C1(SQLiteDatabase sQLiteDatabase, p pVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long Z0 = Z0(sQLiteDatabase, pVar);
        if (Z0 == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        K1(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{Z0.toString()}, (String) null, (String) null, (String) null, String.valueOf(i10)), new l0(this, arrayList, pVar));
        return arrayList;
    }

    private Map<Long, Set<c>> D1(SQLiteDatabase sQLiteDatabase, List<k> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb.append(list.get(i10).c());
            if (i10 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        K1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), new r(hashMap));
        return hashMap;
    }

    private static byte[] E1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void F1(a.C0203a aVar, Map<String, List<v3.c>> map) {
        for (Map.Entry next : map.entrySet()) {
            aVar.a(v3.d.c().c((String) next.getKey()).b((List) next.getValue()).a());
        }
    }

    private byte[] G1(long j10) {
        return (byte[]) K1(U0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, (String) null, (String) null, "sequence_num"), s.f113a);
    }

    private <T> T H1(d<T> dVar, b<Throwable, T> bVar) {
        long a10 = this.f88j.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f88j.a() >= ((long) this.f89k.b()) + a10) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50);
            }
        }
    }

    private static q3.b I1(String str) {
        if (str == null) {
            return f85m;
        }
        return q3.b.b(str);
    }

    private static String J1(Iterable<k> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<k> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    static <T> T K1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private c.b Q0(int i10) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i10 == bVar.getNumber()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.getNumber()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i10 == bVar3.getNumber()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.getNumber()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.getNumber()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i10 == bVar6.getNumber()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i10 == bVar7.getNumber()) {
            return bVar7;
        }
        w3.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    private void R0(SQLiteDatabase sQLiteDatabase) {
        H1(new d0(sQLiteDatabase), b0.f56a);
    }

    private long S0(SQLiteDatabase sQLiteDatabase, p pVar) {
        Long Z0 = Z0(sQLiteDatabase, pVar);
        if (Z0 != null) {
            return Z0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put("priority", Integer.valueOf(d4.a.a(pVar.d())));
        contentValues.put("next_request_ms", 0);
        if (pVar.c() != null) {
            contentValues.put(AppLinks.KEY_NAME_EXTRAS, Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    private v3.b V0() {
        return v3.b.b().b(e.c().b(T0()).c(e.f59a.f()).a()).a();
    }

    private long W0() {
        return U0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long X0() {
        return U0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private f Y0() {
        return (f) a1(new w(this.f87i.a()));
    }

    private Long Z0(SQLiteDatabase sQLiteDatabase, p pVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{pVar.b(), String.valueOf(d4.a.a(pVar.d()))}));
        if (pVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) K1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), v.f130a);
    }

    private boolean b1() {
        return W0() * X0() >= this.f89k.f();
    }

    private List<k> c1(List<k> list, Map<Long, Set<c>> map) {
        ListIterator<k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                i.a l10 = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    l10.c(cVar.f91a, cVar.f92b);
                }
                listIterator.set(k.a(next.c(), next.d(), l10.d()));
            }
        }
        return list;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object d1(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            q((long) i10, c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Integer e1(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        K1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new f0(this));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object g1(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase h1(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Long i1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ f k1(long j10, SQLiteDatabase sQLiteDatabase) {
        return (f) K1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new l(j10));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Long l1(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean m1(p pVar, SQLiteDatabase sQLiteDatabase) {
        Long Z0 = Z0(sQLiteDatabase, pVar);
        if (Z0 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) K1(U0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{Z0.toString()}), y.f133a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List n1(SQLiteDatabase sQLiteDatabase) {
        return (List) K1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), t.f115a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List o1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(p.a().b(cursor.getString(1)).d(d4.a.b(cursor.getInt(2))).c(E1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List p1(p pVar, SQLiteDatabase sQLiteDatabase) {
        List<k> C1 = C1(sQLiteDatabase, pVar, this.f89k.d());
        for (q3.d dVar : q3.d.values()) {
            if (dVar != pVar.d()) {
                int d10 = this.f89k.d() - C1.size();
                if (d10 <= 0) {
                    break;
                }
                C1.addAll(C1(sQLiteDatabase, pVar.f(dVar), d10));
            }
        }
        return c1(C1, D1(sQLiteDatabase, C1));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ v3.a q1(Map map, a.C0203a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b Q0 = Q0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(v3.c.c().c(Q0).b(j10).a());
        }
        F1(aVar, map);
        aVar.e(Y0());
        aVar.d(V0());
        aVar.c(this.f90l.get());
        return aVar.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ v3.a r1(String str, Map map, a.C0203a aVar, SQLiteDatabase sQLiteDatabase) {
        return (v3.a) K1(sQLiteDatabase.rawQuery(str, new String[0]), new m(this, map, aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object s1(List list, p pVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z10 = false;
            long j10 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z10 = true;
            }
            i.a k10 = i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z10) {
                k10.h(new h(I1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k10.h(new h(I1(cursor.getString(4)), G1(j10)));
            }
            if (!cursor.isNull(6)) {
                k10.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(k.a(j10, pVar, k10.d()));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object t1(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Long u1(i iVar, p pVar, SQLiteDatabase sQLiteDatabase) {
        if (b1()) {
            q(1, c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long S0 = S0(sQLiteDatabase, pVar);
        int e10 = this.f89k.e();
        byte[] a10 = iVar.e().a();
        boolean z10 = a10.length <= e10;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(S0));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? a10 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        if (!z10) {
            int ceil = (int) Math.ceil(((double) a10.length) / ((double) e10));
            for (int i10 = 1; i10 <= ceil; i10++) {
                byte[] copyOfRange = Arrays.copyOfRange(a10, (i10 - 1) * e10, Math.min(i10 * e10, a10.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues2);
            }
        }
        for (Map.Entry next : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) next.getKey());
            contentValues3.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ byte[] v1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i10 += blob.length;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr2 = (byte[]) arrayList.get(i12);
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object w1(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            q((long) i10, c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object x1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        K1(sQLiteDatabase.rawQuery(str2, (String[]) null), new g0(this));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean y1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object z1(String str, c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) K1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), x.f132a)).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put(Constants.REASON, Integer.valueOf(bVar.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())});
        }
        return null;
    }

    public long D0(p pVar) {
        return ((Long) K1(U0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(d4.a.a(pVar.d()))}), u.f126a)).longValue();
    }

    public Iterable<p> I() {
        return (Iterable) a1(z.f134a);
    }

    public boolean J0(p pVar) {
        return ((Boolean) a1(new p(this, pVar))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public long T0() {
        return W0() * X0();
    }

    /* access modifiers changed from: package-private */
    public SQLiteDatabase U0() {
        t0 t0Var = this.f86h;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) H1(new c0(t0Var), a0.f52a);
    }

    public <T> T a(a.C0096a<T> aVar) {
        SQLiteDatabase U0 = U0();
        R0(U0);
        try {
            T a10 = aVar.a();
            U0.setTransactionSuccessful();
            return a10;
        } finally {
            U0.endTransaction();
        }
    }

    /* access modifiers changed from: package-private */
    public <T> T a1(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase U0 = U0();
        U0.beginTransaction();
        try {
            T apply = bVar.apply(U0);
            U0.setTransactionSuccessful();
            return apply;
        } finally {
            U0.endTransaction();
        }
    }

    public void close() {
        this.f86h.close();
    }

    public k d0(p pVar, i iVar) {
        w3.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), iVar.j(), pVar.b());
        long longValue = ((Long) a1(new n(this, iVar, pVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return k.a(longValue, pVar, iVar);
    }

    public void e0(p pVar, long j10) {
        a1(new e0(j10, pVar));
    }

    public void h() {
        a1(new h0(this));
    }

    public v3.a j() {
        return (v3.a) a1(new k0(this, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new HashMap(), v3.a.e()));
    }

    public int l() {
        return ((Integer) a1(new i0(this, this.f87i.a() - this.f89k.c()))).intValue();
    }

    public Iterable<k> m(p pVar) {
        return (Iterable) a1(new o(this, pVar));
    }

    public void n(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            U0().compileStatement("DELETE FROM events WHERE _id in " + J1(iterable)).execute();
        }
    }

    public void q(long j10, c.b bVar, String str) {
        a1(new q(str, bVar, j10));
    }

    public void z0(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            a1(new j0(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + J1(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }
}
