package root.networkobjects;

import root.networkobjects.VM;

public class HubInterface {
    private String subnet; //must follow constraints of a subnet mask
    private String netMask;


    public void setSubnet(String subnet){
        this.subnet = subnet;
    }
    public String getSubnet(){
        return this.subnet;
    }
    public static void connectInterface(){//connects a VM interface to itself if the subnet matches
        return;
    }
}
