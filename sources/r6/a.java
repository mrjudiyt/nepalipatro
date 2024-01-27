package r6;

import com.google.gson.JsonSyntaxException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import t6.e;
import t6.j;
import y6.b;
import y6.c;

/* compiled from: DefaultDateTypeAdapter */
final class a extends s<Date> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<? extends Date> f16315a;

    /* renamed from: b  reason: collision with root package name */
    private final List<DateFormat> f16316b;

    a(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.f16316b = arrayList;
        this.f16315a = g(cls);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    private Date e(String str) {
        synchronized (this.f16316b) {
            for (DateFormat parse : this.f16316b) {
                try {
                    Date parse2 = parse.parse(str);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                Date c10 = v6.a.c(str, new ParsePosition(0));
                return c10;
            } catch (ParseException e10) {
                throw new JsonSyntaxException(str, e10);
            }
        }
    }

    private static Class<? extends Date> g(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    /* renamed from: f */
    public Date b(y6.a aVar) {
        if (aVar.I0() == b.NULL) {
            aVar.s0();
            return null;
        }
        Date e10 = e(aVar.w0());
        Class<? extends Date> cls = this.f16315a;
        if (cls == Date.class) {
            return e10;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(e10.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(e10.getTime());
        }
        throw new AssertionError();
    }

    /* renamed from: h */
    public void d(c cVar, Date date) {
        if (date == null) {
            cVar.g0();
            return;
        }
        synchronized (this.f16316b) {
            cVar.M0(this.f16316b.get(0).format(date));
        }
    }

    public String toString() {
        DateFormat dateFormat = this.f16316b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public a(Class<? extends Date> cls, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f16316b = arrayList;
        this.f16315a = g(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (e.e()) {
            arrayList.add(j.c(i10, i11));
        }
    }
}
