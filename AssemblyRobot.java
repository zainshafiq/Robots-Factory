package Robot_Factory;

//Assembly Robot
public class AssemblyRobot extends Robot {

        /*
         * Assembly robot, that combines parts together
         * (e.g., putting screws into the holes of one or more parts)
         */
        public AssemblyRobot(String type, String manufacturer, String serialNumber){
                setType(type);
                setManufacturer(manufacturer);
                setSerialNumber(serialNumber);

                System.out.println(type + " Robot Created");
                System.out.println(manufacturer + " " + serialNumber);
        }
}
