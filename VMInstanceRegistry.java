import java.util.HashMap;
import java.util.Map;

public class VMInstanceRegistry {

    Map<String,VMInstance> vmINstanceRegistry;

    public VMInstanceRegistry() {
        this.vmINstanceRegistry = new HashMap<>();
    }

    public void addVmInstance(String key, VMInstance instance){
        vmINstanceRegistry.put(key,instance);
    }

    public VMInstance getVmInstance(String key){
        return vmINstanceRegistry.get(key).clone();
    }
}
