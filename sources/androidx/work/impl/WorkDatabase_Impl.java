package androidx.work.impl;

import androidx.room.h;
import androidx.room.i;
import c1.c;
import c1.f;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import e1.c;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import v1.b;
import v1.e;
import v1.h;
import v1.k;
import v1.l;
import v1.n;
import v1.o;
import v1.q;
import v1.r;
import v1.t;
import v1.u;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: m  reason: collision with root package name */
    private volatile q f4766m;

    /* renamed from: n  reason: collision with root package name */
    private volatile b f4767n;

    /* renamed from: o  reason: collision with root package name */
    private volatile t f4768o;

    /* renamed from: p  reason: collision with root package name */
    private volatile h f4769p;

    /* renamed from: q  reason: collision with root package name */
    private volatile k f4770q;

    /* renamed from: r  reason: collision with root package name */
    private volatile n f4771r;

    /* renamed from: s  reason: collision with root package name */
    private volatile e f4772s;

    class a extends i.a {
        a(int i10) {
            super(i10);
        }

        public void a(e1.b bVar) {
            bVar.t("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.t("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            bVar.t("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            bVar.t("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            bVar.t("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            bVar.t("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            bVar.t("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.t("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            bVar.t("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.t("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.t("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            bVar.t("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.t("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            bVar.t("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.t("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        public void b(e1.b bVar) {
            bVar.t("DROP TABLE IF EXISTS `Dependency`");
            bVar.t("DROP TABLE IF EXISTS `WorkSpec`");
            bVar.t("DROP TABLE IF EXISTS `WorkTag`");
            bVar.t("DROP TABLE IF EXISTS `SystemIdInfo`");
            bVar.t("DROP TABLE IF EXISTS `WorkName`");
            bVar.t("DROP TABLE IF EXISTS `WorkProgress`");
            bVar.t("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.f4404h != null) {
                int size = WorkDatabase_Impl.this.f4404h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((h.b) WorkDatabase_Impl.this.f4404h.get(i10)).b(bVar);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void c(e1.b bVar) {
            if (WorkDatabase_Impl.this.f4404h != null) {
                int size = WorkDatabase_Impl.this.f4404h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((h.b) WorkDatabase_Impl.this.f4404h.get(i10)).a(bVar);
                }
            }
        }

        public void d(e1.b bVar) {
            e1.b unused = WorkDatabase_Impl.this.f4397a = bVar;
            bVar.t("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.m(bVar);
            if (WorkDatabase_Impl.this.f4404h != null) {
                int size = WorkDatabase_Impl.this.f4404h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((h.b) WorkDatabase_Impl.this.f4404h.get(i10)).c(bVar);
                }
            }
        }

        public void e(e1.b bVar) {
        }

        public void f(e1.b bVar) {
            c.a(bVar);
        }

        /* access modifiers changed from: protected */
        public i.b g(e1.b bVar) {
            e1.b bVar2 = bVar;
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap.put("prerequisite_id", new f.a("prerequisite_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            hashSet.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new f.d("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            hashSet2.add(new f.d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"})));
            f fVar = new f("Dependency", hashMap, hashSet, hashSet2);
            f a10 = f.a(bVar2, "Dependency");
            if (!fVar.equals(a10)) {
                return new i.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + fVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new f.a("id", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("state", new f.a("state", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("worker_class_name", new f.a("worker_class_name", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("input_merger_class_name", new f.a("input_merger_class_name", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("input", new f.a("input", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("output", new f.a("output", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("initial_delay", new f.a("initial_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("interval_duration", new f.a("interval_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("flex_duration", new f.a("flex_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_attempt_count", new f.a("run_attempt_count", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_policy", new f.a("backoff_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_delay_duration", new f.a("backoff_delay_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("period_start_time", new f.a("period_start_time", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("minimum_retention_duration", new f.a("minimum_retention_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("schedule_requested_at", new f.a("schedule_requested_at", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_in_foreground", new f.a("run_in_foreground", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("out_of_quota_policy", new f.a("out_of_quota_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("required_network_type", new f.a("required_network_type", "INTEGER", false, 0, (String) null, 1));
            hashMap2.put("requires_charging", new f.a("requires_charging", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_device_idle", new f.a("requires_device_idle", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_battery_not_low", new f.a("requires_battery_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_storage_not_low", new f.a("requires_storage_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_content_update_delay", new f.a("trigger_content_update_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_max_content_delay", new f.a("trigger_max_content_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("content_uri_triggers", new f.a("content_uri_triggers", "BLOB", false, 0, (String) null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new f.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"})));
            hashSet4.add(new f.d("index_WorkSpec_period_start_time", false, Arrays.asList(new String[]{"period_start_time"})));
            f fVar2 = new f("WorkSpec", hashMap2, hashSet3, hashSet4);
            f a11 = f.a(bVar2, "WorkSpec");
            if (!fVar2.equals(a11)) {
                return new i.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + fVar2 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put(ViewHierarchyConstants.TAG_KEY, new f.a(ViewHierarchyConstants.TAG_KEY, "TEXT", true, 1, (String) null, 1));
            hashMap3.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new f.d("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            f fVar3 = new f("WorkTag", hashMap3, hashSet5, hashSet6);
            f a12 = f.a(bVar2, "WorkTag");
            if (!fVar3.equals(a12)) {
                return new i.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + fVar3 + "\n Found:\n" + a12);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap4.put("system_id", new f.a("system_id", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            f fVar4 = new f("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            f a13 = f.a(bVar2, "SystemIdInfo");
            if (!fVar4.equals(a13)) {
                return new i.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + fVar4 + "\n Found:\n" + a13);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new f.a("name", "TEXT", true, 1, (String) null, 1));
            hashMap5.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new f.d("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            f fVar5 = new f("WorkName", hashMap5, hashSet8, hashSet9);
            f a14 = f.a(bVar2, "WorkName");
            if (!fVar5.equals(a14)) {
                return new i.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + fVar5 + "\n Found:\n" + a14);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap6.put("progress", new f.a("progress", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            f fVar6 = new f("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            f a15 = f.a(bVar2, "WorkProgress");
            if (!fVar6.equals(a15)) {
                return new i.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + fVar6 + "\n Found:\n" + a15);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put(Constants.KEY, new f.a(Constants.KEY, "TEXT", true, 1, (String) null, 1));
            hashMap7.put("long_value", new f.a("long_value", "INTEGER", false, 0, (String) null, 1));
            f fVar7 = new f("Preference", hashMap7, new HashSet(0), new HashSet(0));
            f a16 = f.a(bVar2, "Preference");
            if (fVar7.equals(a16)) {
                return new i.b(true, (String) null);
            }
            return new i.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + fVar7 + "\n Found:\n" + a16);
        }
    }

    public n A() {
        n nVar;
        if (this.f4771r != null) {
            return this.f4771r;
        }
        synchronized (this) {
            if (this.f4771r == null) {
                this.f4771r = new o(this);
            }
            nVar = this.f4771r;
        }
        return nVar;
    }

    public q B() {
        q qVar;
        if (this.f4766m != null) {
            return this.f4766m;
        }
        synchronized (this) {
            if (this.f4766m == null) {
                this.f4766m = new r(this);
            }
            qVar = this.f4766m;
        }
        return qVar;
    }

    public t C() {
        t tVar;
        if (this.f4768o != null) {
            return this.f4768o;
        }
        synchronized (this) {
            if (this.f4768o == null) {
                this.f4768o = new u(this);
            }
            tVar = this.f4768o;
        }
        return tVar;
    }

    /* access modifiers changed from: protected */
    public androidx.room.e e() {
        return new androidx.room.e(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    /* access modifiers changed from: protected */
    public e1.c f(androidx.room.a aVar) {
        return aVar.f4333a.a(c.b.a(aVar.f4334b).c(aVar.f4335c).b(new i(aVar, new a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).a());
    }

    public b t() {
        b bVar;
        if (this.f4767n != null) {
            return this.f4767n;
        }
        synchronized (this) {
            if (this.f4767n == null) {
                this.f4767n = new v1.c(this);
            }
            bVar = this.f4767n;
        }
        return bVar;
    }

    public e x() {
        e eVar;
        if (this.f4772s != null) {
            return this.f4772s;
        }
        synchronized (this) {
            if (this.f4772s == null) {
                this.f4772s = new v1.f(this);
            }
            eVar = this.f4772s;
        }
        return eVar;
    }

    public v1.h y() {
        v1.h hVar;
        if (this.f4769p != null) {
            return this.f4769p;
        }
        synchronized (this) {
            if (this.f4769p == null) {
                this.f4769p = new v1.i(this);
            }
            hVar = this.f4769p;
        }
        return hVar;
    }

    public k z() {
        k kVar;
        if (this.f4770q != null) {
            return this.f4770q;
        }
        synchronized (this) {
            if (this.f4770q == null) {
                this.f4770q = new l(this);
            }
            kVar = this.f4770q;
        }
        return kVar;
    }
}
