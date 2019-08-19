package com.dham.sample.selfTest.domain;

public enum OrderType {

    RATS("RATS", "0320"),
    MO_AGENT_SVC ("MO Agent Svc", "0330"),
    OUTSIDE_DELIVERY ("Outside Delivery", "0340"),
    MO_PLUMBER_SVC ("MO Plumber Svc", "0350"),
    HOME_DELIVERY ("Home Delivery", "0360"),
    MO_OTHER ("MO Other", "0370"),
    MO_REPLACEMENT ("MO Replacement", "0380"),
    MO_RETURN ("MO Return", "0390"),
    RESCHEDULED ("Rescheduled", "0400"),
    RETURN_ORDER ("Return Order","0410");

    private final String serviceType;
    private final String orderType;

    OrderType(String serviceType, String orderType) {
        this.serviceType = serviceType;
        this.orderType = orderType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public String getOrderType() {
        return orderType;
    }

    public static String serviceTypeToOrderType(String serviceType) {
        for (OrderType oType : OrderType.values()) {
            if (oType.getServiceType().equalsIgnoreCase(serviceType)) {
                return oType.getOrderType();
            }
        }
        return null;
    }
}
