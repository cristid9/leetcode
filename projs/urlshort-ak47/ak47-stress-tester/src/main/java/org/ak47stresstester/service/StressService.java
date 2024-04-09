package org.ak47stresstester.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
@AllArgsConstructor
public class StressService {

    private WebClient webClient;

    public void stressTest(String ip, Integer numWorkers, Integer numRequests) {
        ExecutorService executor = Executors.newFixedThreadPool(numWorkers);

        for (var i = 0; i < numRequests; i++) {
            Runnable task = new MyTask(i, ip);
            executor.execute(task);
        }

        executor.shutdown();
    }

    class MyTask implements Runnable {
        private final int taskId;
        private final String url;

        public MyTask(int taskId, String url) {
            this.taskId = taskId;
            this.url = url;
        }

        @Override
        public void run() {
            System.out.println("Task ID : " + taskId + " performed by " + Thread.currentThread().getName());
            String response = webClient.post()
                    .uri(this.url)
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();
            System.out.println(response);
        }
    }
}