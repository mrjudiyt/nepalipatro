package io.flutter.plugins.firebase.crashlytics;

import androidx.annotation.Keep;

@Keep
public class FirebaseCrashlyticsTestCrash extends RuntimeException {
    FirebaseCrashlyticsTestCrash() {
        super("This is a test crash caused by calling .crash() in Dart.");
    }
}
