<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.pux0r3.helloworldc">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        <activity
            android:name="android.app.NativeActivity"
            android:configChanges="orientation|keyboardHidden"
            android:label="@string/app_name">
            <meta-data
                android:name="android.app.lib_name"
                android:value="helloworld-c" />

            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>
</manifest>