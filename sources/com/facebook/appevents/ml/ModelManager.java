package com.facebook.appevents.ml;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.internal.FileDownloadTask;
import com.facebook.appevents.suggestedevents.SuggestedEventsManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import d9.f;
import g3.a;
import g3.b;
import g3.c;
import g3.d;
import g3.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p8.c0;

/* compiled from: ModelManager.kt */
public final class ModelManager {
    private static final String ASSET_URI_KEY = "asset_uri";
    private static final String CACHE_KEY_MODELS = "models";
    private static final String CACHE_KEY_REQUEST_TIMESTAMP = "model_request_timestamp";
    public static final ModelManager INSTANCE = new ModelManager();
    private static final String MODEL_ASSERT_STORE = "com.facebook.internal.MODEL_STORE";
    public static final int MODEL_REQUEST_INTERVAL_MILLISECONDS = 259200000;
    private static final List<String> MTML_INTEGRITY_DETECT_PREDICTION = p.g("none", IntegrityManager.INTEGRITY_TYPE_ADDRESS, IntegrityManager.INTEGRITY_TYPE_HEALTH);
    private static final List<String> MTML_SUGGESTED_EVENTS_PREDICTION = p.g("other", AppEventsConstants.EVENT_NAME_COMPLETED_REGISTRATION, AppEventsConstants.EVENT_NAME_ADDED_TO_CART, AppEventsConstants.EVENT_NAME_PURCHASED, AppEventsConstants.EVENT_NAME_INITIATED_CHECKOUT);
    private static final String MTML_USE_CASE = "MTML";
    private static final String RULES_URI_KEY = "rules_uri";
    private static final String THRESHOLD_KEY = "thresholds";
    private static final String USE_CASE_KEY = "use_case";
    private static final String VERSION_ID_KEY = "version_id";
    private static final Map<String, TaskHandler> taskHandlers = new ConcurrentHashMap();

    /* compiled from: ModelManager.kt */
    public enum Task {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* compiled from: ModelManager.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                int[] iArr = new int[Task.values().length];
                iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final String toKey() {
            int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return "integrity_detect";
            }
            if (i10 == 2) {
                return "app_event_pred";
            }
            throw new NoWhenBranchMatchedException();
        }

