package com.training.android.bootcamplocator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dyste on 8/13/2017.
 */

public class Controller {

    public List<BootcampLocation> mController;

    public Controller() {
        mController = new ArrayList<>();
        mController.add(new BootcampLocation("Jumalon Butterfly Sanctuary And Art Gallery","J.N. Jumalon St., Cebu City, 6000 Cebu",10.290235,123.8630803));
        mController.add(new BootcampLocation("Gear Up Cebu","128b E 6000, 128 E Sabellano Street, Cebu City, 6000 Cebu",10.2898029,123.8583989));
        mController.add(new BootcampLocation("Kaizen Pension House","Cebu S Rd, Cebu City, Cebu",10.2880823,123.8618536));

    }

    public List<BootcampLocation> getmController() {
        return mController;
    }

}
