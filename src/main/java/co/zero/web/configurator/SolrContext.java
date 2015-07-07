package co.zero.web.configurator;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@Configuration
@EnableSolrRepositories(basePackages={"co.zero.ccd"}, multicoreSupport=true)
public class SolrContext {

  static final String SOLR_HOST = "solr.host";

  @Bean
  public SolrServer solrServer() {
    return new HttpSolrServer("http://localhost:8983/solr/db");
  }
}