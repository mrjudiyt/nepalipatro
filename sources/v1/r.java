package v1;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.v;
import java.util.ArrayList;
import java.util.List;
import v1.p;

/* compiled from: WorkSpecDao_Impl */
public final class r implements q {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.room.h f12281a;

    /* renamed from: b  reason: collision with root package name */
    private final a1.a<p> f12282b;

    /* renamed from: c  reason: collision with root package name */
    private final a1.d f12283c;

    /* renamed from: d  reason: collision with root package name */
    private final a1.d f12284d;

    /* renamed from: e  reason: collision with root package name */
    private final a1.d f12285e;

    /* renamed from: f  reason: collision with root package name */
    private final a1.d f12286f;

    /* renamed from: g  reason: collision with root package name */
    private final a1.d f12287g;

    /* renamed from: h  reason: collision with root package name */
    private final a1.d f12288h;

    /* renamed from: i  reason: collision with root package name */
    private final a1.d f12289i;

    /* renamed from: j  reason: collision with root package name */
    private final a1.d f12290j;

    /* compiled from: WorkSpecDao_Impl */
    class a extends a1.a<p> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: i */
        public void g(e1.f fVar, p pVar) {
            String str = pVar.f12255a;
            if (str == null) {
                fVar.i0(1);
            } else {
                fVar.v(1, str);
            }
            fVar.N(2, (long) v.j(pVar.f12256b));
            String str2 = pVar.f12257c;
            if (str2 == null) {
                fVar.i0(3);
            } else {
                fVar.v(3, str2);
            }
            String str3 = pVar.f12258d;
            if (str3 == null) {
                fVar.i0(4);
            } else {
                fVar.v(4, str3);
            }
            byte[] l10 = androidx.work.e.l(pVar.f12259e);
            if (l10 == null) {
                fVar.i0(5);
            } else {
                fVar.R(5, l10);
            }
            byte[] l11 = androidx.work.e.l(pVar.f12260f);
            if (l11 == null) {
                fVar.i0(6);
            } else {
                fVar.R(6, l11);
            }
            fVar.N(7, pVar.f12261g);
            fVar.N(8, pVar.f12262h);
            fVar.N(9, pVar.f12263i);
            fVar.N(10, (long) pVar.f12265k);
            fVar.N(11, (long) v.a(pVar.f12266l));
            fVar.N(12, pVar.f12267m);
            fVar.N(13, pVar.f12268n);
            fVar.N(14, pVar.f12269o);
            fVar.N(15, pVar.f12270p);
            fVar.N(16, pVar.f12271q ? 1 : 0);
            fVar.N(17, (long) v.i(pVar.f12272r));
            androidx.work.c cVar = pVar.f12264j;
            if (cVar != null) {
                fVar.N(18, (long) v.h(cVar.b()));
                fVar.N(19, cVar.g() ? 1 : 0);
                fVar.N(20, cVar.h() ? 1 : 0);
                fVar.N(21, cVar.f() ? 1 : 0);
                fVar.N(22, cVar.i() ? 1 : 0);
                fVar.N(23, cVar.c());
                fVar.N(24, cVar.d());
                byte[] c10 = v.c(cVar.a());
                if (c10 == null) {
                    fVar.i0(25);
                } else {
                    fVar.R(25, c10);
                }
            } else {
                fVar.i0(18);
                fVar.i0(19);
                fVar.i0(20);
                fVar.i0(21);
                fVar.i0(22);
                fVar.i0(23);
                fVar.i0(24);
                fVar.i0(25);
            }
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class b extends a1.d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class c extends a1.d {
        c(androidx.room.h hVar) {
            super(hVar);
        }

        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class d extends a1.d {
        d(androidx.room.h hVar) {
            super(hVar);
        }

        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class e extends a1.d {
        e(androidx.room.h hVar) {
            super(hVar);
        }

        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class f extends a1.d {
        f(androidx.room.h hVar) {
            super(hVar);
        }

        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class g extends a1.d {
        g(androidx.room.h hVar) {
            super(hVar);
        }

        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class h extends a1.d {
        h(androidx.room.h hVar) {
            super(hVar);
        }

        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class i extends a1.d {
        i(androidx.room.h hVar) {
            super(hVar);
        }

        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(androidx.room.h hVar) {
        this.f12281a = hVar;
        this.f12282b = new a(hVar);
        this.f12283c = new b(hVar);
        this.f12284d = new c(hVar);
        this.f12285e = new d(hVar);
        this.f12286f = new e(hVar);
        this.f12287g = new f(hVar);
        this.f12288h = new g(hVar);
        this.f12289i = new h(hVar);
        this.f12290j = new i(hVar);
    }

    public void a(String str) {
        this.f12281a.b();
        e1.f a10 = this.f12283c.a();
        if (str == null) {
            a10.i0(1);
        } else {
            a10.v(1, str);
        }
        this.f12281a.c();
        try {
            a10.z();
            this.f12281a.r();
        } finally {
            this.f12281a.g();
            this.f12283c.f(a10);
        }
    }

    public int b(v.a aVar, String... strArr) {
        this.f12281a.b();
        StringBuilder b10 = c1.e.b();
        b10.append("UPDATE workspec SET state=");
        b10.append("?");
        b10.append(" WHERE id IN (");
        c1.e.a(b10, strArr.length);
        b10.append(")");
        e1.f d10 = this.f12281a.d(b10.toString());
        d10.N(1, (long) v.j(aVar));
        int i10 = 2;
        for (String str : strArr) {
            if (str == null) {
                d10.i0(i10);
            } else {
                d10.v(i10, str);
            }
            i10++;
        }
        this.f12281a.c();
        try {
            int z10 = d10.z();
            this.f12281a.r();
            return z10;
        } finally {
            this.f12281a.g();
        }
    }

    public int c(String str, long j10) {
        this.f12281a.b();
        e1.f a10 = this.f12288h.a();
        a10.N(1, j10);
        if (str == null) {
            a10.i0(2);
        } else {
            a10.v(2, str);
        }
        this.f12281a.c();
        try {
            int z10 = a10.z();
            this.f12281a.r();
            return z10;
        } finally {
            this.f12281a.g();
            this.f12288h.f(a10);
        }
    }

    public List<p.b> d(String str) {
        a1.c j10 = a1.c.j("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            j10.i0(1);
        } else {
            j10.v(1, str);
        }
        this.f12281a.b();
        Cursor b10 = c1.c.b(this.f12281a, j10, false, (CancellationSignal) null);
        try {
            int b11 = c1.b.b(b10, "id");
            int b12 = c1.b.b(b10, "state");
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                p.b bVar = new p.b();
                bVar.f12273a = b10.getString(b11);
                bVar.f12274b = v.g(b10.getInt(b12));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            b10.close();
            j10.release();
        }
    }

    public List<p> e(long j10) {
        a1.c cVar;
        a1.c j11 = a1.c.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        j11.N(1, j10);
        this.f12281a.b();
        Cursor b10 = c1.c.b(this.f12281a, j11, false, (CancellationSignal) null);
        try {
            int b11 = c1.b.b(b10, "required_network_type");
            int b12 = c1.b.b(b10, "requires_charging");
            int b13 = c1.b.b(b10, "requires_device_idle");
            int b14 = c1.b.b(b10, "requires_battery_not_low");
            int b15 = c1.b.b(b10, "requires_storage_not_low");
            int b16 = c1.b.b(b10, "trigger_content_update_delay");
            int b17 = c1.b.b(b10, "trigger_max_content_delay");
            int b18 = c1.b.b(b10, "content_uri_triggers");
            int b19 = c1.b.b(b10, "id");
            int b20 = c1.b.b(b10, "state");
            int b21 = c1.b.b(b10, "worker_class_name");
            int b22 = c1.b.b(b10, "input_merger_class_name");
            int b23 = c1.b.b(b10, "input");
            int b24 = c1.b.b(b10, "output");
            cVar = j11;
            try {
                int b25 = c1.b.b(b10, "initial_delay");
                int b26 = c1.b.b(b10, "interval_duration");
                int b27 = c1.b.b(b10, "flex_duration");
                int b28 = c1.b.b(b10, "run_attempt_count");
                int b29 = c1.b.b(b10, "backoff_policy");
                int b30 = c1.b.b(b10, "backoff_delay_duration");
                int b31 = c1.b.b(b10, "period_start_time");
                int b32 = c1.b.b(b10, "minimum_retention_duration");
                int b33 = c1.b.b(b10, "schedule_requested_at");
                int b34 = c1.b.b(b10, "run_in_foreground");
                int b35 = c1.b.b(b10, "out_of_quota_policy");
                int i10 = b24;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(b19);
                    int i11 = b19;
                    String string2 = b10.getString(b21);
                    int i12 = b21;
                    androidx.work.c cVar2 = new androidx.work.c();
                    int i13 = b11;
                    cVar2.k(v.e(b10.getInt(b11)));
                    cVar2.m(b10.getInt(b12) != 0);
                    cVar2.n(b10.getInt(b13) != 0);
                    cVar2.l(b10.getInt(b14) != 0);
                    cVar2.o(b10.getInt(b15) != 0);
                    int i14 = b12;
                    int i15 = b13;
                    cVar2.p(b10.getLong(b16));
                    cVar2.q(b10.getLong(b17));
                    cVar2.j(v.b(b10.getBlob(b18)));
                    p pVar = new p(string, string2);
                    pVar.f12256b = v.g(b10.getInt(b20));
                    pVar.f12258d = b10.getString(b22);
                    pVar.f12259e = androidx.work.e.g(b10.getBlob(b23));
                    int i16 = i10;
                    pVar.f12260f = androidx.work.e.g(b10.getBlob(i16));
                    int i17 = b25;
                    int i18 = i14;
                    i10 = i16;
                    pVar.f12261g = b10.getLong(i17);
                    int i19 = b22;
                    int i20 = b26;
                    pVar.f12262h = b10.getLong(i20);
                    int i21 = i17;
                    int i22 = b14;
                    int i23 = b27;
                    pVar.f12263i = b10.getLong(i23);
                    int i24 = b28;
                    pVar.f12265k = b10.getInt(i24);
                    int i25 = b29;
                    int i26 = i20;
                    pVar.f12266l = v.d(b10.getInt(i25));
                    b27 = i23;
                    int i27 = i22;
                    int i28 = b30;
                    pVar.f12267m = b10.getLong(i28);
                    int i29 = i24;
                    int i30 = i25;
                    int i31 = b31;
                    pVar.f12268n = b10.getLong(i31);
                    int i32 = i28;
                    b31 = i31;
                    int i33 = b32;
                    pVar.f12269o = b10.getLong(i33);
                    int i34 = i29;
                    int i35 = b33;
                    pVar.f12270p = b10.getLong(i35);
                    int i36 = b34;
                    pVar.f12271q = b10.getInt(i36) != 0;
                    int i37 = b35;
                    int i38 = i35;
                    pVar.f12272r = v.f(b10.getInt(i37));
                    pVar.f12264j = cVar2;
                    arrayList.add(pVar);
                    b12 = i18;
                    b35 = i37;
                    b22 = i19;
                    b25 = i21;
                    b26 = i26;
                    b28 = i34;
                    b33 = i38;
                    b19 = i11;
                    b21 = i12;
                    b11 = i13;
                    b34 = i36;
                    b32 = i33;
                    b13 = i15;
                    int i39 = i30;
                    b30 = i32;
                    b14 = i27;
                    b29 = i39;
                }
                b10.close();
                cVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                cVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = j11;
            b10.close();
            cVar.release();
            throw th;
        }
    }

    public List<p> f(int i10) {
        a1.c cVar;
        a1.c j10 = a1.c.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        j10.N(1, (long) i10);
        this.f12281a.b();
        Cursor b10 = c1.c.b(this.f12281a, j10, false, (CancellationSignal) null);
        try {
            int b11 = c1.b.b(b10, "required_network_type");
            int b12 = c1.b.b(b10, "requires_charging");
            int b13 = c1.b.b(b10, "requires_device_idle");
            int b14 = c1.b.b(b10, "requires_battery_not_low");
            int b15 = c1.b.b(b10, "requires_storage_not_low");
            int b16 = c1.b.b(b10, "trigger_content_update_delay");
            int b17 = c1.b.b(b10, "trigger_max_content_delay");
            int b18 = c1.b.b(b10, "content_uri_triggers");
            int b19 = c1.b.b(b10, "id");
            int b20 = c1.b.b(b10, "state");
            int b21 = c1.b.b(b10, "worker_class_name");
            int b22 = c1.b.b(b10, "input_merger_class_name");
            int b23 = c1.b.b(b10, "input");
            int b24 = c1.b.b(b10, "output");
            cVar = j10;
            try {
                int b25 = c1.b.b(b10, "initial_delay");
                int b26 = c1.b.b(b10, "interval_duration");
                int b27 = c1.b.b(b10, "flex_duration");
                int b28 = c1.b.b(b10, "run_attempt_count");
                int b29 = c1.b.b(b10, "backoff_policy");
                int b30 = c1.b.b(b10, "backoff_delay_duration");
                int b31 = c1.b.b(b10, "period_start_time");
                int b32 = c1.b.b(b10, "minimum_retention_duration");
                int b33 = c1.b.b(b10, "schedule_requested_at");
                int b34 = c1.b.b(b10, "run_in_foreground");
                int b35 = c1.b.b(b10, "out_of_quota_policy");
                int i11 = b24;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(b19);
                    int i12 = b19;
                    String string2 = b10.getString(b21);
                    int i13 = b21;
                    androidx.work.c cVar2 = new androidx.work.c();
                    int i14 = b11;
                    cVar2.k(v.e(b10.getInt(b11)));
                    cVar2.m(b10.getInt(b12) != 0);
                    cVar2.n(b10.getInt(b13) != 0);
                    cVar2.l(b10.getInt(b14) != 0);
                    cVar2.o(b10.getInt(b15) != 0);
                    int i15 = b12;
                    int i16 = b13;
                    cVar2.p(b10.getLong(b16));
                    cVar2.q(b10.getLong(b17));
                    cVar2.j(v.b(b10.getBlob(b18)));
                    p pVar = new p(string, string2);
                    pVar.f12256b = v.g(b10.getInt(b20));
                    pVar.f12258d = b10.getString(b22);
                    pVar.f12259e = androidx.work.e.g(b10.getBlob(b23));
                    int i17 = i11;
                    pVar.f12260f = androidx.work.e.g(b10.getBlob(i17));
                    int i18 = i15;
                    i11 = i17;
                    int i19 = b25;
                    pVar.f12261g = b10.getLong(i19);
                    int i20 = b22;
                    int i21 = b26;
                    pVar.f12262h = b10.getLong(i21);
                    int i22 = i19;
                    int i23 = b14;
                    int i24 = b27;
                    pVar.f12263i = b10.getLong(i24);
                    int i25 = b28;
                    pVar.f12265k = b10.getInt(i25);
                    int i26 = b29;
                    int i27 = i21;
                    pVar.f12266l = v.d(b10.getInt(i26));
                    b27 = i24;
                    int i28 = i23;
                    int i29 = b30;
                    pVar.f12267m = b10.getLong(i29);
                    int i30 = i25;
                    int i31 = i26;
                    int i32 = b31;
                    pVar.f12268n = b10.getLong(i32);
                    int i33 = i29;
                    b31 = i32;
                    int i34 = b32;
                    pVar.f12269o = b10.getLong(i34);
                    int i35 = i30;
                    int i36 = b33;
                    pVar.f12270p = b10.getLong(i36);
                    int i37 = b34;
                    pVar.f12271q = b10.getInt(i37) != 0;
                    int i38 = b35;
                    int i39 = i36;
                    pVar.f12272r = v.f(b10.getInt(i38));
                    pVar.f12264j = cVar2;
                    arrayList.add(pVar);
                    b35 = i38;
                    b12 = i18;
                    b22 = i20;
                    b25 = i22;
                    b26 = i27;
                    b28 = i35;
                    b33 = i39;
                    b19 = i12;
                    b21 = i13;
                    b11 = i14;
                    b34 = i37;
                    b32 = i34;
                    b13 = i16;
                    int i40 = i31;
                    b30 = i33;
                    b14 = i28;
                    b29 = i40;
                }
                b10.close();
                cVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                cVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = j10;
            b10.close();
            cVar.release();
            throw th;
        }
    }

    public List<p> g() {
        a1.c cVar;
        a1.c j10 = a1.c.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f12281a.b();
        Cursor b10 = c1.c.b(this.f12281a, j10, false, (CancellationSignal) null);
        try {
            int b11 = c1.b.b(b10, "required_network_type");
            int b12 = c1.b.b(b10, "requires_charging");
            int b13 = c1.b.b(b10, "requires_device_idle");
            int b14 = c1.b.b(b10, "requires_battery_not_low");
            int b15 = c1.b.b(b10, "requires_storage_not_low");
            int b16 = c1.b.b(b10, "trigger_content_update_delay");
            int b17 = c1.b.b(b10, "trigger_max_content_delay");
            int b18 = c1.b.b(b10, "content_uri_triggers");
            int b19 = c1.b.b(b10, "id");
            int b20 = c1.b.b(b10, "state");
            int b21 = c1.b.b(b10, "worker_class_name");
            int b22 = c1.b.b(b10, "input_merger_class_name");
            int b23 = c1.b.b(b10, "input");
            int b24 = c1.b.b(b10, "output");
            cVar = j10;
            try {
                int b25 = c1.b.b(b10, "initial_delay");
                int b26 = c1.b.b(b10, "interval_duration");
                int b27 = c1.b.b(b10, "flex_duration");
                int b28 = c1.b.b(b10, "run_attempt_count");
                int b29 = c1.b.b(b10, "backoff_policy");
                int b30 = c1.b.b(b10, "backoff_delay_duration");
                int b31 = c1.b.b(b10, "period_start_time");
                int b32 = c1.b.b(b10, "minimum_retention_duration");
                int b33 = c1.b.b(b10, "schedule_requested_at");
                int b34 = c1.b.b(b10, "run_in_foreground");
                int b35 = c1.b.b(b10, "out_of_quota_policy");
                int i10 = b24;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(b19);
                    int i11 = b19;
                    String string2 = b10.getString(b21);
                    int i12 = b21;
                    androidx.work.c cVar2 = new androidx.work.c();
                    int i13 = b11;
                    cVar2.k(v.e(b10.getInt(b11)));
                    cVar2.m(b10.getInt(b12) != 0);
                    cVar2.n(b10.getInt(b13) != 0);
                    cVar2.l(b10.getInt(b14) != 0);
                    cVar2.o(b10.getInt(b15) != 0);
                    int i14 = b12;
                    int i15 = b13;
                    cVar2.p(b10.getLong(b16));
                    cVar2.q(b10.getLong(b17));
                    cVar2.j(v.b(b10.getBlob(b18)));
                    p pVar = new p(string, string2);
                    pVar.f12256b = v.g(b10.getInt(b20));
                    pVar.f12258d = b10.getString(b22);
                    pVar.f12259e = androidx.work.e.g(b10.getBlob(b23));
                    int i16 = i10;
                    pVar.f12260f = androidx.work.e.g(b10.getBlob(i16));
                    int i17 = i14;
                    i10 = i16;
                    int i18 = b25;
                    pVar.f12261g = b10.getLong(i18);
                    int i19 = b23;
                    int i20 = b26;
                    pVar.f12262h = b10.getLong(i20);
                    int i21 = i18;
                    int i22 = b14;
                    int i23 = b27;
                    pVar.f12263i = b10.getLong(i23);
                    int i24 = b28;
                    pVar.f12265k = b10.getInt(i24);
                    int i25 = b29;
                    int i26 = i20;
                    pVar.f12266l = v.d(b10.getInt(i25));
                    b27 = i23;
                    int i27 = i22;
                    int i28 = b30;
                    pVar.f12267m = b10.getLong(i28);
                    int i29 = i24;
                    int i30 = i25;
                    int i31 = b31;
                    pVar.f12268n = b10.getLong(i31);
                    int i32 = i28;
                    b31 = i31;
                    int i33 = b32;
                    pVar.f12269o = b10.getLong(i33);
                    int i34 = i29;
                    int i35 = b33;
                    pVar.f12270p = b10.getLong(i35);
                    int i36 = b34;
                    pVar.f12271q = b10.getInt(i36) != 0;
                    int i37 = b35;
                    int i38 = i35;
                    pVar.f12272r = v.f(b10.getInt(i37));
                    pVar.f12264j = cVar2;
                    arrayList.add(pVar);
                    b35 = i37;
                    b12 = i17;
                    b23 = i19;
                    b25 = i21;
                    b26 = i26;
                    b28 = i34;
                    b33 = i38;
                    b19 = i11;
                    b21 = i12;
                    b11 = i13;
                    b34 = i36;
                    b32 = i33;
                    b13 = i15;
                    int i39 = i30;
                    b30 = i32;
                    b14 = i27;
                    b29 = i39;
                }
                b10.close();
                cVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                cVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = j10;
            b10.close();
            cVar.release();
            throw th;
        }
    }

    public void h(String str, androidx.work.e eVar) {
        this.f12281a.b();
        e1.f a10 = this.f12284d.a();
        byte[] l10 = androidx.work.e.l(eVar);
        if (l10 == null) {
            a10.i0(1);
        } else {
            a10.R(1, l10);
        }
        if (str == null) {
            a10.i0(2);
        } else {
            a10.v(2, str);
        }
        this.f12281a.c();
        try {
            a10.z();
            this.f12281a.r();
        } finally {
            this.f12281a.g();
            this.f12284d.f(a10);
        }
    }

    public List<p> i() {
        a1.c cVar;
        a1.c j10 = a1.c.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f12281a.b();
        Cursor b10 = c1.c.b(this.f12281a, j10, false, (CancellationSignal) null);
        try {
            int b11 = c1.b.b(b10, "required_network_type");
            int b12 = c1.b.b(b10, "requires_charging");
            int b13 = c1.b.b(b10, "requires_device_idle");
            int b14 = c1.b.b(b10, "requires_battery_not_low");
            int b15 = c1.b.b(b10, "requires_storage_not_low");
            int b16 = c1.b.b(b10, "trigger_content_update_delay");
            int b17 = c1.b.b(b10, "trigger_max_content_delay");
            int b18 = c1.b.b(b10, "content_uri_triggers");
            int b19 = c1.b.b(b10, "id");
            int b20 = c1.b.b(b10, "state");
            int b21 = c1.b.b(b10, "worker_class_name");
            int b22 = c1.b.b(b10, "input_merger_class_name");
            int b23 = c1.b.b(b10, "input");
            int b24 = c1.b.b(b10, "output");
            cVar = j10;
            try {
                int b25 = c1.b.b(b10, "initial_delay");
                int b26 = c1.b.b(b10, "interval_duration");
                int b27 = c1.b.b(b10, "flex_duration");
                int b28 = c1.b.b(b10, "run_attempt_count");
                int b29 = c1.b.b(b10, "backoff_policy");
                int b30 = c1.b.b(b10, "backoff_delay_duration");
                int b31 = c1.b.b(b10, "period_start_time");
                int b32 = c1.b.b(b10, "minimum_retention_duration");
                int b33 = c1.b.b(b10, "schedule_requested_at");
                int b34 = c1.b.b(b10, "run_in_foreground");
                int b35 = c1.b.b(b10, "out_of_quota_policy");
                int i10 = b24;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(b19);
                    int i11 = b19;
                    String string2 = b10.getString(b21);
                    int i12 = b21;
                    androidx.work.c cVar2 = new androidx.work.c();
                    int i13 = b11;
                    cVar2.k(v.e(b10.getInt(b11)));
                    cVar2.m(b10.getInt(b12) != 0);
                    cVar2.n(b10.getInt(b13) != 0);
                    cVar2.l(b10.getInt(b14) != 0);
                    cVar2.o(b10.getInt(b15) != 0);
                    int i14 = b12;
                    int i15 = b13;
                    cVar2.p(b10.getLong(b16));
                    cVar2.q(b10.getLong(b17));
                    cVar2.j(v.b(b10.getBlob(b18)));
                    p pVar = new p(string, string2);
                    pVar.f12256b = v.g(b10.getInt(b20));
                    pVar.f12258d = b10.getString(b22);
                    pVar.f12259e = androidx.work.e.g(b10.getBlob(b23));
                    int i16 = i10;
                    pVar.f12260f = androidx.work.e.g(b10.getBlob(i16));
                    int i17 = i14;
                    i10 = i16;
                    int i18 = b25;
                    pVar.f12261g = b10.getLong(i18);
                    int i19 = b23;
                    int i20 = b26;
                    pVar.f12262h = b10.getLong(i20);
                    int i21 = i18;
                    int i22 = b14;
                    int i23 = b27;
                    pVar.f12263i = b10.getLong(i23);
                    int i24 = b28;
                    pVar.f12265k = b10.getInt(i24);
                    int i25 = b29;
                    int i26 = i20;
                    pVar.f12266l = v.d(b10.getInt(i25));
                    b27 = i23;
                    int i27 = i22;
                    int i28 = b30;
                    pVar.f12267m = b10.getLong(i28);
                    int i29 = i24;
                    int i30 = i25;
                    int i31 = b31;
                    pVar.f12268n = b10.getLong(i31);
                    int i32 = i28;
                    b31 = i31;
                    int i33 = b32;
                    pVar.f12269o = b10.getLong(i33);
                    int i34 = i29;
                    int i35 = b33;
                    pVar.f12270p = b10.getLong(i35);
                    int i36 = b34;
                    pVar.f12271q = b10.getInt(i36) != 0;
                    int i37 = b35;
                    int i38 = i35;
                    pVar.f12272r = v.f(b10.getInt(i37));
                    pVar.f12264j = cVar2;
                    arrayList.add(pVar);
                    b35 = i37;
                    b12 = i17;
                    b23 = i19;
                    b25 = i21;
                    b26 = i26;
                    b28 = i34;
                    b33 = i38;
                    b19 = i11;
                    b21 = i12;
                    b11 = i13;
                    b34 = i36;
                    b32 = i33;
                    b13 = i15;
                    int i39 = i30;
                    b30 = i32;
                    b14 = i27;
                    b29 = i39;
                }
                b10.close();
                cVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                cVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = j10;
            b10.close();
            cVar.release();
            throw th;
        }
    }

    public boolean j() {
        boolean z10 = false;
        a1.c j10 = a1.c.j("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f12281a.b();
        Cursor b10 = c1.c.b(this.f12281a, j10, false, (CancellationSignal) null);
        try {
            if (b10.moveToFirst() && b10.getInt(0) != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            b10.close();
            j10.release();
        }
    }

    public void k(p pVar) {
        this.f12281a.b();
        this.f12281a.c();
        try {
            this.f12282b.h(pVar);
            this.f12281a.r();
        } finally {
            this.f12281a.g();
        }
    }

    public List<String> l(String str) {
        a1.c j10 = a1.c.j("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            j10.i0(1);
        } else {
            j10.v(1, str);
        }
        this.f12281a.b();
        Cursor b10 = c1.c.b(this.f12281a, j10, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            j10.release();
        }
    }

    public v.a m(String str) {
        a1.c j10 = a1.c.j("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            j10.i0(1);
        } else {
            j10.v(1, str);
        }
        this.f12281a.b();
        v.a aVar = null;
        Cursor b10 = c1.c.b(this.f12281a, j10, false, (CancellationSignal) null);
        try {
            if (b10.moveToFirst()) {
                aVar = v.g(b10.getInt(0));
            }
            return aVar;
        } finally {
            b10.close();
            j10.release();
        }
    }

    public p n(String str) {
        a1.c cVar;
        p pVar;
        String str2 = str;
        a1.c j10 = a1.c.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            j10.i0(1);
        } else {
            j10.v(1, str2);
        }
        this.f12281a.b();
        Cursor b10 = c1.c.b(this.f12281a, j10, false, (CancellationSignal) null);
        try {
            int b11 = c1.b.b(b10, "required_network_type");
            int b12 = c1.b.b(b10, "requires_charging");
            int b13 = c1.b.b(b10, "requires_device_idle");
            int b14 = c1.b.b(b10, "requires_battery_not_low");
            int b15 = c1.b.b(b10, "requires_storage_not_low");
            int b16 = c1.b.b(b10, "trigger_content_update_delay");
            int b17 = c1.b.b(b10, "trigger_max_content_delay");
            int b18 = c1.b.b(b10, "content_uri_triggers");
            int b19 = c1.b.b(b10, "id");
            int b20 = c1.b.b(b10, "state");
            int b21 = c1.b.b(b10, "worker_class_name");
            int b22 = c1.b.b(b10, "input_merger_class_name");
            int b23 = c1.b.b(b10, "input");
            int b24 = c1.b.b(b10, "output");
            cVar = j10;
            try {
                int b25 = c1.b.b(b10, "initial_delay");
                int b26 = c1.b.b(b10, "interval_duration");
                int b27 = c1.b.b(b10, "flex_duration");
                int b28 = c1.b.b(b10, "run_attempt_count");
                int b29 = c1.b.b(b10, "backoff_policy");
                int b30 = c1.b.b(b10, "backoff_delay_duration");
                int b31 = c1.b.b(b10, "period_start_time");
                int b32 = c1.b.b(b10, "minimum_retention_duration");
                int b33 = c1.b.b(b10, "schedule_requested_at");
                int b34 = c1.b.b(b10, "run_in_foreground");
                int b35 = c1.b.b(b10, "out_of_quota_policy");
                if (b10.moveToFirst()) {
                    String string = b10.getString(b19);
                    String string2 = b10.getString(b21);
                    int i10 = b35;
                    androidx.work.c cVar2 = new androidx.work.c();
                    cVar2.k(v.e(b10.getInt(b11)));
                    cVar2.m(b10.getInt(b12) != 0);
                    cVar2.n(b10.getInt(b13) != 0);
                    cVar2.l(b10.getInt(b14) != 0);
                    cVar2.o(b10.getInt(b15) != 0);
                    cVar2.p(b10.getLong(b16));
                    cVar2.q(b10.getLong(b17));
                    cVar2.j(v.b(b10.getBlob(b18)));
                    p pVar2 = new p(string, string2);
                    pVar2.f12256b = v.g(b10.getInt(b20));
                    pVar2.f12258d = b10.getString(b22);
                    pVar2.f12259e = androidx.work.e.g(b10.getBlob(b23));
                    pVar2.f12260f = androidx.work.e.g(b10.getBlob(b24));
                    pVar2.f12261g = b10.getLong(b25);
                    pVar2.f12262h = b10.getLong(b26);
                    pVar2.f12263i = b10.getLong(b27);
                    pVar2.f12265k = b10.getInt(b28);
                    pVar2.f12266l = v.d(b10.getInt(b29));
                    pVar2.f12267m = b10.getLong(b30);
                    pVar2.f12268n = b10.getLong(b31);
                    pVar2.f12269o = b10.getLong(b32);
                    pVar2.f12270p = b10.getLong(b33);
                    pVar2.f12271q = b10.getInt(b34) != 0;
                    pVar2.f12272r = v.f(b10.getInt(i10));
                    pVar2.f12264j = cVar2;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                b10.close();
                cVar.release();
                return pVar;
            } catch (Throwable th) {
                th = th;
                b10.close();
                cVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = j10;
            b10.close();
            cVar.release();
            throw th;
        }
    }

    public int o(String str) {
        this.f12281a.b();
        e1.f a10 = this.f12287g.a();
        if (str == null) {
            a10.i0(1);
        } else {
            a10.v(1, str);
        }
        this.f12281a.c();
        try {
            int z10 = a10.z();
            this.f12281a.r();
            return z10;
        } finally {
            this.f12281a.g();
            this.f12287g.f(a10);
        }
    }

    public List<String> p(String str) {
        a1.c j10 = a1.c.j("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            j10.i0(1);
        } else {
            j10.v(1, str);
        }
        this.f12281a.b();
        Cursor b10 = c1.c.b(this.f12281a, j10, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            j10.release();
        }
    }

    public List<androidx.work.e> q(String str) {
        a1.c j10 = a1.c.j("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            j10.i0(1);
        } else {
            j10.v(1, str);
        }
        this.f12281a.b();
        Cursor b10 = c1.c.b(this.f12281a, j10, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(androidx.work.e.g(b10.getBlob(0)));
            }
            return arrayList;
        } finally {
            b10.close();
            j10.release();
        }
    }

    public int r(String str) {
        this.f12281a.b();
        e1.f a10 = this.f12286f.a();
        if (str == null) {
            a10.i0(1);
        } else {
            a10.v(1, str);
        }
        this.f12281a.c();
        try {
            int z10 = a10.z();
            this.f12281a.r();
            return z10;
        } finally {
            this.f12281a.g();
            this.f12286f.f(a10);
        }
    }

    public void s(String str, long j10) {
        this.f12281a.b();
        e1.f a10 = this.f12285e.a();
        a10.N(1, j10);
        if (str == null) {
            a10.i0(2);
        } else {
            a10.v(2, str);
        }
        this.f12281a.c();
        try {
            a10.z();
            this.f12281a.r();
        } finally {
            this.f12281a.g();
            this.f12285e.f(a10);
        }
    }

    public List<p> t(int i10) {
        a1.c cVar;
        a1.c j10 = a1.c.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        j10.N(1, (long) i10);
        this.f12281a.b();
        Cursor b10 = c1.c.b(this.f12281a, j10, false, (CancellationSignal) null);
        try {
            int b11 = c1.b.b(b10, "required_network_type");
            int b12 = c1.b.b(b10, "requires_charging");
            int b13 = c1.b.b(b10, "requires_device_idle");
            int b14 = c1.b.b(b10, "requires_battery_not_low");
            int b15 = c1.b.b(b10, "requires_storage_not_low");
            int b16 = c1.b.b(b10, "trigger_content_update_delay");
            int b17 = c1.b.b(b10, "trigger_max_content_delay");
            int b18 = c1.b.b(b10, "content_uri_triggers");
            int b19 = c1.b.b(b10, "id");
            int b20 = c1.b.b(b10, "state");
            int b21 = c1.b.b(b10, "worker_class_name");
            int b22 = c1.b.b(b10, "input_merger_class_name");
            int b23 = c1.b.b(b10, "input");
            int b24 = c1.b.b(b10, "output");
            cVar = j10;
            try {
                int b25 = c1.b.b(b10, "initial_delay");
                int b26 = c1.b.b(b10, "interval_duration");
                int b27 = c1.b.b(b10, "flex_duration");
                int b28 = c1.b.b(b10, "run_attempt_count");
                int b29 = c1.b.b(b10, "backoff_policy");
                int b30 = c1.b.b(b10, "backoff_delay_duration");
                int b31 = c1.b.b(b10, "period_start_time");
                int b32 = c1.b.b(b10, "minimum_retention_duration");
                int b33 = c1.b.b(b10, "schedule_requested_at");
                int b34 = c1.b.b(b10, "run_in_foreground");
                int b35 = c1.b.b(b10, "out_of_quota_policy");
                int i11 = b24;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(b19);
                    int i12 = b19;
                    String string2 = b10.getString(b21);
                    int i13 = b21;
                    androidx.work.c cVar2 = new androidx.work.c();
                    int i14 = b11;
                    cVar2.k(v.e(b10.getInt(b11)));
                    cVar2.m(b10.getInt(b12) != 0);
                    cVar2.n(b10.getInt(b13) != 0);
                    cVar2.l(b10.getInt(b14) != 0);
                    cVar2.o(b10.getInt(b15) != 0);
                    int i15 = b12;
                    int i16 = b13;
                    cVar2.p(b10.getLong(b16));
                    cVar2.q(b10.getLong(b17));
                    cVar2.j(v.b(b10.getBlob(b18)));
                    p pVar = new p(string, string2);
                    pVar.f12256b = v.g(b10.getInt(b20));
                    pVar.f12258d = b10.getString(b22);
                    pVar.f12259e = androidx.work.e.g(b10.getBlob(b23));
                    int i17 = i11;
                    pVar.f12260f = androidx.work.e.g(b10.getBlob(i17));
                    int i18 = i15;
                    i11 = i17;
                    int i19 = b25;
                    pVar.f12261g = b10.getLong(i19);
                    int i20 = b22;
                    int i21 = b26;
                    pVar.f12262h = b10.getLong(i21);
                    int i22 = i19;
                    int i23 = b14;
                    int i24 = b27;
                    pVar.f12263i = b10.getLong(i24);
                    int i25 = b28;
                    pVar.f12265k = b10.getInt(i25);
                    int i26 = b29;
                    int i27 = i21;
                    pVar.f12266l = v.d(b10.getInt(i26));
                    b27 = i24;
                    int i28 = i23;
                    int i29 = b30;
                    pVar.f12267m = b10.getLong(i29);
                    int i30 = i25;
                    int i31 = i26;
                    int i32 = b31;
                    pVar.f12268n = b10.getLong(i32);
                    int i33 = i29;
                    b31 = i32;
                    int i34 = b32;
                    pVar.f12269o = b10.getLong(i34);
                    int i35 = i30;
                    int i36 = b33;
                    pVar.f12270p = b10.getLong(i36);
                    int i37 = b34;
                    pVar.f12271q = b10.getInt(i37) != 0;
                    int i38 = b35;
                    int i39 = i36;
                    pVar.f12272r = v.f(b10.getInt(i38));
                    pVar.f12264j = cVar2;
                    arrayList.add(pVar);
                    b35 = i38;
                    b12 = i18;
                    b22 = i20;
                    b25 = i22;
                    b26 = i27;
                    b28 = i35;
                    b33 = i39;
                    b19 = i12;
                    b21 = i13;
                    b11 = i14;
                    b34 = i37;
                    b32 = i34;
                    b13 = i16;
                    int i40 = i31;
                    b30 = i33;
                    b14 = i28;
                    b29 = i40;
                }
                b10.close();
                cVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                cVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = j10;
            b10.close();
            cVar.release();
            throw th;
        }
    }

    public int u() {
        this.f12281a.b();
        e1.f a10 = this.f12289i.a();
        this.f12281a.c();
        try {
            int z10 = a10.z();
            this.f12281a.r();
            return z10;
        } finally {
            this.f12281a.g();
            this.f12289i.f(a10);
        }
    }
}
