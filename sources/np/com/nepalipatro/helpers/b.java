package np.com.nepalipatro.helpers;

import android.annotation.SuppressLint;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;

/* compiled from: CalendarUtils.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f15915a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final String f15916b = "dd,MMM,yyyy";

    /* renamed from: c  reason: collision with root package name */
    private static final String f15917c = "MMM dd, yyyy";

    /* renamed from: d  reason: collision with root package name */
    private static final String f15918d = "MM-dd-yyyy";

    /* renamed from: e  reason: collision with root package name */
    private static final String f15919e = "yyyy-MM-dd'T'HH:mm:ss.SSS";
    @SuppressLint({"SimpleDateFormat"})

    /* renamed from: f  reason: collision with root package name */
    private static final DateFormat f15920f = new SimpleDateFormat("yyyyMMdd");

    private b() {
    }

    public final Calendar a(Calendar calendar, int i10) {
        m.f(calendar, "date");
        Calendar instance = Calendar.getInstance(new y9.b().g());
        m.e(instance, "getInstance(DateMapping().UTC_TZ)");
        instance.setTime(calendar.getTime());
        instance.add(5, i10);
        return instance;
    }

    public final Calendar b(Calendar calendar, int i10) {
        m.f(calendar, "date");
        Calendar instance = Calendar.getInstance(e.f15961a.T());
        m.e(instance, "getInstance(Constants.nepalTZ)");
        instance.setTime(calendar.getTime());
        instance.add(5, i10);
        return instance;
    }

    public final String c(Calendar calendar, String str) {
        m.f(calendar, "calendar");
        return new SimpleDateFormat(str, new Locale("UTC")).format(calendar.getTime());
    }

    public final String d(Calendar calendar, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        simpleDateFormat.setTimeZone(e.f15961a.T());
        return simpleDateFormat.format(calendar != null ? calendar.getTime() : null);
    }

    public final String e() {
        return f15919e;
    }

    public final Calendar f(String str, String str2) {
        Calendar instance = Calendar.getInstance();
        try {
            instance.setTime(new SimpleDateFormat(str2).parse(str));
            m.e(instance, "calendar");
            return instance;
        } catch (Exception e10) {
            e10.printStackTrace();
            m.e(instance, "calendar");
            return instance;
        }
    }

    public final Calendar g(String str, String str2, TimeZone timeZone) {
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.US);
        TimeZone timeZone2 = timeZone == null ? TimeZone.getTimeZone("UTC") : timeZone;
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone2);
        } else {
            TimeZone.getDefault();
        }
        Calendar instance = Calendar.getInstance();
        if (str != null) {
            try {
                date = simpleDateFormat.parse(str);
            } catch (ParseException e10) {
                e10.printStackTrace();
            }
        } else {
            date = null;
        }
        m.d(date, "null cannot be cast to non-null type java.util.Date");
        instance.setTime(date);
        m.e(instance, "calendar");
        return instance;
    }

    public final Date h(String str) {
        try {
            return f15920f.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final String i(Calendar calendar, String str) {
        m.f(calendar, "calendar");
        String format = new SimpleDateFormat(str, new Locale("UTC")).format(calendar.getTime());
        m.e(format, "df.format(calendar.time)");
        return format;
    }

    public final int j(Calendar calendar, Calendar calendar2, boolean z10) {
        m.f(calendar, "d1");
        m.f(calendar2, "d2");
        calendar2.set(10, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        if (!z10 || !calendar.after(calendar2)) {
            Calendar calendar3 = calendar2;
            calendar2 = calendar;
            calendar = calendar3;
        }
        int i10 = calendar.get(6) - calendar2.get(6);
        TimeUnit.MILLISECONDS.toDays(calendar.getTimeInMillis() - calendar2.getTimeInMillis());
        int i11 = calendar.get(1);
        Object clone = calendar2.clone();
        m.d(clone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar4 = (Calendar) clone;
        if (calendar4.get(1) != i11) {
            Object clone2 = calendar4.clone();
            m.d(clone2, "null cannot be cast to non-null type java.util.Calendar");
            Calendar calendar5 = (Calendar) clone2;
            do {
                i10 += calendar5.getActualMaximum(6);
                calendar5.add(1, 1);
            } while (calendar5.get(1) != i11);
        }
        return i10;
    }

    public final int k(Date date, Date date2) {
        m.f(date, "d1");
        m.f(date2, "d2");
        return (int) (((date2.getTime() - date.getTime()) / ((long) 86400000)) + 1);
    }

    public final int l(String str) {
        if (str == null) {
            return 0;
        }
        int hashCode = str.hashCode();
        if (hashCode == 2252) {
            return !str.equals("FR") ? 0 : 5;
        }
        if (hashCode == 2466) {
            return !str.equals("MO") ? 0 : 1;
        }
        if (hashCode == 2638) {
            return !str.equals("SA") ? 0 : 6;
        }
        if (hashCode != 2658) {
            return hashCode != 2676 ? hashCode != 2689 ? (hashCode == 2766 && str.equals("WE")) ? 3 : 0 : !str.equals("TU") ? 0 : 2 : !str.equals("TH") ? 0 : 4;
        }
        boolean equals = str.equals("SU");
        return 0;
    }

    public final Boolean m(Calendar calendar, Calendar calendar2) {
        m.f(calendar, "d1");
        m.f(calendar2, "d2");
        try {
            return Boolean.valueOf(p.m(i(calendar, "yyyyMMdd"), i(calendar2, "yyyyMMdd"), true));
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }
}
