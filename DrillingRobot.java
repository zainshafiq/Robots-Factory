package Robot_Factory;

public class DrillingRobot extends Robot {

        //Drilling robot, which drills holes in a part
        public DrillingRobot(String type, String manufacturer, String serialNumber) {
                setType(type);
                setManufacturer(manufacturer);
                setSerialNumber(serialNumber);

                System.out.println(type + " Robot Created");
                System.out.println(manufacturer + " " + serialNumber);
        }
}
