package root.networkobjects;

import java.util.List;

public class HubNode {
    private String name; //used as parent of record in config file e.g. 'vm Hub1 {...}'
    private List<HubandInterfMatch> vMandInterfMatches;  //holds all of the connected VMNodes and interfaces to simplify config parsing (e.g inf : Gemini.eth0, Nfs.eth0, Intfw.eth1)
    private String subnet; //the network address itself
    private String netmask; //the network subnet

    public HubNode(){};//empty constructor


    public void connectInterface(VM vm){//Applies subnet checking, called by the class itself, not by an instance
        //called by event handler when a cable is clicked, followed by a click on the canvas objects
            boolean subnetMatch = true;//TO BE CHANGED isSubnetMatch(VM vm, this.subnet)
            if(subnetMatch) {
                this.vMandInterfMatches.add(vMinterfPair);
            }
            else{
                System.out.println("Interfaces are not on the same subnet");
            }

    }

    public List<VMinterfPair> getVMandIntrfcPairs(){
        return this.vMinterfPair;
    }

    public void disconnectInterface(VMinterfPair vMandIntrfcPair){

        //remove from the list at its given indice, if it doesn't exist, throw an exception
    }

    public String returnPartialSolValue(){
        String host = "";
        String hubname = "";
        VM host = this.getHostVmNode()

    }

    public void setSubnet(String subnet){
        this.subnet = subnet;
    }
    public String getSubnet(){
        return this.subnet;
    }



}
