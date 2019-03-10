package Robot_Factory;

import java.util.Scanner;

public class A02zainuddm {

        public static void main(String[] args) {

                RobotFactory TankFactory = new RobotFactory();

                System.out.println("\nWelcome to the Factory of Robots! \n");

                Robot firstCutRobot = RobotFactory.makeBuildRobot("111100000011");
                Robot secondCutRobot = RobotFactory.makeBuildRobot("111100000022");
                Robot firstDrillRobot = RobotFactory.makeBuildRobot("111111110011");
                Robot secondDrillRobot = RobotFactory.makeBuildRobot("111111110022");
                Robot firstAssemblyRobot = RobotFactory.makeBuildRobot("111111111111");

                //Fetch and Cut
                firstCutRobot.fetchParts("Raw");
                firstCutRobot.doTask("Cutting");
                firstCutRobot.fetchParts("Raw");
                firstCutRobot.doTask("Cutting");

                secondCutRobot.fetchParts("Raw");
                secondCutRobot.doTask("Cutting");
                secondCutRobot.fetchParts("Raw");
                secondCutRobot.doTask("Cutting");

                //Fetch and Drill
                firstDrillRobot.fetchParts("Cut");
                firstDrillRobot.doTask("Drilling");
                firstDrillRobot.fetchParts("Cut");
                firstDrillRobot.doTask("Drilling");

                secondDrillRobot.fetchParts("Cut");
                secondDrillRobot.doTask("Drilling");
                secondDrillRobot.fetchParts("Cut");
                secondDrillRobot.doTask("Drilling");

                //Fetch and Assemble
                for (int i = 0; i <= 3; i++) {
                        secondDrillRobot.fetchParts("Drill");
                }
                firstAssemblyRobot.doTask("Assembling");
                firstAssemblyRobot.storeParts("Product");
                
                
                //Test
                /*
                 *      Robot firstCutRobot = RobotFactory.makeBuildRobot("111100000011");
                        firstCutRobot.fetchParts("Raw");
                        firstCutRobot.doTask("Cutting");

                        Robot secondCutRobot = RobotFactory.makeBuildRobot("111100000022");
                        secondCutRobot.fetchParts("Raw");
                        secondCutRobot.doTask("Cutting");

                        Robot firstDrillRobot = RobotFactory.makeBuildRobot("111111110011");
                        firstDrillRobot.fetchParts("Cut");
                        firstDrillRobot.doTask("Drilling");

                        Robot secondDrillRobot = RobotFactory.makeBuildRobot("111111110022");
                        secondDrillRobot.fetchParts("Cut");
                        secondDrillRobot.doTask("Drilling");

                        Robot firstAssemblyRobot = RobotFactory.makeBuildRobot("111111111111");
                        for (int i = 0; i <= 4; i++) {
                         secondDrillRobot.fetchParts("Drill");
                        }
                        firstAssemblyRobot.doTask("Assembling");
                        firstAssemblyRobot.storeParts("Product");
                 */

                System.out.println("\nThanks for coming to Factory of Robots! \n");

        }
}


