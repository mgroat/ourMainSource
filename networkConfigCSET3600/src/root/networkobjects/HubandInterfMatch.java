package root.networkobjects;

public class HubandInterfMatch {
    String parseElement;// holds the string used directly for parser





    private void setParseElement(String vmName, String vmInterface){
        this.parseElement = vmName + '.'+ vmInterface;

    }

    public String getParseElement(){
        return this.parseElement;
    }
}
