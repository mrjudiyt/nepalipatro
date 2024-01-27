package com.facebook.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.c;
import com.facebook.CallbackManager;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.NativeProtocol;
import io.flutter.plugins.firebase.analytics.Constants;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.y;
import o8.q;

/* compiled from: DialogPresenter.kt */
public final class DialogPresenter {
    public static final DialogPresenter INSTANCE = new DialogPresenter();

    /* compiled from: DialogPresenter.kt */
    public interface ParameterProvider {
        Bundle getLegacyParameters();

        Bundle getParameters();
    }

    private DialogPresenter() {
    }

    public static final boolean canPresentNativeDialogWithFeature(DialogFeature dialogFeature) {
        m.f(dialogFeature, "feature");
        return getProtocolVersionForNativeDialog(dialogFeature).getProtocolVersion() != -1;
    }

    public static final boolean canPresentWebFallbackDialogWithFeature(DialogFeature dialogFeature) {
        m.f(dialogFeature, "feature");
        return INSTANCE.getDialogWebFallbackUri(dialogFeature) != null;
    }

    private final Uri getDialogWebFallbackUri(DialogFeature dialogFeature) {
        String name = dialogFeature.name();
        String action = dialogFeature.getAction();
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        FetchedAppSettings.DialogFeatureConfig dialogFeatureConfig = FetchedAppSettings.Companion.getDialogFeatureConfig(FacebookSdk.getApplicationId(), action, name);
        if (dialogFeatureConfig != null) {
            return dialogFeatureConfig.getFallbackUrl();
        }
        return null;
    }

    public static final NativeProtocol.ProtocolVersionQueryResult getProtocolVersionForNativeDialog(DialogFeature dialogFeature) {
        m.f(dialogFeature, "feature");
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        String applicationId = FacebookSdk.getApplicationId();
        String action = dialogFeature.getAction();
        int[] versionSpecForFeature = INSTANCE.getVersionSpecForFeature(applicationId, action, dialogFeature);
        NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
        return NativeProtocol.getLatestAvailableProtocolVersionForAction(action, versionSpecForFeature);
    }

    private final int[] getVersionSpecForFeature(String str, String str2, DialogFeature dialogFeature) {
        int[] iArr;
        FetchedAppSettings.DialogFeatureConfig dialogFeatureConfig = FetchedAppSettings.Companion.getDialogFeatureConfig(str, str2, dialogFeature.name());
        if (dialogFeatureConfig == null) {
            iArr = null;
        } else {
            iArr = dialogFeatureConfig.getVersionSpec();
        }
        if (iArr != null) {
            return iArr;
        }
        return new int[]{dialogFeature.getMinVersion()};
    }

    public static final void logDialogActivity(Context context, String str, String str2) {
        m.f(context, "context");
        m.f(str, Constants.EVENT_NAME);
        m.f(str2, "outcome");
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(context);
        Bundle bundle = new Bundle();
        bundle.putString(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME, str2);
        internalAppEventsLogger.logEventImplicitly(str, bundle);
    }

    public static final void present(AppCall appCall, Activity activity) {
        m.f(appCall, "appCall");
        m.f(activity, "activity");
        activity.startActivityForResult(appCall.getRequestIntent(), appCall.getRequestCode());
        appCall.setPending();
    }

