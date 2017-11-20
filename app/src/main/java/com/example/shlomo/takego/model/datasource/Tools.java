package com.example.shlomo.takego.model.datasource;

import android.content.ContentValues;

import com.example.shlomo.takego.model.backend.CarRentelConst;
import com.example.shlomo.takego.model.entities.Car;
import com.example.shlomo.takego.model.entities.CarModel;
import com.example.shlomo.takego.model.entities.Geer;

/**
 * Created by Shlomo on 19/11/2017.
 */

public class Tools {
    public static ContentValues CarToContentValues(Car car) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(CarRentelConst.CarConst.ID, car.get_liscene_number());
        contentValues.put(CarRentelConst.CarConst.MILAGE, car.get_milage());
        contentValues.put(CarRentelConst.CarConst.BRANCH_NUMBER, car.get_branch_number());
        contentValues.putAll(CarModelToContentValus(car.get_car_model()));
        return contentValues; 
    }
    
    public static Car ContentValuesToCar(ContentValues contentValues) {
        Car car = new Car();
        car.set_liscene_number(contentValues.getAsInteger(CarRentelConst.CarConst.ID));
        car.set_milage(contentValues.getAsInteger(CarRentelConst.CarConst.MILAGE));
        car.set_branch_number(contentValues.getAsInteger(CarRentelConst.CarConst.BRANCH_NUMBER));
        car.set_car_model(ContentValuesToCarModel(contentValues));
        return car;
    }
    public static ContentValues CarModelToContentValus(CarModel carModel)
    {
        String _model_code;
        String _company_name;
        String _model_name;
        int _engine_volume;
        Geer _geer;
        int _seat_number;

        return null;
    }

    public  static  CarModel ContentValuesToCarModel (ContentValues contentValues)
    {
        return null;
    }
}

    
