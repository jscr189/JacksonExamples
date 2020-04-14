package guru.springframework.msscjacksonexamples.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {
    BeerDto getDto(){
        return BeerDto.builder().beerName("Abc").beerStyle("Ale").id(UUID.randomUUID()).
                createdDate(OffsetDateTime.now()).
                lastUpdatedDate(OffsetDateTime.now()).price(new BigDecimal("12.99"))
                .upc(1251271281291212001L)
                .build();
    }
}
