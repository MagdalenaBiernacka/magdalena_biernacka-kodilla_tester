package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WeatherAlertService {

    private HashMap<Client, Set<Location>> alertSubscription = new HashMap<>();

    public void addSubscriberToLocation(Client client, Location location) {
      alertSubscription.computeIfAbsent(client, c -> new HashSet<>()).add(location);
    }

    public void sendAlertToLocation(Alert alert, Location location) {
        alertSubscription.entrySet()
                .stream()
                .filter(clientSetEntry -> clientSetEntry.getValue().contains(location))
                .map(clientSetEntry -> clientSetEntry.getKey())
                .forEach(client -> client.receiveAlert(alert));
    }

    public void sendGeneralInformationToAllClients(Alert regulation) {
        alertSubscription.entrySet()
                .stream()
                .forEach(clientSetEntry -> clientSetEntry.getKey().receiveGeneralInformation(regulation));
    }

    public void removeSubscriptionForLocation(Client client, Location location) {
        alertSubscription.entrySet()
                .stream()
                .filter(clientSetEntry -> clientSetEntry.getKey().equals(client))
                .forEach(clientSetEntry -> clientSetEntry.getValue().remove(location));
    }

    public  void removeClientSubscription(Client client){
        alertSubscription.entrySet()
                .removeIf(clientSetEntry -> (client.equals(clientSetEntry.getKey())));
    }

    public void removeLocation(Location location) {
        alertSubscription.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(location))
                .forEach(entry -> entry.getValue().remove(location));
    }
}