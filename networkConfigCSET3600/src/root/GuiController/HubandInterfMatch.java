package root.GuiController;

import root.networkobjects.HubNode;
import root.networkobjects.VMinterface;

import java.util.HashMap;

public class HubandInterfMatch {//
    private HashMap<HubNode, VMinterface> hubAndInterf = new HashMap<HubNode, VMinterface>();


    public HashMap<HubNode, VMinterface> getHubAndInterf(){
        return this.hubAndInterf;
    }



}
