package y9;

import android.content.Context;
import com.facebook.internal.security.CertificateUtil;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.helpers.b;
import np.com.nepalipatro.models.EventModel;

/* compiled from: UserEventsHelper.kt */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private u9.a f17494a;

    /* renamed from: b  reason: collision with root package name */
    private Context f17495b;

    /* compiled from: UserEventsHelper.kt */
    public static final class a implements Comparator<EventModel> {
        a() {
        }

        /* renamed from: a */
        public int compare(EventModel eventModel, EventModel eventModel2) {
            m.f(eventModel, "obj1");
            m.f(eventModel2, "obj2");
            String valueOf = String.valueOf(eventModel.getStartDate());
            String startDate = eventModel2.getStartDate();
            m.c(startDate);
            return valueOf.compareTo(startDate);
        }
    }

    public e(u9.a aVar, Context context) {
        m.f(aVar, "dbHelper");
        m.f(context, "context");
        this.f17494a = aVar;
        this.f17495b = context;
    }

    private final ArrayList<EventModel> a(Map<String, String> map, Calendar calendar, Calendar calendar2, String str, String str2, int i10, String str3, String str4, ArrayList<EventModel> arrayList, String str5, Calendar calendar3) {
        Map<String, String> map2 = map;
        ArrayList<EventModel> arrayList2 = arrayList;
        String str6 = str5;
        String str7 = map2.get("days");
        String valueOf = String.valueOf(map2.get("id"));
        String valueOf2 = String.valueOf(map2.get("note"));
        String str8 = map2.get("time");
        Date date = null;
        List c02 = str8 != null ? q.c0(str8, new String[]{CertificateUtil.DELIMITER}, false, 0, 6, (Object) null) : null;
        if ((str7 != null ? Integer.parseInt(str7) : 0) >= 0) {
            Calendar instance = Calendar.getInstance();
            instance.setTime(calendar.getTime());
            Integer valueOf3 = str7 != null ? Integer.valueOf(Integer.parseInt(str7)) : null;
            m.c(valueOf3);
            instance.add(5, -valueOf3.intValue());
            String str9 = c02 != null ? (String) c02.get(0) : null;
            m.c(str9);
            instance.set(11, Integer.parseInt(str9));
            String str10 = c02 != null ? (String) c02.get(1) : null;
            m.c(str10);
            instance.set(12, Integer.parseInt(str10));
            Date time = instance.getTime();
            if (calendar2 != null) {
                date = calendar2.getTime();
            }
            if (!time.before(date)) {
                HashMap hashMap = new HashMap();
                String str11 = (String) hashMap.put("id", str6 == null ? "" : str6);
                String str12 = (String) hashMap.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, valueOf2);
                b bVar = b.f15915a;
                m.e(instance, "reminderEvent");
                String str13 = (String) hashMap.put(FirebaseAnalytics.Param.START_DATE, bVar.i(instance, bVar.e()));
                String str14 = (String) hashMap.put("description", str);
                String str15 = (String) hashMap.put("calendar_id", str2);
                String str16 = (String) hashMap.put("im", String.valueOf(i10));
                String str17 = (String) hashMap.put("rrule", str3.toString());
                String str18 = (String) hashMap.put("event_id", str6);
                String str19 = str4;
                String str20 = (String) hashMap.put("recurringEndDate", str19);
                m.e(instance, "reminderEvent");
                EventModel eventModel = new EventModel(str5, valueOf2, bVar.i(instance, bVar.e()), str, str2, Integer.valueOf(i10), str3, str19, EventModel.EventType.Reminder, valueOf);
                if (calendar3.getTime().before(instance.getTime())) {
                    ArrayList arrayList3 = new ArrayList();
                    for (T next : arrayList) {
                        if (m.a(((EventModel) next).getReminderid(), valueOf)) {
                            arrayList3.add(next);
                        }
                    }
                    if (arrayList3.size() == 0) {
                        arrayList2.add(eventModel);
                    }
                }
            }
        }
        return arrayList2;
    }

    private final List<EventModel> c(List<EventModel> list) {
        new ArrayList();
        Collections.sort(list, new a());
        return list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v61, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v33, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v34, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v64, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v35, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v65, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v66, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v36, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v37, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v104, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v38, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v39, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v40, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v66, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v79, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v67, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v41, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v80, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v81, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v43, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0424, code lost:
        if (r1 == null) goto L_0x042a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x069a, code lost:
        if (r1 == null) goto L_0x069f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x079f, code lost:
        if (r1 == null) goto L_0x07aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:?, code lost:
        r0 = java.util.Calendar.getInstance();
        r0.setTime(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0910, code lost:
        r6 = r32;
        r3 = r38;
        r4 = r60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:?, code lost:
        r8 = (java.lang.String) r3.put(r4, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x091c, code lost:
        r8 = r57;
        r9 = r62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:?, code lost:
        r10 = (java.lang.String) r3.put(r9, r8);
        r10 = np.com.nepalipatro.helpers.b.f15915a;
        kotlin.jvm.internal.m.e(r0, "calendar");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0935, code lost:
        r7 = r63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:?, code lost:
        r15 = (java.lang.String) r3.put(r7, r10.i(r0, r10.e()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x093d, code lost:
        r15 = r44;
        r11 = r64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:?, code lost:
        r16 = (java.lang.String) r3.put(r11, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0947, code lost:
        r12 = r19;
        r14 = r65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:?, code lost:
        r16 = (java.lang.String) r3.put(r14, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0951, code lost:
        r25 = r1;
        r60 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:?, code lost:
        r1 = (java.lang.String) r3.put("im", java.lang.String.valueOf(r37));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0965, code lost:
        r4 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:?, code lost:
        r1 = (java.lang.String) r3.put(r4, r34.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x096f, code lost:
        r61 = r5;
        r5 = r45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:?, code lost:
        r1 = (java.lang.String) r3.put("recurringEndDate", r5);
        kotlin.jvm.internal.m.e(r0, "calendar");
        r27 = new np.com.nepalipatro.models.EventModel(r6, r8, r10.i(r0, r10.e()), r15, r12, java.lang.Integer.valueOf(r37), r34, r5, (np.com.nepalipatro.models.EventModel.EventType) null, (java.lang.String) null, 768, (kotlin.jvm.internal.g) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x09ad, code lost:
        if (r0.getTimeInMillis() <= java.lang.System.currentTimeMillis()) goto L_0x09b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x09af, code lost:
        r2.add(r27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x09b2, code lost:
        r40 = r4;
        r26 = r9;
        r19 = r60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x09ba, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x09bc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x09bd, code lost:
        r61 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x09bf, code lost:
        r40 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x09c2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x09c3, code lost:
        r61 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x09c5, code lost:
        r26 = r9;
        r19 = r60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x09cd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x09ce, code lost:
        r25 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x09d0, code lost:
        r61 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x09d3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x09d4, code lost:
        r25 = r1;
        r61 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x09d9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x09da, code lost:
        r25 = r1;
        r61 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x09df, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x09e0, code lost:
        r25 = r1;
        r61 = r5;
        r7 = r63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x09e6, code lost:
        r11 = r64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x09e8, code lost:
        r14 = r65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x09ea, code lost:
        r19 = r4;
        r26 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x09f0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x09f1, code lost:
        r25 = r1;
        r61 = r5;
        r7 = r63;
        r11 = r64;
        r14 = r65;
        r19 = r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0340 A[SYNTHETIC, Splitter:B:126:0x0340] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x037d A[Catch:{ Exception -> 0x0383 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0404 A[SYNTHETIC, Splitter:B:154:0x0404] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x05e7 A[SYNTHETIC, Splitter:B:196:0x05e7] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0684 A[SYNTHETIC, Splitter:B:219:0x0684] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x068a A[SYNTHETIC, Splitter:B:223:0x068a] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x078b  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0848  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0856 A[Catch:{ Exception -> 0x0ab5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0a4e  */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0be4 A[Catch:{ Exception -> 0x0c12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0bee A[Catch:{ Exception -> 0x0c12 }, LOOP:0: B:21:0x0101->B:444:0x0bee, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:456:0x0c2b  */
    /* JADX WARNING: Removed duplicated region for block: B:458:0x0bed A[EDGE_INSN: B:458:0x0bed->B:443:0x0bed ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<np.com.nepalipatro.models.EventModel> b(java.lang.String r69) {
        /*
            r68 = this;
            r13 = r68
            r0 = r69
            java.lang.String r14 = "1"
            java.lang.String r15 = "rrule"
            java.lang.String r12 = "calendar_id"
            java.lang.String r11 = "description"
            java.lang.String r10 = "start_date"
            java.lang.String r9 = "title"
            java.lang.String r8 = "id"
            java.lang.String r1 = "userId"
            kotlin.jvm.internal.m.f(r0, r1)
            java.util.Calendar r7 = java.util.Calendar.getInstance()
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            np.com.nepalipatro.helpers.b r2 = np.com.nepalipatro.helpers.b.f15915a
            java.lang.String r6 = "today"
            kotlin.jvm.internal.m.e(r7, r6)
            java.lang.String r3 = r2.e()
            java.lang.String r3 = r2.i(r7, r3)
            r5 = 11
            r4 = 0
            r1.set(r5, r4)
            r5 = 12
            r1.set(r5, r4)
            r5 = 13
            r1.set(r5, r4)
            r5 = 14
            r1.set(r5, r4)
            java.lang.String r5 = "todayDateOnly"
            kotlin.jvm.internal.m.e(r1, r5)
            java.lang.String r5 = r2.e()
            java.lang.String r1 = r2.i(r1, r5)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            r19 = r2
            android.content.Context r2 = r13.f17495b
            kotlin.jvm.internal.m.c(r2)
            java.util.List r2 = com.google.firebase.FirebaseApp.getApps(r2)
            boolean r2 = r2.isEmpty()
            r20 = r6
            java.lang.String r6 = "true"
            r21 = r7
            java.lang.String r7 = "getInstance()"
            if (r2 != 0) goto L_0x00a9
            com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings$Builder r2 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings$Builder
            r2.<init>()
            com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings r2 = r2.build()
            r22 = r14
            java.lang.String r14 = "Builder().build()"
            kotlin.jvm.internal.m.e(r2, r14)
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r14 = com.google.firebase.remoteconfig.FirebaseRemoteConfig.getInstance()
            kotlin.jvm.internal.m.e(r14, r7)
            r14.setConfigSettingsAsync(r2)
            r2 = 2132017163(0x7f14000b, float:1.9672597E38)
            r14.setDefaultsAsync((int) r2)
            java.lang.String r2 = "NOTIFY_EVENT_WHEN_UNMARKED"
            java.lang.String r2 = r14.getString(r2)
            java.lang.String r14 = "remoteConfig.getString(\"…IFY_EVENT_WHEN_UNMARKED\")"
            kotlin.jvm.internal.m.e(r2, r14)
            goto L_0x00ac
        L_0x00a9:
            r22 = r14
            r2 = r6
        L_0x00ac:
            boolean r2 = r2.equals(r6)
            java.lang.String r14 = ""
            if (r2 == 0) goto L_0x00b6
            r2 = r14
            goto L_0x00b8
        L_0x00b6:
            java.lang.String r2 = "AND CalendarDb.display = 1"
        L_0x00b8:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0c20 }
            r6.<init>()     // Catch:{ Exception -> 0x0c20 }
            r23 = r7
            java.lang.String r7 = "SELECT EventsDb.* FROM EventsDb INNER JOIN CalendarDb WHERE EventsDb.calendar_id = CalendarDb.calendar_id "
            r6.append(r7)     // Catch:{ Exception -> 0x0c20 }
            r6.append(r2)     // Catch:{ Exception -> 0x0c20 }
            java.lang.String r2 = "  AND (EventsDb.start_date>=? OR (EventsDb.start_date >= ? AND EventsDb.is_full_day_event = 1)  OR (EventsDb.rrule IS NOT NULL AND TRIM(EventsDb.rrule,' ') != ''  AND (EventsDb.recurring_end_date IS NOT NULL AND EventsDb.recurring_end_date>=?))) AND EventsDb.created_by=? AND EventsDb.status=1 ORDER BY EventsDb.start_date ASC"
            r6.append(r2)     // Catch:{ Exception -> 0x0c20 }
            java.lang.String r2 = r6.toString()     // Catch:{ Exception -> 0x0c20 }
            u9.a r6 = r13.f17494a     // Catch:{ Exception -> 0x0c20 }
            if (r6 == 0) goto L_0x00f1
            android.database.sqlite.SQLiteDatabase r6 = r6.m()     // Catch:{ Exception -> 0x0c20 }
            if (r6 == 0) goto L_0x00f1
            r7 = 4
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ Exception -> 0x0c20 }
            r18 = 0
            r7[r18] = r3     // Catch:{ Exception -> 0x0c20 }
            r26 = 1
            r7[r26] = r1     // Catch:{ Exception -> 0x0c20 }
            r1 = 2
            r7[r1] = r3     // Catch:{ Exception -> 0x0c20 }
            r1 = 3
            r7[r1] = r0     // Catch:{ Exception -> 0x0c20 }
            android.database.Cursor r0 = r6.rawQuery(r2, r7)     // Catch:{ Exception -> 0x0c20 }
            r7 = r0
            goto L_0x00f2
        L_0x00f1:
            r7 = 0
        L_0x00f2:
            if (r7 == 0) goto L_0x00f7
            r7.getCount()     // Catch:{ Exception -> 0x0c20 }
        L_0x00f7:
            if (r7 == 0) goto L_0x0c06
            boolean r0 = r7.moveToFirst()     // Catch:{ Exception -> 0x0c20 }
            if (r0 == 0) goto L_0x0c06
            r2 = r19
        L_0x0101:
            r4.clear()     // Catch:{ Exception -> 0x0bbf }
            r5.clear()     // Catch:{ Exception -> 0x0bbf }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x0bbf }
            r0.<init>()     // Catch:{ Exception -> 0x0bbf }
            int r1 = r7.getColumnIndexOrThrow(r8)     // Catch:{ Exception -> 0x0bbf }
            java.lang.String r1 = r7.getString(r1)     // Catch:{ Exception -> 0x0bbf }
            if (r1 != 0) goto L_0x0118
            r6 = r14
            goto L_0x0119
        L_0x0118:
            r6 = r1
        L_0x0119:
            int r1 = r7.getColumnIndexOrThrow(r9)     // Catch:{ Exception -> 0x0bbf }
            java.lang.String r1 = r7.getString(r1)     // Catch:{ Exception -> 0x0bbf }
            if (r1 != 0) goto L_0x0125
            r3 = r14
            goto L_0x0126
        L_0x0125:
            r3 = r1
        L_0x0126:
            int r1 = r7.getColumnIndexOrThrow(r10)     // Catch:{ Exception -> 0x0bbf }
            java.lang.String r1 = r7.getString(r1)     // Catch:{ Exception -> 0x0bbf }
            if (r1 != 0) goto L_0x0131
            r1 = r14
        L_0x0131:
            r69 = r2
            int r2 = r7.getColumnIndexOrThrow(r11)     // Catch:{ Exception -> 0x0ba1 }
            java.lang.String r2 = r7.getString(r2)     // Catch:{ Exception -> 0x0ba1 }
            if (r2 != 0) goto L_0x013e
            r2 = r14
        L_0x013e:
            r19 = r2
            int r2 = r7.getColumnIndexOrThrow(r12)     // Catch:{ Exception -> 0x0ba1 }
            java.lang.String r2 = r7.getString(r2)     // Catch:{ Exception -> 0x0ba1 }
            if (r2 != 0) goto L_0x014d
            r27 = r14
            goto L_0x014f
        L_0x014d:
            r27 = r2
        L_0x014f:
            np.com.nepalipatro.helpers.l$a r2 = np.com.nepalipatro.helpers.l.f16129a     // Catch:{ Exception -> 0x0ba1 }
            r28 = r3
            java.lang.String r3 = "9E4mk3Woz7tN8Ic9LRZYG5ipy7971B62egK199a0d+c="
            r29 = r5
            int r5 = r7.getColumnIndexOrThrow(r15)     // Catch:{ Exception -> 0x0b8e }
            java.lang.String r5 = r7.getString(r5)     // Catch:{ Exception -> 0x0b8e }
            if (r5 != 0) goto L_0x0162
            r5 = r14
        L_0x0162:
            java.lang.String r5 = r2.a(r3, r5)     // Catch:{ Exception -> 0x0b8e }
            java.lang.String r2 = "recurring_end_date"
            int r2 = r7.getColumnIndexOrThrow(r2)     // Catch:{ Exception -> 0x0b8e }
            java.lang.String r2 = r7.getString(r2)     // Catch:{ Exception -> 0x0b8e }
            if (r2 != 0) goto L_0x0174
            r3 = r14
            goto L_0x0175
        L_0x0174:
            r3 = r2
        L_0x0175:
            java.lang.String r2 = "important_event"
            int r2 = r7.getColumnIndexOrThrow(r2)     // Catch:{ Exception -> 0x0b8e }
            int r37 = r7.getInt(r2)     // Catch:{ Exception -> 0x0b8e }
            java.lang.String r2 = "based_on"
            int r2 = r7.getColumnIndexOrThrow(r2)     // Catch:{ Exception -> 0x0b8e }
            java.lang.String r2 = r7.getString(r2)     // Catch:{ Exception -> 0x0b8e }
            if (r2 != 0) goto L_0x01a4
            java.lang.String r2 = "AD"
            goto L_0x01a4
        L_0x018e:
            r0 = move-exception
            r2 = r69
            r18 = r4
            r24 = r7
            r19 = r8
            r26 = r9
            r7 = r10
            r42 = r14
            r40 = r15
            r61 = r22
            r25 = r29
            goto L_0x0bd3
        L_0x01a4:
            r30 = r3
            java.lang.String r3 = "has_reminder"
            int r3 = r7.getColumnIndexOrThrow(r3)     // Catch:{ Exception -> 0x0b8e }
            int r3 = r7.getInt(r3)     // Catch:{ Exception -> 0x0b8e }
            r31 = r8
            java.lang.String r8 = "is_full_day_event"
            int r8 = r7.getColumnIndexOrThrow(r8)     // Catch:{ Exception -> 0x0b7b }
            java.lang.String r8 = r7.getString(r8)     // Catch:{ Exception -> 0x0b7b }
            if (r8 != 0) goto L_0x01d7
            java.lang.String r8 = "0"
            goto L_0x01d7
        L_0x01c1:
            r0 = move-exception
            r2 = r69
            r18 = r4
            r24 = r7
            r26 = r9
            r7 = r10
            r42 = r14
            r40 = r15
            r61 = r22
            r25 = r29
            r19 = r31
            goto L_0x0bd3
        L_0x01d7:
            r32 = r7
            np.com.nepalipatro.helpers.b r7 = np.com.nepalipatro.helpers.b.f15915a     // Catch:{ Exception -> 0x0b68 }
            r33 = r9
            java.lang.String r9 = r7.e()     // Catch:{ Exception -> 0x0b55 }
            java.util.Calendar r9 = r7.f(r1, r9)     // Catch:{ Exception -> 0x0b55 }
            r7 = r22
            boolean r22 = kotlin.jvm.internal.m.a(r8, r7)     // Catch:{ Exception -> 0x0b38 }
            r40 = r15
            java.lang.String r15 = ":"
            r38 = r0
            java.lang.String r0 = "06:00"
            if (r22 == 0) goto L_0x02d8
            r22 = r7
            np.com.nepalipatro.helpers.k$a r7 = np.com.nepalipatro.helpers.k.f16077a     // Catch:{ Exception -> 0x02c4 }
            r34 = r8
            android.content.Context r8 = r13.f17495b     // Catch:{ Exception -> 0x02c4 }
            kotlin.jvm.internal.m.c(r8)     // Catch:{ Exception -> 0x02c4 }
            r35 = r10
            java.lang.String r10 = r7.p()     // Catch:{ Exception -> 0x02af }
            java.lang.String r7 = r7.w(r8, r10, r0)     // Catch:{ Exception -> 0x02af }
            kotlin.jvm.internal.m.c(r7)     // Catch:{ Exception -> 0x02af }
            g9.f r8 = new g9.f     // Catch:{ Exception -> 0x02af }
            r8.<init>((java.lang.String) r15)     // Catch:{ Exception -> 0x02af }
            r10 = 0
            java.util.List r7 = r8.c(r7, r10)     // Catch:{ Exception -> 0x02af }
            boolean r8 = r7.isEmpty()     // Catch:{ Exception -> 0x02af }
            if (r8 != 0) goto L_0x0247
            int r8 = r7.size()     // Catch:{ Exception -> 0x02af }
            java.util.ListIterator r8 = r7.listIterator(r8)     // Catch:{ Exception -> 0x02af }
        L_0x0225:
            boolean r10 = r8.hasPrevious()     // Catch:{ Exception -> 0x02af }
            if (r10 == 0) goto L_0x0247
            java.lang.Object r10 = r8.previous()     // Catch:{ Exception -> 0x02af }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x02af }
            int r10 = r10.length()     // Catch:{ Exception -> 0x02af }
            if (r10 != 0) goto L_0x0239
            r10 = 1
            goto L_0x023a
        L_0x0239:
            r10 = 0
        L_0x023a:
            if (r10 != 0) goto L_0x0225
            int r8 = r8.nextIndex()     // Catch:{ Exception -> 0x02af }
            r10 = 1
            int r8 = r8 + r10
            java.util.List r7 = p8.x.P(r7, r8)     // Catch:{ Exception -> 0x02af }
            goto L_0x024b
        L_0x0247:
            java.util.List r7 = p8.p.e()     // Catch:{ Exception -> 0x02af }
        L_0x024b:
            r8 = 0
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ Exception -> 0x02af }
            java.lang.Object[] r7 = r7.toArray(r10)     // Catch:{ Exception -> 0x02af }
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ Exception -> 0x02af }
            r10 = r7[r8]     // Catch:{ Exception -> 0x02af }
            int r8 = java.lang.Integer.parseInt(r10)     // Catch:{ Exception -> 0x02af }
            r10 = 11
            r9.set(r10, r8)     // Catch:{ Exception -> 0x02af }
            r8 = 1
            r10 = r7[r8]     // Catch:{ Exception -> 0x02af }
            int r8 = java.lang.Integer.parseInt(r10)     // Catch:{ Exception -> 0x02af }
            r10 = 12
            r9.set(r10, r8)     // Catch:{ Exception -> 0x02af }
            np.com.nepalipatro.helpers.b r8 = np.com.nepalipatro.helpers.b.f15915a     // Catch:{ Exception -> 0x02af }
            java.lang.String r10 = r8.e()     // Catch:{ Exception -> 0x02af }
            java.util.Calendar r1 = r8.f(r1, r10)     // Catch:{ Exception -> 0x02af }
            r10 = 0
            r36 = r7[r10]     // Catch:{ Exception -> 0x02af }
            int r10 = java.lang.Integer.parseInt(r36)     // Catch:{ Exception -> 0x02af }
            r36 = r11
            r11 = 11
            r1.set(r11, r10)     // Catch:{ Exception -> 0x0298 }
            r10 = 1
            r7 = r7[r10]     // Catch:{ Exception -> 0x0298 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x0298 }
            r10 = 12
            r1.set(r10, r7)     // Catch:{ Exception -> 0x0298 }
            java.lang.String r7 = r8.e()     // Catch:{ Exception -> 0x0298 }
            java.lang.String r1 = r8.i(r1, r7)     // Catch:{ Exception -> 0x0298 }
            goto L_0x02e0
        L_0x0298:
            r0 = move-exception
            r2 = r69
            r18 = r4
            r42 = r14
            r61 = r22
            r25 = r29
            r19 = r31
            r24 = r32
            r26 = r33
            r7 = r35
            r11 = r36
            goto L_0x0bd3
        L_0x02af:
            r0 = move-exception
            r2 = r69
            r18 = r4
            r42 = r14
            r61 = r22
            r25 = r29
            r19 = r31
            r24 = r32
            r26 = r33
            r7 = r35
            goto L_0x0bd3
        L_0x02c4:
            r0 = move-exception
            r2 = r69
            r18 = r4
            r7 = r10
            r42 = r14
            r61 = r22
            r25 = r29
            r19 = r31
            r24 = r32
            r26 = r33
            goto L_0x0bd3
        L_0x02d8:
            r22 = r7
            r34 = r8
            r35 = r10
            r36 = r11
        L_0x02e0:
            r11 = r1
            r7 = r21
            boolean r1 = r7.after(r9)     // Catch:{ Exception -> 0x0b1a }
            np.com.nepalipatro.helpers.b r8 = np.com.nepalipatro.helpers.b.f15915a     // Catch:{ Exception -> 0x0b1a }
            r10 = r20
            kotlin.jvm.internal.m.e(r7, r10)     // Catch:{ Exception -> 0x0b14 }
            java.lang.Boolean r8 = r8.m(r9, r7)     // Catch:{ Exception -> 0x0b14 }
            r20 = r10
            java.lang.String r10 = "SELECT exception_date FROM EventsExcDb WHERE event_id=?"
            r21 = r12
            u9.a r12 = r13.f17494a     // Catch:{ Exception -> 0x0af8 }
            if (r12 == 0) goto L_0x0337
            android.database.sqlite.SQLiteDatabase r12 = r12.m()     // Catch:{ Exception -> 0x0314 }
            if (r12 == 0) goto L_0x0337
            r41 = r0
            r39 = r15
            r15 = 1
            java.lang.String[] r0 = new java.lang.String[r15]     // Catch:{ Exception -> 0x0314 }
            r18 = 0
            r0[r18] = r6     // Catch:{ Exception -> 0x0312 }
            android.database.Cursor r0 = r12.rawQuery(r10, r0)     // Catch:{ Exception -> 0x0312 }
            goto L_0x033e
        L_0x0312:
            r0 = move-exception
            goto L_0x0317
        L_0x0314:
            r0 = move-exception
            r18 = 0
        L_0x0317:
            r2 = r69
            r18 = r4
            r42 = r14
        L_0x031d:
            r14 = r21
            r61 = r22
            r21 = r23
            r25 = r29
            r19 = r31
            r24 = r32
            r26 = r33
            r11 = r36
            r23 = 0
            r43 = 2
            r22 = r7
            r7 = r35
            goto L_0x0bdc
        L_0x0337:
            r41 = r0
            r39 = r15
            r18 = 0
            r0 = 0
        L_0x033e:
            if (r0 == 0) goto L_0x0378
            boolean r10 = r0.moveToFirst()     // Catch:{ Exception -> 0x0370 }
            if (r10 == 0) goto L_0x0378
        L_0x0346:
            java.lang.String r10 = "exception_date"
            int r10 = r0.getColumnIndexOrThrow(r10)     // Catch:{ Exception -> 0x0370 }
            java.lang.String r10 = r0.getString(r10)     // Catch:{ Exception -> 0x0370 }
            np.com.nepalipatro.helpers.b r12 = np.com.nepalipatro.helpers.b.f15915a     // Catch:{ Exception -> 0x0370 }
            java.lang.String r15 = r12.e()     // Catch:{ Exception -> 0x0370 }
            r42 = r14
            r14 = 0
            java.util.Calendar r10 = r12.g(r10, r15, r14)     // Catch:{ Exception -> 0x0383 }
            if (r10 == 0) goto L_0x0366
            java.util.Date r10 = r10.getTime()     // Catch:{ Exception -> 0x0383 }
            r4.add(r10)     // Catch:{ Exception -> 0x0383 }
        L_0x0366:
            boolean r10 = r0.moveToNext()     // Catch:{ Exception -> 0x0383 }
            if (r10 != 0) goto L_0x036d
            goto L_0x037b
        L_0x036d:
            r14 = r42
            goto L_0x0346
        L_0x0370:
            r0 = move-exception
            r42 = r14
        L_0x0373:
            r2 = r69
            r18 = r4
            goto L_0x031d
        L_0x0378:
            r42 = r14
            r14 = 0
        L_0x037b:
            if (r0 == 0) goto L_0x03a4
            r0.close()     // Catch:{ Exception -> 0x0383 }
            o8.q r0 = o8.q.f16189a     // Catch:{ Exception -> 0x0383 }
            goto L_0x03a4
        L_0x0383:
            r0 = move-exception
            r2 = r69
            r18 = r4
            r61 = r22
            r25 = r29
            r19 = r31
            r24 = r32
            r26 = r33
            r11 = r36
            r43 = 2
            r22 = r7
            r7 = r35
            r67 = r23
            r23 = r14
            r14 = r21
            r21 = r67
            goto L_0x0bdc
        L_0x03a4:
            np.com.nepalipatro.helpers.b r0 = np.com.nepalipatro.helpers.b.f15915a     // Catch:{ Exception -> 0x0ad9 }
            java.lang.String r10 = r0.e()     // Catch:{ Exception -> 0x0ad9 }
            java.util.Calendar r0 = r0.f(r11, r10)     // Catch:{ Exception -> 0x0ad9 }
            java.util.Calendar r15 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x0ad9 }
            r10 = 1
            int r44 = r7.get(r10)     // Catch:{ Exception -> 0x0ad9 }
            r10 = 2
            int r45 = r7.get(r10)     // Catch:{ Exception -> 0x0ad9 }
            r10 = 5
            int r46 = r7.get(r10)     // Catch:{ Exception -> 0x0ad9 }
            r47 = 0
            r48 = 0
            r49 = 0
            r43 = r15
            r43.set(r44, r45, r46, r47, r48, r49)     // Catch:{ Exception -> 0x0ad9 }
            java.util.Calendar r12 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x0ad9 }
            r14 = 1
            int r51 = r7.get(r14)     // Catch:{ Exception -> 0x0ad5 }
            r14 = 2
            int r52 = r7.get(r14)     // Catch:{ Exception -> 0x0ad5 }
            int r53 = r7.get(r10)     // Catch:{ Exception -> 0x0ad5 }
            r54 = 23
            r55 = 59
            r56 = 0
            r50 = r12
            r50.set(r51, r52, r53, r54, r55, r56)     // Catch:{ Exception -> 0x0ad5 }
            r14 = 30
            r12.add(r10, r14)     // Catch:{ Exception -> 0x0ad5 }
            r14 = 23
            r10 = 11
            r12.set(r10, r14)     // Catch:{ Exception -> 0x0ad5 }
            r14 = 59
            r10 = 12
            r12.set(r10, r14)     // Catch:{ Exception -> 0x0ad5 }
            java.lang.String r14 = "remindersLists.get(i)"
            r17 = r12
            java.lang.String r12 = "from"
            if (r1 != 0) goto L_0x057b
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x055a }
            boolean r1 = kotlin.jvm.internal.m.a(r8, r1)     // Catch:{ Exception -> 0x055a }
            if (r1 != 0) goto L_0x057b
            int r1 = r5.length()     // Catch:{ Exception -> 0x055a }
            if (r1 <= 0) goto L_0x0414
            r1 = 1
            goto L_0x0415
        L_0x0414:
            r1 = 0
        L_0x0415:
            if (r1 == 0) goto L_0x0419
            goto L_0x057b
        L_0x0419:
            r8 = 1
            if (r3 != r8) goto L_0x0525
            u9.a r1 = r13.f17494a     // Catch:{ Exception -> 0x055a }
            if (r1 == 0) goto L_0x042a
            java.util.ArrayList r1 = r1.D(r6)     // Catch:{ Exception -> 0x0427 }
            if (r1 != 0) goto L_0x042f
            goto L_0x042a
        L_0x0427:
            r0 = move-exception
            goto L_0x0373
        L_0x042a:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x055a }
            r1.<init>()     // Catch:{ Exception -> 0x055a }
        L_0x042f:
            r9 = r1
            int r3 = r9.size()     // Catch:{ Exception -> 0x055a }
            r26 = r69
            r2 = 0
        L_0x0437:
            if (r2 >= r3) goto L_0x04ee
            java.lang.Object r1 = r9.get(r2)     // Catch:{ Exception -> 0x04db }
            kotlin.jvm.internal.m.e(r1, r14)     // Catch:{ Exception -> 0x04db }
            r43 = r1
            java.util.Map r43 = (java.util.Map) r43     // Catch:{ Exception -> 0x04db }
            kotlin.jvm.internal.m.e(r15, r12)     // Catch:{ Exception -> 0x04db }
            r1 = r68
            r44 = r19
            r19 = r27
            r27 = r2
            r2 = r43
            r57 = r28
            r45 = r30
            r28 = r3
            r3 = r0
            r18 = r4
            r4 = r7
            r16 = r5
            r10 = r29
            r5 = r44
            r29 = r6
            r6 = r19
            r25 = r14
            r8 = r22
            r58 = r23
            r24 = r32
            r14 = 2
            r23 = 0
            r22 = r7
            r7 = r37
            r61 = r8
            r60 = r31
            r59 = r34
            r8 = r16
            r30 = r9
            r62 = r33
            r9 = r45
            r14 = r10
            r63 = r35
            r10 = r26
            r31 = r0
            r0 = r11
            r64 = r36
            r11 = r29
            r47 = r17
            r65 = r21
            r17 = r0
            r0 = r12
            r12 = r15
            java.util.ArrayList r26 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x04d4 }
            int r2 = r27 + 1
            r12 = r0
            r5 = r16
            r11 = r17
            r4 = r18
            r27 = r19
            r7 = r22
            r32 = r24
            r3 = r28
            r6 = r29
            r9 = r30
            r0 = r31
            r19 = r44
            r30 = r45
            r17 = r47
            r28 = r57
            r23 = r58
            r34 = r59
            r31 = r60
            r22 = r61
            r33 = r62
            r35 = r63
            r36 = r64
            r21 = r65
            r8 = 1
            r10 = 12
            r18 = 0
            r29 = r14
            r14 = r25
            goto L_0x0437
        L_0x04d4:
            r0 = move-exception
            r25 = r14
            r2 = r26
            goto L_0x0670
        L_0x04db:
            r0 = move-exception
            r18 = r4
            r61 = r22
            r58 = r23
            r24 = r32
            r23 = 0
            r22 = r7
            r14 = r21
            r2 = r26
            goto L_0x056b
        L_0x04ee:
            r18 = r4
            r47 = r17
            r44 = r19
            r65 = r21
            r61 = r22
            r58 = r23
            r19 = r27
            r57 = r28
            r14 = r29
            r45 = r30
            r60 = r31
            r24 = r32
            r62 = r33
            r59 = r34
            r63 = r35
            r64 = r36
            r23 = 0
            r22 = r7
            r17 = r11
            r34 = r5
            r32 = r6
            r66 = r12
            r25 = r14
            r2 = r26
            r21 = r58
            r14 = 1
            r43 = 2
            goto L_0x0850
        L_0x0525:
            r18 = r4
            r47 = r17
            r44 = r19
            r65 = r21
            r61 = r22
            r58 = r23
            r19 = r27
            r57 = r28
            r14 = r29
            r45 = r30
            r60 = r31
            r24 = r32
            r62 = r33
            r59 = r34
            r63 = r35
            r64 = r36
            r23 = 0
            r22 = r7
            r17 = r11
            r34 = r5
            r32 = r6
            r66 = r12
            r25 = r14
            r21 = r58
            r14 = 1
            r43 = 2
            goto L_0x084e
        L_0x055a:
            r0 = move-exception
            r18 = r4
            r61 = r22
            r58 = r23
            r24 = r32
            r23 = 0
            r22 = r7
            r2 = r69
            r14 = r21
        L_0x056b:
            r25 = r29
            r19 = r31
            r26 = r33
            r7 = r35
            r11 = r36
            r21 = r58
        L_0x0577:
            r43 = 2
            goto L_0x0bdc
        L_0x057b:
            r18 = r4
            r16 = r5
            r0 = r12
            r25 = r14
            r47 = r17
            r44 = r19
            r65 = r21
            r61 = r22
            r58 = r23
            r19 = r27
            r57 = r28
            r14 = r29
            r45 = r30
            r60 = r31
            r24 = r32
            r62 = r33
            r59 = r34
            r63 = r35
            r64 = r36
            r23 = 0
            r29 = r6
            r22 = r7
            r17 = r11
            y9.d r1 = new y9.d     // Catch:{ Exception -> 0x0ac2 }
            android.content.Context r4 = r13.f17495b     // Catch:{ Exception -> 0x0ac2 }
            java.util.Date r33 = r9.getTime()     // Catch:{ Exception -> 0x0ac2 }
            kotlin.jvm.internal.m.c(r33)     // Catch:{ Exception -> 0x0ac2 }
            java.util.Date r34 = r15.getTime()     // Catch:{ Exception -> 0x0ac2 }
            kotlin.jvm.internal.m.c(r34)     // Catch:{ Exception -> 0x0ac2 }
            java.util.Date r35 = r47.getTime()     // Catch:{ Exception -> 0x0ac2 }
            kotlin.jvm.internal.m.c(r35)     // Catch:{ Exception -> 0x0ac2 }
            y9.d$a r5 = y9.d.C     // Catch:{ Exception -> 0x0ac2 }
            y9.a r36 = r5.a(r2)     // Catch:{ Exception -> 0x0ac2 }
            r30 = r1
            r31 = r4
            r32 = r16
            r30.<init>(r31, r32, r33, r34, r35, r36)     // Catch:{ Exception -> 0x0ac2 }
            java.util.List r1 = r1.n()     // Catch:{ Exception -> 0x0ac2 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.List<java.util.Date>"
            kotlin.jvm.internal.m.d(r1, r2)     // Catch:{ Exception -> 0x0ac2 }
            r14.addAll(r1)     // Catch:{ Exception -> 0x0ac2 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x0ac2 }
            r1.<init>()     // Catch:{ Exception -> 0x0ac2 }
            int r2 = r18.size()     // Catch:{ Exception -> 0x0ac2 }
            if (r2 <= 0) goto L_0x067e
            java.util.Iterator r2 = r18.iterator()     // Catch:{ Exception -> 0x066b }
        L_0x05eb:
            boolean r4 = r2.hasNext()     // Catch:{ Exception -> 0x066b }
            if (r4 == 0) goto L_0x067e
            java.lang.Object r4 = r2.next()     // Catch:{ Exception -> 0x066b }
            java.lang.String r5 = "eventExceptionDates"
            kotlin.jvm.internal.m.e(r4, r5)     // Catch:{ Exception -> 0x066b }
            java.util.Date r4 = (java.util.Date) r4     // Catch:{ Exception -> 0x066b }
            java.util.Calendar r5 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x066b }
            r5.setTime(r4)     // Catch:{ Exception -> 0x066b }
            r4 = 5
            int r6 = r5.get(r4)     // Catch:{ Exception -> 0x066b }
            r4 = 2
            int r7 = r5.get(r4)     // Catch:{ Exception -> 0x066b }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x066b }
            r12 = 1
            int r5 = r5.get(r12)     // Catch:{ Exception -> 0x066b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x066b }
            java.util.Iterator r7 = r14.iterator()     // Catch:{ Exception -> 0x066b }
        L_0x061e:
            boolean r8 = r7.hasNext()     // Catch:{ Exception -> 0x066b }
            if (r8 == 0) goto L_0x05eb
            java.lang.Object r8 = r7.next()     // Catch:{ Exception -> 0x066b }
            java.lang.String r10 = "eventsLists"
            kotlin.jvm.internal.m.e(r8, r10)     // Catch:{ Exception -> 0x066b }
            java.util.Date r8 = (java.util.Date) r8     // Catch:{ Exception -> 0x066b }
            java.util.Calendar r10 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x066b }
            r10.setTime(r8)     // Catch:{ Exception -> 0x066b }
            r11 = 5
            int r21 = r10.get(r11)     // Catch:{ Exception -> 0x066b }
            java.lang.Integer r21 = java.lang.Integer.valueOf(r21)     // Catch:{ Exception -> 0x066b }
            r12 = 2
            int r26 = r10.get(r12)     // Catch:{ Exception -> 0x066b }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r26)     // Catch:{ Exception -> 0x066b }
            r12 = 1
            int r10 = r10.get(r12)     // Catch:{ Exception -> 0x066b }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x066b }
            if (r21 != 0) goto L_0x0655
        L_0x0653:
            r12 = 1
            goto L_0x061e
        L_0x0655:
            int r12 = r21.intValue()     // Catch:{ Exception -> 0x066b }
            if (r6 != r12) goto L_0x0653
            boolean r11 = kotlin.jvm.internal.m.a(r4, r11)     // Catch:{ Exception -> 0x066b }
            if (r11 == 0) goto L_0x0653
            boolean r10 = kotlin.jvm.internal.m.a(r5, r10)     // Catch:{ Exception -> 0x066b }
            if (r10 == 0) goto L_0x0653
            r1.add(r8)     // Catch:{ Exception -> 0x066b }
            goto L_0x0653
        L_0x066b:
            r0 = move-exception
            r2 = r69
            r25 = r14
        L_0x0670:
            r21 = r58
            r19 = r60
            r26 = r62
            r7 = r63
            r11 = r64
            r14 = r65
            goto L_0x0577
        L_0x067e:
            int r2 = r1.size()     // Catch:{ Exception -> 0x0ac2 }
            if (r2 <= 0) goto L_0x0687
            r14.removeAll(r1)     // Catch:{ Exception -> 0x066b }
        L_0x0687:
            r12 = 1
            if (r3 != r12) goto L_0x077e
            int r1 = r14.size()     // Catch:{ Exception -> 0x0773 }
            if (r1 <= 0) goto L_0x077e
            u9.a r1 = r13.f17494a     // Catch:{ Exception -> 0x0773 }
            if (r1 == 0) goto L_0x069d
            r11 = r29
            java.util.ArrayList r1 = r1.D(r11)     // Catch:{ Exception -> 0x066b }
            if (r1 != 0) goto L_0x06a4
            goto L_0x069f
        L_0x069d:
            r11 = r29
        L_0x069f:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x0773 }
            r1.<init>()     // Catch:{ Exception -> 0x0773 }
        L_0x06a4:
            r10 = r1
            int r9 = r14.size()     // Catch:{ Exception -> 0x0773 }
            r2 = r69
            r8 = 0
        L_0x06ac:
            if (r8 >= r9) goto L_0x0764
            java.lang.Object r1 = r14.get(r8)     // Catch:{ Exception -> 0x0760 }
            java.lang.String r3 = "eventsLists.get(x)"
            kotlin.jvm.internal.m.e(r1, r3)     // Catch:{ Exception -> 0x0760 }
            java.util.Date r1 = (java.util.Date) r1     // Catch:{ Exception -> 0x0760 }
            int r7 = r10.size()     // Catch:{ Exception -> 0x0760 }
            r21 = r2
            r6 = 0
        L_0x06c0:
            if (r6 >= r7) goto L_0x0742
            java.lang.Object r1 = r10.get(r6)     // Catch:{ Exception -> 0x073a }
            r5 = r25
            kotlin.jvm.internal.m.e(r1, r5)     // Catch:{ Exception -> 0x073a }
            r2 = r1
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ Exception -> 0x073a }
            java.util.Calendar r3 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x073a }
            r4 = r58
            kotlin.jvm.internal.m.e(r3, r4)     // Catch:{ Exception -> 0x0725 }
            java.lang.Object r1 = r14.get(r8)     // Catch:{ Exception -> 0x0725 }
            java.util.Date r1 = (java.util.Date) r1     // Catch:{ Exception -> 0x0725 }
            r3.setTime(r1)     // Catch:{ Exception -> 0x0725 }
            kotlin.jvm.internal.m.e(r15, r0)     // Catch:{ Exception -> 0x0725 }
            r1 = r68
            r25 = r14
            r14 = r4
            r4 = r22
            r26 = r0
            r0 = r5
            r5 = r44
            r27 = r6
            r6 = r19
            r28 = r7
            r7 = r37
            r29 = r8
            r8 = r16
            r30 = r9
            r9 = r45
            r31 = r10
            r10 = r21
            r32 = r11
            r58 = r14
            r14 = 1
            r43 = 2
            r12 = r15
            java.util.ArrayList r21 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0723 }
            int r6 = r27 + 1
            r14 = r25
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = 1
            r25 = r0
            r0 = r26
            goto L_0x06c0
        L_0x0723:
            r0 = move-exception
            goto L_0x073f
        L_0x0725:
            r0 = move-exception
            r43 = 2
            r25 = r14
            r2 = r21
            r19 = r60
            r26 = r62
            r7 = r63
            r11 = r64
            r14 = r65
            r21 = r4
            goto L_0x0bdc
        L_0x073a:
            r0 = move-exception
            r43 = 2
            r25 = r14
        L_0x073f:
            r2 = r21
            goto L_0x077a
        L_0x0742:
            r26 = r0
            r29 = r8
            r30 = r9
            r31 = r10
            r32 = r11
            r0 = r25
            r43 = 2
            r25 = r14
            r14 = 1
            int r8 = r29 + 1
            r2 = r21
            r14 = r25
            r12 = 1
            r25 = r0
            r0 = r26
            goto L_0x06ac
        L_0x0760:
            r0 = move-exception
            r43 = 2
            goto L_0x0778
        L_0x0764:
            r25 = r14
            r14 = 1
            r43 = 2
            r66 = r0
            r32 = r11
            r34 = r16
            r21 = r58
            goto L_0x0850
        L_0x0773:
            r0 = move-exception
            r43 = 2
            r2 = r69
        L_0x0778:
            r25 = r14
        L_0x077a:
            r21 = r58
            goto L_0x0ab6
        L_0x077e:
            r26 = r0
            r0 = r25
            r32 = r29
            r43 = 2
            r25 = r14
            r14 = 1
            if (r3 != r14) goto L_0x0848
            r12 = r16
            r11 = r42
            boolean r1 = r12.equals(r11)     // Catch:{ Exception -> 0x083f }
            if (r1 == 0) goto L_0x083a
            u9.a r1 = r13.f17494a     // Catch:{ Exception -> 0x083f }
            if (r1 == 0) goto L_0x07a8
            r10 = r32
            java.util.ArrayList r1 = r1.D(r10)     // Catch:{ Exception -> 0x07a2 }
            if (r1 != 0) goto L_0x07af
            goto L_0x07aa
        L_0x07a2:
            r0 = move-exception
            r2 = r69
            r42 = r11
            goto L_0x077a
        L_0x07a8:
            r10 = r32
        L_0x07aa:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x083f }
            r1.<init>()     // Catch:{ Exception -> 0x083f }
        L_0x07af:
            r8 = r1
            java.util.Date r1 = r9.getTime()     // Catch:{ Exception -> 0x083f }
            java.lang.String r2 = "eventDate.time"
            kotlin.jvm.internal.m.e(r1, r2)     // Catch:{ Exception -> 0x083f }
            int r7 = r8.size()     // Catch:{ Exception -> 0x083f }
            r16 = r69
            r6 = 0
        L_0x07c0:
            if (r6 >= r7) goto L_0x082d
            java.lang.Object r1 = r8.get(r6)     // Catch:{ Exception -> 0x0824 }
            kotlin.jvm.internal.m.e(r1, r0)     // Catch:{ Exception -> 0x0824 }
            r2 = r1
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ Exception -> 0x0824 }
            java.util.Calendar r3 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x0824 }
            r5 = r58
            kotlin.jvm.internal.m.e(r3, r5)     // Catch:{ Exception -> 0x081e }
            java.util.Date r1 = r9.getTime()     // Catch:{ Exception -> 0x081e }
            r3.setTime(r1)     // Catch:{ Exception -> 0x081e }
            r4 = r26
            kotlin.jvm.internal.m.e(r15, r4)     // Catch:{ Exception -> 0x081e }
            r1 = r68
            r66 = r4
            r4 = r22
            r21 = r5
            r5 = r44
            r26 = r6
            r6 = r19
            r27 = r7
            r7 = r37
            r28 = r8
            r8 = r12
            r29 = r9
            r9 = r45
            r32 = r10
            r10 = r16
            r42 = r11
            r11 = r32
            r34 = r12
            r12 = r15
            java.util.ArrayList r16 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x081c }
            int r6 = r26 + 1
            r58 = r21
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r32
            r12 = r34
            r11 = r42
            r26 = r66
            goto L_0x07c0
        L_0x081c:
            r0 = move-exception
            goto L_0x0829
        L_0x081e:
            r0 = move-exception
            r21 = r5
            r42 = r11
            goto L_0x0829
        L_0x0824:
            r0 = move-exception
            r42 = r11
            r21 = r58
        L_0x0829:
            r2 = r16
            goto L_0x0ab6
        L_0x082d:
            r32 = r10
            r42 = r11
            r34 = r12
            r66 = r26
            r21 = r58
            r2 = r16
            goto L_0x0850
        L_0x083a:
            r42 = r11
            r34 = r12
            goto L_0x084a
        L_0x083f:
            r0 = move-exception
            r42 = r11
            r21 = r58
            r2 = r69
            goto L_0x0ab6
        L_0x0848:
            r34 = r16
        L_0x084a:
            r66 = r26
            r21 = r58
        L_0x084e:
            r2 = r69
        L_0x0850:
            int r0 = r25.size()     // Catch:{ Exception -> 0x0ab5 }
            if (r0 <= 0) goto L_0x0a4e
            int r0 = r25.size()     // Catch:{ Exception -> 0x0ab5 }
            r4 = 0
        L_0x085b:
            if (r4 >= r0) goto L_0x0a42
            r1 = r25
            java.lang.Object r3 = r1.get(r4)     // Catch:{ Exception -> 0x0a3d }
            java.lang.String r5 = "eventsLists.get(i)"
            kotlin.jvm.internal.m.e(r3, r5)     // Catch:{ Exception -> 0x0a3d }
            java.util.Date r3 = (java.util.Date) r3     // Catch:{ Exception -> 0x0a3d }
            r8 = r59
            r5 = r61
            boolean r6 = kotlin.jvm.internal.m.a(r8, r5)     // Catch:{ Exception -> 0x0a36 }
            if (r6 == 0) goto L_0x08f6
            java.util.Calendar r6 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x0a36 }
            r6.setTime(r3)     // Catch:{ Exception -> 0x0a36 }
            np.com.nepalipatro.helpers.k$a r3 = np.com.nepalipatro.helpers.k.f16077a     // Catch:{ Exception -> 0x0a36 }
            android.content.Context r7 = r13.f17495b     // Catch:{ Exception -> 0x0a36 }
            kotlin.jvm.internal.m.c(r7)     // Catch:{ Exception -> 0x0a36 }
            java.lang.String r9 = r3.p()     // Catch:{ Exception -> 0x0a36 }
            r10 = r41
            java.lang.String r3 = r3.w(r7, r9, r10)     // Catch:{ Exception -> 0x0a36 }
            kotlin.jvm.internal.m.c(r3)     // Catch:{ Exception -> 0x0a36 }
            g9.f r7 = new g9.f     // Catch:{ Exception -> 0x0a36 }
            r9 = r39
            r7.<init>((java.lang.String) r9)     // Catch:{ Exception -> 0x0a36 }
            r11 = 0
            java.util.List r3 = r7.c(r3, r11)     // Catch:{ Exception -> 0x0a36 }
            boolean r7 = r3.isEmpty()     // Catch:{ Exception -> 0x0a36 }
            if (r7 != 0) goto L_0x08ca
            int r7 = r3.size()     // Catch:{ Exception -> 0x0a36 }
            java.util.ListIterator r7 = r3.listIterator(r7)     // Catch:{ Exception -> 0x0a36 }
        L_0x08a9:
            boolean r12 = r7.hasPrevious()     // Catch:{ Exception -> 0x0a36 }
            if (r12 == 0) goto L_0x08ca
            java.lang.Object r12 = r7.previous()     // Catch:{ Exception -> 0x0a36 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0a36 }
            int r12 = r12.length()     // Catch:{ Exception -> 0x0a36 }
            if (r12 != 0) goto L_0x08bd
            r12 = 1
            goto L_0x08be
        L_0x08bd:
            r12 = 0
        L_0x08be:
            if (r12 != 0) goto L_0x08a9
            int r7 = r7.nextIndex()     // Catch:{ Exception -> 0x0a36 }
            int r7 = r7 + r14
            java.util.List r3 = p8.x.P(r3, r7)     // Catch:{ Exception -> 0x0a36 }
            goto L_0x08ce
        L_0x08ca:
            java.util.List r3 = p8.p.e()     // Catch:{ Exception -> 0x0a36 }
        L_0x08ce:
            java.lang.String[] r7 = new java.lang.String[r11]     // Catch:{ Exception -> 0x0a36 }
            java.lang.Object[] r3 = r3.toArray(r7)     // Catch:{ Exception -> 0x0a36 }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ Exception -> 0x0a36 }
            r7 = r3[r11]     // Catch:{ Exception -> 0x0a36 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x0a36 }
            r12 = 11
            r6.set(r12, r7)     // Catch:{ Exception -> 0x0a36 }
            r3 = r3[r14]     // Catch:{ Exception -> 0x0a36 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x0a36 }
            r7 = 12
            r6.set(r7, r3)     // Catch:{ Exception -> 0x0a36 }
            java.util.Date r3 = r6.getTime()     // Catch:{ Exception -> 0x0a36 }
            java.lang.String r6 = "cal.time"
            kotlin.jvm.internal.m.e(r3, r6)     // Catch:{ Exception -> 0x0a36 }
            goto L_0x08ff
        L_0x08f6:
            r9 = r39
            r10 = r41
            r7 = 12
            r11 = 0
            r12 = 11
        L_0x08ff:
            java.util.Date r6 = r15.getTime()     // Catch:{ Exception -> 0x0a36 }
            boolean r6 = r6.before(r3)     // Catch:{ Exception -> 0x0a36 }
            if (r6 == 0) goto L_0x0a0f
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x09fe }
            r0.setTime(r3)     // Catch:{ Exception -> 0x09fe }
            r6 = r32
            r3 = r38
            r4 = r60
            java.lang.Object r8 = r3.put(r4, r6)     // Catch:{ Exception -> 0x09f0 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x09f0 }
            r8 = r57
            r9 = r62
            java.lang.Object r10 = r3.put(r9, r8)     // Catch:{ Exception -> 0x09df }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x09df }
            np.com.nepalipatro.helpers.b r10 = np.com.nepalipatro.helpers.b.f15915a     // Catch:{ Exception -> 0x09df }
            java.lang.String r15 = "calendar"
            kotlin.jvm.internal.m.e(r0, r15)     // Catch:{ Exception -> 0x09df }
            java.lang.String r15 = r10.e()     // Catch:{ Exception -> 0x09df }
            java.lang.String r15 = r10.i(r0, r15)     // Catch:{ Exception -> 0x09df }
            r7 = r63
            java.lang.Object r15 = r3.put(r7, r15)     // Catch:{ Exception -> 0x09d9 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x09d9 }
            r15 = r44
            r11 = r64
            java.lang.Object r16 = r3.put(r11, r15)     // Catch:{ Exception -> 0x09d3 }
            java.lang.String r16 = (java.lang.String) r16     // Catch:{ Exception -> 0x09d3 }
            r12 = r19
            r14 = r65
            java.lang.Object r16 = r3.put(r14, r12)     // Catch:{ Exception -> 0x09cd }
            java.lang.String r16 = (java.lang.String) r16     // Catch:{ Exception -> 0x09cd }
            r25 = r1
            java.lang.String r1 = "im"
            r60 = r4
            java.lang.String r4 = java.lang.String.valueOf(r37)     // Catch:{ Exception -> 0x09c2 }
            java.lang.Object r1 = r3.put(r1, r4)     // Catch:{ Exception -> 0x09c2 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x09c2 }
            java.lang.String r1 = r34.toString()     // Catch:{ Exception -> 0x09c2 }
            r4 = r40
            java.lang.Object r1 = r3.put(r4, r1)     // Catch:{ Exception -> 0x09bc }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x09bc }
            java.lang.String r1 = "recurringEndDate"
            r61 = r5
            r5 = r45
            java.lang.Object r1 = r3.put(r1, r5)     // Catch:{ Exception -> 0x09ba }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x09ba }
            np.com.nepalipatro.models.EventModel r1 = new np.com.nepalipatro.models.EventModel     // Catch:{ Exception -> 0x09ba }
            java.lang.String r3 = "calendar"
            kotlin.jvm.internal.m.e(r0, r3)     // Catch:{ Exception -> 0x09ba }
            java.lang.String r3 = r10.e()     // Catch:{ Exception -> 0x09ba }
            java.lang.String r30 = r10.i(r0, r3)     // Catch:{ Exception -> 0x09ba }
            java.lang.Integer r33 = java.lang.Integer.valueOf(r37)     // Catch:{ Exception -> 0x09ba }
            r36 = 0
            r37 = 0
            r38 = 768(0x300, float:1.076E-42)
            r39 = 0
            r27 = r1
            r28 = r6
            r29 = r8
            r31 = r15
            r32 = r12
            r35 = r5
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ Exception -> 0x09ba }
            long r5 = r0.getTimeInMillis()     // Catch:{ Exception -> 0x09ba }
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x09ba }
            int r0 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x09b2
            r2.add(r1)     // Catch:{ Exception -> 0x09ba }
        L_0x09b2:
            r40 = r4
            r26 = r9
            r19 = r60
            goto L_0x0be7
        L_0x09ba:
            r0 = move-exception
            goto L_0x09bf
        L_0x09bc:
            r0 = move-exception
            r61 = r5
        L_0x09bf:
            r40 = r4
            goto L_0x09c5
        L_0x09c2:
            r0 = move-exception
            r61 = r5
        L_0x09c5:
            r26 = r9
            r19 = r60
            goto L_0x0bdc
        L_0x09cb:
            r0 = move-exception
            goto L_0x09d0
        L_0x09cd:
            r0 = move-exception
            r25 = r1
        L_0x09d0:
            r61 = r5
            goto L_0x09ea
        L_0x09d3:
            r0 = move-exception
            r25 = r1
            r61 = r5
            goto L_0x09e8
        L_0x09d9:
            r0 = move-exception
            r25 = r1
            r61 = r5
            goto L_0x09e6
        L_0x09df:
            r0 = move-exception
            r25 = r1
            r61 = r5
            r7 = r63
        L_0x09e6:
            r11 = r64
        L_0x09e8:
            r14 = r65
        L_0x09ea:
            r19 = r4
            r26 = r9
            goto L_0x0bdc
        L_0x09f0:
            r0 = move-exception
            r25 = r1
            r61 = r5
            r7 = r63
            r11 = r64
            r14 = r65
            r19 = r4
            goto L_0x0a0b
        L_0x09fe:
            r0 = move-exception
            r25 = r1
            r61 = r5
            r7 = r63
            r11 = r64
            r14 = r65
            r19 = r60
        L_0x0a0b:
            r26 = r62
            goto L_0x0bdc
        L_0x0a0f:
            r25 = r1
            r61 = r5
            r12 = r19
            r6 = r32
            r3 = r38
            r16 = r44
            r5 = r45
            r1 = r57
            r19 = r60
            r26 = r62
            r7 = r63
            r11 = r64
            r14 = r65
            int r4 = r4 + 1
            r59 = r8
            r39 = r9
            r41 = r10
            r14 = 1
            r19 = r12
            goto L_0x085b
        L_0x0a36:
            r0 = move-exception
            r25 = r1
            r61 = r5
            goto L_0x0ab6
        L_0x0a3d:
            r0 = move-exception
            r25 = r1
            goto L_0x0ab6
        L_0x0a42:
            r19 = r60
            r26 = r62
            r7 = r63
            r11 = r64
            r14 = r65
            goto L_0x0be7
        L_0x0a4e:
            r12 = r19
            r6 = r32
            r16 = r44
            r5 = r45
            r1 = r57
            r19 = r60
            r26 = r62
            r7 = r63
            r11 = r64
            r14 = r65
            np.com.nepalipatro.helpers.b r0 = np.com.nepalipatro.helpers.b.f15915a     // Catch:{ Exception -> 0x0ab2 }
            r3 = r66
            kotlin.jvm.internal.m.e(r15, r3)     // Catch:{ Exception -> 0x0ab2 }
            java.lang.String r3 = r0.e()     // Catch:{ Exception -> 0x0ab2 }
            java.lang.String r3 = r0.i(r15, r3)     // Catch:{ Exception -> 0x0ab2 }
            r4 = r17
            int r3 = r4.compareTo(r3)     // Catch:{ Exception -> 0x0ab2 }
            if (r3 < 0) goto L_0x0be7
            java.lang.String r3 = "to"
            r8 = r47
            kotlin.jvm.internal.m.e(r8, r3)     // Catch:{ Exception -> 0x0ab2 }
            java.lang.String r3 = r0.e()     // Catch:{ Exception -> 0x0ab2 }
            java.lang.String r0 = r0.i(r8, r3)     // Catch:{ Exception -> 0x0ab2 }
            int r0 = r4.compareTo(r0)     // Catch:{ Exception -> 0x0ab2 }
            if (r0 > 0) goto L_0x0be7
            np.com.nepalipatro.models.EventModel r0 = new np.com.nepalipatro.models.EventModel     // Catch:{ Exception -> 0x0ab2 }
            java.lang.Integer r33 = java.lang.Integer.valueOf(r37)     // Catch:{ Exception -> 0x0ab2 }
            r36 = 0
            r37 = 0
            r38 = 768(0x300, float:1.076E-42)
            r39 = 0
            r27 = r0
            r28 = r6
            r29 = r1
            r30 = r4
            r31 = r16
            r32 = r12
            r35 = r5
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ Exception -> 0x0ab2 }
            r2.add(r0)     // Catch:{ Exception -> 0x0ab2 }
            goto L_0x0be7
        L_0x0ab2:
            r0 = move-exception
            goto L_0x0bdc
        L_0x0ab5:
            r0 = move-exception
        L_0x0ab6:
            r19 = r60
            r26 = r62
            r7 = r63
            r11 = r64
            r14 = r65
            goto L_0x0bdc
        L_0x0ac2:
            r0 = move-exception
            r25 = r14
            r21 = r58
            r19 = r60
            r26 = r62
            r7 = r63
            r11 = r64
            r14 = r65
            r43 = 2
            goto L_0x0bbc
        L_0x0ad5:
            r0 = move-exception
            r18 = r4
            goto L_0x0afd
        L_0x0ad9:
            r0 = move-exception
            r18 = r4
            r61 = r22
            r25 = r29
            r19 = r31
            r24 = r32
            r26 = r33
            r11 = r36
            r43 = 2
            r22 = r7
            r7 = r35
            r67 = r23
            r23 = r14
            r14 = r21
            r21 = r67
            goto L_0x0bbc
        L_0x0af8:
            r0 = move-exception
            r18 = r4
            r42 = r14
        L_0x0afd:
            r14 = r21
            r61 = r22
            r21 = r23
            r25 = r29
            r19 = r31
            r24 = r32
            r26 = r33
            r11 = r36
            r23 = 0
            r43 = 2
            r22 = r7
            goto L_0x0b34
        L_0x0b14:
            r0 = move-exception
            r18 = r4
            r20 = r10
            goto L_0x0b1d
        L_0x0b1a:
            r0 = move-exception
            r18 = r4
        L_0x0b1d:
            r42 = r14
            r61 = r22
            r21 = r23
            r25 = r29
            r19 = r31
            r24 = r32
            r26 = r33
            r11 = r36
            r23 = 0
            r43 = 2
            r22 = r7
            r14 = r12
        L_0x0b34:
            r7 = r35
            goto L_0x0bbc
        L_0x0b38:
            r0 = move-exception
            r18 = r4
            r61 = r7
            r7 = r10
            r42 = r14
            r40 = r15
            r22 = r21
            r21 = r23
            r25 = r29
            r19 = r31
            r24 = r32
            r26 = r33
            r23 = 0
            r43 = 2
            r14 = r12
            goto L_0x0bbc
        L_0x0b55:
            r0 = move-exception
            r18 = r4
            r7 = r10
            r42 = r14
            r40 = r15
            r61 = r22
            r25 = r29
            r19 = r31
            r24 = r32
            r26 = r33
            goto L_0x0bb3
        L_0x0b68:
            r0 = move-exception
            r18 = r4
            r26 = r9
            r7 = r10
            r42 = r14
            r40 = r15
            r61 = r22
            r25 = r29
            r19 = r31
            r24 = r32
            goto L_0x0bb3
        L_0x0b7b:
            r0 = move-exception
            r18 = r4
            r24 = r7
            r26 = r9
            r7 = r10
            r42 = r14
            r40 = r15
            r61 = r22
            r25 = r29
            r19 = r31
            goto L_0x0bb3
        L_0x0b8e:
            r0 = move-exception
            r18 = r4
            r24 = r7
            r19 = r8
            r26 = r9
            r7 = r10
            r42 = r14
            r40 = r15
            r61 = r22
            r25 = r29
            goto L_0x0bb3
        L_0x0ba1:
            r0 = move-exception
            r18 = r4
            r25 = r5
            r24 = r7
            r19 = r8
            r26 = r9
            r7 = r10
            r42 = r14
            r40 = r15
            r61 = r22
        L_0x0bb3:
            r43 = 2
            r14 = r12
            r22 = r21
            r21 = r23
            r23 = 0
        L_0x0bbc:
            r2 = r69
            goto L_0x0bdc
        L_0x0bbf:
            r0 = move-exception
            r69 = r2
            r18 = r4
            r25 = r5
            r24 = r7
            r19 = r8
            r26 = r9
            r7 = r10
            r42 = r14
            r40 = r15
            r61 = r22
        L_0x0bd3:
            r43 = 2
            r14 = r12
            r22 = r21
            r21 = r23
            r23 = 0
        L_0x0bdc:
            np.com.nepalipatro.helpers.g$a r1 = np.com.nepalipatro.helpers.g.f16048a     // Catch:{ Exception -> 0x0c12 }
            boolean r1 = r1.a()     // Catch:{ Exception -> 0x0c12 }
            if (r1 == 0) goto L_0x0be7
            r0.printStackTrace()     // Catch:{ Exception -> 0x0c12 }
        L_0x0be7:
            boolean r0 = r24.moveToNext()     // Catch:{ Exception -> 0x0c12 }
            if (r0 != 0) goto L_0x0bee
            goto L_0x0c0a
        L_0x0bee:
            r10 = r7
            r12 = r14
            r4 = r18
            r8 = r19
            r23 = r21
            r21 = r22
            r7 = r24
            r5 = r25
            r9 = r26
            r15 = r40
            r14 = r42
            r22 = r61
            goto L_0x0101
        L_0x0c06:
            r24 = r7
            r2 = r19
        L_0x0c0a:
            if (r24 == 0) goto L_0x0c14
            r24.close()     // Catch:{ Exception -> 0x0c12 }
            o8.q r0 = o8.q.f16189a     // Catch:{ Exception -> 0x0c12 }
            goto L_0x0c14
        L_0x0c12:
            r0 = move-exception
            goto L_0x0c23
        L_0x0c14:
            java.util.List r0 = r13.c(r2)     // Catch:{ Exception -> 0x0c12 }
            java.lang.String r1 = "null cannot be cast to non-null type java.util.ArrayList<np.com.nepalipatro.models.EventModel>{ kotlin.collections.TypeAliasesKt.ArrayList<np.com.nepalipatro.models.EventModel> }"
            kotlin.jvm.internal.m.d(r0, r1)     // Catch:{ Exception -> 0x0c12 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x0c12 }
            return r0
        L_0x0c20:
            r0 = move-exception
            r2 = r19
        L_0x0c23:
            np.com.nepalipatro.helpers.g$a r1 = np.com.nepalipatro.helpers.g.f16048a
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0c2e
            r0.printStackTrace()
        L_0x0c2e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.e.b(java.lang.String):java.util.ArrayList");
    }
}
