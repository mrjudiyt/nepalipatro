package com.facebook.appevents.aam;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MetadataRule.kt */
public final class MetadataRule {
    public static final Companion Companion = new Companion((g) null);
    private static final String FIELD_K = "k";
    private static final String FIELD_K_DELIMITER = ",";
    private static final String FIELD_V = "v";
    private static final Set<MetadataRule> rules = new CopyOnWriteArraySet();
    private final List<String> keyRules;
    private final String name;
    private final String valRule;

    /* compiled from: MetadataRule.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private final void constructRules(JSONObject jSONObject) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString(MetadataRule.FIELD_K);
                    String optString2 = optJSONObject.optString(MetadataRule.FIELD_V);
                    m.e(optString, MetadataRule.FIELD_K);
                    if (!(optString.length() == 0)) {
                        Set access$getRules$cp = MetadataRule.access$getRules$cp();
                        m.e(next, Constants.KEY);
                        List c02 = q.c0(optString, new String[]{MetadataRule.FIELD_K_DELIMITER}, false, 0, 6, (Object) null);
                        m.e(optString2, MetadataRule.FIELD_V);
                        access$getRules$cp.add(new MetadataRule(next, c02, optString2, (g) null));
                    }
                }
            }
        }

        public final Set<String> getEnabledRuleNames() {
            HashSet hashSet = new HashSet();
            for (MetadataRule name : MetadataRule.access$getRules$cp()) {
                hashSet.add(name.getName());
            }
            return hashSet;
        }

        public final Set<MetadataRule> getRules() {
            return new HashSet(MetadataRule.access$getRules$cp());
        }

        public final void updateRules(String str) {
            m.f(str, "rulesFromServer");
            try {
                MetadataRule.access$getRules$cp().clear();
                constructRules(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }
    }

    private MetadataRule(String str, List<String> list, String str2) {
        this.name = str;
        this.valRule = str2;
        this.keyRules = list;
    }

    public /* synthetic */ MetadataRule(String str, List list, String str2, g gVar) {
        this(str, list, str2);
    }

    public static final /* synthetic */ Set access$getRules$cp() {
        Class<MetadataRule> cls = MetadataRule.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return rules;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final Set<String> getEnabledRuleNames() {
        Class<MetadataRule> cls = MetadataRule.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return Companion.getEnabledRuleNames();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final Set<MetadataRule> getRules() {
        Class<MetadataRule> cls = MetadataRule.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return Companion.getRules();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final void updateRules(String str) {
        Class<MetadataRule> cls = MetadataRule.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Companion.updateRules(str);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public final List<String> getKeyRules() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return new ArrayList(this.keyRules);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final String getName() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.name;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final String getValRule() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.valRule;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
