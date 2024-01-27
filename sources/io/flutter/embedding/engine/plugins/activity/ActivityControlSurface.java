package io.flutter.embedding.engine.plugins.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.h;
import io.flutter.embedding.android.ExclusiveAppComponent;

public interface ActivityControlSurface {
    void attachToActivity(ExclusiveAppComponent<Activity> exclusiveAppComponent, h hVar);

    void detachFromActivity();

    void detachFromActivityForConfigChanges();

    boolean onActivityResult(int i10, int i11, Intent intent);

    void onNewIntent(Intent intent);

    boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);

    void onRestoreInstanceState(Bundle bundle);

    void onSaveInstanceState(Bundle bundle);

    void onUserLeaveHint();
}
