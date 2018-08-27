package com.advertising.administrator.dagger2_mvp.di;

public class ComponentHolder {

    private static AppCompoent myAppComponent;

    public static void setAppComponent(AppCompoent component) {
        myAppComponent = component;
    }

    public static AppCompoent getAppComponent() {
        return myAppComponent;
    }


}
