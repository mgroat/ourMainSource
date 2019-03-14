package root.virtualmachines;



public abstract class VMNode {
    protected String name; //vm alias i.e. host1
    protected String os;
    protected String ver;
    protected String src;

    VMNode(){//empty constructor, visually stimulating!

    }

    enum OSWINLIN {//enum for setting operating system name
        WINDOWS, LINUX
    }

    public String getOs(){
        return this.os;
    }
    public void setOs(String os){
        this.os = os;
    }
    public String getSrc(){
        return this.src;
    }
    public void setSrc(String src){this.src = src;}
    public String getName(){
        return this.name;
    }
    public void setName(String name){this.name = name;} // this.name = "windowsorlinuxHost"; TO BE CHANGED based on gui action event
    public String getVer(){ return this.ver; }
    public void setVer(String ver){this.ver = ver;}


    public static void setOS_VER_SRC(VMNode vmNode, OSWINLIN os){//publically accessible method from the class itself
        switch (os) {
            case WINDOWS:
                vmNode.setOs("WINDOWS");
                break;
            case LINUX:
                vmNode.setOs("LINUX");
                break;
        }
        if (vmNode.getOs() == "WINDOWS"){
            vmNode.setVer("7.0");
            vmNode.setSrc("/srv/VMLibrary/win7");
        }
        else{
            vmNode.setVer("7.3");
            vmNode.setSrc("/srv/VMLibrary/JeOS");
        }



        //  /srv/VMLibrary/JeOS

    }
}
