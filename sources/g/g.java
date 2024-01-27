package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.l;
import androidx.appcompat.widget.n;
import androidx.appcompat.widget.q;
import androidx.appcompat.widget.r;
import androidx.appcompat.widget.r0;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.u;
import androidx.appcompat.widget.x;
import androidx.collection.h;
import androidx.core.view.z;
import f.j;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l.d;

/* compiled from: AppCompatViewInflater */
public class g {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?>[] f8611b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f8612c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f8613d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e  reason: collision with root package name */
    private static final h<String, Constructor<? extends View>> f8614e = new h<>();

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f8615a = new Object[2];

    /* compiled from: AppCompatViewInflater */
    private static class a implements View.OnClickListener {

        /* renamed from: h  reason: collision with root package name */
        private final View f8616h;

        /* renamed from: i  reason: collision with root package name */
        private final String f8617i;

        /* renamed from: j  reason: collision with root package name */
        private Method f8618j;

        /* renamed from: k  reason: collision with root package name */
        private Context f8619k;

        public a(View view, String str) {
            this.f8616h = view;
            this.f8617i = str;
        }

        private void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f8617i, new Class[]{View.class})) != null) {
                        this.f8618j = method;
                        this.f8619k = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f8616h.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f8616h.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f8617i + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f8616h.getClass() + str);
        }

        public void onClick(View view) {
            if (this.f8618j == null) {
                a(this.f8616h.getContext());
            }
            try {
                this.f8618j.invoke(this.f8619k, new Object[]{view});
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    private void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || z.A(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8612c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View r(Context context, String str, String str2) {
        String str3;
        h<String, Constructor<? extends View>> hVar = f8614e;
        Constructor<? extends U> constructor = hVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f8611b);
            hVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f8615a);
    }

    private View s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, Constants.CLASS);
        }
        try {
            Object[] objArr = this.f8615a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i10 = 0;
                while (true) {
                    String[] strArr = f8613d;
                    if (i10 < strArr.length) {
                        View r10 = r(context, str, strArr[i10]);
                        if (r10 != null) {
                            return r10;
                        }
                        i10++;
                    } else {
                        Object[] objArr2 = this.f8615a;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View r11 = r(context, str, (String) null);
                Object[] objArr3 = this.f8615a;
                objArr3[0] = null;
                objArr3[1] = null;
                return r11;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.f8615a;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    private static Context t(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.O3, 0, 0);
        int resourceId = z10 ? obtainStyledAttributes.getResourceId(j.P3, 0) : 0;
        if (z11 && resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(j.Q3, 0);
        }
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return (!(context instanceof d) || ((d) context).c() != resourceId) ? new d(context, resourceId) : context;
        }
        return context;
    }

    private void u(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    /* access modifiers changed from: protected */
    public androidx.appcompat.widget.d b(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.d(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatButton c(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public f d(Context context, AttributeSet attributeSet) {
        return new f(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public androidx.appcompat.widget.g e(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.g(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public androidx.appcompat.widget.j f(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.j(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public l g(Context context, AttributeSet attributeSet) {
        return new l(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatImageView h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public n i(Context context, AttributeSet attributeSet) {
        return new n(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public q j(Context context, AttributeSet attributeSet) {
        return new q(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public r k(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public s l(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public u m(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public x n(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public androidx.appcompat.widget.z o(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.z(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public View p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final View q(View view, String str, Context context, AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        View view2;
        Context context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            context2 = t(context2, attributeSet, z11, z12);
        }
        if (z13) {
            context2 = r0.b(context2);
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c10 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c10 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c10 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c10 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c10 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c10 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c10 = 8;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c10 = 9;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c10 = 10;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c10 = 12;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c10 = 13;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                view2 = k(context2, attributeSet);
                u(view2, str);
                break;
            case 1:
                view2 = e(context2, attributeSet);
                u(view2, str);
                break;
            case 2:
                view2 = i(context2, attributeSet);
                u(view2, str);
                break;
            case 3:
                view2 = n(context2, attributeSet);
                u(view2, str);
                break;
            case 4:
                view2 = g(context2, attributeSet);
                u(view2, str);
                break;
            case 5:
                view2 = l(context2, attributeSet);
                u(view2, str);
                break;
            case 6:
                view2 = m(context2, attributeSet);
                u(view2, str);
                break;
            case 7:
                view2 = j(context2, attributeSet);
                u(view2, str);
                break;
            case 8:
                view2 = o(context2, attributeSet);
                u(view2, str);
                break;
            case 9:
                view2 = h(context2, attributeSet);
                u(view2, str);
                break;
            case 10:
                view2 = b(context2, attributeSet);
                u(view2, str);
                break;
            case 11:
                view2 = d(context2, attributeSet);
                u(view2, str);
                break;
            case 12:
                view2 = f(context2, attributeSet);
                u(view2, str);
                break;
            case 13:
                view2 = c(context2, attributeSet);
                u(view2, str);
                break;
            default:
                view2 = p(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = s(context2, str, attributeSet);
        }
        if (view2 != null) {
            a(view2, attributeSet);
        }
        return view2;
    }
}
