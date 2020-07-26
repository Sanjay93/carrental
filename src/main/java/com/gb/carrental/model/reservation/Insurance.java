package com.gb.carrental.model.reservation;

public class Insurance extends AddonServiceDecorator {
    public Insurance(AddonService addonService) {
        super(addonService);
    }

    @Override
    public double getCost() {
        return super.getCost() + 300;
    }
}
