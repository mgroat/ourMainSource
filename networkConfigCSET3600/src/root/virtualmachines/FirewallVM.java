package root.virtualmachines;


import java.util.List;

public class FirewallVM extends VMNode {

    private List<VMInterface> intrfce; //holds only the ip address


    public void addIntrfce(VMInterface newInterface){ //adds another interface, triggered from gui form event
        this.intrfce.add(newInterface);
    }




}
