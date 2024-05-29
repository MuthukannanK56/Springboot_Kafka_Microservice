package com.kannan_repo;

import com.kannan_repo.Entity.WikimediaData;
import com.kannan_repo.Repository.WikiRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    private final WikiRespository repository;

    public KafkaConsumer(WikiRespository repository) {
        this.repository = repository;
    }


    @KafkaListener(topics = "wikimedia_recentchange", groupId = "myGroup")
    public void Consume(String eventMessage){

        LOGGER.info(String.format("Event message received -> %s", eventMessage));
        WikimediaData wikimediaData = new WikimediaData();
        wikimediaData.setDetails(eventMessage);
        repository.save(wikimediaData);

    }

}