        public final String toUseCase() {
            int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i10 == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: ModelManager.kt */
    public static final class TaskHandler {
        public static final Companion Companion = new Companion((g) null);
        private String assetUri;
        private Model model;
        /* access modifiers changed from: private */
        public Runnable onPostExecute;
        private File ruleFile;
        private String ruleUri;
        private float[] thresholds;
        private String useCase;
        private int versionId;

        /* compiled from: ModelManager.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            private final void deleteOldFiles(String str, int i10) {
                File[] listFiles;
                Utils utils = Utils.INSTANCE;
                File mlDir = Utils.getMlDir();
                if (mlDir != null && (listFiles = mlDir.listFiles()) != null) {
                    if (!(listFiles.length == 0)) {
                        String str2 = str + '_' + i10;
                        int length = listFiles.length;
                        int i11 = 0;
                        while (i11 < length) {
                            File file = listFiles[i11];
                            i11++;
                            String name = file.getName();
                            m.e(name, "name");
                            if (p.v(name, str, false, 2, (Object) null) && !p.v(name, str2, false, 2, (Object) null)) {
                                file.delete();
                            }
                        }
                    }
                }
            }

            private final void download(String str, String str2, FileDownloadTask.Callback callback) {
                Utils utils = Utils.INSTANCE;
                File file = new File(Utils.getMlDir(), str2);
                if (str == null || file.exists()) {
                    callback.onComplete(file);
                } else {
                    new FileDownloadTask(str, file, callback).execute(new String[0]);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: execute$lambda-1  reason: not valid java name */
            public static final void m67execute$lambda1(List list, File file) {
                m.f(list, "$slaves");
                m.f(file, "file");
                Model build = Model.Companion.build(file);
                if (build != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        TaskHandler taskHandler = (TaskHandler) it.next();
                        TaskHandler.Companion.download(taskHandler.getRuleUri(), taskHandler.getUseCase() + '_' + taskHandler.getVersionId() + "_rule", new d(taskHandler, build));
                    }
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: execute$lambda-1$lambda-0  reason: not valid java name */
            public static final void m68execute$lambda1$lambda0(TaskHandler taskHandler, Model model, File file) {
                m.f(taskHandler, "$slave");
                m.f(file, "file");
                taskHandler.setModel(model);
                taskHandler.setRuleFile(file);
                Runnable access$getOnPostExecute$p = taskHandler.onPostExecute;
                if (access$getOnPostExecute$p != null) {
                    access$getOnPostExecute$p.run();
                }
            }

            public final TaskHandler build(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String string = jSONObject.getString(ModelManager.USE_CASE_KEY);
                    String string2 = jSONObject.getString(ModelManager.ASSET_URI_KEY);
                    String optString = jSONObject.optString(ModelManager.RULES_URI_KEY, (String) null);
                    int i10 = jSONObject.getInt(ModelManager.VERSION_ID_KEY);
                    float[] access$parseJsonArray = ModelManager.access$parseJsonArray(ModelManager.INSTANCE, jSONObject.getJSONArray(ModelManager.THRESHOLD_KEY));
                    m.e(string, "useCase");
                    m.e(string2, "assetUri");
                    return new TaskHandler(string, string2, optString, i10, access$parseJsonArray);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final void execute(TaskHandler taskHandler) {
                m.f(taskHandler, "handler");
                execute(taskHandler, o.b(taskHandler));
            }

            public final void execute(TaskHandler taskHandler, List<TaskHandler> list) {
                m.f(taskHandler, "master");
                m.f(list, "slaves");
                deleteOldFiles(taskHandler.getUseCase(), taskHandler.getVersionId());
                download(taskHandler.getAssetUri(), taskHandler.getUseCase() + '_' + taskHandler.getVersionId(), new e(list));
            }
        }

        public TaskHandler(String str, String str2, String str3, int i10, float[] fArr) {
            m.f(str, "useCase");
            m.f(str2, "assetUri");
            this.useCase = str;
            this.assetUri = str2;
            this.ruleUri = str3;
            this.versionId = i10;
            this.thresholds = fArr;
        }

        public final String getAssetUri() {
            return this.assetUri;
        }

        public final Model getModel() {
            return this.model;
        }

        public final File getRuleFile() {
            return this.ruleFile;
        }

        public final String getRuleUri() {
            return this.ruleUri;
        }

        public final float[] getThresholds() {
            return this.thresholds;
        }

        public final String getUseCase() {
            return this.useCase;
        }

        public final int getVersionId() {
            return this.versionId;
        }

        public final void setAssetUri(String str) {
            m.f(str, "<set-?>");
            this.assetUri = str;
        }

        public final void setModel(Model model2) {
            this.model = model2;
        }

        public final TaskHandler setOnPostExecute(Runnable runnable) {
            this.onPostExecute = runnable;
            return this;
        }

        public final void setRuleFile(File file) {
            this.ruleFile = file;
        }

        public final void setRuleUri(String str) {
            this.ruleUri = str;
        }

        public final void setThresholds(float[] fArr) {
            this.thresholds = fArr;
        }

        public final void setUseCase(String str) {
            m.f(str, "<set-?>");
            this.useCase = str;
        }

        public final void setVersionId(int i10) {
            this.versionId = i10;
        }
    }

    /* compiled from: ModelManager.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Task.values().length];
            iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ModelManager() {
    }

    public static final /* synthetic */ float[] access$parseJsonArray(ModelManager modelManager, JSONArray jSONArray) {
        Class<ModelManager> cls = ModelManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return modelManager.parseJsonArray(jSONArray);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private final void addModels(JSONObject jSONObject) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        TaskHandler build = TaskHandler.Companion.build(jSONObject.getJSONObject(keys.next()));
                        if (build != null) {
                            taskHandlers.put(build.getUseCase(), build);
                        }
                    } catch (JSONException unused) {
                        return;
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public static final void enable() {
        Class<ModelManager> cls = ModelManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Utility utility = Utility.INSTANCE;
                Utility.runOnNonUiThread(c.f14677h);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[Catch:{ Exception -> 0x0081, all -> 0x007d }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d A[Catch:{ Exception -> 0x0081, all -> 0x007d }] */
    /* renamed from: enable$lambda-0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m64enable$lambda0() {
        /*
            java.lang.String r0 = "model_request_timestamp"
            java.lang.String r1 = "models"
            java.lang.Class<com.facebook.appevents.ml.ModelManager> r2 = com.facebook.appevents.ml.ModelManager.class
            boolean r3 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r2)
            if (r3 == 0) goto L_0x000d
            return
        L_0x000d:
            com.facebook.FacebookSdk r3 = com.facebook.FacebookSdk.INSTANCE     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            android.content.Context r3 = com.facebook.FacebookSdk.getApplicationContext()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            java.lang.String r4 = "com.facebook.internal.MODEL_STORE"
            r5 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r5)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r4 = 0
            java.lang.String r4 = r3.getString(r1, r4)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            if (r4 == 0) goto L_0x0031
            int r6 = r4.length()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            if (r6 != 0) goto L_0x0028
            r5 = 1
        L_0x0028:
            if (r5 == 0) goto L_0x002b
            goto L_0x0031
        L_0x002b:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            goto L_0x0036
        L_0x0031:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r5.<init>()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
        L_0x0036:
            r6 = 0
            long r6 = r3.getLong(r0, r6)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            com.facebook.internal.FeatureManager r4 = com.facebook.internal.FeatureManager.INSTANCE     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            com.facebook.internal.FeatureManager$Feature r4 = com.facebook.internal.FeatureManager.Feature.ModelRequest     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            boolean r4 = com.facebook.internal.FeatureManager.isEnabled(r4)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            if (r4 == 0) goto L_0x0054
            int r4 = r5.length()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            if (r4 == 0) goto L_0x0054
            com.facebook.appevents.ml.ModelManager r4 = INSTANCE     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            boolean r4 = r4.isValidTimestamp(r6)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            if (r4 != 0) goto L_0x0074
        L_0x0054:
            com.facebook.appevents.ml.ModelManager r4 = INSTANCE     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            org.json.JSONObject r5 = r4.fetchModels()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            if (r5 != 0) goto L_0x005d
            return
        L_0x005d:
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            android.content.SharedPreferences$Editor r1 = r3.putString(r1, r4)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r3)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r0.apply()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
        L_0x0074:
            com.facebook.appevents.ml.ModelManager r0 = INSTANCE     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r0.addModels(r5)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r0.enableMTML()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            goto L_0x0081
        L_0x007d:
            r0 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r0, r2)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.ml.ModelManager.m64enable$lambda0():void");
    }

    private final void enableMTML() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                ArrayList arrayList = new ArrayList();
                String str = null;
                int i10 = 0;
                for (Map.Entry next : taskHandlers.entrySet()) {
                    String str2 = (String) next.getKey();
                    TaskHandler taskHandler = (TaskHandler) next.getValue();
                    if (m.a(str2, Task.MTML_APP_EVENT_PREDICTION.toUseCase())) {
                        String assetUri = taskHandler.getAssetUri();
                        int max = Math.max(i10, taskHandler.getVersionId());
                        FeatureManager featureManager = FeatureManager.INSTANCE;
                        if (FeatureManager.isEnabled(FeatureManager.Feature.SuggestedEvents) && isLocaleEnglish()) {
                            arrayList.add(taskHandler.setOnPostExecute(a.f14675h));
                        }
                        str = assetUri;
                        i10 = max;
                    }
                    if (m.a(str2, Task.MTML_INTEGRITY_DETECT.toUseCase())) {
                        str = taskHandler.getAssetUri();
                        i10 = Math.max(i10, taskHandler.getVersionId());
                        FeatureManager featureManager2 = FeatureManager.INSTANCE;
                        if (FeatureManager.isEnabled(FeatureManager.Feature.IntelligentIntegrity)) {
                            arrayList.add(taskHandler.setOnPostExecute(b.f14676h));
                        }
                    }
                }
                if (str != null && i10 > 0 && !arrayList.isEmpty()) {
                    TaskHandler.Companion.execute(new TaskHandler(MTML_USE_CASE, str, (String) null, i10, (float[]) null), arrayList);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: enableMTML$lambda-1  reason: not valid java name */
    public static final void m65enableMTML$lambda1() {
        Class<ModelManager> cls = ModelManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                SuggestedEventsManager suggestedEventsManager = SuggestedEventsManager.INSTANCE;
                SuggestedEventsManager.enable();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: enableMTML$lambda-2  reason: not valid java name */
    public static final void m66enableMTML$lambda2() {
        Class<ModelManager> cls = ModelManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                IntegrityManager integrityManager = IntegrityManager.INSTANCE;
                IntegrityManager.enable();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final JSONObject fetchModels() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            String[] strArr = {USE_CASE_KEY, VERSION_ID_KEY, ASSET_URI_KEY, RULES_URI_KEY, THRESHOLD_KEY};
            Bundle bundle = new Bundle();
            bundle.putString(GraphRequest.FIELDS_PARAM, TextUtils.join(",", strArr));
            GraphRequest newGraphPathRequest = GraphRequest.Companion.newGraphPathRequest((AccessToken) null, "app/model_asset", (GraphRequest.Callback) null);
            newGraphPathRequest.setParameters(bundle);
            JSONObject jSONObject = newGraphPathRequest.executeAndWait().getJSONObject();
            if (jSONObject == null) {
                return null;
            }
            return parseRawJsonObject(jSONObject);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final File getRuleFile(Task task) {
        Class<ModelManager> cls = ModelManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            m.f(task, "task");
            TaskHandler taskHandler = taskHandlers.get(task.toUseCase());
            if (taskHandler == null) {
                return null;
            }
            return taskHandler.getRuleFile();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private final boolean isLocaleEnglish() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            Utility utility = Utility.INSTANCE;
            Locale resourceLocale = Utility.getResourceLocale();
            if (resourceLocale != null) {
                String language = resourceLocale.getLanguage();
                m.e(language, "locale.language");
                if (q.y(language, "en", false, 2, (Object) null)) {
                    return true;
                }
                return false;
            }
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isValidTimestamp(long j10) {
        if (CrashShieldHandler.isObjectCrashing(this) || j10 == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - j10 < 259200000;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final float[] parseJsonArray(JSONArray jSONArray) {
        if (CrashShieldHandler.isObjectCrashing(this) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            int i10 = 0;
            int length = jSONArray.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    try {
                        String string = jSONArray.getString(i10);
                        m.e(string, "jsonArray.getString(i)");
                        fArr[i10] = Float.parseFloat(string);
                    } catch (JSONException unused) {
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return fArr;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:15|16|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return new org.json.JSONObject();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0064 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final org.json.JSONObject parseRawJsonObject(org.json.JSONObject r13) {
        /*
            r12 = this;
            java.lang.String r0 = "asset_uri"
            java.lang.String r1 = "thresholds"
            java.lang.String r2 = "version_id"
            java.lang.String r3 = "rules_uri"
            java.lang.String r4 = "use_case"
            boolean r5 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r12)
            r6 = 0
            if (r5 == 0) goto L_0x0012
            return r6
        L_0x0012:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x006a }
            r5.<init>()     // Catch:{ all -> 0x006a }
            java.lang.String r7 = "data"
            org.json.JSONArray r13 = r13.getJSONArray(r7)     // Catch:{ JSONException -> 0x0064 }
            r7 = 0
            int r8 = r13.length()     // Catch:{ JSONException -> 0x0064 }
            if (r8 <= 0) goto L_0x0069
        L_0x0024:
            int r9 = r7 + 1
            org.json.JSONObject r7 = r13.getJSONObject(r7)     // Catch:{ JSONException -> 0x0064 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0064 }
            r10.<init>()     // Catch:{ JSONException -> 0x0064 }
            java.lang.String r11 = r7.getString(r2)     // Catch:{ JSONException -> 0x0064 }
            r10.put(r2, r11)     // Catch:{ JSONException -> 0x0064 }
            java.lang.String r11 = r7.getString(r4)     // Catch:{ JSONException -> 0x0064 }
            r10.put(r4, r11)     // Catch:{ JSONException -> 0x0064 }
            org.json.JSONArray r11 = r7.getJSONArray(r1)     // Catch:{ JSONException -> 0x0064 }
            r10.put(r1, r11)     // Catch:{ JSONException -> 0x0064 }
            java.lang.String r11 = r7.getString(r0)     // Catch:{ JSONException -> 0x0064 }
            r10.put(r0, r11)     // Catch:{ JSONException -> 0x0064 }
            boolean r11 = r7.has(r3)     // Catch:{ JSONException -> 0x0064 }
            if (r11 == 0) goto L_0x0058
            java.lang.String r11 = r7.getString(r3)     // Catch:{ JSONException -> 0x0064 }
            r10.put(r3, r11)     // Catch:{ JSONException -> 0x0064 }
        L_0x0058:
            java.lang.String r7 = r7.getString(r4)     // Catch:{ JSONException -> 0x0064 }
            r5.put(r7, r10)     // Catch:{ JSONException -> 0x0064 }
            if (r9 < r8) goto L_0x0062
            goto L_0x0069
        L_0x0062:
            r7 = r9
            goto L_0x0024
        L_0x0064:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x006a }
            r5.<init>()     // Catch:{ all -> 0x006a }
        L_0x0069:
            return r5
        L_0x006a:
            r13 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r13, r12)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.ml.ModelManager.parseRawJsonObject(org.json.JSONObject):org.json.JSONObject");
    }

    public static final String[] predict(Task task, float[][] fArr, String[] strArr) {
        Model model;
        float[][] fArr2 = fArr;
        String[] strArr2 = strArr;
        Class<ModelManager> cls = ModelManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            m.f(task, "task");
            m.f(fArr2, "denses");
            m.f(strArr2, "texts");
            TaskHandler taskHandler = taskHandlers.get(task.toUseCase());
            if (taskHandler == null) {
                model = null;
            } else {
                model = taskHandler.getModel();
            }
            if (model == null) {
                return null;
            }
            float[] thresholds = taskHandler.getThresholds();
            int length = strArr2.length;
            boolean z10 = false;
            int length2 = fArr2[0].length;
            MTensor mTensor = new MTensor(new int[]{length, length2});
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    System.arraycopy(fArr2[i10], 0, mTensor.getData(), i10 * length2, length2);
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            MTensor predictOnMTML = model.predictOnMTML(mTensor, strArr2, task.toKey());
            if (!(predictOnMTML == null || thresholds == null)) {
                if (!(predictOnMTML.getData().length == 0)) {
                    if (thresholds.length == 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        int i12 = WhenMappings.$EnumSwitchMapping$0[task.ordinal()];
                        if (i12 == 1) {
                            return INSTANCE.processSuggestedEventResult(predictOnMTML, thresholds);
                        }
                        if (i12 == 2) {
                            return INSTANCE.processIntegrityDetectionResult(predictOnMTML, thresholds);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private final String[] processIntegrityDetectionResult(MTensor mTensor, float[] fArr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            float[] data = mTensor.getData();
            if (shape2 != fArr.length) {
                return null;
            }
            f i10 = l.i(0, shape);
            ArrayList arrayList = new ArrayList(q.l(i10, 10));
            Iterator it = i10.iterator();
            while (it.hasNext()) {
                int b10 = ((c0) it).b();
                String str = "none";
                int length = fArr.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = i12 + 1;
                    if (data[(b10 * shape2) + i12] >= fArr[i11]) {
                        str = MTML_INTEGRITY_DETECT_PREDICTION.get(i12);
                    }
                    i11++;
                    i12 = i13;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final String[] processSuggestedEventResult(MTensor mTensor, float[] fArr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            float[] data = mTensor.getData();
            if (shape2 != fArr.length) {
                return null;
            }
            f i10 = l.i(0, shape);
            ArrayList arrayList = new ArrayList(q.l(i10, 10));
            Iterator it = i10.iterator();
            while (it.hasNext()) {
                int b10 = ((c0) it).b();
                String str = "other";
                int length = fArr.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = i12 + 1;
                    if (data[(b10 * shape2) + i12] >= fArr[i11]) {
                        str = MTML_SUGGESTED_EVENTS_PREDICTION.get(i12);
                    }
                    i11++;
                    i12 = i13;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
