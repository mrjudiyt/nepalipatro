package com.facebook.appevents.codeless.internal;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONObject;

/* compiled from: PathComponent.kt */
public final class PathComponent {
    public static final Companion Companion = new Companion((g) null);
    private static final String PATH_CLASS_NAME_KEY = "class_name";
    private static final String PATH_DESCRIPTION_KEY = "description";
    private static final String PATH_HINT_KEY = "hint";
    private static final String PATH_ID_KEY = "id";
    private static final String PATH_INDEX_KEY = "index";
    private static final String PATH_MATCH_BITMASK_KEY = "match_bitmask";
    private static final String PATH_TAG_KEY = "tag";
    private static final String PATH_TEXT_KEY = "text";
    private final String className;
    private final String description;
    private final String hint;
    private final int id;
    private final int index;
    private final int matchBitmask;
    private final String tag;
    private final String text;

    /* compiled from: PathComponent.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* compiled from: PathComponent.kt */
    public enum MatchBitmaskType {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        
        private final int value;

        private MatchBitmaskType(int i10) {
            this.value = i10;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public PathComponent(JSONObject jSONObject) {
        m.f(jSONObject, "component");
        String string = jSONObject.getString(PATH_CLASS_NAME_KEY);
        m.e(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.className = string;
        this.index = jSONObject.optInt("index", -1);
        this.id = jSONObject.optInt("id");
        String optString = jSONObject.optString("text");
        m.e(optString, "component.optString(PATH_TEXT_KEY)");
        this.text = optString;
        String optString2 = jSONObject.optString("tag");
        m.e(optString2, "component.optString(PATH_TAG_KEY)");
        this.tag = optString2;
        String optString3 = jSONObject.optString("description");
        m.e(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.description = optString3;
        String optString4 = jSONObject.optString("hint");
        m.e(optString4, "component.optString(PATH_HINT_KEY)");
        this.hint = optString4;
        this.matchBitmask = jSONObject.optInt(PATH_MATCH_BITMASK_KEY);
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getHint() {
        return this.hint;
    }

    public final int getId() {
        return this.id;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getMatchBitmask() {
        return this.matchBitmask;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getText() {
        return this.text;
    }
}
