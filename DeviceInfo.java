package com.app.babyapp.utils;

public class DeviceInfo {

    public final static String ID = android.os.Build.ID;
    public final static String OS_VERSION = System.getProperty("os.version");
    public final static String RELEASE = android.os.Build.VERSION.RELEASE;
    public final static String DEVICE = android.os.Build.DEVICE;
    public final static String MODEL = android.os.Build.MODEL;
    public final static String PRODUCT = android.os.Build.PRODUCT;
    public final static String BRAND = android.os.Build.BRAND;
    public final static String DISPLAY = android.os.Build.DISPLAY;
    public final static String HARDWARE = android.os.Build.HARDWARE;
    public final static String MANUFACTURER = android.os.Build.MANUFACTURER;
    public final static String USER = android.os.Build.USER;
    public final static String HOST = android.os.Build.HOST;

    public static String getUniqueID()
    {
        String uniqueID = getID() + getOsVersion() + getRelease() + getDevice() +
                getModel() + getBrand() + getDisplay(); 
        uniqueID = uniqueID.replace(" ","");

        return uniqueID.toLowerCase();
    }

    public static String getUser()
    {
        if (USER==null)
            return "";
        return USER;
    }

    public static String getHost()
    {
        if (HOST==null)
            return "";
        return HOST;
    }

    public static String getManufacturer()
    {
        if (MANUFACTURER==null)
            return "";
        return MANUFACTURER;
    }

    public static String getHardware()
    {
        if (HARDWARE==null)
            return "";
        return HARDWARE;
    }

    public static String getDisplay()
    {
        if (DISPLAY==null)
            return "";
        return DISPLAY;
    }

    public static String getBrand()
    {
        if (BRAND==null)
            return "";
        return BRAND;
    }

    public static String getProduct()
    {
        if (PRODUCT==null)
            return "";
        return PRODUCT;
    }


    public static String getDevice()
    {
        if (DEVICE==null)
            return "";
        return DEVICE;
    }

    public static String getModel()
    {
        if (MODEL==null)
            return "";
        return MODEL;
    }

    public static String getRelease()
    {
        if (RELEASE==null)
            return "";
        return RELEASE;
    }

    public static String getOsVersion()
    {
        if (OS_VERSION==null)
            return "";
        return OS_VERSION;
    }

    public static String getID()
    {
        if (ID==null)
            return "";
        return ID;
    }
}
