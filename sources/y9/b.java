package y9;

import android.content.Context;
import android.text.format.DateFormat;
import g9.f;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.helpers.e;
import np.com.nepalipatro.models.BsDate;

/* compiled from: DateMapping.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private Calendar f17454a;

    /* renamed from: b  reason: collision with root package name */
    private int f17455b;

    /* renamed from: c  reason: collision with root package name */
    private char[] f17456c;

    /* renamed from: d  reason: collision with root package name */
    private final TimeZone f17457d = TimeZone.getTimeZone("UTC");

    public b() {
        String[] strArr = (String[]) new f("\\|").c("1900|18430412|333433122122334333212122343432212122343432221123333433212122334333212122343432221122343432221213333433212122334333212122343432221122343432221213334333212122334342212122343432221123243432221213334333212122334432212122343432221123243432221213334333212122334432212122343432221123333433122113334333212122334432212122343432221123333433122122334333212122343432212122343432221123333433212122334333212122343432221122343432221213333433212122334333212122343432221122343432221213333433212122334333212122343432221123243432221213334333212122334342212122343432221123243432221213334333212122334432212122343432221123333433122113334333212122334432212122343432221123333433122122334333212122334432212122343432221123333433122122334333212122343432212122343432221213333433212122334333212122343432221122343432221213333433212122334333212122343432221122343432221213334333212122334342212122343432221123243432221213334333212122334432212122343432221123243433122113334333212122334432212122343432221123333433122113334333212122334432212122343432221123333433122122334333212122343432212122343432221123333433212122334333212122343432221122343432221213333433212122334333212122343432221122343432221213334333212122334342212122343432221123243432221213334333212122334432212122343432221123243432221213334333212122334432212122343432221123333433122113334333212122334432212122343432221123333433122122334333212122334432212122343432221123333433122122334333212122343432212122343432221213333433212122334333212122343432221122343432221213333433212122334333212122343432221123243432221213334333212122334342212122343432221123243432221213334333212122334432212122343432221123243433122113334333212122334432212122343432221123333433122122334333212122334432212122343432221123333433122122334333212122343432212122343432221123333433212122334333212122343432221122343432221213333433212122334333212122343432221122343432221213334333212122334342212122343432221123243432221213334333212122334432212122343432221123243433121213334333212122334432212122343432221123333433122113334333212122334432212122343432221123333433122122334333212122343432212122343432221123333433212122334333212122343432221122343432221213333433212122334333212122343432221122343432221213333433212122334333212122343432221123243432221213334333212122334432212122343432221123243432221213334333212122334432212122343432221123333433122113334333212122334432212122343432221123333433122122334333212122334432212122343432221123333433122122334333212122343432212122343432221213333433212122334333212122343432221122343432221213333433212122334333212122343432221122343432221213334333212122334342212122343432221123243432221213334333212122334432212122343432221123243433122113334333212122334432212122343432221123333433122122334333212122334432212122343432221123333433122122334333212122343432212122343432221123333433212122334333212122343432221122343432221213333433212122334333212122343432221122343432221213334333212122334342212122343432221123243432221213334333212122334432212122343432221123243432221213334333212122334432212122343432221123333433122113334333212122334432212122343432221123333433122122334333212122343432212122343432221123333433212122334333212122343432221122343432221213333433212122334333212122343432221122343432221213333433212122334333212122343432221123243432221213334333212122334342212122343432221123243432221213334333212122334432212122343432221123243433122113334333212122334432212122343432221123333433122122334333212122334432212122343432221123333433122122334333212122343432212122343432221123333433212122334333212122343432221122343432221213333433212122334333212122343432221122343432221213334333212122334342212122343432221122", 0).toArray(new String[0]);
        this.f17455b = Integer.parseInt(strArr[0]);
        this.f17454a = np.com.nepalipatro.helpers.b.f15915a.g(strArr[1], "yyyyMMdd", (TimeZone) null);
        char[] charArray = strArr[2].toCharArray();
        m.e(charArray, "this as java.lang.String).toCharArray()");
        this.f17456c = charArray;
    }

    public final BsDate a(BsDate bsDate, int i10) {
        m.f(bsDate, "date");
        int month = bsDate.getMonth();
        int year = bsDate.getYear();
        int day = bsDate.getDay();
        int i11 = month + i10;
        if (i11 > 12) {
            int i12 = (i11 - 1) / 12;
            i11 %= 12;
            if (i11 == 0) {
                i11 = 12;
            }
            year += i12;
        }
        if (day > h(year, i11)) {
            i11++;
            if (i11 > 12) {
                year++;
                day = 1;
                i11 = 1;
            } else {
                day = 1;
            }
        }
        return new BsDate(year, i11, day);
    }

    public final Calendar b(BsDate bsDate) {
        m.f(bsDate, "bsDate");
        int year = bsDate.getYear() - this.f17455b;
        int month = bsDate.getMonth();
        int day = bsDate.getDay();
        int i10 = ((year * 12) + month) - 1;
        char[] cArr = this.f17456c;
        if (cArr == null) {
            m.x("bsDayCountsArray");
            cArr = null;
        }
        int i11 = 0;
        int i12 = 0;
        for (char c10 : cArr) {
            if (i11 >= i10) {
                break;
            }
            i12 += Character.getNumericValue(c10) + 28;
            i11++;
        }
        int i13 = i12 + day;
        Calendar calendar = this.f17454a;
        m.c(calendar);
        Object clone = calendar.clone();
        m.d(clone, "null cannot be cast to non-null type java.util.Calendar");
        return np.com.nepalipatro.helpers.b.f15915a.a((Calendar) clone, i13);
    }

    public final Calendar c(BsDate bsDate) {
        m.f(bsDate, "bsDate");
        int year = bsDate.getYear() - this.f17455b;
        int month = bsDate.getMonth();
        int day = bsDate.getDay();
        int i10 = ((year * 12) + month) - 1;
        char[] cArr = this.f17456c;
        if (cArr == null) {
            m.x("bsDayCountsArray");
            cArr = null;
        }
        int i11 = 0;
        int i12 = 0;
        for (char c10 : cArr) {
            if (i11 >= i10) {
                break;
            }
            i12 += Character.getNumericValue(c10) + 28;
            i11++;
        }
        int i13 = i12 + day;
        Calendar instance = Calendar.getInstance(e.f15961a.T());
        m.e(instance, "getInstance(Constants.nepalTZ)");
        Calendar calendar = this.f17454a;
        m.c(calendar);
        int i14 = calendar.get(1);
        Calendar calendar2 = this.f17454a;
        m.c(calendar2);
        int i15 = calendar2.get(2);
        Calendar calendar3 = this.f17454a;
        m.c(calendar3);
        instance.set(i14, i15, calendar3.get(5));
        return np.com.nepalipatro.helpers.b.f15915a.b(instance, i13);
    }

    public final BsDate d(Calendar calendar) {
        np.com.nepalipatro.helpers.b bVar = np.com.nepalipatro.helpers.b.f15915a;
        m.c(calendar);
        Calendar calendar2 = this.f17454a;
        m.c(calendar2);
        long j10 = (long) bVar.j(calendar, calendar2, true);
        char[] cArr = this.f17456c;
        if (cArr == null) {
            m.x("bsDayCountsArray");
            cArr = null;
        }
        long j11 = 0;
        int i10 = 0;
        int i11 = 0;
        for (char numericValue : cArr) {
            i11 = Character.getNumericValue(numericValue);
            j11 += (long) (i11 + 28);
            if (j10 < j11) {
                break;
            }
            i10++;
        }
        return new BsDate(this.f17455b + (i10 / 12), (i10 % 12) + 1, (int) ((((long) (i11 + 28)) - (j11 - j10)) + 1));
    }

    public final Calendar e(Context context) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(e.f15961a.T());
        instance.setTimeInMillis(System.currentTimeMillis());
        return instance;
    }

    public final CharSequence f(Context context, String str, Locale locale) {
        String str2;
        m.f(str, "format");
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(e.f15961a.T());
        instance.setTimeInMillis(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setCalendar(instance);
        String[] amPmStrings = DateFormatSymbols.getInstance(locale).getAmPmStrings();
        boolean z10 = false;
        String str3 = amPmStrings[0];
        m.e(str3, "ampm[0]");
        Locale locale2 = Locale.getDefault();
        m.e(locale2, "getDefault()");
        String upperCase = str3.toUpperCase(locale2);
        m.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        String str4 = amPmStrings[1];
        m.e(str4, "ampm[1]");
        Locale locale3 = Locale.getDefault();
        m.e(locale3, "getDefault()");
        String upperCase2 = str4.toUpperCase(locale3);
        m.e(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        String format = simpleDateFormat.format(instance.getTime());
        m.e(format, "dateFormat.format(mCalendar.time)");
        if (DateFormat.is24HourFormat(context) || !q.y(str, ":mm", false, 2, (Object) null)) {
            return format;
        }
        if (instance.get(9) == 0) {
            z10 = true;
        }
        if (z10) {
            str2 = format + ' ' + upperCase;
        } else {
            str2 = format + ' ' + upperCase2;
        }
        return str2;
    }

    public final TimeZone g() {
        return this.f17457d;
    }

    public final int h(int i10, int i11) {
        int i12 = (((i10 - this.f17455b) * 12) + i11) - 1;
        char[] cArr = this.f17456c;
        if (cArr == null) {
            m.x("bsDayCountsArray");
            cArr = null;
        }
        return Character.getNumericValue(cArr[i12]) + 28;
    }
}
