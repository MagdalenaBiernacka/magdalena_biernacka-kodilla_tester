package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherAlertTestSuite {

    WeatherAlertService weatherAlertService;
    Client client = Mockito.mock(Client.class);
    Client firstClient = Mockito.mock(Client.class);
    Client secondClient = Mockito.mock(Client.class);
    Client thirdClient = Mockito.mock(Client.class);
    Location location = Mockito.mock(Location.class);
    Location wielkopolska = Mockito.mock(Location.class);
    Location slask = Mockito.mock(Location.class);
    Location pomorskie = Mockito.mock(Location.class);
    Alert alert = Mockito.mock(Alert.class);

    @BeforeEach
    public void setup() {
        weatherAlertService = new WeatherAlertService();
    }

    @Test
    public void notSubscribedClientForLocationShouldNotReceiveAlert() {
        //Given
        weatherAlertService.sendAlertToLocation(alert, location);

        //Then
        Mockito.verify(client, Mockito.never()).receiveAlert(alert);
    }

    @Test
    public void subscribedClientForLocationShouldReceiveAlert() {
        //Given
        weatherAlertService.addSubscriberToLocation(client, location);
        //When
        weatherAlertService.sendAlertToLocation(alert, location);
        //Then
        Mockito.verify(client, Mockito.times(1)).receiveAlert(alert);
    }

    @Test
    public void allSubscribedClientsForSpecificLocationShouldReceiveAlert() {
        //Given
        weatherAlertService.addSubscriberToLocation(firstClient, wielkopolska);
        weatherAlertService.addSubscriberToLocation(firstClient, slask);
        weatherAlertService.addSubscriberToLocation(secondClient, wielkopolska);
        weatherAlertService.addSubscriberToLocation(thirdClient, wielkopolska);
        //When
        weatherAlertService.sendAlertToLocation(alert, wielkopolska);
        //Then
        Mockito.verify(firstClient, Mockito.times(1)).receiveAlert(alert);
        Mockito.verify(secondClient, Mockito.times(1)).receiveAlert(alert);
        Mockito.verify(thirdClient, Mockito.times(1)).receiveAlert(alert);
    }

    @Test
    public void notSubscribedClientForSpecificLocationShouldNotReceiveAlertForThisLocation() {
        //Given
        weatherAlertService.addSubscriberToLocation(firstClient, wielkopolska);
        weatherAlertService.addSubscriberToLocation(secondClient, wielkopolska);
        weatherAlertService.addSubscriberToLocation(thirdClient, slask);
        weatherAlertService.addSubscriberToLocation(thirdClient, pomorskie);

        //When
        weatherAlertService.sendAlertToLocation(alert, wielkopolska);

        //Then
        Mockito.verify(firstClient, Mockito.times(1)).receiveAlert(alert);
        Mockito.verify(secondClient, Mockito.times(1)).receiveAlert(alert);
        Mockito.verify(thirdClient, Mockito.never()).receiveAlert(alert);
    }

    @Test
    public void subscribeClientReceiveOneAlertFromOneLocation() {
        //Given
        weatherAlertService.addSubscriberToLocation(client, wielkopolska);
        weatherAlertService.addSubscriberToLocation(client, wielkopolska);
        weatherAlertService.addSubscriberToLocation(client, wielkopolska);

        //When
        weatherAlertService.sendAlertToLocation(alert, wielkopolska);

        //Then
        Mockito.verify(client, Mockito.times(1)).receiveAlert(alert);
    }

    @Test
    public void unsubscribedClientFromAllLocationsShouldNotReceiveAnyNotification() {
        //Given
        weatherAlertService.addSubscriberToLocation(client, wielkopolska);
        weatherAlertService.addSubscriberToLocation(client, pomorskie);
        weatherAlertService.addSubscriberToLocation(client, slask);

        //When
        weatherAlertService.removeClientSubscription(client);

        weatherAlertService.sendAlertToLocation(alert, wielkopolska);
        weatherAlertService.sendAlertToLocation(alert, pomorskie);
        weatherAlertService.sendAlertToLocation(alert, slask);
        weatherAlertService.sendGeneralInformationToAllClients(alert);

        //Then
        Mockito.verify(client, Mockito.never()).receiveAlert(alert);
        Mockito.verify(client, Mockito.never()).receiveGeneralInformation(alert);
    }

    @Test
    public void unsubscribedClientFromSpecificLocationShouldNotReceiveAlertForThisLocation() {
        //Given
        weatherAlertService.addSubscriberToLocation(client, wielkopolska);
        weatherAlertService.addSubscriberToLocation(client, pomorskie);
        weatherAlertService.addSubscriberToLocation(client, slask);

        //When
        weatherAlertService.removeSubscriptionForLocation(client, wielkopolska);
        weatherAlertService.removeSubscriptionForLocation(client, pomorskie);

        weatherAlertService.sendAlertToLocation(alert, wielkopolska);
        weatherAlertService.sendAlertToLocation(alert, pomorskie);
        weatherAlertService.sendAlertToLocation(alert, slask); // there is still subscription for one location

        //Then
        Mockito.verify(client, Mockito.times(1)).receiveAlert(alert);
    }

    @Test
    public void allSubscribeClientsReceiveOneGeneralInformation() {
        //Given
        weatherAlertService.addSubscriberToLocation(firstClient, wielkopolska);
        weatherAlertService.addSubscriberToLocation(firstClient, pomorskie);
        weatherAlertService.addSubscriberToLocation(secondClient, pomorskie);
        weatherAlertService.addSubscriberToLocation(secondClient, slask);
        weatherAlertService.addSubscriberToLocation(thirdClient, slask);

        //When
        weatherAlertService.sendGeneralInformationToAllClients(alert);

        //Then
        Mockito.verify(firstClient, Mockito.times(1)).receiveGeneralInformation(alert);
        Mockito.verify(secondClient, Mockito.times(1)).receiveGeneralInformation(alert);
        Mockito.verify(thirdClient, Mockito.times(1)).receiveGeneralInformation(alert);

    }

    @Test
    public void subscribedClientForDeletedLocationNotReceiveAlertForThisLocation() {
        //Given
        weatherAlertService.addSubscriberToLocation(client, wielkopolska);
        weatherAlertService.addSubscriberToLocation(client, pomorskie);
        weatherAlertService.addSubscriberToLocation(client, slask);

        //When
        weatherAlertService.removeLocation(wielkopolska);
        weatherAlertService.removeLocation(pomorskie);

        weatherAlertService.sendAlertToLocation(alert, wielkopolska);
        weatherAlertService.sendAlertToLocation(alert, pomorskie);
        weatherAlertService.sendAlertToLocation(alert, slask); // this location still exist

        //Then
        Mockito.verify(client, Mockito.times(1)).receiveAlert(alert);
    }

    @Test
    public  void shouldRemoveLocationForAllSubscribers() {
        //Given
        weatherAlertService.addSubscriberToLocation(firstClient, wielkopolska);
        weatherAlertService.addSubscriberToLocation(secondClient, wielkopolska);
        weatherAlertService.addSubscriberToLocation(thirdClient, wielkopolska);

        //When
        weatherAlertService.removeLocation(wielkopolska);

        //Then
        Mockito.verify(firstClient, Mockito.never()).receiveAlert(alert);
        Mockito.verify(secondClient, Mockito.never()).receiveAlert(alert);
        Mockito.verify(thirdClient, Mockito.never()).receiveAlert(alert);
    }
}