package cn.hx.plugin.junkcode.template

class ResTemplate {

    static final def DRAWABLE = '''<?xml version="1.0" encoding="utf-8"?>

<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="oval">
    <solid android:color="%s" />
    <size
        android:width="120dp"
        android:height="120dp" />
</shape>'''

    static final def LAYOUT_TEMPLATE = '''<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <TextView
        android:id="@+id/sns_hub_text_%s"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center" />
</LinearLayout>'''
}