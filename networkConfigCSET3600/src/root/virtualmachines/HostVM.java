package root.virtualmachines;

public class HostVM extends VMNode {
    private VMInterface intrfc = new VMInterface();


    public HostVM(){
        this.intrfc.setInterfaceLabel("eth0");//allows only one interface, and always has this name
    }

}
