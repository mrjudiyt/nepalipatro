package com.facebook.appevents.codeless.internal;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import g9.f;

/* compiled from: SensitiveUserDataUtils.kt */
public final class SensitiveUserDataUtils {
    public static final SensitiveUserDataUtils INSTANCE = new SensitiveUserDataUtils();

    private SensitiveUserDataUtils() {
    }

    private final boolean isCreditCard(TextView textView) {
        int i10;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            ViewHierarchy viewHierarchy = ViewHierarchy.INSTANCE;
            String b10 = new f("\\s").b(ViewHierarchy.getTextOfView(textView), "");
            int length = b10.length();
            if (length < 12) {
                return false;
            }
            if (length > 19) {
                return false;
            }
            int i11 = length - 1;
            if (i11 >= 0) {
                boolean z10 = false;
                i10 = 0;
                while (true) {
                    int i12 = i11 - 1;
                    char charAt = b10.charAt(i11);
                    if (!Character.isDigit(charAt)) {
                        return false;
                    }
                    int d10 = c.d(charAt);
                    if (z10 && (d10 = d10 * 2) > 9) {
                        d10 = (d10 % 10) + 1;
                    }
                    i10 += d10;
                    z10 = !z10;
                    if (i12 < 0) {
                        break;
                    }
                    i11 = i12;
                }
            } else {
                i10 = 0;
            }
            if (i10 % 10 == 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isEmail(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            boolean z10 = true;
            if (textView.getInputType() == 32) {
                return true;
            }
            ViewHierarchy viewHierarchy = ViewHierarchy.INSTANCE;
            String textOfView = ViewHierarchy.getTextOfView(textView);
            if (textOfView == null) {
                return false;
            }
            if (textOfView.length() != 0) {
                z10 = false;
            }
            if (z10) {
                return false;
            }
            return Patterns.EMAIL_ADDRESS.matcher(textOfView).matches();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isPassword(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isPersonName(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 96;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isPhoneNumber(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 3;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isPostalAddress(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 112;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public static final boolean isSensitiveUserData(View view) {
        Class<SensitiveUserDataUtils> cls = SensitiveUserDataUtils.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            SensitiveUserDataUtils sensitiveUserDataUtils = INSTANCE;
            if (sensitiveUserDataUtils.isPassword((TextView) view) || sensitiveUserDataUtils.isCreditCard((TextView) view) || sensitiveUserDataUtils.isPersonName((TextView) view) || sensitiveUserDataUtils.isPostalAddress((TextView) view) || sensitiveUserDataUtils.isPhoneNumber((TextView) view) || sensitiveUserDataUtils.isEmail((TextView) view)) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }
}
