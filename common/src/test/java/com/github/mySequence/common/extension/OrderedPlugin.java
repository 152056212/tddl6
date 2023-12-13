package com.github.mySequence.common.extension;


import com.github.mySequence.common.utils.extension.Activate;

@Activate(order = 1)
public class OrderedPlugin extends AbstractPluginService {

    public String echo(String str) {
        return "ordered : " + str;
    }
}
