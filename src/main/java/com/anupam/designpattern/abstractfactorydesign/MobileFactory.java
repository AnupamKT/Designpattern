package com.anupam.designpattern.abstractfactorydesign;

public  abstract class MobileFactory {
    public static MobileFactory getBrandFactory(Brand brand){
        if(brand.equals(Brand.SAMSUNG)){
            return new SamsungFactory();
        }else{
            return new NokiaFactory();
        }
    }

    public abstract Mobile produceMobile(MobileType type);
}
