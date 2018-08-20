package com.advertising.administrator.dagger_simple.FourActivity;

public class ComPonentHolder {


    private static AppComponent myAppComponent;

    public static void setAppComponent(AppComponent component) {
        myAppComponent = component;
    }

    public static AppComponent getAppComponent() {
        return myAppComponent;
    }


}
