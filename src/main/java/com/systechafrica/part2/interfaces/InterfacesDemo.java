package com.systechafrica.part2.interfaces;

public class InterfacesDemo {
    
    public static void main(String[] args) {
        ThreePinPlug mc=new MobileCharger();
        ThreePinPlug lc=new LaptopCharger();
        mc.plugIn();
        mc.plugOut();

        lc.plugIn();
        lc.plugOut();

            
        };
    } 
