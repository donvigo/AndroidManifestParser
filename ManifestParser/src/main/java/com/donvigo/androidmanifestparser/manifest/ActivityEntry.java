package com.donvigo.androidmanifestparser.manifest;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by vgaidarji on 13.03.14.
 */
@Root(strict = false)
public class ActivityEntry{
    @Attribute(name = "name", required = false)
    private String name;
    @Attribute(name = "excludeFromRecents", required = false)
    private String excludedFromRecents;
    @ElementList(entry = "intent-filter", inline = true, required = false)
    private List<IntentFilterEntry> intentFilter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExcludedFromRecents() {
        return excludedFromRecents;
    }

    public void setExcludedFromRecents(String excludedFromRecents) {
        this.excludedFromRecents = excludedFromRecents;
    }

    public List<IntentFilterEntry> getIntentFilter() {
        return intentFilter;
    }

    public void setIntentFilter(List<IntentFilterEntry> intentFilter) {
        this.intentFilter = intentFilter;
    }
}
