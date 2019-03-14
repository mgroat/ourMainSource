package root.virtualmachines;

public class VMInterface {
        private String label; //i.e. eth0
        private boolean isConnected = false; //represents whether the VM is attached to a hub or not with compliant mask
        private String ipAddress;
        //private String subnet; for fw/switch



        public void setIpAddress(String ipAddress){
            this.ipAddress = ipAddress;
            return;
        }

        public String getIpAddress(){
            return this.ipAddress;
        }

        public void setInterfaceLabel(String name){
            this.label = name;
        }

        public String getInterfaceLabel(){
            return this.label;
        }

        public boolean getConnected(){//used for config file generation, if it returns false, should not generate a config file
            return this.isConnected;
        }

        public void setConnected(){//uses subnet checking then applies flag state
            this.isConnected = true;
        }
        public void setDisconnected(){//used when a connected object is deleted
            this.isConnected = false;
        }





}


