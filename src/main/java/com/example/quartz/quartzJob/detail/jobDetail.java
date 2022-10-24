package com.example.quartz.quartzJob.detail;

import com.example.quartz.quartzJob.job.BootJob;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class jobDetail {
    @Bean(name = "bootJob")
    public JobDetail bootJob() {
        return JobBuilder.newJob().ofType(BootJob.class)
                .withIdentity("RUN_BOOT", "BOOT_JOB")
                .withDescription("Invoke Sample Job service...")
                .storeDurably(true)
                .build();
    }
}