    public static final void setupAppCallForCannotShowError(AppCall appCall) {
        m.f(appCall, "appCall");
        setupAppCallForValidationError(appCall, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
    }

    public static final void setupAppCallForCustomTabDialog(AppCall appCall, String str, Bundle bundle) {
        m.f(appCall, "appCall");
        Validate validate = Validate.INSTANCE;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Context applicationContext = FacebookSdk.getApplicationContext();
        CustomTabUtils customTabUtils = CustomTabUtils.INSTANCE;
        Validate.hasCustomTabRedirectActivity(applicationContext, CustomTabUtils.getDefaultRedirectURI());
        Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
        Intent intent = new Intent(FacebookSdk.getApplicationContext(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.EXTRA_ACTION, str);
        intent.putExtra(CustomTabMainActivity.EXTRA_PARAMS, bundle);
        intent.putExtra(CustomTabMainActivity.EXTRA_CHROME_PACKAGE, CustomTabUtils.getChromePackage());
        NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
        NativeProtocol.setupProtocolRequestIntent(intent, appCall.getCallId().toString(), str, NativeProtocol.getLatestKnownVersion(), (Bundle) null);
        appCall.setRequestIntent(intent);
    }

    public static final void setupAppCallForErrorResult(AppCall appCall, FacebookException facebookException) {
        m.f(appCall, "appCall");
        if (facebookException != null) {
            Validate validate = Validate.INSTANCE;
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
            Intent intent = new Intent();
            intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
            intent.setAction(FacebookActivity.PASS_THROUGH_CANCEL_ACTION);
            NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
            NativeProtocol.setupProtocolRequestIntent(intent, appCall.getCallId().toString(), (String) null, NativeProtocol.getLatestKnownVersion(), NativeProtocol.createBundleForException(facebookException));
            appCall.setRequestIntent(intent);
        }
    }

    public static final void setupAppCallForNativeDialog(AppCall appCall, ParameterProvider parameterProvider, DialogFeature dialogFeature) {
        Bundle bundle;
        m.f(appCall, "appCall");
        m.f(parameterProvider, "parameterProvider");
        m.f(dialogFeature, "feature");
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Context applicationContext = FacebookSdk.getApplicationContext();
        String action = dialogFeature.getAction();
        NativeProtocol.ProtocolVersionQueryResult protocolVersionForNativeDialog = getProtocolVersionForNativeDialog(dialogFeature);
        int protocolVersion = protocolVersionForNativeDialog.getProtocolVersion();
        if (protocolVersion != -1) {
            NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
            if (NativeProtocol.isVersionCompatibleWithBucketedIntent(protocolVersion)) {
                bundle = parameterProvider.getParameters();
            } else {
                bundle = parameterProvider.getLegacyParameters();
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Intent createPlatformActivityIntent = NativeProtocol.createPlatformActivityIntent(applicationContext, appCall.getCallId().toString(), action, protocolVersionForNativeDialog, bundle);
            if (createPlatformActivityIntent != null) {
                appCall.setRequestIntent(createPlatformActivityIntent);
                return;
            }
            throw new FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        throw new FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
    }

    public static final void setupAppCallForValidationError(AppCall appCall, FacebookException facebookException) {
        m.f(appCall, "appCall");
        setupAppCallForErrorResult(appCall, facebookException);
    }

    public static final void setupAppCallForWebDialog(AppCall appCall, String str, Bundle bundle) {
        m.f(appCall, "appCall");
        Validate validate = Validate.INSTANCE;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
        Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
        Bundle bundle2 = new Bundle();
        bundle2.putString(NativeProtocol.WEB_DIALOG_ACTION, str);
        bundle2.putBundle(NativeProtocol.WEB_DIALOG_PARAMS, bundle);
        Intent intent = new Intent();
        NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
        NativeProtocol.setupProtocolRequestIntent(intent, appCall.getCallId().toString(), str, NativeProtocol.getLatestKnownVersion(), bundle2);
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(FacebookDialogFragment.TAG);
        appCall.setRequestIntent(intent);
    }

    public static final void setupAppCallForWebFallbackDialog(AppCall appCall, Bundle bundle, DialogFeature dialogFeature) {
        Uri uri;
        m.f(appCall, "appCall");
        m.f(dialogFeature, "feature");
        Validate validate = Validate.INSTANCE;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
        Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
        String name = dialogFeature.name();
        Uri dialogWebFallbackUri = INSTANCE.getDialogWebFallbackUri(dialogFeature);
        if (dialogWebFallbackUri != null) {
            NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
            int latestKnownVersion = NativeProtocol.getLatestKnownVersion();
            ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
            String uuid = appCall.getCallId().toString();
            m.e(uuid, "appCall.callId.toString()");
            Bundle queryParamsForPlatformActivityIntentWebFallback = ServerProtocol.getQueryParamsForPlatformActivityIntentWebFallback(uuid, latestKnownVersion, bundle);
            if (queryParamsForPlatformActivityIntentWebFallback != null) {
                if (dialogWebFallbackUri.isRelative()) {
                    Utility utility = Utility.INSTANCE;
                    uri = Utility.buildUri(ServerProtocol.getDialogAuthority(), dialogWebFallbackUri.toString(), queryParamsForPlatformActivityIntentWebFallback);
                } else {
                    Utility utility2 = Utility.INSTANCE;
                    uri = Utility.buildUri(dialogWebFallbackUri.getAuthority(), dialogWebFallbackUri.getPath(), queryParamsForPlatformActivityIntentWebFallback);
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("url", uri.toString());
                bundle2.putBoolean(NativeProtocol.WEB_DIALOG_IS_FALLBACK, true);
                Intent intent = new Intent();
                NativeProtocol.setupProtocolRequestIntent(intent, appCall.getCallId().toString(), dialogFeature.getAction(), NativeProtocol.getLatestKnownVersion(), bundle2);
                intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
                intent.setAction(FacebookDialogFragment.TAG);
                appCall.setRequestIntent(intent);
                return;
            }
            throw new FacebookException("Unable to fetch the app's key-hash");
        }
        throw new FacebookException("Unable to fetch the Url for the DialogFeature : '" + name + '\'');
    }

    public static final void startActivityForResultWithAndroidX(ActivityResultRegistry activityResultRegistry, CallbackManager callbackManager, Intent intent, int i10) {
        m.f(activityResultRegistry, "registry");
        m.f(intent, "intent");
        y yVar = new y();
        T j10 = activityResultRegistry.j(m.o("facebook-dialog-request-", Integer.valueOf(i10)), new DialogPresenter$startActivityForResultWithAndroidX$1(), new a(callbackManager, i10, yVar));
        yVar.f15575h = j10;
        if (j10 != null) {
            j10.b(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: startActivityForResultWithAndroidX$lambda-2  reason: not valid java name */
    public static final void m89startActivityForResultWithAndroidX$lambda2(CallbackManager callbackManager, int i10, y yVar, Pair pair) {
        m.f(yVar, "$launcher");
        if (callbackManager == null) {
            callbackManager = new CallbackManagerImpl();
        }
        Object obj = pair.first;
        m.e(obj, "result.first");
        callbackManager.onActivityResult(i10, ((Number) obj).intValue(), (Intent) pair.second);
        c cVar = (c) yVar.f15575h;
        if (cVar != null) {
            synchronized (cVar) {
                cVar.d();
                yVar.f15575h = null;
                q qVar = q.f16189a;
            }
        }
    }

    public static final void present(AppCall appCall, FragmentWrapper fragmentWrapper) {
        m.f(appCall, "appCall");
        m.f(fragmentWrapper, "fragmentWrapper");
        fragmentWrapper.startActivityForResult(appCall.getRequestIntent(), appCall.getRequestCode());
        appCall.setPending();
    }

    public static final void present(AppCall appCall, ActivityResultRegistry activityResultRegistry, CallbackManager callbackManager) {
        m.f(appCall, "appCall");
        m.f(activityResultRegistry, "registry");
        Intent requestIntent = appCall.getRequestIntent();
        if (requestIntent != null) {
            startActivityForResultWithAndroidX(activityResultRegistry, callbackManager, requestIntent, appCall.getRequestCode());
            appCall.setPending();
        }
    }
}
