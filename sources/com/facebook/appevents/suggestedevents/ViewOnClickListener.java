package com.facebook.appevents.suggestedevents;

import android.os.Bundle;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import h3.c;
import h3.d;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ViewOnClickListener.kt */
public final class ViewOnClickListener implements View.OnClickListener {
    private static final String API_ENDPOINT = "%s/suggested_events";
    public static final Companion Companion = new Companion((g) null);
    public static final String OTHER_EVENT = "other";
    private static final Set<Integer> viewsAttachedListener = new HashSet();
    private final String activityName;
    private final View.OnClickListener baseListener;
    private final WeakReference<View> hostViewWeakReference;
    private final WeakReference<View> rootViewWeakReference;

    /* compiled from: ViewOnClickListener.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final void processPredictedResult(String str, String str2, float[] fArr) {
            SuggestedEventsManager suggestedEventsManager = SuggestedEventsManager.INSTANCE;
            if (SuggestedEventsManager.isProductionEvents$facebook_core_release(str)) {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                new InternalAppEventsLogger(FacebookSdk.getApplicationContext()).logEventFromSE(str, str2);
            } else if (SuggestedEventsManager.isEligibleEvents$facebook_core_release(str)) {
                sendPredictedResult(str, str2, fArr);
            }
        }

        /* access modifiers changed from: private */
        public final boolean queryHistoryAndProcess(String str, String str2) {
            PredictionHistoryManager predictionHistoryManager = PredictionHistoryManager.INSTANCE;
            String queryEvent = PredictionHistoryManager.queryEvent(str);
            if (queryEvent == null) {
                return false;
            }
            if (m.a(queryEvent, "other")) {
                return true;
            }
            Utility utility = Utility.INSTANCE;
            Utility.runOnNonUiThread(new d(queryEvent, str2));
            return true;
        }

        /* access modifiers changed from: private */
        /* renamed from: queryHistoryAndProcess$lambda-0  reason: not valid java name */
        public static final void m74queryHistoryAndProcess$lambda0(String str, String str2) {
            m.f(str, "$queriedEvent");
            m.f(str2, "$buttonText");
            ViewOnClickListener.Companion.processPredictedResult(str, str2, new float[0]);
        }

        private final void sendPredictedResult(String str, String str2, float[] fArr) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                int length = fArr.length;
                int i10 = 0;
                while (i10 < length) {
                    float f10 = fArr[i10];
                    i10++;
                    sb.append(f10);
                    sb.append(",");
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", str2);
                bundle.putString("metadata", jSONObject.toString());
                GraphRequest.Companion companion = GraphRequest.Companion;
                b0 b0Var = b0.f15559a;
                Locale locale = Locale.US;
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                String format = String.format(locale, ViewOnClickListener.API_ENDPOINT, Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
                m.e(format, "java.lang.String.format(locale, format, *args)");
                GraphRequest newPostRequest = companion.newPostRequest((AccessToken) null, format, (JSONObject) null, (GraphRequest.Callback) null);
                newPostRequest.setParameters(bundle);
                newPostRequest.executeAndWait();
            } catch (JSONException unused) {
            }
        }

