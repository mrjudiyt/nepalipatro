package io.flutter.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.flutter.Log;
import io.flutter.embedding.engine.systemchannels.AccessibilityChannel;
import io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate;
import io.flutter.util.Predicate;
import io.flutter.util.ViewUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccessibilityBridge extends AccessibilityNodeProvider {
    private static final int ACTION_SHOW_ON_SCREEN = 16908342;
    private static final int BOLD_TEXT_WEIGHT_ADJUSTMENT = 300;
    private static int FIRST_RESOURCE_ID = 267386881;
    /* access modifiers changed from: private */
    public static final int FOCUSABLE_FLAGS = (((((((((((Flag.HAS_CHECKED_STATE.value | Flag.IS_CHECKED.value) | Flag.IS_SELECTED.value) | Flag.IS_TEXT_FIELD.value) | Flag.IS_FOCUSED.value) | Flag.HAS_ENABLED_STATE.value) | Flag.IS_ENABLED.value) | Flag.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.value) | Flag.HAS_TOGGLED_STATE.value) | Flag.IS_TOGGLED.value) | Flag.IS_FOCUSABLE.value) | Flag.IS_SLIDER.value);
    private static final int MIN_ENGINE_GENERATED_NODE_ID = 65536;
    private static final int ROOT_NODE_ID = 0;
    /* access modifiers changed from: private */
    public static final int SCROLLABLE_ACTIONS = (((Action.SCROLL_RIGHT.value | Action.SCROLL_LEFT.value) | Action.SCROLL_UP.value) | Action.SCROLL_DOWN.value);
    private static final float SCROLL_EXTENT_FOR_INFINITY = 100000.0f;
    private static final float SCROLL_POSITION_CAP_FOR_INFINITY = 70000.0f;
    private static final String TAG = "AccessibilityBridge";
    /* access modifiers changed from: private */
    public final AccessibilityChannel accessibilityChannel;
    private int accessibilityFeatureFlags;
    private SemanticsNode accessibilityFocusedSemanticsNode;
    /* access modifiers changed from: private */
    public final AccessibilityManager accessibilityManager;
    /* access modifiers changed from: private */
    public final AccessibilityChannel.AccessibilityMessageHandler accessibilityMessageHandler;
    private final AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;
    private final AccessibilityViewEmbedder accessibilityViewEmbedder;
    private boolean accessibleNavigation;
    private final ContentObserver animationScaleObserver;
    /* access modifiers changed from: private */
    public final ContentResolver contentResolver;
    private final Map<Integer, CustomAccessibilityAction> customAccessibilityActions;
    private Integer embeddedAccessibilityFocusedNodeId;
    private Integer embeddedInputFocusedNodeId;
    private final List<Integer> flutterNavigationStack;
    private final Map<Integer, SemanticsNode> flutterSemanticsTree;
    private SemanticsNode hoveredObject;
    private SemanticsNode inputFocusedSemanticsNode;
    /* access modifiers changed from: private */
    public boolean isReleased;
    private SemanticsNode lastInputFocusedSemanticsNode;
    private Integer lastLeftFrameInset;
    /* access modifiers changed from: private */
    public OnAccessibilityChangeListener onAccessibilityChangeListener;
    private final PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate;
    private int previousRouteId;
    /* access modifiers changed from: private */
    public final View rootAccessibilityView;
    @TargetApi(19)
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener;

    /* renamed from: io.flutter.view.AccessibilityBridge$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.flutter.view.AccessibilityBridge$StringAttributeType[] r0 = io.flutter.view.AccessibilityBridge.StringAttributeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType = r0
                io.flutter.view.AccessibilityBridge$StringAttributeType r1 = io.flutter.view.AccessibilityBridge.StringAttributeType.SPELLOUT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.view.AccessibilityBridge$StringAttributeType r1 = io.flutter.view.AccessibilityBridge.StringAttributeType.LOCALE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityBridge.AnonymousClass5.<clinit>():void");
        }
    }

    private enum AccessibilityFeature {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);
        
        final int value;

        private AccessibilityFeature(int i10) {
            this.value = i10;
        }
    }

    public enum Action {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(UserVerificationMethods.USER_VERIFY_HANDPRINT),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152);
        
        public final int value;

        private Action(int i10) {
            this.value = i10;
        }
    }

    private static class CustomAccessibilityAction {
        /* access modifiers changed from: private */
        public String hint;
        /* access modifiers changed from: private */
        public int id = -1;
        /* access modifiers changed from: private */
        public String label;
        /* access modifiers changed from: private */
        public int overrideId = -1;
        /* access modifiers changed from: private */
        public int resourceId = -1;

        CustomAccessibilityAction() {
        }
    }

    enum Flag {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(UserVerificationMethods.USER_VERIFY_HANDPRINT),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216),
        IS_CHECK_STATE_MIXED(33554432);
        
        final int value;

        private Flag(int i10) {
            this.value = i10;
        }
    }

    private static class LocaleStringAttribute extends StringAttribute {
        String locale;

        private LocaleStringAttribute() {
            super();
        }
    }

    public interface OnAccessibilityChangeListener {
        void onAccessibilityChanged(boolean z10, boolean z11);
    }

    private static class SemanticsNode {
        final AccessibilityBridge accessibilityBridge;
        private int actions;
        private float bottom;
        /* access modifiers changed from: private */
        public List<SemanticsNode> childrenInHitTestOrder = new ArrayList();
        /* access modifiers changed from: private */
        public List<SemanticsNode> childrenInTraversalOrder = new ArrayList();
        /* access modifiers changed from: private */
        public int currentValueLength;
        /* access modifiers changed from: private */
        public List<CustomAccessibilityAction> customAccessibilityActions;
        /* access modifiers changed from: private */
        public String decreasedValue;
        /* access modifiers changed from: private */
        public List<StringAttribute> decreasedValueAttributes;
        private int flags;
        /* access modifiers changed from: private */
        public boolean globalGeometryDirty = true;
        private Rect globalRect;
        private float[] globalTransform;
        /* access modifiers changed from: private */
        public boolean hadPreviousConfig = false;
        private String hint;
        private List<StringAttribute> hintAttributes;
        /* access modifiers changed from: private */
        public int id = -1;
        /* access modifiers changed from: private */
        public String increasedValue;
        /* access modifiers changed from: private */
        public List<StringAttribute> increasedValueAttributes;
        private float[] inverseTransform;
        /* access modifiers changed from: private */
        public boolean inverseTransformDirty = true;
        /* access modifiers changed from: private */
        public String label;
        private List<StringAttribute> labelAttributes;
        private float left;
        /* access modifiers changed from: private */
        public int maxValueLength;
        /* access modifiers changed from: private */
        public CustomAccessibilityAction onLongPressOverride;
        /* access modifiers changed from: private */
        public CustomAccessibilityAction onTapOverride;
        /* access modifiers changed from: private */
        public SemanticsNode parent;
        /* access modifiers changed from: private */
        public int platformViewId;
        private int previousActions;
        private int previousFlags;
        private String previousLabel;
        /* access modifiers changed from: private */
        public int previousNodeId = -1;
        private float previousScrollExtentMax;
        private float previousScrollExtentMin;
        private float previousScrollPosition;
        /* access modifiers changed from: private */
        public int previousTextSelectionBase;
        /* access modifiers changed from: private */
        public int previousTextSelectionExtent;
        /* access modifiers changed from: private */
        public String previousValue;
        private float right;
        /* access modifiers changed from: private */
        public int scrollChildren;
        /* access modifiers changed from: private */
        public float scrollExtentMax;
        /* access modifiers changed from: private */
        public float scrollExtentMin;
        /* access modifiers changed from: private */
        public int scrollIndex;
        /* access modifiers changed from: private */
        public float scrollPosition;
        private TextDirection textDirection;
        /* access modifiers changed from: private */
        public int textSelectionBase;
        /* access modifiers changed from: private */
        public int textSelectionExtent;
        /* access modifiers changed from: private */
        public String tooltip;
        private float top;
        private float[] transform;
        /* access modifiers changed from: private */
        public String value;
        /* access modifiers changed from: private */
        public List<StringAttribute> valueAttributes;

        SemanticsNode(AccessibilityBridge accessibilityBridge2) {
            this.accessibilityBridge = accessibilityBridge2;
        }

        static /* synthetic */ int access$2112(SemanticsNode semanticsNode, int i10) {
            int i11 = semanticsNode.textSelectionExtent + i10;
            semanticsNode.textSelectionExtent = i11;
            return i11;
        }

        static /* synthetic */ int access$2120(SemanticsNode semanticsNode, int i10) {
            int i11 = semanticsNode.textSelectionExtent - i10;
            semanticsNode.textSelectionExtent = i11;
            return i11;
        }

        /* access modifiers changed from: private */
        public void collectRoutes(List<SemanticsNode> list) {
            if (hasFlag(Flag.SCOPES_ROUTE)) {
                list.add(this);
            }
            for (SemanticsNode collectRoutes : this.childrenInTraversalOrder) {
                collectRoutes.collectRoutes(list);
            }
        }

        @TargetApi(21)
        private SpannableString createSpannableString(String str, List<StringAttribute> list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                for (StringAttribute next : list) {
                    int i10 = AnonymousClass5.$SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType[next.type.ordinal()];
                    if (i10 == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), next.start, next.end, 0);
                    } else if (i10 == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((LocaleStringAttribute) next).locale)), next.start, next.end, 0);
                    }
                }
            }
            return spannableString;
        }

        /* access modifiers changed from: private */
        public boolean didChangeLabel() {
            String str;
            String str2 = this.label;
            if (str2 == null && this.previousLabel == null) {
                return false;
            }
            if (str2 == null || (str = this.previousLabel) == null || !str2.equals(str)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        public boolean didScroll() {
            return !Float.isNaN(this.scrollPosition) && !Float.isNaN(this.previousScrollPosition) && this.previousScrollPosition != this.scrollPosition;
        }

        private void ensureInverseTransform() {
            if (this.inverseTransformDirty) {
                this.inverseTransformDirty = false;
                if (this.inverseTransform == null) {
                    this.inverseTransform = new float[16];
                }
                if (!Matrix.invertM(this.inverseTransform, 0, this.transform, 0)) {
                    Arrays.fill(this.inverseTransform, 0.0f);
                }
            }
        }

        private SemanticsNode getAncestor(Predicate<SemanticsNode> predicate) {
            for (SemanticsNode semanticsNode = this.parent; semanticsNode != null; semanticsNode = semanticsNode.parent) {
                if (predicate.test(semanticsNode)) {
                    return semanticsNode;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public Rect getGlobalRect() {
            return this.globalRect;
        }

        private CharSequence getHint() {
            if (Build.VERSION.SDK_INT < 21) {
                return this.hint;
            }
            return createSpannableString(this.hint, this.hintAttributes);
        }

        private CharSequence getLabel() {
            if (Build.VERSION.SDK_INT < 21) {
                return this.label;
            }
            return createSpannableString(this.label, this.labelAttributes);
        }

        /* access modifiers changed from: private */
        public String getRouteName() {
            String str;
            if (hasFlag(Flag.NAMES_ROUTE) && (str = this.label) != null && !str.isEmpty()) {
                return this.label;
            }
            for (SemanticsNode routeName : this.childrenInTraversalOrder) {
                String routeName2 = routeName.getRouteName();
                if (routeName2 != null && !routeName2.isEmpty()) {
                    return routeName2;
                }
            }
            return null;
        }

        private List<StringAttribute> getStringAttributesFromBuffer(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i10 = byteBuffer.getInt();
            if (i10 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = byteBuffer.getInt();
                int i13 = byteBuffer.getInt();
                StringAttributeType stringAttributeType = StringAttributeType.values()[byteBuffer.getInt()];
                int i14 = AnonymousClass5.$SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType[stringAttributeType.ordinal()];
                if (i14 == 1) {
                    byteBuffer.getInt();
                    SpellOutStringAttribute spellOutStringAttribute = new SpellOutStringAttribute();
                    spellOutStringAttribute.start = i12;
                    spellOutStringAttribute.end = i13;
                    spellOutStringAttribute.type = stringAttributeType;
                    arrayList.add(spellOutStringAttribute);
                } else if (i14 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    LocaleStringAttribute localeStringAttribute = new LocaleStringAttribute();
                    localeStringAttribute.start = i12;
                    localeStringAttribute.end = i13;
                    localeStringAttribute.type = stringAttributeType;
                    localeStringAttribute.locale = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(localeStringAttribute);
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public CharSequence getTextFieldHint() {
            CharSequence[] charSequenceArr = {getLabel(), getHint()};
            CharSequence charSequence = null;
            for (int i10 = 0; i10 < 2; i10++) {
                CharSequence charSequence2 = charSequenceArr[i10];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    if (charSequence == null || charSequence.length() == 0) {
                        charSequence = charSequence2;
                    } else {
                        charSequence = TextUtils.concat(new CharSequence[]{charSequence, ", ", charSequence2});
                    }
                }
            }
            return charSequence;
        }

        /* access modifiers changed from: private */
        public CharSequence getValue() {
            if (Build.VERSION.SDK_INT < 21) {
                return this.value;
            }
            return createSpannableString(this.value, this.valueAttributes);
        }

        /* access modifiers changed from: private */
        public CharSequence getValueLabelHint() {
            CharSequence[] charSequenceArr = {getValue(), getLabel(), getHint()};
            CharSequence charSequence = null;
            for (int i10 = 0; i10 < 3; i10++) {
                CharSequence charSequence2 = charSequenceArr[i10];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    if (charSequence == null || charSequence.length() == 0) {
                        charSequence = charSequence2;
                    } else {
                        charSequence = TextUtils.concat(new CharSequence[]{charSequence, ", ", charSequence2});
                    }
                }
            }
            return charSequence;
        }

        /* access modifiers changed from: private */
        public boolean hadAction(Action action) {
            return (action.value & this.previousActions) != 0;
        }

        /* access modifiers changed from: private */
        public boolean hadFlag(Flag flag) {
            return (flag.value & this.previousFlags) != 0;
        }

        /* access modifiers changed from: private */
        public boolean hasAction(Action action) {
            return (action.value & this.actions) != 0;
        }

        /* access modifiers changed from: private */
        public boolean hasFlag(Flag flag) {
            return (flag.value & this.flags) != 0;
        }

        /* access modifiers changed from: private */
        public SemanticsNode hitTest(float[] fArr, boolean z10) {
            float f10 = fArr[3];
            boolean z11 = false;
            float f11 = fArr[0] / f10;
            float f12 = fArr[1] / f10;
            if (f11 < this.left || f11 >= this.right || f12 < this.top || f12 >= this.bottom) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (SemanticsNode next : this.childrenInHitTestOrder) {
                if (!next.hasFlag(Flag.IS_HIDDEN)) {
                    next.ensureInverseTransform();
                    Matrix.multiplyMV(fArr2, 0, next.inverseTransform, 0, fArr, 0);
                    SemanticsNode hitTest = next.hitTest(fArr2, z10);
                    if (hitTest != null) {
                        return hitTest;
                    }
                }
            }
            if (z10 && this.platformViewId != -1) {
                z11 = true;
            }
            if (isFocusable() || z11) {
                return this;
            }
            return null;
        }

        /* access modifiers changed from: private */
        public boolean isFocusable() {
            String str;
            String str2;
            String str3;
            if (hasFlag(Flag.SCOPES_ROUTE)) {
                return false;
            }
            if (!hasFlag(Flag.IS_FOCUSABLE) && (this.actions & (~AccessibilityBridge.SCROLLABLE_ACTIONS)) == 0 && (this.flags & AccessibilityBridge.FOCUSABLE_FLAGS) == 0 && (((str = this.label) == null || str.isEmpty()) && (((str2 = this.value) == null || str2.isEmpty()) && ((str3 = this.hint) == null || str3.isEmpty())))) {
                return false;
            }
            return true;
        }

        private void log(String str, boolean z10) {
        }

        private float max(float f10, float f11, float f12, float f13) {
            return Math.max(f10, Math.max(f11, Math.max(f12, f13)));
        }

        private float min(float f10, float f11, float f12, float f13) {
            return Math.min(f10, Math.min(f11, Math.min(f12, f13)));
        }

        /* access modifiers changed from: private */
        public static boolean nullableHasAncestor(SemanticsNode semanticsNode, Predicate<SemanticsNode> predicate) {
            return (semanticsNode == null || semanticsNode.getAncestor(predicate) == null) ? false : true;
        }

        private void transformPoint(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f10 = fArr[3];
            fArr[0] = fArr[0] / f10;
            fArr[1] = fArr[1] / f10;
            fArr[2] = fArr[2] / f10;
            fArr[3] = 0.0f;
        }

        /* access modifiers changed from: private */
        public void updateRecursively(float[] fArr, Set<SemanticsNode> set, boolean z10) {
            set.add(this);
            if (this.globalGeometryDirty) {
                z10 = true;
            }
            if (z10) {
                if (this.globalTransform == null) {
                    this.globalTransform = new float[16];
                }
                if (this.transform == null) {
                    this.transform = new float[16];
                }
                Matrix.multiplyMM(this.globalTransform, 0, fArr, 0, this.transform, 0);
                float[] fArr2 = new float[4];
                fArr2[2] = 0.0f;
                fArr2[3] = 1.0f;
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                fArr2[0] = this.left;
                fArr2[1] = this.top;
                transformPoint(fArr3, this.globalTransform, fArr2);
                fArr2[0] = this.right;
                fArr2[1] = this.top;
                transformPoint(fArr4, this.globalTransform, fArr2);
                fArr2[0] = this.right;
                fArr2[1] = this.bottom;
                transformPoint(fArr5, this.globalTransform, fArr2);
                fArr2[0] = this.left;
                fArr2[1] = this.bottom;
                transformPoint(fArr6, this.globalTransform, fArr2);
                if (this.globalRect == null) {
                    this.globalRect = new Rect();
                }
                this.globalRect.set(Math.round(min(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(min(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(max(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(max(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.globalGeometryDirty = false;
            }
            int i10 = -1;
            for (SemanticsNode next : this.childrenInTraversalOrder) {
                next.previousNodeId = i10;
                i10 = next.id;
                next.updateRecursively(this.globalTransform, set, z10);
            }
        }

        /* access modifiers changed from: private */
        public void updateWith(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            this.hadPreviousConfig = true;
            this.previousValue = this.value;
            this.previousLabel = this.label;
            this.previousFlags = this.flags;
            this.previousActions = this.actions;
            this.previousTextSelectionBase = this.textSelectionBase;
            this.previousTextSelectionExtent = this.textSelectionExtent;
            this.previousScrollPosition = this.scrollPosition;
            this.previousScrollExtentMax = this.scrollExtentMax;
            this.previousScrollExtentMin = this.scrollExtentMin;
            this.flags = byteBuffer.getInt();
            this.actions = byteBuffer.getInt();
            this.maxValueLength = byteBuffer.getInt();
            this.currentValueLength = byteBuffer.getInt();
            this.textSelectionBase = byteBuffer.getInt();
            this.textSelectionExtent = byteBuffer.getInt();
            this.platformViewId = byteBuffer.getInt();
            this.scrollChildren = byteBuffer.getInt();
            this.scrollIndex = byteBuffer.getInt();
            this.scrollPosition = byteBuffer.getFloat();
            this.scrollExtentMax = byteBuffer.getFloat();
            this.scrollExtentMin = byteBuffer.getFloat();
            int i10 = byteBuffer.getInt();
            if (i10 == -1) {
                str = null;
            } else {
                str = strArr[i10];
            }
            this.label = str;
            this.labelAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i11 = byteBuffer.getInt();
            if (i11 == -1) {
                str2 = null;
            } else {
                str2 = strArr[i11];
            }
            this.value = str2;
            this.valueAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i12 = byteBuffer.getInt();
            if (i12 == -1) {
                str3 = null;
            } else {
                str3 = strArr[i12];
            }
            this.increasedValue = str3;
            this.increasedValueAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i13 = byteBuffer.getInt();
            if (i13 == -1) {
                str4 = null;
            } else {
                str4 = strArr[i13];
            }
            this.decreasedValue = str4;
            this.decreasedValueAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i14 = byteBuffer.getInt();
            if (i14 == -1) {
                str5 = null;
            } else {
                str5 = strArr[i14];
            }
            this.hint = str5;
            this.hintAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i15 = byteBuffer.getInt();
            if (i15 == -1) {
                str6 = null;
            } else {
                str6 = strArr[i15];
            }
            this.tooltip = str6;
            this.textDirection = TextDirection.fromInt(byteBuffer.getInt());
            this.left = byteBuffer.getFloat();
            this.top = byteBuffer.getFloat();
            this.right = byteBuffer.getFloat();
            this.bottom = byteBuffer.getFloat();
            if (this.transform == null) {
                this.transform = new float[16];
            }
            for (int i16 = 0; i16 < 16; i16++) {
                this.transform[i16] = byteBuffer.getFloat();
            }
            this.inverseTransformDirty = true;
            this.globalGeometryDirty = true;
            int i17 = byteBuffer.getInt();
            this.childrenInTraversalOrder.clear();
            this.childrenInHitTestOrder.clear();
            for (int i18 = 0; i18 < i17; i18++) {
                SemanticsNode access$6800 = this.accessibilityBridge.getOrCreateSemanticsNode(byteBuffer.getInt());
                access$6800.parent = this;
                this.childrenInTraversalOrder.add(access$6800);
            }
            for (int i19 = 0; i19 < i17; i19++) {
                SemanticsNode access$68002 = this.accessibilityBridge.getOrCreateSemanticsNode(byteBuffer.getInt());
                access$68002.parent = this;
                this.childrenInHitTestOrder.add(access$68002);
            }
            int i20 = byteBuffer.getInt();
            if (i20 == 0) {
                this.customAccessibilityActions = null;
                return;
            }
            List<CustomAccessibilityAction> list = this.customAccessibilityActions;
            if (list == null) {
                this.customAccessibilityActions = new ArrayList(i20);
            } else {
                list.clear();
            }
            for (int i21 = 0; i21 < i20; i21++) {
                CustomAccessibilityAction access$6900 = this.accessibilityBridge.getOrCreateAccessibilityAction(byteBuffer.getInt());
                if (access$6900.overrideId == Action.TAP.value) {
                    this.onTapOverride = access$6900;
                } else if (access$6900.overrideId == Action.LONG_PRESS.value) {
                    this.onLongPressOverride = access$6900;
                } else {
                    this.customAccessibilityActions.add(access$6900);
                }
                this.customAccessibilityActions.add(access$6900);
            }
        }
    }

    private static class SpellOutStringAttribute extends StringAttribute {
        private SpellOutStringAttribute() {
            super();
        }
    }

    private static class StringAttribute {
        int end;
        int start;
        StringAttributeType type;

        private StringAttribute() {
        }
    }

    private enum StringAttributeType {
        SPELLOUT,
        LOCALE
    }

    private enum TextDirection {
        UNKNOWN,
        LTR,
        RTL;

        public static TextDirection fromInt(int i10) {
            if (i10 == 1) {
                return RTL;
            }
            if (i10 != 2) {
                return UNKNOWN;
            }
            return LTR;
        }
    }

    public AccessibilityBridge(View view, AccessibilityChannel accessibilityChannel2, AccessibilityManager accessibilityManager2, ContentResolver contentResolver2, PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate2) {
        this(view, accessibilityChannel2, accessibilityManager2, contentResolver2, new AccessibilityViewEmbedder(view, 65536), platformViewsAccessibilityDelegate2);
    }

    static /* synthetic */ int access$1172(AccessibilityBridge accessibilityBridge, int i10) {
        int i11 = i10 & accessibilityBridge.accessibilityFeatureFlags;
        accessibilityBridge.accessibilityFeatureFlags = i11;
        return i11;
    }

    static /* synthetic */ int access$1176(AccessibilityBridge accessibilityBridge, int i10) {
        int i11 = i10 | accessibilityBridge.accessibilityFeatureFlags;
        accessibilityBridge.accessibilityFeatureFlags = i11;
        return i11;
    }

    private AccessibilityEvent createTextChangedEvent(int i10, String str, String str2) {
        AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(i10, 16);
        obtainAccessibilityEvent.setBeforeText(str);
        obtainAccessibilityEvent.getText().add(str2);
        int i11 = 0;
        while (i11 < str.length() && i11 < str2.length() && str.charAt(i11) == str2.charAt(i11)) {
            i11++;
        }
        if (i11 >= str.length() && i11 >= str2.length()) {
            return null;
        }
        obtainAccessibilityEvent.setFromIndex(i11);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i11 && length2 >= i11 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        obtainAccessibilityEvent.setRemovedCount((length - i11) + 1);
        obtainAccessibilityEvent.setAddedCount((length2 - i11) + 1);
        return obtainAccessibilityEvent;
    }

    @TargetApi(28)
    private boolean doesLayoutInDisplayCutoutModeRequireLeftInset() {
        Activity activity = ViewUtils.getActivity(this.rootAccessibilityView.getContext());
        if (activity == null || activity.getWindow() == null) {
            return false;
        }
        int i10 = activity.getWindow().getAttributes().layoutInDisplayCutoutMode;
        if (i10 == 2 || i10 == 0) {
            return true;
        }
        return false;
    }

    private Rect getBoundsInScreen(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.rootAccessibilityView.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    /* access modifiers changed from: private */
    public CustomAccessibilityAction getOrCreateAccessibilityAction(int i10) {
        CustomAccessibilityAction customAccessibilityAction = this.customAccessibilityActions.get(Integer.valueOf(i10));
        if (customAccessibilityAction != null) {
            return customAccessibilityAction;
        }
        CustomAccessibilityAction customAccessibilityAction2 = new CustomAccessibilityAction();
        int unused = customAccessibilityAction2.id = i10;
        int unused2 = customAccessibilityAction2.resourceId = FIRST_RESOURCE_ID + i10;
        this.customAccessibilityActions.put(Integer.valueOf(i10), customAccessibilityAction2);
        return customAccessibilityAction2;
    }

    /* access modifiers changed from: private */
    public SemanticsNode getOrCreateSemanticsNode(int i10) {
        SemanticsNode semanticsNode = this.flutterSemanticsTree.get(Integer.valueOf(i10));
        if (semanticsNode != null) {
            return semanticsNode;
        }
        SemanticsNode semanticsNode2 = new SemanticsNode(this);
        int unused = semanticsNode2.id = i10;
        this.flutterSemanticsTree.put(Integer.valueOf(i10), semanticsNode2);
        return semanticsNode2;
    }

    private SemanticsNode getRootSemanticsNode() {
        return this.flutterSemanticsTree.get(0);
    }

    private void handleTouchExploration(float f10, float f11, boolean z10) {
        SemanticsNode access$4500;
        if (!this.flutterSemanticsTree.isEmpty() && (access$4500 = getRootSemanticsNode().hitTest(new float[]{f10, f11, 0.0f, 1.0f}, z10)) != this.hoveredObject) {
            if (access$4500 != null) {
                sendAccessibilityEvent(access$4500.id, 128);
            }
            SemanticsNode semanticsNode = this.hoveredObject;
            if (semanticsNode != null) {
                sendAccessibilityEvent(semanticsNode.id, UserVerificationMethods.USER_VERIFY_HANDPRINT);
            }
            this.hoveredObject = access$4500;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$shouldSetCollectionInfo$0(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
        return semanticsNode2 == semanticsNode;
    }

    /* access modifiers changed from: private */
    public AccessibilityEvent obtainAccessibilityEvent(int i10, int i11) {
        AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(i11);
        obtainAccessibilityEvent.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtainAccessibilityEvent.setSource(this.rootAccessibilityView, i10);
        return obtainAccessibilityEvent;
    }

    /* access modifiers changed from: private */
    public void onTouchExplorationExit() {
        SemanticsNode semanticsNode = this.hoveredObject;
        if (semanticsNode != null) {
            sendAccessibilityEvent(semanticsNode.id, UserVerificationMethods.USER_VERIFY_HANDPRINT);
            this.hoveredObject = null;
        }
    }

    private void onWindowNameChange(SemanticsNode semanticsNode) {
        String access$6600 = semanticsNode.getRouteName();
        if (access$6600 == null) {
            access$6600 = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            setAccessibilityPaneTitle(access$6600);
            return;
        }
        AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(semanticsNode.id, 32);
        obtainAccessibilityEvent.getText().add(access$6600);
        sendAccessibilityEvent(obtainAccessibilityEvent);
    }

    @TargetApi(18)
    private boolean performCursorMoveAction(SemanticsNode semanticsNode, int i10, Bundle bundle, boolean z10) {
        int i11 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z11 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int access$2000 = semanticsNode.textSelectionBase;
        int access$2100 = semanticsNode.textSelectionExtent;
        predictCursorMovement(semanticsNode, i11, z10, z11);
        if (!(access$2000 == semanticsNode.textSelectionBase && access$2100 == semanticsNode.textSelectionExtent)) {
            String access$2400 = semanticsNode.value != null ? semanticsNode.value : "";
            AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(semanticsNode.id, 8192);
            obtainAccessibilityEvent.getText().add(access$2400);
            obtainAccessibilityEvent.setFromIndex(semanticsNode.textSelectionBase);
            obtainAccessibilityEvent.setToIndex(semanticsNode.textSelectionExtent);
            obtainAccessibilityEvent.setItemCount(access$2400.length());
            sendAccessibilityEvent(obtainAccessibilityEvent);
        }
        if (i11 == 1) {
            if (z10) {
                Action action = Action.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (semanticsNode.hasAction(action)) {
                    this.accessibilityChannel.dispatchSemanticsAction(i10, action, Boolean.valueOf(z11));
                    return true;
                }
            }
            if (z10) {
                return false;
            }
            Action action2 = Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!semanticsNode.hasAction(action2)) {
                return false;
            }
            this.accessibilityChannel.dispatchSemanticsAction(i10, action2, Boolean.valueOf(z11));
            return true;
        } else if (i11 == 2) {
            if (z10) {
                Action action3 = Action.MOVE_CURSOR_FORWARD_BY_WORD;
                if (semanticsNode.hasAction(action3)) {
                    this.accessibilityChannel.dispatchSemanticsAction(i10, action3, Boolean.valueOf(z11));
                    return true;
                }
            }
            if (z10) {
                return false;
            }
            Action action4 = Action.MOVE_CURSOR_BACKWARD_BY_WORD;
            if (!semanticsNode.hasAction(action4)) {
                return false;
            }
            this.accessibilityChannel.dispatchSemanticsAction(i10, action4, Boolean.valueOf(z11));
            return true;
        } else if (i11 == 4 || i11 == 8 || i11 == 16) {
            return true;
        } else {
            return false;
        }
    }

    @TargetApi(21)
    private boolean performSetText(SemanticsNode semanticsNode, int i10, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.accessibilityChannel.dispatchSemanticsAction(i10, Action.SET_TEXT, string);
        String unused = semanticsNode.value = string;
        List unused2 = semanticsNode.valueAttributes = null;
        return true;
    }

    private void predictCursorMovement(SemanticsNode semanticsNode, int i10, boolean z10, boolean z11) {
        if (semanticsNode.textSelectionExtent >= 0 && semanticsNode.textSelectionBase >= 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 == 8 || i10 == 16) {
                            if (z10) {
                                int unused = semanticsNode.textSelectionExtent = semanticsNode.value.length();
                            } else {
                                int unused2 = semanticsNode.textSelectionExtent = 0;
                            }
                        }
                    } else if (z10 && semanticsNode.textSelectionExtent < semanticsNode.value.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(semanticsNode.value.substring(semanticsNode.textSelectionExtent));
                        if (matcher.find()) {
                            SemanticsNode.access$2112(semanticsNode, matcher.start(1));
                        } else {
                            int unused3 = semanticsNode.textSelectionExtent = semanticsNode.value.length();
                        }
                    } else if (!z10 && semanticsNode.textSelectionExtent > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(semanticsNode.value.substring(0, semanticsNode.textSelectionExtent));
                        if (matcher2.find()) {
                            int unused4 = semanticsNode.textSelectionExtent = matcher2.start(1);
                        } else {
                            int unused5 = semanticsNode.textSelectionExtent = 0;
                        }
                    }
                } else if (z10 && semanticsNode.textSelectionExtent < semanticsNode.value.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(semanticsNode.value.substring(semanticsNode.textSelectionExtent));
                    matcher3.find();
                    if (matcher3.find()) {
                        SemanticsNode.access$2112(semanticsNode, matcher3.start(1));
                    } else {
                        int unused6 = semanticsNode.textSelectionExtent = semanticsNode.value.length();
                    }
                } else if (!z10 && semanticsNode.textSelectionExtent > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(semanticsNode.value.substring(0, semanticsNode.textSelectionExtent));
                    if (matcher4.find()) {
                        int unused7 = semanticsNode.textSelectionExtent = matcher4.start(1);
                    }
                }
            } else if (z10 && semanticsNode.textSelectionExtent < semanticsNode.value.length()) {
                SemanticsNode.access$2112(semanticsNode, 1);
            } else if (!z10 && semanticsNode.textSelectionExtent > 0) {
                SemanticsNode.access$2120(semanticsNode, 1);
            }
            if (!z11) {
                int unused8 = semanticsNode.textSelectionBase = semanticsNode.textSelectionExtent;
            }
        }
    }

    /* access modifiers changed from: private */
    public void sendLatestAccessibilityFlagsToFlutter() {
        this.accessibilityChannel.setAccessibilityFeatures(this.accessibilityFeatureFlags);
    }

    private void sendWindowContentChangeEvent(int i10) {
        AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(i10, 2048);
        if (Build.VERSION.SDK_INT >= 19) {
            obtainAccessibilityEvent.setContentChangeTypes(1);
        }
        sendAccessibilityEvent(obtainAccessibilityEvent);
    }

    @TargetApi(28)
    private void setAccessibilityPaneTitle(String str) {
        this.rootAccessibilityView.setAccessibilityPaneTitle(str);
    }

    /* access modifiers changed from: private */
    public void setAccessibleNavigation(boolean z10) {
        if (this.accessibleNavigation != z10) {
            this.accessibleNavigation = z10;
            if (z10) {
                this.accessibilityFeatureFlags |= AccessibilityFeature.ACCESSIBLE_NAVIGATION.value;
            } else {
                this.accessibilityFeatureFlags &= ~AccessibilityFeature.ACCESSIBLE_NAVIGATION.value;
            }
            sendLatestAccessibilityFlagsToFlutter();
        }
    }

    @TargetApi(31)
    private void setBoldTextFlag() {
        View view = this.rootAccessibilityView;
        if (view != null && view.getResources() != null) {
            int i10 = this.rootAccessibilityView.getResources().getConfiguration().fontWeightAdjustment;
            if (i10 != Integer.MAX_VALUE && i10 >= BOLD_TEXT_WEIGHT_ADJUSTMENT) {
                this.accessibilityFeatureFlags |= AccessibilityFeature.BOLD_TEXT.value;
            } else {
                this.accessibilityFeatureFlags &= AccessibilityFeature.BOLD_TEXT.value;
            }
            sendLatestAccessibilityFlagsToFlutter();
        }
    }

    private boolean shouldSetCollectionInfo(SemanticsNode semanticsNode) {
        return semanticsNode.scrollChildren > 0 && (SemanticsNode.nullableHasAncestor(this.accessibilityFocusedSemanticsNode, new a(semanticsNode)) || !SemanticsNode.nullableHasAncestor(this.accessibilityFocusedSemanticsNode, b.f15363a));
    }

    @TargetApi(19)
    private void willRemoveSemanticsNode(SemanticsNode semanticsNode) {
        View platformViewById;
        Integer num;
        SemanticsNode unused = semanticsNode.parent = null;
        if (!(semanticsNode.platformViewId == -1 || (num = this.embeddedAccessibilityFocusedNodeId) == null || this.accessibilityViewEmbedder.platformViewOfNode(num.intValue()) != this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode.platformViewId))) {
            sendAccessibilityEvent(this.embeddedAccessibilityFocusedNodeId.intValue(), 65536);
            this.embeddedAccessibilityFocusedNodeId = null;
        }
        if (!(semanticsNode.platformViewId == -1 || (platformViewById = this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode.platformViewId)) == null)) {
            platformViewById.setImportantForAccessibility(4);
        }
        SemanticsNode semanticsNode2 = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode2 == semanticsNode) {
            sendAccessibilityEvent(semanticsNode2.id, 65536);
            this.accessibilityFocusedSemanticsNode = null;
        }
        if (this.inputFocusedSemanticsNode == semanticsNode) {
            this.inputFocusedSemanticsNode = null;
        }
        if (this.hoveredObject == semanticsNode) {
            this.hoveredObject = null;
        }
    }

    @SuppressLint({"NewApi"})
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        int i11;
        SemanticsNode semanticsNode;
        int i12 = i10;
        boolean z10 = true;
        setAccessibleNavigation(true);
        if (i12 >= 65536) {
            return this.accessibilityViewEmbedder.createAccessibilityNodeInfo(i12);
        }
        if (i12 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView);
            this.rootAccessibilityView.onInitializeAccessibilityNodeInfo(obtain);
            if (this.flutterSemanticsTree.containsKey(0)) {
                obtain.addChild(this.rootAccessibilityView, 0);
            }
            return obtain;
        }
        SemanticsNode semanticsNode2 = this.flutterSemanticsTree.get(Integer.valueOf(i10));
        if (semanticsNode2 == null) {
            return null;
        }
        if (semanticsNode2.platformViewId == -1 || !this.platformViewsAccessibilityDelegate.usesVirtualDisplay(semanticsNode2.platformViewId)) {
            AccessibilityNodeInfo obtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(this.rootAccessibilityView, i12);
            int i13 = Build.VERSION.SDK_INT;
            String str = "";
            if (i13 >= 18) {
                obtainAccessibilityNodeInfo.setViewIdResourceName(str);
            }
            obtainAccessibilityNodeInfo.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
            obtainAccessibilityNodeInfo.setClassName("android.view.View");
            obtainAccessibilityNodeInfo.setSource(this.rootAccessibilityView, i12);
            obtainAccessibilityNodeInfo.setFocusable(semanticsNode2.isFocusable());
            SemanticsNode semanticsNode3 = this.inputFocusedSemanticsNode;
            if (semanticsNode3 != null) {
                obtainAccessibilityNodeInfo.setFocused(semanticsNode3.id == i12);
            }
            SemanticsNode semanticsNode4 = this.accessibilityFocusedSemanticsNode;
            if (semanticsNode4 != null) {
                obtainAccessibilityNodeInfo.setAccessibilityFocused(semanticsNode4.id == i12);
            }
            Flag flag = Flag.IS_TEXT_FIELD;
            if (semanticsNode2.hasFlag(flag)) {
                obtainAccessibilityNodeInfo.setPassword(semanticsNode2.hasFlag(Flag.IS_OBSCURED));
                Flag flag2 = Flag.IS_READ_ONLY;
                if (!semanticsNode2.hasFlag(flag2)) {
                    obtainAccessibilityNodeInfo.setClassName("android.widget.EditText");
                }
                if (i13 >= 18) {
                    obtainAccessibilityNodeInfo.setEditable(!semanticsNode2.hasFlag(flag2));
                    if (!(semanticsNode2.textSelectionBase == -1 || semanticsNode2.textSelectionExtent == -1)) {
                        obtainAccessibilityNodeInfo.setTextSelection(semanticsNode2.textSelectionBase, semanticsNode2.textSelectionExtent);
                    }
                    if (i13 > 18 && (semanticsNode = this.accessibilityFocusedSemanticsNode) != null && semanticsNode.id == i12) {
                        obtainAccessibilityNodeInfo.setLiveRegion(1);
                    }
                }
                if (semanticsNode2.hasAction(Action.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                    obtainAccessibilityNodeInfo.addAction(UserVerificationMethods.USER_VERIFY_HANDPRINT);
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                if (semanticsNode2.hasAction(Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                    obtainAccessibilityNodeInfo.addAction(512);
                    i11 |= 1;
                }
                if (semanticsNode2.hasAction(Action.MOVE_CURSOR_FORWARD_BY_WORD)) {
                    obtainAccessibilityNodeInfo.addAction(UserVerificationMethods.USER_VERIFY_HANDPRINT);
                    i11 |= 2;
                }
                if (semanticsNode2.hasAction(Action.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                    obtainAccessibilityNodeInfo.addAction(512);
                    i11 |= 2;
                }
                obtainAccessibilityNodeInfo.setMovementGranularities(i11);
                if (i13 >= 21 && semanticsNode2.maxValueLength >= 0) {
                    int length = semanticsNode2.value == null ? 0 : semanticsNode2.value.length();
                    int unused = semanticsNode2.currentValueLength;
                    int unused2 = semanticsNode2.maxValueLength;
                    obtainAccessibilityNodeInfo.setMaxTextLength((length - semanticsNode2.currentValueLength) + semanticsNode2.maxValueLength);
                }
            }
            if (i13 > 18) {
                if (semanticsNode2.hasAction(Action.SET_SELECTION)) {
                    obtainAccessibilityNodeInfo.addAction(131072);
                }
                if (semanticsNode2.hasAction(Action.COPY)) {
                    obtainAccessibilityNodeInfo.addAction(16384);
                }
                if (semanticsNode2.hasAction(Action.CUT)) {
                    obtainAccessibilityNodeInfo.addAction(65536);
                }
                if (semanticsNode2.hasAction(Action.PASTE)) {
                    obtainAccessibilityNodeInfo.addAction(32768);
                }
            }
            if (i13 >= 21 && semanticsNode2.hasAction(Action.SET_TEXT)) {
                obtainAccessibilityNodeInfo.addAction(2097152);
            }
            if (semanticsNode2.hasFlag(Flag.IS_BUTTON) || semanticsNode2.hasFlag(Flag.IS_LINK)) {
                obtainAccessibilityNodeInfo.setClassName("android.widget.Button");
            }
            if (semanticsNode2.hasFlag(Flag.IS_IMAGE)) {
                obtainAccessibilityNodeInfo.setClassName("android.widget.ImageView");
            }
            if (i13 > 18 && semanticsNode2.hasAction(Action.DISMISS)) {
                obtainAccessibilityNodeInfo.setDismissable(true);
                obtainAccessibilityNodeInfo.addAction(1048576);
            }
            if (semanticsNode2.parent != null) {
                obtainAccessibilityNodeInfo.setParent(this.rootAccessibilityView, semanticsNode2.parent.id);
            } else {
                obtainAccessibilityNodeInfo.setParent(this.rootAccessibilityView);
            }
            if (semanticsNode2.previousNodeId != -1 && i13 >= 22) {
                obtainAccessibilityNodeInfo.setTraversalAfter(this.rootAccessibilityView, semanticsNode2.previousNodeId);
            }
            Rect access$1700 = semanticsNode2.getGlobalRect();
            if (semanticsNode2.parent != null) {
                Rect access$17002 = semanticsNode2.parent.getGlobalRect();
                Rect rect = new Rect(access$1700);
                rect.offset(-access$17002.left, -access$17002.top);
                obtainAccessibilityNodeInfo.setBoundsInParent(rect);
            } else {
                obtainAccessibilityNodeInfo.setBoundsInParent(access$1700);
            }
            obtainAccessibilityNodeInfo.setBoundsInScreen(getBoundsInScreen(access$1700));
            obtainAccessibilityNodeInfo.setVisibleToUser(true);
            obtainAccessibilityNodeInfo.setEnabled(!semanticsNode2.hasFlag(Flag.HAS_ENABLED_STATE) || semanticsNode2.hasFlag(Flag.IS_ENABLED));
            if (semanticsNode2.hasAction(Action.TAP)) {
                if (i13 < 21 || semanticsNode2.onTapOverride == null) {
                    obtainAccessibilityNodeInfo.addAction(16);
                    obtainAccessibilityNodeInfo.setClickable(true);
                } else {
                    obtainAccessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, semanticsNode2.onTapOverride.hint));
                    obtainAccessibilityNodeInfo.setClickable(true);
                }
            }
            if (semanticsNode2.hasAction(Action.LONG_PRESS)) {
                if (i13 < 21 || semanticsNode2.onLongPressOverride == null) {
                    obtainAccessibilityNodeInfo.addAction(32);
                    obtainAccessibilityNodeInfo.setLongClickable(true);
                } else {
                    obtainAccessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, semanticsNode2.onLongPressOverride.hint));
                    obtainAccessibilityNodeInfo.setLongClickable(true);
                }
            }
            Action action = Action.SCROLL_LEFT;
            if (semanticsNode2.hasAction(action) || semanticsNode2.hasAction(Action.SCROLL_UP) || semanticsNode2.hasAction(Action.SCROLL_RIGHT) || semanticsNode2.hasAction(Action.SCROLL_DOWN)) {
                obtainAccessibilityNodeInfo.setScrollable(true);
                if (semanticsNode2.hasFlag(Flag.HAS_IMPLICIT_SCROLLING)) {
                    if (semanticsNode2.hasAction(action) || semanticsNode2.hasAction(Action.SCROLL_RIGHT)) {
                        if (i13 <= 19 || !shouldSetCollectionInfo(semanticsNode2)) {
                            obtainAccessibilityNodeInfo.setClassName("android.widget.HorizontalScrollView");
                        } else {
                            obtainAccessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, semanticsNode2.scrollChildren, false));
                        }
                        if (semanticsNode2.hasAction(action) || semanticsNode2.hasAction(Action.SCROLL_UP)) {
                            obtainAccessibilityNodeInfo.addAction(4096);
                        }
                        if (semanticsNode2.hasAction(Action.SCROLL_RIGHT) || semanticsNode2.hasAction(Action.SCROLL_DOWN)) {
                            obtainAccessibilityNodeInfo.addAction(8192);
                        }
                    } else if (i13 <= 18 || !shouldSetCollectionInfo(semanticsNode2)) {
                        obtainAccessibilityNodeInfo.setClassName("android.widget.ScrollView");
                    } else {
                        obtainAccessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(semanticsNode2.scrollChildren, 0, false));
                    }
                }
                obtainAccessibilityNodeInfo.addAction(4096);
                obtainAccessibilityNodeInfo.addAction(8192);
            }
            Action action2 = Action.INCREASE;
            if (semanticsNode2.hasAction(action2) || semanticsNode2.hasAction(Action.DECREASE)) {
                obtainAccessibilityNodeInfo.setClassName("android.widget.SeekBar");
                if (semanticsNode2.hasAction(action2)) {
                    obtainAccessibilityNodeInfo.addAction(4096);
                }
                if (semanticsNode2.hasAction(Action.DECREASE)) {
                    obtainAccessibilityNodeInfo.addAction(8192);
                }
            }
            if (semanticsNode2.hasFlag(Flag.IS_LIVE_REGION) && i13 > 18) {
                obtainAccessibilityNodeInfo.setLiveRegion(1);
            }
            if (semanticsNode2.hasFlag(flag)) {
                obtainAccessibilityNodeInfo.setText(semanticsNode2.getValue());
                if (i13 >= 28) {
                    obtainAccessibilityNodeInfo.setHintText(semanticsNode2.getTextFieldHint());
                }
            } else if (!semanticsNode2.hasFlag(Flag.SCOPES_ROUTE)) {
                CharSequence access$3300 = semanticsNode2.getValueLabelHint();
                String str2 = access$3300;
                if (i13 < 28) {
                    str2 = access$3300;
                    if (semanticsNode2.tooltip != null) {
                        if (access$3300 != null) {
                            str = access$3300;
                        }
                        str2 = str + "\n" + semanticsNode2.tooltip;
                    }
                }
                if (str2 != null) {
                    obtainAccessibilityNodeInfo.setContentDescription(str2);
                }
            }
            if (i13 >= 28 && semanticsNode2.tooltip != null) {
                obtainAccessibilityNodeInfo.setTooltipText(semanticsNode2.tooltip);
            }
            boolean access$1900 = semanticsNode2.hasFlag(Flag.HAS_CHECKED_STATE);
            boolean access$19002 = semanticsNode2.hasFlag(Flag.HAS_TOGGLED_STATE);
            if (!access$1900 && !access$19002) {
                z10 = false;
            }
            obtainAccessibilityNodeInfo.setCheckable(z10);
            if (access$1900) {
                obtainAccessibilityNodeInfo.setChecked(semanticsNode2.hasFlag(Flag.IS_CHECKED));
                if (semanticsNode2.hasFlag(Flag.IS_IN_MUTUALLY_EXCLUSIVE_GROUP)) {
                    obtainAccessibilityNodeInfo.setClassName("android.widget.RadioButton");
                } else {
                    obtainAccessibilityNodeInfo.setClassName("android.widget.CheckBox");
                }
            } else if (access$19002) {
                obtainAccessibilityNodeInfo.setChecked(semanticsNode2.hasFlag(Flag.IS_TOGGLED));
                obtainAccessibilityNodeInfo.setClassName("android.widget.Switch");
            }
            obtainAccessibilityNodeInfo.setSelected(semanticsNode2.hasFlag(Flag.IS_SELECTED));
            if (i13 >= 28) {
                obtainAccessibilityNodeInfo.setHeading(semanticsNode2.hasFlag(Flag.IS_HEADER));
            }
            SemanticsNode semanticsNode5 = this.accessibilityFocusedSemanticsNode;
            if (semanticsNode5 == null || semanticsNode5.id != i12) {
                obtainAccessibilityNodeInfo.addAction(64);
            } else {
                obtainAccessibilityNodeInfo.addAction(128);
            }
            if (i13 >= 21 && semanticsNode2.customAccessibilityActions != null) {
                for (CustomAccessibilityAction customAccessibilityAction : semanticsNode2.customAccessibilityActions) {
                    obtainAccessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(customAccessibilityAction.resourceId, customAccessibilityAction.label));
                }
            }
            for (SemanticsNode semanticsNode6 : semanticsNode2.childrenInTraversalOrder) {
                if (!semanticsNode6.hasFlag(Flag.IS_HIDDEN)) {
                    if (semanticsNode6.platformViewId != -1) {
                        View platformViewById = this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode6.platformViewId);
                        if (!this.platformViewsAccessibilityDelegate.usesVirtualDisplay(semanticsNode6.platformViewId)) {
                            obtainAccessibilityNodeInfo.addChild(platformViewById);
                        }
                    }
                    obtainAccessibilityNodeInfo.addChild(this.rootAccessibilityView, semanticsNode6.id);
                }
            }
            return obtainAccessibilityNodeInfo;
        }
        View platformViewById2 = this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode2.platformViewId);
        if (platformViewById2 == null) {
            return null;
        }
        return this.accessibilityViewEmbedder.getRootNode(platformViewById2, semanticsNode2.id, semanticsNode2.getGlobalRect());
    }

    @SuppressLint({"SwitchIntDef"})
    public boolean externalViewRequestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (!this.accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.embeddedInputFocusedNodeId = recordFlutterId;
            this.inputFocusedSemanticsNode = null;
            return true;
        } else if (eventType == 128) {
            this.hoveredObject = null;
            return true;
        } else if (eventType == 32768) {
            this.embeddedAccessibilityFocusedNodeId = recordFlutterId;
            this.accessibilityFocusedSemanticsNode = null;
            return true;
        } else if (eventType != 65536) {
            return true;
        } else {
            this.embeddedInputFocusedNodeId = null;
            this.embeddedAccessibilityFocusedNodeId = null;
            return true;
        }
    }

    public AccessibilityNodeInfo findFocus(int i10) {
        if (i10 == 1) {
            SemanticsNode semanticsNode = this.inputFocusedSemanticsNode;
            if (semanticsNode != null) {
                return createAccessibilityNodeInfo(semanticsNode.id);
            }
            Integer num = this.embeddedInputFocusedNodeId;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i10 != 2) {
            return null;
        }
        SemanticsNode semanticsNode2 = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode2 != null) {
            return createAccessibilityNodeInfo(semanticsNode2.id);
        }
        Integer num2 = this.embeddedAccessibilityFocusedNodeId;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public boolean getAccessibleNavigation() {
        return this.accessibleNavigation;
    }

    public int getHoveredObjectId() {
        return this.hoveredObject.id;
    }

    public boolean isAccessibilityEnabled() {
        return this.accessibilityManager.isEnabled();
    }

    public boolean isTouchExplorationEnabled() {
        return this.accessibilityManager.isTouchExplorationEnabled();
    }

    public AccessibilityNodeInfo obtainAccessibilityNodeInfo(View view, int i10) {
        return AccessibilityNodeInfo.obtain(view, i10);
    }

    public boolean onAccessibilityHoverEvent(MotionEvent motionEvent) {
        return onAccessibilityHoverEvent(motionEvent, false);
    }

    public boolean performAction(int i10, int i11, Bundle bundle) {
        if (i10 >= 65536) {
            boolean performAction = this.accessibilityViewEmbedder.performAction(i10, i11, bundle);
            if (performAction && i11 == 128) {
                this.embeddedAccessibilityFocusedNodeId = null;
            }
            return performAction;
        }
        SemanticsNode semanticsNode = this.flutterSemanticsTree.get(Integer.valueOf(i10));
        boolean z10 = false;
        if (semanticsNode == null) {
            return false;
        }
        switch (i11) {
            case 16:
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.TAP);
                return true;
            case 32:
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.LONG_PRESS);
                return true;
            case 64:
                if (this.accessibilityFocusedSemanticsNode == null) {
                    this.rootAccessibilityView.invalidate();
                }
                this.accessibilityFocusedSemanticsNode = semanticsNode;
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.DID_GAIN_ACCESSIBILITY_FOCUS);
                sendAccessibilityEvent(i10, 32768);
                if (semanticsNode.hasAction(Action.INCREASE) || semanticsNode.hasAction(Action.DECREASE)) {
                    sendAccessibilityEvent(i10, 4);
                }
                return true;
            case 128:
                SemanticsNode semanticsNode2 = this.accessibilityFocusedSemanticsNode;
                if (semanticsNode2 != null && semanticsNode2.id == i10) {
                    this.accessibilityFocusedSemanticsNode = null;
                }
                Integer num = this.embeddedAccessibilityFocusedNodeId;
                if (num != null && num.intValue() == i10) {
                    this.embeddedAccessibilityFocusedNodeId = null;
                }
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.DID_LOSE_ACCESSIBILITY_FOCUS);
                sendAccessibilityEvent(i10, 65536);
                return true;
            case UserVerificationMethods.USER_VERIFY_HANDPRINT:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return performCursorMoveAction(semanticsNode, i10, bundle, true);
            case 512:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return performCursorMoveAction(semanticsNode, i10, bundle, false);
            case 4096:
                Action action = Action.SCROLL_UP;
                if (semanticsNode.hasAction(action)) {
                    this.accessibilityChannel.dispatchSemanticsAction(i10, action);
                } else {
                    Action action2 = Action.SCROLL_LEFT;
                    if (semanticsNode.hasAction(action2)) {
                        this.accessibilityChannel.dispatchSemanticsAction(i10, action2);
                    } else {
                        Action action3 = Action.INCREASE;
                        if (!semanticsNode.hasAction(action3)) {
                            return false;
                        }
                        String unused = semanticsNode.value = semanticsNode.increasedValue;
                        List unused2 = semanticsNode.valueAttributes = semanticsNode.increasedValueAttributes;
                        sendAccessibilityEvent(i10, 4);
                        this.accessibilityChannel.dispatchSemanticsAction(i10, action3);
                    }
                }
                return true;
            case 8192:
                Action action4 = Action.SCROLL_DOWN;
                if (semanticsNode.hasAction(action4)) {
                    this.accessibilityChannel.dispatchSemanticsAction(i10, action4);
                } else {
                    Action action5 = Action.SCROLL_RIGHT;
                    if (semanticsNode.hasAction(action5)) {
                        this.accessibilityChannel.dispatchSemanticsAction(i10, action5);
                    } else {
                        Action action6 = Action.DECREASE;
                        if (!semanticsNode.hasAction(action6)) {
                            return false;
                        }
                        String unused3 = semanticsNode.value = semanticsNode.decreasedValue;
                        List unused4 = semanticsNode.valueAttributes = semanticsNode.decreasedValueAttributes;
                        sendAccessibilityEvent(i10, 4);
                        this.accessibilityChannel.dispatchSemanticsAction(i10, action6);
                    }
                }
                return true;
            case 16384:
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.COPY);
                return true;
            case 32768:
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.PASTE);
                return true;
            case 65536:
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.CUT);
                return true;
            case 131072:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                HashMap hashMap = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z10 = true;
                }
                if (z10) {
                    hashMap.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap.put("base", Integer.valueOf(semanticsNode.textSelectionExtent));
                    hashMap.put("extent", Integer.valueOf(semanticsNode.textSelectionExtent));
                }
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.SET_SELECTION, hashMap);
                SemanticsNode semanticsNode3 = this.flutterSemanticsTree.get(Integer.valueOf(i10));
                int unused5 = semanticsNode3.textSelectionBase = ((Integer) hashMap.get("base")).intValue();
                int unused6 = semanticsNode3.textSelectionExtent = ((Integer) hashMap.get("extent")).intValue();
                return true;
            case 1048576:
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.DISMISS);
                return true;
            case 2097152:
                if (Build.VERSION.SDK_INT < 21) {
                    return false;
                }
                return performSetText(semanticsNode, i10, bundle);
            case ACTION_SHOW_ON_SCREEN /*16908342*/:
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.SHOW_ON_SCREEN);
                return true;
            default:
                CustomAccessibilityAction customAccessibilityAction = this.customAccessibilityActions.get(Integer.valueOf(i11 - FIRST_RESOURCE_ID));
                if (customAccessibilityAction == null) {
                    return false;
                }
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.CUSTOM_ACTION, Integer.valueOf(customAccessibilityAction.id));
                return true;
        }
    }

    public void release() {
        this.isReleased = true;
        this.platformViewsAccessibilityDelegate.detachAccessibilityBridge();
        setOnAccessibilityChangeListener((OnAccessibilityChangeListener) null);
        this.accessibilityManager.removeAccessibilityStateChangeListener(this.accessibilityStateChangeListener);
        if (Build.VERSION.SDK_INT >= 19) {
            this.accessibilityManager.removeTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        }
        this.contentResolver.unregisterContentObserver(this.animationScaleObserver);
        this.accessibilityChannel.setAccessibilityMessageHandler((AccessibilityChannel.AccessibilityMessageHandler) null);
    }

    public void reset() {
        this.flutterSemanticsTree.clear();
        SemanticsNode semanticsNode = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode != null) {
            sendAccessibilityEvent(semanticsNode.id, 65536);
        }
        this.accessibilityFocusedSemanticsNode = null;
        this.hoveredObject = null;
        sendWindowContentChangeEvent(0);
    }

    public void sendAccessibilityEvent(int i10, int i11) {
        if (this.accessibilityManager.isEnabled()) {
            sendAccessibilityEvent(obtainAccessibilityEvent(i10, i11));
        }
    }

    public void setOnAccessibilityChangeListener(OnAccessibilityChangeListener onAccessibilityChangeListener2) {
        this.onAccessibilityChangeListener = onAccessibilityChangeListener2;
    }

    /* access modifiers changed from: package-private */
    public void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        String str;
        while (byteBuffer.hasRemaining()) {
            CustomAccessibilityAction orCreateAccessibilityAction = getOrCreateAccessibilityAction(byteBuffer.getInt());
            int unused = orCreateAccessibilityAction.overrideId = byteBuffer.getInt();
            int i10 = byteBuffer.getInt();
            String str2 = null;
            if (i10 == -1) {
                str = null;
            } else {
                str = strArr[i10];
            }
            String unused2 = orCreateAccessibilityAction.label = str;
            int i11 = byteBuffer.getInt();
            if (i11 != -1) {
                str2 = strArr[i11];
            }
            String unused3 = orCreateAccessibilityAction.hint = str2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: io.flutter.view.AccessibilityBridge$SemanticsNode} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateSemantics(java.nio.ByteBuffer r9, java.lang.String[] r10, java.nio.ByteBuffer[] r11) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0005:
            boolean r1 = r9.hasRemaining()
            r2 = 0
            if (r1 == 0) goto L_0x0056
            int r1 = r9.getInt()
            io.flutter.view.AccessibilityBridge$SemanticsNode r1 = r8.getOrCreateSemanticsNode(r1)
            r1.updateWith(r9, r10, r11)
            io.flutter.view.AccessibilityBridge$Flag r3 = io.flutter.view.AccessibilityBridge.Flag.IS_HIDDEN
            boolean r3 = r1.hasFlag(r3)
            if (r3 == 0) goto L_0x0020
            goto L_0x0005
        L_0x0020:
            io.flutter.view.AccessibilityBridge$Flag r3 = io.flutter.view.AccessibilityBridge.Flag.IS_FOCUSED
            boolean r3 = r1.hasFlag(r3)
            if (r3 == 0) goto L_0x002a
            r8.inputFocusedSemanticsNode = r1
        L_0x002a:
            boolean r3 = r1.hadPreviousConfig
            if (r3 == 0) goto L_0x0033
            r0.add(r1)
        L_0x0033:
            int r3 = r1.platformViewId
            r4 = -1
            if (r3 == r4) goto L_0x0005
            io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate r3 = r8.platformViewsAccessibilityDelegate
            int r4 = r1.platformViewId
            boolean r3 = r3.usesVirtualDisplay(r4)
            if (r3 != 0) goto L_0x0005
            io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate r3 = r8.platformViewsAccessibilityDelegate
            int r1 = r1.platformViewId
            android.view.View r1 = r3.getPlatformViewById(r1)
            if (r1 == 0) goto L_0x0005
            r1.setImportantForAccessibility(r2)
            goto L_0x0005
        L_0x0056:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            io.flutter.view.AccessibilityBridge$SemanticsNode r10 = r8.getRootSemanticsNode()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r1 = 1
            if (r10 == 0) goto L_0x00b7
            r3 = 16
            float[] r3 = new float[r3]
            android.opengl.Matrix.setIdentityM(r3, r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 < r5) goto L_0x00b1
            r5 = 28
            if (r4 < r5) goto L_0x007d
            boolean r4 = r8.doesLayoutInDisplayCutoutModeRequireLeftInset()
            goto L_0x007e
        L_0x007d:
            r4 = 1
        L_0x007e:
            if (r4 == 0) goto L_0x00b1
            android.view.View r4 = r8.rootAccessibilityView
            android.view.WindowInsets r4 = r4.getRootWindowInsets()
            if (r4 == 0) goto L_0x00b1
            java.lang.Integer r5 = r8.lastLeftFrameInset
            int r6 = r4.getSystemWindowInsetLeft()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x009e
            boolean unused = r10.globalGeometryDirty = r1
            boolean unused = r10.inverseTransformDirty = r1
        L_0x009e:
            int r4 = r4.getSystemWindowInsetLeft()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8.lastLeftFrameInset = r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            r5 = 0
            android.opengl.Matrix.translateM(r3, r2, r4, r5, r5)
        L_0x00b1:
            r10.updateRecursively(r3, r9, r2)
            r10.collectRoutes(r11)
        L_0x00b7:
            java.util.Iterator r10 = r11.iterator()
            r3 = 0
            r4 = r3
        L_0x00bd:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x00db
            java.lang.Object r5 = r10.next()
            io.flutter.view.AccessibilityBridge$SemanticsNode r5 = (io.flutter.view.AccessibilityBridge.SemanticsNode) r5
            java.util.List<java.lang.Integer> r6 = r8.flutterNavigationStack
            int r7 = r5.id
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x00bd
            r4 = r5
            goto L_0x00bd
        L_0x00db:
            if (r4 != 0) goto L_0x00ef
            int r10 = r11.size()
            if (r10 <= 0) goto L_0x00ef
            int r10 = r11.size()
            int r10 = r10 - r1
            java.lang.Object r10 = r11.get(r10)
            r4 = r10
            io.flutter.view.AccessibilityBridge$SemanticsNode r4 = (io.flutter.view.AccessibilityBridge.SemanticsNode) r4
        L_0x00ef:
            if (r4 == 0) goto L_0x010e
            int r10 = r4.id
            int r5 = r8.previousRouteId
            if (r10 != r5) goto L_0x0105
            int r10 = r11.size()
            java.util.List<java.lang.Integer> r5 = r8.flutterNavigationStack
            int r5 = r5.size()
            if (r10 == r5) goto L_0x010e
        L_0x0105:
            int r10 = r4.id
            r8.previousRouteId = r10
            r8.onWindowNameChange(r4)
        L_0x010e:
            java.util.List<java.lang.Integer> r10 = r8.flutterNavigationStack
            r10.clear()
            java.util.Iterator r10 = r11.iterator()
        L_0x0117:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0131
            java.lang.Object r11 = r10.next()
            io.flutter.view.AccessibilityBridge$SemanticsNode r11 = (io.flutter.view.AccessibilityBridge.SemanticsNode) r11
            java.util.List<java.lang.Integer> r4 = r8.flutterNavigationStack
            int r11 = r11.id
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r4.add(r11)
            goto L_0x0117
        L_0x0131:
            java.util.Map<java.lang.Integer, io.flutter.view.AccessibilityBridge$SemanticsNode> r10 = r8.flutterSemanticsTree
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x013b:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x015a
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r11 = r11.getValue()
            io.flutter.view.AccessibilityBridge$SemanticsNode r11 = (io.flutter.view.AccessibilityBridge.SemanticsNode) r11
            boolean r4 = r9.contains(r11)
            if (r4 != 0) goto L_0x013b
            r8.willRemoveSemanticsNode(r11)
            r10.remove()
            goto L_0x013b
        L_0x015a:
            r8.sendWindowContentChangeEvent(r2)
            java.util.Iterator r9 = r0.iterator()
        L_0x0161:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0340
            java.lang.Object r10 = r9.next()
            io.flutter.view.AccessibilityBridge$SemanticsNode r10 = (io.flutter.view.AccessibilityBridge.SemanticsNode) r10
            boolean r11 = r10.didScroll()
            if (r11 == 0) goto L_0x0232
            int r11 = r10.id
            r0 = 4096(0x1000, float:5.74E-42)
            android.view.accessibility.AccessibilityEvent r11 = r8.obtainAccessibilityEvent(r11, r0)
            float r0 = r10.scrollPosition
            float r4 = r10.scrollExtentMax
            float r5 = r10.scrollExtentMax
            boolean r5 = java.lang.Float.isInfinite(r5)
            r6 = 1200142336(0x4788b800, float:70000.0)
            r7 = 1203982336(0x47c35000, float:100000.0)
            if (r5 == 0) goto L_0x019f
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x019c
            r0 = 1200142336(0x4788b800, float:70000.0)
        L_0x019c:
            r4 = 1203982336(0x47c35000, float:100000.0)
        L_0x019f:
            float r5 = r10.scrollExtentMin
            boolean r5 = java.lang.Float.isInfinite(r5)
            if (r5 == 0) goto L_0x01b6
            float r4 = r4 + r7
            r5 = -947341312(0xffffffffc788b800, float:-70000.0)
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x01b4
            r0 = -947341312(0xffffffffc788b800, float:-70000.0)
        L_0x01b4:
            float r0 = r0 + r7
            goto L_0x01c0
        L_0x01b6:
            float r5 = r10.scrollExtentMin
            float r4 = r4 - r5
            float r5 = r10.scrollExtentMin
            float r0 = r0 - r5
        L_0x01c0:
            io.flutter.view.AccessibilityBridge$Action r5 = io.flutter.view.AccessibilityBridge.Action.SCROLL_UP
            boolean r5 = r10.hadAction(r5)
            if (r5 != 0) goto L_0x01ea
            io.flutter.view.AccessibilityBridge$Action r5 = io.flutter.view.AccessibilityBridge.Action.SCROLL_DOWN
            boolean r5 = r10.hadAction(r5)
            if (r5 == 0) goto L_0x01d1
            goto L_0x01ea
        L_0x01d1:
            io.flutter.view.AccessibilityBridge$Action r5 = io.flutter.view.AccessibilityBridge.Action.SCROLL_LEFT
            boolean r5 = r10.hadAction(r5)
            if (r5 != 0) goto L_0x01e1
            io.flutter.view.AccessibilityBridge$Action r5 = io.flutter.view.AccessibilityBridge.Action.SCROLL_RIGHT
            boolean r5 = r10.hadAction(r5)
            if (r5 == 0) goto L_0x01f2
        L_0x01e1:
            int r0 = (int) r0
            r11.setScrollX(r0)
            int r0 = (int) r4
            r11.setMaxScrollX(r0)
            goto L_0x01f2
        L_0x01ea:
            int r0 = (int) r0
            r11.setScrollY(r0)
            int r0 = (int) r4
            r11.setMaxScrollY(r0)
        L_0x01f2:
            int r0 = r10.scrollChildren
            if (r0 <= 0) goto L_0x022f
            int r0 = r10.scrollChildren
            r11.setItemCount(r0)
            int r0 = r10.scrollIndex
            r11.setFromIndex(r0)
            java.util.List r0 = r10.childrenInHitTestOrder
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
        L_0x020f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0226
            java.lang.Object r5 = r0.next()
            io.flutter.view.AccessibilityBridge$SemanticsNode r5 = (io.flutter.view.AccessibilityBridge.SemanticsNode) r5
            io.flutter.view.AccessibilityBridge$Flag r6 = io.flutter.view.AccessibilityBridge.Flag.IS_HIDDEN
            boolean r5 = r5.hasFlag(r6)
            if (r5 != 0) goto L_0x020f
            int r4 = r4 + 1
            goto L_0x020f
        L_0x0226:
            int r0 = r10.scrollIndex
            int r0 = r0 + r4
            int r0 = r0 - r1
            r11.setToIndex(r0)
        L_0x022f:
            r8.sendAccessibilityEvent(r11)
        L_0x0232:
            io.flutter.view.AccessibilityBridge$Flag r11 = io.flutter.view.AccessibilityBridge.Flag.IS_LIVE_REGION
            boolean r11 = r10.hasFlag(r11)
            if (r11 == 0) goto L_0x0247
            boolean r11 = r10.didChangeLabel()
            if (r11 == 0) goto L_0x0247
            int r11 = r10.id
            r8.sendWindowContentChangeEvent(r11)
        L_0x0247:
            io.flutter.view.AccessibilityBridge$SemanticsNode r11 = r8.accessibilityFocusedSemanticsNode
            if (r11 == 0) goto L_0x027a
            int r11 = r11.id
            int r0 = r10.id
            if (r11 != r0) goto L_0x027a
            io.flutter.view.AccessibilityBridge$Flag r11 = io.flutter.view.AccessibilityBridge.Flag.IS_SELECTED
            boolean r0 = r10.hadFlag(r11)
            if (r0 != 0) goto L_0x027a
            boolean r11 = r10.hasFlag(r11)
            if (r11 == 0) goto L_0x027a
            int r11 = r10.id
            r0 = 4
            android.view.accessibility.AccessibilityEvent r11 = r8.obtainAccessibilityEvent(r11, r0)
            java.util.List r0 = r11.getText()
            java.lang.String r4 = r10.label
            r0.add(r4)
            r8.sendAccessibilityEvent(r11)
        L_0x027a:
            io.flutter.view.AccessibilityBridge$SemanticsNode r11 = r8.inputFocusedSemanticsNode
            if (r11 == 0) goto L_0x02aa
            int r11 = r11.id
            int r0 = r10.id
            if (r11 != r0) goto L_0x02aa
            io.flutter.view.AccessibilityBridge$SemanticsNode r11 = r8.lastInputFocusedSemanticsNode
            if (r11 == 0) goto L_0x0298
            int r11 = r11.id
            io.flutter.view.AccessibilityBridge$SemanticsNode r0 = r8.inputFocusedSemanticsNode
            int r0 = r0.id
            if (r11 == r0) goto L_0x02aa
        L_0x0298:
            io.flutter.view.AccessibilityBridge$SemanticsNode r11 = r8.inputFocusedSemanticsNode
            r8.lastInputFocusedSemanticsNode = r11
            int r11 = r10.id
            r0 = 8
            android.view.accessibility.AccessibilityEvent r11 = r8.obtainAccessibilityEvent(r11, r0)
            r8.sendAccessibilityEvent(r11)
            goto L_0x02b0
        L_0x02aa:
            io.flutter.view.AccessibilityBridge$SemanticsNode r11 = r8.inputFocusedSemanticsNode
            if (r11 != 0) goto L_0x02b0
            r8.lastInputFocusedSemanticsNode = r3
        L_0x02b0:
            io.flutter.view.AccessibilityBridge$SemanticsNode r11 = r8.inputFocusedSemanticsNode
            if (r11 == 0) goto L_0x0161
            int r11 = r11.id
            int r0 = r10.id
            if (r11 != r0) goto L_0x0161
            io.flutter.view.AccessibilityBridge$Flag r11 = io.flutter.view.AccessibilityBridge.Flag.IS_TEXT_FIELD
            boolean r0 = r10.hadFlag(r11)
            if (r0 == 0) goto L_0x0161
            boolean r11 = r10.hasFlag(r11)
            if (r11 == 0) goto L_0x0161
            io.flutter.view.AccessibilityBridge$SemanticsNode r11 = r8.accessibilityFocusedSemanticsNode
            if (r11 == 0) goto L_0x02dc
            int r11 = r11.id
            io.flutter.view.AccessibilityBridge$SemanticsNode r0 = r8.inputFocusedSemanticsNode
            int r0 = r0.id
            if (r11 != r0) goto L_0x0161
        L_0x02dc:
            java.lang.String r11 = r10.previousValue
            java.lang.String r0 = ""
            if (r11 == 0) goto L_0x02e9
            java.lang.String r11 = r10.previousValue
            goto L_0x02ea
        L_0x02e9:
            r11 = r0
        L_0x02ea:
            java.lang.String r4 = r10.value
            if (r4 == 0) goto L_0x02f4
            java.lang.String r0 = r10.value
        L_0x02f4:
            int r4 = r10.id
            android.view.accessibility.AccessibilityEvent r11 = r8.createTextChangedEvent(r4, r11, r0)
            if (r11 == 0) goto L_0x0301
            r8.sendAccessibilityEvent(r11)
        L_0x0301:
            int r11 = r10.previousTextSelectionBase
            int r4 = r10.textSelectionBase
            if (r11 != r4) goto L_0x0315
            int r11 = r10.previousTextSelectionExtent
            int r4 = r10.textSelectionExtent
            if (r11 == r4) goto L_0x0161
        L_0x0315:
            int r11 = r10.id
            r4 = 8192(0x2000, float:1.14794E-41)
            android.view.accessibility.AccessibilityEvent r11 = r8.obtainAccessibilityEvent(r11, r4)
            java.util.List r4 = r11.getText()
            r4.add(r0)
            int r4 = r10.textSelectionBase
            r11.setFromIndex(r4)
            int r10 = r10.textSelectionExtent
            r11.setToIndex(r10)
            int r10 = r0.length()
            r11.setItemCount(r10)
            r8.sendAccessibilityEvent(r11)
            goto L_0x0161
        L_0x0340:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityBridge.updateSemantics(java.nio.ByteBuffer, java.lang.String[], java.nio.ByteBuffer[]):void");
    }

    public AccessibilityBridge(View view, AccessibilityChannel accessibilityChannel2, final AccessibilityManager accessibilityManager2, ContentResolver contentResolver2, AccessibilityViewEmbedder accessibilityViewEmbedder2, PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate2) {
        this.flutterSemanticsTree = new HashMap();
        this.customAccessibilityActions = new HashMap();
        this.accessibilityFeatureFlags = 0;
        this.flutterNavigationStack = new ArrayList();
        this.previousRouteId = 0;
        this.lastLeftFrameInset = 0;
        this.accessibleNavigation = false;
        this.isReleased = false;
        this.accessibilityMessageHandler = new AccessibilityChannel.AccessibilityMessageHandler() {
            public void announce(String str) {
                AccessibilityBridge.this.rootAccessibilityView.announceForAccessibility(str);
            }

            public void onFocus(int i10) {
                AccessibilityBridge.this.sendAccessibilityEvent(i10, 8);
            }

            public void onLongPress(int i10) {
                AccessibilityBridge.this.sendAccessibilityEvent(i10, 2);
            }

            public void onTap(int i10) {
                AccessibilityBridge.this.sendAccessibilityEvent(i10, 1);
            }

            public void onTooltip(String str) {
                if (Build.VERSION.SDK_INT < 28) {
                    AccessibilityEvent access$200 = AccessibilityBridge.this.obtainAccessibilityEvent(0, 32);
                    access$200.getText().add(str);
                    AccessibilityBridge.this.sendAccessibilityEvent(access$200);
                }
            }

            public void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                AccessibilityBridge.this.updateCustomAccessibilityActions(byteBuffer, strArr);
            }

            public void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                for (ByteBuffer order : byteBufferArr) {
                    order.order(ByteOrder.LITTLE_ENDIAN);
                }
                AccessibilityBridge.this.updateSemantics(byteBuffer, strArr, byteBufferArr);
            }
        };
        AnonymousClass2 r12 = new AccessibilityManager.AccessibilityStateChangeListener() {
            public void onAccessibilityStateChanged(boolean z10) {
                if (!AccessibilityBridge.this.isReleased) {
                    if (z10) {
                        AccessibilityBridge.this.accessibilityChannel.setAccessibilityMessageHandler(AccessibilityBridge.this.accessibilityMessageHandler);
                        AccessibilityBridge.this.accessibilityChannel.onAndroidAccessibilityEnabled();
                    } else {
                        AccessibilityBridge.this.setAccessibleNavigation(false);
                        AccessibilityBridge.this.accessibilityChannel.setAccessibilityMessageHandler((AccessibilityChannel.AccessibilityMessageHandler) null);
                        AccessibilityBridge.this.accessibilityChannel.onAndroidAccessibilityDisabled();
                    }
                    if (AccessibilityBridge.this.onAccessibilityChangeListener != null) {
                        AccessibilityBridge.this.onAccessibilityChangeListener.onAccessibilityChanged(z10, AccessibilityBridge.this.accessibilityManager.isTouchExplorationEnabled());
                    }
                }
            }
        };
        this.accessibilityStateChangeListener = r12;
        AnonymousClass3 r22 = new ContentObserver(new Handler()) {
            public void onChange(boolean z10) {
                onChange(z10, (Uri) null);
            }

            public void onChange(boolean z10, Uri uri) {
                String str;
                if (!AccessibilityBridge.this.isReleased) {
                    if (Build.VERSION.SDK_INT < 17) {
                        str = null;
                    } else {
                        str = Settings.Global.getString(AccessibilityBridge.this.contentResolver, "transition_animation_scale");
                    }
                    if (str != null && str.equals(AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                        AccessibilityBridge.access$1176(AccessibilityBridge.this, AccessibilityFeature.DISABLE_ANIMATIONS.value);
                    } else {
                        AccessibilityBridge.access$1172(AccessibilityBridge.this, ~AccessibilityFeature.DISABLE_ANIMATIONS.value);
                    }
                    AccessibilityBridge.this.sendLatestAccessibilityFlagsToFlutter();
                }
            }
        };
        this.animationScaleObserver = r22;
        this.rootAccessibilityView = view;
        this.accessibilityChannel = accessibilityChannel2;
        this.accessibilityManager = accessibilityManager2;
        this.contentResolver = contentResolver2;
        this.accessibilityViewEmbedder = accessibilityViewEmbedder2;
        this.platformViewsAccessibilityDelegate = platformViewsAccessibilityDelegate2;
        r12.onAccessibilityStateChanged(accessibilityManager2.isEnabled());
        accessibilityManager2.addAccessibilityStateChangeListener(r12);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 19) {
            AnonymousClass4 r62 = new AccessibilityManager.TouchExplorationStateChangeListener() {
                public void onTouchExplorationStateChanged(boolean z10) {
                    if (!AccessibilityBridge.this.isReleased) {
                        if (!z10) {
                            AccessibilityBridge.this.setAccessibleNavigation(false);
                            AccessibilityBridge.this.onTouchExplorationExit();
                        }
                        if (AccessibilityBridge.this.onAccessibilityChangeListener != null) {
                            AccessibilityBridge.this.onAccessibilityChangeListener.onAccessibilityChanged(accessibilityManager2.isEnabled(), z10);
                        }
                    }
                }
            };
            this.touchExplorationStateChangeListener = r62;
            r62.onTouchExplorationStateChanged(accessibilityManager2.isTouchExplorationEnabled());
            accessibilityManager2.addTouchExplorationStateChangeListener(r62);
        } else {
            this.touchExplorationStateChangeListener = null;
        }
        if (i10 >= 17) {
            r22.onChange(false);
            contentResolver2.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, r22);
        }
        if (i10 >= 31) {
            setBoldTextFlag();
        }
        platformViewsAccessibilityDelegate2.attachAccessibilityBridge(this);
    }

    public boolean onAccessibilityHoverEvent(MotionEvent motionEvent, boolean z10) {
        if (!this.accessibilityManager.isTouchExplorationEnabled() || this.flutterSemanticsTree.isEmpty()) {
            return false;
        }
        SemanticsNode access$4500 = getRootSemanticsNode().hitTest(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z10);
        if (access$4500 == null || access$4500.platformViewId == -1) {
            if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                handleTouchExploration(motionEvent.getX(), motionEvent.getY(), z10);
            } else if (motionEvent.getAction() == 10) {
                onTouchExplorationExit();
            } else {
                Log.d("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
            return true;
        } else if (z10) {
            return false;
        } else {
            return this.accessibilityViewEmbedder.onAccessibilityHoverEvent(access$4500.id, motionEvent);
        }
    }

    /* access modifiers changed from: private */
    public void sendAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (this.accessibilityManager.isEnabled()) {
            this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(this.rootAccessibilityView, accessibilityEvent);
        }
    }

    public AccessibilityEvent obtainAccessibilityEvent(int i10) {
        return AccessibilityEvent.obtain(i10);
    }
}
