package z9;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.helpers.e;
import np.com.nepalipatro.helpers.g;
import np.com.nepalipatro.helpers.i;
import np.com.nepalipatro.helpers.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w9.w;

/* compiled from: DataLoaderRashifal.kt */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f17619a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f17620b = Boolean.FALSE;

    /* renamed from: c  reason: collision with root package name */
    private u9.a f17621c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<a> f17622d;

    /* compiled from: DataLoaderRashifal.kt */
    public interface a {
        void a(i.f fVar);
    }

    /* compiled from: DataLoaderRashifal.kt */
    public static final class b implements i.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f17623a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f17624b;

        b(h hVar, i iVar) {
            this.f17623a = hVar;
            this.f17624b = iVar;
        }

        public void a(i.f fVar, String str) {
            if (fVar == i.f.HTTP_SUCCESS && w.f17100a.a(str)) {
                try {
                    Object obj = new JSONObject(str).get("np");
                    m.d(obj, "null cannot be cast to non-null type org.json.JSONArray");
                    JSONArray jSONArray = (JSONArray) obj;
                    u9.a e10 = this.f17623a.e();
                    if (e10 != null) {
                        e10.b(jSONArray);
                    }
                } catch (JSONException e11) {
                    if (g.f16048a.a()) {
                        e11.printStackTrace();
                        this.f17624b.n(i.f.HTTP_OTHERS);
                    }
                } catch (Exception e12) {
                    if (g.f16048a.a()) {
                        e12.printStackTrace();
                        this.f17624b.n(i.f.HTTP_OTHERS);
                    }
                }
            }
        }
    }

    /* compiled from: DataLoaderRashifal.kt */
    public static final class c implements i.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f17625a;

        c(h hVar) {
            this.f17625a = hVar;
        }

        public void a(i.f fVar, Bundle bundle) {
            this.f17625a.i(Boolean.FALSE);
            if (fVar != null) {
                this.f17625a.d(fVar);
            }
        }
    }

    public h(Context context) {
        m.f(context, "context");
        this.f17619a = context;
        this.f17621c = new u9.a(context);
        this.f17622d = new ArrayList<>();
    }

    private final void b(String str) {
        this.f17620b = Boolean.TRUE;
        g.a aVar = g.f16048a;
        aVar.b("Rashifal download url: " + str);
        i iVar = new i(this.f17619a, str, (v7.w) null);
        iVar.e(true);
        iVar.l(new b(this, iVar));
        iVar.m(new c(this));
        iVar.execute(new Void[0]);
    }

    /* access modifiers changed from: private */
    public final void d(i.f fVar) {
        int size = this.f17622d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f17622d.get(i10).a(fVar);
        }
    }

    public final void c(Boolean bool) {
        Boolean bool2 = this.f17620b;
        m.c(bool2);
        if (!bool2.booleanValue()) {
            m.c(bool);
            if (bool.booleanValue()) {
                b(e.f15961a.f0() + "/type/DWMY");
                return;
            }
            StringBuilder sb = new StringBuilder();
            List<String> f10 = f();
            if ((f10 != null ? f10.size() : 0) > 0) {
                for (String append : f10) {
                    sb.append(append);
                }
                g.a aVar = g.f16048a;
                aVar.b("RASHIFALLOADER-->" + sb);
                b(e.f15961a.f0() + "/type/" + sb);
                return;
            }
            this.f17620b = Boolean.FALSE;
        }
    }

    public final u9.a e() {
        return this.f17621c;
    }

    public final List<String> f() {
        ArrayList arrayList = new ArrayList();
        u9.a aVar = this.f17621c;
        Cursor cursor = null;
        SQLiteDatabase v10 = aVar != null ? aVar.v() : null;
        Calendar instance = Calendar.getInstance();
        int i10 = instance.get(1);
        int i11 = instance.get(5);
        StringBuilder sb = new StringBuilder();
        sb.append(i10);
        sb.append('-');
        l.a aVar2 = l.f16129a;
        sb.append(aVar2.t(instance.get(2) + 1));
        sb.append('-');
        sb.append(aVar2.t(i11));
        String sb2 = sb.toString();
        if (v10 != null) {
            cursor = v10.rawQuery("SELECT type,todate from Rashifaldb where todate<?", new String[]{sb2});
        }
        m.c(cursor);
        while (true) {
            if (cursor != null ? cursor.moveToNext() : false) {
                String string = cursor.getString(cursor.getColumnIndex(ShareConstants.MEDIA_TYPE));
                if (!(string == null || string.length() == 0)) {
                    arrayList.add(string);
                }
            } else {
                cursor.close();
                return arrayList;
            }
        }
    }

    public final Boolean g() {
        return this.f17620b;
    }

    public final void h(a aVar) {
        m.f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f17622d.remove(aVar);
    }

    public final void i(Boolean bool) {
        this.f17620b = bool;
    }

    public final void j(a aVar) {
        m.f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f17622d.add(aVar);
    }
}
