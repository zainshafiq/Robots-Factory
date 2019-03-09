package Robot_Factory;

public class CuttingRobot extends Robot {

    //Cutting robot, which cuts parts from raw materials
    public CuttingRobot(String type, String manufacturer, String serialNumber){
            setType(type);
            setManufacturer(manufacturer);
            setSerialNumber(serialNumber);

            System.out.println(type + " Robot Created");
            System.out.println(manufacturer + " " + serialNumber);
    }
}

