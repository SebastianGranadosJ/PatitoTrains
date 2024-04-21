package patitotrains.model.remote.services;

import patitotrains.model.domain.*;
import patitotrains.model.remote.services.servicesRemote.AdminServiceRemote;
import patitotrains.model.repository.*;
import raul.Model.array.Array;
import raul.Model.linkedlist.doubly.circular.LinkedList;
import raul.Model.util.list.List;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdminServiceImpl extends UnicastRemoteObject implements AdminServiceRemote {

    private final ContainerWagonRepository containerWagonRepository;
    private final PassengerWagonRepository passengerWagonRepository;
    private final RouteRepository routeRepository;
    private final UserRepository userRepository;
    private final TrainRepository trainRepository;

    public AdminServiceImpl(ContainerWagonRepository containerWagonRepository,
                            PassengerWagonRepository passengerWagonRepository,
                            RouteRepository routeRepository,
                            UserRepository userRepository,
                            TrainRepository trainRepository) throws RemoteException {
        super();
        this.containerWagonRepository = containerWagonRepository;
        this.passengerWagonRepository = passengerWagonRepository;
        this.routeRepository = routeRepository;
        this.userRepository = userRepository;
        this.trainRepository = trainRepository;
    }


    @Override
    public List<ContainerWagon> getAllContainerWagons() throws RemoteException {
        return containerWagonRepository.getAllContainerWagons();
    }

    @Override
    public boolean saveContainerWagon(ContainerWagon containerWagon) throws RemoteException {
        return containerWagonRepository.saveContainerWagon(containerWagon);
    }

    @Override
    public ContainerWagon getContainerWagonById(String id) throws RemoteException {
        return containerWagonRepository.getContainerWagonById(id);
    }

    @Override
    public boolean deleteContainerWagon(String id) throws RemoteException {
        return containerWagonRepository.deleteContainerWagon(id);
    }

    @Override
    public boolean updateContainerWagon(ContainerWagon containerWagon) throws RemoteException {
        return containerWagonRepository.updateContainerWagon(containerWagon);
    }

    @Override
    public boolean addLuggageToContainerWagon(String containerWagonId, Luggage luggage) throws RemoteException {
        return containerWagonRepository.addLuggageToContainerWagon(containerWagonId, luggage);
    }

    @Override
    public boolean deleteLuggageFromContainerWagon(String containerWagonId, String luggageId) throws RemoteException {
        return containerWagonRepository.deleteLuggageFromContainerWagon(containerWagonId, luggageId);
    }

    @Override
    public List<PassengerWagon> getAllPassengerWagons() throws RemoteException {
        return passengerWagonRepository.getAllPassengerWagons();
    }

    @Override
    public boolean savePassengerWagon(PassengerWagon passengerWagon) throws RemoteException {
        return passengerWagonRepository.savePassengerWagon(passengerWagon);
    }

    @Override
    public boolean updatePassengerWagon(PassengerWagon passengerWagon) throws RemoteException {
        return passengerWagonRepository.updatePassengerWagon(passengerWagon);
    }

    @Override
    public boolean deletePassengerWagon(String id) throws RemoteException {
        return passengerWagonRepository.deletePassengerWagon(id);
    }

    @Override
    public PassengerWagon getPassengerWagonById(String id) throws RemoteException {
        return passengerWagonRepository.getPassengerWagonById(id);
    }

    @Override
    public List<PassengerWagon> getPassengerWagonsByIds(Array<String> ids) throws RemoteException {
        return passengerWagonRepository.getPassengerWagonsByIds(ids);
    }

    @Override
    public List<Route> getAllRoutes() throws RemoteException {
        return routeRepository.getAllRoutes();
    }

    @Override
    public Route getRouteById(String id) throws RemoteException {
        return routeRepository.getRouteById(id);
    }

    @Override
    public boolean saveRoute(Route route) throws RemoteException {
        return routeRepository.saveRoute(route);
    }

    @Override
    public boolean updateRoute(Route route) throws RemoteException {
        return routeRepository.updateRoute(route);
    }

    @Override
    public boolean deleteRoute(String id) throws RemoteException {
        return routeRepository.deleteRoute(id);
    }

    @Override
    public boolean disableRoute(String id) throws RemoteException {
        return routeRepository.disableRoute(id);
    }

    @Override
    public boolean enableRoute(String id) throws RemoteException {
        return routeRepository.enableRoute(id);
    }

    @Override
    public Train getTrainById(String id) throws RemoteException {
        return trainRepository.getTrainById(id);
    }

    @Override
    public boolean saveTrain(Train train) throws RemoteException {
        return trainRepository.saveTrain(train);
    }

    @Override
    public boolean updateTrain(Train train) throws RemoteException {
        return trainRepository.updateTrain(train);
    }

    @Override
    public boolean deleteTrain(String id) throws RemoteException {
        return trainRepository.deleteTrain(id);
    }

    @Override
    public boolean addPassengerWagonToTrain(String trainId, PassengerWagon passengerWagon) throws RemoteException {
        return trainRepository.addPassengerWagonToTrain(trainId, passengerWagon);
    }

    @Override
    public boolean addContainerWagonToTrain(String trainId, ContainerWagon containerWagon) throws RemoteException {
        return trainRepository.addContainerWagonToTrain(trainId, containerWagon);
    }

    @Override
    public List<Train> getAllTrains() throws RemoteException {
        return trainRepository.getAllTrains();
    }

    @Override
    public LinkedList<Train> getTrainsByIds(Array<String> ids) throws RemoteException {
        return trainRepository.getTrainsByIds(ids);
    }

    @Override
    public User getUserById(String id) throws RemoteException {
        return userRepository.getUserById(id);
    }

    @Override
    public boolean saveUser(User user) throws RemoteException {
        return userRepository.saveUser(user);
    }

    @Override
    public boolean updateUser(User user) throws RemoteException {
        return userRepository.updateUser(user);
    }

    @Override
    public boolean deleteUser(String id) throws RemoteException {
        return userRepository.deleteUser(id);
    }

    @Override
    public boolean verifyUser(String userName, String password) throws RemoteException {
        return userRepository.verifyUser(userName, password);
    }
}
