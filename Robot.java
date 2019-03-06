package Robot_Factory;

//Abstract Class
public abstract class Robot {

        //Data declaration
        private String type;
        private String manufacturer;
        private String serialNumber;

        //Setter, Getters
        public void setType(String type){
                this.type = type;
        }
        public String getType(){
                return type;
        }

        public void setManufacturer(String manufacturer){
                this.manufacturer = manufacturer;
        }
        public String getManufacturer(){
                return manufacturer;
        }

        public void setSerialNumber(String serialNumber){
                this.serialNumber = serialNumber;
        }
        public String getSerialNumber(){
                return serialNumber;
        }

        /*
         * An action fetchParts() that will fetch the appropriate part or
         *  raw material from storage
         */
    public void fetchParts(String part){
        //Raw Part
                if(part.equals("Raw")) {
                        System.out.println("Raw material fetched");
                }

                //Cut Part
                else if(part.equals("Cut")) {
                        System.out.println("Cut part fetched");
                }
                //Drill Part
                else if(part.equals("Drill")) {
                        System.out.println("Drilled part fetched");
                }

                else
                        System.out.println("Part Error!");
        }

    /*
     * An action doTask() that performs the required task
     * (of cutting, drilling or assembling)
     */
        public void doTask(String action){
                if(action.equals("Cutting")) {
                        System.out.println("Raw material cut");
                        System.out.println("Cut part sent to storage\n");
                }
                else if (action.equals("Drilling")) {
                        System.out.println("Holes drilled");
                        System.out.println("Drilled part sent to storage\n");
                }
                else if (action.equals("Assembling")) {
                	  System.out.println("\nProduct assembled");
                }
        }

        /*
         * An action storeParts() that will store the finished part
         * or product back to storage
         */
        public void storeParts(String part){
                if (part.equals("Product")) {
                        System.out.println("Product sent to storage");
                }
        }
}
