package com.example.shlomo.takego.model.backend;

import com.example.shlomo.takego.model.entities.Geer;

/**
 * Created by Shlomo on 19/11/2017.
 */

public class CarRentelConst {
    public static class CarConst {
        public static final String ID = "_id";
        public static final String MILAGE = "milage";
        public static final String BRANCH_NUMBER = "branch number";
        public static final String CAR_MODEL = "car model";
    }
    public static class ClientConst {
        public static final String ID = "_id";
        public static final String FIRST_NAME = "first name";
        public  static  final  String LAST_NAME="last name";
        public static final String PHONE = "phone";
        public static final String EMAIL = "email";
        public static final String CREDIT_CARD = "credit card";
    }
    public static class BranchConst {
        public static final String ID = "_id";
        public static final String PARKING_SPOTS = "parking spots";
        public static final String CITY = "city";
        public static final String STREET = "street";
    }
    public static class CarModelConst {
        int _seat_number;
        public static final String ID = "_id";
        public static final String MODEL_NAME = "model name";
        public static final String COMPANY_NAME = "company name";
        public static final String ENGINE_VOLUME = "engine volume";
        public static final String GEER = "geer";
        public static final String SEAT_NUMBER = "seat number";
    }
}
