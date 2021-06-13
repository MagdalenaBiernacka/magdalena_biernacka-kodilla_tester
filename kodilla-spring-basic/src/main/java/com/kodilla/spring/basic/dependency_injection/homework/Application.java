package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {
    public static void main(String[] args) {
      DeliveryService deliveryService = new DeliveryService();
      NotificationService DHL_Notification = new DHLService();
      NotificationService UPS_Notification = new UPSService();
      NotificationService DPD_Notification = new DPDService();

      ShippingCenter DHL_ShippingCenter = new ShippingCenter(deliveryService, DHL_Notification);
      ShippingCenter UPS_ShippingCenter = new ShippingCenter(deliveryService, UPS_Notification);
      ShippingCenter DPD_ShippingCenter = new ShippingCenter(deliveryService, DPD_Notification);

      DHL_ShippingCenter.sendPackage("Hill Street 11, New York", 18.2);
      UPS_ShippingCenter.sendPackage("Down Street 12, New Jersey", 20);
      DPD_ShippingCenter.sendPackage("Hill Street 40, Miami", 50 );
    }
}