package u6;

import com.google.gson.JsonSyntaxException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import r6.f;
import r6.s;
import r6.t;
import y6.b;
import y6.c;

/* compiled from: SqlDateTypeAdapter */
public final class j extends s<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final t f16652b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f16653a = new SimpleDateFormat("MMM d, yyyy");

    /* compiled from: SqlDateTypeAdapter */
    static class a implements t {
        a() {
        }

        public <T> s<T> a(f fVar, x6.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new j();
            }
            return null;
        }
    }

    /* renamed from: e */
    public synchronized Date b(y6.a aVar) {
        if (aVar.I0() == b.NULL) {
            aVar.s0();
            return null;
        }
        try {
            return new Date(this.f16653a.parse(aVar.w0()).getTime());
        } catch (ParseException e10) {
            throw new JsonSyntaxException((Throwable) e10);
        }
    }

    /* renamed from: f */
    public synchronized void d(c cVar, Date date) {
        cVar.M0(date == null ? null : this.f16653a.format(date));
    }
}
