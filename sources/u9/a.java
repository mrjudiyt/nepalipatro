package u9;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.plugins.firebase.analytics.Constants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TimeZone;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.helpers.g;
import np.com.nepalipatro.helpers.l;
import np.com.nepalipatro.models.Amessage;
import np.com.nepalipatro.models.EventModel;
import np.com.nepalipatro.models.ReminderModel;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DbHelper.kt */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0289a f16716c = new C0289a((g) null);

    /* renamed from: d  reason: collision with root package name */
    private static SQLiteDatabase f16717d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f16718e = "Blogs";

    /* renamed from: f  reason: collision with root package name */
    private static final String f16719f = "Forex";

    /* renamed from: g  reason: collision with root package name */
    private static final String f16720g = "ForexDetail";

    /* renamed from: h  reason: collision with root package name */
    private static final String f16721h = "Rashifaldb";

    /* renamed from: i  reason: collision with root package name */
    private static final String f16722i = "Feeds";

    /* renamed from: j  reason: collision with root package name */
    private static final String f16723j = "AmessageDb";

    /* renamed from: k  reason: collision with root package name */
    private static final String f16724k = "CalendarDb";

    /* renamed from: l  reason: collision with root package name */
    private static final String f16725l = "DeleteEventsDB";

    /* renamed from: m  reason: collision with root package name */
    private static final String f16726m = "DeleteRemindersDB";

    /* renamed from: n  reason: collision with root package name */
    private static final String f16727n = "CalendarUserDb";

    /* renamed from: o  reason: collision with root package name */
    private static final String f16728o = "EventsDb";

    /* renamed from: p  reason: collision with root package name */
    private static final String f16729p = "EventsExcDb";

    /* renamed from: q  reason: collision with root package name */
    private static final String f16730q = "PanchangaDb";

    /* renamed from: r  reason: collision with root package name */
    private static final String f16731r = "RemindersDb";

    /* renamed from: s  reason: collision with root package name */
    private static final String f16732s = "cache";

    /* renamed from: a  reason: collision with root package name */
    private Context f16733a;

    /* renamed from: b  reason: collision with root package name */
    private String f16734b;

    /* renamed from: u9.a$a  reason: collision with other inner class name */
    /* compiled from: DbHelper.kt */
    public static final class C0289a {
        private C0289a() {
        }

        public /* synthetic */ C0289a(g gVar) {
            this();
        }
    }

    /* compiled from: DbHelper.kt */
    public static final class b implements Comparator<EventModel> {
        b() {
        }

        /* renamed from: a */
        public int compare(EventModel eventModel, EventModel eventModel2) {
            m.f(eventModel, "obj1");
            m.f(eventModel2, "obj2");
            return String.valueOf(eventModel.getStartDate()).compareTo(String.valueOf(eventModel2.getStartDate()));
        }
    }

    public a(Context context) {
        m.f(context, "context");
        this.f16733a = context;
        this.f16734b = context.getPackageName();
        g.a aVar = np.com.nepalipatro.helpers.g.f16048a;
        aVar.b("PACKAGENAME--" + this.f16734b);
        try {
            if (f16717d == null) {
                f16717d = SQLiteDatabase.openDatabase(context.getDatabasePath(ca.a.f13428a.c()).toString(), (SQLiteDatabase.CursorFactory) null, 0);
            }
        } catch (Exception unused) {
        }
    }

    private final ArrayList<EventModel> L(ArrayList<EventModel> arrayList) {
        Collections.sort(arrayList, new b());
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0032, code lost:
        if (r3 == null) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> A() {
        /*
            r54 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "select * from "
            r1.append(r2)
            java.lang.String r2 = f16728o
            r1.append(r2)
            java.lang.String r2 = " where updated_at>=?"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r54
            android.content.Context r3 = r2.f16733a
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0034
            np.com.nepalipatro.helpers.k$a r5 = np.com.nepalipatro.helpers.k.f16077a
            kotlin.jvm.internal.m.c(r3)
            java.lang.String r6 = r5.n()
            java.lang.String r3 = r5.w(r3, r6, r4)
            if (r3 != 0) goto L_0x0035
        L_0x0034:
            r3 = r4
        L_0x0035:
            int r5 = r3.length()
            r6 = 1
            r7 = 0
            if (r5 <= 0) goto L_0x003f
            r5 = 1
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            if (r5 == 0) goto L_0x035a
            android.database.sqlite.SQLiteDatabase r5 = f16717d
            if (r5 == 0) goto L_0x004f
            java.lang.String[] r6 = new java.lang.String[r6]
            r6[r7] = r3
            android.database.Cursor r1 = r5.rawQuery(r1, r6)
            goto L_0x0050
        L_0x004f:
            r1 = 0
        L_0x0050:
            if (r1 == 0) goto L_0x0355
            boolean r3 = r1.moveToFirst()
            if (r3 == 0) goto L_0x0355
        L_0x0058:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r5 = "id"
            int r6 = r1.getColumnIndexOrThrow(r5)
            java.lang.String r6 = r1.getString(r6)
            if (r6 != 0) goto L_0x006a
            r6 = r4
        L_0x006a:
            java.lang.String r7 = "parent_event_id"
            int r8 = r1.getColumnIndexOrThrow(r7)
            java.lang.String r8 = r1.getString(r8)
            if (r8 != 0) goto L_0x0077
            r8 = r4
        L_0x0077:
            java.lang.String r9 = "title"
            int r10 = r1.getColumnIndexOrThrow(r9)
            java.lang.String r10 = r1.getString(r10)
            if (r10 != 0) goto L_0x0084
            r10 = r4
        L_0x0084:
            np.com.nepalipatro.helpers.l$a r11 = np.com.nepalipatro.helpers.l.f16129a
            java.lang.String r12 = "description"
            int r13 = r1.getColumnIndexOrThrow(r12)
            java.lang.String r13 = r1.getString(r13)
            if (r13 != 0) goto L_0x0093
            r13 = r4
        L_0x0093:
            java.lang.String r14 = "9E4mk3Woz7tN8Ic9LRZYG5ipy7971B62egK199a0d+c="
            java.lang.String r13 = r11.a(r14, r13)
            java.lang.String r15 = "start_date"
            int r2 = r1.getColumnIndexOrThrow(r15)
            java.lang.String r2 = r1.getString(r2)
            if (r2 != 0) goto L_0x00a9
            r2 = r4
            r16 = r2
            goto L_0x00ab
        L_0x00a9:
            r16 = r4
        L_0x00ab:
            java.lang.String r4 = "end_date"
            r17 = r0
            int r0 = r1.getColumnIndexOrThrow(r4)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x00bc
            r18 = r16
            goto L_0x00be
        L_0x00bc:
            r18 = r0
        L_0x00be:
            java.lang.String r0 = "is_full_day_event"
            r19 = r4
            int r4 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r4 = r1.getString(r4)
            r20 = r0
            if (r4 != 0) goto L_0x00d0
            r4 = r16
        L_0x00d0:
            java.lang.String r0 = "recurring_end_date"
            r21 = r4
            int r4 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r4 = r1.getString(r4)
            r22 = r0
            if (r4 != 0) goto L_0x00e2
            r4 = r16
        L_0x00e2:
            java.lang.String r0 = "is_recurring"
            r23 = r4
            int r4 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r4 = r1.getString(r4)
            r24 = r0
            if (r4 != 0) goto L_0x00f4
            r4 = r16
        L_0x00f4:
            java.lang.String r0 = "created_by"
            r25 = r4
            int r4 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r4 = r1.getString(r4)
            r26 = r0
            if (r4 != 0) goto L_0x0106
            r4 = r16
        L_0x0106:
            java.lang.String r0 = "has_reminder"
            r27 = r4
            int r4 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r4 = r1.getString(r4)
            r28 = r0
            if (r4 != 0) goto L_0x0118
            r4 = r16
        L_0x0118:
            java.lang.String r0 = "location"
            r29 = r4
            int r4 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r4 = r1.getString(r4)
            r30 = r0
            if (r4 != 0) goto L_0x012a
            r4 = r16
        L_0x012a:
            java.lang.String r0 = "guests"
            r31 = r4
            int r4 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r4 = r1.getString(r4)
            r32 = r0
            if (r4 != 0) goto L_0x013c
            r4 = r16
        L_0x013c:
            java.lang.String r0 = "rsvp"
            r33 = r4
            int r4 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r4 = r1.getString(r4)
            r34 = r0
            if (r4 != 0) goto L_0x014e
            r4 = r16
        L_0x014e:
            java.lang.String r0 = "note"
            r35 = r4
            int r4 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r4 = r1.getString(r4)
            r36 = r0
            if (r4 != 0) goto L_0x0160
            r4 = r16
        L_0x0160:
            java.lang.String r0 = "event_permission"
            r37 = r4
            int r4 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r4 = r1.getString(r4)
            r38 = r0
            if (r4 != 0) goto L_0x0172
            r4 = r16
        L_0x0172:
            java.lang.String r0 = "visibility"
            r39 = r4
            int r4 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r4 = r1.getString(r4)
            r40 = r0
            if (r4 != 0) goto L_0x0184
            r4 = r16
        L_0x0184:
            java.lang.String r0 = "privacy"
            r41 = r4
            int r4 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r4 = r1.getString(r4)
            r42 = r0
            if (r4 != 0) goto L_0x0196
            r4 = r16
        L_0x0196:
            java.lang.String r0 = "status"
            int r0 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x01a5
            r43 = r16
            goto L_0x01a7
        L_0x01a5:
            r43 = r0
        L_0x01a7:
            java.lang.String r0 = "duration"
            int r0 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x01b6
            r44 = r16
            goto L_0x01b8
        L_0x01b6:
            r44 = r0
        L_0x01b8:
            java.lang.String r0 = "gh"
            int r0 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x01c7
            r45 = r16
            goto L_0x01c9
        L_0x01c7:
            r45 = r0
        L_0x01c9:
            java.lang.String r0 = "important_event"
            int r0 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x01d8
            r46 = r16
            goto L_0x01da
        L_0x01d8:
            r46 = r0
        L_0x01da:
            java.lang.String r0 = "rrule"
            int r0 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x01e8
            r0 = r16
        L_0x01e8:
            java.lang.String r0 = r11.a(r14, r0)
            java.lang.String r11 = "deleted_at"
            int r11 = r1.getColumnIndexOrThrow(r11)
            java.lang.String r11 = r1.getString(r11)
            if (r11 != 0) goto L_0x01fa
            r11 = r16
        L_0x01fa:
            java.lang.String r14 = "created_at"
            int r14 = r1.getColumnIndexOrThrow(r14)
            java.lang.String r14 = r1.getString(r14)
            if (r14 != 0) goto L_0x0209
            r47 = r16
            goto L_0x020b
        L_0x0209:
            r47 = r14
        L_0x020b:
            java.lang.String r14 = "updated_at"
            int r14 = r1.getColumnIndexOrThrow(r14)
            java.lang.String r14 = r1.getString(r14)
            if (r14 != 0) goto L_0x021a
            r48 = r16
            goto L_0x021c
        L_0x021a:
            r48 = r14
        L_0x021c:
            java.lang.String r14 = "calendar_id"
            int r14 = r1.getColumnIndexOrThrow(r14)
            java.lang.String r14 = r1.getString(r14)
            if (r14 != 0) goto L_0x022b
            r49 = r16
            goto L_0x022d
        L_0x022b:
            r49 = r14
        L_0x022d:
            java.lang.String r14 = "based_on"
            int r14 = r1.getColumnIndexOrThrow(r14)
            java.lang.String r14 = r1.getString(r14)
            if (r14 != 0) goto L_0x023c
            r50 = r16
            goto L_0x023e
        L_0x023c:
            r50 = r14
        L_0x023e:
            java.lang.String r14 = "rsvp_stats"
            int r14 = r1.getColumnIndexOrThrow(r14)
            java.lang.String r14 = r1.getString(r14)
            if (r14 != 0) goto L_0x024d
            r51 = r16
            goto L_0x024f
        L_0x024d:
            r51 = r14
        L_0x024f:
            java.lang.String r14 = "formatted_rrule"
            int r14 = r1.getColumnIndexOrThrow(r14)
            java.lang.String r14 = r1.getString(r14)
            if (r14 != 0) goto L_0x025e
            r52 = r16
            goto L_0x0260
        L_0x025e:
            r52 = r14
        L_0x0260:
            java.lang.String r14 = "rsstart"
            int r14 = r1.getColumnIndexOrThrow(r14)
            java.lang.String r14 = r1.getString(r14)
            if (r14 != 0) goto L_0x026f
            r53 = r16
            goto L_0x0271
        L_0x026f:
            r53 = r14
        L_0x0271:
            java.lang.String r14 = "origid"
            int r14 = r1.getColumnIndexOrThrow(r14)
            java.lang.String r14 = r1.getString(r14)
            if (r14 != 0) goto L_0x027f
            r14 = r16
        L_0x027f:
            r3.put(r5, r6)
            r3.put(r7, r8)
            r3.put(r9, r10)
            r3.put(r12, r13)
            r3.put(r15, r2)
            r2 = r18
            r5 = r19
            r3.put(r5, r2)
            r5 = r20
            r2 = r21
            r3.put(r5, r2)
            r5 = r22
            r2 = r23
            r3.put(r5, r2)
            r5 = r24
            r2 = r25
            r3.put(r5, r2)
            r5 = r26
            r2 = r27
            r3.put(r5, r2)
            r5 = r28
            r2 = r29
            r3.put(r5, r2)
            r5 = r30
            r2 = r31
            r3.put(r5, r2)
            r5 = r32
            r2 = r33
            r3.put(r5, r2)
            r5 = r34
            r2 = r35
            r3.put(r5, r2)
            r5 = r36
            r2 = r37
            r3.put(r5, r2)
            r5 = r38
            r2 = r39
            r3.put(r5, r2)
            r5 = r40
            r2 = r41
            r3.put(r5, r2)
            r2 = r42
            r3.put(r2, r4)
            java.lang.String r2 = "status"
            r4 = r43
            r3.put(r2, r4)
            java.lang.String r2 = "duration"
            r4 = r44
            r3.put(r2, r4)
            java.lang.String r2 = "gh"
            r4 = r45
            r3.put(r2, r4)
            java.lang.String r2 = "important_event"
            r4 = r46
            r3.put(r2, r4)
            java.lang.String r2 = "rrule"
            r3.put(r2, r0)
            java.lang.String r0 = "deleted_at"
            r3.put(r0, r11)
            java.lang.String r0 = "created_at"
            r2 = r47
            r3.put(r0, r2)
            java.lang.String r0 = "updated_at"
            r2 = r48
            r3.put(r0, r2)
            java.lang.String r0 = "calendar_id"
            r2 = r49
            r3.put(r0, r2)
            java.lang.String r0 = "based_on"
            r2 = r50
            r3.put(r0, r2)
            java.lang.String r0 = "rsvp_stats"
            r2 = r51
            r3.put(r0, r2)
            java.lang.String r0 = "formatted_rrule"
            r2 = r52
            r3.put(r0, r2)
            java.lang.String r0 = "rsstart"
            r2 = r53
            r3.put(r0, r2)
            java.lang.String r0 = "origid"
            r3.put(r0, r14)
            r0 = r17
            r0.add(r3)
            boolean r2 = r1.moveToNext()
            if (r2 != 0) goto L_0x034f
            goto L_0x0355
        L_0x034f:
            r2 = r54
            r4 = r16
            goto L_0x0058
        L_0x0355:
            if (r1 == 0) goto L_0x035a
            r1.close()
        L_0x035a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.a.A():java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0032, code lost:
        if (r3 == null) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> B() {
        /*
            r20 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "select * from "
            r1.append(r2)
            java.lang.String r2 = f16731r
            r1.append(r2)
            java.lang.String r2 = " where updated_at>=?"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r20
            android.content.Context r3 = r2.f16733a
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0034
            np.com.nepalipatro.helpers.k$a r5 = np.com.nepalipatro.helpers.k.f16077a
            kotlin.jvm.internal.m.c(r3)
            java.lang.String r6 = r5.n()
            java.lang.String r3 = r5.w(r3, r6, r4)
            if (r3 != 0) goto L_0x0035
        L_0x0034:
            r3 = r4
        L_0x0035:
            int r5 = r3.length()
            r6 = 1
            r7 = 0
            if (r5 <= 0) goto L_0x003f
            r5 = 1
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            if (r5 == 0) goto L_0x0106
            android.database.sqlite.SQLiteDatabase r5 = f16717d
            if (r5 == 0) goto L_0x004f
            java.lang.String[] r6 = new java.lang.String[r6]
            r6[r7] = r3
            android.database.Cursor r1 = r5.rawQuery(r1, r6)
            goto L_0x0050
        L_0x004f:
            r1 = 0
        L_0x0050:
            if (r1 == 0) goto L_0x0101
            boolean r3 = r1.moveToFirst()
            if (r3 == 0) goto L_0x0101
        L_0x0058:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r5 = "id"
            int r6 = r1.getColumnIndexOrThrow(r5)
            java.lang.String r6 = r1.getString(r6)
            if (r6 != 0) goto L_0x006a
            r6 = r4
        L_0x006a:
            java.lang.String r7 = "event_id"
            int r8 = r1.getColumnIndexOrThrow(r7)
            java.lang.String r8 = r1.getString(r8)
            if (r8 != 0) goto L_0x0077
            r8 = r4
        L_0x0077:
            java.lang.String r9 = "days"
            int r10 = r1.getColumnIndexOrThrow(r9)
            java.lang.String r10 = r1.getString(r10)
            if (r10 != 0) goto L_0x0084
            r10 = r4
        L_0x0084:
            java.lang.String r11 = "time"
            int r12 = r1.getColumnIndexOrThrow(r11)
            java.lang.String r12 = r1.getString(r12)
            if (r12 != 0) goto L_0x0091
            r12 = r4
        L_0x0091:
            java.lang.String r13 = "note"
            int r14 = r1.getColumnIndexOrThrow(r13)
            java.lang.String r14 = r1.getString(r14)
            if (r14 != 0) goto L_0x009e
            r14 = r4
        L_0x009e:
            java.lang.String r15 = "notification_type"
            int r2 = r1.getColumnIndexOrThrow(r15)
            java.lang.String r2 = r1.getString(r2)
            if (r2 != 0) goto L_0x00ae
            r2 = r4
            r16 = r2
            goto L_0x00b0
        L_0x00ae:
            r16 = r4
        L_0x00b0:
            java.lang.String r4 = "updated_at"
            r17 = r0
            int r0 = r1.getColumnIndexOrThrow(r4)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x00c1
            r18 = r16
            goto L_0x00c3
        L_0x00c1:
            r18 = r0
        L_0x00c3:
            java.lang.String r0 = "created_at"
            r19 = r4
            int r4 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r4 = r1.getString(r4)
            if (r4 != 0) goto L_0x00d3
            r4 = r16
        L_0x00d3:
            r3.put(r5, r6)
            r3.put(r7, r8)
            r3.put(r9, r10)
            r3.put(r11, r12)
            r3.put(r13, r14)
            r3.put(r15, r2)
            r2 = r18
            r5 = r19
            r3.put(r5, r2)
            r3.put(r0, r4)
            r0 = r17
            r0.add(r3)
            boolean r2 = r1.moveToNext()
            if (r2 != 0) goto L_0x00fb
            goto L_0x0101
        L_0x00fb:
            r2 = r20
            r4 = r16
            goto L_0x0058
        L_0x0101:
            if (r1 == 0) goto L_0x0106
            r1.close()
        L_0x0106:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.a.B():java.util.ArrayList");
    }

    public final EventModel C(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = str;
        String str8 = str2;
        m.f(str7, "id");
        m.f(str8, Constants.USER_ID);
        try {
            SQLiteDatabase sQLiteDatabase = f16717d;
            Cursor rawQuery = sQLiteDatabase != null ? sQLiteDatabase.rawQuery("SELECT * FROM EventsDb WHERE created_by=? AND id=? LIMIT 1", new String[]{str8, str7}) : null;
            m.c(rawQuery);
            if (rawQuery.moveToFirst()) {
                String string = rawQuery.getString(rawQuery.getColumnIndexOrThrow("id"));
                String str9 = string == null ? "" : string;
                String string2 = rawQuery.getString(rawQuery.getColumnIndexOrThrow(ShareConstants.WEB_DIALOG_PARAM_TITLE));
                if (string2 == null) {
                    str3 = "";
                } else {
                    str3 = string2;
                }
                String string3 = rawQuery.getString(rawQuery.getColumnIndexOrThrow(FirebaseAnalytics.Param.START_DATE));
                if (string3 == null) {
                    str4 = "";
                } else {
                    str4 = string3;
                }
                l.a aVar = l.f16129a;
                String string4 = rawQuery.getString(rawQuery.getColumnIndexOrThrow("description"));
                if (string4 == null) {
                    string4 = "";
                }
                String a10 = aVar.a("9E4mk3Woz7tN8Ic9LRZYG5ipy7971B62egK199a0d+c=", string4);
                String string5 = rawQuery.getString(rawQuery.getColumnIndexOrThrow("calendar_id"));
                if (string5 == null) {
                    str5 = "";
                } else {
                    str5 = string5;
                }
                String string6 = rawQuery.getString(rawQuery.getColumnIndexOrThrow("rrule"));
                if (string6 == null) {
                    string6 = "";
                }
                String a11 = aVar.a("9E4mk3Woz7tN8Ic9LRZYG5ipy7971B62egK199a0d+c=", string6);
                String string7 = rawQuery.getString(rawQuery.getColumnIndexOrThrow("recurring_end_date"));
                if (string7 == null) {
                    str6 = "";
                } else {
                    str6 = string7;
                }
                int i10 = rawQuery.getInt(rawQuery.getColumnIndexOrThrow("important_event"));
                String string8 = rawQuery.getString(rawQuery.getColumnIndexOrThrow("based_on"));
                rawQuery.getInt(rawQuery.getColumnIndexOrThrow("has_reminder"));
                np.com.nepalipatro.helpers.b bVar = np.com.nepalipatro.helpers.b.f15915a;
                bVar.g(str4, bVar.e(), (TimeZone) null);
                EventModel eventModel = new EventModel(str9, str3, str4, a10, str5, Integer.valueOf(i10), a11, str6, (EventModel.EventType) null, (String) null, 768, (kotlin.jvm.internal.g) null);
                rawQuery.close();
                return eventModel;
            }
        } catch (Exception e10) {
            if (np.com.nepalipatro.helpers.g.f16048a.a()) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> D(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "id"
            kotlin.jvm.internal.m.f(r0, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.database.sqlite.SQLiteDatabase r3 = f16717d
            if (r3 == 0) goto L_0x001d
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]
            r5 = 0
            r4[r5] = r0
            java.lang.String r0 = "select * from RemindersDb where event_id=?"
            android.database.Cursor r0 = r3.rawQuery(r0, r4)
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 == 0) goto L_0x0095
            boolean r3 = r0.moveToFirst()
            if (r3 == 0) goto L_0x0095
        L_0x0026:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            int r4 = r0.getColumnIndexOrThrow(r1)
            java.lang.String r4 = r0.getString(r4)
            java.lang.String r5 = ""
            if (r4 != 0) goto L_0x0038
            r4 = r5
        L_0x0038:
            java.lang.String r6 = "event_id"
            int r7 = r0.getColumnIndexOrThrow(r6)
            java.lang.String r7 = r0.getString(r7)
            if (r7 != 0) goto L_0x0045
            r7 = r5
        L_0x0045:
            java.lang.String r8 = "days"
            int r9 = r0.getColumnIndexOrThrow(r8)
            java.lang.String r9 = r0.getString(r9)
            if (r9 != 0) goto L_0x0052
            r9 = r5
        L_0x0052:
            java.lang.String r10 = "time"
            int r11 = r0.getColumnIndexOrThrow(r10)
            java.lang.String r11 = r0.getString(r11)
            if (r11 != 0) goto L_0x005f
            r11 = r5
        L_0x005f:
            java.lang.String r12 = "note"
            int r13 = r0.getColumnIndexOrThrow(r12)
            java.lang.String r13 = r0.getString(r13)
            if (r13 != 0) goto L_0x006c
            r13 = r5
        L_0x006c:
            java.lang.String r14 = "notification_type"
            int r15 = r0.getColumnIndexOrThrow(r14)
            java.lang.String r15 = r0.getString(r15)
            if (r15 != 0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r5 = r15
        L_0x007a:
            r3.put(r1, r4)
            r3.put(r6, r7)
            r3.put(r8, r9)
            r3.put(r10, r11)
            r3.put(r12, r13)
            r3.put(r14, r5)
            r2.add(r3)
            boolean r3 = r0.moveToNext()
            if (r3 != 0) goto L_0x0026
        L_0x0095:
            if (r0 == 0) goto L_0x009a
            r0.close()
        L_0x009a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.a.D(java.lang.String):java.util.ArrayList");
    }

    public final void E(Amessage amessage) {
        m.f(amessage, "amessageItem");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", amessage.getId());
            contentValues.put("message_np", amessage.getMessage_np());
            contentValues.put("message_en", amessage.getMessage_en());
            contentValues.put("linktype", amessage.getLinktype());
            contentValues.put("link", amessage.getLink());
            contentValues.put("stdate", amessage.getStdate());
            contentValues.put("expiry", amessage.getExpiry());
            contentValues.put("aflag", amessage.getAflag());
            contentValues.put("pin", amessage.getPin());
            contentValues.put("createdAt", amessage.getCreatedt());
            contentValues.put("enable", amessage.getEnable());
            contentValues.put("options", amessage.getOptions());
            contentValues.put("dorder", amessage.getDorder());
            contentValues.put(AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, amessage.getCancelled());
            SQLiteDatabase sQLiteDatabase = f16717d;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.insert(f16723j, (String) null, contentValues);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void F(JSONArray jSONArray, boolean z10) {
        String str;
        String str2;
        String str3;
        JSONArray jSONArray2 = jSONArray;
        String str4 = "display";
        String str5 = "priority";
        String str6 = "name";
        m.f(jSONArray2, "calendars");
        if (jSONArray.length() > 0) {
            int length = jSONArray.length();
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object obj = jSONArray2.get(i10);
                    m.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject = (JSONObject) obj;
                    ContentValues contentValues = new ContentValues();
                    String string = jSONObject.getString("calendar_id");
                    contentValues.put(str6, jSONObject.getString(str6).toString());
                    if (z10) {
                        str2 = str6;
                        try {
                            contentValues.put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, 2);
                        } catch (Exception unused) {
                            str3 = str4;
                            str = str5;
                            i10++;
                            jSONArray2 = jSONArray;
                            str4 = str3;
                            str6 = str2;
                            str5 = str;
                        }
                    } else {
                        str2 = str6;
                        contentValues.put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, Integer.valueOf(jSONObject.getInt(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS)));
                    }
                    String string2 = jSONObject.getString("calendar_id");
                    String str7 = "";
                    if (string2 == null) {
                        string2 = str7;
                    }
                    contentValues.put("calendar_id", string2);
                    contentValues.put("is_modifiable", Integer.valueOf(jSONObject.getInt("is_modifiable")));
                    String string3 = jSONObject.getString("created_by");
                    if (string3 == null) {
                        string3 = str7;
                    }
                    contentValues.put("created_by", string3);
                    contentValues.put("is_default", Integer.valueOf(jSONObject.getInt("is_default")));
                    String string4 = jSONObject.getString("created_at");
                    if (string4 == null) {
                        string4 = str7;
                    }
                    contentValues.put("created_at", string4);
                    String string5 = jSONObject.getString("updated_at");
                    if (string5 != null) {
                        str7 = string5;
                    }
                    contentValues.put("updated_at", str7);
                    contentValues.put("color", jSONObject.getString("color"));
                    contentValues.put(str5, Integer.valueOf(jSONObject.getInt(str5)));
                    contentValues.put(str4, Integer.valueOf(jSONObject.getInt(str4)));
                    m.e(string, "calendarID");
                    Cursor l10 = l(string);
                    if (l10.getCount() > 0) {
                        SQLiteDatabase sQLiteDatabase = f16717d;
                        if (sQLiteDatabase != null) {
                            String str8 = f16724k;
                            str3 = str4;
                            str = str5;
                            try {
                                String[] strArr = new String[1];
                                try {
                                    strArr[0] = string;
                                    sQLiteDatabase.update(str8, contentValues, "calendar_id=?", strArr);
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                                i10++;
                                jSONArray2 = jSONArray;
                                str4 = str3;
                                str6 = str2;
                                str5 = str;
                            }
                        } else {
                            str3 = str4;
                            str = str5;
                        }
                    } else {
                        str3 = str4;
                        str = str5;
                        SQLiteDatabase sQLiteDatabase2 = f16717d;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.insert(f16724k, (String) null, contentValues);
                        }
                    }
                    l10.close();
                } catch (Exception unused4) {
                    str3 = str4;
                    str = str5;
                    str2 = str6;
                    i10++;
                    jSONArray2 = jSONArray;
                    str4 = str3;
                    str6 = str2;
                    str5 = str;
                }
                i10++;
                jSONArray2 = jSONArray;
                str4 = str3;
                str6 = str2;
                str5 = str;
            }
        }
    }

    public final void G(JSONArray jSONArray) {
        String str;
        String str2;
        String str3;
        int i10;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        JSONArray jSONArray2 = jSONArray;
        String str13 = AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS;
        String str14 = "description";
        String str15 = ShareConstants.WEB_DIALOG_PARAM_PRIVACY;
        String str16 = ShareConstants.WEB_DIALOG_PARAM_TITLE;
        String str17 = ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY;
        String str18 = "parent_event_id";
        String str19 = "event_permission";
        String str20 = "id";
        String str21 = "note";
        m.f(jSONArray2, "events");
        if (jSONArray.length() > 0) {
            int length = jSONArray.length();
            String str22 = "rsvp";
            int i11 = 0;
            while (i11 < length) {
                int i12 = length;
                try {
                    Object obj = jSONArray2.get(i11);
                    m.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject = (JSONObject) obj;
                    ContentValues contentValues = new ContentValues();
                    i10 = i11;
                    try {
                        String string = jSONObject.getString(str20);
                        contentValues.put(str20, jSONObject.getString(str20).toString());
                        contentValues.put(str18, jSONObject.getString(str18).toString());
                        contentValues.put(str16, jSONObject.getString(str16));
                        String string2 = jSONObject.getString(str14);
                        if (string2 == null) {
                            string2 = "";
                        }
                        contentValues.put(str14, string2);
                        contentValues.put(FirebaseAnalytics.Param.START_DATE, jSONObject.getString(FirebaseAnalytics.Param.START_DATE));
                        String string3 = jSONObject.getString(FirebaseAnalytics.Param.END_DATE);
                        if (string3 == null) {
                            string3 = "";
                        }
                        contentValues.put(FirebaseAnalytics.Param.END_DATE, string3);
                        String string4 = jSONObject.getString("is_full_day_event");
                        if (string4 == null) {
                            string4 = "";
                        }
                        contentValues.put("is_full_day_event", string4);
                        String string5 = jSONObject.getString("recurring_end_date");
                        if (string5 == null) {
                            string5 = "";
                        }
                        contentValues.put("recurring_end_date", string5);
                        String string6 = jSONObject.getString("is_recurring");
                        if (string6 == null) {
                            string6 = "";
                        }
                        contentValues.put("is_recurring", string6);
                        String string7 = jSONObject.getString("created_by");
                        if (string7 == null) {
                            string7 = "";
                        }
                        contentValues.put("created_by", string7);
                        String string8 = jSONObject.getString("has_reminder");
                        if (string8 == null) {
                            string8 = "";
                        }
                        contentValues.put("has_reminder", string8);
                        String string9 = jSONObject.getString(FirebaseAnalytics.Param.LOCATION);
                        if (string9 == null) {
                            string9 = "";
                        }
                        contentValues.put(FirebaseAnalytics.Param.LOCATION, string9);
                        String string10 = jSONObject.getString("guests");
                        if (string10 == null) {
                            string10 = "";
                        }
                        contentValues.put("guests", string10);
                        str5 = str22;
                        try {
                            String string11 = jSONObject.getString(str5);
                            str = str14;
                            if (string11 == null) {
                                str6 = "";
                            } else {
                                str6 = string11;
                            }
                            try {
                                contentValues.put(str5, str6);
                                String str23 = str21;
                                try {
                                    String string12 = jSONObject.getString(str23);
                                    str4 = str16;
                                    if (string12 == null) {
                                        str7 = "";
                                    } else {
                                        str7 = string12;
                                    }
                                    try {
                                        contentValues.put(str23, str7);
                                        String str24 = str19;
                                        try {
                                            String string13 = jSONObject.getString(str24);
                                            str21 = str23;
                                            if (string13 == null) {
                                                str8 = "";
                                            } else {
                                                str8 = string13;
                                            }
                                            try {
                                                contentValues.put(str24, str8);
                                                str9 = str17;
                                            } catch (Exception unused) {
                                                str19 = str24;
                                                str3 = str18;
                                                str2 = str20;
                                                str16 = str4;
                                                length = i12;
                                                str18 = str3;
                                                str20 = str2;
                                                str14 = str;
                                                str22 = str5;
                                                i11 = i10 + 1;
                                                jSONArray2 = jSONArray;
                                            }
                                            try {
                                                String string14 = jSONObject.getString(str9);
                                                str19 = str24;
                                                if (string14 == null) {
                                                    str10 = "";
                                                } else {
                                                    str10 = string14;
                                                }
                                                try {
                                                    contentValues.put(str9, str10);
                                                    String str25 = str15;
                                                    try {
                                                        String string15 = jSONObject.getString(str25);
                                                        str17 = str9;
                                                        if (string15 == null) {
                                                            str11 = "";
                                                        } else {
                                                            str11 = string15;
                                                        }
                                                        try {
                                                            contentValues.put(str25, str11);
                                                            String str26 = str13;
                                                            try {
                                                                String string16 = jSONObject.getString(str26);
                                                                str15 = str25;
                                                                if (string16 == null) {
                                                                    str12 = "";
                                                                } else {
                                                                    str12 = string16;
                                                                }
                                                                try {
                                                                    contentValues.put(str26, str12);
                                                                    str13 = str26;
                                                                    try {
                                                                        String string17 = jSONObject.getString("duration");
                                                                        if (string17 == null) {
                                                                            string17 = "";
                                                                        }
                                                                        contentValues.put("duration", string17);
                                                                        String string18 = jSONObject.getString("gh");
                                                                        if (string18 == null) {
                                                                            string18 = "";
                                                                        }
                                                                        contentValues.put("gh", string18);
                                                                        String string19 = jSONObject.getString("important_event");
                                                                        if (string19 == null) {
                                                                            string19 = "";
                                                                        }
                                                                        contentValues.put("important_event", string19);
                                                                        String string20 = jSONObject.getString("rrule");
                                                                        if (string20 == null) {
                                                                            string20 = "";
                                                                        }
                                                                        contentValues.put("rrule", string20);
                                                                        String string21 = jSONObject.getString("deleted_at");
                                                                        if (string21 == null) {
                                                                            string21 = "";
                                                                        }
                                                                        contentValues.put("deleted_at", string21);
                                                                        String string22 = jSONObject.getString("created_at");
                                                                        if (string22 == null) {
                                                                            string22 = "";
                                                                        }
                                                                        contentValues.put("created_at", string22);
                                                                        String string23 = jSONObject.getString("updated_at");
                                                                        if (string23 == null) {
                                                                            string23 = "";
                                                                        }
                                                                        contentValues.put("updated_at", string23);
                                                                        String string24 = jSONObject.getString("calendar_id");
                                                                        if (string24 == null) {
                                                                            string24 = "";
                                                                        }
                                                                        contentValues.put("calendar_id", string24);
                                                                        String string25 = jSONObject.getString("based_on");
                                                                        if (string25 == null) {
                                                                            string25 = "";
                                                                        }
                                                                        contentValues.put("based_on", string25);
                                                                        String string26 = jSONObject.getString("rsvp_stats");
                                                                        if (string26 == null) {
                                                                            string26 = "";
                                                                        }
                                                                        contentValues.put("rsvp_stats", string26);
                                                                        String string27 = jSONObject.getString("formatted_rrule");
                                                                        if (string27 == null) {
                                                                            string27 = "";
                                                                        }
                                                                        contentValues.put("formatted_rrule", string27);
                                                                        String string28 = jSONObject.getString("rsstart");
                                                                        if (string28 == null) {
                                                                            string28 = "";
                                                                        }
                                                                        contentValues.put("rsstart", string28);
                                                                        String string29 = jSONObject.getString("origid");
                                                                        if (string29 == null) {
                                                                            string29 = "";
                                                                        }
                                                                        contentValues.put("origid", string29);
                                                                        String str27 = string;
                                                                        m.e(str27, "eventId");
                                                                        if (n(str27) != null) {
                                                                            SQLiteDatabase sQLiteDatabase = f16717d;
                                                                            if (sQLiteDatabase != null) {
                                                                                str3 = str18;
                                                                                str2 = str20;
                                                                                try {
                                                                                    sQLiteDatabase.update(f16724k, contentValues, "id=?", new String[]{str27});
                                                                                } catch (Exception unused2) {
                                                                                }
                                                                            }
                                                                            str3 = str18;
                                                                            str2 = str20;
                                                                        } else {
                                                                            str3 = str18;
                                                                            str2 = str20;
                                                                            SQLiteDatabase sQLiteDatabase2 = f16717d;
                                                                            if (sQLiteDatabase2 != null) {
                                                                                sQLiteDatabase2.insert(f16724k, (String) null, contentValues);
                                                                            }
                                                                        }
                                                                    } catch (Exception unused3) {
                                                                    }
                                                                } catch (Exception unused4) {
                                                                    str13 = str26;
                                                                }
                                                            } catch (Exception unused5) {
                                                                str13 = str26;
                                                                str15 = str25;
                                                                str3 = str18;
                                                                str2 = str20;
                                                                str16 = str4;
                                                                length = i12;
                                                                str18 = str3;
                                                                str20 = str2;
                                                                str14 = str;
                                                                str22 = str5;
                                                                i11 = i10 + 1;
                                                                jSONArray2 = jSONArray;
                                                            }
                                                        } catch (Exception unused6) {
                                                            str15 = str25;
                                                            str3 = str18;
                                                            str2 = str20;
                                                            str16 = str4;
                                                            length = i12;
                                                            str18 = str3;
                                                            str20 = str2;
                                                            str14 = str;
                                                            str22 = str5;
                                                            i11 = i10 + 1;
                                                            jSONArray2 = jSONArray;
                                                        }
                                                    } catch (Exception unused7) {
                                                        str17 = str9;
                                                        str15 = str25;
                                                        str3 = str18;
                                                        str2 = str20;
                                                        str16 = str4;
                                                        length = i12;
                                                        str18 = str3;
                                                        str20 = str2;
                                                        str14 = str;
                                                        str22 = str5;
                                                        i11 = i10 + 1;
                                                        jSONArray2 = jSONArray;
                                                    }
                                                } catch (Exception unused8) {
                                                    str17 = str9;
                                                }
                                            } catch (Exception unused9) {
                                                str17 = str9;
                                                str19 = str24;
                                                str3 = str18;
                                                str2 = str20;
                                                str16 = str4;
                                                length = i12;
                                                str18 = str3;
                                                str20 = str2;
                                                str14 = str;
                                                str22 = str5;
                                                i11 = i10 + 1;
                                                jSONArray2 = jSONArray;
                                            }
                                        } catch (Exception unused10) {
                                            str21 = str23;
                                            str19 = str24;
                                            str3 = str18;
                                            str2 = str20;
                                            str16 = str4;
                                            length = i12;
                                            str18 = str3;
                                            str20 = str2;
                                            str14 = str;
                                            str22 = str5;
                                            i11 = i10 + 1;
                                            jSONArray2 = jSONArray;
                                        }
                                    } catch (Exception unused11) {
                                        str21 = str23;
                                    }
                                } catch (Exception unused12) {
                                    str21 = str23;
                                    str4 = str16;
                                    str3 = str18;
                                    str2 = str20;
                                    str16 = str4;
                                    length = i12;
                                    str18 = str3;
                                    str20 = str2;
                                    str14 = str;
                                    str22 = str5;
                                    i11 = i10 + 1;
                                    jSONArray2 = jSONArray;
                                }
                            } catch (Exception unused13) {
                                str4 = str16;
                                str3 = str18;
                                str2 = str20;
                                str16 = str4;
                                length = i12;
                                str18 = str3;
                                str20 = str2;
                                str14 = str;
                                str22 = str5;
                                i11 = i10 + 1;
                                jSONArray2 = jSONArray;
                            }
                        } catch (Exception unused14) {
                            str = str14;
                            str4 = str16;
                            str3 = str18;
                            str2 = str20;
                            str16 = str4;
                            length = i12;
                            str18 = str3;
                            str20 = str2;
                            str14 = str;
                            str22 = str5;
                            i11 = i10 + 1;
                            jSONArray2 = jSONArray;
                        }
                    } catch (Exception unused15) {
                        str = str14;
                        str3 = str18;
                        str2 = str20;
                        str5 = str22;
                        str4 = str16;
                        str16 = str4;
                        length = i12;
                        str18 = str3;
                        str20 = str2;
                        str14 = str;
                        str22 = str5;
                        i11 = i10 + 1;
                        jSONArray2 = jSONArray;
                    }
                } catch (Exception unused16) {
                    str = str14;
                    str3 = str18;
                    str2 = str20;
                    i10 = i11;
                    str5 = str22;
                    str4 = str16;
                    str16 = str4;
                    length = i12;
                    str18 = str3;
                    str20 = str2;
                    str14 = str;
                    str22 = str5;
                    i11 = i10 + 1;
                    jSONArray2 = jSONArray;
                }
                str16 = str4;
                length = i12;
                str18 = str3;
                str20 = str2;
                str14 = str;
                str22 = str5;
                i11 = i10 + 1;
                jSONArray2 = jSONArray;
            }
        }
    }

    public final void H(JSONObject jSONObject, String str) {
        m.f(jSONObject, "jsonObject");
        m.f(str, "bsDate");
        String string = jSONObject.getString("np");
        String string2 = jSONObject.getString("en");
        String string3 = jSONObject.getString("dd_np");
        String string4 = jSONObject.getString("dd_en");
        ContentValues contentValues = new ContentValues();
        contentValues.put("date", str);
        contentValues.put("text_np", string);
        contentValues.put("text_en", string2);
        contentValues.put("text_ddnp", string3);
        contentValues.put("text_dden", string4);
        SQLiteDatabase sQLiteDatabase = f16717d;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.insert(f16730q, (String) null, contentValues);
        }
    }

    public final void I(JSONArray jSONArray) {
        JSONArray jSONArray2 = jSONArray;
        m.f(jSONArray2, "reminder");
        if (jSONArray.length() > 0) {
            int length = jSONArray.length();
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object obj = jSONArray2.get(i10);
                    m.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject = (JSONObject) obj;
                    ContentValues contentValues = new ContentValues();
                    String string = jSONObject.getString("id");
                    contentValues.put("event_id", jSONObject.getString("event_id").toString());
                    contentValues.put("days", Integer.valueOf(jSONObject.getInt("days")));
                    String string2 = jSONObject.getString("time");
                    String str = "";
                    if (string2 == null) {
                        string2 = str;
                    }
                    contentValues.put("time", string2);
                    contentValues.put("note", Integer.valueOf(jSONObject.getInt("note")));
                    String string3 = jSONObject.getString("notification_type");
                    if (string3 == null) {
                        string3 = str;
                    }
                    contentValues.put("notification_type", string3);
                    String string4 = jSONObject.getString("created_at");
                    if (string4 == null) {
                        string4 = str;
                    }
                    contentValues.put("created_at", string4);
                    String string5 = jSONObject.getString("updated_at");
                    if (string5 != null) {
                        str = string5;
                    }
                    contentValues.put("updated_at", str);
                    m.e(string, "reminderId");
                    try {
                        if (u(string) != null) {
                            SQLiteDatabase sQLiteDatabase = f16717d;
                            if (sQLiteDatabase != null) {
                                String str2 = f16724k;
                                String[] strArr = new String[1];
                                try {
                                    strArr[0] = string;
                                    sQLiteDatabase.update(str2, contentValues, "id=?", strArr);
                                } catch (Exception unused) {
                                }
                            }
                        } else {
                            SQLiteDatabase sQLiteDatabase2 = f16717d;
                            if (sQLiteDatabase2 != null) {
                                sQLiteDatabase2.insert(f16724k, (String) null, contentValues);
                            }
                        }
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                }
                i10++;
                jSONArray2 = jSONArray;
            }
        }
    }

    public final void J(JSONArray jSONArray) {
        String str;
        String str2;
        String str3;
        String str4;
        int i10;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        JSONArray jSONArray2 = jSONArray;
        String str10 = "comment_count";
        String str11 = "author";
        String str12 = "tags";
        String str13 = "thumbnail";
        String str14 = FirebaseAnalytics.Param.CONTENT;
        String str15 = "comments";
        if (jSONArray2 != null && jSONArray.length() > 0) {
            String str16 = "event";
            int length = jSONArray.length();
            String str17 = "thumbnail_images";
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object obj = jSONArray2.get(i11);
                    m.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("url")) {
                        jSONObject.getString("url");
                    }
                    if (jSONObject.has("categories")) {
                        jSONObject.getString("categories");
                    }
                    if (jSONObject.has(str15)) {
                        jSONObject.getString(str15);
                    }
                    ContentValues contentValues = new ContentValues();
                    i10 = length;
                    try {
                        int i12 = jSONObject.getInt("id");
                        str4 = str15;
                        try {
                            contentValues.put("id", Integer.valueOf(i12));
                            contentValues.put("date", jSONObject.getString("date").toString());
                            contentValues.put("modified", jSONObject.getString("modified").toString());
                            String string = jSONObject.getString(ShareConstants.WEB_DIALOG_PARAM_TITLE);
                            str3 = "";
                            if (string == null) {
                                string = str3;
                            }
                            contentValues.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, string);
                            String string2 = jSONObject.getString(str14);
                            if (string2 == null) {
                                string2 = str3;
                            }
                            contentValues.put(str14, string2);
                            str2 = str14;
                        } catch (Exception e10) {
                            e = e10;
                            str9 = str12;
                            str = str13;
                            str2 = str14;
                            str7 = str16;
                            str8 = str17;
                            str6 = str10;
                            str5 = str11;
                            e.printStackTrace();
                            i11++;
                            jSONArray2 = jSONArray;
                            str10 = str6;
                            str11 = str5;
                            length = i10;
                            str12 = str3;
                            str13 = str;
                            str17 = str8;
                            str16 = str7;
                            str15 = str4;
                            str14 = str2;
                        }
                        try {
                            String string3 = jSONObject.getString("excerpt");
                            if (string3 == null) {
                                string3 = str3;
                            }
                            contentValues.put("exceprt", string3);
                            String string4 = jSONObject.getString(str13);
                            if (string4 == null) {
                                string4 = str3;
                            }
                            contentValues.put(str13, string4);
                            String string5 = jSONObject.getString(str12);
                            if (string5 == null) {
                                string5 = str3;
                            }
                            contentValues.put(str12, string5);
                            String string6 = jSONObject.getString(str11);
                            if (string6 == null) {
                                string6 = str3;
                            }
                            contentValues.put(str11, string6);
                            contentValues.put(str10, Integer.valueOf(jSONObject.getInt(str10)));
                            str8 = str17;
                            try {
                                contentValues.put(str8, jSONObject.getString(str8));
                                str7 = str16;
                            } catch (Exception e11) {
                                e = e11;
                                str5 = str11;
                                str3 = str12;
                                str = str13;
                                str7 = str16;
                                str6 = str10;
                                e.printStackTrace();
                                i11++;
                                jSONArray2 = jSONArray;
                                str10 = str6;
                                str11 = str5;
                                length = i10;
                                str12 = str3;
                                str13 = str;
                                str17 = str8;
                                str16 = str7;
                                str15 = str4;
                                str14 = str2;
                            }
                            try {
                                contentValues.put(str7, Integer.valueOf(jSONObject.getInt(str7)));
                                str6 = str10;
                            } catch (Exception e12) {
                                e = e12;
                                str6 = str10;
                                str5 = str11;
                                str3 = str12;
                                str = str13;
                                e.printStackTrace();
                                i11++;
                                jSONArray2 = jSONArray;
                                str10 = str6;
                                str11 = str5;
                                length = i10;
                                str12 = str3;
                                str13 = str;
                                str17 = str8;
                                str16 = str7;
                                str15 = str4;
                                str14 = str2;
                            }
                            try {
                                Cursor k10 = k(i12);
                                if (k10.getCount() > 0) {
                                    SQLiteDatabase sQLiteDatabase = f16717d;
                                    if (sQLiteDatabase != null) {
                                        str5 = str11;
                                        try {
                                            String str18 = f16718e;
                                            str3 = str12;
                                            str = str13;
                                            try {
                                                sQLiteDatabase.update(str18, contentValues, "id=?", new String[]{String.valueOf(i12)});
                                            } catch (Exception e13) {
                                                e = e13;
                                                e.printStackTrace();
                                                i11++;
                                                jSONArray2 = jSONArray;
                                                str10 = str6;
                                                str11 = str5;
                                                length = i10;
                                                str12 = str3;
                                                str13 = str;
                                                str17 = str8;
                                                str16 = str7;
                                                str15 = str4;
                                                str14 = str2;
                                            }
                                        } catch (Exception e14) {
                                            e = e14;
                                            str3 = str12;
                                            str = str13;
                                            e.printStackTrace();
                                            i11++;
                                            jSONArray2 = jSONArray;
                                            str10 = str6;
                                            str11 = str5;
                                            length = i10;
                                            str12 = str3;
                                            str13 = str;
                                            str17 = str8;
                                            str16 = str7;
                                            str15 = str4;
                                            str14 = str2;
                                        }
                                    } else {
                                        str5 = str11;
                                        str3 = str12;
                                        str = str13;
                                    }
                                } else {
                                    str5 = str11;
                                    str3 = str12;
                                    str = str13;
                                    SQLiteDatabase sQLiteDatabase2 = f16717d;
                                    if (sQLiteDatabase2 != null) {
                                        sQLiteDatabase2.insert(f16718e, (String) null, contentValues);
                                    }
                                }
                                k10.close();
                            } catch (Exception e15) {
                                e = e15;
                                str5 = str11;
                                str3 = str12;
                                str = str13;
                                e.printStackTrace();
                                i11++;
                                jSONArray2 = jSONArray;
                                str10 = str6;
                                str11 = str5;
                                length = i10;
                                str12 = str3;
                                str13 = str;
                                str17 = str8;
                                str16 = str7;
                                str15 = str4;
                                str14 = str2;
                            }
                        } catch (Exception e16) {
                            e = e16;
                            str9 = str12;
                            str = str13;
                            str7 = str16;
                            str8 = str17;
                            str6 = str10;
                            str5 = str11;
                            e.printStackTrace();
                            i11++;
                            jSONArray2 = jSONArray;
                            str10 = str6;
                            str11 = str5;
                            length = i10;
                            str12 = str3;
                            str13 = str;
                            str17 = str8;
                            str16 = str7;
                            str15 = str4;
                            str14 = str2;
                        }
                    } catch (Exception e17) {
                        e = e17;
                        str9 = str12;
                        str = str13;
                        str2 = str14;
                        str4 = str15;
                        str7 = str16;
                        str8 = str17;
                        str6 = str10;
                        str5 = str11;
                        e.printStackTrace();
                        i11++;
                        jSONArray2 = jSONArray;
                        str10 = str6;
                        str11 = str5;
                        length = i10;
                        str12 = str3;
                        str13 = str;
                        str17 = str8;
                        str16 = str7;
                        str15 = str4;
                        str14 = str2;
                    }
                } catch (Exception e18) {
                    e = e18;
                    i10 = length;
                    str9 = str12;
                    str = str13;
                    str2 = str14;
                    str4 = str15;
                    str7 = str16;
                    str8 = str17;
                    str6 = str10;
                    str5 = str11;
                    e.printStackTrace();
                    i11++;
                    jSONArray2 = jSONArray;
                    str10 = str6;
                    str11 = str5;
                    length = i10;
                    str12 = str3;
                    str13 = str;
                    str17 = str8;
                    str16 = str7;
                    str15 = str4;
                    str14 = str2;
                }
                i11++;
                jSONArray2 = jSONArray;
                str10 = str6;
                str11 = str5;
                length = i10;
                str12 = str3;
                str13 = str;
                str17 = str8;
                str16 = str7;
                str15 = str4;
                str14 = str2;
            }
        }
    }

    public final void K(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        m.f(str3, "dt");
        m.f(str4, ShareConstants.MEDIA_TYPE);
        try {
            if (p.m(str4, "year", true)) {
                Calendar instance = Calendar.getInstance();
                instance.set(Integer.parseInt(str), 0, 1, 0, 0, 0);
                instance.set(14, 0);
                Calendar instance2 = Calendar.getInstance();
                instance2.set(1, Integer.parseInt(str));
                instance2.set(2, 11);
                instance2.set(5, instance2.getMaximum(5));
                instance2.set(11, 23);
                instance2.set(12, 59);
                instance2.set(13, 59);
                instance2.set(14, 0);
                np.com.nepalipatro.helpers.b bVar = np.com.nepalipatro.helpers.b.f15915a;
                m.e(instance, "calendar");
                String i10 = bVar.i(instance, "yyyy-MM-dd'T'HH:mm:ss.SSS");
                m.e(instance2, "endDate");
                String i11 = bVar.i(instance2, "yyyy-MM-dd'T'HH:mm:ss.SSS");
                SQLiteDatabase sQLiteDatabase = f16717d;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.delete(f16732s, "date>=? AND date<=?", new String[]{i10, i11});
                }
            } else {
                String substring = str.toString().substring(0, 4);
                m.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = str3.substring(4, 6);
                m.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                Calendar instance3 = Calendar.getInstance();
                instance3.set(Integer.parseInt(substring), Integer.parseInt(substring2) - 1, 1, 0, 0, 0);
                int maximum = instance3.getMaximum(5);
                Calendar instance4 = Calendar.getInstance();
                instance4.set(Integer.parseInt(substring), Integer.parseInt(substring2) - 1, maximum, 23, 59, 59);
                np.com.nepalipatro.helpers.b bVar2 = np.com.nepalipatro.helpers.b.f15915a;
                m.e(instance3, "startCalendar");
                String i12 = bVar2.i(instance3, "yyyy-MM-dd'T'HH:mm:ss.SSS");
                m.e(instance4, "endcalendar");
                String i13 = bVar2.i(instance4, "yyyy-MM-dd'T'HH:mm:ss.SSS");
                SQLiteDatabase sQLiteDatabase2 = f16717d;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.delete(f16732s, "date>=? AND date<=?", new String[]{i12, i13});
                }
            }
            SQLiteDatabase sQLiteDatabase3 = f16717d;
            System.out.print(sQLiteDatabase3 != null ? sQLiteDatabase3.query(f16732s, (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null) : null);
        } catch (Exception e10) {
            if (np.com.nepalipatro.helpers.g.f16048a.a()) {
                e10.printStackTrace();
            }
        }
    }

    public final void M(Amessage amessage) {
        m.f(amessage, "amessageItem");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", amessage.getId());
            contentValues.put("message_np", amessage.getMessage_np());
            contentValues.put("message_en", amessage.getMessage_en());
            contentValues.put("linktype", amessage.getLinktype());
            contentValues.put("link", amessage.getLink());
            contentValues.put("stdate", amessage.getStdate());
            contentValues.put("expiry", amessage.getExpiry());
            contentValues.put("aflag", amessage.getAflag());
            contentValues.put("pin", amessage.getPin());
            contentValues.put("createdAt", amessage.getCreatedt());
            contentValues.put("enable", amessage.getEnable());
            contentValues.put("options", amessage.getOptions());
            contentValues.put("dorder", amessage.getDorder());
            contentValues.put(AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, amessage.getCancelled());
            SQLiteDatabase sQLiteDatabase = f16717d;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.update(f16723j, contentValues, "id=?", new String[]{amessage.getId()});
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void a(JSONArray jSONArray) {
        String str;
        String str2;
        String str3;
        String str4;
        int i10;
        String str5;
        JSONArray jSONArray2 = jSONArray;
        String str6 = "update_date";
        String str7 = "pub_date";
        String str8 = "uuid";
        String str9 = "link";
        m.f(jSONArray2, "dataArray");
        int length = jSONArray.length();
        int i11 = 0;
        while (i11 < length) {
            try {
                Object obj = jSONArray2.get(i11);
                m.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                ContentValues contentValues = new ContentValues();
                i10 = length;
                try {
                    contentValues.put("id", jSONObject.getString("id"));
                    contentValues.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, jSONObject.getString(ShareConstants.WEB_DIALOG_PARAM_TITLE));
                    contentValues.put("description", jSONObject.getString("description"));
                    contentValues.put(FirebaseAnalytics.Param.CONTENT, jSONObject.getString(FirebaseAnalytics.Param.CONTENT));
                    contentValues.put(str9, jSONObject.getString(str9));
                    str4 = str9;
                } catch (Exception e10) {
                    e = e10;
                    str3 = str6;
                    str2 = str7;
                    str = str8;
                    str4 = str9;
                    e.printStackTrace();
                    i11++;
                    jSONArray2 = jSONArray;
                    length = i10;
                    str9 = str4;
                    str6 = str3;
                    str7 = str2;
                    str8 = str;
                }
                try {
                    contentValues.put("enclosure_url", jSONObject.getString("encloser_url"));
                    contentValues.put("enclosure_type", jSONObject.getString("encloser_type"));
                    contentValues.put("source", jSONObject.getString("source"));
                    contentValues.put("category", jSONObject.getString("category"));
                    contentValues.put("author", jSONObject.getString("author"));
                    contentValues.put("image", jSONObject.getString("image"));
                    contentValues.put(str8, jSONObject.getString(str8));
                    contentValues.put("fetchDate", jSONObject.getString("fetch_date"));
                    contentValues.put(str7, jSONObject.getString(str7));
                    contentValues.put(str6, jSONObject.getString(str6));
                    String string = jSONObject.getString("id");
                    m.e(string, "obj.getString(\"id\")");
                    try {
                        Cursor r10 = r(string);
                        if (r10 == null || r10.getCount() <= 0) {
                            str3 = str6;
                            str2 = str7;
                            str = str8;
                            SQLiteDatabase sQLiteDatabase = f16717d;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.insert(f16722i, (String) null, contentValues);
                            }
                            i11++;
                            jSONArray2 = jSONArray;
                            length = i10;
                            str9 = str4;
                            str6 = str3;
                            str7 = str2;
                            str8 = str;
                        } else {
                            SQLiteDatabase sQLiteDatabase2 = f16717d;
                            if (sQLiteDatabase2 != null) {
                                str3 = str6;
                                try {
                                    str5 = f16722i;
                                    str2 = str7;
                                    str = str8;
                                } catch (Exception e11) {
                                    e = e11;
                                    str2 = str7;
                                    str = str8;
                                    e.printStackTrace();
                                    i11++;
                                    jSONArray2 = jSONArray;
                                    length = i10;
                                    str9 = str4;
                                    str6 = str3;
                                    str7 = str2;
                                    str8 = str;
                                }
                                try {
                                    String[] strArr = new String[1];
                                    try {
                                        strArr[0] = jSONObject.getString("id");
                                        sQLiteDatabase2.update(str5, contentValues, "id=?", strArr);
                                    } catch (Exception e12) {
                                        e = e12;
                                        e.printStackTrace();
                                        i11++;
                                        jSONArray2 = jSONArray;
                                        length = i10;
                                        str9 = str4;
                                        str6 = str3;
                                        str7 = str2;
                                        str8 = str;
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    e.printStackTrace();
                                    i11++;
                                    jSONArray2 = jSONArray;
                                    length = i10;
                                    str9 = str4;
                                    str6 = str3;
                                    str7 = str2;
                                    str8 = str;
                                }
                            } else {
                                str3 = str6;
                                str2 = str7;
                                str = str8;
                            }
                            i11++;
                            jSONArray2 = jSONArray;
                            length = i10;
                            str9 = str4;
                            str6 = str3;
                            str7 = str2;
                            str8 = str;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        str3 = str6;
                        str2 = str7;
                        str = str8;
                        e.printStackTrace();
                        i11++;
                        jSONArray2 = jSONArray;
                        length = i10;
                        str9 = str4;
                        str6 = str3;
                        str7 = str2;
                        str8 = str;
                    }
                } catch (Exception e15) {
                    e = e15;
                    str3 = str6;
                    str2 = str7;
                    str = str8;
                    e.printStackTrace();
                    i11++;
                    jSONArray2 = jSONArray;
                    length = i10;
                    str9 = str4;
                    str6 = str3;
                    str7 = str2;
                    str8 = str;
                }
            } catch (Exception e16) {
                e = e16;
                str3 = str6;
                str2 = str7;
                str = str8;
                str4 = str9;
                i10 = length;
                e.printStackTrace();
                i11++;
                jSONArray2 = jSONArray;
                length = i10;
                str9 = str4;
                str6 = str3;
                str7 = str2;
                str8 = str;
            }
        }
    }

    public final void b(JSONArray jSONArray) {
        String str;
        String str2;
        int i10;
        int i11;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String string;
        String str9;
        String str10;
        String str11;
        JSONArray jSONArray2 = jSONArray;
        String str12 = "todate";
        String str13 = "author";
        String str14 = "pisces";
        String str15 = ShareConstants.WEB_DIALOG_PARAM_TITLE;
        String str16 = "aquarius";
        String str17 = ShareConstants.MEDIA_TYPE;
        m.f(jSONArray2, "dataArray");
        String str18 = "capricorn";
        int length = jSONArray.length();
        String str19 = "sagittarius";
        int i12 = 0;
        while (i12 < length) {
            try {
                Object obj = jSONArray2.get(i12);
                m.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                ContentValues contentValues = new ContentValues();
                i11 = length;
                try {
                    string = jSONObject.getString(str17);
                    contentValues.put(str17, string);
                    i10 = i12;
                } catch (Exception e10) {
                    e = e10;
                    str = str17;
                    i10 = i12;
                    str2 = str12;
                    str7 = str14;
                    str6 = str16;
                    str5 = str18;
                    str8 = str19;
                    str3 = str13;
                    str4 = str15;
                    e.printStackTrace();
                    jSONArray2 = jSONArray;
                    str15 = str4;
                    str13 = str3;
                    length = i11;
                    str17 = str;
                    str19 = str8;
                    str18 = str5;
                    i12 = i10 + 1;
                    str16 = str6;
                    str14 = str7;
                    str12 = str2;
                }
                try {
                    contentValues.put(str15, jSONObject.getString(str15));
                    contentValues.put(str13, jSONObject.getString(str13));
                    contentValues.put("lang", jSONObject.getString("lang"));
                    contentValues.put("aries", jSONObject.getString("aries"));
                    contentValues.put("taurus", jSONObject.getString("taurus"));
                    contentValues.put("gemini", jSONObject.getString("gemini"));
                    contentValues.put("cancer", jSONObject.getString("cancer"));
                    contentValues.put("leo", jSONObject.getString("leo"));
                    contentValues.put("virgo", jSONObject.getString("virgo"));
                    contentValues.put("libra", jSONObject.getString("libra"));
                    contentValues.put("scorpio", jSONObject.getString("scorpio"));
                    str8 = str19;
                    str3 = str13;
                    try {
                        contentValues.put(str8, jSONObject.getString(str8));
                        str9 = str18;
                        str4 = str15;
                    } catch (Exception e11) {
                        e = e11;
                        str = str17;
                        str2 = str12;
                        str7 = str14;
                        str6 = str16;
                        str5 = str18;
                        str4 = str15;
                        e.printStackTrace();
                        jSONArray2 = jSONArray;
                        str15 = str4;
                        str13 = str3;
                        length = i11;
                        str17 = str;
                        str19 = str8;
                        str18 = str5;
                        i12 = i10 + 1;
                        str16 = str6;
                        str14 = str7;
                        str12 = str2;
                    }
                } catch (Exception e12) {
                    e = e12;
                    str = str17;
                    str2 = str12;
                    str7 = str14;
                    str6 = str16;
                    str5 = str18;
                    str8 = str19;
                    str3 = str13;
                    str4 = str15;
                    e.printStackTrace();
                    jSONArray2 = jSONArray;
                    str15 = str4;
                    str13 = str3;
                    length = i11;
                    str17 = str;
                    str19 = str8;
                    str18 = str5;
                    i12 = i10 + 1;
                    str16 = str6;
                    str14 = str7;
                    str12 = str2;
                }
                try {
                    contentValues.put(str9, jSONObject.getString(str9));
                    String str20 = str16;
                    str5 = str9;
                    try {
                        contentValues.put(str20, jSONObject.getString(str20));
                        str10 = str14;
                        str6 = str20;
                    } catch (Exception e13) {
                        e = e13;
                        str = str17;
                        str2 = str12;
                        str7 = str14;
                        str6 = str20;
                        e.printStackTrace();
                        jSONArray2 = jSONArray;
                        str15 = str4;
                        str13 = str3;
                        length = i11;
                        str17 = str;
                        str19 = str8;
                        str18 = str5;
                        i12 = i10 + 1;
                        str16 = str6;
                        str14 = str7;
                        str12 = str2;
                    }
                    try {
                        contentValues.put(str10, jSONObject.getString(str10));
                        str11 = str12;
                    } catch (Exception e14) {
                        e = e14;
                        str = str17;
                        str2 = str12;
                        str7 = str10;
                        e.printStackTrace();
                        jSONArray2 = jSONArray;
                        str15 = str4;
                        str13 = str3;
                        length = i11;
                        str17 = str;
                        str19 = str8;
                        str18 = str5;
                        i12 = i10 + 1;
                        str16 = str6;
                        str14 = str7;
                        str12 = str2;
                    }
                } catch (Exception e15) {
                    e = e15;
                    str = str17;
                    str2 = str12;
                    str7 = str14;
                    str6 = str16;
                    str5 = str9;
                    e.printStackTrace();
                    jSONArray2 = jSONArray;
                    str15 = str4;
                    str13 = str3;
                    length = i11;
                    str17 = str;
                    str19 = str8;
                    str18 = str5;
                    i12 = i10 + 1;
                    str16 = str6;
                    str14 = str7;
                    str12 = str2;
                }
                try {
                    contentValues.put(str11, jSONObject.getString(str11));
                    m.e(string, str17);
                    str7 = str10;
                } catch (Exception e16) {
                    e = e16;
                    str7 = str10;
                    str2 = str11;
                    str = str17;
                    e.printStackTrace();
                    jSONArray2 = jSONArray;
                    str15 = str4;
                    str13 = str3;
                    length = i11;
                    str17 = str;
                    str19 = str8;
                    str18 = str5;
                    i12 = i10 + 1;
                    str16 = str6;
                    str14 = str7;
                    str12 = str2;
                }
                try {
                    Cursor t10 = t(string);
                    if (t10 == null || t10.getCount() <= 0) {
                        str2 = str11;
                        str = str17;
                        SQLiteDatabase sQLiteDatabase = f16717d;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.insert(f16721h, (String) null, contentValues);
                        }
                        jSONArray2 = jSONArray;
                        str15 = str4;
                        str13 = str3;
                        length = i11;
                        str17 = str;
                        str19 = str8;
                        str18 = str5;
                        i12 = i10 + 1;
                        str16 = str6;
                        str14 = str7;
                        str12 = str2;
                    } else {
                        SQLiteDatabase sQLiteDatabase2 = f16717d;
                        if (sQLiteDatabase2 != null) {
                            str2 = str11;
                            str = str17;
                            try {
                                sQLiteDatabase2.update(f16721h, contentValues, "type=?", new String[]{string});
                            } catch (Exception e17) {
                                e = e17;
                                e.printStackTrace();
                                jSONArray2 = jSONArray;
                                str15 = str4;
                                str13 = str3;
                                length = i11;
                                str17 = str;
                                str19 = str8;
                                str18 = str5;
                                i12 = i10 + 1;
                                str16 = str6;
                                str14 = str7;
                                str12 = str2;
                            }
                        } else {
                            str2 = str11;
                            str = str17;
                        }
                        jSONArray2 = jSONArray;
                        str15 = str4;
                        str13 = str3;
                        length = i11;
                        str17 = str;
                        str19 = str8;
                        str18 = str5;
                        i12 = i10 + 1;
                        str16 = str6;
                        str14 = str7;
                        str12 = str2;
                    }
                } catch (Exception e18) {
                    e = e18;
                    str2 = str11;
                    str = str17;
                    e.printStackTrace();
                    jSONArray2 = jSONArray;
                    str15 = str4;
                    str13 = str3;
                    length = i11;
                    str17 = str;
                    str19 = str8;
                    str18 = str5;
                    i12 = i10 + 1;
                    str16 = str6;
                    str14 = str7;
                    str12 = str2;
                }
            } catch (Exception e19) {
                e = e19;
                str = str17;
                i11 = length;
                i10 = i12;
                str2 = str12;
                str7 = str14;
                str6 = str16;
                str5 = str18;
                str8 = str19;
                str3 = str13;
                str4 = str15;
                e.printStackTrace();
                jSONArray2 = jSONArray;
                str15 = str4;
                str13 = str3;
                length = i11;
                str17 = str;
                str19 = str8;
                str18 = str5;
                i12 = i10 + 1;
                str16 = str6;
                str14 = str7;
                str12 = str2;
            }
        }
    }

    public final void c(JSONArray jSONArray) {
        JSONArray jSONArray2 = jSONArray;
        m.f(jSONArray2, "dataArray");
        int length = jSONArray.length();
        int i10 = 0;
        while (i10 < length) {
            try {
                Object obj = jSONArray2.get(i10);
                m.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                ContentValues contentValues = new ContentValues();
                String string = jSONObject.getString(ShareConstants.MEDIA_TYPE);
                contentValues.put(ShareConstants.MEDIA_TYPE, string);
                contentValues.put("code", jSONObject.getString("code"));
                contentValues.put(FirebaseAnalytics.Param.CURRENCY, jSONObject.getString(FirebaseAnalytics.Param.CURRENCY));
                contentValues.put("unit", jSONObject.getString("unit"));
                contentValues.put("buying", jSONObject.getString("buying"));
                contentValues.put("selling", jSONObject.getString("selling"));
                m.e(string, ShareConstants.MEDIA_TYPE);
                try {
                    Cursor p10 = p(string);
                    if (p10 == null || p10.getCount() <= 0) {
                        SQLiteDatabase sQLiteDatabase = f16717d;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.insert(f16720g, (String) null, contentValues);
                        }
                        i10++;
                    } else {
                        SQLiteDatabase sQLiteDatabase2 = f16717d;
                        if (sQLiteDatabase2 != null) {
                            String str = f16720g;
                            String[] strArr = new String[1];
                            try {
                                strArr[0] = string;
                                sQLiteDatabase2.update(str, contentValues, "type=?", strArr);
                            } catch (Exception e10) {
                                e = e10;
                                e.printStackTrace();
                                i10++;
                            }
                        }
                        i10++;
                    }
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                    i10++;
                }
            } catch (Exception e12) {
                e = e12;
                e.printStackTrace();
                i10++;
            }
        }
    }

    public final void d(int i10) {
        if (i10 < 0) {
            SQLiteDatabase sQLiteDatabase = f16717d;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.delete(f16723j, (String) null, (String[]) null);
                return;
            }
            return;
        }
        SQLiteDatabase sQLiteDatabase2 = f16717d;
        if (sQLiteDatabase2 != null) {
            sQLiteDatabase2.delete(f16723j, "id=?", new String[]{String.valueOf(i10)});
        }
    }

    public final void e(long j10) {
        SQLiteDatabase sQLiteDatabase = f16717d;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.delete(f16718e, "id=?", new String[]{String.valueOf(j10)});
        }
    }

    public final void f(String str) {
        m.f(str, "id");
        try {
            SQLiteDatabase sQLiteDatabase = f16717d;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.delete(f16728o, "event_id=?", new String[]{str});
            }
        } catch (Exception unused) {
        }
    }

    public final void g(JSONArray jSONArray) {
        JSONArray jSONArray2 = jSONArray;
        m.f(jSONArray2, "exceptionEvents");
        if (jSONArray.length() > 0) {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    Object obj = jSONArray2.get(i10);
                    m.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject = (JSONObject) obj;
                    ContentValues contentValues = new ContentValues();
                    String string = jSONObject.getString("id");
                    contentValues.put("ex_date", jSONObject.getString("ex_date").toString());
                    contentValues.put("new_date", jSONObject.getString("new_date"));
                    String string2 = jSONObject.getString("event_id");
                    String str = "";
                    if (string2 == null) {
                        string2 = str;
                    }
                    contentValues.put("event_id", string2);
                    contentValues.put("created_at", jSONObject.getString("created_at"));
                    String string3 = jSONObject.getString("updated_at");
                    if (string3 == null) {
                        string3 = str;
                    }
                    contentValues.put("updated_at", string3);
                    String string4 = jSONObject.getString("calendar_id");
                    if (string4 != null) {
                        str = string4;
                    }
                    contentValues.put("calendar_id", str);
                    m.e(string, "reminderId");
                    try {
                        if (u(string) != null) {
                            SQLiteDatabase sQLiteDatabase = f16717d;
                            if (sQLiteDatabase != null) {
                                String str2 = f16729p;
                                String[] strArr = new String[1];
                                try {
                                    strArr[0] = string;
                                    sQLiteDatabase.update(str2, contentValues, "id=?", strArr);
                                } catch (Exception unused) {
                                }
                            }
                        } else {
                            SQLiteDatabase sQLiteDatabase2 = f16717d;
                            if (sQLiteDatabase2 != null) {
                                sQLiteDatabase2.insert(f16729p, (String) null, contentValues);
                            }
                        }
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                }
            }
        }
    }

    public final void h(String str) {
        m.f(str, "bsDate");
        SQLiteDatabase sQLiteDatabase = f16717d;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.delete(f16730q, "date=?", new String[]{str});
        }
    }

    public final void i(String str) {
        m.f(str, "id");
        try {
            SQLiteDatabase sQLiteDatabase = f16717d;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.delete(f16731r, "id=?", new String[]{str});
            }
        } catch (Exception unused) {
        }
    }

    public final List<Amessage> j(String str) {
        Object obj;
        boolean z10;
        String str2 = str;
        m.f(str2, "aid");
        ArrayList arrayList = new ArrayList();
        try {
            String str3 = "SELECT * FROM " + f16723j + " WHERE id='" + str2 + '\'';
            SQLiteDatabase sQLiteDatabase = f16717d;
            Cursor rawQuery = sQLiteDatabase != null ? sQLiteDatabase.rawQuery(str3, (String[]) null) : null;
            if (rawQuery != null ? rawQuery.moveToFirst() : false) {
                do {
                    String string = rawQuery != null ? rawQuery.getString(rawQuery.getColumnIndexOrThrow("id")) : null;
                    String string2 = rawQuery != null ? rawQuery.getString(rawQuery.getColumnIndexOrThrow("message_np")) : null;
                    String string3 = rawQuery != null ? rawQuery.getString(rawQuery.getColumnIndexOrThrow("message_en")) : null;
                    String string4 = rawQuery != null ? rawQuery.getString(rawQuery.getColumnIndexOrThrow("linktype")) : null;
                    String string5 = rawQuery != null ? rawQuery.getString(rawQuery.getColumnIndexOrThrow("link")) : null;
                    String string6 = rawQuery != null ? rawQuery.getString(rawQuery.getColumnIndexOrThrow("stdate")) : null;
                    String string7 = rawQuery != null ? rawQuery.getString(rawQuery.getColumnIndexOrThrow("expiry")) : null;
                    String string8 = rawQuery != null ? rawQuery.getString(rawQuery.getColumnIndexOrThrow("aflag")) : null;
                    String string9 = rawQuery != null ? rawQuery.getString(rawQuery.getColumnIndexOrThrow("pin")) : null;
                    String string10 = rawQuery != null ? rawQuery.getString(rawQuery.getColumnIndexOrThrow("createdAt")) : null;
                    String string11 = rawQuery != null ? rawQuery.getString(rawQuery.getColumnIndexOrThrow("enable")) : null;
                    String string12 = rawQuery != null ? rawQuery.getString(rawQuery.getColumnIndexOrThrow("options")) : null;
                    String string13 = rawQuery != null ? rawQuery.getString(rawQuery.getColumnIndexOrThrow("dorder")) : null;
                    boolean z11 = true;
                    if (rawQuery == null || rawQuery.getInt(rawQuery.getColumnIndexOrThrow(AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED)) != 1) {
                        z11 = false;
                    }
                    new Amessage(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, Boolean.valueOf(z11));
                    arrayList.add(obj);
                    if (rawQuery != null) {
                        z10 = rawQuery.moveToNext();
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                } while (z10);
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public final Cursor k(int i10) {
        String str = "SELECT * FROM " + f16718e + " WHERE id=" + i10;
        SQLiteDatabase sQLiteDatabase = f16717d;
        Cursor cursor = null;
        if (sQLiteDatabase != null) {
            cursor = sQLiteDatabase.rawQuery(str, (String[]) null);
        }
        m.c(cursor);
        return cursor;
    }

    public final Cursor l(String str) {
        m.f(str, "id");
        String str2 = "SELECT * FROM " + f16724k + " WHERE calendar_id=" + str;
        SQLiteDatabase sQLiteDatabase = f16717d;
        Cursor cursor = null;
        if (sQLiteDatabase != null) {
            cursor = sQLiteDatabase.rawQuery(str2, (String[]) null);
        }
        m.c(cursor);
        return cursor;
    }

    public final SQLiteDatabase m() {
        SQLiteDatabase sQLiteDatabase = f16717d;
        m.c(sQLiteDatabase);
        return sQLiteDatabase;
    }

    public final EventModel n(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = str;
        m.f(str6, "id");
        try {
            SQLiteDatabase sQLiteDatabase = f16717d;
            Cursor rawQuery = sQLiteDatabase != null ? sQLiteDatabase.rawQuery("SELECT * FROM EventsDb WHERE id=? LIMIT 1", new String[]{str6}) : null;
            m.c(rawQuery);
            if (rawQuery.moveToFirst()) {
                String string = rawQuery.getString(rawQuery.getColumnIndexOrThrow("id"));
                String str7 = string == null ? "" : string;
                String string2 = rawQuery.getString(rawQuery.getColumnIndexOrThrow(ShareConstants.WEB_DIALOG_PARAM_TITLE));
                if (string2 == null) {
                    str2 = "";
                } else {
                    str2 = string2;
                }
                String string3 = rawQuery.getString(rawQuery.getColumnIndexOrThrow(FirebaseAnalytics.Param.START_DATE));
                if (string3 == null) {
                    str3 = "";
                } else {
                    str3 = string3;
                }
                l.a aVar = l.f16129a;
                String string4 = rawQuery.getString(rawQuery.getColumnIndexOrThrow("description"));
                if (string4 == null) {
                    string4 = "";
                }
                String a10 = aVar.a("9E4mk3Woz7tN8Ic9LRZYG5ipy7971B62egK199a0d+c=", string4);
                String string5 = rawQuery.getString(rawQuery.getColumnIndexOrThrow("calendar_id"));
                if (string5 == null) {
                    str4 = "";
                } else {
                    str4 = string5;
                }
                String string6 = rawQuery.getString(rawQuery.getColumnIndexOrThrow("rrule"));
                if (string6 == null) {
                    string6 = "";
                }
                String a11 = aVar.a("9E4mk3Woz7tN8Ic9LRZYG5ipy7971B62egK199a0d+c=", string6);
                String string7 = rawQuery.getString(rawQuery.getColumnIndexOrThrow("recurring_end_date"));
                if (string7 == null) {
                    str5 = "";
                } else {
                    str5 = string7;
                }
                int i10 = rawQuery.getInt(rawQuery.getColumnIndexOrThrow("important_event"));
                String string8 = rawQuery.getString(rawQuery.getColumnIndexOrThrow("based_on"));
                rawQuery.getInt(rawQuery.getColumnIndexOrThrow("has_reminder"));
                np.com.nepalipatro.helpers.b bVar = np.com.nepalipatro.helpers.b.f15915a;
                bVar.g(str3, bVar.e(), (TimeZone) null);
                EventModel eventModel = new EventModel(str7, str2, str3, a10, str4, Integer.valueOf(i10), a11, str5, (EventModel.EventType) null, (String) null, 768, (kotlin.jvm.internal.g) null);
                rawQuery.close();
                return eventModel;
            }
        } catch (Exception e10) {
            if (np.com.nepalipatro.helpers.g.f16048a.a()) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.util.Map<java.lang.String, java.lang.String>> o(java.util.Calendar r13, java.util.Calendar r14) {
        /*
            r12 = this;
            java.lang.String r0 = "startDate"
            kotlin.jvm.internal.m.f(r13, r0)
            java.lang.String r0 = "endDate"
            kotlin.jvm.internal.m.f(r14, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            np.com.nepalipatro.helpers.b r1 = np.com.nepalipatro.helpers.b.f15915a
            java.lang.String r2 = "yyyy-MM-dd'T'HH:mm:ss.000"
            java.lang.String r13 = r1.i(r13, r2)
            java.lang.String r14 = r1.i(r14, r2)
            android.database.sqlite.SQLiteDatabase r1 = f16717d
            if (r1 == 0) goto L_0x002f
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = 0
            r2[r3] = r13
            r13 = 1
            r2[r13] = r14
            java.lang.String r13 = "select EventsDb.title,cache.date as start_date,EventsDb.important_event,EventsDb.description,EventsDb.calendar_id,EventsDb.id from EventsDb INNER JOIN cache on EventsDb.id=cache.event_id WHERE cache.date>=? AND cache.date<=? ORDER BY cache.date ASC,EventsDb.important_event DESC "
            android.database.Cursor r13 = r1.rawQuery(r13, r2)
            goto L_0x0030
        L_0x002f:
            r13 = 0
        L_0x0030:
            if (r13 == 0) goto L_0x00c6
            boolean r14 = r13.moveToFirst()
            if (r14 == 0) goto L_0x00c6
        L_0x0038:
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            java.lang.String r1 = "id"
            int r2 = r13.getColumnIndexOrThrow(r1)
            java.lang.String r2 = r13.getString(r2)
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x004c
            r2 = r3
        L_0x004c:
            java.lang.String r4 = "title"
            int r5 = r13.getColumnIndexOrThrow(r4)
            java.lang.String r5 = r13.getString(r5)
            if (r5 != 0) goto L_0x0059
            r5 = r3
        L_0x0059:
            java.lang.String r6 = "start_date"
            int r7 = r13.getColumnIndexOrThrow(r6)
            java.lang.String r7 = r13.getString(r7)
            if (r7 != 0) goto L_0x0066
            r7 = r3
        L_0x0066:
            np.com.nepalipatro.helpers.l$a r8 = np.com.nepalipatro.helpers.l.f16129a
            java.lang.String r9 = "description"
            int r10 = r13.getColumnIndexOrThrow(r9)
            java.lang.String r10 = r13.getString(r10)
            if (r10 != 0) goto L_0x0075
            r10 = r3
        L_0x0075:
            java.lang.String r11 = "9E4mk3Woz7tN8Ic9LRZYG5ipy7971B62egK199a0d+c="
            java.lang.String r8 = r8.a(r11, r10)
            java.lang.String r10 = "calendar_id"
            int r11 = r13.getColumnIndexOrThrow(r10)
            java.lang.String r11 = r13.getString(r11)
            if (r11 != 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r3 = r11
        L_0x0089:
            java.lang.String r11 = "important_event"
            int r11 = r13.getColumnIndexOrThrow(r11)
            int r11 = r13.getInt(r11)
            java.lang.Object r1 = r14.put(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r14.put(r4, r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r14.put(r6, r7)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r14.put(r9, r8)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r14.put(r10, r3)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = java.lang.String.valueOf(r11)
            java.lang.String r2 = "im"
            java.lang.Object r1 = r14.put(r2, r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r14)
            boolean r14 = r13.moveToNext()
            if (r14 != 0) goto L_0x0038
        L_0x00c6:
            if (r13 == 0) goto L_0x00cb
            r13.close()
        L_0x00cb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.a.o(java.util.Calendar, java.util.Calendar):java.util.List");
    }

    public final Cursor p(String str) {
        m.f(str, ShareConstants.MEDIA_TYPE);
        SQLiteDatabase sQLiteDatabase = f16717d;
        if (sQLiteDatabase == null) {
            return null;
        }
        return sQLiteDatabase.query(f16720g, (String[]) null, "type=?", new String[]{str}, (String) null, (String) null, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0141 A[Catch:{ Exception -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0145 A[Catch:{ Exception -> 0x014b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<np.com.nepalipatro.models.EventModel> q(java.util.Calendar r19, java.util.Calendar r20) {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "9E4mk3Woz7tN8Ic9LRZYG5ipy7971B62egK199a0d+c="
            np.com.nepalipatro.helpers.b r3 = np.com.nepalipatro.helpers.b.f15915a     // Catch:{ Exception -> 0x0149 }
            kotlin.jvm.internal.m.c(r19)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r4 = r3.e()     // Catch:{ Exception -> 0x0149 }
            r3.c(r0, r4)     // Catch:{ Exception -> 0x0149 }
            kotlin.jvm.internal.m.c(r20)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r4 = r3.e()     // Catch:{ Exception -> 0x0149 }
            r3.c(r1, r4)     // Catch:{ Exception -> 0x0149 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0149 }
            r4.<init>()     // Catch:{ Exception -> 0x0149 }
            java.lang.String r5 = "SELECT EventsDb.title,cache.date as start_date,EventsDb.description,EventsDb.rrule,EventsDb.recurring_end_date,EventsDb.based_on,EventsDb.important_event,EventsDb.gh,EventsDb.calendar_id,EventsDb.id FROM cache inner JOIN EventsDb WHERE cache.event_id = EventsDb.id AND cache.date >= '"
            r4.append(r5)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r5 = r3.e()     // Catch:{ Exception -> 0x0149 }
            java.lang.String r5 = r3.c(r0, r5)     // Catch:{ Exception -> 0x0149 }
            r4.append(r5)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r5 = "' and cache.date <= '"
            r4.append(r5)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r5 = r3.e()     // Catch:{ Exception -> 0x0149 }
            java.lang.String r5 = r3.c(r1, r5)     // Catch:{ Exception -> 0x0149 }
            r4.append(r5)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r5 = "' and EventsDb.calendar_id = '105' and EventsDb.important_event = 1 UNION  SELECT EventsDb.title as title,cache.date as start_date,EventsDb.description as description, EventsDb.rrule as rrule,EventsDb.recurring_end_date as recurring_end_date,EventsDb.based_on as based_on,EventsDb.important_event as important_event,EventsDb.gh as gh, EventsDb.calendar_id as calendar_id,EventsDb.id as id  FROM cache inner JOIN EventsDb WHERE (rrule IS NOT NULL AND TRIM(rrule,' ') != '' or( rrule=='' AND start_date>= '"
            r4.append(r5)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r5 = r3.e()     // Catch:{ Exception -> 0x0149 }
            java.lang.String r5 = r3.c(r0, r5)     // Catch:{ Exception -> 0x0149 }
            r4.append(r5)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r5 = "') )  AND recurring_end_date>='"
            r4.append(r5)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r5 = r3.e()     // Catch:{ Exception -> 0x0149 }
            java.lang.String r5 = r3.c(r0, r5)     // Catch:{ Exception -> 0x0149 }
            r4.append(r5)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r5 = "' AND status != 0 AND calendar_id !=105  AND  cache.event_id = EventsDb.id AND cache.date>= '"
            r4.append(r5)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r5 = r3.e()     // Catch:{ Exception -> 0x0149 }
            java.lang.String r0 = r3.c(r0, r5)     // Catch:{ Exception -> 0x0149 }
            r4.append(r0)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r0 = "' AND cache.date <='"
            r4.append(r0)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r0 = r3.e()     // Catch:{ Exception -> 0x0149 }
            java.lang.String r0 = r3.c(r1, r0)     // Catch:{ Exception -> 0x0149 }
            r4.append(r0)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r0 = "' ORDER BY start_date ASC"
            r4.append(r0)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x0149 }
            android.database.sqlite.SQLiteDatabase r1 = f16717d     // Catch:{ Exception -> 0x0149 }
            r3 = 0
            if (r1 == 0) goto L_0x0093
            android.database.Cursor r3 = r1.rawQuery(r0, r3)     // Catch:{ Exception -> 0x0149 }
        L_0x0093:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x0149 }
            r0.<init>()     // Catch:{ Exception -> 0x0149 }
            if (r3 == 0) goto L_0x0134
            boolean r1 = r3.moveToFirst()     // Catch:{ Exception -> 0x0149 }
            if (r1 == 0) goto L_0x0134
        L_0x00a0:
            java.lang.String r1 = "start_date"
            int r1 = r3.getColumnIndexOrThrow(r1)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r1 = r3.getString(r1)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r4 = ""
            if (r1 != 0) goto L_0x00b0
            r8 = r4
            goto L_0x00b1
        L_0x00b0:
            r8 = r1
        L_0x00b1:
            java.lang.String r1 = "id"
            int r1 = r3.getColumnIndexOrThrow(r1)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r1 = r3.getString(r1)     // Catch:{ Exception -> 0x0149 }
            if (r1 != 0) goto L_0x00bf
            r6 = r4
            goto L_0x00c0
        L_0x00bf:
            r6 = r1
        L_0x00c0:
            java.lang.String r1 = "title"
            int r1 = r3.getColumnIndexOrThrow(r1)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r1 = r3.getString(r1)     // Catch:{ Exception -> 0x0149 }
            if (r1 != 0) goto L_0x00ce
            r7 = r4
            goto L_0x00cf
        L_0x00ce:
            r7 = r1
        L_0x00cf:
            np.com.nepalipatro.helpers.l$a r1 = np.com.nepalipatro.helpers.l.f16129a     // Catch:{ Exception -> 0x0149 }
            java.lang.String r5 = "description"
            int r5 = r3.getColumnIndexOrThrow(r5)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r5 = r3.getString(r5)     // Catch:{ Exception -> 0x0149 }
            if (r5 != 0) goto L_0x00de
            r5 = r4
        L_0x00de:
            java.lang.String r9 = r1.a(r2, r5)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r5 = "calendar_id"
            int r5 = r3.getColumnIndexOrThrow(r5)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r5 = r3.getString(r5)     // Catch:{ Exception -> 0x0149 }
            if (r5 != 0) goto L_0x00f0
            r10 = r4
            goto L_0x00f1
        L_0x00f0:
            r10 = r5
        L_0x00f1:
            java.lang.String r5 = "rrule"
            int r5 = r3.getColumnIndexOrThrow(r5)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r5 = r3.getString(r5)     // Catch:{ Exception -> 0x0149 }
            if (r5 != 0) goto L_0x00fe
            r5 = r4
        L_0x00fe:
            java.lang.String r12 = r1.a(r2, r5)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r1 = "recurring_end_date"
            int r1 = r3.getColumnIndexOrThrow(r1)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r1 = r3.getString(r1)     // Catch:{ Exception -> 0x0149 }
            if (r1 != 0) goto L_0x0110
            r13 = r4
            goto L_0x0111
        L_0x0110:
            r13 = r1
        L_0x0111:
            java.lang.String r1 = "important_event"
            int r1 = r3.getColumnIndexOrThrow(r1)     // Catch:{ Exception -> 0x0149 }
            int r1 = r3.getInt(r1)     // Catch:{ Exception -> 0x0149 }
            np.com.nepalipatro.models.EventModel r4 = new np.com.nepalipatro.models.EventModel     // Catch:{ Exception -> 0x0149 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0149 }
            r14 = 0
            r15 = 0
            r16 = 768(0x300, float:1.076E-42)
            r17 = 0
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0149 }
            r0.add(r4)     // Catch:{ Exception -> 0x0149 }
            boolean r1 = r3.moveToNext()     // Catch:{ Exception -> 0x0149 }
            if (r1 != 0) goto L_0x00a0
        L_0x0134:
            int r1 = r0.size()     // Catch:{ Exception -> 0x0149 }
            if (r1 <= 0) goto L_0x0141
            r1 = r18
            java.util.ArrayList r0 = r1.L(r0)     // Catch:{ Exception -> 0x014b }
            goto L_0x0143
        L_0x0141:
            r1 = r18
        L_0x0143:
            if (r3 == 0) goto L_0x0148
            r3.close()     // Catch:{ Exception -> 0x014b }
        L_0x0148:
            return r0
        L_0x0149:
            r1 = r18
        L_0x014b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.a.q(java.util.Calendar, java.util.Calendar):java.util.List");
    }

    public final Cursor r(String str) {
        m.f(str, "id");
        SQLiteDatabase sQLiteDatabase = f16717d;
        if (sQLiteDatabase == null) {
            return null;
        }
        return sQLiteDatabase.query(f16722i, (String[]) null, "id=?", new String[]{str}, (String) null, (String) null, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d7, code lost:
        if (r5 != null) goto L_0x00da;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String s(java.util.Calendar r11, java.util.Calendar r12, java.lang.String r13) {
        /*
            r10 = this;
            java.lang.String r0 = "description"
            java.lang.String r1 = "startDate"
            kotlin.jvm.internal.m.f(r11, r1)
            java.lang.String r1 = "locale"
            kotlin.jvm.internal.m.f(r13, r1)
            kotlin.jvm.internal.m.c(r12)
            java.util.List r11 = r10.o(r11, r12)
            r12 = 0
            java.lang.String r1 = ""
            if (r11 == 0) goto L_0x001d
            int r2 = r11.size()     // Catch:{ Exception -> 0x00f3 }
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            if (r2 <= 0) goto L_0x00f3
            if (r11 == 0) goto L_0x002b
            int r2 = r11.size()     // Catch:{ Exception -> 0x00f3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            kotlin.jvm.internal.m.c(r2)     // Catch:{ Exception -> 0x00f3 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x00f3 }
            r4 = r1
            r3 = 0
        L_0x0035:
            if (r3 >= r2) goto L_0x00f2
            java.lang.Object r5 = r11.get(r3)     // Catch:{ Exception -> 0x00f2 }
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>"
            kotlin.jvm.internal.m.d(r5, r6)     // Catch:{ Exception -> 0x00f2 }
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ Exception -> 0x00f2 }
            boolean r6 = r5.containsKey(r0)     // Catch:{ Exception -> 0x00f2 }
            if (r6 == 0) goto L_0x00ee
            java.lang.Object r5 = r5.get(r0)     // Catch:{ Exception -> 0x00f2 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00f2 }
            r6 = 1
            if (r5 == 0) goto L_0x0059
            int r7 = r5.length()     // Catch:{ Exception -> 0x00f2 }
            if (r7 <= 0) goto L_0x0059
            r7 = 1
            goto L_0x005a
        L_0x0059:
            r7 = 0
        L_0x005a:
            if (r7 == 0) goto L_0x00ee
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x00e2 }
            r7.<init>(r5)     // Catch:{ Exception -> 0x00e2 }
            np.com.nepalipatro.models.EventDescriptionModel$Companion r5 = np.com.nepalipatro.models.EventDescriptionModel.Companion     // Catch:{ Exception -> 0x00e2 }
            np.com.nepalipatro.models.EventDescriptionModel r5 = r5.eventModelFromJson(r7)     // Catch:{ Exception -> 0x00e2 }
            int r7 = r4.length()     // Catch:{ Exception -> 0x00e2 }
            if (r7 != 0) goto L_0x006f
            r7 = 1
            goto L_0x0070
        L_0x006f:
            r7 = 0
        L_0x0070:
            java.lang.String r8 = "ne"
            if (r7 == 0) goto L_0x00a1
            boolean r6 = g9.p.m(r13, r8, r6)     // Catch:{ Exception -> 0x00e2 }
            if (r6 == 0) goto L_0x008d
            if (r5 == 0) goto L_0x009f
            java.lang.String r5 = r5.getDescriptionNe()     // Catch:{ Exception -> 0x00e2 }
            if (r5 == 0) goto L_0x009f
            java.lang.CharSequence r5 = g9.q.q0(r5)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x00e2 }
            if (r4 != 0) goto L_0x00ee
            goto L_0x009f
        L_0x008d:
            if (r5 == 0) goto L_0x009f
            java.lang.String r5 = r5.getDescriptionEn()     // Catch:{ Exception -> 0x00e2 }
            if (r5 == 0) goto L_0x009f
            java.lang.CharSequence r5 = g9.q.q0(r5)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x00e2 }
            if (r4 != 0) goto L_0x00ee
        L_0x009f:
            r4 = r1
            goto L_0x00ee
        L_0x00a1:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e2 }
            r7.<init>()     // Catch:{ Exception -> 0x00e2 }
            r7.append(r4)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r9 = ", "
            r7.append(r9)     // Catch:{ Exception -> 0x00e2 }
            boolean r6 = g9.p.m(r13, r8, r6)     // Catch:{ Exception -> 0x00e2 }
            if (r6 == 0) goto L_0x00c7
            if (r5 == 0) goto L_0x00d9
            java.lang.String r5 = r5.getDescriptionNe()     // Catch:{ Exception -> 0x00e2 }
            if (r5 == 0) goto L_0x00d9
            java.lang.CharSequence r5 = g9.q.q0(r5)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00e2 }
            if (r5 != 0) goto L_0x00da
            goto L_0x00d9
        L_0x00c7:
            if (r5 == 0) goto L_0x00d9
            java.lang.String r5 = r5.getDescriptionEn()     // Catch:{ Exception -> 0x00e2 }
            if (r5 == 0) goto L_0x00d9
            java.lang.CharSequence r5 = g9.q.q0(r5)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00e2 }
            if (r5 != 0) goto L_0x00da
        L_0x00d9:
            r5 = r1
        L_0x00da:
            r7.append(r5)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r4 = r7.toString()     // Catch:{ Exception -> 0x00e2 }
            goto L_0x00ee
        L_0x00e2:
            r5 = move-exception
            np.com.nepalipatro.helpers.g$a r6 = np.com.nepalipatro.helpers.g.f16048a     // Catch:{ Exception -> 0x00f2 }
            boolean r6 = r6.a()     // Catch:{ Exception -> 0x00f2 }
            if (r6 == 0) goto L_0x00ee
            r5.printStackTrace()     // Catch:{ Exception -> 0x00f2 }
        L_0x00ee:
            int r3 = r3 + 1
            goto L_0x0035
        L_0x00f2:
            r1 = r4
        L_0x00f3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.a.s(java.util.Calendar, java.util.Calendar, java.lang.String):java.lang.String");
    }

    public final Cursor t(String str) {
        m.f(str, ShareConstants.MEDIA_TYPE);
        SQLiteDatabase sQLiteDatabase = f16717d;
        if (sQLiteDatabase == null) {
            return null;
        }
        return sQLiteDatabase.query(f16721h, (String[]) null, "type=?", new String[]{str}, (String) null, (String) null, (String) null);
    }

    public final ReminderModel u(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        m.f(str, "id");
        try {
            SQLiteDatabase sQLiteDatabase = f16717d;
            Cursor rawQuery = sQLiteDatabase != null ? sQLiteDatabase.rawQuery("SELECT * FROM RemindersDb WHERE id=? LIMIT 1", new String[]{str}) : null;
            m.c(rawQuery);
            if (rawQuery.moveToFirst()) {
                String string = rawQuery.getString(rawQuery.getColumnIndexOrThrow("id"));
                String str6 = string == null ? "" : string;
                String string2 = rawQuery.getString(rawQuery.getColumnIndexOrThrow("event_id"));
                if (string2 == null) {
                    str2 = "";
                } else {
                    str2 = string2;
                }
                int i10 = rawQuery.getInt(rawQuery.getColumnIndexOrThrow("days"));
                String string3 = rawQuery.getString(rawQuery.getColumnIndexOrThrow("time"));
                if (string3 == null) {
                    str3 = "";
                } else {
                    str3 = string3;
                }
                String string4 = rawQuery.getString(rawQuery.getColumnIndexOrThrow("note"));
                if (string4 == null) {
                    str4 = "";
                } else {
                    str4 = string4;
                }
                String string5 = rawQuery.getString(rawQuery.getColumnIndexOrThrow("notification_type"));
                if (string5 == null) {
                    str5 = "";
                } else {
                    str5 = string5;
                }
                ReminderModel reminderModel = new ReminderModel(str6, str2, Integer.valueOf(i10), str3, str4, str5);
                rawQuery.close();
                return reminderModel;
            }
        } catch (Exception e10) {
            if (np.com.nepalipatro.helpers.g.f16048a.a()) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public final SQLiteDatabase v() {
        SQLiteDatabase sQLiteDatabase = f16717d;
        m.c(sQLiteDatabase);
        return sQLiteDatabase;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        if (r2 == null) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> w() {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "select * from "
            r1.append(r2)
            java.lang.String r2 = f16725l
            r1.append(r2)
            java.lang.String r2 = " where updated_at>=?"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.content.Context r2 = r14.f16733a
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0032
            np.com.nepalipatro.helpers.k$a r4 = np.com.nepalipatro.helpers.k.f16077a
            kotlin.jvm.internal.m.c(r2)
            java.lang.String r5 = r4.n()
            java.lang.String r2 = r4.w(r2, r5, r3)
            if (r2 != 0) goto L_0x0033
        L_0x0032:
            r2 = r3
        L_0x0033:
            int r4 = r2.length()
            r5 = 1
            r6 = 0
            if (r4 <= 0) goto L_0x003d
            r4 = 1
            goto L_0x003e
        L_0x003d:
            r4 = 0
        L_0x003e:
            if (r4 == 0) goto L_0x00b9
            android.database.sqlite.SQLiteDatabase r4 = f16717d
            if (r4 == 0) goto L_0x004d
            java.lang.String[] r5 = new java.lang.String[r5]
            r5[r6] = r2
            android.database.Cursor r1 = r4.rawQuery(r1, r5)
            goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            if (r1 == 0) goto L_0x00b4
            boolean r2 = r1.moveToFirst()
            if (r2 == 0) goto L_0x00b4
        L_0x0056:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r4 = "id"
            int r5 = r1.getColumnIndexOrThrow(r4)
            java.lang.String r5 = r1.getString(r5)
            if (r5 != 0) goto L_0x0068
            r5 = r3
        L_0x0068:
            java.lang.String r6 = "event_id"
            int r7 = r1.getColumnIndexOrThrow(r6)
            java.lang.String r7 = r1.getString(r7)
            if (r7 != 0) goto L_0x0075
            r7 = r3
        L_0x0075:
            java.lang.String r8 = "calendar_id"
            int r9 = r1.getColumnIndexOrThrow(r8)
            java.lang.String r9 = r1.getString(r9)
            if (r9 != 0) goto L_0x0082
            r9 = r3
        L_0x0082:
            java.lang.String r10 = "created_at"
            int r11 = r1.getColumnIndexOrThrow(r10)
            java.lang.String r11 = r1.getString(r11)
            if (r11 != 0) goto L_0x008f
            r11 = r3
        L_0x008f:
            java.lang.String r12 = "updated_at"
            int r13 = r1.getColumnIndexOrThrow(r12)
            java.lang.String r13 = r1.getString(r13)
            if (r13 != 0) goto L_0x009c
            r13 = r3
        L_0x009c:
            r2.put(r4, r5)
            r2.put(r6, r7)
            r2.put(r10, r11)
            r2.put(r12, r13)
            r2.put(r8, r9)
            r0.add(r2)
            boolean r2 = r1.moveToNext()
            if (r2 != 0) goto L_0x0056
        L_0x00b4:
            if (r1 == 0) goto L_0x00b9
            r1.close()
        L_0x00b9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.a.w():java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        if (r2 == null) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> x() {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "select * from "
            r1.append(r2)
            java.lang.String r2 = f16726m
            r1.append(r2)
            java.lang.String r2 = " where updated_at>=?"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.content.Context r2 = r14.f16733a
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0032
            np.com.nepalipatro.helpers.k$a r4 = np.com.nepalipatro.helpers.k.f16077a
            kotlin.jvm.internal.m.c(r2)
            java.lang.String r5 = r4.n()
            java.lang.String r2 = r4.w(r2, r5, r3)
            if (r2 != 0) goto L_0x0033
        L_0x0032:
            r2 = r3
        L_0x0033:
            int r4 = r2.length()
            r5 = 1
            r6 = 0
            if (r4 <= 0) goto L_0x003d
            r4 = 1
            goto L_0x003e
        L_0x003d:
            r4 = 0
        L_0x003e:
            if (r4 == 0) goto L_0x00b9
            android.database.sqlite.SQLiteDatabase r4 = f16717d
            if (r4 == 0) goto L_0x004d
            java.lang.String[] r5 = new java.lang.String[r5]
            r5[r6] = r2
            android.database.Cursor r1 = r4.rawQuery(r1, r5)
            goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            if (r1 == 0) goto L_0x00b4
            boolean r2 = r1.moveToFirst()
            if (r2 == 0) goto L_0x00b4
        L_0x0056:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r4 = "id"
            int r5 = r1.getColumnIndexOrThrow(r4)
            java.lang.String r5 = r1.getString(r5)
            if (r5 != 0) goto L_0x0068
            r5 = r3
        L_0x0068:
            java.lang.String r6 = "reminder_id"
            int r7 = r1.getColumnIndexOrThrow(r6)
            java.lang.String r7 = r1.getString(r7)
            if (r7 != 0) goto L_0x0075
            r7 = r3
        L_0x0075:
            java.lang.String r8 = "calendar_id"
            int r9 = r1.getColumnIndexOrThrow(r8)
            java.lang.String r9 = r1.getString(r9)
            if (r9 != 0) goto L_0x0082
            r9 = r3
        L_0x0082:
            java.lang.String r10 = "created_at"
            int r11 = r1.getColumnIndexOrThrow(r10)
            java.lang.String r11 = r1.getString(r11)
            if (r11 != 0) goto L_0x008f
            r11 = r3
        L_0x008f:
            java.lang.String r12 = "updated_at"
            int r13 = r1.getColumnIndexOrThrow(r12)
            java.lang.String r13 = r1.getString(r13)
            if (r13 != 0) goto L_0x009c
            r13 = r3
        L_0x009c:
            r2.put(r4, r5)
            r2.put(r6, r7)
            r2.put(r10, r11)
            r2.put(r12, r13)
            r2.put(r8, r9)
            r0.add(r2)
            boolean r2 = r1.moveToNext()
            if (r2 != 0) goto L_0x0056
        L_0x00b4:
            if (r1 == 0) goto L_0x00b9
            r1.close()
        L_0x00b9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.a.x():java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0032, code lost:
        if (r3 == null) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> y() {
        /*
            r28 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "select * from "
            r1.append(r2)
            java.lang.String r2 = f16724k
            r1.append(r2)
            java.lang.String r2 = " where updated_at>=?"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r28
            android.content.Context r3 = r2.f16733a
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0034
            np.com.nepalipatro.helpers.k$a r5 = np.com.nepalipatro.helpers.k.f16077a
            kotlin.jvm.internal.m.c(r3)
            java.lang.String r6 = r5.n()
            java.lang.String r3 = r5.w(r3, r6, r4)
            if (r3 != 0) goto L_0x0035
        L_0x0034:
            r3 = r4
        L_0x0035:
            int r5 = r3.length()
            r6 = 1
            r7 = 0
            if (r5 <= 0) goto L_0x003f
            r5 = 1
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            if (r5 == 0) goto L_0x016a
            android.database.sqlite.SQLiteDatabase r5 = f16717d
            if (r5 == 0) goto L_0x004f
            java.lang.String[] r6 = new java.lang.String[r6]
            r6[r7] = r3
            android.database.Cursor r1 = r5.rawQuery(r1, r6)
            goto L_0x0050
        L_0x004f:
            r1 = 0
        L_0x0050:
            if (r1 == 0) goto L_0x0165
            boolean r3 = r1.moveToFirst()
            if (r3 == 0) goto L_0x0165
        L_0x0058:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r5 = "id"
            int r6 = r1.getColumnIndexOrThrow(r5)
            java.lang.String r6 = r1.getString(r6)
            if (r6 != 0) goto L_0x006a
            r6 = r4
        L_0x006a:
            java.lang.String r7 = "calendar_id"
            int r8 = r1.getColumnIndexOrThrow(r7)
            java.lang.String r8 = r1.getString(r8)
            if (r8 != 0) goto L_0x0077
            r8 = r4
        L_0x0077:
            java.lang.String r9 = "name"
            int r10 = r1.getColumnIndexOrThrow(r9)
            java.lang.String r10 = r1.getString(r10)
            if (r10 != 0) goto L_0x0084
            r10 = r4
        L_0x0084:
            java.lang.String r11 = "created_by"
            int r12 = r1.getColumnIndexOrThrow(r11)
            java.lang.String r12 = r1.getString(r12)
            if (r12 != 0) goto L_0x0091
            r12 = r4
        L_0x0091:
            java.lang.String r13 = "is_default"
            int r14 = r1.getColumnIndexOrThrow(r13)
            java.lang.String r14 = r1.getString(r14)
            if (r14 != 0) goto L_0x009e
            r14 = r4
        L_0x009e:
            java.lang.String r15 = "status"
            int r2 = r1.getColumnIndexOrThrow(r15)
            java.lang.String r2 = r1.getString(r2)
            if (r2 != 0) goto L_0x00ae
            r2 = r4
            r16 = r2
            goto L_0x00b0
        L_0x00ae:
            r16 = r4
        L_0x00b0:
            java.lang.String r4 = "is_modifiable"
            r17 = r0
            int r0 = r1.getColumnIndexOrThrow(r4)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x00c1
            r18 = r16
            goto L_0x00c3
        L_0x00c1:
            r18 = r0
        L_0x00c3:
            java.lang.String r0 = "color"
            r19 = r4
            int r4 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r4 = r1.getString(r4)
            r20 = r0
            if (r4 != 0) goto L_0x00d5
            r4 = r16
        L_0x00d5:
            java.lang.String r0 = "created_at"
            r21 = r4
            int r4 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r4 = r1.getString(r4)
            r22 = r0
            if (r4 != 0) goto L_0x00e7
            r4 = r16
        L_0x00e7:
            java.lang.String r0 = "updated_at"
            r23 = r4
            int r4 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r4 = r1.getString(r4)
            r24 = r0
            if (r4 != 0) goto L_0x00f9
            r4 = r16
        L_0x00f9:
            java.lang.String r0 = "priority"
            r25 = r4
            int r4 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r4 = r1.getString(r4)
            r26 = r0
            if (r4 != 0) goto L_0x010b
            r4 = r16
        L_0x010b:
            java.lang.String r0 = "display"
            r27 = r4
            int r4 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r4 = r1.getString(r4)
            if (r4 != 0) goto L_0x011b
            r4 = r16
        L_0x011b:
            r3.put(r5, r6)
            r3.put(r7, r8)
            r3.put(r9, r10)
            r3.put(r11, r12)
            r3.put(r13, r14)
            r3.put(r15, r2)
            r2 = r18
            r5 = r19
            r3.put(r5, r2)
            r5 = r20
            r2 = r21
            r3.put(r5, r2)
            r5 = r22
            r2 = r23
            r3.put(r5, r2)
            r5 = r24
            r2 = r25
            r3.put(r5, r2)
            r5 = r26
            r2 = r27
            r3.put(r5, r2)
            r3.put(r0, r4)
            r0 = r17
            r0.add(r3)
            boolean r2 = r1.moveToNext()
            if (r2 != 0) goto L_0x015f
            goto L_0x0165
        L_0x015f:
            r2 = r28
            r4 = r16
            goto L_0x0058
        L_0x0165:
            if (r1 == 0) goto L_0x016a
            r1.close()
        L_0x016a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.a.y():java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002d, code lost:
        if (r3 == null) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> z() {
        /*
            r16 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "select * from "
            r1.append(r2)
            java.lang.String r2 = f16729p
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r16
            android.content.Context r3 = r2.f16733a
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x002f
            np.com.nepalipatro.helpers.k$a r5 = np.com.nepalipatro.helpers.k.f16077a
            kotlin.jvm.internal.m.c(r3)
            java.lang.String r6 = r5.n()
            java.lang.String r3 = r5.w(r3, r6, r4)
            if (r3 != 0) goto L_0x0030
        L_0x002f:
            r3 = r4
        L_0x0030:
            int r5 = r3.length()
            r6 = 0
            if (r5 <= 0) goto L_0x0039
            r5 = 1
            goto L_0x003a
        L_0x0039:
            r5 = 0
        L_0x003a:
            if (r5 == 0) goto L_0x0050
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = " where updated_at>="
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
        L_0x0050:
            android.database.sqlite.SQLiteDatabase r3 = f16717d
            if (r3 == 0) goto L_0x005b
            java.lang.String[] r5 = new java.lang.String[r6]
            android.database.Cursor r1 = r3.rawQuery(r1, r5)
            goto L_0x005c
        L_0x005b:
            r1 = 0
        L_0x005c:
            if (r1 == 0) goto L_0x00d6
            boolean r3 = r1.moveToFirst()
            if (r3 == 0) goto L_0x00d6
        L_0x0064:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r5 = "id"
            int r6 = r1.getColumnIndexOrThrow(r5)
            java.lang.String r6 = r1.getString(r6)
            if (r6 != 0) goto L_0x0076
            r6 = r4
        L_0x0076:
            java.lang.String r7 = "exception_date"
            int r8 = r1.getColumnIndexOrThrow(r7)
            java.lang.String r8 = r1.getString(r8)
            if (r8 != 0) goto L_0x0083
            r8 = r4
        L_0x0083:
            java.lang.String r9 = "new_date"
            int r10 = r1.getColumnIndexOrThrow(r9)
            java.lang.String r10 = r1.getString(r10)
            if (r10 != 0) goto L_0x0090
            r10 = r4
        L_0x0090:
            java.lang.String r11 = "event_id"
            int r12 = r1.getColumnIndexOrThrow(r11)
            java.lang.String r12 = r1.getString(r12)
            if (r12 != 0) goto L_0x009d
            r12 = r4
        L_0x009d:
            java.lang.String r13 = "created_at"
            int r14 = r1.getColumnIndexOrThrow(r13)
            java.lang.String r14 = r1.getString(r14)
            if (r14 != 0) goto L_0x00aa
            r14 = r4
        L_0x00aa:
            java.lang.String r15 = "updated_at"
            int r2 = r1.getColumnIndexOrThrow(r15)
            java.lang.String r2 = r1.getString(r2)
            if (r2 != 0) goto L_0x00b7
            r2 = r4
        L_0x00b7:
            r3.put(r5, r6)
            r3.put(r13, r14)
            r3.put(r15, r2)
            r3.put(r7, r8)
            r3.put(r9, r10)
            r3.put(r11, r12)
            r0.add(r3)
            boolean r2 = r1.moveToNext()
            if (r2 != 0) goto L_0x00d3
            goto L_0x00d6
        L_0x00d3:
            r2 = r16
            goto L_0x0064
        L_0x00d6:
            if (r1 == 0) goto L_0x00db
            r1.close()
        L_0x00db:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.a.z():java.util.ArrayList");
    }
}
