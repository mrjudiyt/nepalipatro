package a4;

import a4.m0;
import android.database.sqlite.SQLiteDatabase;
import java.util.Map;
import v3.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k0 implements m0.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m0 f74a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f75b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f76c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a.C0203a f77d;

    public /* synthetic */ k0(m0 m0Var, String str, Map map, a.C0203a aVar) {
        this.f74a = m0Var;
        this.f75b = str;
        this.f76c = map;
        this.f77d = aVar;
    }

    public final Object apply(Object obj) {
        return this.f74a.r1(this.f75b, this.f76c, this.f77d, (SQLiteDatabase) obj);
    }
}
