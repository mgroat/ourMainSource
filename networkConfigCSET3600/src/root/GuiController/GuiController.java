package root.GuiController;

import root.networkobjects.HubNode;
import root.GuiController.HubandInterfMatch;
import root.networkobjects.VM;
import root.networkobjects.VMinterface;

import java.util.HashMap;
import java.util.List;

public class GuiController {//holds all the current vms and hubs for gui logic, items are added after instantiated by gui form. Items are removed by context menu.
    private List<VM> currentVms;
    private List<HubNode> currentHubNodes;
    private List<HubandInterfMatch> HubandInterfMatches;  //holds a list of hubs and interface pairs that are on the same subnet


    public void addHostVM(VM vm){//triggered on drag and drop from gui
        currentVms.add(vm);
    }
    public List<VM> getCurrentVms(){return this.currentVms;}
    public void removeHostVM(VM vm){
        //remove the pair from HubInterface if applicable
        //to do
        //find index of the passed host from it's list and remove it

    }
    public void addHub(HubNode hubNode){
        currentHubNodes.add(hubNode);
    }
    public List<HubNode> getHubNodes(){
        return this.currentHubNodes;
    }
    public void removeHubNode(int hubIndex){ //removes graphical hub and disconnects the interfaces that the hub was attached to
/*
        //remove gui representation then...
        HubNode thisHub = getHubNodes().get(hubIndex);//disconnect all interfaces that were attached to hub
        List<VMinterfPair> pairs = thisHub.getVMandIntrfcPairs();
        for (int i =0; i<thisHub.getVMandIntrfcPairs().size(); i++){
            pairs.get(i).getIntrfce().setDisconnected();
        }
        currentHubNodes.remove(hubIndex);
        */
    }

    public void addHubandInterfMatch(){
        /*
        to do based on brian's logic
         */
    }
    public void removeHubandInterfMatch(){
        //may need for tracing when a node is deleted and before regenerating config
    }

    public List<HubandInterfMatch> getHubandInterfMatches(){//returns the list of all the validated, connected interfaces to the hub
        return this.HubandInterfMatches;
    }





}