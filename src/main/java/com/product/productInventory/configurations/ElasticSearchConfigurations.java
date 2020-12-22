package com.product.productInventory.configurations;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;

@Configuration
public class ElasticSearchConfigurations  extends AbstractElasticsearchConfiguration {

    @Override
    public RestHighLevelClient elasticsearchClient()
    {
        return RestClients.create(ClientConfiguration.localhost()).rest();
    }
}
