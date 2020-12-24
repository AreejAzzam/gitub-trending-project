package com.example.gitubtrendingproject.restClint.services;
import com.example.gitubtrendingproject.Domain.Item;
import com.example.gitubtrendingproject.Domain.Repository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class RepositoryServicesImpl implements RepositoryService {
    private RestTemplate restTemplate;
    @Value("${apiUrl}")
    private String apiUrl;
    @Value("${numberOfDays}")
    private Long numberOfDays;
    @Value("${apiDateKey}")
    private String apiDateKey;
    public RepositoryServicesImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Item> getRepo() {
    Repository repository=restTemplate.getForObject(getApiUrl(),Repository.class);
    return repository.getItems();
    }
    private String getApiUrl() {
        LocalDate date = LocalDate.now();
        date = date.minusDays(numberOfDays);
        String replacement = date.format(DateTimeFormatter.ofPattern("YYYY-MM-dd"));
        return apiUrl.replaceFirst(apiDateKey, replacement);
    }


}
