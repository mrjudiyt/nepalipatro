package w1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import e1.b;
import v1.d;

/* compiled from: PreferenceUtils */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final WorkDatabase f12610a;

    public e(WorkDatabase workDatabase) {
        this.f12610a = workDatabase;
    }

    public static void b(Context context, b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = 0;
            long j11 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j10 = 1;
            }
            bVar.k();
            try {
                bVar.Q("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j11)});
                bVar.Q("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j10)});
                sharedPreferences.edit().clear().apply();
                bVar.O();
            } finally {
                bVar.a0();
            }
        }
    }

    public boolean a() {
        Long a10 = this.f12610a.x().a("reschedule_needed");
        return a10 != null && a10.longValue() == 1;
    }

    public void c(boolean z10) {
        this.f12610a.x().b(new d("reschedule_needed", z10));
    }
}
