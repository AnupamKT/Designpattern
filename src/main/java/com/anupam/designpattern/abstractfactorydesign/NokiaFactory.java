package com.anupam.designpattern.abstractfactorydesign;

public class NokiaFactory extends MobileFactory {

    @Override
    public Mobile produceMobile(MobileType type) {
        if (type.equals(MobileType.ANDROID)) {
            return new AndroidMobile();
        } else {
            return new BasicMobile();
        }
    }
}
