package m8;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.m;

/* compiled from: MethodCallHandlerImpl.kt */
public final class c implements MethodChannel.MethodCallHandler {

    /* renamed from: h  reason: collision with root package name */
    private Context f15739h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public Toast f15740i;

    /* compiled from: MethodCallHandlerImpl.kt */
    public static final class a extends Toast.Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f15741a;

        a(c cVar) {
            this.f15741a = cVar;
        }

        public void onToastHidden() {
            c.super.onToastHidden();
            this.f15741a.f15740i = null;
        }
    }

    public c(Context context) {
        m.f(context, "context");
        this.f15739h = context;
    }

    /* access modifiers changed from: private */
    public static final void c(c cVar) {
        m.f(cVar, "this$0");
        Toast toast = cVar.f15740i;
        if (toast != null) {
            toast.show();
        }
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        int i10;
        Toast toast;
        int i11;
        Drawable drawable;
        m.f(methodCall, "call");
        m.f(result, "result");
        String str = methodCall.method;
        View view = null;
        if (m.a(str, "showToast")) {
            String valueOf = String.valueOf(methodCall.argument("msg"));
            String valueOf2 = String.valueOf(methodCall.argument("length"));
            String valueOf3 = String.valueOf(methodCall.argument("gravity"));
            Number number = (Number) methodCall.argument("bgcolor");
            Number number2 = (Number) methodCall.argument("textcolor");
            Number number3 = (Number) methodCall.argument("fontSize");
            if (m.a(valueOf3, ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                i10 = 48;
            } else {
                i10 = m.a(valueOf3, "center") ? 17 : 80;
            }
            boolean a10 = m.a(valueOf2, "long");
            if (number == null || (i11 = Build.VERSION.SDK_INT) > 31) {
                Toast makeText = Toast.makeText(this.f15739h, valueOf, a10 ? 1 : 0);
                this.f15740i = makeText;
                if (Build.VERSION.SDK_INT <= 31) {
                    if (makeText != null) {
                        try {
                            view = makeText.getView();
                        } catch (Exception unused) {
                        }
                    }
                    m.c(view);
                    View findViewById = view.findViewById(16908299);
                    m.e(findViewById, "mToast?.view!!.findViewById(android.R.id.message)");
                    TextView textView = (TextView) findViewById;
                    if (number3 != null) {
                        textView.setTextSize(number3.floatValue());
                    }
                    if (number2 != null) {
                        textView.setTextColor(number2.intValue());
                    }
                }
            } else {
                Object systemService = this.f15739h.getSystemService("layout_inflater");
                m.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View inflate = ((LayoutInflater) systemService).inflate(f.toast_custom, (ViewGroup) null);
                TextView textView2 = (TextView) inflate.findViewById(e.f15742a);
                textView2.setText(valueOf);
                if (i11 >= 21) {
                    drawable = this.f15739h.getDrawable(d.corner);
                    m.c(drawable);
                } else {
                    drawable = androidx.core.content.a.f(this.f15739h, d.corner);
                }
                m.c(drawable);
                drawable.setColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN);
                textView2.setBackground(drawable);
                if (number3 != null) {
                    textView2.setTextSize(number3.floatValue());
                }
                if (number2 != null) {
                    textView2.setTextColor(number2.intValue());
                }
                Toast toast2 = new Toast(this.f15739h);
                this.f15740i = toast2;
                toast2.setDuration(a10);
                Toast toast3 = this.f15740i;
                if (toast3 != null) {
                    toast3.setView(inflate);
                }
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 <= 31) {
                if (i10 == 17) {
                    Toast toast4 = this.f15740i;
                    if (toast4 != null) {
                        toast4.setGravity(i10, 0, 0);
                    }
                } else if (i10 != 48) {
                    Toast toast5 = this.f15740i;
                    if (toast5 != null) {
                        toast5.setGravity(i10, 0, 100);
                    }
                } else {
                    Toast toast6 = this.f15740i;
                    if (toast6 != null) {
                        toast6.setGravity(i10, 0, 100);
                    }
                }
            }
            Context context = this.f15739h;
            if (context instanceof Activity) {
                m.d(context, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context).runOnUiThread(new b(this));
            } else {
                Toast toast7 = this.f15740i;
                if (toast7 != null) {
                    toast7.show();
                }
            }
            if (i12 >= 30 && (toast = this.f15740i) != null) {
                toast.addCallback(new a(this));
            }
            result.success(Boolean.TRUE);
        } else if (m.a(str, "cancel")) {
            Toast toast8 = this.f15740i;
            if (toast8 != null) {
                if (toast8 != null) {
                    toast8.cancel();
                }
                this.f15740i = null;
            }
            result.success(Boolean.TRUE);
        } else {
            result.notImplemented();
        }
    }
}
