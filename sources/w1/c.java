package w1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import e1.b;
import v1.d;

/* compiled from: IdGenerator */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final WorkDatabase f12608a;

    public c(WorkDatabase workDatabase) {
        this.f12608a = workDatabase;
    }

    public static void a(Context context, b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i10 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i11 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            bVar.k();
            try {
                bVar.Q("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                bVar.Q("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                sharedPreferences.edit().clear().apply();
                bVar.O();
            } finally {
                bVar.a0();
            }
        }
    }

    private int c(String str) {
        this.f12608a.c();
        try {
            Long a10 = this.f12608a.x().a(str);
            int i10 = 0;
            int intValue = a10 != null ? a10.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i10 = intValue + 1;
            }
            e(str, i10);
            this.f12608a.r();
            return intValue;
        } finally {
            this.f12608a.g();
        }
    }

    private void e(String str, int i10) {
        this.f12608a.x().b(new d(str, (long) i10));
    }

    public int b() {
        int c10;
        synchronized (c.class) {
            c10 = c("next_alarm_manager_id");
        }
        return c10;
    }

    public int d(int i10, int i11) {
        synchronized (c.class) {
            int c10 = c("next_job_scheduler_id");
            if (c10 >= i10) {
                if (c10 <= i11) {
                    i10 = c10;
                }
            }
            e("next_job_scheduler_id", i10 + 1);
        }
        return i10;
    }
}
