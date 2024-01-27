package com.facebook.appevents.codeless;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: ViewIndexingTrigger.kt */
public final class ViewIndexingTrigger implements SensorEventListener {
    public static final Companion Companion = new Companion((g) null);
    private static final double SHAKE_THRESHOLD_GRAVITY = 2.3d;
    private OnShakeListener onShakeListener;

    /* compiled from: ViewIndexingTrigger.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* compiled from: ViewIndexingTrigger.kt */
    public interface OnShakeListener {
        void onShake();
    }

    public void onAccuracyChanged(Sensor sensor, int i10) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m.f(sensor, "sensor");
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m.f(sensorEvent, "event");
                OnShakeListener onShakeListener2 = this.onShakeListener;
                if (onShakeListener2 != null) {
                    float[] fArr = sensorEvent.values;
                    float f10 = fArr[0];
                    double d10 = (double) (f10 / 9.80665f);
                    double d11 = (double) (fArr[1] / 9.80665f);
                    double d12 = (double) (fArr[2] / 9.80665f);
                    if (Math.sqrt((d10 * d10) + (d11 * d11) + (d12 * d12)) > SHAKE_THRESHOLD_GRAVITY) {
                        onShakeListener2.onShake();
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void setOnShakeListener(OnShakeListener onShakeListener2) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                this.onShakeListener = onShakeListener2;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
