package io.flutter.embedding.engine.systemchannels;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlatformViewsChannel {
    private static final String TAG = "PlatformViewsChannel";
    private final MethodChannel channel;
    /* access modifiers changed from: private */
    public PlatformViewsHandler handler;
    private final MethodChannel.MethodCallHandler parsingHandler;

    public interface PlatformViewBufferResized {
        void run(PlatformViewBufferSize platformViewBufferSize);
    }

    public static class PlatformViewBufferSize {
        public final int height;
        public final int width;

        public PlatformViewBufferSize(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }
    }

    public static class PlatformViewCreationRequest {
        public final int direction;
        public final RequestedDisplayMode displayMode;
        public final double logicalHeight;
        public final double logicalLeft;
        public final double logicalTop;
        public final double logicalWidth;
        public final ByteBuffer params;
        public final int viewId;
        public final String viewType;

        public enum RequestedDisplayMode {
            TEXTURE_WITH_VIRTUAL_FALLBACK,
            TEXTURE_WITH_HYBRID_FALLBACK,
            HYBRID_ONLY
        }

        public PlatformViewCreationRequest(int i10, String str, double d10, double d11, double d12, double d13, int i11, ByteBuffer byteBuffer) {
            this(i10, str, d10, d11, d12, d13, i11, RequestedDisplayMode.TEXTURE_WITH_VIRTUAL_FALLBACK, byteBuffer);
        }

        public PlatformViewCreationRequest(int i10, String str, double d10, double d11, double d12, double d13, int i11, RequestedDisplayMode requestedDisplayMode, ByteBuffer byteBuffer) {
            this.viewId = i10;
            this.viewType = str;
            this.logicalTop = d10;
            this.logicalLeft = d11;
            this.logicalWidth = d12;
            this.logicalHeight = d13;
            this.direction = i11;
            this.displayMode = requestedDisplayMode;
            this.params = byteBuffer;
        }
    }

    public static class PlatformViewResizeRequest {
        public final double newLogicalHeight;
        public final double newLogicalWidth;
        public final int viewId;

        public PlatformViewResizeRequest(int i10, double d10, double d11) {
            this.viewId = i10;
            this.newLogicalWidth = d10;
            this.newLogicalHeight = d11;
        }
    }

    public static class PlatformViewTouch {
        public final int action;
        public final int buttonState;
        public final int deviceId;
        public final Number downTime;
        public final int edgeFlags;
        public final Number eventTime;
        public final int flags;
        public final int metaState;
        public final long motionEventId;
        public final int pointerCount;
        public final Object rawPointerCoords;
        public final Object rawPointerPropertiesList;
        public final int source;
        public final int viewId;
        public final float xPrecision;
        public final float yPrecision;

        public PlatformViewTouch(int i10, Number number, Number number2, int i11, int i12, Object obj, Object obj2, int i13, int i14, float f10, float f11, int i15, int i16, int i17, int i18, long j10) {
            this.viewId = i10;
            this.downTime = number;
            this.eventTime = number2;
            this.action = i11;
            this.pointerCount = i12;
            this.rawPointerPropertiesList = obj;
            this.rawPointerCoords = obj2;
            this.metaState = i13;
            this.buttonState = i14;
            this.xPrecision = f10;
            this.yPrecision = f11;
            this.deviceId = i15;
            this.edgeFlags = i16;
            this.source = i17;
            this.flags = i18;
            this.motionEventId = j10;
        }
    }

    public interface PlatformViewsHandler {
        public static final long NON_TEXTURE_FALLBACK = -2;

        void clearFocus(int i10);

        void createForPlatformViewLayer(PlatformViewCreationRequest platformViewCreationRequest);

        long createForTextureLayer(PlatformViewCreationRequest platformViewCreationRequest);

        void dispose(int i10);

        void offset(int i10, double d10, double d11);

        void onTouch(PlatformViewTouch platformViewTouch);

        void resize(PlatformViewResizeRequest platformViewResizeRequest, PlatformViewBufferResized platformViewBufferResized);

        void setDirection(int i10, int i11);

        void synchronizeToNativeViewHierarchy(boolean z10);
    }

    public PlatformViewsChannel(DartExecutor dartExecutor) {
        AnonymousClass1 r02 = new MethodChannel.MethodCallHandler() {
            private void clearFocus(MethodCall methodCall, MethodChannel.Result result) {
                try {
                    PlatformViewsChannel.this.handler.clearFocus(((Integer) methodCall.arguments()).intValue());
                    result.success((Object) null);
                } catch (IllegalStateException e10) {
                    result.error("error", PlatformViewsChannel.detailedExceptionString(e10), (Object) null);
                }
            }

            private void create(MethodCall methodCall, MethodChannel.Result result) {
                PlatformViewCreationRequest.RequestedDisplayMode requestedDisplayMode;
                MethodChannel.Result result2 = result;
                Map map = (Map) methodCall.arguments();
                boolean z10 = true;
                boolean z11 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                ByteBuffer wrap = map.containsKey(NativeProtocol.WEB_DIALOG_PARAMS) ? ByteBuffer.wrap((byte[]) map.get(NativeProtocol.WEB_DIALOG_PARAMS)) : null;
                if (z11) {
                    try {
                        PlatformViewsChannel.this.handler.createForPlatformViewLayer(new PlatformViewCreationRequest(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, ((Integer) map.get("direction")).intValue(), PlatformViewCreationRequest.RequestedDisplayMode.HYBRID_ONLY, wrap));
                        result2.success((Object) null);
                    } catch (IllegalStateException e10) {
                        result2.error("error", PlatformViewsChannel.detailedExceptionString(e10), (Object) null);
                    }
                } else {
                    if (!map.containsKey("hybridFallback") || !((Boolean) map.get("hybridFallback")).booleanValue()) {
                        z10 = false;
                    }
                    if (z10) {
                        requestedDisplayMode = PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_HYBRID_FALLBACK;
                    } else {
                        requestedDisplayMode = PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_VIRTUAL_FALLBACK;
                    }
                    PlatformViewCreationRequest.RequestedDisplayMode requestedDisplayMode2 = requestedDisplayMode;
                    int intValue = ((Integer) map.get("id")).intValue();
                    String str = (String) map.get("viewType");
                    boolean containsKey = map.containsKey(ViewHierarchyConstants.DIMENSION_TOP_KEY);
                    double d10 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    double doubleValue = containsKey ? ((Double) map.get(ViewHierarchyConstants.DIMENSION_TOP_KEY)).doubleValue() : 0.0d;
                    if (map.containsKey(ViewHierarchyConstants.DIMENSION_LEFT_KEY)) {
                        d10 = ((Double) map.get(ViewHierarchyConstants.DIMENSION_LEFT_KEY)).doubleValue();
                    }
                    long createForTextureLayer = PlatformViewsChannel.this.handler.createForTextureLayer(new PlatformViewCreationRequest(intValue, str, doubleValue, d10, ((Double) map.get(ViewHierarchyConstants.DIMENSION_WIDTH_KEY)).doubleValue(), ((Double) map.get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY)).doubleValue(), ((Integer) map.get("direction")).intValue(), requestedDisplayMode2, wrap));
                    if (createForTextureLayer != -2) {
                        result2.success(Long.valueOf(createForTextureLayer));
                    } else if (z10) {
                        result2.success((Object) null);
                    } else {
                        throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                    }
                }
            }

            private void dispose(MethodCall methodCall, MethodChannel.Result result) {
                try {
                    PlatformViewsChannel.this.handler.dispose(((Integer) ((Map) methodCall.arguments()).get("id")).intValue());
                    result.success((Object) null);
                } catch (IllegalStateException e10) {
                    result.error("error", PlatformViewsChannel.detailedExceptionString(e10), (Object) null);
                }
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ void lambda$resize$0(MethodChannel.Result result, PlatformViewBufferSize platformViewBufferSize) {
                if (platformViewBufferSize == null) {
                    result.error("error", "Failed to resize the platform view", (Object) null);
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, Double.valueOf((double) platformViewBufferSize.width));
                hashMap.put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, Double.valueOf((double) platformViewBufferSize.height));
                result.success(hashMap);
            }

            private void offset(MethodCall methodCall, MethodChannel.Result result) {
                Map map = (Map) methodCall.arguments();
                try {
                    PlatformViewsChannel.this.handler.offset(((Integer) map.get("id")).intValue(), ((Double) map.get(ViewHierarchyConstants.DIMENSION_TOP_KEY)).doubleValue(), ((Double) map.get(ViewHierarchyConstants.DIMENSION_LEFT_KEY)).doubleValue());
                    result.success((Object) null);
                } catch (IllegalStateException e10) {
                    result.error("error", PlatformViewsChannel.detailedExceptionString(e10), (Object) null);
                }
            }

            private void resize(MethodCall methodCall, MethodChannel.Result result) {
                Map map = (Map) methodCall.arguments();
                try {
                    PlatformViewsChannel.this.handler.resize(new PlatformViewResizeRequest(((Integer) map.get("id")).intValue(), ((Double) map.get(ViewHierarchyConstants.DIMENSION_WIDTH_KEY)).doubleValue(), ((Double) map.get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY)).doubleValue()), new c(result));
                } catch (IllegalStateException e10) {
                    result.error("error", PlatformViewsChannel.detailedExceptionString(e10), (Object) null);
                }
            }

            private void setDirection(MethodCall methodCall, MethodChannel.Result result) {
                Map map = (Map) methodCall.arguments();
                try {
                    PlatformViewsChannel.this.handler.setDirection(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                    result.success((Object) null);
                } catch (IllegalStateException e10) {
                    result.error("error", PlatformViewsChannel.detailedExceptionString(e10), (Object) null);
                }
            }

            private void synchronizeToNativeViewHierarchy(MethodCall methodCall, MethodChannel.Result result) {
                try {
                    PlatformViewsChannel.this.handler.synchronizeToNativeViewHierarchy(((Boolean) methodCall.arguments()).booleanValue());
                    result.success((Object) null);
                } catch (IllegalStateException e10) {
                    result.error("error", PlatformViewsChannel.detailedExceptionString(e10), (Object) null);
                }
            }

            private void touch(MethodCall methodCall, MethodChannel.Result result) {
                MethodChannel.Result result2;
                MethodChannel.Result result3 = result;
                List list = (List) methodCall.arguments();
                PlatformViewTouch platformViewTouch = r2;
                PlatformViewTouch platformViewTouch2 = platformViewTouch;
                PlatformViewTouch platformViewTouch3 = new PlatformViewTouch(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue());
                try {
                    PlatformViewsChannel.this.handler.onTouch(platformViewTouch);
                    result2 = result;
                    try {
                        result2.success((Object) null);
                    } catch (IllegalStateException e10) {
                        e = e10;
                    }
                } catch (IllegalStateException e11) {
                    e = e11;
                    result2 = result;
                    result2.error("error", PlatformViewsChannel.detailedExceptionString(e), (Object) null);
                }
            }

            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                if (PlatformViewsChannel.this.handler != null) {
                    Log.v(PlatformViewsChannel.TAG, "Received '" + methodCall.method + "' message.");
                    String str = methodCall.method;
                    str.hashCode();
                    char c10 = 65535;
                    switch (str.hashCode()) {
                        case -1352294148:
                            if (str.equals("create")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -1019779949:
                            if (str.equals("offset")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case -934437708:
                            if (str.equals("resize")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case -756050293:
                            if (str.equals("clearFocus")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case -308988850:
                            if (str.equals("synchronizeToNativeViewHierarchy")) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 110550847:
                            if (str.equals("touch")) {
                                c10 = 5;
                                break;
                            }
                            break;
                        case 576796989:
                            if (str.equals("setDirection")) {
                                c10 = 6;
                                break;
                            }
                            break;
                        case 1671767583:
                            if (str.equals("dispose")) {
                                c10 = 7;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            create(methodCall, result);
                            return;
                        case 1:
                            offset(methodCall, result);
                            return;
                        case 2:
                            resize(methodCall, result);
                            return;
                        case 3:
                            clearFocus(methodCall, result);
                            return;
                        case 4:
                            synchronizeToNativeViewHierarchy(methodCall, result);
                            return;
                        case 5:
                            touch(methodCall, result);
                            return;
                        case 6:
                            setDirection(methodCall, result);
                            return;
                        case 7:
                            dispose(methodCall, result);
                            return;
                        default:
                            result.notImplemented();
                            return;
                    }
                }
            }
        };
        this.parsingHandler = r02;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/platform_views", StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(r02);
    }

    /* access modifiers changed from: private */
    public static String detailedExceptionString(Exception exc) {
        return Log.getStackTraceString(exc);
    }

    public void invokeViewFocused(int i10) {
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.invokeMethod("viewFocused", Integer.valueOf(i10));
        }
    }

    public void setPlatformViewsHandler(PlatformViewsHandler platformViewsHandler) {
        this.handler = platformViewsHandler;
    }
}
