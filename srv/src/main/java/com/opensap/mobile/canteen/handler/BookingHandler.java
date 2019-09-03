package com.opensap.mobile.canteen.handler;

import com.sap.cloud.server.odata.*;

public class BookingHandler extends com.sap.cloud.server.odata.DefaultEntityHandler {
    private com.opensap.mobile.canteen.MainServlet servlet;
    private com.opensap.mobile.canteen.proxy.CanteenService service;

    public BookingHandler(com.opensap.mobile.canteen.MainServlet servlet, com.opensap.mobile.canteen.proxy.CanteenService service) {
        super(servlet, service);
        this.servlet = servlet;
        this.service = service;
    }

    @Override public DataValue executeQuery(DataQuery query) {
        return service.executeQuery(query).getResult();
    }

    @Override public void createEntity(EntityValue entityValue) {
        com.opensap.mobile.canteen.proxy.Booking entity = (com.opensap.mobile.canteen.proxy.Booking)entityValue;
        service.createEntity(entity);
    }

    @Override public void updateEntity(EntityValue entityValue) {
        com.opensap.mobile.canteen.proxy.Booking entity = (com.opensap.mobile.canteen.proxy.Booking)entityValue;
        service.updateEntity(entity);
    }

    @Override public void deleteEntity(EntityValue entityValue) {
        com.opensap.mobile.canteen.proxy.Booking entity = (com.opensap.mobile.canteen.proxy.Booking)entityValue;
        service.deleteEntity(entity);
    }
}
