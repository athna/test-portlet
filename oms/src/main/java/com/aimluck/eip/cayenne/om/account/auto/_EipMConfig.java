package com.aimluck.eip.cayenne.om.account.auto;

/** Class _EipMConfig was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipMConfig extends org.apache.cayenne.CayenneDataObject {

    public static final String NAME_PROPERTY = "name";
    public static final String VALUE_PROPERTY = "value";

    public static final String ID_PK_COLUMN = "ID";

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }
    
    
    public void setValue(String value) {
        writeProperty("value", value);
    }
    public String getValue() {
        return (String)readProperty("value");
    }
    
    
}
