package com.example;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.quarkiverse.zeebe.JobWorker;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.extern.slf4j.Slf4j;

@ApplicationScoped
@Slf4j
public class CurrencyRateWorker {

    @JobWorker(type = "currency-rate-fetch")
    public void work(final JobClient client, final ActivatedJob job){
        log.info("CurrencyRateWorker initial...");

        log.info("JobWorker started ...");
    }

}
