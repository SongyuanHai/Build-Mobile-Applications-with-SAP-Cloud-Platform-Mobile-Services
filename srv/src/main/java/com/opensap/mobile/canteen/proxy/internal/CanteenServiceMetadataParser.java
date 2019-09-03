//# xsc 19.6.0-a27f20-20190621

package com.opensap.mobile.canteen.proxy.internal;

public abstract class CanteenServiceMetadataParser
{
    public static final int options = (com.sap.cloud.server.odata.csdl.CsdlOption.ALLOW_CASE_CONFLICTS | com.sap.cloud.server.odata.csdl.CsdlOption.DISABLE_FACET_WARNINGS | com.sap.cloud.server.odata.csdl.CsdlOption.DISABLE_NAME_VALIDATION | com.sap.cloud.server.odata.csdl.CsdlOption.PROCESS_MIXED_VERSIONS | com.sap.cloud.server.odata.csdl.CsdlOption.RETAIN_ORIGINAL_TEXT | com.sap.cloud.server.odata.csdl.CsdlOption.IGNORE_UNDEFINED_TERMS);

    public static final com.sap.cloud.server.odata.csdl.CsdlDocument parsed = com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataParser.parse();

    public static com.sap.cloud.server.odata.csdl.CsdlDocument parse()
    {
        //# /usr/sap/ljs/xs-temp/bd4c6133-a32f-4584-a8ce-d971fbdd1f2d/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:527:12
        final com.sap.cloud.server.odata.csdl.CsdlParser parser = new com.sap.cloud.server.odata.csdl.CsdlParser();
        parser.setLogWarnings(false);
        parser.setCsdlOptions(com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataParser.options);
        final com.sap.cloud.server.odata.csdl.CsdlDocument metadata = parser.parseInProxy(com.opensap.mobile.canteen.proxy.internal.CanteenServiceMetadataText.XML, "com.opensap.mobile.canteen");
        metadata.setProxyVersion("19.6.0-a27f20-20190621");
        return metadata;
    }
}
