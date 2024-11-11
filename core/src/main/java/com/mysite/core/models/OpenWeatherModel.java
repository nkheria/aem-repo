package com.mysite.core.models;

import com.adobe.cq.export.json.ComponentExporter;

public interface OpenWeathermOdel extends ComponentExporter {

    public String getLabel();
    public double getLat();
    public double getLon();

}