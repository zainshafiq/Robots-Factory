package Robot_Factory;

public class RobotFactory {

        public static Robot makeBuildRobot(String newNumSerial) {

        		Robot newRobot = null;

                if(newNumSerial.equals("111100000011")){
                        //Cutting robot, which cuts parts from raw materials
                        return new CuttingRobot("Cutting", "Regina Machines", newNumSerial + "\n");
                }
                else if (newNumSerial.equals("111100000022")) {
                        //Cutting robot, which cuts parts from raw materials
                        return new CuttingRobot("Cutting", "Regina Machines", newNumSerial + "\n");
                }
                else if (newNumSerial.equals("111111110011")) {
                        //Drilling robot, which drills holes in a part
                        return new DrillingRobot("Drilling", "Regina Machines", newNumSerial + "\n");
                }
                else if (newNumSerial.equals("111111110022")) {
                        //Drilling robot, which drills holes in a part
                        return new DrillingRobot("Drilling", "Regina Machines", newNumSerial + "\n");
                }
                else if (newNumSerial.equals("111111111111")) {
                        /*
                         * Assembly robot, that combines parts together
                         * (e.g., putting screws into the holes of one or more parts)
                         */
                        return new AssemblyRobot("Assembly", "SK Robotics", newNumSerial + "\n");
                }
                else
                        return null;
        }
}
