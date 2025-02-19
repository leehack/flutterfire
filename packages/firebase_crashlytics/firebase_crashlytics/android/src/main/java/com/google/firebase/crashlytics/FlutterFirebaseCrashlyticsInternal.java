package com.google.firebase.crashlytics;

import android.annotation.SuppressLint;
import com.google.firebase.crashlytics.internal.Logger;

/** @hide */
public final class FlutterFirebaseCrashlyticsInternal {
  private static final String FLUTTER_BUILD_ID_KEY = "com.crashlytics.flutter.build-id.0";

  @SuppressLint("VisibleForTests")
  public static void recordFatalException(Throwable throwable) {
    if (throwable == null) {
      Logger.getLogger().w("A null value was passed to recordFatalException. Ignoring.");
      return;
    }
    FirebaseCrashlytics.getInstance().core.logFatalException(throwable);
  }

  @SuppressLint("VisibleForTests")
  public static void setFlutterBuildId(String buildId) {
    FirebaseCrashlytics.getInstance().core.setInternalKey(FLUTTER_BUILD_ID_KEY, buildId);
  }

  private FlutterFirebaseCrashlyticsInternal() {}
}
