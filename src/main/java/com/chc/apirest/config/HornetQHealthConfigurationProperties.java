package com.chc.apirest.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "hornetq_health")
@Getter
@Setter
public class HornetQHealthConfigurationProperties {
    /**
     * Threshold per queue name.
     */
    private Map<String, Integer> thresholds;

    private Integer count;

    private List<String> list;

}
