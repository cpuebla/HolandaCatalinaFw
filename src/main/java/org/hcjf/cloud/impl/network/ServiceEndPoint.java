package org.hcjf.cloud.impl.network;

/**
 * @author javaito
 */
public class ServiceEndPoint extends NetworkComponent {

    private String gatewayAddress;
    private Integer gatewayPort;
    private String gatewayId;
    private Long lastServicePublication;

    public String getGatewayAddress() {
        return gatewayAddress;
    }

    public void setGatewayAddress(String gatewayAddress) {
        this.gatewayAddress = gatewayAddress;
    }

    public Integer getGatewayPort() {
        return gatewayPort;
    }

    public void setGatewayPort(Integer gatewayPort) {
        this.gatewayPort = gatewayPort;
    }

    public synchronized String getGatewayId() {
        if(gatewayId == null) {
            gatewayId = getGatewayAddress() + ":" + getGatewayPort();
        }
        return gatewayId;
    }

    public Long getLastServicePublication() {
        return lastServicePublication;
    }

    public void setLastServicePublication(Long lastServicePublication) {
        this.lastServicePublication = lastServicePublication;
    }
}
