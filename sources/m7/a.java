package m7;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;

/* compiled from: FlutterKeyboardVisibilityPlugin */
public class a implements FlutterPlugin, ActivityAware, EventChannel.StreamHandler, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: h  reason: collision with root package name */
    private EventChannel.EventSink f15734h;

    /* renamed from: i  reason: collision with root package name */
    private View f15735i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f15736j;

    private void a(BinaryMessenger binaryMessenger) {
        new EventChannel(binaryMessenger, "flutter_keyboard_visibility").setStreamHandler(this);
    }

    private void b(Activity activity) {
        View findViewById = activity.findViewById(16908290);
        this.f15735i = findViewById;
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    private void c() {
        View view = this.f15735i;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f15735i = null;
        }
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        b(activityPluginBinding.getActivity());
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        a(flutterPluginBinding.getBinaryMessenger());
    }

    public void onCancel(Object obj) {
        this.f15734h = null;
    }

    public void onDetachedFromActivity() {
        c();
    }

    public void onDetachedFromActivityForConfigChanges() {
        c();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        c();
    }

    public void onGlobalLayout() {
        if (this.f15735i != null) {
            Rect rect = new Rect();
            this.f15735i.getWindowVisibleDisplayFrame(rect);
            boolean z10 = ((double) rect.height()) / ((double) this.f15735i.getRootView().getHeight()) < 0.85d;
            if (z10 != this.f15736j) {
                this.f15736j = z10;
                EventChannel.EventSink eventSink = this.f15734h;
                if (eventSink != null) {
                    eventSink.success(Integer.valueOf(z10 ? 1 : 0));
                }
            }
        }
    }

    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f15734h = eventSink;
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        b(activityPluginBinding.getActivity());
    }
}
