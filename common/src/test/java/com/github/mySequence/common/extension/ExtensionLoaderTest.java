package com.github.mySequence.common.extension;

import com.github.mySequence.common.utils.extension.ExtensionLoader;
import org.junit.Assert;
import org.junit.Test;

public class ExtensionLoaderTest {

    @Test
    public void testSimple() {
        AbstractPluginService plugin = ExtensionLoader.load(AbstractPluginService.class);
        Assert.assertEquals(plugin.getClass(), OrderedPlugin.class);
        Assert.assertEquals(plugin.echo("hello"), "ordered : hello");
    }
}
