public class GPUinstance extends VMInstance{
    private String gpuType;


    public GPUinstance(String os,
                       String runtime,
                       String monitoringAgent,
                       String hostname,
                       String ipAddress,
                       String gpuType) {
        super(os, runtime, monitoringAgent, hostname, ipAddress);
        this.gpuType = gpuType;
    }
    public String getGpuType(){
        return  this.gpuType;
    }
    public GPUinstance(GPUinstance other) {
        this(other.getOs(),
                other.getRuntime(),
                other.getMonitoringAgent(),
                other.getHostname(),
                other.getIpAddress(),
                other.getGpuType());
    }

    @Override
    public GPUinstance clone(){
        return new GPUinstance(this);
    }
}
