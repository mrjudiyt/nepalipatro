package e1;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* compiled from: SupportSQLiteDatabase */
public interface b extends Closeable {
    f A(String str);

    Cursor G0(e eVar);

    Cursor M(e eVar, CancellationSignal cancellationSignal);

    void O();

    void Q(String str, Object[] objArr);

    Cursor X(String str);

    void a0();

    boolean isOpen();

    void k();

    String m0();

    boolean p0();

    List<Pair<String, String>> r();

    void t(String str);
}
