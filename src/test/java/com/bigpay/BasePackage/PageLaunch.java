package com.bigpay.BasePackage;

import com.bigpay.Pages.SearchElement;


public class PageLaunch extends BaseClass{

    public static SearchElement search;

    public static void initialize() {

        search = new SearchElement();
    }
}