package io.flutter.plugins;

import androidx.annotation.Keep;
import b2.m;
import b8.a;
import c8.c0;
import f8.h;
import g8.e;
import h8.f;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import io.flutter.plugins.firebase.dynamiclinks.FlutterFirebaseDynamicLinksPlugin;
import io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigPlugin;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;
import io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin;
import io.flutter.plugins.googlesignin.GoogleSignInPlugin;
import io.flutter.plugins.inapppurchase.InAppPurchasePlugin;
import io.flutter.plugins.pathprovider.PathProviderPlugin;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin;
import io.flutter.plugins.urllauncher.UrlLauncherPlugin;
import io.flutter.plugins.webviewflutter.WebViewFlutterPlugin;
import n3.b;
import r7.c;

@Keep
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(FlutterEngine flutterEngine) {
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new a());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin async_preferences, com.svprdga.async_preferences.AsyncPreferencesPlugin", e10);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new com.ryanheise.audioservice.a());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin audio_service, com.ryanheise.audioservice.AudioServicePlugin", e11);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new c());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin audio_session, com.ryanheise.audio_session.AudioSessionPlugin", e12);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new f());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin connectivity_plus, dev.fluttercommunity.plus.connectivity.ConnectivityPlugin", e13);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new i8.a());
        } catch (Exception e14) {
            Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e14);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new e3.a());
        } catch (Exception e15) {
            Log.e(TAG, "Error registering plugin facebook_audience_network, com.dsi.facebook_audience_network.FacebookAudienceNetworkPlugin", e15);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new FlutterFirebaseAnalyticsPlugin());
        } catch (Exception e16) {
            Log.e(TAG, "Error registering plugin firebase_analytics, io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin", e16);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new FlutterFirebaseCorePlugin());
        } catch (Exception e17) {
            Log.e(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e17);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new FlutterFirebaseCrashlyticsPlugin());
        } catch (Exception e18) {
            Log.e(TAG, "Error registering plugin firebase_crashlytics, io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin", e18);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new FlutterFirebaseDynamicLinksPlugin());
        } catch (Exception e19) {
            Log.e(TAG, "Error registering plugin firebase_dynamic_links, io.flutter.plugins.firebase.dynamiclinks.FlutterFirebaseDynamicLinksPlugin", e19);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new FlutterFirebaseMessagingPlugin());
        } catch (Exception e20) {
            Log.e(TAG, "Error registering plugin firebase_messaging, io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin", e20);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new FirebaseRemoteConfigPlugin());
        } catch (Exception e21) {
            Log.e(TAG, "Error registering plugin firebase_remote_config, io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigPlugin", e21);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new b());
        } catch (Exception e22) {
            Log.e(TAG, "Error registering plugin flutter_custom_tabs, com.github.droibit.flutter.plugins.customtabs.CustomTabsPlugin", e22);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new q7.a());
        } catch (Exception e23) {
            Log.e(TAG, "Error registering plugin flutter_isolate, com.rmawatson.flutterisolate.FlutterIsolatePlugin", e23);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new m7.a());
        } catch (Exception e24) {
            Log.e(TAG, "Error registering plugin flutter_keyboard_visibility, com.jrai.flutter_keyboard_visibility.FlutterKeyboardVisibilityPlugin", e24);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new ha.b());
        } catch (Exception e25) {
            Log.e(TAG, "Error registering plugin flutter_login_facebook, ru.innim.flutter_login_facebook.FlutterLoginFacebookPlugin", e25);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new u7.c());
        } catch (Exception e26) {
            Log.e(TAG, "Error registering plugin flutter_statusbarcolor_ns, com.sameer.flutterstatusbarcolor.flutterstatusbarcolor.FlutterStatusbarcolorPlugin", e26);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new h());
        } catch (Exception e27) {
            Log.e(TAG, "Error registering plugin flutter_tts, com.tundralabs.fluttertts.FlutterTtsPlugin", e27);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new m8.a());
        } catch (Exception e28) {
            Log.e(TAG, "Error registering plugin fluttertoast, io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin", e28);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new GoogleMobileAdsPlugin());
        } catch (Exception e29) {
            Log.e(TAG, "Error registering plugin google_mobile_ads, io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin", e29);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new GoogleSignInPlugin());
        } catch (Exception e30) {
            Log.e(TAG, "Error registering plugin google_sign_in_android, io.flutter.plugins.googlesignin.GoogleSignInPlugin", e30);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new InAppPurchasePlugin());
        } catch (Exception e31) {
            Log.e(TAG, "Error registering plugin in_app_purchase_android, io.flutter.plugins.inapppurchase.InAppPurchasePlugin", e31);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new e());
        } catch (Exception e32) {
            Log.e(TAG, "Error registering plugin in_app_update, de.ffuf.in_app_update.InAppUpdatePlugin", e32);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new t7.f());
        } catch (Exception e33) {
            Log.e(TAG, "Error registering plugin just_audio, com.ryanheise.just_audio.JustAudioPlugin", e33);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new l7.a());
        } catch (Exception e34) {
            Log.e(TAG, "Error registering plugin launch_review, com.iyaffle.launchreview.LaunchReviewPlugin", e34);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new j8.a());
        } catch (Exception e35) {
            Log.e(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e35);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new PathProviderPlugin());
        } catch (Exception e36) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e36);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new m());
        } catch (Exception e37) {
            Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e37);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new k8.c());
        } catch (Exception e38) {
            Log.e(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e38);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new SharedPreferencesPlugin());
        } catch (Exception e39) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e39);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new y1.a());
        } catch (Exception e40) {
            Log.e(TAG, "Error registering plugin sign_in_with_apple, com.aboutyou.dart_packages.sign_in_with_apple.SignInWithApplePlugin", e40);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new c0());
        } catch (Exception e41) {
            Log.e(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e41);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new UrlLauncherPlugin());
        } catch (Exception e42) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e42);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new WebViewFlutterPlugin());
        } catch (Exception e43) {
            Log.e(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e43);
        }
    }
}
