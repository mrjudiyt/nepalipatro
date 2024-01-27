package a4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* compiled from: SchemaManager */
final class t0 extends SQLiteOpenHelper {

    /* renamed from: j  reason: collision with root package name */
    private static final String f116j = ("INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")");

    /* renamed from: k  reason: collision with root package name */
    static int f117k = 5;

    /* renamed from: l  reason: collision with root package name */
    private static final a f118l;

    /* renamed from: m  reason: collision with root package name */
    private static final a f119m;

    /* renamed from: n  reason: collision with root package name */
    private static final a f120n;

    /* renamed from: o  reason: collision with root package name */
    private static final a f121o;

    /* renamed from: p  reason: collision with root package name */
    private static final a f122p;

    /* renamed from: q  reason: collision with root package name */
    private static final List<a> f123q;

    /* renamed from: h  reason: collision with root package name */
    private final int f124h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f125i = false;

    /* compiled from: SchemaManager */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        r0 r0Var = r0.f112a;
        f118l = r0Var;
        o0 o0Var = o0.f103a;
        f119m = o0Var;
        p0 p0Var = p0.f106a;
        f120n = p0Var;
        q0 q0Var = q0.f110a;
        f121o = q0Var;
        s0 s0Var = s0.f114a;
        f122p = s0Var;
        f123q = Arrays.asList(new a[]{r0Var, o0Var, p0Var, q0Var, s0Var});
    }

    t0(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f124h = i10;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void E(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void J(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void W(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void Y(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f116j);
    }

    private void c0(SQLiteDatabase sQLiteDatabase, int i10) {
        w(sQLiteDatabase);
        g0(sQLiteDatabase, 0, i10);
    }

    private void g0(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = f123q;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                f123q.get(i10).a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    private void w(SQLiteDatabase sQLiteDatabase) {
        if (!this.f125i) {
            onConfigure(sQLiteDatabase);
        }
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f125i = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        c0(sQLiteDatabase, this.f124h);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        c0(sQLiteDatabase, i11);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        w(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        w(sQLiteDatabase);
        g0(sQLiteDatabase, i10, i11);
    }
}
