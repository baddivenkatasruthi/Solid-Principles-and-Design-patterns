public class Client {
    //violating OCP
//    public static VMInstance creatACopy(VMInstance instance){
//        VMInstance copy = null;
//        if(instance instanceof VMInstance){
//            copy = new VMInstance(instance);
//        }
//        else if(instance instanceof GPUinstance){
//            copy = new GPUinstance(instance,"Nvidia");
//        }
//        else if()
//        return copy;
//    }

    public static void fillRegistry(VMInstanceRegistry registry){
        VMInstance ubuntuInstance = new VMInstance("Ubuntu 22.4","Docker 1.2", "Datadog","vm1","123.2.23.111");
        registry.addVmInstance("backend-server-v1",ubuntuInstance);

        GPUinstance gpUinstance = new GPUinstance(new GPUinstance("Ubuntu 22.4","Docker 1.2", "Datadog","vm1","123.2.23.111","Nvidia"));
        registry.addVmInstance("gpu-instance-v2",gpUinstance);
    }
    public static void main(String[] args) {
       /* VMInstance vm1 = new VMInstance("Ubuntu 22.4","Docker 1.2", "Datadog","vm1","123.2.23.111");

        VMInstance vm2 = vm1.clone();
        GPUinstance gpUinstance = new GPUinstance(new GPUinstance("Ubuntu 22.4","Docker 1.2", "Datadog","vm1","123.2.23.111","Nvidia"));


        VMInstance vm3 = gpUinstance.clone();
        //copy it*/
        VMInstanceRegistry registry = new VMInstanceRegistry();
        fillRegistry(registry);

        VMInstance ashokInstance = registry.getVmInstance("backend-server-v1");




        System.out.println("DEBUG");
    }
}
