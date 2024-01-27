package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.sharedpreferences.Messages;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SharedPreferencesPlugin implements FlutterPlugin, Messages.SharedPreferencesApi {
    private static final String BIG_INTEGER_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy";
    private static final String DOUBLE_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu";
    private static final String LIST_IDENTIFIER = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu";
    private static final String SHARED_PREFERENCES_NAME = "FlutterSharedPreferences";
    private static final String TAG = "SharedPreferencesPlugin";
    private SharedPreferencesListEncoder listEncoder;
    private SharedPreferences preferences;

    static class ListEncoder implements SharedPreferencesListEncoder {
        ListEncoder() {
        }

        public List<String> decode(String str) {
            try {
                return (List) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
            } catch (IOException | ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        public String encode(List<String> list) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(list);
                objectOutputStream.flush();
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public SharedPreferencesPlugin() {
        this(new ListEncoder());
    }

    private Map<String, Object> getAllPrefs(String str) {
        Map<String, ?> all = this.preferences.getAll();
        HashMap hashMap = new HashMap();
        for (String next : all.keySet()) {
            if (next.startsWith(str)) {
                hashMap.put(next, transformPref(next, all.get(next)));
            }
        }
        return hashMap;
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        new SharedPreferencesPlugin().setUp(registrar.messenger(), registrar.context());
    }

    private void setUp(BinaryMessenger binaryMessenger, Context context) {
        this.preferences = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
        try {
            i.r(binaryMessenger, this);
        } catch (Exception unused) {
        }
    }

    private Object transformPref(String str, Object obj) {
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.startsWith(LIST_IDENTIFIER)) {
                return this.listEncoder.decode(str2.substring(40));
            }
            if (str2.startsWith(BIG_INTEGER_PREFIX)) {
                return new BigInteger(str2.substring(44), 36);
            }
            if (str2.startsWith(DOUBLE_PREFIX)) {
                return Double.valueOf(str2.substring(40));
            }
        } else if (obj instanceof Set) {
            ArrayList arrayList = new ArrayList((Set) obj);
            SharedPreferences.Editor remove = this.preferences.edit().remove(str);
            remove.putString(str, LIST_IDENTIFIER + this.listEncoder.encode(arrayList)).apply();
            return arrayList;
        }
        return obj;
    }

    public Boolean clearWithPrefix(String str) {
        SharedPreferences.Editor edit = this.preferences.edit();
        Map<String, ?> all = this.preferences.getAll();
        ArrayList arrayList = new ArrayList();
        for (String next : all.keySet()) {
            if (next.startsWith(str)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        return Boolean.valueOf(edit.commit());
    }

    public Map<String, Object> getAllWithPrefix(String str) {
        return getAllPrefs(str);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        setUp(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        i.r(flutterPluginBinding.getBinaryMessenger(), (Messages.SharedPreferencesApi) null);
    }

    public Boolean remove(String str) {
        return Boolean.valueOf(this.preferences.edit().remove(str).commit());
    }

    public Boolean setBool(String str, Boolean bool) {
        return Boolean.valueOf(this.preferences.edit().putBoolean(str, bool.booleanValue()).commit());
    }

    public Boolean setDouble(String str, Double d10) {
        String d11 = Double.toString(d10.doubleValue());
        SharedPreferences.Editor edit = this.preferences.edit();
        return Boolean.valueOf(edit.putString(str, DOUBLE_PREFIX + d11).commit());
    }

    public Boolean setInt(String str, Long l10) {
        return Boolean.valueOf(this.preferences.edit().putLong(str, l10.longValue()).commit());
    }

    public Boolean setString(String str, String str2) {
        if (!str2.startsWith(LIST_IDENTIFIER) && !str2.startsWith(BIG_INTEGER_PREFIX) && !str2.startsWith(DOUBLE_PREFIX)) {
            return Boolean.valueOf(this.preferences.edit().putString(str, str2).commit());
        }
        throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
    }

    public Boolean setStringList(String str, List<String> list) {
        SharedPreferences.Editor edit = this.preferences.edit();
        return Boolean.valueOf(edit.putString(str, LIST_IDENTIFIER + this.listEncoder.encode(list)).commit());
    }

    SharedPreferencesPlugin(SharedPreferencesListEncoder sharedPreferencesListEncoder) {
        this.listEncoder = sharedPreferencesListEncoder;
    }
}