        public final void attachListener$facebook_core_release(View view, View view2, String str) {
            m.f(view, "hostView");
            m.f(view2, "rootView");
            m.f(str, "activityName");
            int hashCode = view.hashCode();
            if (!ViewOnClickListener.access$getViewsAttachedListener$cp().contains(Integer.valueOf(hashCode))) {
                ViewHierarchy viewHierarchy = ViewHierarchy.INSTANCE;
                ViewHierarchy.setOnClickListener(view, new ViewOnClickListener(view, view2, str, (g) null));
                ViewOnClickListener.access$getViewsAttachedListener$cp().add(Integer.valueOf(hashCode));
            }
        }
    }

    private ViewOnClickListener(View view, View view2, String str) {
        ViewHierarchy viewHierarchy = ViewHierarchy.INSTANCE;
        this.baseListener = ViewHierarchy.getExistingOnClickListener(view);
        this.rootViewWeakReference = new WeakReference<>(view2);
        this.hostViewWeakReference = new WeakReference<>(view);
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase();
        m.e(lowerCase, "(this as java.lang.String).toLowerCase()");
        this.activityName = p.t(lowerCase, "activity", "", false, 4, (Object) null);
    }

    public /* synthetic */ ViewOnClickListener(View view, View view2, String str, g gVar) {
        this(view, view2, str);
    }

    public static final /* synthetic */ Set access$getViewsAttachedListener$cp() {
        if (CrashShieldHandler.isObjectCrashing(ViewOnClickListener.class)) {
            return null;
        }
        try {
            return viewsAttachedListener;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ViewOnClickListener.class);
            return null;
        }
    }

    public static final void attachListener$facebook_core_release(View view, View view2, String str) {
        if (!CrashShieldHandler.isObjectCrashing(ViewOnClickListener.class)) {
            try {
                Companion.attachListener$facebook_core_release(view, view2, str);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, ViewOnClickListener.class);
            }
        }
    }

    private final void predictAndProcess(String str, String str2, JSONObject jSONObject) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Utility utility = Utility.INSTANCE;
                Utility.runOnNonUiThread(new c(jSONObject, str2, this, str));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: predictAndProcess$lambda-0  reason: not valid java name */
    public static final void m73predictAndProcess$lambda0(JSONObject jSONObject, String str, ViewOnClickListener viewOnClickListener, String str2) {
        if (!CrashShieldHandler.isObjectCrashing(ViewOnClickListener.class)) {
            try {
                m.f(jSONObject, "$viewData");
                m.f(str, "$buttonText");
                m.f(viewOnClickListener, "this$0");
                m.f(str2, "$pathID");
                try {
                    Utility utility = Utility.INSTANCE;
                    FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                    String appName = Utility.getAppName(FacebookSdk.getApplicationContext());
                    if (appName != null) {
                        String lowerCase = appName.toLowerCase();
                        m.e(lowerCase, "(this as java.lang.String).toLowerCase()");
                        FeatureExtractor featureExtractor = FeatureExtractor.INSTANCE;
                        float[] denseFeatures = FeatureExtractor.getDenseFeatures(jSONObject, lowerCase);
                        String textFeature = FeatureExtractor.getTextFeature(str, viewOnClickListener.activityName, lowerCase);
                        if (denseFeatures != null) {
                            ModelManager modelManager = ModelManager.INSTANCE;
                            String[] predict = ModelManager.predict(ModelManager.Task.MTML_APP_EVENT_PREDICTION, new float[][]{denseFeatures}, new String[]{textFeature});
                            if (predict != null) {
                                String str3 = predict[0];
                                PredictionHistoryManager predictionHistoryManager = PredictionHistoryManager.INSTANCE;
                                PredictionHistoryManager.addPrediction(str2, str3);
                                if (!m.a(str3, "other")) {
                                    Companion.processPredictedResult(str3, str, denseFeatures);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, ViewOnClickListener.class);
            }
        }
    }

    private final void process() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                View view = (View) this.rootViewWeakReference.get();
                View view2 = (View) this.hostViewWeakReference.get();
                if (view != null && view2 != null) {
                    try {
                        SuggestedEventViewHierarchy suggestedEventViewHierarchy = SuggestedEventViewHierarchy.INSTANCE;
                        String textOfViewRecursively = SuggestedEventViewHierarchy.getTextOfViewRecursively(view2);
                        PredictionHistoryManager predictionHistoryManager = PredictionHistoryManager.INSTANCE;
                        String pathID = PredictionHistoryManager.getPathID(view2, textOfViewRecursively);
                        if (pathID != null && !Companion.queryHistoryAndProcess(pathID, textOfViewRecursively)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("view", SuggestedEventViewHierarchy.getDictionaryOfView(view, view2));
                            jSONObject.put(ViewHierarchyConstants.SCREEN_NAME_KEY, this.activityName);
                            predictAndProcess(pathID, textOfViewRecursively, jSONObject);
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public void onClick(View view) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m.f(view, "view");
                View.OnClickListener onClickListener = this.baseListener;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                process();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
