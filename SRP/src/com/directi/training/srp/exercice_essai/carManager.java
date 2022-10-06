package com.directi.training.srp.exercise_refactored;

public class CarManager
{
    private final CarDao _carDao;
    private final CarFormatter _carFormatter;
    private final CarScore _CarScore;

    public CarManager(CarDao carDao, CarFormatter carFormatter, CarScore CarScore)
    {
        _carDao = carDao;
        _carFormatter = carFormatter;
        _CarScore = CarScore;
    }

    public Car getCarById(final String carId)
    {
        return _carDao.findById(carId);
    }

    public String getCarsNames()
    {
        return _carFormatter.getCarsNames(_carDao.findAll());
    }

    public Car getBestCar()
    {
        return _CarScore.getBestCar(_carDao.findAll());
    }
}