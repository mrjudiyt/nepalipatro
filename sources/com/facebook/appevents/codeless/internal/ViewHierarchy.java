package com.facebook.appevents.codeless.internal;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ViewHierarchy.kt */
public final class ViewHierarchy {
    private static final String CLASS_RCTROOTVIEW = "com.facebook.react.ReactRootView";
    private static final String CLASS_RCTVIEWGROUP = "com.facebook.react.views.view.ReactViewGroup";
    private static final String CLASS_TOUCHTARGETHELPER = "com.facebook.react.uimanager.TouchTargetHelper";
    private static final int ICON_MAX_EDGE_LENGTH = 44;
    public static final ViewHierarchy INSTANCE = new ViewHierarchy();
    private static final String METHOD_FIND_TOUCHTARGET_VIEW = "findTouchTargetView";
    private static WeakReference<View> RCTRootViewReference = new WeakReference<>((Object) null);
    private static final String TAG = ViewHierarchy.class.getCanonicalName();
    private static Method methodFindTouchTargetView;

    private ViewHierarchy() {
    }

    public static final View findRCTRootView(View view) {
        Class<ViewHierarchy> cls = ViewHierarchy.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        while (view != null) {
            try {
                if (!INSTANCE.isRCTRootView(view)) {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
        return null;
    }

    public static final List<View> getChildrenOfView(View view) {
        Class<ViewHierarchy> cls = ViewHierarchy.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                int i10 = 0;
                if (childCount > 0) {
                    while (true) {
                        int i11 = i10 + 1;
                        arrayList.add(((ViewGroup) view).getChildAt(i10));
                        if (i11 >= childCount) {
                            break;
                        }
                        i10 = i11;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final int getClassTypeBitmask(View view) {
        Class<ViewHierarchy> cls = ViewHierarchy.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return 0;
        }
        try {
            m.f(view, "view");
            int i10 = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i10 |= 32;
            }
            ViewHierarchy viewHierarchy = INSTANCE;
            if (isAdapterViewItem(view)) {
                i10 |= 512;
            }
            if (view instanceof TextView) {
                int i11 = i10 | 1024 | 1;
                if (view instanceof Button) {
                    i11 |= 4;
                    if (view instanceof Switch) {
                        i11 |= 8192;
                    } else if (view instanceof CheckBox) {
                        i11 |= 32768;
                    }
                }
                if (view instanceof EditText) {
                    return i11 | 2048;
                }
                return i11;
            }
            if (!(view instanceof Spinner)) {
                if (!(view instanceof DatePicker)) {
                    if (view instanceof RatingBar) {
                        return i10 | NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
                    }
                    if (view instanceof RadioGroup) {
                        return i10 | 16384;
                    }
                    return (!(view instanceof ViewGroup) || !viewHierarchy.isRCTButton(view, (View) RCTRootViewReference.get())) ? i10 : i10 | 64;
                }
            }
            return i10 | 4096;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return 0;
        }
    }

    public static final JSONObject getDictionaryOfView(View view) {
        Class<ViewHierarchy> cls = ViewHierarchy.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            m.f(view, "view");
            if (m.a(view.getClass().getName(), CLASS_RCTROOTVIEW)) {
                RCTRootViewReference = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                updateBasicInfoOfView(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List<View> childrenOfView = getChildrenOfView(view);
                int i10 = 0;
                int size = childrenOfView.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = i10 + 1;
                        jSONArray.put(getDictionaryOfView(childrenOfView.get(i10)));
                        if (i11 > size) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                jSONObject.put(ViewHierarchyConstants.CHILDREN_VIEW_KEY, jSONArray);
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private final JSONObject getDimensionOfView(View view) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, view.getTop());
                jSONObject.put(ViewHierarchyConstants.DIMENSION_LEFT_KEY, view.getLeft());
                jSONObject.put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, view.getWidth());
                jSONObject.put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, view.getHeight());
                jSONObject.put(ViewHierarchyConstants.DIMENSION_SCROLL_X_KEY, view.getScrollX());
                jSONObject.put(ViewHierarchyConstants.DIMENSION_SCROLL_Y_KEY, view.getScrollY());
                jSONObject.put(ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, view.getVisibility());
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final Class<?> getExistingClass(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final View.OnClickListener getExistingOnClickListener(View view) {
        Field declaredField;
        Class<ViewHierarchy> cls = ViewHierarchy.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                return (View.OnClickListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final View.OnTouchListener getExistingOnTouchListener(View view) {
        Field declaredField;
        Class<ViewHierarchy> cls = ViewHierarchy.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                return (View.OnTouchListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
        } catch (NoSuchFieldException e10) {
            Utility utility = Utility.INSTANCE;
            Utility.logd(TAG, (Exception) e10);
        } catch (ClassNotFoundException e11) {
            Utility utility2 = Utility.INSTANCE;
            Utility.logd(TAG, (Exception) e11);
        } catch (IllegalAccessException e12) {
            Utility utility3 = Utility.INSTANCE;
            Utility.logd(TAG, (Exception) e12);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
        return null;
    }

    public static final String getHintOfView(View view) {
        CharSequence charSequence;
        Class<ViewHierarchy> cls = ViewHierarchy.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                charSequence = ((EditText) view).getHint();
            } else {
                charSequence = view instanceof TextView ? ((TextView) view).getHint() : null;
            }
            if (charSequence == null) {
                return "";
            }
            String obj = charSequence.toString();
            if (obj == null) {
                return "";
            }
            return obj;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final ViewGroup getParentOfView(View view) {
        Class<ViewHierarchy> cls = ViewHierarchy.class;
        if (CrashShieldHandler.isObjectCrashing(cls) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final String getTextOfView(View view) {
        Object obj;
        Object selectedItem;
        Class<ViewHierarchy> cls = ViewHierarchy.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                obj = ((TextView) view).getText();
                if (view instanceof Switch) {
                    obj = ((Switch) view).isChecked() ? AppEventsConstants.EVENT_PARAM_VALUE_YES : AppEventsConstants.EVENT_PARAM_VALUE_NO;
                }
            } else {
                if (!(view instanceof Spinner)) {
                    int i10 = 0;
                    if (view instanceof DatePicker) {
                        int year = ((DatePicker) view).getYear();
                        int month = ((DatePicker) view).getMonth();
                        int dayOfMonth = ((DatePicker) view).getDayOfMonth();
                        b0 b0Var = b0.f15559a;
                        obj = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                        m.e(obj, "java.lang.String.format(format, *args)");
                    } else if (view instanceof TimePicker) {
                        Integer currentHour = ((TimePicker) view).getCurrentHour();
                        m.e(currentHour, "view.currentHour");
                        int intValue = currentHour.intValue();
                        Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                        m.e(currentMinute, "view.currentMinute");
                        int intValue2 = currentMinute.intValue();
                        b0 b0Var2 = b0.f15559a;
                        obj = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}, 2));
                        m.e(obj, "java.lang.String.format(format, *args)");
                    } else if (view instanceof RadioGroup) {
                        int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                        int childCount = ((RadioGroup) view).getChildCount();
                        if (childCount > 0) {
                            while (true) {
                                int i11 = i10 + 1;
                                View childAt = ((RadioGroup) view).getChildAt(i10);
                                if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                    obj = ((RadioButton) childAt).getText();
                                    break;
                                } else if (i11 >= childCount) {
                                    break;
                                } else {
                                    i10 = i11;
                                }
                            }
                        }
                    } else if (view instanceof RatingBar) {
                        obj = String.valueOf(((RatingBar) view).getRating());
                    }
                } else if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    obj = selectedItem.toString();
                }
                obj = null;
            }
            if (obj == null) {
                return "";
            }
            String obj2 = obj.toString();
            if (obj2 == null) {
                return "";
            }
            return obj2;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private final View getTouchReactView(float[] fArr, View view) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            initTouchTargetHelperMethods();
            Method method = methodFindTouchTargetView;
            if (!(method == null || view == null)) {
                if (method != null) {
                    Object invoke = method.invoke((Object) null, new Object[]{fArr, view});
                    if (invoke != null) {
                        View view2 = (View) invoke;
                        if (view2.getId() > 0) {
                            ViewParent parent = view2.getParent();
                            if (parent != null) {
                                return (View) parent;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
        } catch (IllegalAccessException e10) {
            Utility utility = Utility.INSTANCE;
            Utility.logd(TAG, (Exception) e10);
        } catch (InvocationTargetException e11) {
            Utility utility2 = Utility.INSTANCE;
            Utility.logd(TAG, (Exception) e11);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
        return null;
    }

    private final float[] getViewLocationOnScreen(View view) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new float[]{(float) iArr[0], (float) iArr[1]};
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final void initTouchTargetHelperMethods() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                if (methodFindTouchTargetView == null) {
                    Method declaredMethod = Class.forName(CLASS_TOUCHTARGETHELPER).getDeclaredMethod(METHOD_FIND_TOUCHTARGET_VIEW, new Class[]{float[].class, ViewGroup.class});
                    methodFindTouchTargetView = declaredMethod;
                    if (declaredMethod != null) {
                        declaredMethod.setAccessible(true);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } catch (ClassNotFoundException e10) {
                Utility utility = Utility.INSTANCE;
                Utility.logd(TAG, (Exception) e10);
            } catch (NoSuchMethodException e11) {
                Utility utility2 = Utility.INSTANCE;
                Utility.logd(TAG, (Exception) e11);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private static final boolean isAdapterViewItem(View view) {
        Class<ViewHierarchy> cls = ViewHierarchy.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            ViewHierarchy viewHierarchy = INSTANCE;
            Class<?> existingClass = viewHierarchy.getExistingClass("android.support.v4.view.NestedScrollingChild");
            if (existingClass != null && existingClass.isInstance(parent)) {
                return true;
            }
            Class<?> existingClass2 = viewHierarchy.getExistingClass("androidx.core.view.NestedScrollingChild");
            if (existingClass2 == null || !existingClass2.isInstance(parent)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }

    private final boolean isRCTRootView(View view) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return m.a(view.getClass().getName(), CLASS_RCTROOTVIEW);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002c A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setOnClickListener(android.view.View r5, android.view.View.OnClickListener r6) {
        /*
            java.lang.Class<com.facebook.appevents.codeless.internal.ViewHierarchy> r0 = com.facebook.appevents.codeless.internal.ViewHierarchy.class
            boolean r1 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "view"
            kotlin.jvm.internal.m.f(r5, r1)     // Catch:{ all -> 0x004d }
            r1 = 0
            java.lang.String r2 = "android.view.View"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0028 }
            java.lang.String r3 = "mListenerInfo"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0028 }
            java.lang.String r3 = "android.view.View$ListenerInfo"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0029 }
            java.lang.String r4 = "mOnClickListener"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x0029 }
            goto L_0x002a
        L_0x0028:
            r2 = r1
        L_0x0029:
            r3 = r1
        L_0x002a:
            if (r2 == 0) goto L_0x0049
            if (r3 != 0) goto L_0x002f
            goto L_0x0049
        L_0x002f:
            r4 = 1
            r2.setAccessible(r4)     // Catch:{ Exception -> 0x004c }
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x004c }
            r2.setAccessible(r4)     // Catch:{ IllegalAccessException -> 0x003e }
            java.lang.Object r1 = r2.get(r5)     // Catch:{ IllegalAccessException -> 0x003e }
            goto L_0x003f
        L_0x003e:
        L_0x003f:
            if (r1 != 0) goto L_0x0045
            r5.setOnClickListener(r6)     // Catch:{ Exception -> 0x004c }
            return
        L_0x0045:
            r3.set(r1, r6)     // Catch:{ Exception -> 0x004c }
            goto L_0x004c
        L_0x0049:
            r5.setOnClickListener(r6)     // Catch:{ Exception -> 0x004c }
        L_0x004c:
            return
        L_0x004d:
            r5 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.codeless.internal.ViewHierarchy.setOnClickListener(android.view.View, android.view.View$OnClickListener):void");
    }

    public static final void updateAppearanceOfView(View view, JSONObject jSONObject, float f10) {
        Bitmap bitmap;
        Typeface typeface;
        Class<ViewHierarchy> cls = ViewHierarchy.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(view, "view");
                m.f(jSONObject, "json");
                JSONObject jSONObject2 = new JSONObject();
                if ((view instanceof TextView) && (typeface = ((TextView) view).getTypeface()) != null) {
                    jSONObject2.put(ViewHierarchyConstants.TEXT_SIZE, (double) ((TextView) view).getTextSize());
                    jSONObject2.put(ViewHierarchyConstants.TEXT_IS_BOLD, typeface.isBold());
                    jSONObject2.put(ViewHierarchyConstants.TEXT_IS_ITALIC, typeface.isItalic());
                    jSONObject.put(ViewHierarchyConstants.TEXT_STYLE, jSONObject2);
                }
                if (view instanceof ImageView) {
                    Drawable drawable = ((ImageView) view).getDrawable();
                    if (drawable instanceof BitmapDrawable) {
                        float f11 = (float) 44;
                        if (((float) view.getHeight()) / f10 <= f11 && ((float) view.getWidth()) / f10 <= f11 && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                            jSONObject.put(ViewHierarchyConstants.ICON_BITMAP, Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
                        }
                    }
                }
            } catch (JSONException e10) {
                Utility utility = Utility.INSTANCE;
                Utility.logd(TAG, (Exception) e10);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final void updateBasicInfoOfView(View view, JSONObject jSONObject) {
        Class<ViewHierarchy> cls = ViewHierarchy.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(view, "view");
                m.f(jSONObject, "json");
                ViewHierarchy viewHierarchy = INSTANCE;
                String textOfView = getTextOfView(view);
                String hintOfView = getHintOfView(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put(ViewHierarchyConstants.CLASS_NAME_KEY, view.getClass().getCanonicalName());
                jSONObject.put(ViewHierarchyConstants.CLASS_TYPE_BITMASK_KEY, getClassTypeBitmask(view));
                jSONObject.put("id", view.getId());
                SensitiveUserDataUtils sensitiveUserDataUtils = SensitiveUserDataUtils.INSTANCE;
                if (!SensitiveUserDataUtils.isSensitiveUserData(view)) {
                    Utility utility = Utility.INSTANCE;
                    jSONObject.put(ViewHierarchyConstants.TEXT_KEY, Utility.coerceValueIfNullOrEmpty(Utility.sha256hash(textOfView), ""));
                } else {
                    jSONObject.put(ViewHierarchyConstants.TEXT_KEY, "");
                    jSONObject.put(ViewHierarchyConstants.IS_USER_INPUT_KEY, true);
                }
                Utility utility2 = Utility.INSTANCE;
                jSONObject.put(ViewHierarchyConstants.HINT_KEY, Utility.coerceValueIfNullOrEmpty(Utility.sha256hash(hintOfView), ""));
                if (tag != null) {
                    jSONObject.put(ViewHierarchyConstants.TAG_KEY, Utility.coerceValueIfNullOrEmpty(Utility.sha256hash(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    jSONObject.put("description", Utility.coerceValueIfNullOrEmpty(Utility.sha256hash(contentDescription.toString()), ""));
                }
                jSONObject.put(ViewHierarchyConstants.DIMENSION_KEY, viewHierarchy.getDimensionOfView(view));
            } catch (JSONException e10) {
                Utility utility3 = Utility.INSTANCE;
                Utility.logd(TAG, (Exception) e10);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public final boolean isRCTButton(View view, View view2) {
        View touchReactView;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            m.f(view, "view");
            if (!m.a(view.getClass().getName(), CLASS_RCTVIEWGROUP) || (touchReactView = getTouchReactView(getViewLocationOnScreen(view), view2)) == null || touchReactView.getId() != view.getId()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
