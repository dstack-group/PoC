package it.unipd.dstack.butterfly.producer.gitlab;

import it.unipd.dstack.butterfly.producer.avro.Event;
import it.unipd.dstack.butterfly.producer.producer.Producer;
import it.unipd.dstack.butterfly.producer.producer.ProducerImpl;

public class Main {
    public static void main(String[] args) {
        Producer<Event> producer = new ProducerImpl<>();
        GitlabProducerController gitlabProducerController = new GitlabProducerController(producer);
        gitlabProducerController.start();
    }
}
