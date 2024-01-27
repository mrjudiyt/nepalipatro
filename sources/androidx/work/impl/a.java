package androidx.work.impl;

import android.content.Context;
import android.os.Build;

/* compiled from: WorkDatabaseMigrations */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static b1.a f4774a = new C0084a(1, 2);

    /* renamed from: b  reason: collision with root package name */
    public static b1.a f4775b = new b(3, 4);

    /* renamed from: c  reason: collision with root package name */
    public static b1.a f4776c = new c(4, 5);

    /* renamed from: d  reason: collision with root package name */
    public static b1.a f4777d = new d(6, 7);

    /* renamed from: e  reason: collision with root package name */
    public static b1.a f4778e = new e(7, 8);

    /* renamed from: f  reason: collision with root package name */
    public static b1.a f4779f = new f(8, 9);

    /* renamed from: g  reason: collision with root package name */
    public static b1.a f4780g = new g(11, 12);

    /* renamed from: androidx.work.impl.a$a  reason: collision with other inner class name */
    /* compiled from: WorkDatabaseMigrations */
    class C0084a extends b1.a {
        C0084a(int i10, int i11) {
            super(i10, i11);
        }

        public void a(e1.b bVar) {
            bVar.t("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.t("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            bVar.t("DROP TABLE IF EXISTS alarmInfo");
            bVar.t("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    class b extends b1.a {
        b(int i10, int i11) {
            super(i10, i11);
        }

        public void a(e1.b bVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                bVar.t("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    class c extends b1.a {
        c(int i10, int i11) {
            super(i10, i11);
        }

        public void a(e1.b bVar) {
            bVar.t("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            bVar.t("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    class d extends b1.a {
        d(int i10, int i11) {
            super(i10, i11);
        }

        public void a(e1.b bVar) {
            bVar.t("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    class e extends b1.a {
        e(int i10, int i11) {
            super(i10, i11);
        }

        public void a(e1.b bVar) {
            bVar.t("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    class f extends b1.a {
        f(int i10, int i11) {
            super(i10, i11);
        }

        public void a(e1.b bVar) {
            bVar.t("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    class g extends b1.a {
        g(int i10, int i11) {
            super(i10, i11);
        }

        public void a(e1.b bVar) {
            bVar.t("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    public static class h extends b1.a {

        /* renamed from: c  reason: collision with root package name */
        final Context f4781c;

        public h(Context context, int i10, int i11) {
            super(i10, i11);
            this.f4781c = context;
        }

        public void a(e1.b bVar) {
            if (this.f4967b >= 10) {
                bVar.Q("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                return;
            }
            this.f4781c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    public static class i extends b1.a {

        /* renamed from: c  reason: collision with root package name */
        final Context f4782c;

        public i(Context context) {
            super(9, 10);
            this.f4782c = context;
        }

        public void a(e1.b bVar) {
            bVar.t("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            w1.e.b(this.f4782c, bVar);
            w1.c.a(this.f4782c, bVar);
        }
    }
}
