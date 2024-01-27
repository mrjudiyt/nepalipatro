package y7;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: HttpDate */
public final class g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final TimeZone f17389a = TimeZone.getTimeZone("GMT");

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<DateFormat> f17390b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f17391c;

    /* renamed from: d  reason: collision with root package name */
    private static final DateFormat[] f17392d;

    /* compiled from: HttpDate */
    static class a extends ThreadLocal<DateFormat> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(g.f17389a);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f17391c = strArr;
        f17392d = new DateFormat[strArr.length];
    }

    public static Date b(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f17390b.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f17391c;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                DateFormat[] dateFormatArr = f17392d;
                DateFormat dateFormat = dateFormatArr[i10];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f17391c[i10], Locale.US);
                    dateFormat.setTimeZone(f17389a);
                    dateFormatArr[i10] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }
}
