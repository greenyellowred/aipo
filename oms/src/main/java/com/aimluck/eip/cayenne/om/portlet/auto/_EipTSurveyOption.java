package com.aimluck.eip.cayenne.om.portlet.auto;

/** Class _EipTSurveyOption was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTSurveyOption extends org.apache.cayenne.CayenneDataObject {

    public static final String NAME_PROPERTY = "name";
    public static final String SORT_NUMBER_PROPERTY = "sortNumber";
    public static final String EIP_TSURVEY_PROPERTY = "eipTSurvey";
    public static final String EIP_TSURVEY_RESPONSE_MAP_PROPERTY = "eipTSurveyResponseMap";

    public static final String OPTION_ID_PK_COLUMN = "OPTION_ID";

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }
    
    
    public void setSortNumber(Integer sortNumber) {
        writeProperty("sortNumber", sortNumber);
    }
    public Integer getSortNumber() {
        return (Integer)readProperty("sortNumber");
    }
    
    
    public void setEipTSurvey(com.aimluck.eip.cayenne.om.portlet.EipTSurvey eipTSurvey) {
        setToOneTarget("eipTSurvey", eipTSurvey, true);
    }

    public com.aimluck.eip.cayenne.om.portlet.EipTSurvey getEipTSurvey() {
        return (com.aimluck.eip.cayenne.om.portlet.EipTSurvey)readProperty("eipTSurvey");
    } 
    
    
    public void setEipTSurveyResponseMap(com.aimluck.eip.cayenne.om.portlet.EipTSurveyResponseMap eipTSurveyResponseMap) {
        setToOneTarget("eipTSurveyResponseMap", eipTSurveyResponseMap, true);
    }

    public com.aimluck.eip.cayenne.om.portlet.EipTSurveyResponseMap getEipTSurveyResponseMap() {
        return (com.aimluck.eip.cayenne.om.portlet.EipTSurveyResponseMap)readProperty("eipTSurveyResponseMap");
    } 
    
    
}
