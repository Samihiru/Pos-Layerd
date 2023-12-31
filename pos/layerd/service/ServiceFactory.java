/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.service;

import pos.layerd.service.custom.Impl.CustomerServiceImpl;
import pos.layerd.service.custom.Impl.ItemServiceImpl;

/**
 *
 * @author Samihiru
 */
public class ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }

        return serviceFactory;
    }

    public SuperService getService(ServiceType type) {
        switch (type) {
            case CUSTOMER:
                return new CustomerServiceImpl();
           case ITEM:
                return new ItemServiceImpl();

            default:
                return null;
        }
    }

    public enum ServiceType {
        CUSTOMER,ITEM
    }
}
