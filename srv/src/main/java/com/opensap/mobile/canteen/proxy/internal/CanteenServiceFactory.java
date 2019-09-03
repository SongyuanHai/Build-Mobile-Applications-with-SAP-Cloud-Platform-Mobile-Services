//# xsc 19.6.0-a27f20-20190621

package com.opensap.mobile.canteen.proxy.internal;

public abstract class CanteenServiceFactory
{
    public static void registerAll()
    {
        //# /usr/sap/ljs/xs-temp/bd4c6133-a32f-4584-a8ce-d971fbdd1f2d/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:574:12
        com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.booking.registerFactory(new com.opensap.mobile.canteen.proxy.internal.CanteenServiceFactory.CreateBooking());
        com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.canteen.registerFactory(new com.opensap.mobile.canteen.proxy.internal.CanteenServiceFactory.CreateCanteen());
        com.opensap.mobile.canteen.proxy.CanteenServiceMetadata.EntityTypes.menu.registerFactory(new com.opensap.mobile.canteen.proxy.internal.CanteenServiceFactory.CreateMenu());
    }

    public static class CreateBooking
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/bd4c6133-a32f-4584-a8ce-d971fbdd1f2d/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:600:9
            return new com.opensap.mobile.canteen.proxy.Booking(false);
        }
    }

    public static class CreateCanteen
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/bd4c6133-a32f-4584-a8ce-d971fbdd1f2d/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:610:9
            return new com.opensap.mobile.canteen.proxy.Canteen(false);
        }
    }

    public static class CreateMenu
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/bd4c6133-a32f-4584-a8ce-d971fbdd1f2d/output/target/tmp/proxy-com.opensap.mobile.canteen.csdl.xs:620:9
            return new com.opensap.mobile.canteen.proxy.Menu(false);
        }
    }
}
